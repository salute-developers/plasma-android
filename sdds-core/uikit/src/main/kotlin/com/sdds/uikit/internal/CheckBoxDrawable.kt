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
import android.view.animation.LinearInterpolator
import androidx.core.content.withStyledAttributes
import androidx.core.graphics.withTranslation
import com.sdds.uikit.CheckBox
import com.sdds.uikit.R
import com.sdds.uikit.dp
import com.sdds.uikit.internal.base.AnimationUtils.lerp
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.ShapeModel.Companion.adjust
import com.sdds.uikit.statelist.NumberStateList
import com.sdds.uikit.statelist.getFloatForState
import com.sdds.uikit.statelist.getIntForState
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
    private var _focused: Boolean = false
    private var _toggleableState: CheckBox.ToggleableState = CheckBox.ToggleableState.OFF
    private var _maxOffset: Int = 0
    private var _maxBorderWidth: Int = 0

    private var _borderTintList: ColorStateList = DefaultBlackTint
    private var _boxTintList: ColorStateList = DefaultBlackTint
    private var _checkMarkTintList: ColorStateList = DefaultWhiteTint

    private var _checkedIcon: Drawable? = null
    private var _checkIconTintList: ColorStateList = DefaultWhiteTint
    private var _indeterminateIcon: Drawable? = null
    private var _indeterminateIconTintList: ColorStateList = DefaultWhiteTint
    private var _checkedIconBounds = Rect()
    private var _indeterminateIconBounds = Rect()

    private var _commonBounds = Rect()

    @Deprecated("Использовать shape")
    private var _cornerRadius: Float = FallBackRadius.toFloat()

    private var _originalBorderShape: ShapeModel? = null
    private var _needsToAdjust: Boolean = false

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
    private var _iconWidth: Int = 0
    private var _iconHeight: Int = 0

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
        _originalBorderShape = _borderDrawable?.shape?.copy()
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
            invalidateSelf()
        }
    }

    /**
     * Устанавливает высоту [CheckBoxDrawable]
     * @param height размер в px
     */
    fun setHeight(height: Int) {
        if (_toggleHeight != height) {
            _toggleHeight = height
            invalidateSelf()
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
            setCheckIconTintList(_checkMarkTintList)
            setIndeterminateIconTintList(_checkMarkTintList)
        }
    }

    /**
     * Устанавливает цвета иконки для checked
     */
    fun setCheckIconTintList(checkIconTintLists: ColorStateList? = null) {
        if (_checkIconTintList != checkIconTintLists) {
            _checkIconTintList = checkIconTintLists ?: DefaultWhiteTint
            _checkedIcon?.setTintList(_checkIconTintList)
        }
    }

    /**
     * Устанавливает цвета иконки для indeterminate
     */
    fun setIndeterminateIconTintList(indeterminateIconTintLists: ColorStateList? = null) {
        if (_indeterminateIconTintList != indeterminateIconTintLists) {
            _indeterminateIconTintList = indeterminateIconTintLists ?: DefaultWhiteTint
            _indeterminateIcon?.setTintList(_indeterminateIconTintList)
        }
    }

    /**
     * [Drawable] для иконки в состоянии checked
     */
    var checkedIcon: Drawable?
        get() = _checkedIcon
        set(value) {
            if (_checkedIcon != value) {
                _checkedIcon?.callback = null
                _checkedIcon = value
                _checkedIcon?.callback = callback
                updateIconBounds(_checkedIcon, _checkedIconBounds)
                _checkedIcon?.setTintList(_checkIconTintList)
                invalidateSelf()
            }
        }

    /**
     * [Drawable] для иконки в состоянии indeterminate
     */
    var indeterminateIcon: Drawable?
        get() = _indeterminateIcon
        set(value) {
            if (_indeterminateIcon != value) {
                _indeterminateIcon?.callback = null
                _indeterminateIcon = value
                _indeterminateIcon?.callback = callback
                updateIconBounds(_indeterminateIcon, _indeterminateIconBounds)
                _indeterminateIcon?.setTintList(_indeterminateIconTintList)
                invalidateSelf()
            }
        }

    private fun Drawable?.safeWidth() =
        if (_iconWidth != 0) _iconWidth else this?.intrinsicWidth ?: 0

    private fun Drawable?.safeHeight() =
        if (_iconHeight != 0) _iconHeight else this?.intrinsicHeight ?: 0

    private fun updateIconBounds(icon: Drawable?, iconBounds: Rect) {
        if (icon != null) {
            val iconWidth = if (_iconWidth != 0) {
                _iconWidth
            } else {
                icon.safeWidth()
            }
            val iconHeight = if (_iconHeight != 0) {
                _iconHeight
            } else {
                icon.safeHeight()
            }
            val left = bounds.left + (bounds.width() - iconWidth) / 2
            val top = bounds.top + (bounds.height() - iconHeight) / 2
            iconBounds.set(
                left,
                top,
                left + iconWidth,
                top + iconHeight,
            )
            icon.bounds = iconBounds
        } else {
            iconBounds.set(0, 0, 0, 0)
        }
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        calculateCommonBounds()
        _boxDrawable?.bounds = _commonBounds
        updateBorderBounds()
        updateIconBounds(_checkedIcon, _checkedIconBounds)
        updateIconBounds(_indeterminateIcon, _indeterminateIconBounds)
    }

    private fun updateBorderBounds() {
        val adjustedBounds = Rect(_commonBounds)
        adjustedBounds.inset(-_borderOffset.roundToInt(), -_borderOffset.roundToInt())
        if (_borderDrawable?.strokeWidth != _borderWidth) {
            _borderDrawable?.setStrokeWidth(_borderWidth)
        }
        if (_needsToAdjust) {
            _originalBorderShape?.adjust(_borderOffset - _borderWidth / 2)?.let {
                _borderDrawable?.setShapeModel(it)
            }
            _needsToAdjust = false
        }
        _borderDrawable?.bounds = adjustedBounds
    }

    private fun calculateCommonBounds() {
        val boxWidth = _toggleWidth - _padding * 2
        val boxHeight = _toggleHeight - _padding * 2
        val left = (bounds.width() - boxWidth) / 2
        val top = (bounds.height() - boxHeight) / 2
        val right = left + boxWidth
        val bottom = top + boxHeight
        _commonBounds.set(
            left,
            top,
            right,
            bottom,
        )
    }

    override fun draw(canvas: Canvas) {
        _boxDrawable?.draw(canvas)
        _borderDrawable?.draw(canvas)
        if (_checkedIcon == null) {
            canvas.withTranslation(
                _commonBounds.left.toFloat(),
                _commonBounds.top.toFloat(),
            ) {
                drawMark(
                    checkColor = _checkMarkTintList.getColorForState(
                        state,
                        _checkMarkTintList.defaultColor,
                    ),
                    checkFraction = _checkDrawFraction,
                    crossCenterGravitation = _checkCenterGravitationShiftFraction,
                    strokeWidth = StrokeWidth,
                )
            }
        } else {
            when (_toggleableState) {
                CheckBox.ToggleableState.OFF -> {}
                CheckBox.ToggleableState.ON -> _checkedIcon?.draw(canvas)
                CheckBox.ToggleableState.INDETERMINATE -> _indeterminateIcon?.draw(canvas)
            }
        }
    }

    @Suppress("CyclomaticComplexMethod")
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
        val cIconState = _checkedIcon?.setState(state)
        val iIconState = _indeterminateIcon?.setState(state)
        if (cIconState == true || iIconState == true) changed = true

        val borderState = _borderDrawable?.setState(state)
        val boxState = _boxDrawable?.setState(state)
        if (borderState == true || boxState == true) changed = true

        val iWidthChange = setIconWidth(state)
        val iHeightChange = setIconHeight(state)
        if (iHeightChange || iWidthChange) {
            changed = true
        }
        val borderChange = setBorderWidth(state)
        val offsetChange = setBorderOffset(state)
        if (borderChange || offsetChange) {
            changed = true
        }
        if (changed) {
            onBoundsChange(bounds)
            invalidateSelf()
        }
        return super.onStateChange(state) || changed
    }

    private fun setBorderWidth(state: IntArray): Boolean {
        val newWidth = _toggleBorderWidth?.getFloatForState(state) ?: 0f
        return if (_borderWidth != newWidth) {
            _borderWidth = newWidth
            _needsToAdjust = true
            true
        } else {
            false
        }
    }

    private fun setBorderOffset(state: IntArray): Boolean {
        val newOffset = _toggleBorderOffset?.getFloatForState(state) ?: 0f
        return if (_borderOffset != newOffset) {
            _borderOffset = newOffset
            _needsToAdjust = true
            true
        } else {
            false
        }
    }

    private fun setIconWidth(state: IntArray): Boolean {
        val newWidth = _toggleIconWidth?.getIntForState(state) ?: 0
        return if (_iconWidth != newWidth) {
            _iconWidth = newWidth
            true
        } else {
            false
        }
    }

    private fun setIconHeight(state: IntArray): Boolean {
        val newHeight = _toggleIconHeight?.getIntForState(state) ?: 0
        return if (_iconHeight != newHeight) {
            _iconHeight = newHeight
            true
        } else {
            false
        }
    }

    override fun isStateful(): Boolean = true

    override fun getIntrinsicWidth(): Int {
        return _toggleWidth + _maxBorderWidth / 2 + (_maxOffset - _padding) * 2
    }

    override fun getIntrinsicHeight(): Int {
        return _toggleHeight + _maxBorderWidth / 2 + (_maxOffset - _padding) * 2
    }

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

    private fun Canvas.drawMark(
        checkColor: Int,
        checkFraction: Float,
        crossCenterGravitation: Float,
        strokeWidth: Float,
    ) {
        _paint.xfermode = XfermodeAdd
        val width = _commonBounds.width()
        val height = _commonBounds.height()
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
        _checkPath.moveTo(width * leftX, height * gravitatedLeftY)
        _checkPath.lineTo(width * gravitatedCrossX, height * gravitatedCrossY)
        _checkPath.lineTo(width * rightX, height * gravitatedRightY)
        _pathMeasure.setPath(_checkPath, false)
        _pathToDraw.reset()
        _pathMeasure.getSegment(0f, _pathMeasure.length * checkFraction, _pathToDraw, true)

        save()
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
        prevState: CheckBox.ToggleableState,
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
            checkedIcon = getDrawable(R.styleable.SdCheckBoxDrawable_sd_checkedIcon)
            indeterminateIcon =
                getDrawable(R.styleable.SdCheckBoxDrawable_sd_indeterminateIcon)
            _toggleBorderWidth =
                getNumberStateList(context, R.styleable.SdCheckBoxDrawable_sd_toggleBorderWidth)
            _toggleBorderOffset =
                getNumberStateList(
                    context,
                    R.styleable.SdCheckBoxDrawable_sd_toggleBorderOffset,
                )
            _maxOffset = _toggleBorderOffset?.allValues()?.maxOfOrNull { it.toInt() } ?: 0
            _maxBorderWidth = _toggleBorderWidth?.allValues()?.maxOfOrNull { it.toInt() } ?: 0
            _toggleIconWidth =
                getNumberStateList(context, R.styleable.SdCheckBoxDrawable_sd_toggleIconWidth)
            _toggleIconHeight =
                getNumberStateList(context, R.styleable.SdCheckBoxDrawable_sd_toggleIconHeight)
        }
    }

    private companion object {
        const val ANIMATION_DURATION = 100L
        val FallBackRadius = 6.dp
        val DefaultBlackTint = ColorStateList.valueOf(Color.BLACK)
        val DefaultWhiteTint = ColorStateList.valueOf(Color.WHITE)
        val DefaultCheckBoxSize = 26.dp
        val StrokeWidth = 2f.dp
        val CheckBoxPadding = 2.dp
        val XfermodeAdd = PorterDuffXfermode(PorterDuff.Mode.ADD)
    }
}
