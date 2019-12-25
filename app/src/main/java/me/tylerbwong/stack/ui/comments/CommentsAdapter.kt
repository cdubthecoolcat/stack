package me.tylerbwong.stack.ui.comments

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.comment_holder.*
import me.saket.bettermovementmethod.BetterLinkMovementMethod
import me.tylerbwong.stack.R
import me.tylerbwong.stack.data.model.Comment
import me.tylerbwong.stack.ui.utils.inflate
import me.tylerbwong.stack.ui.utils.markdown.setMarkdown

class CommentsAdapter : ListAdapter<Comment, CommentHolder>(
    object : DiffUtil.ItemCallback<Comment>() {
        override fun areItemsTheSame(
            oldItem: Comment,
            newItem: Comment
        ) = oldItem.commentId == newItem.commentId

        override fun areContentsTheSame(
            oldItem: Comment,
            newItem: Comment
        ) = oldItem.bodyMarkdown == newItem.bodyMarkdown && oldItem.owner == newItem.owner
    }
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = CommentHolder(parent.inflate(R.layout.comment_holder))

    override fun onBindViewHolder(
        holder: CommentHolder,
        position: Int
    ) = holder.bind(getItem(position))
}

class CommentHolder(
    override val containerView: View
) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bind(comment: Comment) {
        commentBody.apply {
            setMarkdown(comment.bodyMarkdown)
            setTextIsSelectable(true)
            movementMethod = BetterLinkMovementMethod.getInstance()
        }
        ownerView.bind(comment.owner)
    }
}