package com.sdds.uikit.internal.navigationdrawer

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sdds.uikit.NavigationDrawer
import com.sdds.uikit.NavigationDrawer.Item
import com.sdds.uikit.NavigationDrawer.Item.Companion.asBuilder
import com.sdds.uikit.internal.navigationdrawer.NavigationDrawerItem.Companion.bindItem

@Suppress("ViewConstructor")
internal class NavigationDrawerItemsView(
    private val navigationDrawer: NavigationDrawer,
    private val navigationItemSelectedListener: NavigationDrawer.NavigationItemSelectedListener? = null,
) : RecyclerView(navigationDrawer.context) {

    private var itemsStyle: Int = 0
    private val itemsAdapter = NavigationAdapter()
    private val recyclerLayoutManager = LinearLayoutManager(context, VERTICAL, false)

    init {
        adapter = itemsAdapter
        clipToPadding = false
        clipChildren = false
        itemAnimator = null
        layoutManager = recyclerLayoutManager
    }

    fun createNavigationItem(parent: ViewGroup): NavigationDrawerItem {
        return NavigationDrawerItem(parent.context, itemsStyle).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }
    }

    fun setItems(items: List<Item>, style: Int = 0) {
        itemsStyle = style
        itemsAdapter.update(items)
    }

    fun setCounter(itemId: Int, counterText: String?) {
        itemsAdapter.updateCounter(itemId, counterText)
    }

    fun setSelected(itemId: Int) {
        itemsAdapter.setSelected(itemId)
    }

    fun clearSelection() {
        itemsAdapter.setSelected(-1)
    }

    fun getSelectedItem(): NavigationDrawerItem? {
        return recyclerLayoutManager.findViewByPosition(itemsAdapter.selectedPosition) as? NavigationDrawerItem
    }

    @Suppress("NotifyDataSetChanged")
    fun update() {
        itemsAdapter.notifyDataSetChanged()
    }

    private inner class NavigationAdapter : Adapter<NavigationAdapter.NavViewHolder>() {

        private val items: MutableList<Item> = mutableListOf()
        var selectedPosition: Int = NO_POSITION
            private set

        init {
            setHasStableIds(true)
        }

        override fun getItemId(position: Int): Long {
            return items[position].id.toLong()
        }

        fun update(items: List<Item>) {
            val diffCallback = ItemDiffUtilCallback(this.items, items)
            val diffResult = DiffUtil.calculateDiff(diffCallback)
            this.items.clear()
            this.items.addAll(items)
            diffResult.dispatchUpdatesTo(this)
        }

        fun updateCounter(itemId: Int, counter: String?) {
            val itemIndex = items.indexOfFirst { it.id == itemId }.takeIf { it > ViewGroup.NO_ID } ?: return
            items[itemIndex] = items[itemIndex].asBuilder().setCounter(counter).build()
            notifyItemChanged(itemIndex)
        }

        fun setSelected(itemId: Int) {
            val itemIndex = items.indexOfFirst { it.id == itemId }
            updateSelectedPosition(itemIndex)
        }

        private fun updateSelectedPosition(position: Int) {
            val clearPosition = selectedPosition
            selectedPosition = position
            if (clearPosition != NO_POSITION) notifyItemChanged(clearPosition)
            if (selectedPosition != NO_POSITION) notifyItemChanged(selectedPosition)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NavViewHolder {
            return NavViewHolder(createNavigationItem(parent))
        }

        override fun onBindViewHolder(holder: NavViewHolder, position: Int) {
            holder.bind(items[position])
        }

        override fun getItemCount(): Int = items.size

        inner class NavViewHolder(
            navigationItemView: View,
        ) : ViewHolder(navigationItemView) {
            fun bind(item: Item) {
                (itemView as NavigationDrawerItem).bindItem(item, navigationDrawer.state)
                    .apply {
                        isSelected = adapterPosition == selectedPosition
                        setOnClickListener {
                            if (navigationItemSelectedListener?.onItemSelected(item) == true) {
                                updateSelectedPosition(adapterPosition)
                            }
                        }
                    }
            }
        }
    }

    private class ItemDiffUtilCallback(
        private val old: List<Item>,
        private val new: List<Item>,
    ) : DiffUtil.Callback() {
        override fun getOldListSize(): Int = old.size

        override fun getNewListSize(): Int = new.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return old[oldItemPosition].id == new[newItemPosition].id
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return old[oldItemPosition] == new[newItemPosition]
        }
    }
}
