package com.sdds.uikit

import android.content.Context
import android.graphics.Outline
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import androidx.core.content.withStyledAttributes
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sdds.uikit.SimpleListViewAdapter.SimpleListViewHolder
import com.sdds.uikit.fs.FocusSelectorBorder
import com.sdds.uikit.fs.FocusSelectorSettings
import com.sdds.uikit.internal.base.isClippedToOutline
import kotlin.math.roundToInt

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
) : RecyclerView(wrapper(context, attrs, defStyleAttr, defStyleRes), attrs, defStyleAttr) {

    private val _orientation: Int
        get() = (layoutManager as? LinearLayoutManager)?.orientation ?: HORIZONTAL

    init {
        initOutline(context, attrs, defStyleAttr, defStyleRes)
    }

    override fun onScrollStateChanged(state: Int) {
        super.onScrollStateChanged(state)
        updateOutlineOnScroll(state)
    }

    private fun initOutline(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ) {
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
        val settings = FocusSelectorSettings.fromAttrs(context, attrs, defStyleAttr, defStyleRes)
        outlineProvider = SelectorOutlineProvider(settings)
    }

    private fun updateOutlineOnScroll(state: Int) {
        (outlineProvider as? SelectorOutlineProvider)?.apply {
            if (state == SCROLL_STATE_IDLE) {
                extendHorizontal = true
                extendVertical = true
            } else {
                // Если ориентация горизонтальная, нужно отключить расширение outline по горизонтали,
                // чтобы элементы не вылезали за границы List при скролле
                extendHorizontal = _orientation != HORIZONTAL
                // Если ориентация вертикальная, нужно отключить расширение outline по вертикали,
                // чтобы элементы не вылезали за границы List при скролле
                extendVertical = _orientation != VERTICAL
            }
        }
        invalidateOutline()
    }

    private class SelectorOutlineProvider(settings: FocusSelectorSettings) : ViewOutlineProvider() {
        private val focusSelectorScale: Float = if (settings.scaleEnabled) {
            1f + settings.scaleFactor
        } else {
            1f
        }
        private val focusSelectorOffset: Int = if (settings.border.borderMode != FocusSelectorBorder.Mode.NONE) {
            ((settings.border.strokeWidth + settings.border.strokeInsets) * focusSelectorScale).roundToInt()
        } else {
            0
        }

        var extendVertical: Boolean = true
        var extendHorizontal: Boolean = true

        override fun getOutline(view: View, outline: Outline) {
            val verticalOffset = if (extendVertical) focusSelectorOffset else 0
            val horizontalOffset = if (extendHorizontal) focusSelectorOffset else 0
            val verticalScale = if (extendVertical) focusSelectorScale else 1f
            val horizontalScale = if (extendHorizontal) focusSelectorScale else 1f

            val scaledWidth = (view.width * horizontalScale).roundToInt()
            val scaledHeight = (view.height * verticalScale).roundToInt()
            val left = if (scaledWidth >= view.width) (view.width - scaledWidth) / 2 else 0
            val top = if (scaledHeight >= view.height) (view.height - scaledHeight) / 2 else 0

            outline.setRect(
                left - horizontalOffset,
                top - verticalOffset,
                left + scaledWidth + horizontalOffset,
                top + scaledHeight + verticalOffset,
            )
        }
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
) : CellLayout(context, attrs, defStyleAttr, defStyleRes)

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

    companion object {

        /**
         * Создает простой экземпляр [ListItem]
         * @param id идентификатор элемента
         * @param title заголовок элемента
         * @param hasDisclosure наличие индикатора дополнительной информации
         */
        fun simpleItem(
            id: Long,
            title: String,
            hasDisclosure: Boolean = true,
        ): ListItem =
            SimpleListItem(
                id = id,
                title = title,
                hasDisclosure = hasDisclosure,
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
) : ListItem
