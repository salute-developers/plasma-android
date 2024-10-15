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
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.animation.LinearInterpolator
import com.sdds.uikit.CheckBox
import com.sdds.uikit.R
import com.sdds.uikit.dp
import com.sdds.uikit.internal.base.AnimationUtils.lerp
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy
import kotlin.math.floor

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

    private var _cornerRadius: Float = 0f
    private var _checkDrawFraction: Float = 0f
    private var _checkCenterGravitationShiftFraction: Float = 0f
    private var _size: Int = 0
    private var _padding: Int = 0
    private var _focusBorderEnabled: Boolean = false

    init {
        obtainAttributes(context, attrs, defStyleAttr)
        animatorSet.playTogether(checkDrawAnimation, checkGravityAnimation)
    }

    /**
     * Отображается ли drawable в режиме Layout Editor
     */
    var isInEditMode: Boolean = false

    /**
     * Устанавливает размер [CheckBoxDrawable]
     * @param size размер в px
     */
    fun setSize(size: Int) {
        if (_size != size) {
            _size = size
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
        }
    }

    /**
     * Устанавливает цвета заливки
     */
    fun setBoxTintList(boxTintLists: ColorStateList? = null) {
        if (_boxTintList != boxTintLists) {
            _boxTintList = boxTintLists ?: DefaultBlackTint
        }
    }

    /**
     * Устанавливает цвета маркера
     */
    fun setCheckMarkTintList(checkMarkTintLists: ColorStateList? = null) {
        if (_checkMarkTintList != checkMarkTintLists) {
            _checkMarkTintList = checkMarkTintLists ?: DefaultWhiteTint
        }
    }

    override fun draw(canvas: Canvas) {
        canvas.save()
        canvas.translate(
            bounds.left.toFloat() + getFocusBorderPadding(),
            bounds.top.toFloat() + getFocusBorderPadding(),
        )
        canvas.clipRect(bounds)
        canvas.drawBox(
            checked = _checked,
            focused = _focused && _focusBorderEnabled,
            boxColor = _boxTintList.getColorForState(state, _boxTintList.defaultColor),
            borderColor = _borderTintList.getColorForState(state, _borderTintList.defaultColor),
            radius = _cornerRadius,
            strokeWidth = floor(if (_checked) CheckedStrokeWidth else StrokeWidth),
        )
        canvas.drawMark(
            checkColor = _checkMarkTintList.getColorForState(state, _checkMarkTintList.defaultColor),
            checkFraction = _checkDrawFraction,
            crossCenterGravitation = _checkCenterGravitationShiftFraction,
            strokeWidth = StrokeWidth,
        )
        canvas.restore()
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
        if (changed) {
            invalidateSelf()
        }
        return super.onStateChange(state) && changed
    }

    override fun isStateful(): Boolean = true

    override fun getIntrinsicWidth(): Int = _size + getFocusBorderPadding() * 2

    override fun getIntrinsicHeight(): Int = _size + getFocusBorderPadding() * 2
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
        val borderHeight = if (focused) height.toFloat() - strokeWidth else checkedHeight - strokeWidth

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
                _paint.configure(style = Paint.Style.STROKE, color = borderColor, strokeWidth = strokeWidth),
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

    private fun resetAnimators(newState: CheckBox.ToggleableState, prevState: CheckBox.ToggleableState) {
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
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SdCheckBoxDrawable, defStyleAttr, 0)
        _size = typedArray.getDimensionPixelSize(
            R.styleable.SdCheckBoxDrawable_sd_buttonSize,
            DefaultCheckBoxSize,
        )
        _cornerRadius = typedArray.getDimension(
            R.styleable.SdCheckBoxDrawable_sd_boxCornerRadius,
            DefaultCornerRadius,
        )
        _padding = typedArray.getDimensionPixelSize(
            R.styleable.SdCheckBoxDrawable_sd_buttonPadding,
            CheckBoxPadding,
        )
        _focusBorderEnabled = typedArray.getBoolean(R.styleable.SdRadioBoxDrawable_sd_focusBorderEnabled, false)
        typedArray.recycle()
    }

    private fun getFocusBorderPadding(): Int {
        return if (_focusBorderEnabled) FocusBorderPadding else 0
    }

    private companion object {
        const val ANIMATION_DURATION = 100L
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
