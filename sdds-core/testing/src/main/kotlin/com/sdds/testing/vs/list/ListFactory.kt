package com.sdds.testing.vs.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Card
import com.sdds.uikit.ListItem
import com.sdds.uikit.ListView
import com.sdds.uikit.ListViewAdapter
import com.sdds.uikit.ListViewHolder
import com.sdds.uikit.SimpleListViewAdapter

/**
 * Создает [ListView]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun listView(
    context: Context,
    @StyleRes style: Int? = null,
    state: ListUiState = ListUiState(),
): ListView {
    return ListView(context.styleWrapper(style))
        .apply {
            adapter = CardAdapter()
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        }
        .applyState(state)
}

class CardAdapter : ListViewAdapter<ListItem, CardAdapter.CardHolder>(ListItemDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        val cardView = LayoutInflater.from(parent.context).inflate(R.layout.layout_component_card, parent, false)
        return CardHolder(cardView)
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class CardHolder(itemView: View) : ListViewHolder(itemView) {

        fun bind(item: ListItem) = (itemView as Card).apply {

        }
    }

    private object ListItemDiffCallback : ItemCallback<ListItem>() {
        override fun areItemsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
            return oldItem.id == newItem.id
        }

        @Suppress("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
            return oldItem == newItem
        }
    }
}

/**
 * Применяет [ListUiState] к [ListView]
 */
fun ListView.applyState(state: ListUiState): ListView = apply {
    (adapter as CardAdapter).submitList(
        mutableListOf<ListItem>().apply {
            repeat(state.amount) {
                add(
                    ListItem.simpleItem(
                        id = it.toLong(),
                        title = state.itemTitle,
                        hasDisclosure = state.hasDisclosure,
                    ),
                )
            }
        },
    )
}
