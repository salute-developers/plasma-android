package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.core.content.withStyledAttributes
import androidx.core.view.isVisible
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
        id = View.generateViewId()
        layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        isFocusable = false
        this@DropdownMenu.shape?.let { setShape(it) }
    }
    private var _itemDividerEnabled: Boolean = false
    private var _dividerItemDecoration = Divider.asItemDecoration(
        dividerWrapper(context, attrs, defStyleAttr, defStyleRes),
        RecyclerView.VERTICAL,
    )
    private var _scrollBarPaddingTop: Int = 0
    private var _scrollBarPaddingBottom: Int = 0
    private val _container: DropdownContent = DropdownContent(context).apply {
        id = View.generateViewId()
    }
    private val _footer: FrameLayout = FrameLayout(context).apply {
        id = View.generateViewId()
    }
    private val _scrollBar: ScrollBar = ScrollBar(scrollBarWrapper(context, attrs, defStyleAttr, defStyleRes)).apply {
        id = View.generateViewId()
    }
    private val _adapterObserver: RecyclerView.AdapterDataObserver = DataObserver()
    private val _emptyStateView: FrameLayout = FrameLayout(emptyStateWrapper(context, attrs, defStyleAttr, defStyleRes))
        .apply {
            id = View.generateViewId()
        }

    /**
     * Адаптер для [ListView]
     */
    var itemAdapter: ListAdapter<*, *>?
        get() = _listView.adapter as ListAdapter<*, *>
        set(value) {
            _listView.adapter?.unregisterAdapterDataObserver(_adapterObserver)
            _listView.adapter = value
            value?.registerAdapterDataObserver(_adapterObserver)
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
            _scrollBarPaddingTop = getDimensionPixelSize(R.styleable.DropdownMenu_sd_scrollBarPaddingTop, 0)
            _scrollBarPaddingBottom = getDimensionPixelSize(R.styleable.DropdownMenu_sd_scrollBarPaddingBottom, 0)
        }
        updateItemDividers()
        _container.populate()
        contentView = _container
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

    /**
     * Устанавливает заглушку [view] для состояния, когда список элементов пустой
     */
    fun setEmptyStateView(view: View?) {
        _emptyStateView.removeAllViews()
        if (view != null) {
            _emptyStateView.addView(view)
        }
        updateEmptyState()
    }

    /**
     * Возвращает текущий виджет пустого состояния.
     *
     * @return первый дочерний элемент empty state-контейнера или null, если он не установлен.
     */
    fun getEmptyStateView(): View? {
        return _emptyStateView.getChildAt(0)
    }

    /**
     * Устанавливает footer для выпадающего списка.
     *
     * @param footerView виджет, который будет отображаться внизу списка; null удаляет footer.
     */
    fun setFooter(footerView: View?) {
        _footer.removeAllViews()
        if (footerView != null) {
            _footer.addView(footerView)
        }
    }

    /**
     * Возвращает текущий footer выпадающего списка.
     *
     * @return первый дочерний элемент footer-контейнера или null, если он не установлен.
     */
    fun getFooterView(): View? {
        return _footer.getChildAt(0)
    }

    override fun showWithTrigger(
        trigger: View,
        placement: Int,
        placementMode: Int,
        alignment: Int,
        tailEnabled: Boolean,
        triggerCentered: Boolean,
        duration: Long?,
    ) {
        super.showWithTrigger(trigger, placement, placementMode, alignment, tailEnabled, triggerCentered, duration)
        updateEmptyState()
    }

    private fun updateEmptyState() {
        val itemCount = itemAdapter?.itemCount ?: 0
        _emptyStateView.isVisible = isShowing && itemCount == 0
        _footer.isVisible = !_emptyStateView.isVisible
    }

    private fun updateItemDividers() {
        if (_itemDividerEnabled) {
            _listView.addItemDecoration(_dividerItemDecoration)
        } else {
            _listView.removeItemDecoration(_dividerItemDecoration)
        }
    }

    private inner class DataObserver : RecyclerView.AdapterDataObserver() {
        override fun onChanged() {
            super.onChanged()
            notifyChange()
        }

        override fun onItemRangeChanged(positionStart: Int, itemCount: Int) {
            super.onItemRangeChanged(positionStart, itemCount)
            notifyChange()
        }

        override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
            super.onItemRangeInserted(positionStart, itemCount)
            notifyChange()
        }

        override fun onItemRangeRemoved(positionStart: Int, itemCount: Int) {
            super.onItemRangeRemoved(positionStart, itemCount)
            notifyChange()
        }

        override fun onItemRangeMoved(fromPosition: Int, toPosition: Int, itemCount: Int) {
            super.onItemRangeMoved(fromPosition, toPosition, itemCount)
            notifyChange()
        }

        override fun onItemRangeChanged(positionStart: Int, itemCount: Int, payload: Any?) {
            super.onItemRangeChanged(positionStart, itemCount, payload)
            notifyChange()
        }

        private fun notifyChange() {
            _container.post {
                updateLocationPoint()
                updateEmptyState()
                _container.requestLayout()
            }
        }
    }

    private inner class DropdownContent(context: Context) : FrameLayout(context) {

        fun populate() {
            addView(
                _listView,
                LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                ),
            )
            addView(
                _footer,
                LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                ).apply {
                    gravity = Gravity.BOTTOM
                },
            )
            addView(
                _emptyStateView,
                LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                ).apply {
                    gravity = Gravity.CENTER
                },
            )
            addView(
                _scrollBar,
                LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                ).apply {
                    gravity = Gravity.END
                    topMargin = _scrollBarPaddingTop
                    bottomMargin = _scrollBarPaddingBottom
                },
            )
            _scrollBar.attachToRecyclerView(itemListView, RecyclerView.VERTICAL)
        }

        override fun setMinimumWidth(minWidth: Int) {
            super.setMinimumWidth(minWidth)
            _listView.minimumWidth = minWidth
        }

        override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
            measureChildWithMargins(_footer, widthMeasureSpec, 0, heightMeasureSpec, 0)
            measureChildWithMargins(_listView, widthMeasureSpec, 0, heightMeasureSpec, _footer.measuredHeight)
            measureChildWithMargins(_scrollBar, widthMeasureSpec, 0, heightMeasureSpec, 0)
            measureChildWithMargins(_emptyStateView, widthMeasureSpec, 0, heightMeasureSpec, 0)
            val desiredWidth = if (_emptyStateView.isVisible) {
                maxOf(_listView.measuredWidth, _emptyStateView.measuredWidth)
            } else {
                _listView.measuredWidth
            }
            val desiredHeight = if (_emptyStateView.isVisible) {
                maxOf(_listView.measuredHeight + _footer.measuredHeight, _emptyStateView.measuredHeight)
            } else {
                _listView.measuredHeight + _footer.measuredHeight
            }
            setMeasuredDimension(
                resolveSize(desiredWidth, widthMeasureSpec),
                resolveSize(desiredHeight, heightMeasureSpec),
            )
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

        internal fun scrollBarWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.DropdownMenu, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.DropdownMenu_sd_scrollBarStyleOverlay, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, styleOverlay)
                }
            }
            return themeOverlay
        }

        internal fun emptyStateWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.DropdownMenu, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.DropdownMenu_sd_emptyStateStyleOverlay, 0)
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
