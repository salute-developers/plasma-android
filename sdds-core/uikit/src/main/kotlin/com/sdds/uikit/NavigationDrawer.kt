package com.sdds.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import androidx.core.content.ContextCompat
import androidx.core.content.res.use
import androidx.core.graphics.withSave
import androidx.core.view.doOnNextLayout
import androidx.core.view.isGone
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.AnimationUtils.lerp
import com.sdds.uikit.internal.base.fullHeight
import com.sdds.uikit.internal.base.fullWidth
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.internal.navigationdrawer.ItemSelectorDecorator
import com.sdds.uikit.internal.navigationdrawer.NavigationDrawerItem
import com.sdds.uikit.internal.navigationdrawer.NavigationDrawerItem.Companion.bindItem
import com.sdds.uikit.internal.navigationdrawer.NavigationDrawerItemsView
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeable

/**
 * Компонент NavigationDrawer поддерживающий заголовок, подвал,
 * список элементов и анимацию раскрытия/сворачивания.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 */
open class NavigationDrawer @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_navigationDrawerStyle,
    defStyleRes: Int = R.style.Sdds_Components_NavigationDrawer,
) : ViewGroup(context, attrs, defStyleAttr, defStyleRes), Shapeable {

    /**
     * Интерфейс для обработки выбора элемента меню в NavigationDrawer.
     * */
    fun interface NavigationItemSelectedListener {
        /**
         * Вызывается при выборе элемента. Возвращает true, если выбор подтверждён.
         */
        fun onItemSelected(item: Item): Boolean
    }

    /**
     * Интерфейс для отслеживания изменения состояния меню.
     */
    fun interface NavigationDrawerStateListener {
        /**
         * Вызывается при изменении состояния (развёрнуто/свёрнуто).
         */
        fun onStateChanged(oldState: Int, newState: Int)
    }

    /**
     * Интерфейс для отслеживания смещения во время анимации.
     */
    fun interface NavigationDrawerOffsetListener {
        /**
         * Вызывается при смещении NavigationDrawer.
         */
        fun onOffsetChanged(from: Int, to: Int, offset: Int)
    }

    private val _shapeable = shapeable(attrs, defStyleAttr, defStyleRes)
    private var _headerContainer: FrameLayout = FrameLayout(context)
    private var _footerContainer: FrameLayout = FrameLayout(context)
    private var _itemsRecyclerView = NavigationDrawerItemsView(this) {
        clearHeaderFooterSelection()
        _navigationItemSelectedListener?.onItemSelected(it) == true
    }
    private var _navigationItemSelectedListener: NavigationItemSelectedListener? = null
    private var _navigationDrawerStateListener: NavigationDrawerStateListener? = null
    private var _navigationDrawerOffsetListener: NavigationDrawerOffsetListener? = null
    private var _expandedMinWidth: Int = 0
    private var _collapsedItemWidth: Int = 0
    private var selectorDecorator: ItemSelectorDecorator? = null

    private var _itemSelectorTint: ColorStateList? = null
    private var _itemSelectorEnabled: Boolean = false
    private val clippingRect: Rect = Rect()
    private val backgroundAnimBounds: Rect = Rect()
    private val selectedItemAnimBounds: Rect = Rect()
    private val selectorAnimBounds: Rect = Rect()
    private var _mode: Int = MODE_AUTO
    private var _state: Int = -1

    private val expandAnimator by unsafeLazy {
        ValueAnimator.ofFloat(0f, 1f).apply {
            duration = AnimationUtils.DEFAULT_DURATION
            interpolator = AnimationUtils.ACCELERATE_DECELERATE_INTERPOLATOR
        }
    }

    @StyleRes
    private var _itemStyle: Int = 0

    private var _pendingSelector: View? = null

    private val onRecyclerFocusListener = ViewTreeObserver.OnGlobalFocusChangeListener { _, newFocus ->
        if (newFocus != null && hasFocus()) {
            if (mode == MODE_AUTO && !isExpanded) {
                _pendingSelector = newFocus
                moveToState(STATE_EXPANDED)
            } else {
                selectorDecorator?.moveToView(newFocus)
            }
        } else {
            selectorDecorator?.clear()
            if (mode == MODE_AUTO && isExpanded) {
                moveToState(STATE_COLLAPSED)
            }
            invalidate()
        }
    }

    /**
     * Текущий режим отображения NavigationDrawer: [MODE_AUTO], [MODE_EXPANDED] или [MODE_COLLAPSED].
     */
    open var mode: Int
        get() = _mode
        set(value) {
            if (_mode != value) {
                _mode = value
                moveToState(getStateByMode(value))
            }
        }

    /**
     * Текущее состояние меню: [STATE_EXPANDED] или [STATE_COLLAPSED].
     */
    open val state: Int get() = _state

    /**
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _shapeable.shape

    init {
        @Suppress("LeakingThis")
        setWillNotDraw(false)
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        populate()
    }

    /**
     * Переводит меню в заданное состояние с анимацией или без.
     */
    open fun moveToState(state: Int, animate: Boolean = true) {
        if (_state != state) {
            val oldState = _state
            _state = state
            _navigationDrawerStateListener?.onStateChanged(oldState, state)
            refreshDrawableState()
            if (animate) {
                animateExpandedState()
            } else {
                handleStateChange(state)
            }
        }
    }

    /**
     * Устанавливает слушатель выбора элемента [NavigationDrawer.Item].
     */
    open fun setNavigationItemSelectedListener(listener: NavigationItemSelectedListener?) {
        _navigationItemSelectedListener = listener
    }

    /**
     * Устанавливает слушатель изменения состояния.
     */
    open fun setNavigationDrawerStateListener(listener: NavigationDrawerStateListener?) {
        _navigationDrawerStateListener = listener
    }

    /**
     * Устанавливает слушатель смещения во время анимации.
     */
    open fun setNavigationDrawerOffsetListener(listener: NavigationDrawerOffsetListener?) {
        _navigationDrawerOffsetListener = listener
    }

    /**
     * Устанавливает произвольный [View] как заголовок.
     */
    open fun setHeader(header: View) {
        _headerContainer.removeAllViews()
        _headerContainer.addView(header)
        updateMinimumWidth(minimumWidth)
        invalidate()
        requestLayout()
    }

    /**
     * Устанавливает заголовок из элемента [Item].
     */
    fun setHeader(item: Item?) {
        var header = _headerContainer.getChildAt(0) as? NavigationDrawerItem
        if (item == null) {
            header?.let { _headerContainer.removeView(it) }
            return
        }
        header = header ?: _itemsRecyclerView.createNavigationItem(_headerContainer)
            .also { headerView ->
                headerView.setOnClickListener {
                    clearHeaderFooterSelection()
                    it.isSelected = _navigationItemSelectedListener?.onItemSelected(item) == true
                    if (it.isSelected) _itemsRecyclerView.clearSelection()
                }
                setHeader(headerView)
            }
        header.bindItem(item, state)
    }

    /**
     * Загружает заголовок из XML-ресурса.
     */
    fun inflateHeader(@LayoutRes headerRes: Int): View {
        return LayoutInflater.from(context).inflate(headerRes, _headerContainer, false).also {
            setHeader(it)
        }
    }

    /**
     * Устанавливает произвольный [View] как подвал.
     */
    open fun setFooter(footer: View) {
        _footerContainer.removeAllViews()
        _footerContainer.addView(footer)
        updateMinimumWidth(minimumWidth)
        invalidate()
        requestLayout()
    }

    /**
     * Устанавливает подвал из элемента [Item].
     */
    fun setFooter(item: Item?) {
        var footer = _footerContainer.getChildAt(0) as? NavigationDrawerItem
        if (item == null) {
            footer?.let { _footerContainer.removeView(it) }
            return
        }
        footer = footer ?: _itemsRecyclerView.createNavigationItem(_footerContainer)
            .also { footerView ->
                footerView.setOnClickListener {
                    clearHeaderFooterSelection()
                    it.isSelected = _navigationItemSelectedListener?.onItemSelected(item) == true
                    if (it.isSelected) _itemsRecyclerView.clearSelection()
                }
                setFooter(footerView)
            }
        footer.bindItem(item, state)
    }

    /**
     * Загружает подвал из XML-ресурса.
     */
    fun inflateFooter(@LayoutRes footerRes: Int) {
        setHeader(LayoutInflater.from(context).inflate(footerRes, _footerContainer, false))
    }

    /**
     * Устанавливает список элементов.
     */
    open fun setItems(items: List<Item>) {
        _itemsRecyclerView.setItems(items, _itemStyle)
        handleStateChange(state)
    }

    /**
     * Устанавливает текст счётчика для элемента по ID.
     */
    open fun setCounter(itemId: Int, counterText: String?) {
        _itemsRecyclerView.setCounter(itemId, counterText)
    }

    /**
     * Отмечает элемент с данным ID как выбранный.
     */
    open fun setSelected(itemId: Int) {
        _itemsRecyclerView.setSelected(itemId)
    }

    override fun setMinimumWidth(minWidth: Int) {
        super.setMinimumWidth(minWidth)
        updateMinimumWidth(minWidth)
    }

    private fun updateMinimumWidth(minWidth: Int) {
        _headerContainer.apply {
            minimumWidth = minWidth
            getChildAt(0)?.minimumWidth = minWidth
        }
        _footerContainer.apply {
            minimumWidth = minWidth
            getChildAt(0)?.minimumWidth = minWidth
        }
        _itemsRecyclerView.minimumWidth = minWidth
    }

    private fun animateExpandedState() {
        expandAnimator.apply {
            cancel()
            removeAllUpdateListeners()
            removeAllListeners()

            val inset = paddingStart + paddingEnd
            val selectedItem = _itemsRecyclerView.getSelectedItem()

            doOnStart {
                if (isExpanded) {
                    _pendingSelector?.let {
                        selectorDecorator?.moveToView(it)
                        _pendingSelector = null
                    }
                }
                clippingRect.set(0, 0, measuredWidth, measuredHeight)
                selectedItemAnimBounds.set(selectedItem?.background?.bounds)
                selectorAnimBounds.set(selectorDecorator?.bounds)
                backgroundAnimBounds.set(background?.bounds)
                if (backgroundAnimBounds.isEmpty) {
                    backgroundAnimBounds.set(0, 0, measuredWidth, measuredHeight)
                }
            }

            animateBounds(
                bounds = clippingRect,
                collapsedWidth = _collapsedItemWidth + inset,
                onOffset = { from, top, offset ->
                    _navigationDrawerOffsetListener?.onOffsetChanged(from, top, offset)
                },
            )
            animateBounds(backgroundAnimBounds, _collapsedItemWidth + inset) { bounds ->
                background?.bounds = bounds
            }
            animateBounds(selectedItemAnimBounds, _collapsedItemWidth, inset) { bounds ->
                selectedItem?.background?.bounds = bounds
            }
            animateBounds(selectorAnimBounds, _collapsedItemWidth, inset) { bounds ->
                selectorDecorator?.bounds = bounds
                _itemsRecyclerView.invalidate()
            }
            runWithLayoutChange()
        }
    }

    @Suppress("NotifyDataSetChanged")
    private fun ValueAnimator.runWithLayoutChange() {
        if (isExpanded) {
            doOnNextLayout { start() }
            handleStateChange(state)
            _itemsRecyclerView.update()
        } else {
            doOnEnd {
                handleStateChange(state)
                _itemsRecyclerView.update()
            }
            start()
        }
    }

    private fun ValueAnimator.animateBounds(
        bounds: Rect,
        collapsedWidth: Int,
        inset: Int = 0,
        onOffset: ((Int, Int, Int) -> Unit)? = null,
        apply: ((Rect) -> Unit)? = null,
    ) {
        var from = 0
        var to = 0
        var offsetStart = 0
        doOnStart {
            from = if (isExpanded) collapsedWidth else measuredWidth - inset
            to = if (isExpanded) measuredWidth - inset else collapsedWidth
            offsetStart = if (isExpanded) to else from
        }
        addUpdateListener {
            val progress = it.animatedFraction
            bounds.right = bounds.left + lerp(from, to, progress)
            apply?.invoke(bounds)
            onOffset?.invoke(from, to, bounds.width() - offsetStart)
            invalidate()
        }
    }

    private fun clearHeaderFooterSelection() {
        _headerContainer.getChildAt(0)?.isSelected = false
        _footerContainer.getChildAt(0)?.isSelected = false
    }

    private fun handleStateChange(state: Int) {
        val isExpanded = state == STATE_EXPANDED
        minimumWidth = if (isExpanded) _expandedMinWidth else 0
        (_footerContainer.getChildAt(0) as? NavigationDrawerItem)?.isExpanded = isExpanded
        (_headerContainer.getChildAt(0) as? NavigationDrawerItem)?.isExpanded = isExpanded
        invalidate()
        requestLayout()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)
        var totalHeight = 0

        measureChildWithMargins(_headerContainer, widthMeasureSpec, 0, heightMeasureSpec, 0)
        measureChildWithMargins(_footerContainer, widthMeasureSpec, 0, heightMeasureSpec, 0)
        totalHeight += _headerContainer.measuredHeight + _footerContainer.measuredHeight
        measureChildWithMargins(_itemsRecyclerView, widthMeasureSpec, 0, heightMeasureSpec, totalHeight)
        totalHeight += _itemsRecyclerView.measuredHeight + paddingTop + paddingBottom

        val totalWidth: Int = paddingStart + paddingEnd + maxOf(
            _headerContainer.measuredWidth, _footerContainer.measuredWidth, _itemsRecyclerView.measuredWidth,
        )

        val finalWidth = if (isExpanded) {
            totalWidth
        } else {
            _collapsedItemWidth + paddingStart + paddingEnd
        }

        val desiredWidth = when (widthMode) {
            MeasureSpec.EXACTLY -> specWidth
            MeasureSpec.AT_MOST -> minOf(finalWidth, specWidth)
            else -> finalWidth
        }
        val desiredHeight = when (heightMode) {
            MeasureSpec.EXACTLY -> specHeight
            MeasureSpec.AT_MOST -> minOf(totalHeight, specHeight)
            else -> totalHeight
        }
        setMeasuredDimension(
            desiredWidth.coerceAtLeast(minimumWidth),
            desiredHeight.coerceAtLeast(minimumHeight),
        )
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val left = paddingLeft
        var top = paddingTop

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            if (child.isGone) continue
            if (child == _footerContainer) {
                child.layout(
                    left,
                    measuredHeight - paddingBottom - child.fullHeight(),
                    left + child.fullWidth(),
                    measuredHeight - paddingBottom,
                )
            } else {
                child.layout(left, top, left + child.fullWidth(), top + child.fullHeight())
                top += child.fullHeight()
            }
        }
    }

    override fun draw(canvas: Canvas) {
        if (expandAnimator.isRunning && !clippingRect.isEmpty) {
            canvas.withSave {
                clipRect(clippingRect)
                super.draw(this)
            }
        } else {
            super.draw(canvas)
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        selectorDecorator?.draw(canvas)
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val state = super.onCreateDrawableState(extraSpace + 1)
        if (isExpanded) {
            mergeDrawableStates(state, intArrayOf(R.attr.sd_expanded))
        }
        return state
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams?): Boolean {
        return p is LayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): ViewGroup.LayoutParams {
        return LayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams?): ViewGroup.LayoutParams {
        return LayoutParams(p)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        viewTreeObserver.addOnGlobalFocusChangeListener(onRecyclerFocusListener)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        viewTreeObserver.removeOnGlobalFocusChangeListener(onRecyclerFocusListener)
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.obtainStyledAttributes(attrs, R.styleable.NavigationDrawer, defStyleAttr, defStyleRes).use {
            _itemSelectorEnabled = it.getBoolean(R.styleable.NavigationDrawer_sd_itemSelectorEnabled, false)
            _itemSelectorTint = it.getColorStateList(R.styleable.NavigationDrawer_sd_itemSelectorTint)
            _itemSelectorTint = it.getColorStateList(R.styleable.NavigationDrawer_sd_itemSelectorTint)
            _itemStyle = it.getResourceId(R.styleable.NavigationDrawer_sd_itemStyle, 0)
            _expandedMinWidth = it.getDimensionPixelSize(R.styleable.NavigationDrawer_sd_expandedMinWidth, 0)
            _collapsedItemWidth = it.getDimensionPixelSize(R.styleable.NavigationDrawer_sd_collapsedItemWidth, 0)
            _mode = it.getInt(R.styleable.NavigationDrawer_sd_mode, MODE_AUTO)
            moveToState(getStateByMode(_mode), false)

            if (_itemSelectorEnabled) {
                selectorDecorator = ItemSelectorDecorator(this, _itemsRecyclerView, _itemSelectorTint)
            }
        }
    }

    private fun populate() {
        addView(
            _headerContainer,
            LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ),
        )
        addView(
            _itemsRecyclerView,
            LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ),
        )
        addView(
            _footerContainer,
            LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ),
        )
    }

    /**
     * Параметры расположения дочерних [View] в [NavigationDrawer]
     */
    class LayoutParams : MarginLayoutParams {
        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs)
        constructor(width: Int, height: Int) : super(width, height)
        constructor(source: MarginLayoutParams?) : super(source)
        constructor(source: ViewGroup.LayoutParams?) : super(source)
    }

    /**
     * Представляет элемент списка [NavigationDrawer]: заголовок, иконка и счётчик.
     * @property id идентификатор
     * @property title заголовок
     * @property iconBitmap иконка в [Bitmap]
     * @property icon иконка в [Drawable]
     * @property counter счетчик
     * */
    class Item private constructor(
        val id: Int,
        val title: String,
        val iconBitmap: Bitmap?,
        val icon: Drawable?,
        val counter: String?,
    ) {

        /**
         * Позволяет сконструировать элемент Item по частям.
         */
        class Builder(other: Item? = null) {
            private var id: Int = other?.id ?: 0
            private var title: String? = other?.title
            private var iconBitmap: Bitmap? = other?.iconBitmap
            private var icon: Drawable? = other?.icon
            private var counter: String? = other?.counter

            /**
             * Устанавливает идентификатор элемента.
             */
            fun setId(id: Int): Builder = apply {
                this.id = id
            }

            /**
             * Устанавливает заголовок элемента.
             */
            fun setTitle(title: String?): Builder = apply {
                this.title = title
            }

            /**
             * Устанавливает заголовок из строкового ресурса.
             */
            fun setTitleRes(context: Context, @StringRes titleRes: Int): Builder = apply {
                setTitle(context.getString(titleRes))
            }

            /**
             * Устанавливает иконку как Drawable.
             */
            fun setIconDrawable(icon: Drawable?): Builder = apply {
                this.icon = icon
            }

            /**
             * Устанавливает иконку из ресурса.
             */
            fun setIconResource(context: Context, @DrawableRes icon: Int): Builder = apply {
                this.iconBitmap = null
                setIconDrawable(ContextCompat.getDrawable(context, icon))
            }

            /**
             * Устанавливает иконку как Bitmap.
             */
            fun setIconBitmap(icon: Bitmap?): Builder = apply {
                this.icon = null
                this.iconBitmap = icon
            }

            /**
             * Устанавливает значение счётчика.
             */
            fun setCounter(counter: String?): Builder = apply {
                this.counter = counter
            }

            /**
             * Создаёт экземпляр Item.
             */
            fun build(): Item = Item(id, title.orEmpty(), iconBitmap, icon, counter)
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Item

            if (id != other.id) return false
            if (title != other.title) return false
            if (iconBitmap != other.iconBitmap) return false
            if (icon != other.icon) return false
            if (counter != other.counter) return false

            return true
        }

        override fun hashCode(): Int {
            var result = id
            result = 31 * result + title.hashCode()
            result = 31 * result + (iconBitmap?.hashCode() ?: 0)
            result = 31 * result + (icon?.hashCode() ?: 0)
            result = 31 * result + (counter?.hashCode() ?: 0)
            return result
        }

        companion object {
            /**
             * Возвращает [Item] как [Builder]
             */
            fun Item.asBuilder(): Builder = Builder(this)
        }
    }

    companion object {
        /**
         * Автоматический режим отображения.
         * [NavigationDrawer] раскрывается при наличии фокуса и схлопывается - при отсутствии.
         */
        const val MODE_AUTO = 0

        /**
         * [NavigationDrawer] всегда раскрыт
         */
        const val MODE_EXPANDED = 1

        /**
         * [NavigationDrawer] всегда схлопнут
         */
        const val MODE_COLLAPSED = 2

        /**
         * [NavigationDrawer] раскрыт
         */
        const val STATE_EXPANDED = 1

        /**
         * [NavigationDrawer] схлопнут
         */
        const val STATE_COLLAPSED = 2

        /**
         * Возвращает true, если [NavigationDrawer] раскрыт в данный момент
         */
        val NavigationDrawer.isExpanded: Boolean
            get() = state == STATE_EXPANDED

        private fun Rect.set(from: Rect?) {
            if (from != null) {
                this.set(from)
            } else {
                setEmpty()
            }
        }

        private fun View.getStateByMode(mode: Int): Int {
            return when (mode) {
                MODE_EXPANDED -> STATE_EXPANDED
                MODE_COLLAPSED -> STATE_COLLAPSED
                else -> if (hasFocus()) STATE_EXPANDED else STATE_COLLAPSED
            }
        }
    }
}
