package com.sdds.testing.vs.scrollbar

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.StyleRes
import androidx.core.view.setPadding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.ScrollBar
import com.sdds.uikit.TextView

/**
 * Создает [ScrollBar]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun scrollBar(
    context: Context,
    @StyleRes style: Int? = null,
    state: ScrollBarUiState = ScrollBarUiState(),
): ViewGroup {
    val newOrientation = when (state.orientation) {
        ScrollOrientation.VERTICAL -> LinearLayoutManager.VERTICAL
        ScrollOrientation.HORIZONTAL -> LinearLayoutManager.HORIZONTAL
    }
    val actualContext = context.styleWrapper(style)
    val recycler = RecyclerView(context).apply {
        id = R.id.recycler
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT,
        )
        layoutManager = LinearLayoutManager(context, newOrientation, false)
        adapter = SimpleRecyclerAdapter().apply {
            setItems(state.itemsAmount)
        }
    }
    val scroll = ScrollBar(actualContext).apply {
        id = R.id.scroll_bar
        attachToRecyclerView(recycler)
        layoutParams = when (state.orientation) {
            ScrollOrientation.VERTICAL -> FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
            ).apply { gravity = Gravity.RIGHT }

            ScrollOrientation.HORIZONTAL -> FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ).apply { gravity = Gravity.BOTTOM }
        }
    }
    return ScrollBarContainer(context, scroll, recycler).apply {
        id = R.id.scroll_container
        setPadding(6)
        addView(recycler)
        addView(scroll)
    }.applyState(state)
}

private class SimpleRecyclerAdapter : RecyclerView.Adapter<SimpleRecyclerAdapter.ViewHolder>() {
    class ViewHolder(item: View) : RecyclerView.ViewHolder(item)

    private val items = mutableListOf<String>()

    fun setItems(amount: Int) {
        items.clear()
        repeat(amount) {
            items.add("Item $it")
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val tv = TextView(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                100,
            )
            setPadding(5)
            textSize = 16f
        }
        return ViewHolder(tv)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder.itemView as TextView).text = items[position]
    }
}

/**
 * Обертка для отображения [ScrollBar]
 */
@Suppress("ViewConstructor")
class ScrollBarContainer(
    context: Context,

    /**
     *  Cсылка на [ScrollBar]
     */
    val scrollBar: ScrollBar,

    /**
     *  Cсылка на [ScrollBar]
     */
    val recycler: RecyclerView,
) : FrameLayout(context)

/**
 * Применяет [ScrollBarUiState] к ScrollBarContainer
 * @param state состояние
 */
fun ScrollBarContainer.applyState(state: ScrollBarUiState) = apply {
    scrollBar.hoverExpand = state.hoverExpand
    scrollBar.autoHide = state.autoHideScrollBar
    scrollBar.hasTrack = state.hasTrack
    (recycler.adapter as? SimpleRecyclerAdapter)?.setItems(state.itemsAmount)
}
