package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.SoundEffectConstants
import android.view.View
import android.widget.Checkable
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.drawable.ChipDrawable
import com.sdds.uikit.drawable.TextDrawable
import com.sdds.uikit.internal.base.ViewAlphaHelper
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewState.Companion.isDefined
import com.sdds.uikit.viewstate.ViewStateHolder

/**
 * Компонент Chip.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 29.07.2024
 */
@Suppress("LeakingThis")
open class Chip @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_chipStyle,
    defStyleRes: Int = R.style.Sdds_Components_Chip,
) : View(context, attrs, defStyleAttr),
    ViewStateHolder,
    ColorStateHolder,
    TextDrawable.Delegate,
    Checkable,
    Shapeable,
    HasFocusSelector by FocusSelectorDelegate() {

    /**
     * Слушатель изменений состояния [isChecked]
     */
    fun interface OnCheckedChangeListener {

        /**
         * Колбэк изменений состояния [isChecked]
         */
        fun onCheckedChanged(chip: Chip, isChecked: Boolean)
    }

    private val _chipDrawable: ChipDrawable = ChipDrawable(
        context = context,
        attrs = attrs,
        defStyleAttr = defStyleAttr,
        defStyleRes = defStyleRes,
    ).apply {
        callback = this@Chip
        setDelegate(this@Chip)
        setPaddings(paddingStart, paddingTop, paddingEnd, paddingBottom)
    }
    private val _viewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)
    private var _isCheckable: Boolean = false
    private var _onCheckedChangedListener: OnCheckedChangeListener? = null
    private var _isChecked: Boolean = false
        set(value) {
            if (field != value) {
                field = value
                _onCheckedChangedListener?.onCheckedChanged(this, value)
            }
        }

    init {
        applySelector(this, context, attrs, defStyleAttr)
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        _viewAlphaHelper.updateAlphaByEnabledState(this)
    }

    /**
     * @see ShapeModel
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _chipDrawable.shape

    /**
     * Состояние внешнего вида компонента [Chip]
     * @see ViewState
     */
    @Deprecated("Использовать Chip.colorState")
    override var state: ViewState? = ViewState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * Состояние внешнего вида компонента [Chip]
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * Текст
     */
    open var text: CharSequence
        get() = _chipDrawable.text
        set(value) {
            _chipDrawable.text = value
        }

    /**
     * [Drawable] в начале компонента
     */
    open var drawableStart: Drawable?
        get() = _chipDrawable.drawableStart
        set(value) {
            _chipDrawable.drawableStart = value
            refreshDrawableState()
        }

    /**
     * [Drawable] в конце компонента
     */
    open var drawableEnd: Drawable?
        get() = _chipDrawable.drawableEnd
        set(value) {
            _chipDrawable.drawableEnd = value
            refreshDrawableState()
        }

    /**
     * Может ли [Chip] изменять состояние [isChecked]
     */
    open var isCheckable: Boolean
        get() = _isCheckable
        set(value) {
            if (_isCheckable != value) {
                _isCheckable = value
                refreshDrawableState()
            }
        }

    /**
     * Устанавливает слушатель изменения состояния [isChecked]
     */
    open fun setOnCheckedChangedListener(listener: OnCheckedChangeListener?) {
        _onCheckedChangedListener = listener
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    open fun setTextColor(colors: ColorStateList?) {
        _chipDrawable.setTextColor(colors)
    }

    /**
     * Устанавливает стиль текста по идентификатору стиля
     * @param appearanceId идентификатор стиля текста
     */
    open fun setTextAppearance(@StyleRes appearanceId: Int) {
        _chipDrawable.setTextAppearance(context, appearanceId)
    }

    /**
     * Устанавливает [Drawable] в начале по идентификатору ресурса
     * @param drawableRes идентификатор ресурса [Drawable]
     */
    fun setDrawableStartRes(@DrawableRes drawableRes: Int) {
        _chipDrawable.setDrawableStartRes(context, drawableRes)
    }

    /**
     * Устанавливает [Drawable] в конце по идентификатору ресурса
     * @param drawableRes идентификатор ресурса [Drawable]
     */
    fun setDrawableEndRes(@DrawableRes drawableRes: Int) {
        _chipDrawable.setDrawableEndRes(context, drawableRes)
    }

    /**
     * Устанавливает цвета [Drawable] в начале
     * @param colors цвета [Drawable] в начале
     */
    open fun setDrawableStartColors(colors: ColorStateList?) {
        _chipDrawable.setDrawableStartTint(colors)
        refreshDrawableState()
    }

    /**
     * Устанавливает цвет [Drawable] в начале
     * @param color цвет [Drawable] в начале
     */
    fun setDrawableStartColor(@ColorInt color: Int) {
        setDrawableStartColors(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета [Drawable] в конце
     * @param colors цвета [Drawable] в конце
     */
    open fun setDrawableEndColors(colors: ColorStateList?) {
        _chipDrawable.setDrawableEndTint(colors)
        refreshDrawableState()
    }

    /**
     * Устанавливает цвет [Drawable] в конце
     * @param color цвет [Drawable] в конце
     */
    fun setDrawableEndColor(@ColorInt color: Int) {
        setDrawableEndColors(ColorStateList.valueOf(color))
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        _viewAlphaHelper?.updateAlphaByEnabledState(this)
    }

    override fun setPadding(left: Int, top: Int, right: Int, bottom: Int) {
        super.setPadding(left, top, right, bottom)
        _chipDrawable.setPaddings(left, top, right, bottom)
    }

    override fun setPaddingRelative(start: Int, top: Int, end: Int, bottom: Int) {
        super.setPaddingRelative(start, top, end, bottom)
        if (layoutDirection == LAYOUT_DIRECTION_RTL) {
            _chipDrawable.setPaddings(end, top, start, bottom)
        } else {
            _chipDrawable.setPaddings(start, top, end, bottom)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val intrinsicWidth = _chipDrawable.intrinsicWidth
        val intrinsicHeight = _chipDrawable.intrinsicHeight

        val width = when (widthMode) {
            MeasureSpec.AT_MOST -> minOf(specWidth, maxOf(minimumWidth, intrinsicWidth))
            MeasureSpec.EXACTLY -> specWidth
            else -> maxOf(minimumWidth, intrinsicWidth)
        }

        val height = when (heightMode) {
            MeasureSpec.AT_MOST -> minOf(specHeight, maxOf(minimumHeight, intrinsicHeight))
            MeasureSpec.EXACTLY -> specHeight
            else -> maxOf(minimumHeight, intrinsicHeight)
        }
        setMeasuredDimension(width, height)
        _chipDrawable.setBounds(0, 0, measuredWidth, measuredHeight)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        _chipDrawable.draw(canvas)
    }

    override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect)
        updateFocusSelector(this, focused)
    }

    override fun setPressed(pressed: Boolean) {
        if (isPressed != pressed) {
            handlePressedChange(this, pressed)
        }
        super.setPressed(pressed)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _chipDrawable
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        _chipDrawable.state = drawableState
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 3)
        if (state?.isDefined() == true) {
            mergeDrawableStates(drawableState, state?.attr)
        }
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        if (isChecked) {
            mergeDrawableStates(drawableState, intArrayOf(android.R.attr.state_checked))
        }
        return drawableState
    }

    override fun onDrawableSizeChange() {
        requestLayout()
        invalidateOutline()
    }

    override fun setChecked(checked: Boolean) {
        if (_isChecked != checked) {
            _isChecked = checked
            refreshDrawableState()
        }
    }

    override fun isChecked(): Boolean {
        return _isChecked
    }

    override fun toggle() {
        isChecked = !isChecked && isCheckable
    }

    override fun performClick(): Boolean {
        toggle()
        return super.performClick().also { handled ->
            if (handled) {
                playSoundEffect(SoundEffectConstants.CLICK)
            }
        }
    }

    @Suppress("PrivateResource")
    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Chip, defStyleAttr, defStyleRes)
        _isCheckable = typedArray.getBoolean(R.styleable.Chip_android_checkable, true)
        _isChecked = typedArray.getBoolean(R.styleable.Chip_android_checked, false)
        typedArray.recycle()
    }
}
