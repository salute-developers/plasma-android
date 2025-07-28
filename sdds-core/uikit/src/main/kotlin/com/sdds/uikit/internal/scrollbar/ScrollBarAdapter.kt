package com.sdds.uikit.internal.scrollbar

import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.recyclerview.widget.RecyclerView

/**
 * Интерфей-адаптер, который обеспечивает ScrollBar данными о текущем состоянии скролла.
 */
internal interface ScrollBarAdapter {

    /**
     * Ориентация прокрутки.
     * [ScrollBarDrawable.VERTICAL], [ScrollBarDrawable.HORIZONTAL] или [ScrollBarDrawable.UNKNOWN]
     */
    val orientation: Int

    /**
     * Общая, прокручиваемая длина контента.
     */
    val scrollRange: Int

    /**
     * Величина видимой области.
     * Используется для вычисления пропорционального размер thumb.
     */
    val scrollExtent: Int

    /**
     * Текущая, прокрученная позиция.
     * Определяет смещение контента относительно начала.
     */
    val scrollOffset: Int

    /**
     * Прокручивает связанный scrollable компонент на указанное смещение.
     * @param offset смещение.
     */
    fun scrollTo(offset: Int)
}

/**
 * Адаптер для установки ScrollBar в RecyclerView.
 * @param recyclerView сссылка на RecyclerView.
 * @param preferredOrientation предпочитаемая ориентация.
 */
internal class RecyclerViewScrollAdapter(
    private val recyclerView: RecyclerView,
    private val preferredOrientation: Int = ScrollBarDrawable.UNKNOWN,
) : ScrollBarAdapter {
    override val orientation: Int
        get() {
            val canVertically = recyclerView.canScrollVertically(1) || recyclerView.canScrollVertically(-1)
            val canHorizontally = recyclerView.canScrollHorizontally(1) || recyclerView.canScrollHorizontally(-1)
            return when {
                canHorizontally && !canVertically -> ScrollBarDrawable.HORIZONTAL
                !canHorizontally && canVertically -> ScrollBarDrawable.VERTICAL
                canHorizontally && canVertically -> {
                    if (preferredOrientation == ScrollBarDrawable.VERTICAL ||
                        preferredOrientation == ScrollBarDrawable.HORIZONTAL
                    ) {
                        preferredOrientation
                    } else {
                        ScrollBarDrawable.VERTICAL
                    }
                }

                else -> ScrollBarDrawable.UNKNOWN
            }
        }
    override val scrollRange: Int
        get() = if (orientation == ScrollBarDrawable.VERTICAL) {
            recyclerView.computeVerticalScrollRange()
        } else {
            recyclerView.computeHorizontalScrollRange()
        }
    override val scrollExtent: Int
        get() = if (orientation == ScrollBarDrawable.VERTICAL) {
            recyclerView.computeVerticalScrollExtent()
        } else {
            recyclerView.computeHorizontalScrollExtent()
        }
    override val scrollOffset: Int
        get() = if (orientation == ScrollBarDrawable.VERTICAL) {
            recyclerView.computeVerticalScrollOffset()
        } else {
            recyclerView.computeHorizontalScrollOffset()
        }

    override fun scrollTo(offset: Int) {
        if (orientation == ScrollBarDrawable.VERTICAL) {
            recyclerView.scrollBy(0, offset - scrollOffset)
        } else {
            recyclerView.scrollBy(offset - scrollOffset, 0)
        }
    }
}

/**
 * Адаптер для установки ScrollBar в ScrollView HorizontalScrollView.
 * @param scrollView сссылка на ScrollView HorizontalScrollView.
 */
internal class ScrollViewScrollAdapter(
    private val scrollView: ViewGroup,
) : ScrollBarAdapter {
    init {
        require(scrollView is ScrollView || scrollView is HorizontalScrollView) {
            "This adapter supports only ScrollView or HorizontalScrollView"
        }
    }

    override val orientation: Int
        get() {
            return when (scrollView) {
                is ScrollView -> {
                    val canScroll = scrollView.canScrollVertically(1) || scrollView.canScrollVertically(-1)
                    if (canScroll) {
                        ScrollBarDrawable.VERTICAL
                    } else {
                        ScrollBarDrawable.UNKNOWN
                    }
                }

                is HorizontalScrollView -> {
                    val canScroll = scrollView.canScrollHorizontally(1) || scrollView.canScrollHorizontally(-1)
                    if (canScroll) {
                        ScrollBarDrawable.HORIZONTAL
                    } else {
                        ScrollBarDrawable.UNKNOWN
                    }
                }

                else -> ScrollBarDrawable.UNKNOWN
            }
        }
    override val scrollRange: Int
        get() {
            val child = scrollView.getChildAt(0) ?: return 0
            return if (scrollView is ScrollView) {
                child.measuredHeight
            } else {
                child.measuredWidth
            }
        }

    override val scrollExtent: Int
        get() = if (scrollView is ScrollView) {
            scrollView.height
        } else {
            scrollView.width
        }

    override val scrollOffset: Int
        get() = if (scrollView is ScrollView) {
            scrollView.scrollY
        } else {
            scrollView.scrollX
        }

    override fun scrollTo(offset: Int) {
        if (scrollView is ScrollView) {
            scrollView.scrollTo(0, offset)
        } else {
            scrollView.scrollTo(offset, 0)
        }
    }
}
