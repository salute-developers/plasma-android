package com.sdds.uikit.internal.scrollable

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.VelocityTracker
import android.view.ViewConfiguration
import android.view.ViewGroup
import com.sdds.uikit.fs.FocusSelectorSettings
import com.sdds.uikit.internal.base.SelectorOutlineProvider
import com.sdds.uikit.shape.ShapeModel
import java.lang.ref.WeakReference

internal class ScrollableDelegate(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) {

    private val _selectorSettings = FocusSelectorSettings.fromAttrs(context, attrs, defStyleAttr, defStyleRes)

    private enum class ScrollState { IDLE, SCROLLED, FLING }

    private var scrollState: ScrollState = ScrollState.IDLE
    private var isTouching: Boolean = false
    private var velocityTracker: VelocityTracker? = null
    private val minFlingVelocity: Int = ViewConfiguration.get(context).scaledMinimumFlingVelocity

    private var lastScrollX: Int = 0
    private var lastScrollY: Int = 0

    private var hostRef: WeakReference<ViewGroup>? = null

    private val idleCheck = Runnable {
        val host = hostRef?.get() ?: return@Runnable
        val isScrollSame = lastScrollX == host.scrollX && lastScrollY == host.scrollY
        if (!isTouching && isScrollSame && scrollState != ScrollState.IDLE) {
            setScrollState(ScrollState.IDLE)
        }
    }

    fun init(view: ViewGroup, shape: ShapeModel?) {
        hostRef = WeakReference(view)
        resetOutline(view, shape)
        lastScrollX = view.scrollX
        lastScrollY = view.scrollY
    }

    fun destroy() {
        hostRef?.get()?.removeCallbacks(idleCheck)
        velocityTracker?.recycle()
        velocityTracker = null
        hostRef = null
    }

    fun onTouchEvent(ev: MotionEvent) {
        when (ev.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                if (velocityTracker == null) velocityTracker = VelocityTracker.obtain()
                velocityTracker?.clear()
                velocityTracker?.addMovement(ev)
                isTouching = true
                hostRef?.get()?.removeCallbacks(idleCheck)
            }
            MotionEvent.ACTION_MOVE -> {
                velocityTracker?.addMovement(ev)
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                velocityTracker?.addMovement(ev)
                velocityTracker?.computeCurrentVelocity(1000)
                val vx = kotlin.math.abs(velocityTracker?.xVelocity ?: 0f)
                val vy = kotlin.math.abs(velocityTracker?.yVelocity ?: 0f)
                isTouching = false
                val host = hostRef?.get()
                if (host != null) {
                    if (vx >= minFlingVelocity || vy >= minFlingVelocity) {
                        setScrollState(ScrollState.FLING)
                    }
                    host.removeCallbacks(idleCheck)
                    host.post(idleCheck)
                }
                velocityTracker?.recycle()
                velocityTracker = null
            }
        }
    }

    fun onScrollChanged(l: Int, t: Int, oldl: Int, oldt: Int) {
        val view = hostRef?.get() ?: return
        val scrollChanged = scrollState != ScrollState.SCROLLED && (l != oldl || t != oldt)
        if (isTouching && scrollChanged) {
            setScrollState(ScrollState.SCROLLED)
        }

        lastScrollX = l
        lastScrollY = t
        view.removeCallbacks(idleCheck)
        view.postDelayed(idleCheck, 64)
    }

    fun resetOutline(view: ViewGroup, shape: ShapeModel? = null) {
        view.outlineProvider = SelectorOutlineProvider(_selectorSettings, shape)
    }

    fun updateOutlineOnScroll() = hostRef?.get()?.run {
        if (!shouldExtendOutline()) return@run
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

    private fun setScrollState(newState: ScrollState) {
        if (scrollState != newState) {
            scrollState = newState
            updateOutlineOnScroll()
        }
    }

    private fun ViewGroup.shouldExtendOutline(): Boolean {
        return hasFocus() && !isFocused
    }

    private fun ViewGroup.shouldExtendTopOutline(): Boolean {
        return shouldExtendOutline() && isFocusedChildNearEdge(EDGE.TOP)
    }

    private fun ViewGroup.shouldExtendBottomOutline(): Boolean {
        return shouldExtendOutline() && isFocusedChildNearEdge(EDGE.BOTTOM)
    }

    private fun ViewGroup.shouldExtendLeftOutline(): Boolean {
        return shouldExtendOutline() && isFocusedChildNearEdge(EDGE.LEFT)
    }

    private fun ViewGroup.shouldExtendRightOutline(): Boolean {
        return shouldExtendOutline() && isFocusedChildNearEdge(EDGE.RIGHT)
    }

    /**
     * Проверяет, находится ли сфокусированный дочерний элемент близко к указанной стороне (edge) с учетом threshold.
     */
    private fun ViewGroup.isFocusedChildNearEdge(edge: EDGE, threshold: Int = 0): Boolean {
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
}
