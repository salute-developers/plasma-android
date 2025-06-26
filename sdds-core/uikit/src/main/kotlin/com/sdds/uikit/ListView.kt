package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.withStyledAttributes
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sdds.uikit.SimpleListViewAdapter.SimpleListViewHolder
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.fs.FocusSelectorSettings
import com.sdds.uikit.internal.base.SelectorOutlineProvider
import com.sdds.uikit.internal.base.isClippedToOutline
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeHelper

/**
 * Компонент для отображения списка из элементов на основе [RecyclerView].
 * Можно использовать с [ListViewAdapter] в качестве [RecyclerView.Adapter] и [ListItemView] в качестве элементов.
 * Компонент также умеет автоматически компенсировать отступы, необходимые для корректной работы селектора фокуса.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 * @author Малышев Александр on 04.06.2025
 */
open class ListView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_listViewStyle,
    defStyleRes: Int = R.style.Sdds_Components_List,
) : RecyclerView(wrapper(context, attrs, defStyleAttr, defStyleRes), attrs, defStyleAttr), Shapeable {

    private val _shapeHelper = shapeHelper(attrs, defStyleAttr, defStyleRes)
    private val _selectorSettings = FocusSelectorSettings.fromAttrs(context, attrs, defStyleAttr, defStyleRes)

    init {
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
        resetOutline()
        viewTreeObserver.addOnGlobalFocusChangeListener { _, _ ->
            if (shouldExtendOutline()) {
                updateOutlineOnScroll()
            }
        }
    }

    override val shape: ShapeModel?
        get() = _shapeHelper.shape

    override fun onScrollStateChanged(state: Int) {
        super.onScrollStateChanged(state)
        updateOutlineOnScroll()
    }

    internal fun setShape(shapeModel: ShapeModel) {
        _shapeHelper.setShape(shapeModel)
        resetOutline()
    }

    private fun resetOutline() {
        outlineProvider = SelectorOutlineProvider(_selectorSettings, _shapeHelper.shape)
    }

    private fun updateOutlineOnScroll() {
        (outlineProvider as? SelectorOutlineProvider)?.apply {
            // Если ориентация вертикальная, нужно отключить расширение outline по вертикали,
            // чтобы элементы не вылезали за границы List при скролле
            extendTop = shouldExtendTopOutline()
            extendBottom = shouldExtendBottomOutline()
            // Если ориентация горизонтальная, нужно отключить расширение outline по горизонтали,
            // чтобы элементы не вылезали за границы List при скролле
            extendStart = shouldExtendLeftOutline()
            extendEnd = shouldExtendRightOutline()
        }
        invalidateOutline()
    }

    private fun shouldExtendOutline(): Boolean {
        return hasFocus() && !isFocused
    }

    private fun shouldExtendTopOutline(): Boolean {
        return shouldExtendOutline() && isFocusedChildNearEdge(EDGE.TOP)
    }

    private fun shouldExtendBottomOutline(): Boolean {
        return shouldExtendOutline() && isFocusedChildNearEdge(EDGE.BOTTOM)
    }

    private fun shouldExtendLeftOutline(): Boolean {
        return shouldExtendOutline() && isFocusedChildNearEdge(EDGE.LEFT)
    }

    private fun shouldExtendRightOutline(): Boolean {
        return shouldExtendOutline() && isFocusedChildNearEdge(EDGE.RIGHT)
    }

    /**
     * Проверяет, находится ли сфокусированный дочерний элемент близко к указанной стороне (edge) с учетом threshold.
     */
    private fun isFocusedChildNearEdge(edge: EDGE, threshold: Int = 0): Boolean {
        val child = focusedChild ?: return false

        return when (edge) {
            EDGE.TOP -> child.top - threshold <= paddingTop
            EDGE.BOTTOM -> child.bottom + threshold >= height - paddingBottom
            EDGE.LEFT -> child.left - threshold <= paddingLeft
            EDGE.RIGHT -> child.right + threshold >= width - paddingRight
        }
    }

    private enum class EDGE {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
    }

    companion object {
        internal fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.ListView, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.ListView_sd_listItemViewStyleOverlay, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, styleOverlay)
                }
            }
            return themeOverlay
        }
    }
}

/**
 * Компонент - элемента списка [ListView]
 * Можно использовать в [ListViewAdapter].
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 * @author Малышев Александр on 04.06.2025
 */
open class ListItemView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_listItemViewStyle,
    defStyleRes: Int = R.style.Sdds_Components_ListItem,
) : CellLayout(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder {

    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }
}

/**
 * Базовый интерфейс элемента в [ListViewAdapter]
 */
interface ListItem {

    /**
     * Идентификатор элемента
     */
    val id: Long

    /**
     * Заголовок элемента
     */
    val title: String

    /**
     * Наличие индикатора дополнительной информации
     */
    val hasDisclosure: Boolean

    /**
     * Состояние цвета элемента
     * @see ListItemView.colorState
     */
    val colorState: ColorState? get() = null

    companion object {

        /**
         * Создает простой экземпляр [ListItem]
         * @param id идентификатор элемента
         * @param title заголовок элемента
         * @param hasDisclosure наличие индикатора дополнительной информации
         * @param colorState состояние цвета
         */
        fun simpleItem(
            id: Long,
            title: String,
            hasDisclosure: Boolean = true,
            colorState: ColorState? = null,
        ): ListItem =
            SimpleListItem(
                id = id,
                title = title,
                hasDisclosure = hasDisclosure,
                colorState = colorState,
            )
    }
}

/**
 * Базовый ViewHolder для [ListViewAdapter]
 */
open class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

/**
 * Базовый адаптер для [ListView]
 */
abstract class ListViewAdapter<T : ListItem, VH : ListViewHolder> : ListAdapter<T, VH> {

    constructor(diffCallback: ItemCallback<T>) : super(diffCallback)

    constructor(differConfig: AsyncDifferConfig<T>) : super(differConfig)

    override fun getItemId(position: Int): Long {
        return getItem(position).id
    }
}

/**
 * Простая реализация адаптера [ListViewAdapter] для [ListView]
 */
class SimpleListViewAdapter : ListViewAdapter<ListItem, SimpleListViewHolder>(ListItemDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleListViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.sd_layout_simple_list_item, parent, false)
        return SimpleListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SimpleListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    /**
     * Простой [ListViewHolder]
     */
    inner class SimpleListViewHolder(itemView: View) : ListViewHolder(itemView) {

        private val titleView: TextView = itemView.findViewById(R.id.list_item_title)

        /**
         * Связывает [item] с [itemView]
         */
        fun bind(item: ListItem) = (itemView as ListItemView).apply {
            titleView.text = item.title
            disclosureEnabled = item.hasDisclosure
            item.colorState?.let { colorState = it }
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

private data class SimpleListItem(
    override val id: Long,
    override val title: String,
    override val hasDisclosure: Boolean,
    override val colorState: ColorState? = null,
) : ListItem
