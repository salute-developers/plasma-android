package com.sdds.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.ViewConfiguration
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.marginBottom
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import androidx.core.view.marginTop
import androidx.core.view.updateMargins
import kotlin.math.abs

/**
 * Контейнер, который содержит выдвижную панель и основной
 * контент экрана.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 */
open class DrawerLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    private var pHeight: Int = 0
    private var dMargin: Int = 0
    private var dSide: DrawerPlacement? = null
    private var expanded: Boolean = false
    private var shiftContent: Boolean = false
    private var _focusDepended: Boolean = false
    private var _animationEnabled: Boolean = true
    private var drawerView: View? = null
    private var overlay: OverlayView = OverlayView(context)
    private var _enableOverlay: Boolean = false
    private var drawerOffset: Float = 0f
    private var startOffset: Float = 0f
    private var isDrag: Boolean = false
    private var startX: Float = 0f
    private var startY: Float = 0f
    private val touchSlop: Int = ViewConfiguration.get(context).scaledTouchSlop
    private var focusListener: ViewTreeObserver.OnGlobalFocusChangeListener? = null
    private var activePointerId = MotionEvent.INVALID_POINTER_ID
    private var _gesturesEnabled: Boolean = true
    private var autoAnimate: Boolean = false
    private var canClose: Boolean = true
    private var canOpen: Boolean = true

    private val drawerAnimation: ValueAnimator by lazy {
        ValueAnimator().apply {
            setDuration(200)
            addUpdateListener { animator ->
                val value = animator.animatedValue as Float
                when (dSide) {
                    DrawerPlacement.LEFT, DrawerPlacement.RIGHT -> {
                        drawerView?.translationX = value
                        moveChildrenByAxis(value, Axis.X)
                    }

                    DrawerPlacement.TOP, DrawerPlacement.BOTTOM -> {
                        drawerView?.translationY = value
                        moveChildrenByAxis(value, Axis.Y)
                    }

                    null -> {}
                }
                invalidate()
            }
        }
    }

    /**
     * Применяет Overlay на основной контент [DrawerLayout]
     * когда [Drawer] в expanded состоянии
     */
    open var enableOverlay: Boolean
        get() = _enableOverlay
        set(value) {
            if (_enableOverlay != value) {
                _enableOverlay = value
            }
        }

    /**
     * Величина видимой части панели [Drawer] в collapsed состоянии
     */
    open var peekHeight: Int
        get() = pHeight
        set(value) {
            if (pHeight != value) {
                pHeight = value
                requestLayout()
                invalidate()
            }
        }

    /**
     * Отступ основного контента от панели [Drawer]
     */
    open var drawerMargin: Int
        get() = dMargin
        set(value) {
            if (dMargin != value) {
                dMargin = value
                requestLayout()
                invalidate()
            }
        }

    /**
     * Определяет должен ли сдвигаться контент на экране,
     * когда [Drawer] выезжает
     */
    open var shouldToShiftContent: Boolean
        get() = shiftContent
        set(value) {
            if (shiftContent != value) {
                shiftContent = value
                requestLayout()
                invalidate()
            }
        }

    /**
     * Определяет начальное положение [Drawer]
     * @see DrawerPlacement
     */
    open var drawerPlacement: DrawerPlacement?
        get() = dSide
        set(value) {
            if (dSide != value) {
                if (isExpanded) {
                    forceCollapse()
                }
                dSide = value
                updateLayoutParams()
            }
        }

    /**
     * Определяет должен ли [Drawer] зависеть
     * от фокуса, если true - [Drawer] будет анимированно
     * появляться и исчезать при получении и потери фокуса
     */
    open var focusDepended: Boolean
        get() = _focusDepended
        set(value) {
            if (_focusDepended != value) {
                _focusDepended = value
                setupFocusListener()
            }
        }

    /**
     * Включение/отключение анимации при показе/скрытии панели [Drawer]
     */
    open var animationEnabled: Boolean
        get() = _animationEnabled
        set(value) {
            if (_animationEnabled != value) {
                _animationEnabled = value
            }
        }

    /**
     * Включение/отключение управлеения жестами для показа/скрытия панели [Drawer]
     */
    open var gesturesEnabled: Boolean
        get() = _gesturesEnabled
        set(value) {
            if (_gesturesEnabled != value) {
                _gesturesEnabled = value
            }
        }

    /**
     * Проверяет открытое состояние [Drawer] в данный момент
     */
    val isExpanded: Boolean
        get() = expanded

    /**
     * Ссылка на [Drawer] для взаимодействия с его публичными свойствами
     */
    val drawer: Drawer?
        get() = drawerView as? Drawer

    init {
        isChildrenDrawingOrderEnabled = true
        clipChildren = false
        clipToPadding = false
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT,
        )
        context.withStyledAttributes(attrs, R.styleable.DrawerLayout, defStyleAttr, defStyleRes) {
            _focusDepended = getBoolean(R.styleable.DrawerLayout_sd_focusDepended, false)
            shiftContent = getBoolean(R.styleable.DrawerLayout_sd_shiftContent, false)
            _animationEnabled = getBoolean(R.styleable.DrawerLayout_sd_animationEnabled, true)
            pHeight = getDimensionPixelSize(R.styleable.DrawerLayout_sd_peakHeight, 0)
            dMargin = getDimensionPixelSize(R.styleable.DrawerLayout_sd_drawerMargin, 0)
        }
        attachOverlay()
    }

    /**
     * Расположение [Drawer] то есть с какой сторны будет выезжать панель
     */
    enum class DrawerPlacement {

        /**
         * Выезжает и прячется в левую сторону
         */
        LEFT,

        /**
         * Выезжает и прячется в верх
         */
        TOP,

        /**
         * Выезжает и прячется в правую сторону
         */
        RIGHT,

        /**
         * Выезжает и прячется в низ
         */
        BOTTOM,
    }

    /**
     * Показывает [Drawer]
     */
    open fun expand() {
        expandWithPosition()
    }

    /**
     * Скрывает [Drawer]
     */
    open fun collapse() {
        collapseWithPosition()
    }

    /**
     * Позволяет заблокировать закрытие [Drawer]
     */
    open fun setCanClose(canClose: Boolean) {
        if (this.canClose != canClose) {
            this.canClose = canClose
        }
    }

    /**
     * Позволяет заблокировать открытие [Drawer]
     */
    open fun setCanOpen(canOpen: Boolean) {
        if (this.canOpen != canOpen) {
            this.canOpen = canOpen
        }
    }

    @Suppress("CyclomaticComplexMethod")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        drawerView ?: return super.onTouchEvent(event)
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                autoAnimate = drawerAnimation.isRunning
                activePointerId = event.getPointerId(0)
                startX = event.x
                startY = event.y
                startOffset = calculateStartOffset()
                isDrag = false
            }

            MotionEvent.ACTION_MOVE -> {
                val pointerIndex = event.findPointerIndex(activePointerId)
                if (pointerIndex != -1) {
                    val dx = event.getX(pointerIndex) - startX
                    val dy = event.getY(pointerIndex) - startY
                    if (!isDrag && isSwipeInMainAxis(dx, dy) && _gesturesEnabled) {
                        isDrag = true
                    }
                    if (isDrag && !autoAnimate) {
                        resolveDragOpen(dx, dy)
                        resolveDragClose(dx, dy)
                        return true
                    }
                }
            }

            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (isDrag && !autoAnimate) {
                    val dx = event.x - startX
                    val dy = event.y - startY
                    if (isOpening(dx, dy)) {
                        expandWithPosition(drawerOffset)
                    } else {
                        collapseWithPosition(drawerOffset)
                    }
                }
                if (event.actionMasked == MotionEvent.ACTION_UP) performClick()
                isDrag = false
                activePointerId = MotionEvent.INVALID_POINTER_ID
            }
        }
        return true
    }

    override fun performClick(): Boolean {
        return super.performClick()
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        children.forEach { child ->
            val lp = child.layoutParams as? DrawerLayoutParams
            initDrawerIfNeeded(child, lp)
        }
        setupFocusListener()
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        children.forEach { child ->
            if (child == drawerView) {
                layoutDrawerView(child)
            }
        }
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        val lp = when (params) {
            is DrawerLayoutParams -> params
            null -> generateDefaultLayoutParams() as DrawerLayoutParams
            else -> DrawerLayoutParams(params)
        }
        child?.layoutParams = lp
        super.addView(child, index, params)
        initDrawerIfNeeded(child, lp)
    }

    override fun getChildDrawingOrder(childCount: Int, drawingPosition: Int): Int {
        val drawerIndex = drawerView?.let { indexOfChild(it) } ?: -1
        val overlayIndex = indexOfChild(overlay)
        if (drawerIndex == -1 || overlayIndex == -1) return drawingPosition
        return when (drawingPosition) {
            childCount - 2 -> overlayIndex
            childCount - 1 -> drawerIndex
            else -> {
                var index = drawingPosition
                if (index >= minOf(drawerIndex, overlayIndex)) index++
                if (index >= maxOf(drawerIndex, overlayIndex)) index++
                index
            }
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        isChildrenDrawingOrderEnabled = true
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return DrawerLayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        return DrawerLayoutParams(context, attrs)
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean {
        return p is DrawerLayoutParams
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams): LayoutParams {
        return DrawerLayoutParams(p)
    }

    /**
     * Параметры расположения дочерних [View] в [DrawerLayout]
     */
    class DrawerLayoutParams : LayoutParams {

        /**
         * Расположение [Drawer] внутри [DrawerLayout]
         */
        var drawerPlacement: DrawerPlacement? = null

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            val typedArray = c.obtainStyledAttributes(attrs, R.styleable.DrawerLayout_Layout)
            val placement = typedArray.getInt(R.styleable.DrawerLayout_Layout_sd_drawerPlacement, -1)
            typedArray.recycle()
            this.drawerPlacement = DrawerPlacement.values().getOrElse(placement) { null }
        }

        constructor(width: Int, height: Int) : super(width, height)
        constructor(source: ViewGroup.LayoutParams) : super(source) {
            when (source) {
                is FrameLayout.LayoutParams -> this.gravity = source.gravity
                is LinearLayout.LayoutParams -> this.gravity = source.gravity
            }
            if (source is DrawerLayoutParams) {
                this.drawerPlacement = source.drawerPlacement
            }
        }
    }

    private fun initDrawerIfNeeded(child: View?, lp: DrawerLayoutParams?) {
        if (drawerView == null && (child is Drawer || lp?.drawerPlacement != null)) {
            drawerView = child
            lp?.drawerPlacement?.let { dSide = it }
            applyInitialSettings()
            updateLayoutParams()
        }
    }

    private fun followFinger(dx: Float, dy: Float) {
        val dSize = calculateDrawerSize()
        val threshold = dSize / 3
        when (dSide) {
            DrawerPlacement.LEFT -> {
                drawerOffset = (startOffset + dx).coerceIn(0f, dSize - peekHeight)
                drawerView?.translationX = drawerOffset
                moveChildrenByAxis(drawerOffset, Axis.X)
            }

            DrawerPlacement.TOP -> {
                drawerOffset = (startOffset + dy).coerceIn(0f, dSize - peekHeight)
                drawerView?.translationY = drawerOffset
                moveChildrenByAxis(drawerOffset, Axis.Y)
            }

            DrawerPlacement.RIGHT -> {
                drawerOffset = (startOffset + dx).coerceIn(-dSize + peekHeight, 0f)
                drawerView?.translationX = drawerOffset
                moveChildrenByAxis(drawerOffset, Axis.X)
            }

            DrawerPlacement.BOTTOM -> {
                drawerOffset = (startOffset + dy).coerceIn(-dSize + peekHeight, 0f)
                drawerView?.translationY = drawerOffset
                moveChildrenByAxis(drawerOffset, Axis.Y)
            }

            null -> {}
        }
        if (isOpening(dx, dy) && abs(drawerOffset) > threshold) {
            autoAnimate = true
            expandWithPosition(drawerOffset)
        } else if (!isOpening(dx, dy) && abs(drawerOffset) < dSize - threshold) {
            autoAnimate = true
            collapseWithPosition(drawerOffset)
        }
    }

    private fun isSwipeInMainAxis(dx: Float, dy: Float): Boolean {
        return when (dSide) {
            DrawerPlacement.LEFT, DrawerPlacement.RIGHT ->
                abs(dx) > touchSlop && abs(dx) > abs(dy)

            DrawerPlacement.TOP, DrawerPlacement.BOTTOM ->
                abs(dy) > touchSlop && abs(dy) > abs(dx)

            null -> false
        }
    }

    private fun isOpening(dx: Float, dy: Float): Boolean {
        return when (dSide) {
            DrawerPlacement.LEFT -> dx > 0
            DrawerPlacement.RIGHT -> dx < 0
            DrawerPlacement.TOP -> dy > 0
            DrawerPlacement.BOTTOM -> dy < 0
            null -> false
        }
    }

    private fun attachOverlay() {
        overlay.visibility = INVISIBLE
        val lp = DrawerLayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT,
        )
        addView(overlay, lp)
    }

    private fun applyInitialSettings() {
        drawerView?.let { drawer ->
            children.filter { it != drawer }.forEach { child ->
                val lp = (child.layoutParams as? MarginLayoutParams) ?: return@forEach
                when (dSide) {
                    DrawerPlacement.LEFT -> lp.updateMargins(left = pHeight + dMargin)
                    DrawerPlacement.TOP -> lp.updateMargins(top = pHeight + dMargin)
                    DrawerPlacement.RIGHT -> lp.updateMargins(right = pHeight + dMargin)
                    DrawerPlacement.BOTTOM -> lp.updateMargins(bottom = pHeight + dMargin)
                    null -> {}
                }
                child.layoutParams = lp
            }
        }
    }

    private fun layoutDrawerView(child: View) {
        val pL = paddingLeft
        val pT = paddingTop
        val marginLeft = child.marginLeft
        val marginTop = child.marginTop
        val marginRight = child.marginRight
        val marginBottom = child.marginBottom
        val childWidth = child.measuredWidth
        val childHeight = child.measuredHeight
        val (dLeft, dTop) = when (dSide) {
            DrawerPlacement.LEFT -> (pL - childWidth + pHeight + marginLeft) to (pT + marginTop)
            DrawerPlacement.TOP -> (pL + marginLeft) to (pT - childHeight + pHeight + marginTop)
            DrawerPlacement.RIGHT -> (width - pHeight - marginRight - paddingRight) to (pT + marginTop)
            DrawerPlacement.BOTTOM -> (pL + marginLeft) to (height - pHeight - marginBottom - paddingBottom)
            null -> 0 to 0
        }
        val wasExpanded = isExpanded
        if (isExpanded) {
            forceCollapse()
        }
        child.layout(dLeft, dTop, dLeft + childWidth, dTop + childHeight)
        if (wasExpanded) {
            forceExpand()
        }
    }

    private fun moveChildrenByAxis(value: Float, axis: Axis) {
        if (!shouldToShiftContent) return
        when (axis) {
            Axis.X -> this@DrawerLayout.children.filter { it != drawerView }.forEach {
                it.translationX = value
            }

            Axis.Y -> this@DrawerLayout.children.filter { it != drawerView }.forEach {
                it.translationY = value
            }
        }
    }

    private fun animateDrawer(toExpand: Boolean, currentPos: Float = 0f) {
        drawerView ?: return
        val (from, to) = determineFromTo(toExpand, currentPos)
        if (animationEnabled) {
            drawerAnimation.setFloatValues(from, to)
            drawerAnimation.start()
        } else {
            when (dSide) {
                DrawerPlacement.LEFT, DrawerPlacement.RIGHT -> {
                    drawerView?.translationX = to
                    moveChildrenByAxis(to, Axis.X)
                }

                DrawerPlacement.TOP, DrawerPlacement.BOTTOM -> {
                    drawerView?.translationY = to
                    moveChildrenByAxis(to, Axis.Y)
                }

                null -> {}
            }
        }
    }

    private fun setupFocusListener() {
        if (_focusDepended) {
            if (focusListener == null) {
                focusListener = ViewTreeObserver.OnGlobalFocusChangeListener { _, _ ->
                    val drawer = drawerView ?: return@OnGlobalFocusChangeListener
                    if (drawer.hasFocus()) {
                        expand()
                    } else {
                        collapse()
                    }
                }
                viewTreeObserver?.addOnGlobalFocusChangeListener(focusListener)
            }
        } else {
            focusListener?.let {
                viewTreeObserver?.removeOnGlobalFocusChangeListener(it)
                focusListener = null
            }
        }
    }

    private fun calculateStartOffset(): Float {
        return if (isExpanded) {
            calculateExpandedPos()
        } else {
            0f
        }
    }

    private fun determineFromTo(toExpand: Boolean, currentPos: Float = 0f): Pair<Float, Float> {
        val collapsedPos = 0f
        val expandedPos = calculateExpandedPos()
        return if (toExpand) {
            currentPos to expandedPos
        } else {
            if (currentPos == 0f) {
                expandedPos to collapsedPos
            } else {
                currentPos to collapsedPos
            }
        }
    }

    private fun calculateDrawerSize() = when (dSide) {
        DrawerPlacement.LEFT, DrawerPlacement.RIGHT -> drawerView?.width?.toFloat() ?: 0f
        DrawerPlacement.TOP, DrawerPlacement.BOTTOM -> drawerView?.height?.toFloat() ?: 0f
        null -> 0f
    }

    private fun calculateExpandedPos(): Float {
        val dSize = calculateDrawerSize()
        return when (dSide) {
            DrawerPlacement.LEFT, DrawerPlacement.TOP -> dSize - pHeight
            DrawerPlacement.RIGHT, DrawerPlacement.BOTTOM -> pHeight - dSize
            null -> 0f
        }
    }

    private fun expandWithPosition(position: Float = 0f) {
        if (isExpanded) return
        if (canOpen) {
            animateDrawer(true, position)
            if (enableOverlay) overlay.visibility = VISIBLE
            expanded = true
        }
    }

    private fun collapseWithPosition(position: Float = 0f) {
        if (!isExpanded) return
        if (canClose) {
            animateDrawer(false, position)
            overlay.visibility = INVISIBLE
            expanded = false
        }
    }

    private fun updateLayoutParams() {
        drawerView ?: return
        val lp = when (dSide) {
            DrawerPlacement.TOP, DrawerPlacement.BOTTOM -> {
                DrawerLayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                )
            }

            else -> {
                DrawerLayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                )
            }
        }
        lp.drawerPlacement = dSide
        drawerView?.layoutParams = lp
    }

    private fun forceCollapse() {
        val tempAnimation = animationEnabled
        val tempCanClose = canClose
        animationEnabled = false
        canClose = true
        collapse()
        animationEnabled = tempAnimation
        canClose = tempCanClose
    }

    private fun forceExpand() {
        val tempAnimation = animationEnabled
        val tempCanOpen = canOpen
        animationEnabled = false
        canOpen = true
        expand()
        animationEnabled = tempAnimation
        canOpen = tempCanOpen
    }

    private fun resolveDragOpen(dx: Float, dy: Float) {
        if (isOpening(dx, dy) && canOpen) {
            followFinger(dx, dy)
        }
    }

    private fun resolveDragClose(dx: Float, dy: Float) {
        if (!isOpening(dx, dy) && canClose) {
            followFinger(dx, dy)
        }
    }

    private enum class Axis {
        X, Y
    }
}
