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

    init {
        initOutline(context, attrs, defStyleAttr, defStyleRes)
    }

    private fun initOutline(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ) {
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
        val settings = FocusSelectorSettings.fromAttrs(context, attrs, defStyleAttr, defStyleRes)
        val focusSelectorScale = if (settings.scaleEnabled) {
            1f + settings.scaleFactor
        } else {
            1f
        }
        val focusSelectorOffset = if (settings.border.borderMode != FocusSelectorBorder.Mode.NONE) {
            ((settings.border.strokeWidth + settings.border.strokeInsets) * focusSelectorScale).roundToInt()
        } else {
            0
        }

        outlineProvider = object : ViewOutlineProvider() {
            override fun getOutline(view: View, outline: Outline) {
                val scaledWidth = (view.width * focusSelectorScale).roundToInt()
                val scaledHeight = (view.height * focusSelectorScale).roundToInt()
                val left = if (scaledWidth >= view.width) (view.width - scaledWidth) / 2 else 0
                val top = if (scaledHeight >= view.height) (view.height - scaledHeight) / 2 else 0
                outline.setRect(
                    left - focusSelectorOffset,
                    top - focusSelectorOffset,
                    left + scaledWidth + focusSelectorOffset,
                    top + scaledHeight + focusSelectorOffset,
                )
            }
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
                val chipStyleOverlay = getResourceId(R.styleable.ListView_sd_listItemViewStyleOverlay, 0)
                if (chipStyleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, chipStyleOverlay)
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
