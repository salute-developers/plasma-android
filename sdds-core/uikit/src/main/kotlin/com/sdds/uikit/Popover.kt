package com.sdds.uikit

import android.content.Context
import android.graphics.Point
import android.graphics.Rect
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.widget.FrameLayout
import android.widget.PopupWindow
import androidx.core.content.withStyledAttributes
import androidx.core.view.WindowInsetsCompat
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.shape.CornerShape
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeHelper
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.setBackgroundValueList
import kotlin.math.max

/**
 * Всплывающее окно — появляется при наведении или клике на элемент,
 * используется для отображения одного контента поверх другого.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 19.05.2025
 */
open class Popover @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_popoverStyle,
    defStyleRes: Int = R.style.Sdds_Components_Popover,
) : PopupWindow(context, attrs, defStyleAttr, defStyleRes), Shapeable, ColorStateHolder {

    private val _content: PopoverContainer = PopoverContainer(context, attrs, defStyleAttr, defStyleRes)
    private var _offset: Int = 0
    private var _backgroundList: ColorValueStateList? = null
    private val _timeoutHandler: Handler = Handler(Looper.getMainLooper())
    private val _timeoutDismissAction: Runnable = Runnable { dismiss() }

    override val shape: ShapeModel?
        get() = _content.shape

    override var colorState: ColorState?
        get() = _content.colorState
        set(value) {
            _content.colorState = value
        }

    init {
        context.withStyledAttributes(attrs, R.styleable.Popover, defStyleAttr, defStyleRes) {
            _offset = getDimensionPixelOffset(R.styleable.Popover_sd_offset, 0)
            _backgroundList = getColorValueStateList(context, R.styleable.Popover_sd_background)
            _content.setBackgroundValueList(_backgroundList)
        }
        isClippingEnabled = false
    }

    override fun setContentView(contentView: View?) {
        if (contentView != null) {
            contentView.minimumWidth = _content.minimumWidth
            _content.addView(contentView)
            super.setContentView(_content.wrapWithShadows())
        } else {
            super.setContentView(null)
        }
    }

    /**
     * Отображает [Popover] рядом с [trigger], учитывая [placement] и [alignment]
     * @param trigger [View] рядом с которым располагается [Popover]
     * @param placement расположение [Popover] относительно [trigger]
     * @param placementMode указывает поведение [Popover] у границ экрана.
     * @param alignment выравнивание [Popover] относительно [trigger]
     * @param tailEnabled Если `true`, хвост будет показан
     * @param triggerCentered Если `true`, хвост всегда будет расположен в центре [trigger]
     * @param duration время отображения [Popover] в миллисекундах
     */
    fun showWithTrigger(
        trigger: View,
        placement: Int = PLACEMENT_TOP,
        placementMode: Int = PLACEMENT_MODE_LOOSE,
        alignment: Int = ALIGNMENT_START,
        tailEnabled: Boolean = true,
        triggerCentered: Boolean = false,
        duration: Long? = null,
    ) {
        trigger.post {
            val initialLocation =
                getLocation(
                    trigger = trigger,
                    placement = placement,
                    placementMode = placementMode,
                    alignment = alignment,
                    tailEnabled = tailEnabled,
                    triggerCentered = triggerCentered,
                )
            showAtLocation(trigger, Gravity.NO_GRAVITY, initialLocation.x, initialLocation.y)
        }

        // Автоматическое скрытие
        duration?.let {
            _timeoutHandler.removeCallbacks(_timeoutDismissAction)
            _timeoutHandler.postDelayed(_timeoutDismissAction, it)
        }
    }

    override fun dismiss() {
        super.dismiss()
        _timeoutHandler.removeCallbacks(_timeoutDismissAction)
    }

    private fun getLocation(
        trigger: View,
        placement: Int,
        placementMode: Int,
        alignment: Int,
        tailEnabled: Boolean,
        triggerCentered: Boolean,
    ): Point {
        val location = IntArray(2)
        trigger.getLocationOnScreen(location)
        val triggerRect = Rect(
            location[0],
            location[1],
            location[0] + trigger.width,
            location[1] + trigger.height,
        )

        _content.measure(
            View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
            View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
        )

        val shadowPaddings = _content.getShadowSafePaddings()
        val visibleDisplayFrame = getVisibleDisplayFrame(trigger)

        val popoverLocation = PopoverLocation(placement, alignment)
            .calculateLocation(triggerRect, triggerCentered)
            .run {
                if (placementMode == PLACEMENT_MODE_LOOSE) {
                    this.ensureEnoughSpace(visibleDisplayFrame, triggerRect, triggerCentered)
                } else {
                    this
                }
            }

        _content.updateLocation(popoverLocation.placement, popoverLocation.alignment, tailEnabled)
        return popoverLocation.bounds.let {
            Point(it.left - shadowPaddings.left, it.top - shadowPaddings.top)
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun PopoverLocation.ensureEnoughSpace(
        visibleDisplayFrame: Rect,
        triggerRect: Rect,
        triggerCentered: Boolean,
    ): PopoverLocation {
        val enoughTopSpace = triggerRect.top - bounds.height() >= visibleDisplayFrame.top
        val enoughBottomSpace = triggerRect.bottom + bounds.height() <= visibleDisplayFrame.bottom
        val enoughStartSpace = triggerRect.left - bounds.width() >= visibleDisplayFrame.left
        val enoughEndSpace = triggerRect.right + bounds.width() <= visibleDisplayFrame.right

        val safePlacement = when {
            placement == PLACEMENT_TOP && enoughTopSpace -> PLACEMENT_TOP
            placement == PLACEMENT_BOTTOM && enoughBottomSpace -> PLACEMENT_BOTTOM
            placement == PLACEMENT_START && enoughStartSpace -> PLACEMENT_START
            placement == PLACEMENT_END && enoughEndSpace -> PLACEMENT_END
            else -> getNextAvailablePlacementClockwise(
                placement,
                enoughTopSpace,
                enoughBottomSpace,
                enoughStartSpace,
                enoughEndSpace,
            )
        }

        val isHorizontalAlignment = safePlacement == PLACEMENT_TOP || safePlacement == PLACEMENT_BOTTOM
        val enoughAlignmentStartSpace = if (isHorizontalAlignment) {
            triggerRect.left + bounds.width() <= visibleDisplayFrame.right
        } else {
            triggerRect.top + bounds.height() <= visibleDisplayFrame.bottom
        }
        val enoughAlignmentEndSpace = if (isHorizontalAlignment) {
            triggerRect.right - bounds.width() >= visibleDisplayFrame.left
        } else {
            triggerRect.bottom - bounds.height() >= visibleDisplayFrame.top
        }

        val safeAlignment = when {
            alignment == ALIGNMENT_START && enoughAlignmentStartSpace -> ALIGNMENT_START
            alignment == ALIGNMENT_END && enoughAlignmentEndSpace -> ALIGNMENT_END
            alignment == ALIGNMENT_START -> ALIGNMENT_END
            alignment == ALIGNMENT_END -> ALIGNMENT_START
            else -> alignment
        }
        return copy(placement = safePlacement, alignment = safeAlignment)
            .calculateLocation(triggerRect, triggerCentered)
    }

    private fun PopoverLocation.calculateLocation(
        triggerRect: Rect,
        triggerCentered: Boolean,
    ): PopoverLocation {
        val tailCorrection = _content.getTailCorrectionPadding()
        val popupWidth = _content.measuredWidth
        val popupHeight = _content.measuredHeight
        var x = 0
        var y = 0

        when (placement) {
            PLACEMENT_TOP -> {
                y = triggerRect.top - popupHeight - _offset - tailCorrection
                x = triggerRect.left + _content.resolveAlignedPosition(
                    triggerRect.width(),
                    popupWidth,
                    alignment,
                    triggerCentered,
                )
            }

            PLACEMENT_BOTTOM -> {
                y = triggerRect.bottom + _offset + tailCorrection
                x = triggerRect.left + _content.resolveAlignedPosition(
                    triggerRect.width(),
                    popupWidth,
                    alignment,
                    triggerCentered,
                )
            }

            PLACEMENT_START -> {
                x = triggerRect.left - popupWidth - _offset - tailCorrection
                y = triggerRect.top + _content.resolveAlignedPosition(
                    triggerRect.height(),
                    popupHeight,
                    alignment,
                    triggerCentered,
                )
            }

            PLACEMENT_END -> {
                x = triggerRect.right + _offset + tailCorrection
                y = triggerRect.top + _content.resolveAlignedPosition(
                    triggerRect.height(),
                    popupHeight,
                    alignment,
                    triggerCentered,
                )
            }
        }
        return this.copy(bounds = Rect(x, y, x + popupWidth, y + popupHeight))
    }

    private fun getVisibleDisplayFrame(trigger: View): Rect {
        return Rect().apply {
            val insets = WindowInsetsCompat.toWindowInsetsCompat(trigger.rootWindowInsets)
                .getInsets(WindowInsetsCompat.Type.systemBars())
            _content.rootView.getWindowVisibleDisplayFrame(this)
            left += insets.left
            top += insets.top
            right -= insets.right
            bottom -= insets.bottom
        }
    }

    @Suppress("ClickableViewAccessibility")
    private fun PopoverContainer.wrapWithShadows(): ViewGroup {
        val shadowPaddings = getShadowSafePaddings()
        if (shadowPaddings.isZeroRect()) {
            return this
        }
        return FrameLayout(context).apply {
            val container = this@wrapWithShadows
            clipChildren = false
            clipToPadding = false
            setOnTouchListener { _, event ->
                val isEventOutsize = (event.x < 0) ||
                    (event.x >= container.width) ||
                    (event.y < 0) ||
                    (event.y >= container.height)
                if ((event.action == MotionEvent.ACTION_DOWN) && isEventOutsize) {
                    dismiss()
                    true
                } else if (event.action == MotionEvent.ACTION_OUTSIDE) {
                    dismiss()
                    true
                } else {
                    false
                }
            }
            addView(
                this@wrapWithShadows,
                MarginLayoutParams(MarginLayoutParams.WRAP_CONTENT, MarginLayoutParams.WRAP_CONTENT).apply {
                    setMargins(shadowPaddings.left, shadowPaddings.top, shadowPaddings.right, shadowPaddings.bottom)
                },
            )
        }
    }

    private data class PopoverLocation(
        val placement: Int,
        val alignment: Int,
        val bounds: Rect = Rect(),
    )

    private inner class PopoverContainer(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
        defStyleRes: Int = 0,
    ) : FrameLayout(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder, Shapeable {

        private val _shapeHelper: ShapeHelper = shapeHelper(attrs, defStyleAttr, defStyleRes)

        override val shape: ShapeModel?
            get() = _shapeHelper.shape

        override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
            set(value) {
                if (field != value) {
                    field = value
                    refreshDrawableState()
                }
            }

        fun getShadowSafePaddings(): Rect {
            val shadow = _shapeHelper.shadow ?: return Rect()
            val biggestLayer = shadow.layers.maxBy { it.spreadRadius }
            val radius = biggestLayer.spreadRadius + biggestLayer.blurRadius
            val left = radius - biggestLayer.offsetX
            val right = radius + biggestLayer.offsetX
            val top = radius - biggestLayer.offsetY
            val bottom = radius + biggestLayer.offsetY
            return Rect(
                max(0f, left).toInt(),
                max(0f, top).toInt(),
                max(0f, right).toInt(),
                max(0f, bottom).toInt(),
            )
        }

        fun getTailCorrectionPadding(): Int {
            return _shapeHelper.tail?.tailHeight?.toInt() ?: 0
        }

        fun resolveAlignedPosition(
            triggerSize: Int,
            popoverSize: Int,
            tailAlignment: Int,
            triggerCentered: Boolean,
        ): Int {
            val tailOffset = _shapeHelper.tail?.tailOffset?.toInt() ?: 0
            val tailSize = _shapeHelper.tail?.tailWidth?.toInt() ?: 0
            return when (tailAlignment) {
                ALIGNMENT_CENTER -> (triggerSize - popoverSize) / 2
                ALIGNMENT_END -> if (triggerCentered) {
                    triggerSize / 2 - popoverSize + tailOffset + tailSize / 2
                } else {
                    triggerSize - popoverSize
                }

                else -> if (triggerCentered) triggerSize / 2 - tailOffset - tailSize / 2 else 0
            }
        }

        fun updateLocation(placement: Int, alignment: Int, tailEnabled: Boolean) {
            val tailPlacement = if (tailEnabled) {
                when (placement) {
                    PLACEMENT_START -> CornerShape.TAIL_PLACEMENT_END
                    PLACEMENT_TOP -> CornerShape.TAIL_PLACEMENT_BOTTOM
                    PLACEMENT_END -> CornerShape.TAIL_PLACEMENT_START
                    PLACEMENT_BOTTOM -> CornerShape.TAIL_PLACEMENT_TOP
                    else -> CornerShape.TAIL_PLACEMENT_NONE
                }
            } else {
                CornerShape.TAIL_PLACEMENT_NONE
            }
            _shapeHelper.updateTailPlacement(tailPlacement, alignment)
        }

        override fun onCreateDrawableState(extraSpace: Int): IntArray {
            val drawableState = super.onCreateDrawableState(extraSpace + 1)
            if (colorState?.isDefined() == true) {
                mergeDrawableStates(drawableState, colorState?.attrs)
            }
            return drawableState
        }

        override fun drawableStateChanged() {
            super.drawableStateChanged()
            setBackgroundValueList(_backgroundList)
        }
    }

    companion object {

        /**
         * Расположение [Popover] вначале
         */
        const val PLACEMENT_START = 0

        /**
         * Расположение [Popover] сверху
         */
        const val PLACEMENT_TOP = 1

        /**
         * Расположение [Popover] вконце
         */
        const val PLACEMENT_END = 2

        /**
         * Расположение [Popover] снизу
         */
        const val PLACEMENT_BOTTOM = 3

        /**
         * Расположение [Popover] будет брать в расчет границы контейнера и не допускать перекрытия. В этом случае
         * положение Popover не всегда будет соответствовать параметрам placement и alignment
         */
        const val PLACEMENT_MODE_LOOSE = 0

        /**
         * Расположение [Popover] будет строго соответствовать параметрам placement и alignment. В этом случае
         * возможно перекрытие [Popover] границами экрана.
         */
        const val PLACEMENT_MODE_STRICT = 1

        /**
         * Выравнивание вначале тригера
         */
        const val ALIGNMENT_START = 0

        /**
         * Выравнивание по центру тригера
         */
        const val ALIGNMENT_CENTER = 1

        /**
         * Выравнивание вконце тригера
         */
        const val ALIGNMENT_END = 2

        // Карта "противоположных" placement'ов
        private val OppositePlacement = mapOf(
            PLACEMENT_TOP to PLACEMENT_BOTTOM,
            PLACEMENT_BOTTOM to PLACEMENT_TOP,
            PLACEMENT_START to PLACEMENT_END,
            PLACEMENT_END to PLACEMENT_START,
        )

        // Порядок по часовой стрелке
        private val ClockwisePlacement = listOf(
            PLACEMENT_TOP,
            PLACEMENT_END,
            PLACEMENT_BOTTOM,
            PLACEMENT_START,
        )

        private fun Rect.isZeroRect(): Boolean {
            return left == 0 && top == 0 && right == 0 && bottom == 0
        }

        private fun getNextAvailablePlacementClockwise(
            current: Int,
            enoughTopSpace: Boolean,
            enoughBottomSpace: Boolean,
            enoughStartSpace: Boolean,
            enoughEndSpace: Boolean,
        ): Int {
            val availability = mapOf(
                PLACEMENT_TOP to enoughTopSpace,
                PLACEMENT_END to enoughEndSpace,
                PLACEMENT_BOTTOM to enoughBottomSpace,
                PLACEMENT_START to enoughStartSpace,
            )

            val oppositePlacement = OppositePlacement[current]
            if (oppositePlacement != null && availability[oppositePlacement] == true) {
                return oppositePlacement
            }

            val startIndex = ClockwisePlacement.indexOf(current)
            for (i in 1 until ClockwisePlacement.size) {
                val next = ClockwisePlacement[(startIndex + i) % ClockwisePlacement.size]
                if (availability[next] == true) return next
            }
            return current
        }
    }
}
