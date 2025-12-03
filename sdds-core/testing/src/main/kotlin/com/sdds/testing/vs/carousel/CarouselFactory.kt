package com.sdds.testing.vs.carousel

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sdds.testing.R
import com.sdds.testing.databinding.LayoutComponentCarouselItemBinding
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Carousel
import com.sdds.uikit.dp

/**
 * Создает компонент [Carousel]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun carousel(
    context: Context,
    style: Int? = null,
    state: CarouselUiState = CarouselUiState(),
): Carousel {
    return Carousel(context.styleWrapper(style))
        .apply {
            id = R.id.carousel
            adapter = CarouselTextAdapter(itemsCount = state.itemCount)
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                300.dp,
            )
        }
        .applyState(state)
}

/**
 * Применяет [CarouselUiState] к [Carousel]
 */
fun Carousel.applyState(state: CarouselUiState) = apply {
    (adapter as CarouselTextAdapter).updateItemCount(state.itemCount)
    contentAlignment = state.alignment.raw
    controlsEnabled = state.controlsEnabled
    controlsPlacement = state.controlsPlacement.raw
    indicatorEnabled = state.indicatorEnabled
    indicatorVisibleItemCount = state.indicatorVisibleItemCount

    gap = if (state.withGap) 20.dp else 0
}

private class CarouselTextAdapter(
    private var itemsCount: Int,
) : RecyclerView.Adapter<CarouselTextAdapter.TextVH>() {

    @Suppress("NotifyDataSetChanged")
    fun updateItemCount(count: Int) {
        if (itemsCount != count) {
            itemsCount = count
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextVH {
        val textView = LayoutComponentCarouselItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false).root
        return TextVH(textView)
    }

    override fun onBindViewHolder(holder: TextVH, position: Int) {
        holder.textView.text = "$position"
    }

    override fun getItemCount(): Int = itemsCount

    class TextVH(val textView: TextView) : RecyclerView.ViewHolder(textView)
}
