package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Parcelable
import android.util.AttributeSet
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import androidx.core.content.ContextCompat
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.doOnNextLayout
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import com.sdds.uikit.Tabs.Tab.Builder
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.drawable.DividerDrawable
import com.sdds.uikit.internal.base.fullHeight
import com.sdds.uikit.internal.base.fullWidth
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeHelper
import kotlin.math.max
import kotlin.math.min
import android.view.View as AndroidView

/**
 * Контейнер вкладок (tabs) с поддержкой скролла, индикатора выбранного таба
 * и режима раскрытия скрытых вкладок через disclosure-элемент.
 *
 * Управляет списком [Tab] и их визуальным размещением через внутренний контейнер.
 *
 * @constructor Создаёт экземпляр [Tabs].
 * @param context Контекст, в котором создаётся виджет.
 * @param attrs Атрибуты XML-разметки, если заданы.
 * @param defStyleAttr Атрибут стиля по умолчанию.
 * @param defStyleRes Ресурс стиля по умолчанию.
 */
open class Tabs @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_tabsStyle,
    defStyleRes: Int = R.style.Sdds_Components_Tabs,
) : ViewGroup(wrapper(context, attrs, defStyleAttr, defStyleRes), attrs, defStyleAttr, defStyleRes),
    Shapeable,
    ColorStateHolder {
    private val _shapeHelper = shapeHelper(attrs, defStyleAttr, defStyleRes)

    private val tabsStorage = mutableMapOf<Int, Tab>()
    private val tabsContainer: TabsContainer = TabsContainer(context)
    private var scrollableContainer: ViewGroup? = null

    private val container: ViewGroup
        get() = scrollableContainer ?: tabsContainer
    private var _displayMode: Int = 0
    private var _orientation: Int = HORIZONTAL
    private var selectedItem: TabItem? = null
        set(value) {
            if (field != value) {
                field = value
                val tab = value?.let { tabsStorage[it.id] }
                tabsContainer.setSelectedTab(tab)
                if (value != null) {
                    val scroll = getTabCompletelyVisibleScrollOffset(value)
                    scrollBy(scroll[0], scroll[1])
                }
            }
        }

    private var _onSelectedChangedListener: OnSelectedChangeListener? = null
    private val childOnSelectedChangedListener = SelectedStateTracker()
    private val _passThroughListener = PassThroughHierarchyChangeListener()

    private val dropdownMenu: DropdownMenu by unsafeLazy {
        DropdownMenu(context).apply {
            itemAdapter = SimpleListViewAdapter().apply {
                setSelectionListener { item ->
                    val selectedTab = tabsStorage[item.id.toInt()]
                    if (selectedTab != null) {
                        setSelected(selectedTab)
                    }
                    dismiss()
                }
            }
        }
    }

    private val _prevButton: ImageView = ImageView(context).apply {
        id = R.id.sd_prevButtonId
        isFocusable = true
        setOnClickListener { scrollToPrev() }
    }
    private val _nextButton: ImageView = ImageView(context).apply {
        id = R.id.sd_nextButtonId
        isFocusable = true
        setOnClickListener { scrollToNext() }
    }

    private var _dividerEnabled: Boolean = false
    private var _indicatorEnabled: Boolean = false
    private var _overflowIconsEnabled: Boolean = false

    private var _disclosureColor: ColorStateList? = null
    private var _disclosureText: CharSequence? = null
    private var _disclosureIcon: Drawable? = null
    private var _disclosureTextAppearance: Int = 0

    private var _disclosureTab: Tab? = null

    private fun getOrCreateDisclosureTab(): Tab {
        return _disclosureTab
            ?: createDisclosureTab().also { _disclosureTab = it }
    }

    private fun createDisclosureTab(): Tab {
        val isIconTabs = tabsStorage.values.all { it is IconTab }
        val tab = if (isIconTabs) {
            IconTab.builder(this.context)
                .setId(R.id.sd_tabDisclosureId)
                .setIcon(_disclosureIcon)
                .build()
        } else {
            Tab.builder(this.context)
                .setId(R.id.sd_tabDisclosureId)
                .setIcon(_disclosureIcon)
                .setText(_disclosureText)
                .build()
        }
        return tab.also { tab ->
            tab.view.apply {
                val textColor = _disclosureColor
                if (textColor != null) setTextColor(textColor)
                setIconTintList(textColor)
                setTextAppearance(_disclosureTextAppearance)
                setOnClickListener { showAllTabs() }
            }
        }
    }

    private var _tabsMinSpacing: Int = 0

    /**
     * Режим отображения вкладок: прокрутка, растяжение или «если есть место».
     * См. константы [DISPLAY_MODE_SCROLL], [DISPLAY_MODE_STRETCH], [DISPLAY_MODE_IF_ROOM].
     */
    var displayMode: Int
        get() = _displayMode
        set(value) {
            if (_displayMode != value) {
                _displayMode = value
                populate()
            }
        }

    /**
     * Ориентация ленты вкладок: [HORIZONTAL] или [VERTICAL].
     */
    var orientation: Int
        get() = _orientation
        set(value) {
            if (_orientation != value) {
                _orientation = value
                requestLayout()
                invalidate()
            }
        }

    /**
     * Включает/выключает отрисовку разделителя контейнера вкладок.
     */
    var dividerEnabled: Boolean
        get() = _dividerEnabled
        set(value) {
            if (_dividerEnabled != value) {
                _dividerEnabled = value
                invalidate()
            }
        }

    /**
     * Включает/выключает отрисовку индикатора выбранной вкладки.
     */
    var indicatorEnabled: Boolean
        get() = _indicatorEnabled
        set(value) {
            if (_indicatorEnabled != value) {
                _indicatorEnabled = value
                invalidate()
            }
        }

    /**
     * Показывать ли кнопки перелистывания (prev/next) в режиме скролла.
     */
    var overflowIconsEnabled: Boolean
        get() = _overflowIconsEnabled
        set(value) {
            if (_overflowIconsEnabled != value) {
                _overflowIconsEnabled = value
                invalidate()
                requestLayout()
            }
        }

    override val shape: ShapeModel?
        get() = _shapeHelper.shape

    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    init {
        tabsContainer.setOnHierarchyChangeListener(_passThroughListener)
        context.withStyledAttributes(attrs, R.styleable.Tabs, defStyleAttr, defStyleRes) {
            _orientation = getInt(R.styleable.Tabs_android_orientation, HORIZONTAL)
            _disclosureColor = getColorStateList(R.styleable.Tabs_sd_disclosureColor)
            _disclosureText = getString(R.styleable.Tabs_sd_disclosureText)
            _disclosureTextAppearance = getResourceId(R.styleable.Tabs_sd_disclosureTextAppearance, 0)
            _disclosureIcon = getDrawable(R.styleable.Tabs_sd_disclosureIcon)
            _nextButton.apply {
                setImageDrawable(getDrawable(R.styleable.Tabs_sd_overflowNextIcon))
                imageTintList = getColorStateList(R.styleable.Tabs_sd_overflowNextIconColor)
            }
            _prevButton.apply {
                setImageDrawable(getDrawable(R.styleable.Tabs_sd_overflowPrevIcon))
                imageTintList = getColorStateList(R.styleable.Tabs_sd_overflowPrevIconColor)
            }
            tabsContainer.apply {
                setIndicatorColor(getColorStateList(R.styleable.Tabs_sd_tabIndicatorColor))
                setIndicatorThickness(getDimensionPixelSize(R.styleable.Tabs_sd_tabIndicatorThickness, 0))
            }
            _tabsMinSpacing = getDimensionPixelSize(R.styleable.Tabs_sd_tabsMinSpacing, 0)
            _dividerEnabled = getBoolean(R.styleable.Tabs_sd_dividerEnabled, false)
            _indicatorEnabled = getBoolean(R.styleable.Tabs_sd_tabIndicatorEnabled, false)
            _overflowIconsEnabled = getBoolean(R.styleable.Tabs_sd_overflowIconsEnabled, false)
        }
        populate()
    }

    /**
     * Добавляет вкладку в контейнер.
     * @param tab Вкладка для добавления.
     */
    open fun addTab(tab: Tab) {
        tabsStorage[tab.id] = tab
        tabsContainer.addTab(tab)
        if (_disclosureTab == null) {
            val disclosureTab = getOrCreateDisclosureTab()
            tabsContainer.addTab(disclosureTab)
            _disclosureTab = disclosureTab
        }
        tabsContainer.doOnNextLayout { updateControls() }
    }

    /**
     * Удаляет вкладку из контейнера.
     * @param tab Вкладка для удаления.
     */
    open fun removeTab(tab: Tab) {
        tabsStorage.remove(tab.id)
        tabsContainer.removeTab(tab)
        tabsContainer.doOnNextLayout { updateControls() }
    }

    /**
     * Удаляет вкладку по позиции в контейнере.
     * @param position Индекс вкладки.
     */
    open fun removeTabAt(position: Int) {
        val tabItem = tabsContainer.getChildAt(position)
            ?.let { tabsStorage[it.id] }
            ?: return
        removeTab(tabItem)
    }

    /**
     * Очищает все вкладки и сбрасывает состояние выбора.
     */
    open fun clearTabs() {
        selectedItem = null
        _disclosureTab = null
        tabsStorage.clear()
        tabsContainer.removeAllViews()
        tabsContainer.doOnNextLayout { updateControls() }
    }

    /**
     * Помечает выбранной вкладку по её идентификатору.
     * @param tabId Идентификатор вкладки.
     */
    open fun setSelected(tabId: Int) {
        tabsStorage[tabId]?.let { setSelected(it) }
    }

    /**
     * Помечает выбранной указанную вкладку и прокручивает к ней контейнер.
     * @param tab Выбираемая вкладка.
     */
    open fun setSelected(tab: Tab) {
        tab.view.isSelected = true
        selectedItem?.isSelected = false
        selectedItem = tab.view
        invalidate()
    }

    /**
     * Прокручивает контейнер до указанной вкладки (без изменения выделения).
     * @param tab Вкладка, к которой нужно прокрутить.
     */
    open fun scrollToTab(tab: Tab) {
        val index = tabsContainer.indexOfChild(tab.view)
        scrollToTab(index)
    }

    override fun scrollTo(x: Int, y: Int) {
        scrollableContainer?.scrollTo(x, y)
    }

    override fun scrollBy(x: Int, y: Int) {
        scrollableContainer?.scrollBy(x, y)
    }

    private fun scrollToTab(tabView: AndroidView) {
        if (orientation == HORIZONTAL) {
            scrollTo(tabView.left, 0)
        } else {
            scrollTo(0, tabView.top)
        }
    }

    private fun scrollToTab(index: Int) {
        val tab = tabsContainer.getChildAt(index).takeIf { it != _disclosureTab?.view } ?: return
        scrollToTab(tab)
    }

    private fun scrollToNext() {
        val tab = findLastCompletelyVisibleTab() ?: return
        val tabIndex = tabsContainer.indexOfChild(tab.view)
        val prevTab = tabsContainer.getChildAt(tabIndex + 1) ?: return
        val prevScrollOffset = getTabCompletelyVisibleScrollOffset(prevTab)
        if (prevScrollOffset[0] != 0 || prevScrollOffset[1] != 0) {
            scrollBy(prevScrollOffset[0], prevScrollOffset[1])
            return
        }
        val tabSpacing = calculateTabSpacing()
        if (orientation == HORIZONTAL) {
            scrollBy(tab.view.fullWidth() + tabSpacing, 0)
        } else {
            scrollBy(0, tab.view.fullHeight() + tabSpacing)
        }
    }

    private fun scrollToPrev() {
        val tab = findFirstCompletelyVisibleTab() ?: return
        val tabIndex = tabsContainer.indexOfChild(tab.view)
        val prevTab = tabsContainer.getChildAt(tabIndex - 1) ?: return
        val prevScrollOffset = getTabCompletelyVisibleScrollOffset(prevTab)
        if (prevScrollOffset[0] != 0 || prevScrollOffset[1] != 0) {
            scrollBy(prevScrollOffset[0], prevScrollOffset[1])
            return
        }
        val tabSpacing = calculateTabSpacing()
        if (orientation == HORIZONTAL) {
            scrollBy(-tab.view.fullWidth() - tabSpacing, 0)
        } else {
            scrollBy(0, -tab.view.fullHeight() - tabSpacing)
        }
    }

    private fun findFirstCompletelyVisibleTab(): Tab? {
        val container = scrollableContainer
            ?.takeIf { displayMode == DISPLAY_MODE_SCROLL }
            ?: return tabsStorage.values.first()
        return tabsStorage.values.find { tab ->
            if (orientation == HORIZONTAL) {
                tab.view.left - container.scrollX >= 0
            } else {
                tab.view.top - container.scrollY >= 0
            }
        }
    }

    private fun getTabCompletelyVisibleScrollOffset(tab: AndroidView): IntArray {
        val container = scrollableContainer
            ?.takeIf { displayMode == DISPLAY_MODE_SCROLL }
            ?: return intArrayOf(0, 0)

        // Visible window bounds inside the scroll container
        val visibleLeft = container.scrollX
        val visibleTop = container.scrollY
        val visibleRight = visibleLeft + container.measuredWidth
        val visibleBottom = visibleTop + container.measuredHeight

        var dx = 0
        var dy = 0

        if (orientation == HORIZONTAL) {
            val left = tab.left
            val right = tab.right
            // If the tab starts before the visible area, scroll left (negative dx)
            if (left < visibleLeft) {
                dx = left - visibleLeft
            } else if (right > visibleRight) {
                // If the tab ends after the visible area, scroll right (positive dx)
                dx = right - visibleRight
            }
        } else { // VERTICAL
            val top = tab.top
            val bottom = tab.bottom
            // If the tab starts above the visible area, scroll up (negative dy)
            if (top < visibleTop) {
                dy = top - visibleTop
            } else if (bottom > visibleBottom) {
                // If the tab ends below the visible area, scroll down (positive dy)
                dy = bottom - visibleBottom
            }
        }

        return intArrayOf(dx, dy)
    }

    private fun findLastCompletelyVisibleTab(): Tab? {
        val container = scrollableContainer
            ?.takeIf { displayMode == DISPLAY_MODE_SCROLL }
            ?: return tabsStorage.values.last()
        return tabsStorage.values.findLast { tab ->
            if (orientation == HORIZONTAL) {
                tab.view.right - container.scrollX <= container.measuredWidth
            } else {
                tab.view.bottom - container.scrollY <= container.measuredHeight
            }
        }
    }

    private fun showAllTabs() {
        val disclosureTabView = _disclosureTab?.view ?: return
        dropdownMenu.apply {
            setItems<SimpleListViewAdapter>(
                tabsContainer.getHiddenTabs().map {
                    ListItem.simpleItem(
                        id = it.id.toLong(),
                        title = (it as? IconTab)?.disclosureText?.toString()
                            ?: it.view.text?.toString()
                            ?: "Tab ${it.id}",
                        hasDisclosure = false,
                    )
                },
            )
            showWithTrigger(
                trigger = disclosureTabView,
                placement = Popover.PLACEMENT_BOTTOM,
                alignment = Popover.ALIGNMENT_CENTER,
            )
        }
    }

    override fun onSaveInstanceState(): Parcelable? {
        return Bundle().apply {
            putParcelable("superState", super.onSaveInstanceState())
            putInt("selectedId", selectedItem?.id ?: NO_ID)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        if (orientation == HORIZONTAL) {
            measureHorizontal(widthMeasureSpec, heightMeasureSpec)
        } else {
            measureVertical(widthMeasureSpec, heightMeasureSpec)
        }
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        var left = paddingLeft
        var top = paddingTop

        children.forEach { child ->
            val lp = child.layoutParams as MarginLayoutParams
            val childLeft = if (orientation == HORIZONTAL) {
                left + lp.leftMargin
            } else {
                (measuredWidth - child.fullWidth()) / 2
            }
            val childTop = if (orientation == HORIZONTAL) {
                (measuredHeight - child.fullHeight()) / 2
            } else {
                top + lp.topMargin
            }
            child.layout(
                childLeft,
                childTop,
                childLeft + child.measuredWidth,
                childTop + child.measuredHeight,
            )
            if (orientation == HORIZONTAL) {
                left = childLeft + child.measuredWidth + lp.rightMargin
            } else {
                top = childTop + child.measuredHeight + lp.bottomMargin
            }
        }
    }

    private fun measureHorizontal(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        // Измеряем контейнер табов, чтобы понять, нужно ли включать кнопки для скролла
        measureChildWithMargins(container, widthMeasureSpec, 0, heightMeasureSpec, 0)
        var totalHeight = container.fullHeight()
        var totalWidth: Int = 0

        // Если скролл включен и контейнер табов очень большой, то измеряем кнопки и контейнер табов повторно
        if (displayMode == DISPLAY_MODE_SCROLL && overflowIconsEnabled) {
            if (!_prevButton.isGone) {
                measureChildWithMargins(_prevButton, widthMeasureSpec, 0, heightMeasureSpec, 0)
                totalWidth += _prevButton.fullWidth()
            }
            if (!_nextButton.isGone) {
                measureChildWithMargins(_nextButton, widthMeasureSpec, totalWidth, heightMeasureSpec, 0)
                totalWidth += _nextButton.fullWidth()
            }
            measureChildWithMargins(container, widthMeasureSpec, totalWidth, heightMeasureSpec, 0)
            totalWidth += container.fullWidth()
            totalHeight = maxOf(_prevButton.fullHeight(), _nextButton.fullHeight(), container.fullHeight())
        } else {
            totalWidth = container.fullWidth()
        }

        setMeasuredDimension(
            resolveSize(totalWidth + paddingLeft + paddingRight, widthMeasureSpec),
            resolveSize(totalHeight + paddingTop + paddingBottom, heightMeasureSpec),
        )
    }

    private fun measureVertical(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        // Измеряем контейнер табов, чтобы понять, нужно ли включать кнопки для скролла
        measureChildWithMargins(container, widthMeasureSpec, 0, heightMeasureSpec, 0)
        var totalWidth = container.fullWidth()
        var totalHeight = 0

        // Если скролл включен и контейнер табов очень большой, то измеряем кнопки и контейнер табов повторно
        if (displayMode == DISPLAY_MODE_SCROLL && overflowIconsEnabled) {
            if (!_prevButton.isGone) {
                measureChildWithMargins(_prevButton, widthMeasureSpec, 0, heightMeasureSpec, 0)
                totalHeight += _prevButton.fullHeight()
            }
            if (!_nextButton.isGone) {
                measureChildWithMargins(_nextButton, widthMeasureSpec, 0, heightMeasureSpec, totalHeight)
                totalHeight += _nextButton.fullHeight()
            }
            measureChildWithMargins(container, widthMeasureSpec, 0, heightMeasureSpec, totalHeight)
            totalHeight += container.fullHeight()
            totalWidth = maxOf(_prevButton.fullWidth(), _nextButton.fullWidth(), container.fullWidth())
        } else {
            totalHeight = container.fullHeight()
        }
        setMeasuredDimension(
            resolveSize(totalWidth + paddingLeft + paddingRight, widthMeasureSpec),
            resolveSize(totalHeight + paddingTop + paddingBottom, heightMeasureSpec),
        )
    }

    @Suppress("DEPRECATION")
    override fun onRestoreInstanceState(state: Parcelable?) {
        if (state is Bundle) {
            val id = state.getInt("selectedId")
            super.onRestoreInstanceState(state.getParcelable("superState"))
            if (id != NO_ID) {
                selectedItem = findViewById(id)
                selectedItem?.isSelected = true
            }
        } else {
            super.onRestoreInstanceState(state)
        }
    }

    override fun addView(child: AndroidView?, index: Int, params: LayoutParams?) {
        if (child is TabItem) {
            addTab(Tab(child.id, child))
            return
        }
        super.addView(child, index, params)
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        tabsContainer.isEnabled = enabled
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams? {
        return MarginLayoutParams(context, attrs)
    }

    override fun generateDefaultLayoutParams(): LayoutParams? {
        return if (orientation == VERTICAL) {
            MarginLayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        } else {
            MarginLayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        }
    }

    override fun generateLayoutParams(p: LayoutParams?): LayoutParams? {
        return MarginLayoutParams(p)
    }

    private fun populate() {
        tabsContainer.removeAllViews()
        scrollableContainer?.removeAllViews()
        removeAllViews()

        val scrollEnabled = displayMode == DISPLAY_MODE_SCROLL
        val container = if (scrollEnabled) {
            getScrollContainer(context, orientation).also {
                it.isVerticalScrollBarEnabled = false
                it.isHorizontalScrollBarEnabled = false
                it.clipChildren = false
                it.clipToPadding = false
                it.clipToOutline = true
                it.addView(tabsContainer, MarginLayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))
                it.setOnScrollChangeListener { _, _, _, _, _ -> updateControls() }
            }
        } else {
            tabsContainer
        }
        scrollableContainer = container

        if (scrollEnabled) {
            addView(_prevButton, MarginLayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        }
        addView(container, MarginLayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))
        if (scrollEnabled) {
            addView(_nextButton, MarginLayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        }
    }

    private fun updateControls() {
        if (tabsStorage.isEmpty() || displayMode != DISPLAY_MODE_SCROLL) return
        val scrollable = scrollableContainer ?: return
        val isHorizontal = orientation == HORIZONTAL
        val maxScroll = if (isHorizontal) {
            tabsContainer.measuredWidth - scrollable.measuredWidth
        } else {
            tabsContainer.measuredHeight - scrollable.measuredHeight
        }
        val canScrollPrev = if (isHorizontal) scrollable.scrollX > 0 else scrollable.scrollY > 0
        val canScrollNext = if (isHorizontal) scrollable.scrollX < maxScroll else scrollable.scrollY < maxScroll
        _prevButton.isInvisible = !canScrollPrev
        _nextButton.isInvisible = !canScrollNext
    }

    private fun calculateTabSpacing(): Int =
        if (displayMode == DISPLAY_MODE_STRETCH) 0 else _tabsMinSpacing

    /**
     * Слушатель изменения выбора во внутри контейнера [Tabs].
     */
    fun interface OnSelectedChangeListener {
        /**
         * Вызывается при изменении состояния выбора у вкладки.
         * @param tabs Контейнер, в котором произошло изменение.
         * @param item Представление вкладки, состояние которой изменилось.
         * @param isSelected Новое состояние выбора.
         */
        fun onSelectedChanged(tabs: Tabs, item: TabItem, isSelected: Boolean)
    }

    /**
     * Модель вкладки с иконкой и необязательным текстом для disclosure-режима.
     * @property disclosureText текст disclosure
     */
    class IconTab internal constructor(
        id: Int,
        view: TabItem,
        val disclosureText: CharSequence? = null,
    ) : Tab(id, view) {

        /**
         * Строитель [IconTab]. Позволяет настроить иконку, счётчик и действие.
         */
        class Builder internal constructor(private val context: Context) {
            private var _tabStyle: Int? = null
            private var _icon: Drawable? = null
            private var _counterText: CharSequence? = null
            private var _counterEnabled: Boolean = false

            private var _actionEnabled: Boolean = false
            private var _action: Drawable? = null
            private var _actionClickListener: OnClickListener? = null
            private var _id: Int = NO_ID
            private var _actionSet: Boolean = false

            private var _disclosureText: CharSequence? = null

            /**
             * Устанавливает идентификатор вкладки.
             */
            fun setId(id: Int) = apply {
                _id = id
            }

            /**
             * Применяет стиль таб-элемента.
             */
            fun setStyle(@StyleRes style: Int) = apply {
                _tabStyle = style
            }

            /**
             * Устанавливает иконку.
             */
            fun setIcon(icon: Drawable?) = apply {
                _icon = icon
            }

            /**
             * Устанавливает иконку по ресурсу.
             */
            fun setIcon(@DrawableRes iconRes: Int) =
                setIcon(ContextCompat.getDrawable(context, iconRes))

            /**
             * Задаёт текст счётчика.
             */
            fun setCounterText(counterText: CharSequence?) = apply {
                _counterText = counterText
            }

            /**
             * Задаёт текст счётчика по ресурсу.
             */
            fun setCounterText(@StringRes resId: Int) = setCounterText(context.getString(resId))

            /**
             * Включает/выключает отображение счётчика.
             */
            fun setCounterEnabled(enabled: Boolean) = apply {
                _counterEnabled = enabled
            }

            /**
             * Включает/выключает иконку-действие.
             */
            fun setActionEnabled(actionEnabled: Boolean) = apply {
                _actionEnabled = actionEnabled
            }

            /**
             * Задаёт drawable иконки-действия.
             */
            fun setAction(action: Drawable?) = apply {
                _actionSet = true
                _action = action
            }

            /**
             * Назначает обработчик клика по иконке-действию.
             */
            fun setActionClickListener(clickListener: OnClickListener) = apply {
                _actionClickListener = clickListener
            }

            /**
             * Устанавливает текст для disclosure-элемента.
             */
            fun setDisclosureText(text: String) = apply {
                _disclosureText = text
            }

            /**
             * Создаёт [Tab] на основе параметров билдера.
             */
            fun build(): Tab {
                val tabView = _tabStyle
                    ?.let { IconTabItem(context, defStyleAttr = 0, defStyleRes = it) }
                    ?: IconTabItem(context)

                tabView.apply {
                    this.id = _id
                    this.icon = _icon
                    this.isCounterEnabled = _counterEnabled
                    _counterText?.let { this.counterText = it }
                    this.iconPosition = Button.IconPosition.TextStart
                    this.actionEnabled = _actionEnabled
                    if (_actionSet) {
                        this.action = _action
                    }
                    this.gravity = if (orientation == VERTICAL) {
                        Gravity.START or Gravity.CENTER_VERTICAL
                    } else {
                        Gravity.CENTER
                    }
                    this.setActionClickListener(_actionClickListener)
                }
                return IconTab(_id, tabView, _disclosureText)
            }
        }

        companion object {
            /**
             * Возвращает строитель [Builder] для [IconTab]
             */
            fun builder(context: Context): Builder = Builder(context)
        }
    }

    /**
     * Модель вкладки с иконкой, текстами и необязательными счётчиком и действием.
     * @property id идентификатор вкладки
     */
    open class Tab internal constructor(
        val id: Int,
        internal val view: TabItem,
    ) {

        /**
         * Строитель [Tab]. Позволяет настроить текст, иконку, счётчик и действие.
         */
        class Builder internal constructor(private val context: Context) {

            private var _tabStyle: Int? = null
            private var _icon: Drawable? = null
            private var _text: CharSequence? = null
            private var _helperText: CharSequence? = null
            private var _counterText: CharSequence? = null
            private var _counterEnabled: Boolean = false
            private var _actionEnabled: Boolean = false
            private var _action: Drawable? = null
            private var _actionSet: Boolean = false
            private var _actionClickListener: OnClickListener? = null
            private var _iconPosition: Button.IconPosition = Button.IconPosition.TextStart

            private var _id: Int = NO_ID

            /**
             * Устанавливает идентификатор вкладки.
             */
            fun setId(id: Int) = apply {
                _id = id
            }

            /**
             * Применяет стиль таб-элемента.
             */
            fun setStyle(@StyleRes style: Int) = apply {
                _tabStyle = style
            }

            /**
             * Устанавливает иконку.
             */
            fun setIcon(icon: Drawable?) = apply {
                _icon = icon
            }

            /**
             * Устанавливает иконку по ресурсу.
             */
            fun setIcon(@DrawableRes iconRes: Int) =
                setIcon(ContextCompat.getDrawable(context, iconRes))

            /**
             * Устанавливает основной текст вкладки.
             */
            fun setText(text: CharSequence?) = apply {
                _text = text
            }

            /**
             * Устанавливает основной текст по ресурсу.
             */
            fun setText(@StringRes resId: Int) = setText(context.getString(resId))

            /**
             * Устанавливает дополнительный текст (value/helper).
             */
            fun setHelperText(helperText: CharSequence?) = apply {
                _helperText = helperText
            }

            /**
             * Устанавливает дополнительный текст по ресурсу.
             */
            fun setHelperText(@StringRes resId: Int) = setHelperText(context.getString(resId))

            /**
             * Задаёт текст счётчика.
             */
            fun setCounterText(counterText: CharSequence?) = apply {
                _counterText = counterText
            }

            /**
             * Задаёт текст счётчика по ресурсу.
             */
            fun setCounterText(@StringRes resId: Int) = setCounterText(context.getString(resId))

            /**
             * Включает/выключает отображение счётчика.
             */
            fun setCounterEnabled(enabled: Boolean) = apply {
                _counterEnabled = enabled
            }

            /**
             * Устанавливает положение иконки относительно текста.
             */
            fun setIconPosition(iconPosition: Button.IconPosition) = apply {
                _iconPosition = iconPosition
            }

            /**
             * Включает/выключает иконку-действие.
             */
            fun setActionEnabled(actionEnabled: Boolean) = apply {
                _actionEnabled = actionEnabled
            }

            /**
             * Задаёт drawable иконки-действия.
             */
            fun setAction(action: Drawable?) = apply {
                _actionSet = true
                _action = action
            }

            /**
             * Назначает обработчик клика по иконке-действию.
             */
            fun setActionClickListener(clickListener: OnClickListener) = apply {
                _actionClickListener = clickListener
            }

            /**
             * Создаёт [Tab].
             */
            fun build(): Tab {
                val tabView = _tabStyle
                    ?.let { TabItem(context, defStyleAttr = 0, defStyleRes = it) }
                    ?: TabItem(context)

                tabView.apply {
                    this.id = _id
                    this.icon = _icon
                    this.text = _text
                    this.value = _helperText
                    this.isCounterEnabled = _counterEnabled
                    _counterText?.let { this.counterText = it }
                    this.iconPosition = _iconPosition
                    this.actionEnabled = _actionEnabled
                    if (_actionSet) {
                        this.action = _action
                    }
                    this.setActionClickListener(_actionClickListener)
                }
                return Tab(_id, tabView)
            }
        }

        companion object {
            /**
             * Возвращает строитель [Builder] для [Tab]
             */
            fun builder(context: Context): Builder = Builder(context)
        }
    }

    private inner class SelectedStateTracker : TabItem.OnSelectedChangeListener {

        override fun onSelectedChanged(item: TabItem, isSelected: Boolean) {
            if (isSelected) {
                if (selectedItem == item) {
                    return
                } else {
                    selectedItem?.let {
                        it.isSelected = false
                        _onSelectedChangedListener?.onSelectedChanged(this@Tabs, it, false)
                    }
                    selectedItem = item
                    _onSelectedChangedListener?.onSelectedChanged(this@Tabs, item, true)
                }
            }
        }
    }

    private inner class PassThroughHierarchyChangeListener : OnHierarchyChangeListener {

        var onHierarchyChangeListener: OnHierarchyChangeListener? = null

        override fun onChildViewAdded(parent: AndroidView?, child: AndroidView?) {
            if (parent == tabsContainer && child is TabItem && child != _disclosureTab?.view) {
                if (child.id == NO_ID) {
                    child.id = generateViewId()
                }
                child.setOnSelectedChangeListener(childOnSelectedChangedListener)
            }
            onHierarchyChangeListener?.onChildViewAdded(parent, child)
        }

        override fun onChildViewRemoved(parent: AndroidView?, child: AndroidView?) {
            if (parent == tabsContainer && child is TabItem) {
                child.setOnSelectedChangeListener(null)
            }
            onHierarchyChangeListener?.onChildViewRemoved(parent, child)
        }
    }

    private inner class TabsContainer(context: Context) : ViewGroup(context) {

        private val indicatorDrawable: Drawable = ShapeDrawable().apply {
            setShapeModel(ShapeModel())
            callback = this@TabsContainer
        }

        private val divider: DividerDrawable = DividerDrawable(context).apply {
            callback = this@TabsContainer
        }

        private var laidOutTabs: Int = 0
        private var selectedTab: Tab? = null

        init {
            clipChildren = false
            clipToPadding = false
            setWillNotDraw(false)
        }

        fun addTab(tab: Tab) {
            addView(tab.view)
        }

        fun removeTab(tab: Tab) {
            removeView(tab.view)
        }

        fun getHiddenTabs(): List<Tab> {
            return tabsStorage.values.toList().takeLast(tabsStorage.size - laidOutTabs)
        }

        fun setIndicatorThickness(thickness: Int) {
            val bounds = indicatorDrawable.bounds
            if (orientation == HORIZONTAL) {
                indicatorDrawable.setBounds(bounds.left, bounds.top, bounds.right, bounds.top + thickness)
            } else {
                indicatorDrawable.setBounds(bounds.left, bounds.top, bounds.left + thickness, bounds.bottom)
            }
            requestLayout()
        }

        fun setIndicatorColor(color: ColorStateList?) {
            indicatorDrawable.setTintList(color)
        }

        fun setSelectedTab(tab: Tab?) {
            if (selectedTab != tab) {
                selectedTab = tab
                invalidate()
            }
        }

        override fun setEnabled(enabled: Boolean) {
            super.setEnabled(enabled)
            children.forEach { it.isEnabled = enabled }
        }

        override fun draw(canvas: Canvas) {
            // Таб может быть выбран из dropdown списка, а это значит, что таб на самом деле не отрисован и не может
            // являться целью для инидкатора, поэтому допольнительно проверяем состояние isSelected
            if (indicatorEnabled && selectedTab?.view?.isSelected == true) {
                updateIndicatorPosition()
                indicatorDrawable.draw(canvas)
            }
            if (dividerEnabled) divider.draw(canvas)
            super.draw(canvas)
        }

        override fun verifyDrawable(who: Drawable): Boolean {
            return super.verifyDrawable(who) || who == indicatorDrawable || who == divider
        }

        override fun drawableStateChanged() {
            super.drawableStateChanged()
            indicatorDrawable.state = drawableState
            divider.state = drawableState
        }

        override fun addView(child: AndroidView?, index: Int, params: LayoutParams?) {
            if (child !is TabItem) return
            val disclosureView = _disclosureTab?.view
            if (child != disclosureView) {
                val disclosureIndex = indexOfChild(disclosureView)
                super.addView(child, if (index < 0) disclosureIndex else min(index, disclosureIndex), params)
            } else {
                super.addView(child, index, params)
            }
        }

        override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
            if (orientation == HORIZONTAL) {
                measureHorizontal(widthMeasureSpec, heightMeasureSpec)
            } else {
                measureVertical(widthMeasureSpec, heightMeasureSpec)
            }
        }

        override fun drawChild(canvas: Canvas, child: View?, drawingTime: Long): Boolean {
            if (child == _disclosureTab?.view) {
                val shouldDrawDisclosure =
                    displayMode == DISPLAY_MODE_IF_ROOM && (childCount - 1) > laidOutTabs
                return if (shouldDrawDisclosure) {
                    super.drawChild(canvas, child, drawingTime)
                } else {
                    false
                }
            }
            if (indexOfChild(child) >= laidOutTabs) {
                return false
            }
            return super.drawChild(canvas, child, drawingTime)
        }

        override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
            super.onSizeChanged(w, h, oldw, oldh)
            divider.orientation = orientation
            if (orientation == HORIZONTAL) {
                divider.setBounds(0, measuredHeight - divider.intrinsicHeight, measuredWidth, measuredHeight)
            } else {
                divider.setBounds(0, 0, divider.intrinsicWidth, measuredHeight)
            }
            updateIndicatorPosition()
        }

        @Suppress("LongMethod", "CyclomaticComplexMethod")
        private fun measureHorizontal(widthMeasureSpec: Int, heightMeasureSpec: Int) {
            val widthMode = MeasureSpec.getMode(widthMeasureSpec)
            val specWidth = MeasureSpec.getSize(widthMeasureSpec)

            val availableWidth = if (widthMode == MeasureSpec.UNSPECIFIED) {
                Int.MAX_VALUE
            } else {
                specWidth - paddingLeft - paddingRight
            }

            val stretch = displayMode == DISPLAY_MODE_STRETCH
            val scrollEnabled = displayMode == DISPLAY_MODE_SCROLL

            val childMeasureSpec = if (stretch && !scrollEnabled && tabsStorage.isNotEmpty()) {
                MeasureSpec.makeMeasureSpec(availableWidth / tabsStorage.size, MeasureSpec.EXACTLY)
            } else {
                null
            }

            val disclosureTabView = _disclosureTab?.view

            val tabs = children
                .filter { it != disclosureTabView && !it.isGone }
                .toList()

            tabs.forEach { tab ->
                Log.e("Tabs", "measureHorizontal: counter = ${(tab as TabItem).counterText}")
                measureTabWithMargins(
                    tab,
                    widthMeasureSpec,
                    heightMeasureSpec,
                    childMeasureSpec,
                )
            }
            if (!scrollEnabled && disclosureTabView != null) {
                measureTabWithMargins(
                    disclosureTabView,
                    widthMeasureSpec,
                    heightMeasureSpec,
                    childMeasureSpec,
                )
            }

            var usedWidth = 0
            var usedHeight = 0
            val disclosureWidth = disclosureTabView?.fullWidth() ?: 0
            var visibleTabs = 0
            for (index in tabs.indices) {
                val tab = tabs[index]
                val spaceLeft = availableWidth - usedWidth
                val needDisclosure = (index + 1) < tabs.size
                val dWidth = if (needDisclosure) disclosureWidth else 0
                val spacing = if (needDisclosure) calculateTabSpacing() else 0
                val tabWidth = tab.fullWidth()
                if (spaceLeft >= tabWidth + dWidth + spacing) {
                    usedWidth += tabWidth + spacing
                    visibleTabs++
                    usedHeight = max(usedHeight, tab.fullHeight())
                } else {
                    break
                }
            }
            laidOutTabs = visibleTabs
            if (tabs.size > visibleTabs) {
                usedWidth += disclosureWidth
                usedHeight = max(usedHeight, disclosureTabView?.fullHeight() ?: 0)
            }

            setMeasuredDimension(
                resolveSize(usedWidth + paddingLeft + paddingRight, widthMeasureSpec),
                resolveSize(usedHeight + paddingTop + paddingBottom, heightMeasureSpec),
            )
        }

        @Suppress("LongMethod", "CyclomaticComplexMethod")
        private fun measureVertical(widthMeasureSpec: Int, heightMeasureSpec: Int) {
            val heightMode = MeasureSpec.getMode(heightMeasureSpec)
            val specHeight = MeasureSpec.getSize(heightMeasureSpec)

            val availableHeight = if (heightMode == MeasureSpec.UNSPECIFIED) {
                Int.MAX_VALUE
            } else {
                specHeight - paddingTop - paddingBottom
            }

            val stretch = displayMode == DISPLAY_MODE_STRETCH
            val scrollEnabled = displayMode == DISPLAY_MODE_SCROLL

            val childMeasureSpec = if (stretch && !scrollEnabled && tabsStorage.isNotEmpty()) {
                MeasureSpec.makeMeasureSpec(availableHeight / tabsStorage.size, MeasureSpec.EXACTLY)
            } else {
                heightMeasureSpec
            }

            val disclosureTabView = _disclosureTab?.view

            val tabs = children
                .filter { it != disclosureTabView && !it.isGone }
                .toList()

            tabs.forEach { tab ->
                measureTabWithMargins(
                    tab = tab,
                    parentWidthMeasureSpec = widthMeasureSpec,
                    parentHeightMeasureSpec = heightMeasureSpec,
                    childHeightMeasureSpec = childMeasureSpec,
                )
            }

            if (!scrollEnabled && disclosureTabView != null) {
                measureTabWithMargins(
                    tab = disclosureTabView,
                    parentWidthMeasureSpec = widthMeasureSpec,
                    parentHeightMeasureSpec = heightMeasureSpec,
                    childHeightMeasureSpec = childMeasureSpec,
                )
            }

            var usedWidth = 0
            var usedHeight = 0
            val disclosureHeight = disclosureTabView?.fullHeight() ?: 0
            var visibleTabs = 0
            for (index in tabs.indices) {
                val tab = tabs[index]
                val spaceLeft = availableHeight - usedHeight
                val needDisclosure = (index + 1) < tabs.size
                val dHeight = if (needDisclosure) disclosureHeight else 0
                val spacing = if (needDisclosure) calculateTabSpacing() else 0
                val tabHeight = tab.fullHeight()
                if (spaceLeft >= tabHeight + dHeight + spacing) {
                    usedHeight += tabHeight + spacing
                    visibleTabs++
                    usedWidth = max(usedWidth, tab.fullWidth())
                } else {
                    break
                }
            }
            laidOutTabs = visibleTabs
            if (tabs.size > visibleTabs) {
                usedWidth = max(usedWidth, disclosureTabView?.fullWidth() ?: 0)
                usedHeight += disclosureHeight
            }

            setMeasuredDimension(
                resolveSize(usedWidth + paddingLeft + paddingRight, widthMeasureSpec),
                resolveSize(usedHeight + paddingTop + paddingBottom, heightMeasureSpec),
            )
        }

        private fun measureTabWithMargins(
            tab: AndroidView,
            parentWidthMeasureSpec: Int,
            parentHeightMeasureSpec: Int,
            childWidthMeasureSpec: Int? = null,
            childHeightMeasureSpec: Int? = null,
        ) {
            val lp = tab.layoutParams as MarginLayoutParams
            tab.measure(
                childWidthMeasureSpec ?: getChildMeasureSpec(
                    parentWidthMeasureSpec,
                    paddingTop + paddingBottom + lp.topMargin + lp.bottomMargin,
                    lp.height,
                ),
                childHeightMeasureSpec ?: getChildMeasureSpec(
                    parentHeightMeasureSpec,
                    paddingTop + paddingBottom + lp.topMargin + lp.bottomMargin,
                    lp.height,
                ),
            )
        }

        override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
            val disclosureTabView = _disclosureTab?.view
            val tabs = children
                .filter { it != disclosureTabView && !it.isGone }
                .toList()

            var left = paddingLeft
            var top = paddingTop

            val scrollEnabled = displayMode == DISPLAY_MODE_SCROLL

            tabs.take(laidOutTabs).forEach { tab ->
                val lp = tab.layoutParams as MarginLayoutParams
                val tabLeft = left + lp.leftMargin
                val tabTop = top + lp.topMargin
                tab.layout(
                    tabLeft,
                    tabTop,
                    tabLeft + tab.measuredWidth,
                    tabTop + tab.measuredHeight,
                )
                if (orientation == HORIZONTAL) {
                    left = tabLeft + tab.measuredWidth + lp.rightMargin + calculateTabSpacing()
                } else {
                    top = tabTop + tab.measuredHeight + lp.bottomMargin + calculateTabSpacing()
                }
            }

            if (tabs.size > laidOutTabs && !scrollEnabled && disclosureTabView != null) {
                disclosureTabView.layout(
                    left,
                    top,
                    left + disclosureTabView.measuredWidth,
                    top + disclosureTabView.measuredHeight,
                )
            } else {
                disclosureTabView?.layout(0, 0, 0, 0)
            }
        }

        override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams? {
            return MarginLayoutParams(context, attrs)
        }

        override fun generateDefaultLayoutParams(): LayoutParams? {
            return if (orientation == VERTICAL) {
                MarginLayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
            } else {
                MarginLayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
            }
        }

        override fun generateLayoutParams(p: LayoutParams?): LayoutParams? {
            return MarginLayoutParams(p)
        }

        private fun updateIndicatorPosition() {
            val tabView = selectedTab?.view?.takeIf { it.isSelected && indicatorEnabled } ?: return
            val bounds = indicatorDrawable.bounds
            if (orientation == HORIZONTAL) {
                indicatorDrawable.setBounds(
                    tabView.left,
                    tabView.bottom - bounds.height(),
                    tabView.right,
                    tabView.bottom,
                )
            } else {
                indicatorDrawable.setBounds(
                    tabView.left,
                    tabView.top,
                    tabView.left + bounds.width(),
                    tabView.bottom,
                )
            }
        }
    }

    companion object {
        /**
         * Константа горизонтальной ориентации.
         */
        const val HORIZONTAL = android.widget.LinearLayout.HORIZONTAL

        /**
         * Константа вертикальной ориентации.
         */
        const val VERTICAL = android.widget.LinearLayout.VERTICAL

        /**
         * Режим: вкладки прокручиваются.
         */
        const val DISPLAY_MODE_SCROLL = 0

        /**
         * Режим: вкладки растягиваются, чтобы заполнить пространство.
         */
        const val DISPLAY_MODE_STRETCH = 1

        /**
         * Режим: размещать вкладки, пока хватает места. Невместившиеся вкладки будут перемещены в dropdown меню.
         */
        const val DISPLAY_MODE_IF_ROOM = 2

        private fun getScrollContainer(context: Context, orientation: Int): ViewGroup {
            return when (orientation) {
                HORIZONTAL -> com.sdds.uikit.HorizontalScrollView(context)
                else -> com.sdds.uikit.ScrollView(context)
            }
        }

        internal fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            val typedArray =
                context.obtainStyledAttributes(
                    attrs,
                    R.styleable.Tabs,
                    defStyleAttr,
                    defStyleRes,
                )
            val styleOverlay =
                typedArray.getResourceId(R.styleable.Tabs_sd_tabItemStyleOverlay, 0)
            val themeOverlay =
                if (styleOverlay != 0) {
                    ContextThemeWrapper(
                        context,
                        styleOverlay,
                    )
                } else {
                    context
                }
            typedArray.recycle()
            return themeOverlay
        }
    }
}
