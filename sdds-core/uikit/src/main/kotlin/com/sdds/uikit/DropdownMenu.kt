package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import androidx.core.content.withStyledAttributes
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

/**
 * Всплывающее окно — отображает список элементов поверх контента.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 * @author Малышев Александр on 11.06.2025
 */
open class DropdownMenu @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_dropdownMenuStyle,
    defStyleRes: Int = R.style.Sdds_Components_DropdownMenu,
) : Popover(context, attrs, defStyleAttr, defStyleRes) {

    private val _listView = ListView(listWrapper(context, attrs, defStyleAttr, defStyleRes)).apply {
        layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        isFocusable = false
        this@DropdownMenu.shape?.let { setShape(it) }
    }
    private var _itemDividerEnabled: Boolean = false
    private var _dividerItemDecoration = Divider.asItemDecoration(
        dividerWrapper(context, attrs, defStyleAttr, defStyleRes),
        RecyclerView.VERTICAL,
    )

    /**
     * Адаптер для [ListView]
     */
    var itemAdapter: ListAdapter<*, *>?
        get() = _listView.adapter as ListAdapter<*, *>
        set(value) {
            _listView.adapter = value
        }

    /**
     * Список элементов [ListView]
     */
    val itemListView: ListView
        get() = _listView

    /**
     * Включает/выключает отображение разделителя между элементами
     */
    var itemDividerEnabled: Boolean
        get() = _itemDividerEnabled
        set(value) {
            if (_itemDividerEnabled != value) {
                _itemDividerEnabled = value
                updateItemDividers()
            }
        }

    init {
        context.withStyledAttributes(attrs, R.styleable.DropdownMenu, defStyleAttr, defStyleRes) {
            _itemDividerEnabled = getBoolean(R.styleable.DropdownMenu_sd_itemDividerEnabled, false)
        }
        updateItemDividers()
        contentView = _listView
        isFocusable = true
    }

    /**
     * Устанавливает список [ListItem] в [DropdownMenu]
     */
    inline fun <reified Adapter : ListAdapter<ListItem, *>> setItems(items: List<ListItem>) {
        (itemAdapter as Adapter).submitList(items) {
            contentView.post {
                updateLocationPoint()
            }
        }
    }

    private fun updateItemDividers() {
        if (_itemDividerEnabled) {
            _listView.addItemDecoration(_dividerItemDecoration)
        } else {
            _listView.removeItemDecoration(_dividerItemDecoration)
        }
    }

    companion object {
        internal fun listWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.DropdownMenu, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.DropdownMenu_sd_listViewStyleOverlay, 0)
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
            context.withStyledAttributes(attrs, R.styleable.DropdownMenu, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.DropdownMenu_sd_dividerStyleOverlay, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, styleOverlay)
                }
            }
            return themeOverlay
        }
    }
}
