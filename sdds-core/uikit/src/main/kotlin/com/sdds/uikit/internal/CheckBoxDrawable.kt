package com.sdds.uikit.internal

import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PathMeasure
import android.graphics.PixelFormat
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.Rect
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.animation.LinearInterpolator
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.CheckBox
import com.sdds.uikit.R
import com.sdds.uikit.dp
import com.sdds.uikit.internal.base.AnimationUtils.lerp
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.statelist.NumberStateList
import com.sdds.uikit.statelist.getFloatForState
import com.sdds.uikit.statelist.getNumberStateList
import kotlin.math.roundToInt

/**
 * [Drawable] для [CheckBox]
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 04.06.2024
 */
internal class CheckBoxDrawable(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
) : Drawable(), Animatable {

    private val _checkPath: Path = Path()
    private val _pathMeasure: PathMeasure = PathMeasure()
    private val _pathToDraw: Path = Path()
    private val _paint: Paint = Paint().configure(isAntiAlias = true)
    private val animatorSet = AnimatorSet()
    private val checkDrawAnimation by unsafeLazy {
        ValueAnimator().apply {
            duration = ANIMATION_DURATION
            interpolator = LinearInterpolator()
            addUpdateListener {
                _checkDrawFraction = it.animatedValue as Float
                invalidateSelf()
            }
        }
    }

    private val checkGravityAnimation by unsafeLazy {
        ValueAnimator().apply {
            duration = ANIMATION_DURATION
            interpolator = LinearInterpolator()
            addUpdateListener {
                _checkCenterGravitationShiftFraction = it.animatedValue as Float
                invalidateSelf()
            }
        }
    }
    private val _checked: Boolean get() = _toggleableState != CheckBox.ToggleableState.OFF
    private var _focused: Boolean = false
    private var _toggleableState: CheckBox.ToggleableState = CheckBox.ToggleableState.OFF

    private var _borderTintList: ColorStateList = DefaultBlackTint
    private var _boxTintList: ColorStateList = DefaultBlackTint
    private var _checkMarkTintList: ColorStateList = DefaultWhiteTint

    private var _checkMarkIcon: Drawable? = null
    private var _checkMarkIconTintList: ColorStateList = DefaultWhiteTint
    private var _indeterminateMarkIcon: Drawable? = null
    private var _indeterminateMarkIconTintList: ColorStateList = DefaultWhiteTint
    private var checkedMarkBounds = Rect()
    private var indeterminateMarkBounds = Rect()

    @Deprecated("Использовать shape")
    private var _cornerRadius: Float = FallBackRadius.toFloat()

    private var _checkDrawFraction: Float = 0f
    private var _checkCenterGravitationShiftFraction: Float = 0f
    private var _toggleWidth: Int = 0
    private var _toggleHeight: Int = 0
    private var _padding: Int = 0
    private var _focusBorderEnabled: Boolean = false

    private var _boxDrawable: ShapeDrawable? = null
    private var _borderDrawable: ShapeDrawable? = null
    private var _borderWidth: Float = 0f
    private var _borderOffset: Float = 0f

    private var _toggleBorderWidth: NumberStateList? = null
    private var _toggleBorderOffset: NumberStateList? = null
    private var _toggleIconWidth: NumberStateList? = null
    private var _toggleIconHeight: NumberStateList? = null

    init {
        obtainAttributes(context, attrs, defStyleAttr)
        animatorSet.playTogether(checkDrawAnimation, checkGravityAnimation)
        _boxDrawable = ShapeDrawable(context, attrs, defStyleAttr)
            .apply { callback = this@CheckBoxDrawable.callback }
        _borderDrawable = ShapeDrawable(context, attrs, defStyleAttr)
            .apply { callback = this@CheckBoxDrawable.callback }
    }

    /**
     * Отображается ли drawable в режиме Layout Editor
     */
    var isInEditMode: Boolean = false

    /**
     * Устанавливает ширину [CheckBoxDrawable]
     * @param width размер в px
     */
    fun setWidth(width: Int) {
        if (_toggleWidth != width) {
            _toggleWidth = width
        }
    }

    /**
     * Устанавливает высоту [CheckBoxDrawable]
     * @param height размер в px
     */
    fun setHeight(height: Int) {
        if (_toggleWidth != height) {
            _toggleWidth = height
        }
    }

    /**
     * Устанавливает радиус скруглений границы [CheckBoxDrawable]
     * @param cornerRadius радиус в px
     */
    fun setCornerRadius(cornerRadius: Float) {
        if (_cornerRadius != cornerRadius) {
            _cornerRadius = cornerRadius
        }
    }

    /**
     * Устанавливает цвета границы
     */
    fun setBorderTintList(borderTintList: ColorStateList? = null) {
        if (_borderTintList != borderTintList) {
            _borderTintList = borderTintList ?: DefaultBlackTint
            _borderDrawable?.setStrokeTint(borderTintList)
        }
    }

    /**
     * Устанавливает цвета заливки
     */
    fun setBoxTintList(boxTintLists: ColorStateList? = null) {
        if (_boxTintList != boxTintLists) {
            _boxTintList = boxTintLists ?: DefaultBlackTint
            _boxDrawable?.setTintList(boxTintLists)
        }
    }

    /**
     * Устанавливает цвета маркера
     */
    fun setCheckMarkTintList(checkMarkTintLists: ColorStateList? = null) {
        if (_checkMarkTintList != checkMarkTintLists) {
            _checkMarkTintList = checkMarkTintLists ?: DefaultWhiteTint
            setTintList(_checkMarkTintList)
        }
    }

    /**
     * Устанавливает цвета иконки маркера
     */
    fun setCheckMarkIconTintList(checkMarkIconTintLists: ColorStateList? = null) {
        if (_checkMarkIconTintList != checkMarkIconTintLists) {
            _checkMarkIconTintList = checkMarkIconTintLists ?: DefaultWhiteTint
        }
    }

    /**
     * Устанавливает цвета иконки маркера
     */
    fun setIndeterminateMarkIconTintList(indeterminateMarkIconTintLists: ColorStateList? = null) {
        if (_indeterminateMarkIconTintList != indeterminateMarkIconTintLists) {
            _indeterminateMarkIconTintList = indeterminateMarkIconTintLists ?: DefaultWhiteTint
        }
    }

    /**
     * [Drawable] для CheckedMark
     */
    var checkMarkIcon: Drawable?
        get() = _checkMarkIcon
        set(value) {
            if (_checkMarkIcon != value) {
                _checkMarkIcon = value
                invalidateSelf()
            }
        }

    /**
     * [Drawable] для IndeterminateMark
     */
    var indeterminateMarkIcon: Drawable?
        get() = _indeterminateMarkIcon
        set(value) {
            if (_indeterminateMarkIcon != value) {
                _indeterminateMarkIcon = value
                invalidateSelf()
            }
        }

    private fun Drawable?.safeWidth() =
        this?.intrinsicWidth ?: 0

    private fun Drawable?.safeHeight() =
        this?.intrinsicHeight ?: 0

    private fun updateIconBounds(icon: Drawable?, iconBounds: Rect) {
        if (icon != null) {
            val left = bounds.left + (bounds.width() - icon.safeWidth()) / 2
            val top = bounds.top + (bounds.height() - icon.safeHeight()) / 2
            iconBounds.set(
                left,
                top,
                left + icon.safeWidth(),
                top + icon.safeHeight(),
            )
            icon?.bounds = iconBounds
        } else {
            iconBounds.set(0, 0, 0, 0)
        }
    }

    override fun onBoundsChange(bounds: Rect) {
        updateBorderBounds()
        updateIconBounds(_checkMarkIcon, checkedMarkBounds)
        updateIconBounds(_indeterminateMarkIcon, indeterminateMarkBounds)
        super.onBoundsChange(bounds)
    }

    private fun updateBorderBounds() {
        val width = bounds.width().toFloat()
        val height = bounds.height().toFloat()
        val totalPadding = _borderOffset + _padding
        val checkedWidth = width - totalPadding * 2f
        val checkedHeight = height - totalPadding * 2f
        val targetWidth = if (_focused) width else checkedWidth
        val targetHeight = if (_focused) height else checkedHeight
        val left = (width - targetWidth) / 2f
        val top = (height - targetHeight) / 2f
        val right = left + targetWidth
        val bottom = top + targetHeight
        val adjustedBounds = Rect(
            left.roundToInt(),
            top.roundToInt(),
            right.roundToInt(),
            bottom.roundToInt()
        )
        Log.d("adjustedBounds", "${adjustedBounds}")
        _borderDrawable?.setStrokeWidth(_borderWidth)
        _borderDrawable?.bounds = adjustedBounds
        Log.d("borderBounds", "${_borderDrawable?.bounds}")
    }

    override fun draw(canvas: Canvas) {
        _borderDrawable?.draw(canvas)
        _boxDrawable?.draw(canvas)
//        canvas.withTranslation(
//            bounds.left.toFloat(),
//            bounds.top.toFloat(),
//        ) {
//            clipRect(bounds)
//            drawBox(
//                checked = _checked,
//                focused = _focused && _focusBorderEnabled,
//                boxColor = _boxTintList.getColorForState(state, _boxTintList.defaultColor),
//                borderColor = _borderTintList.getColorForState(state, _borderTintList.defaultColor),
//                radius = _cornerRadius,
//                strokeWidth = floor(if (_checked) CheckedStrokeWidth else StrokeWidth),
//            )
//            drawMark(
//                checkColor = _checkMarkTintList.getColorForState(
//                    state,
//                    _checkMarkTintList.defaultColor
//                ),
//                checkFraction = _checkDrawFraction,
//                crossCenterGravitation = _checkCenterGravitationShiftFraction,
//                strokeWidth = StrokeWidth,
//            )
//        }
        when (_toggleableState) {
            CheckBox.ToggleableState.OFF -> {}
            CheckBox.ToggleableState.ON -> _checkMarkIcon?.draw(canvas)
            CheckBox.ToggleableState.INDETERMINATE -> _indeterminateMarkIcon?.draw(canvas)
        }
    }

    override fun onStateChange(state: IntArray): Boolean {
        val focused = state.contains(android.R.attr.state_focused)
        val checked = state.contains(android.R.attr.state_checked)
        val indeterminate = state.contains(R.attr.sd_state_indeterminate)
        var changed = false
        if (_focused != focused) {
            _focused = focused
            changed = true
        }

        setToggleableState(
            when {
                indeterminate -> CheckBox.ToggleableState.INDETERMINATE
                checked -> CheckBox.ToggleableState.ON
                else -> CheckBox.ToggleableState.OFF
            },
        )
        _checkMarkIcon?.state = state
        _indeterminateMarkIcon?.state = state
        _borderDrawable?.state = state
        Log.d("_borderColorForState", "${_borderTintList.getColorForState(state, Color.BLUE)}")
        _boxDrawable?.state = state
        val needChangeBounds = setBorderWidth(state) || setBorderOffset(state)
        if (needChangeBounds) onBoundsChange(bounds)
        if (changed) {
            invalidateSelf()
            _boxDrawable?.invalidateSelf()
            _borderDrawable?.invalidateSelf()
        }
        return super.onStateChange(state) && changed
    }

    private fun setBorderWidth(state: IntArray): Boolean {
        val newWidth = _toggleBorderWidth?.getFloatForState(state) ?: 0f
        return if (_borderWidth != newWidth) {
            _borderWidth = newWidth
            true
        } else {
            false
        }
    }

    private fun setBorderOffset(state: IntArray): Boolean {
        val newOffset = _toggleBorderOffset?.getFloatForState(state) ?: 0f
        return if (_borderOffset != newOffset) {
            _borderOffset = newOffset
            true
        } else {
            false
        }
    }

    override fun isStateful(): Boolean = true

    override fun getIntrinsicWidth(): Int = _toggleWidth + (getFocusBorderPadding()) * 2

    override fun getIntrinsicHeight(): Int =
        _toggleHeight + (getFocusBorderPadding()) * 2

    override fun setAlpha(alpha: Int) {
        _paint.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) = Unit

    @Suppress("OVERRIDE_DEPRECATION")
    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun start() {
        if (isInEditMode) {
            jumpToCurrentState()
            invalidateSelf()
            return
        }
        if (!isRunning) {
            animatorSet.start()
        }
    }

    override fun stop() {
        if (animatorSet.isRunning) {
            animatorSet.cancel()
        }
    }

    override fun isRunning(): Boolean = animatorSet.isRunning

    override fun jumpToCurrentState() {
        super.jumpToCurrentState()
        _checkDrawFraction = _toggleableState.getDrawTargetValue()
        _checkCenterGravitationShiftFraction = _toggleableState.getGravityTargetValue()
    }

    private fun setToggleableState(toggleableState: CheckBox.ToggleableState) {
        if (_toggleableState != toggleableState) {
            val prev = _toggleableState
            _toggleableState = toggleableState
            resetAnimators(toggleableState, prev)
            start()
        }
    }

    private fun Canvas.drawBox(
        checked: Boolean,
        focused: Boolean,
        boxColor: Int,
        borderColor: Int,
        radius: Float,
        strokeWidth: Float,
    ) {
        _paint.xfermode = null
        val width = bounds.width()
        val height = bounds.height()

        val checkedWidth = width - (getFocusBorderPadding() + _padding) * 2f
        val checkedHeight = height - (getFocusBorderPadding() + _padding) * 2f
        val borderWidth = if (focused) width.toFloat() - strokeWidth else checkedWidth - strokeWidth
        val borderHeight =
            if (focused) height.toFloat() - strokeWidth else checkedHeight - strokeWidth

        val borderRadius = if (focused) radius + 2.dp else radius

        if ((checked && focused) || !checked) {
            val left = (width - borderWidth) / 2
            val top = (width - borderHeight) / 2
            drawRoundRect(
                left,
                top,
                left + borderWidth,
                top + borderHeight,
                borderRadius,
                borderRadius,
                _paint.configure(
                    style = Paint.Style.STROKE,
                    color = borderColor,
                    strokeWidth = strokeWidth
                ),
            )
        }

        if (checked) {
            val left = (width - checkedWidth) / 2
            val top = (height - checkedHeight) / 2
            drawRoundRect(
                left,
                top,
                left + checkedWidth,
                top + checkedHeight,
                radius,
                radius,
                _paint.configure(style = Paint.Style.FILL, color = boxColor),
            )
        }
    }

    private fun Canvas.drawMark(
        checkColor: Int,
        checkFraction: Float,
        crossCenterGravitation: Float,
        strokeWidth: Float,
    ) {
        _paint.xfermode = XfermodeAdd
        val width = intrinsicWidth - 2 * _padding
        // M0.3,0.5L0.46,0.625,L0.71,0.375
        val checkCrossX = 0.46f
        val checkCrossY = 0.625f
        val leftX = 0.3f
        val leftY = 0.5f
        val rightX = 0.71f
        val rightY = 0.375f

        val gravitatedCrossX = lerp(checkCrossX, 0.5f, crossCenterGravitation)
        val gravitatedCrossY = lerp(checkCrossY, 0.5f, crossCenterGravitation)
        val gravitatedLeftY = lerp(leftY, 0.5f, crossCenterGravitation)
        val gravitatedRightY = lerp(rightY, 0.5f, crossCenterGravitation)

        _checkPath.reset()
        _checkPath.moveTo(width * leftX, width * gravitatedLeftY)
        _checkPath.lineTo(width * gravitatedCrossX, width * gravitatedCrossY)
        _checkPath.lineTo(width * rightX, width * gravitatedRightY)
        _pathMeasure.setPath(_checkPath, false)
        _pathToDraw.reset()
        _pathMeasure.getSegment(0f, _pathMeasure.length * checkFraction, _pathToDraw, true)

        save()
        translate(_padding.toFloat(), _padding.toFloat())
        drawPath(
            _pathToDraw,
            _paint.configure(
                style = Paint.Style.STROKE,
                color = checkColor,
                strokeWidth = strokeWidth,
                strokeCap = Paint.Cap.ROUND,
            ),
        )
        restore()
    }

    private fun resetAnimators(
        newState: CheckBox.ToggleableState,
        prevState: CheckBox.ToggleableState
    ) {
        animatorSet.cancel()
        checkDrawAnimation.setFloatValues(
            prevState.getDrawTargetValue(),
            newState.getDrawTargetValue(),
        )
        checkGravityAnimation.setFloatValues(
            prevState.getGravityTargetValue(),
            newState.getGravityTargetValue(),
        )
        checkGravityAnimation.duration = when {
            prevState == CheckBox.ToggleableState.OFF -> 0L
            newState == CheckBox.ToggleableState.OFF -> 0L
            else -> ANIMATION_DURATION
        }
    }

    private fun CheckBox.ToggleableState.getDrawTargetValue(): Float =
        when (this) {
            CheckBox.ToggleableState.ON -> 1f
            CheckBox.ToggleableState.OFF -> 0f
            CheckBox.ToggleableState.INDETERMINATE -> 1f
        }

    private fun CheckBox.ToggleableState.getGravityTargetValue(): Float =
        when (this) {
            CheckBox.ToggleableState.ON -> 0f
            CheckBox.ToggleableState.OFF -> 0f
            CheckBox.ToggleableState.INDETERMINATE -> 1f
        }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        context.withStyledAttributes(attrs, R.styleable.SdCheckBoxDrawable, defStyleAttr, 0) {
            _toggleWidth = getDimensionPixelSize(
                R.styleable.SdCheckBoxDrawable_sd_toggleWidth,
                DefaultCheckBoxSize,
            )
            _toggleHeight = getDimensionPixelSize(
                R.styleable.SdCheckBoxDrawable_sd_toggleHeight,
                DefaultCheckBoxSize,
            )
            _padding = getDimensionPixelSize(
                R.styleable.SdCheckBoxDrawable_sd_buttonPadding,
                CheckBoxPadding,
            )
            _focusBorderEnabled =
                getBoolean(R.styleable.SdCheckBoxDrawable_sd_focusBorderEnabled, false)
            checkMarkIcon = getDrawable(R.styleable.SdCheckBoxDrawable_sd_checkedMarkIcon)
            indeterminateMarkIcon =
                getDrawable(R.styleable.SdCheckBoxDrawable_sd_indeterminateMarkIcon)
            _toggleBorderWidth =
                getNumberStateList(context, R.styleable.SdCheckBoxDrawable_sd_toggleBorderWidth)
            _toggleBorderOffset =
                getNumberStateList(context, R.styleable.SdCheckBoxDrawable_sd_toggleBorderOffset)
            _toggleIconWidth =
                getNumberStateList(context, R.styleable.SdCheckBoxDrawable_sd_toggleIconWidth)
            _toggleIconHeight =
                getNumberStateList(context, R.styleable.SdCheckBoxDrawable_sd_toggleIconHeight)
        }
    }

    private fun getFocusBorderPadding(): Int {
        return if (_focusBorderEnabled) FocusBorderPadding else 0
    }

    private companion object {
        const val ANIMATION_DURATION = 100L
        val FallBackRadius = 4.dp
        val DefaultBlackTint = ColorStateList.valueOf(Color.BLACK)
        val DefaultWhiteTint = ColorStateList.valueOf(Color.WHITE)
        val DefaultCheckBoxSize = 26.dp
        val DefaultCornerRadius = 6f.dp
        val StrokeWidth = 2f.dp
        val CheckBoxPadding = 2.dp
        val CheckedStrokeWidth = 1f.dp
        val FocusBorderPadding = 1.dp
        val XfermodeAdd = PorterDuffXfermode(PorterDuff.Mode.ADD)
    }
}
