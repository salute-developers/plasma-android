package com.sdds.uikit

import android.content.Context
import android.graphics.Point
import android.graphics.Rect
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.util.Size
import android.view.Choreographer
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.View.MeasureSpec
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import android.view.ViewTreeObserver.OnScrollChangedListener
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.core.content.withStyledAttributes
import androidx.core.view.ViewCompat
import androidx.core.view.allViews
import androidx.core.view.children
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.fs.FocusSelectorSettings
import com.sdds.uikit.internal.base.SelectorOutlineProvider
import com.sdds.uikit.internal.base.getScreenRect
import com.sdds.uikit.internal.base.getVisibleDisplayFrame
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.internal.focusselector.ScaleAnimationListener
import com.sdds.uikit.internal.focusselector.doOnScaleAnimation
import com.sdds.uikit.shape.CornerShape
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeHelper
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.setBackgroundValueList
import java.lang.ref.WeakReference
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
    private var _scaleAnimationListener: ScaleAnimationListener? = null
    private var _scrollChangedListener: OnScrollChangedListener? = null
    private var _triggerRef: WeakReference<View>? = null
    private var _currentLocation: PopoverLocation = PopoverLocation()
    private var _choreographer: Choreographer = Choreographer.getInstance()
    private var _contentWidth: Int = -1
    private var _contentHeight: Int = -1
    private var _isContentInRemeasuring: Boolean = false

    override val shape: ShapeModel?
        get() = _content.shape

    override var colorState: ColorState?
        get() = _content.colorState
        set(value) {
            _content.colorState = value
        }

    /**
     * Максимальная ширина [Popover]
     */
    var maxWidth: Int = -1

    /**
     * Максимальная высота [Popover]
     */
    var maxHeight: Int = -1

    /**
     * Минимальная ширина [Popover]
     */
    var minWidth: Int
        get() = _content.minimumWidth
        set(value) {
            _content.minimumWidth = value
        }

    /**
     * Минимальная высота [Popover]
     */
    var minHeight: Int
        get() = _content.minimumHeight
        set(value) {
            _content.minimumHeight = value
        }

    /**
     * Смещение относительно якоря
     */
    var offset: Int
        get() = _offset
        set(value) {
            if (_offset != value) {
                _offset = value
                updateLocationPoint()
            }
        }

    /**
     * Ограничивать ли ширину [Popover] по границам экрана
     */
    var clipWidth: Boolean = false

    /**
     * Ограничивать ли высоту [Popover] по границам экрана
     */
    var clipHeight: Boolean = false

    init {
        context.withStyledAttributes(attrs, R.styleable.Popover, defStyleAttr, defStyleRes) {
            _offset = getDimensionPixelOffset(R.styleable.Popover_sd_offset, 0)
            clipWidth = getBoolean(R.styleable.Popover_sd_clipWidth, false)
            clipHeight = getBoolean(R.styleable.Popover_sd_clipHeight, false)
            _backgroundList = getColorValueStateList(context, R.styleable.Popover_sd_background)
            _content.setBackgroundValueList(_backgroundList)
        }
        isClippingEnabled = false
    }

    override fun setContentView(contentView: View?) {
        if (contentView != null) {
            contentView.minimumWidth = _content.minimumWidth
            contentView.minimumHeight = _content.minimumHeight
            _content.addView(
                contentView,
                LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT),
            )
            super.setContentView(_content.wrapWithShadows())
        } else {
            super.setContentView(null)
        }
    }

    override fun setWidth(width: Int) = Unit

    override fun getWidth(): Int = _content.width

    override fun setHeight(height: Int) = Unit

    override fun getHeight(): Int = _content.height

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
    open fun showWithTrigger(
        trigger: View,
        placement: Int = PLACEMENT_TOP,
        placementMode: Int = PLACEMENT_MODE_LOOSE,
        alignment: Int = ALIGNMENT_START,
        tailEnabled: Boolean = true,
        triggerCentered: Boolean = false,
        duration: Long? = null,
    ) {
        _triggerRef = WeakReference(trigger)
        _currentLocation = PopoverLocation(
            placement = placement,
            alignment = alignment,
            tailEnabled = tailEnabled,
            triggerCentered = triggerCentered,
            placementMode = placementMode,
            visibleDisplayFrame = trigger.getVisibleDisplayFrame(),
            triggerRect = trigger.getScreenRect(),
        )
        _scaleAnimationListener = (trigger as? HasFocusSelector)
            ?.doOnScaleAnimation { _, _, _, _, _ -> updateLocationPoint() }
        _scrollChangedListener = OnScrollChangedListener {
            _choreographer.postFrameCallback {
                _currentLocation = _currentLocation.copy(triggerRect = trigger.getScreenRect())
                if (_currentLocation.isAnchorVisible()) {
                    updateLocationPoint()
                } else {
                    update(INITIAL_POSITION, INITIAL_POSITION, -1, -1)
                }
            }
        }
        trigger.viewTreeObserver.addOnScrollChangedListener(_scrollChangedListener)
        updateLocationPoint()

        contentView.allViews.forEach { it.forceLayout() }
        contentView.requestLayout()
        contentView.invalidate()
        _content.invalidateOutline()
        if (needConsiderIme()) {
            ViewCompat.setOnApplyWindowInsetsListener(_content) { v, insets ->
                updateLocationPoint()
                v.requestLayout()
                insets
            }
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
        _scaleAnimationListener?.let {
            (_triggerRef?.get() as? HasFocusSelector)
                ?.removeScaleAnimationListener(it)
        }
        _triggerRef?.get()?.viewTreeObserver?.removeOnScrollChangedListener(_scrollChangedListener)
        _scrollChangedListener = null
        _triggerRef = null
    }

    /**
     * Обновляет точку привязки [Popover]
     */
    fun updateLocationPoint() {
        val trigger = _triggerRef?.get() ?: return
        if (!isShowing) {
            // Делаем принудительное измерение контента, чтобы точнее расположить Popover при первом показе.
            _isContentInRemeasuring = true
            contentView.measure(
                MeasureSpec.makeMeasureSpec(_currentLocation.visibleDisplayFrame.width(), MeasureSpec.AT_MOST),
                MeasureSpec.makeMeasureSpec(_currentLocation.visibleDisplayFrame.height(), MeasureSpec.AT_MOST),
            )
            _isContentInRemeasuring = false
            val safePaddings = _content.getSafePaddings()
            contentView.setPadding(safePaddings.left, safePaddings.top, safePaddings.right, safePaddings.bottom)
        }
        val location = getLocationPoint()
        if (isShowing) {
            update(location.x, location.y, -1, -1)
        } else {
            showAtLocation(trigger, Gravity.NO_GRAVITY, location.x, location.y)
        }
        _content.updateTailPlacement()
    }

    private fun getLocationPoint(): Point {
        val trigger = _triggerRef?.get() ?: return Point(INITIAL_POSITION, INITIAL_POSITION)
        val safePaddings = _content.getSafePaddings()
        val rootRect = trigger.rootView.getScreenRect()
        val triggerRect = trigger.getScreenRect()
        val visibleDisplayFrame = trigger.getVisibleDisplayFrame()

        return _currentLocation.copy(triggerRect = triggerRect, visibleDisplayFrame = visibleDisplayFrame)
            .calculateLocation()
            .ensureEnoughSpace()
            .also { _currentLocation = it }
            .bounds.let {
                Point(
                    it.left - safePaddings.left - rootRect.left,
                    it.top - safePaddings.top - rootRect.top,
                )
            }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun PopoverLocation.ensureEnoughSpace(): PopoverLocation {
        if (placementMode == PLACEMENT_MODE_STRICT || bounds.isEmpty) return this
        val safePlacement = getSafePlacement()
        val safeAlignment = getSafeAlignment(safePlacement)
        return copy(placement = safePlacement, alignment = safeAlignment)
            .calculateLocation()
    }

    private fun PopoverLocation.calculateLocation(): PopoverLocation {
        val tailCorrection = _content.getTailCorrectionPadding(tailEnabled)
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

    private fun getMaxSize(): Size = _currentLocation.run {
        val safePaddings = _content.getSafePaddings()
        val fullWidth = maxWidth.takeIf { it > 0 }
            ?: (visibleDisplayFrame.width() - (safePaddings.left + safePaddings.right))
        val fullHeight = maxHeight.takeIf { it > 0 }
            ?: (visibleDisplayFrame.height() - (safePaddings.top + safePaddings.bottom))

        val shouldClip = !_isContentInRemeasuring
        val maxHeight = if (clipHeight && shouldClip) {
            val maxVerticalSpace = when (placement) {
                PLACEMENT_TOP -> getTopSpace()
                PLACEMENT_BOTTOM -> getBottomSpace()
                else -> fullHeight
            }
            maxVerticalSpace.coerceAtMost(fullHeight)
        } else {
            fullHeight
        }

        val maxWidth = if (clipWidth && shouldClip) {
            val maxHorizontalSpace = when (placement) {
                PLACEMENT_START -> getStartSpace()
                PLACEMENT_END -> getEndSpace()
                else -> fullWidth
            }
            maxHorizontalSpace.coerceAtMost(fullWidth)
        } else {
            fullWidth
        }
        return Size(maxWidth, maxHeight)
    }

    private fun PopoverLocation.isAnchorVisible(): Boolean {
        val isVisibleHorizontally = triggerRect.right > visibleDisplayFrame.left &&
            triggerRect.left < visibleDisplayFrame.right
        val isVisibleVertically = triggerRect.bottom > visibleDisplayFrame.top &&
            triggerRect.top < visibleDisplayFrame.bottom
        return isVisibleHorizontally && isVisibleVertically
    }

    private fun needConsiderIme(): Boolean {
        return inputMethodMode != INPUT_METHOD_NOT_NEEDED
    }

    private fun PopoverLocation.getSafePlacement(
        width: Int = bounds.width(),
        height: Int = bounds.height(),
    ): Int {
        val enoughTopSpace = enoughTopSpace(height)
        val enoughBottomSpace = enoughBottomSpace(height)
        val enoughStartSpace = enoughStartSpace(width)
        val enoughEndSpace = enoughEndSpace(width)
        val noVerticalSpace = !enoughTopSpace && !enoughBottomSpace
        val noHorizontalSpace = !enoughStartSpace && !enoughEndSpace
        if (noVerticalSpace && noHorizontalSpace) {
            val spaces = mapOf(
                PLACEMENT_TOP to getTopSpace(),
                PLACEMENT_END to getEndSpace(),
                PLACEMENT_BOTTOM to getBottomSpace(),
                PLACEMENT_START to getStartSpace(),
            )
            return spaces.maxBy { it.value }.key
        }
        return when {
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
    }

    private fun PopoverLocation.getSafeAlignment(
        safePlacement: Int = placement,
    ): Int {
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

        val enoughAlignmentCenterSpace = if (isHorizontalAlignment) {
            val alignmentLeft = triggerRect.left + (triggerRect.width() - bounds.width()) / 2
            alignmentLeft >= visibleDisplayFrame.left && alignmentLeft + bounds.width() <= visibleDisplayFrame.right
        } else {
            val alignmentTop = triggerRect.top + (triggerRect.height() - bounds.height()) / 2
            alignmentTop >= visibleDisplayFrame.top && alignmentTop + bounds.height() <= visibleDisplayFrame.bottom
        }

        return when {
            alignment == ALIGNMENT_START && enoughAlignmentStartSpace -> ALIGNMENT_START
            alignment == ALIGNMENT_END && enoughAlignmentEndSpace -> ALIGNMENT_END
            alignment == ALIGNMENT_CENTER && enoughAlignmentCenterSpace -> ALIGNMENT_CENTER
            else -> getNextAvailableAlignment(
                alignment,
                enoughAlignmentStartSpace,
                enoughAlignmentCenterSpace,
                enoughAlignmentEndSpace,
            )
        }
    }

    @Suppress("ClickableViewAccessibility")
    private fun PopoverContainer.wrapWithShadows(): ViewGroup {
        return ShadowContainer(context).apply {
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
                MarginLayoutParams(MarginLayoutParams.MATCH_PARENT, MarginLayoutParams.MATCH_PARENT),
            )
        }
    }

    private data class PopoverLocation(
        val placement: Int = PLACEMENT_TOP,
        val alignment: Int = ALIGNMENT_START,
        val tailEnabled: Boolean = true,
        val triggerCentered: Boolean = false,
        val placementMode: Int = PLACEMENT_MODE_LOOSE,
        val bounds: Rect = Rect(),
        val visibleDisplayFrame: Rect = Rect(),
        val triggerRect: Rect = Rect(),
    )

    private fun PopoverLocation.getTopSpace() = triggerRect.top - _offset - visibleDisplayFrame.top

    private fun PopoverLocation.getBottomSpace() = visibleDisplayFrame.bottom - triggerRect.bottom - _offset

    private fun PopoverLocation.getStartSpace() = triggerRect.left - _offset - visibleDisplayFrame.left

    private fun PopoverLocation.getEndSpace() = visibleDisplayFrame.right - triggerRect.right - _offset

    private fun PopoverLocation.enoughTopSpace(height: Int = bounds.height()) = getTopSpace() >= height

    private fun PopoverLocation.enoughBottomSpace(height: Int = bounds.height()) = getBottomSpace() >= height

    private fun PopoverLocation.enoughStartSpace(width: Int = bounds.width()) = getStartSpace() >= width

    private fun PopoverLocation.enoughEndSpace(width: Int = bounds.width()) = getEndSpace() >= width

    private inner class ShadowContainer(context: Context) : LinearLayout(context)

    private inner class PopoverContainer(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
        defStyleRes: Int = 0,
    ) : LinearLayout(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder, Shapeable {

        private val _shapeHelper: ShapeHelper = shapeHelper(attrs, defStyleAttr, defStyleRes)
        private val _selectorOutlineProvider = SelectorOutlineProvider(
            FocusSelectorSettings.fromAttrs(context, attrs, defStyleAttr, defStyleRes),
        ).apply {
            extendStart = true
            extendEnd = true
            extendTop = true
            extendBottom = true
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
            isFocusable = false
            outlineProvider = _selectorOutlineProvider
        }

        override fun setMinimumWidth(minWidth: Int) {
            super.setMinimumWidth(minWidth)
            children.forEach { it.minimumWidth = minWidth }
        }

        override fun setMinimumHeight(minHeight: Int) {
            super.setMinimumHeight(minHeight)
            children.forEach { it.minimumHeight = minHeight }
        }

        fun getSafePaddings(): Rect {
            val shadowPaddings = getShadowPaddings()
            val selectorPaddings = _selectorOutlineProvider.getExtensionRect(measuredWidth, measuredHeight)
            return Rect(
                max(shadowPaddings.left, selectorPaddings.left),
                max(shadowPaddings.top, selectorPaddings.top),
                max(shadowPaddings.right, selectorPaddings.right),
                max(shadowPaddings.bottom, selectorPaddings.bottom),
            )
        }

        fun getTailCorrectionPadding(tailEnabled: Boolean): Int {
            return _shapeHelper.tail?.tailHeight.takeIf { tailEnabled }?.toInt() ?: 0
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

        fun updateTailPlacement() {
            val tailPlacement = if (_currentLocation.tailEnabled) {
                when (_currentLocation.placement) {
                    PLACEMENT_START -> CornerShape.TAIL_PLACEMENT_END
                    PLACEMENT_TOP -> CornerShape.TAIL_PLACEMENT_BOTTOM
                    PLACEMENT_END -> CornerShape.TAIL_PLACEMENT_START
                    PLACEMENT_BOTTOM -> CornerShape.TAIL_PLACEMENT_TOP
                    else -> CornerShape.TAIL_PLACEMENT_NONE
                }
            } else {
                CornerShape.TAIL_PLACEMENT_NONE
            }
            _shapeHelper.updateTailPlacement(tailPlacement, _currentLocation.alignment)
        }

        override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
            val maxSize = getMaxSize()
            super.onMeasure(
                MeasureSpec.makeMeasureSpec(maxSize.width, MeasureSpec.AT_MOST),
                MeasureSpec.makeMeasureSpec(maxSize.height, MeasureSpec.AT_MOST),
            )
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

        private fun getShadowPaddings(): Rect {
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

        // Порядок по часовой стрелке
        private val ClockwiseAlignment = listOf(
            ALIGNMENT_START,
            ALIGNMENT_CENTER,
            ALIGNMENT_END,
        )

        /**
         * До показа Popover невозможно корректно рассчитать его позицию, так как контент еще не прошел фазу measure,
         * поэтому делаем начальную позицию где-то далеко за границами экрана, а потом обновляем на реальную позицию
         */
        private const val INITIAL_POSITION = -Int.MAX_VALUE

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

        private fun getNextAvailableAlignment(
            current: Int,
            enoughStartSpace: Boolean,
            enoughCenterSpace: Boolean,
            enoughEndSpace: Boolean,
        ): Int {
            val availability = mapOf(
                ALIGNMENT_START to enoughStartSpace,
                ALIGNMENT_CENTER to enoughCenterSpace,
                ALIGNMENT_END to enoughEndSpace,
            )

            val startIndex = ClockwiseAlignment.indexOf(current)
            for (i in 1 until ClockwiseAlignment.size) {
                val next = ClockwiseAlignment[(startIndex + i) % ClockwiseAlignment.size]
                if (availability[next] == true) return next
            }
            return current
        }
    }
}

/**
 * Устанавливает для [Popover] фиксированную ширину [width]
 */
fun Popover.setFixedWidth(width: Int) {
    minWidth = width
    maxWidth = width
}

/**
 * Устанавливает для [Popover] фиксированную высоту [height]
 */
fun Popover.setFixedHeight(height: Int) {
    minHeight = height
    maxHeight = height
}
