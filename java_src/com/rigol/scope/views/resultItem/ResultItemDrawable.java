package com.rigol.scope.views.resultItem;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes2.dex */
public class ResultItemDrawable extends Drawable {
    public static final int STATE_CHECKED = 1;
    public static final int STATE_NORMAL = 0;
    private int currentState;
    private Rect mBounds;
    private int mTopWidth;
    private Paint normalPaint;
    private Paint selectedPaint;
    private int mTopHeight = 17;
    private int mRadius = 4;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public ResultItemDrawable(int i, int i2) {
        this.mTopWidth = i2;
        this.currentState = i;
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.normalPaint = paint;
        paint.setColor(Color.parseColor("#4F5C5F"));
        this.normalPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.normalPaint.setAntiAlias(true);
        this.normalPaint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.selectedPaint = paint2;
        paint2.setColor(Color.parseColor("#1FC980"));
        this.selectedPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.selectedPaint.setAntiAlias(true);
        this.selectedPaint.setStrokeWidth(1.0f);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r17) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rigol.scope.views.resultItem.ResultItemDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mBounds = rect;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
    }
}
