package com.sdds.uikit.internal

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
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
import com.sdds.uikit.R
import com.sdds.uikit.dp
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.ShapeModel.Companion.adjust
import com.sdds.uikit.statelist.NumberStateList
import com.sdds.uikit.statelist.getFloatForState
import com.sdds.uikit.statelist.getIntForState
import com.sdds.uikit.statelist.getNumberStateList

/**
 * [Drawable] для RadioBox
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 04.06.2024
 */
internal class RadioBoxDrawable(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
) : Drawable(), Animatable {

    private val _paint: Paint = Paint().configure(isAntiAlias = true)
    private val animator by unsafeLazy {
        ValueAnimator().apply {
            duration = ANIMATION_DURATION
            interpolator = LinearInterpolator()
            addUpdateListener {
                _animatedMarkRadius = it.animatedValue as Float
                invalidateSelf()
            }
        }
    }

    private var _checked: Boolean = false
    private var _focused: Boolean = false
    private var _maxOffset: Int = 0
    private var _maxBorderWidth: Int = 0

    private var _borderTintList: ColorStateList = DefaultBlackTint
    private var _checkMarkTintList: ColorStateList = DefaultWhiteTint
    private var _boxTintList: ColorStateList = DefaultBlackTint

    private var _animatedMarkRadius: Float = 0f
    private var _padding: Int = 0
    private var _focusBorderEnabled: Boolean = false

    private val _markRadius: Float get() = _iconWidth / 2f

    private var _originalBorderShape: ShapeModel? = null
    private var _needsToAdjust: Boolean = false
    private var _checkedIcon: Drawable? = null
    private var _checkIconTintList: ColorStateList = DefaultMagentaTint
    private var _checkedIconBounds = Rect()
    private var _toggleWidth: Int = 0
    private var _toggleHeight: Int = 0
    private var _boxDrawable: ShapeDrawable? = null
    private var _borderDrawable: ShapeDrawable? = null
    private var _borderWidth: Float = 0f
    private var _borderOffset: Float = 0f
    private var _iconWidth: Int = 0
    private var _iconHeight: Int = 0
    private var _commonBounds = Rect()

    private var _toggleBorderWidth: NumberStateList? = null
    private var _toggleBorderOffset: NumberStateList? = null
    private var _toggleIconWidth: NumberStateList? = null
    private var _toggleIconHeight: NumberStateList? = null

    /**
     * Отображается ли drawable в режиме Layout Editor
     */
    var isInEditMode: Boolean = false

    init {
        obtainAttributes(context, attrs, defStyleAttr)
        _boxDrawable = ShapeDrawable(context, attrs, defStyleAttr)
            .apply { callback = this@RadioBoxDrawable.callback }
        _borderDrawable = ShapeDrawable(context, attrs, defStyleAttr)
            .apply { callback = this@RadioBoxDrawable.callback }
        _originalBorderShape = _borderDrawable?.shape?.copy()
    }

    /**
     * Устанавливает ширину [RadioBoxDrawable]
     * @param width размер в px
     */
    fun setWidth(width: Int) {
        if (_toggleWidth != width) {
            _toggleWidth = width
            invalidateSelf()
        }
    }

    /**
     * Устанавливает высоту [RadioBoxDrawable]
     * @param height размер в px
     */
    fun setHeight(height: Int) {
        if (_toggleHeight != height) {
            _toggleHeight = height
            invalidateSelf()
        }
    }

    /**
     * Устанавливает цвета границы
     */
    fun setBorderTintList(borderTintList: ColorStateList? = null) {
        _borderTintList = borderTintList ?: DefaultBlackTint
        _borderDrawable?.setStrokeTint(_borderTintList)
    }

    /**
     * Устанавливает цвета заливки
     */
    fun setBoxTintList(boxTintLists: ColorStateList? = null) {
        _boxTintList = boxTintLists ?: DefaultBlackTint
        _boxDrawable?.setTintList(_boxTintList)
    }

    /**
     * Устанавливает цвета иконки маркера
     */
    fun setCheckIconTintList(checkIconTintLists: ColorStateList? = null) {
        if (_checkIconTintList != checkIconTintLists) {
            _checkIconTintList = checkIconTintLists ?: DefaultWhiteTint
            _checkedIcon?.setTintList(_checkIconTintList)
        }
    }

    /**
     * Устанавливает цвета маркера
     */
    fun setCheckMarkTintList(checkMarkTintLists: ColorStateList? = null) {
        if (_checkMarkTintList != checkMarkTintLists) {
            _checkMarkTintList = checkMarkTintLists ?: DefaultWhiteTint
        }
        setCheckIconTintList(_checkMarkTintList)
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

    private fun Drawable?.safeWidth() =
        if (_iconWidth != 0) _iconWidth else this?.intrinsicWidth ?: 0

    private fun Drawable?.safeHeight() =
        if (_iconHeight != 0) _iconHeight else this?.intrinsicHeight ?: 0

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        calculateCommonBounds()
        _boxDrawable?.bounds = _commonBounds
        updateBorderBounds()
        updateIconBounds(_checkedIcon, _checkedIconBounds)
    }

    private fun updateBorderBounds() {
        val adjustedBounds = Rect(_commonBounds)
        adjustedBounds.inset(
            (-_borderOffset).toInt(),
            (-_borderOffset).toInt(),
        )
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
        val left = bounds.centerX() - boxWidth / 2
        val top = bounds.centerY() - boxHeight / 2
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
                    color = _checkMarkTintList.getColorForState(state, _checkMarkTintList.defaultColor),
                    radius = _animatedMarkRadius,
                )
            }
        } else {
            if (_checked) _checkedIcon?.draw(canvas)
        }
    }

    override fun onStateChange(state: IntArray): Boolean {
        val focused = state.contains(android.R.attr.state_focused)
        val checked = state.contains(android.R.attr.state_checked)
        var changed = false
        var needAnimate = false
        if (_focused != focused) {
            _focused = focused
            changed = true
        }
        if (_checkedIcon?.setState(state) == true) changed = true
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

        if (_checked != checked) {
            _checked = checked
            changed = true
            needAnimate = _checkedIcon == null
        }
        if (changed) onBoundsChange(bounds)

        if (needAnimate) {
            resetAnimators()
            start()
        }
        return changed || super.onStateChange(state)
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

    override fun isStateful(): Boolean {
        return true
    }

    override fun getIntrinsicWidth(): Int {
        return _toggleWidth + (_maxOffset - _padding) * 2
    }

    override fun getIntrinsicHeight(): Int {
        return _toggleHeight + (_maxOffset - _padding) * 2
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
            animator.start()
        }
    }

    override fun stop() {
        if (animator.isRunning) {
            animator.cancel()
        }
    }

    override fun isRunning(): Boolean = animator.isRunning

    override fun jumpToCurrentState() {
        super.jumpToCurrentState()
        _animatedMarkRadius = if (_checked) _markRadius else 0f
    }

    private fun Canvas.drawMark(color: Int, radius: Float) {
        if (radius > 0f) {
            // Рисуем основной круг при checked = true
            _paint.xfermode = XfermodeAdd
            drawCircle(
                _commonBounds.width() / 2f,
                _commonBounds.height() / 2f,
                radius,
                _paint.configure(style = Paint.Style.FILL, color = color),
            )
        }
    }

    private fun resetAnimators() {
        animator.cancel()
        animator.setFloatValues(
            if (_checked) 0f else _markRadius,
            if (_checked) _markRadius else 0f,
        )
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        context.withStyledAttributes(attrs, R.styleable.SdRadioBoxDrawable, defStyleAttr, 0) {
            _toggleWidth = getDimensionPixelSize(
                R.styleable.SdRadioBoxDrawable_sd_toggleWidth,
                DefaultRadioBoxSize,
            )
            _toggleHeight = getDimensionPixelSize(
                R.styleable.SdRadioBoxDrawable_sd_toggleHeight,
                DefaultRadioBoxSize,
            )
            _padding = getDimensionPixelSize(
                R.styleable.SdRadioBoxDrawable_sd_buttonPadding,
                DefaultRadioCheckedPadding,
            )
            _focusBorderEnabled = getBoolean(R.styleable.SdRadioBoxDrawable_sd_focusBorderEnabled, false)
            checkedIcon = getDrawable(R.styleable.SdRadioBoxDrawable_sd_checkedIcon)
            _toggleBorderWidth =
                getNumberStateList(context, R.styleable.SdRadioBoxDrawable_sd_toggleBorderWidth)
            _toggleBorderOffset =
                getNumberStateList(
                    context,
                    R.styleable.SdRadioBoxDrawable_sd_toggleBorderOffset,
                )
            _maxOffset = _toggleBorderOffset?.allValues()?.maxOfOrNull { it.toInt() } ?: 0
            _maxBorderWidth = _toggleBorderWidth?.allValues()?.maxOfOrNull { it.toInt() } ?: 0
            _toggleIconWidth =
                getNumberStateList(context, R.styleable.SdRadioBoxDrawable_sd_toggleIconWidth)
            _toggleIconHeight =
                getNumberStateList(context, R.styleable.SdRadioBoxDrawable_sd_toggleIconHeight)
        }
    }

    private companion object {
        const val ANIMATION_DURATION = 100L
        val DefaultBlackTint = ColorStateList.valueOf(Color.BLACK)
        val DefaultWhiteTint = ColorStateList.valueOf(Color.WHITE)
        val DefaultMagentaTint = ColorStateList.valueOf(Color.MAGENTA)
        val DefaultRadioBoxSize = 26.dp
        val DefaultRadioCheckedPadding = 2.dp
        val XfermodeAdd = PorterDuffXfermode(PorterDuff.Mode.ADD)
    }
}
