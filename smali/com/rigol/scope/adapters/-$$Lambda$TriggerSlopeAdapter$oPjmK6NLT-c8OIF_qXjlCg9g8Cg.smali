.class public final synthetic Lcom/rigol/scope/adapters/-$$Lambda$TriggerSlopeAdapter$oPjmK6NLT-c8OIF_qXjlCg9g8Cg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/rigol/scope/views/spinner/PopupSpinner$OnItemClickListener;


# instance fields
.field public final synthetic f$0:Lcom/rigol/scope/adapters/TriggerSlopeAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/rigol/scope/adapters/TriggerSlopeAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/rigol/scope/adapters/-$$Lambda$TriggerSlopeAdapter$oPjmK6NLT-c8OIF_qXjlCg9g8Cg;->f$0:Lcom/rigol/scope/adapters/TriggerSlopeAdapter;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/rigol/scope/adapters/-$$Lambda$TriggerSlopeAdapter$oPjmK6NLT-c8OIF_qXjlCg9g8Cg;->f$0:Lcom/rigol/scope/adapters/TriggerSlopeAdapter;

    check-cast p4, Lcom/rigol/scope/data/MappingObject;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/rigol/scope/adapters/TriggerSlopeAdapter;->lambda$onClick$4$TriggerSlopeAdapter(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILcom/rigol/scope/data/MappingObject;)V

    return-void
.end method