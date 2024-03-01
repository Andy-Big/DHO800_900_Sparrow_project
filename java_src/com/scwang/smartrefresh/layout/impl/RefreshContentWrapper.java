package com.scwang.smartrefresh.layout.impl;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.legacy.widget.Space;
import androidx.viewpager.widget.ViewPager;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider;
import com.scwang.smartrefresh.layout.listener.CoordinatorLayoutListener;
import com.scwang.smartrefresh.layout.util.DesignUtil;
import com.scwang.smartrefresh.layout.util.ScrollBoundaryUtil;
import com.scwang.smartrefresh.layout.util.SmartUtil;
import java.util.Collections;
import java.util.LinkedList;
/* loaded from: classes2.dex */
public class RefreshContentWrapper implements RefreshContent, CoordinatorLayoutListener, ValueAnimator.AnimatorUpdateListener {
    protected View mContentView;
    protected View mFixedFooter;
    protected View mFixedHeader;
    protected View mOriginalContentView;
    protected View mScrollableView;
    protected int mLastSpinner = 0;
    protected boolean mEnableRefresh = true;
    protected boolean mEnableLoadMore = true;
    protected ScrollBoundaryDeciderAdapter mBoundaryAdapter = new ScrollBoundaryDeciderAdapter();

    public RefreshContentWrapper(View view) {
        this.mScrollableView = view;
        this.mOriginalContentView = view;
        this.mContentView = view;
    }

    protected void findScrollableView(View view, RefreshKernel refreshKernel) {
        boolean isInEditMode = this.mContentView.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof NestedScrollingParent) || (view2 instanceof NestedScrollingChild))) {
                break;
            }
            view = findScrollableViewInternal(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!isInEditMode) {
                DesignUtil.checkCoordinatorLayout(view, refreshKernel, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.mScrollableView = view2;
        }
    }

    @Override // com.scwang.smartrefresh.layout.listener.CoordinatorLayoutListener
    public void onCoordinatorUpdate(boolean z, boolean z2) {
        this.mEnableRefresh = z;
        this.mEnableLoadMore = z2;
    }

    protected View findScrollableViewInternal(View view, boolean z) {
        LinkedList linkedList = new LinkedList(Collections.singletonList(view));
        View view2 = null;
        while (!linkedList.isEmpty() && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z || view3 != view) && SmartUtil.isContentView(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedList.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    protected View findScrollableViewByPoint(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (ScrollBoundaryUtil.isTransformedTouchPointInView(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ((childAt instanceof ViewPager) || !SmartUtil.isContentView(childAt)) {
                        pointF.offset(pointF2.x, pointF2.y);
                        View findScrollableViewByPoint = findScrollableViewByPoint(childAt, pointF, view2);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return findScrollableViewByPoint;
                    }
                    return childAt;
                }
            }
        }
        return view2;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public View getView() {
        return this.mContentView;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public View getScrollableView() {
        return this.mScrollableView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void moveSpinner(int i, int i2, int i3) {
        boolean z;
        View view;
        View view2;
        View findViewById;
        View findViewById2;
        boolean z2 = true;
        if (i2 != -1 && (findViewById2 = this.mOriginalContentView.findViewById(i2)) != null) {
            if (i > 0) {
                findViewById2.setTranslationY(i);
                z = true;
                if (i3 != -1 && (findViewById = this.mOriginalContentView.findViewById(i3)) != null) {
                    if (i >= 0) {
                        findViewById.setTranslationY(i);
                        if (!z2) {
                            this.mOriginalContentView.setTranslationY(i);
                        } else {
                            this.mOriginalContentView.setTranslationY(0.0f);
                        }
                        view = this.mFixedHeader;
                        if (view != null) {
                            view.setTranslationY(Math.max(0, i));
                        }
                        view2 = this.mFixedFooter;
                        if (view2 != null) {
                            view2.setTranslationY(Math.min(0, i));
                            return;
                        }
                        return;
                    } else if (findViewById.getTranslationY() < 0.0f) {
                        findViewById.setTranslationY(0.0f);
                    }
                }
                z2 = z;
                if (!z2) {
                }
                view = this.mFixedHeader;
                if (view != null) {
                }
                view2 = this.mFixedFooter;
                if (view2 != null) {
                }
            } else if (findViewById2.getTranslationY() > 0.0f) {
                findViewById2.setTranslationY(0.0f);
            }
        }
        z = false;
        if (i3 != -1) {
            if (i >= 0) {
            }
        }
        z2 = z;
        if (!z2) {
        }
        view = this.mFixedHeader;
        if (view != null) {
        }
        view2 = this.mFixedFooter;
        if (view2 != null) {
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public boolean canRefresh() {
        return this.mEnableRefresh && this.mBoundaryAdapter.canRefresh(this.mContentView);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public boolean canLoadMore() {
        return this.mEnableLoadMore && this.mBoundaryAdapter.canLoadMore(this.mContentView);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void onActionDown(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.mContentView.getLeft(), -this.mContentView.getTop());
        View view = this.mScrollableView;
        View view2 = this.mContentView;
        if (view != view2) {
            this.mScrollableView = findScrollableViewByPoint(view2, pointF, view);
        }
        if (this.mScrollableView == this.mContentView) {
            this.mBoundaryAdapter.mActionEvent = null;
        } else {
            this.mBoundaryAdapter.mActionEvent = pointF;
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void setUpComponent(RefreshKernel refreshKernel, View view, View view2) {
        findScrollableView(this.mContentView, refreshKernel);
        if (view == null && view2 == null) {
            return;
        }
        this.mFixedHeader = view;
        this.mFixedFooter = view2;
        FrameLayout frameLayout = new FrameLayout(this.mContentView.getContext());
        refreshKernel.getRefreshLayout().getLayout().removeView(this.mContentView);
        ViewGroup.LayoutParams layoutParams = this.mContentView.getLayoutParams();
        frameLayout.addView(this.mContentView, -1, -1);
        refreshKernel.getRefreshLayout().getLayout().addView(frameLayout, layoutParams);
        this.mContentView = frameLayout;
        if (view != null) {
            view.setClickable(true);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams2.height = SmartUtil.measureViewHeight(view);
            viewGroup.addView(new Space(this.mContentView.getContext()), indexOfChild, layoutParams2);
            frameLayout.addView(view);
        }
        if (view2 != null) {
            view2.setClickable(true);
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int indexOfChild2 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(layoutParams3);
            layoutParams3.height = SmartUtil.measureViewHeight(view2);
            viewGroup2.addView(new Space(this.mContentView.getContext()), indexOfChild2, layoutParams3);
            layoutParams4.gravity = 80;
            frameLayout.addView(view2, layoutParams4);
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider) {
        if (scrollBoundaryDecider instanceof ScrollBoundaryDeciderAdapter) {
            this.mBoundaryAdapter = (ScrollBoundaryDeciderAdapter) scrollBoundaryDecider;
        } else {
            this.mBoundaryAdapter.boundary = scrollBoundaryDecider;
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void setEnableLoadMoreWhenContentNotFull(boolean z) {
        this.mBoundaryAdapter.mEnableLoadMoreWhenContentNotFull = z;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public ValueAnimator.AnimatorUpdateListener scrollContentWhenFinished(int i) {
        View view = this.mScrollableView;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !ScrollBoundaryUtil.canScrollDown(view)) && (i <= 0 || !ScrollBoundaryUtil.canScrollUp(this.mScrollableView))) {
            return null;
        }
        this.mLastSpinner = i;
        return this;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            if (this.mScrollableView instanceof AbsListView) {
                SmartUtil.scrollListBy((AbsListView) this.mScrollableView, intValue - this.mLastSpinner);
            } else {
                this.mScrollableView.scrollBy(0, intValue - this.mLastSpinner);
            }
        } catch (Throwable unused) {
        }
        this.mLastSpinner = intValue;
    }
}
