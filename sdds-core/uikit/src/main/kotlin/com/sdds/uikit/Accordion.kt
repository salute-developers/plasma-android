package com.sdds.uikit

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import androidx.core.content.withStyledAttributes
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.RecyclerView
import com.sdds.uikit.Accordion.AccordionAdapter
import com.sdds.uikit.Accordion.AccordionAdapter.AccordionItemHolder
import com.sdds.uikit.SimpleAccordionAdapter.SimpleAccordionItemHolder
import com.sdds.uikit.drawable.DividerDrawable
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.list.VerticalSpaceBetweenDecorator

/**
 * Компонент UI, реализующий список с элементами-аккордеонами.
 *
 * Позволяет настраивать отступы между элементами, отображение разделителей,
 * а также предоставляет анимации открытия/закрытия элементов.
 *
 * @constructor Создаёт [Accordion] с возможностью указания стиля и атрибутов.
 *
 * @param context Контекст, в котором инициализируется компонент.
 * @param attrs Набор атрибутов XML.
 * @param defStyleAttr Атрибут стиля по умолчанию.
 * @param defStyleRes Ресурс стиля по умолчанию.
 */
open class Accordion @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_accordionStyle,
    defStyleRes: Int = R.style.Sdds_Components_Accordion,
) : ListView(itemWrapper(context, attrs, defStyleAttr, defStyleRes), attrs, defStyleAttr, defStyleRes) {

    private var _itemDividerEnabled: Boolean = false
    private var _dividerItemDecoration = TopDividerItemDecoration(
        dividerWrapper(context, attrs, defStyleAttr, defStyleRes),
    )
    private var _itemSpacing: Int = 0

    init {
        context.withStyledAttributes(attrs, R.styleable.Accordion, defStyleAttr, defStyleRes) {
            _itemDividerEnabled = getBoolean(R.styleable.Accordion_sd_itemDividerEnabled, false)
            _itemSpacing = getDimensionPixelSize(R.styleable.Accordion_sd_itemSpacing, 0)
        }
        updateItemDividers()
        updateItemSpacing()
        itemAnimator = AccordionItemAnimator()
    }

    /**
     * Включает или отключает отображение разделителей между элементами списка.
     */
    var itemDividerEnabled: Boolean
        get() = _itemDividerEnabled
        set(value) {
            if (_itemDividerEnabled != value) {
                _itemDividerEnabled = value
                updateItemDividers()
            }
        }

    private fun updateItemDividers() {
        if (_itemDividerEnabled) {
            addItemDecoration(_dividerItemDecoration)
        } else {
            removeItemDecoration(_dividerItemDecoration)
        }
    }

    private fun updateItemSpacing() {
        if (_itemSpacing > 0) {
            addItemDecoration(VerticalSpaceBetweenDecorator(_itemSpacing))
        }
    }

    private inner class AccordionItemAnimator : DefaultItemAnimator() {

        init {
            moveDuration = AnimationUtils.DEFAULT_DURATION
        }

        private val _pendingOpenAnimation = mutableSetOf<AccordionItemHolder<*>>()

        override fun runPendingAnimations() {
            _pendingOpenAnimation.forEach {
                it.accordionItemView.runDelayedAnimations()
            }
            super.runPendingAnimations()
            _pendingOpenAnimation.clear()
        }

        override fun onMoveStarting(item: ViewHolder?) {
            super.onMoveStarting(item)
        }
        override fun animateMove(holder: ViewHolder, fromX: Int, fromY: Int, toX: Int, toY: Int): Boolean {
            if (holder is AccordionItemHolder<*>) {
                if (holder.adapterPosition != ((adapter?.itemCount ?: 0) - 1)) {
                    _pendingOpenAnimation.add(holder)
                } else {
                    holder.accordionItemView.runDelayedAnimations()
                }
            }
            return super.animateMove(holder, fromX, fromY, toX, toY)
        }
    }

    /**
     * Адаптер для отображения элементов в [Accordion].
     *
     * Обрабатывает открытие/закрытие элементов, хранит их состояния и отображает соответствующее содержимое.
     *
     * @param T Тип данных, реализующий интерфейс [AccordionItem].
     * @param VH ViewHolder, наследующий [AccordionItemHolder].
     */
    abstract class AccordionAdapter<T : AccordionItem, VH : AccordionItemHolder<T>> : ListViewAdapter<T, VH> {

        private var _expandedItemsIds = mutableSetOf<Long>()
        private var _recyclerView: RecyclerView? = null

        constructor(diffCallback: ItemCallback<T>) : super(diffCallback)

        constructor(differConfig: AsyncDifferConfig<T>) : super(differConfig)

        override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
            super.onAttachedToRecyclerView(recyclerView)
            _recyclerView = recyclerView
        }

        override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
            super.onDetachedFromRecyclerView(recyclerView)
            _recyclerView = null
        }

        /**
         * Проверяет, открыт ли элемент по его ID.
         *
         * @param id Уникальный идентификатор элемента.
         * @return true, если элемент открыт.
         */
        open fun isOpened(id: Long): Boolean {
            return _expandedItemsIds.contains(id)
        }

        /**
         * Определяет, следует ли проигрывать анимацию при открытии/закрытии элемента.
         *
         * По умолчанию возвращает true. Может быть переопределён для индивидуального поведения.
         *
         * @param id Уникальный идентификатор элемента.
         * @return true, если нужно анимировать.
         */
        open fun shouldAnimate(id: Long): Boolean {
            return true
        }

        /**
         * Проверяет, открыт ли элемент по его позиции.
         *
         * @param position Позиция элемента.
         * @return true, если элемент открыт.
         */
        fun isOpened(position: Int): Boolean {
            return isOpened(getItemId(position))
        }

        /**
         * Определяет, следует ли проигрывать анимацию при открытии/закрытии элемента.
         *
         * По умолчанию возвращает true. Может быть переопределён для индивидуального поведения.
         *
         * @param id Позиция элемента.
         * @return true, если нужно анимировать.
         */
        fun shouldAnimate(position: Int): Boolean {
            return shouldAnimate(getItemId(position))
        }

        /**
         * Открывает или закрывает элемент с указанным ID.
         *
         * @param id Уникальный идентификатор элемента.
         * @param opened Флаг, указывающий, нужно ли открыть элемент.
         */
        open fun setOpened(id: Long, opened: Boolean) {
            if (opened) {
                _expandedItemsIds.add(id)
            } else {
                _expandedItemsIds.remove(id)
            }
            val position = currentList.indexOfFirst { it.id == id }
            _recyclerView?.scrollToPosition(position)
            notifyItemChanged(position, opened)
        }

        override fun onBindViewHolder(holder: VH, position: Int, payloads: MutableList<Any>) {
            if (payloads.isNotEmpty()) {
                holder.accordionItemView.setOpened(isOpened(position), shouldAnimate(position))
            }
            super.onBindViewHolder(holder, position, payloads)
        }

        override fun onBindViewHolder(holder: VH, position: Int) {
            holder.accordionItemView.setOnClickListener {
                val id = getItemId(holder.adapterPosition)
                val needOpen = !isOpened(holder.adapterPosition)
                setOpened(id, needOpen)
            }
            holder.bind(getItem(position))
            holder.accordionItemView.opened = isOpened(position)
        }

        /**
         * ViewHolder для элементов аккордеона.
         *
         * Хранит ссылку на [AccordionItemView] и отвечает за привязку данных.
         *
         * @param accordionItemView Отображаемый элемент аккордеона.
         */
        open class AccordionItemHolder<T : AccordionItem>(
            open val accordionItemView: AccordionItemView,
        ) : ListViewHolder(accordionItemView) {

            /**
             * Привязывает данные элемента к отображаемому виду.
             *
             * @param item Элемент аккордеона для отображения.
             */
            open fun bind(item: T) {
                accordionItemView.title = item.title
                accordionItemView.contentText = item.contentText
                accordionItemView.colorState = item.colorState
            }
        }
    }

    companion object {

        internal fun itemWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.Accordion, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.Accordion_sd_accordionItemViewStyleOverlay, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, styleOverlay)
                }
            }
            return themeOverlay
        }

        internal fun dividerWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.Accordion, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.Accordion_sd_dividerStyleOverlay, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, styleOverlay)
                }
            }
            return themeOverlay
        }
    }
}

private data class SimpleAccordionItem(
    override val id: Long,
    override val title: String,
    override val contentText: String?,
) : AccordionItem {
    override val hasDisclosure: Boolean = false
}

/**
 * Интерфейс элемента аккордеона.
 *
 * Объединяет данные, необходимые для отображения заголовка и содержимого.
 */
interface AccordionItem : ListItem {
    /**
     * Текст контента
     */
    val contentText: String?

    companion object {
        /**
         * Утилита для создания простого элемента аккордеона.
         *
         * @param id Уникальный ID элемента.
         * @param title Заголовок.
         * @param contentText Текст содержимого (опционально).
         * @return Экземпляр [AccordionItem].
         */
        fun simpleItem(
            id: Long,
            title: String,
            contentText: String? = null,
        ): AccordionItem = SimpleAccordionItem(id, title, contentText)
    }
}

/**
 * Простая реализация [AccordionAdapter] для стандартных элементов.
 */
class SimpleAccordionAdapter : AccordionAdapter<AccordionItem, SimpleAccordionItemHolder>(AccordionDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleAccordionItemHolder {
        val view = AccordionItemView(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }
        return SimpleAccordionItemHolder(view)
    }

    /**
     * ViewHolder для простых элементов [AccordionItem].
     */
    class SimpleAccordionItemHolder(
        override val accordionItemView: AccordionItemView,
    ) : AccordionItemHolder<AccordionItem>(accordionItemView)

    /**
     * Реализация [ItemCallback] для [AccordionItem].
     */
    private object AccordionDiffCallback : ItemCallback<AccordionItem>() {
        override fun areItemsTheSame(oldItem: AccordionItem, newItem: AccordionItem): Boolean {
            return (oldItem.id == newItem.id)
        }

        @Suppress("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: AccordionItem, newItem: AccordionItem): Boolean {
            return oldItem == newItem
        }
    }
}

private class TopDividerItemDecoration(
    context: Context,
) : RecyclerView.ItemDecoration() {

    private val divider: Drawable = DividerDrawable(context)

    override fun onDraw(canvas: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        val itemCount = parent.adapter?.itemCount ?: return

        for (i in 0 until parent.childCount) {
            val child = parent.getChildAt(i)
            val position = parent.getChildAdapterPosition(child)

            if (position == RecyclerView.NO_POSITION || position >= itemCount) continue

            drawDividerVertical(canvas, child, parent)
        }
    }

    private fun drawDividerVertical(canvas: Canvas, child: View, parent: RecyclerView) {
        val layoutManager = parent.layoutManager ?: return
        val top = layoutManager.getDecoratedTop(child) + child.translationY.toInt() - divider.intrinsicHeight
        val bottom = top + divider.intrinsicHeight

        if (top <= 0) return // не рисуем, выходит за границу

        val left = parent.paddingLeft
        val right = parent.width - parent.paddingRight
        divider.setBounds(left, top, right, bottom)
        divider.draw(canvas)
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val position = parent.getChildAdapterPosition(view)

        if (position == 0) {
            outRect.set(0, 0, 0, 0)
        } else {
            outRect.set(0, 0, 0, divider.intrinsicHeight)
        }
    }
}
