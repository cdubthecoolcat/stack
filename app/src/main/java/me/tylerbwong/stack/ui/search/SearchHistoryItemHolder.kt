package me.tylerbwong.stack.ui.search

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import me.tylerbwong.stack.R
import me.tylerbwong.stack.databinding.SearchHistoryItemHolderBinding
import me.tylerbwong.stack.ui.home.SearchHistoryItem
import me.tylerbwong.stack.ui.search.filters.Filter
import me.tylerbwong.stack.ui.utils.setThrottledOnClickListener

class SearchHistoryItemHolder(containerView: View) : RecyclerView.ViewHolder(containerView) {

    private val binding = SearchHistoryItemHolderBinding.bind(itemView)

    @Suppress("ComplexMethod")
    fun bind(item: SearchHistoryItem) {
        val (query, isAccepted, minNumAnswers, bodyContains, isClosed, tags, titleContains) = item.searchPayload

        itemView.setThrottledOnClickListener {
            item.onPayloadReceived(item.searchPayload)
        }

        binding.searchQuery.text = binding.searchQuery.context.getString(R.string.search_query, query)

        val filtersView = binding.filtersView
        filtersView.removeAllViews()
        val addedFilters = listOf(
            isAccepted?.let { Filter.Accepted(it) } ?: Filter.None,
            minNumAnswers?.let { Filter.MinAnswers(it) } ?: Filter.None,
            bodyContains?.let { Filter.BodyContains(it) } ?: Filter.None,
            isClosed?.let { Filter.Closed(it) } ?: Filter.None,
            tags?.let { Filter.Tags(it) } ?: Filter.None,
            titleContains?.let { Filter.TitleContains(it) } ?: Filter.None
        ).filter { it != Filter.None }

        addedFilters
            .map { it.getLabel(filtersView.context) }
            .forEach { label ->
                filtersView.addView(
                    Chip(filtersView.context).apply {
                        text = label
                    }
                )
            }
    }
}
