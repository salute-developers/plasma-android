package com.sdds.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.marginLeft
import androidx.core.view.marginTop
import androidx.core.view.updateMargins
import com.sdds.uikit.shape.ShapeModel

open class Drawer @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int = R.attr.sd_drawerStyle,
    defStyleRes: Int = R.style.Sdds_Components_Drawer,
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    private var headerView: View? = null
    private var bodyView: View? = null
    private var footerView: View? = null
    private var _dOffset: Int = 20.dp
    private var _dMargin: Int = 2.dp
    private var _dShapeModel: ShapeModel = ShapeModel()
    private var _dSide: DrawerPlacement = DrawerPlacement.LEFT
    private var _dExpanded: Boolean = false
    private var _shiftContent: Boolean = false
    private var _focusDepended: Boolean = false

//    private val drawerView: LinearLayout = LinearLayout(context).apply {
//        orientation = VERTICAL
//        layoutParams = LayoutParams(
//            LayoutParams.WRAP_CONTENT,
//            LayoutParams.MATCH_PARENT
//        ).apply { gravity = Gravity.START }
//    }

    private var drawerView: View? = null

    private val drawerAnimation: ValueAnimator by lazy {
        ValueAnimator().apply {
            setDuration(200)
            addUpdateListener { animator ->
                val value = animator.animatedValue as Float
                when (_dSide) {
                    DrawerPlacement.LEFT, DrawerPlacement.RIGHT -> {
                        drawerView?.translationX = value
                        moveChildrenByAxis(value, Axis.X)
                    }

                    DrawerPlacement.TOP, DrawerPlacement.BOTTOM -> {
                        drawerView?.translationY = value
                        moveChildrenByAxis(value, Axis.Y)
                    }
                }
                invalidate()
            }
        }
    }

    /**
     * Определяет должен ли сдвигаться контент на экране,
     * когда [Drawer] выезжает
     */
    open var shouldToShiftContent: Boolean
        get() = _shiftContent
        set(value) {
            if (_shiftContent != value) {
                _shiftContent = value
                requestLayout()
            }
        }

    /**
     * Определяет начальное положение [Drawer]
     * @see DrawerPlacement
     */
    open var drawerPlacement: DrawerPlacement
        get() = _dSide
        set(value) {
            if (_dSide != value) {
                _dSide = value
                requestLayout()
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

    init {
        context.withStyledAttributes(attrs, R.styleable.Drawer, defStyleAttr, defStyleRes) {
            val side = getInt(R.styleable.Drawer_sd_drawerPlacement, 0)
            _dSide = DrawerPlacement.values().getOrElse(side) { DrawerPlacement.LEFT }
            _focusDepended = getBoolean(R.styleable.Drawer_sd_focusDepended, false)
            _shiftContent = getBoolean(R.styleable.Drawer_sd_shiftContent, false)
        }
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
     * @param animated включение анимации при открытии
     */
    open fun expand(animated: Boolean = true) {
        if (_dExpanded) return
        _dExpanded = true
        animateDrawer(true, animated)
    }

    /**
     * Скрывает [Drawer]
     * @param animated включение анимации при закрытии
     */
    open fun collapse(animated: Boolean = true) {
        if (!_dExpanded) return
        _dExpanded = false
        animateDrawer(false, animated)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        for (i in 0 until childCount) {
            val child = getChildAt(i)
            val lp = child.layoutParams as? LayoutParams
            if (lp?.gravity == Gravity.START) {
                drawerView = child
            }
            }
        children.filter { it != drawerView }.forEach { child ->
            val lp = (child.layoutParams as? MarginLayoutParams) ?: return@forEach
            when (_dSide) {
                DrawerPlacement.LEFT -> lp.updateMargins(left = _dOffset + _dMargin)
                DrawerPlacement.TOP -> lp.updateMargins(top = _dOffset + _dMargin)
                DrawerPlacement.RIGHT -> lp.updateMargins(right = _dOffset + _dMargin)
                DrawerPlacement.BOTTOM -> lp.updateMargins(bottom = _dOffset + _dMargin)
            }
            child.layoutParams = lp
        }
        setupFocusListener()
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        for (i in 0 until childCount) {
            val child = getChildAt(i)
            val childWidth = child.measuredWidth
            val childHeight = child.measuredHeight
            val marginLeft = child.marginLeft + paddingLeft
            val marginTop = child.marginTop + paddingTop

            if (child == drawerView) {
                var dLeft = 0
                var dTop = 0
                when (_dSide) {
                    DrawerPlacement.LEFT -> {
                        dLeft = -childWidth + _dOffset + marginLeft
                        dTop = marginTop
                    }

                    DrawerPlacement.TOP -> {
                        dLeft = width - _dOffset - childWidth + marginLeft
                        dTop = marginTop
                    }

                    DrawerPlacement.RIGHT -> {
                        dLeft = marginLeft
                        dTop = -childHeight + _dOffset + marginTop
                    }

                    DrawerPlacement.BOTTOM -> {
                        dLeft = marginLeft
                        dTop = height - _dOffset - childHeight + marginTop
                    }
                }
                child.layout(dLeft, dTop, dLeft + childWidth, dTop + childHeight)
            } else {
                child.layout(marginLeft, marginTop, marginLeft + childWidth, marginTop + childHeight)
            }
        }
    }

    private fun moveChildrenByAxis(value: Float, axis: Axis) {
        if (shouldToShiftContent) {
            when (axis) {
                Axis.X -> this@Drawer.children.filter { it != drawerView }.forEach {
                    it.translationX = value
                }

                Axis.Y -> this@Drawer.children.filter { it != drawerView }.forEach {
                    it.translationY = value
                }
            }
        }
    }

    private fun animateDrawer(toExpand: Boolean, animated: Boolean) {
        val (from, to) = determineFromTo(toExpand)
        if (animated) {
            drawerAnimation.setFloatValues(from, to)
            drawerAnimation.start()
        } else {
            when (_dSide) {
                DrawerPlacement.LEFT, DrawerPlacement.RIGHT -> {
                    drawerView?.translationX = to
                    moveChildrenByAxis(to, Axis.X)
                }

                DrawerPlacement.TOP, DrawerPlacement.BOTTOM -> {
                    drawerView?.translationY = to
                    moveChildrenByAxis(to, Axis.Y)
                }
            }
        }
    }

    private fun setupFocusListener() {
        if (_focusDepended) {
            viewTreeObserver?.addOnGlobalFocusChangeListener { _, _ ->
                val drawer = drawerView ?: return@addOnGlobalFocusChangeListener
                if (drawer.hasFocus()) {
                    expand()
                } else {
                    collapse()
                }
            }
        }
    }

    private fun determineFromTo(toExpand: Boolean): Pair<Float, Float> {
        val dSize = if (_dSide == DrawerPlacement.LEFT || _dSide == DrawerPlacement.RIGHT) {
            drawerView?.width?.toFloat()
        } else {
            drawerView?.height?.toFloat()
        }
        val collapsedPos = 0f
        val expandedPos = when (_dSide) {
            DrawerPlacement.LEFT, DrawerPlacement.RIGHT -> (dSize ?: 0f) - _dOffset
            DrawerPlacement.TOP, DrawerPlacement.BOTTOM -> -((dSize ?: 0f) - _dOffset)
        }
        return if (toExpand) {
            collapsedPos to expandedPos
        } else {
            expandedPos to collapsedPos
        }
    }

    private enum class Axis {
        X, Y
    }
}
