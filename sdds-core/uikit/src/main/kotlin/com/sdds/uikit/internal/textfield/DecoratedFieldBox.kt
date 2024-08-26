package com.sdds.uikit.internal.textfield

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.annotation.StyleRes
import androidx.core.view.isVisible
import androidx.core.view.updatePadding
import androidx.core.view.updatePaddingRelative
import androidx.core.widget.addTextChangedListener
import com.google.android.material.internal.DescendantOffsetUtils
import com.sdds.uikit.ImageView
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewStateHolder

/**
 * Декорированный контейнер с [EditText], плейсхолдером, иконками и анимированным заголовком
 * Предназначен для использования в TextField и TextArea
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 17.06.2024
 */
internal class DecoratedFieldBox(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr), ViewStateHolder {

    // Используем задизейбленный StatefulEditText вместо TextView,
    // т.к. при использовании TextView не удается попасть в отступы из-за
    // особенностей работы EditText.
    private val _placeholderView: StatefulEditText = StatefulEditText(context).apply {
        isEnabled = false
        isClickable = false
        background = null
    }

    private val _collapsingTextHelper: CollapsingTextHelper = CollapsingTextHelper(this)
    private val _collapsedBounds = Rect()
    private val _expandedBounds = Rect()
    private val _fieldBounds = Rect()
    private val _animator: ValueAnimator by unsafeLazy {
        ValueAnimator().apply {
            duration = LABEL_ANIMATION_DURATION
            addUpdateListener { _collapsingTextHelper.expansionFraction = (it.animatedValue as Float) }
        }
    }
    private val _iconView: ImageView by unsafeLazy {
        ImageView(context).apply {
            id = R.id.sd_textFieldIcon
        }
    }
    private val _actionView: ImageView by unsafeLazy {
        ImageView(context).apply {
            id = R.id.sd_textFieldAction
        }
    }
    private val _field = StatefulEditText(context, attrs).apply {
        id = R.id.sd_textFieldEditText
        hint = null
        maxLines = 1
        isSingleLine = true
        background = null
        this.addTextChangedListener(
            afterTextChanged = {
                _value = it?.toString()
                updateTextState(false)
            },
        )
    }
    private var _inDrawableStateChanged: Boolean = false
    private var _iconSize: Int = 0
    private var _iconPadding: Int = 0
    private var _actionSize: Int = 0
    private var _actionPadding: Int = 0

    private var _boxPaddingStart: Int = 0
    private var _boxPaddingTop: Int = 0
    private var _boxPaddingEnd: Int = 0
    private var _boxPaddingBottom: Int = 0

    private var _labelPadding: Int = 0
    private var _labelAnimationEnabled: Boolean = true

    private var _value: String? = null

    private var isExpanded: Boolean = false
    private var restoringSavedState = false

    val editText: StatefulEditText
        get() = _field

    val iconView: ImageView
        get() = _iconView

    val actionView: ImageView
        get() = _actionView

    var labelEnabled: Boolean = true
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
                requestLayout()
            }
        }

    override var state: ViewState? = null
        set(value) {
            if (field != value) {
                field = value
                _placeholderView.state = field
                _actionView.state = field
                _iconView.state = field
                _field.state = field
            }
        }

    var placeholder: CharSequence?
        get() = _placeholderView.text
        set(value) {
            if (_placeholderView.text != value) {
                _placeholderView.setText(value)
                updateTextState(false)
            }
        }

    init {
        setWillNotDraw(false)
        setAddStatesFromChildren(true)
        obtainAttributes(context, attrs, defStyleAttr)
        _collapsingTextHelper.apply {
            setTextSizeInterpolator(AnimationUtils.LINEAR_INTERPOLATOR)
            setPositionInterpolator(AnimationUtils.LINEAR_INTERPOLATOR)
            setTypefaces(editText.typeface)
            setExpandedTextSize(editText.textSize)
            setCollapsedTextGravity(Gravity.TOP or editText.gravity and Gravity.VERTICAL_GRAVITY_MASK.inv())
        }
        _placeholderView.gravity = editText.gravity
        val lp = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        addView(_placeholderView, lp)
        addView(editText, lp)
        addView(
            _iconView,
            LayoutParams(_iconSize, _iconSize).apply {
                gravity = Gravity.CENTER_VERTICAL or Gravity.START
            },
        )
        addView(
            _actionView,
            LayoutParams(_actionSize, _actionSize).apply {
                gravity = Gravity.CENTER_VERTICAL or Gravity.END
            },
        )
        updateTextOffset()
    }

    fun setIcon(drawable: Drawable?) {
        iconView.setImageDrawable(drawable)
    }

    fun setIconTint(tint: ColorStateList?) {
        iconView.imageTintList = tint
    }

    fun setAction(drawable: Drawable?) {
        actionView.setImageDrawable(drawable)
    }

    fun setActionTint(tint: ColorStateList?) {
        actionView.imageTintList = tint
    }

    fun setLabel(text: CharSequence?) {
        if (_collapsingTextHelper.getText() != text) {
            _collapsingTextHelper.setText(text)
            updateTextState(false)
        }
    }

    fun setLabelAppearance(@StyleRes appearanceId: Int) {
        _collapsingTextHelper.setCollapsedTextAppearance(appearanceId)
        updateTextState(false)
    }

    fun setPlaceholderAppearance(@StyleRes appearanceId: Int) {
        _placeholderView.setTextAppearance(appearanceId)
        updateTextState(false)
    }

    fun setLabelColor(colors: ColorStateList?) {
        if (_collapsingTextHelper.collapsedTextColor != colors) {
            _collapsingTextHelper.setCollapsedTextColor(colors)
            updateTextState(false)
        }
    }

    fun setPlaceholderColor(colors: ColorStateList?) {
        _placeholderView.setTextColor(colors)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        editText.isEnabled = enabled
    }

    internal fun shouldDisplayInnerLabel(height: Int): Boolean {
        val labelValueHeight = _collapsingTextHelper.run { expandedTextHeight.toInt() + collapsedTextHeight.toInt() }
        return (height - labelValueHeight - _labelPadding - paddingTop - paddingBottom) >= 0
    }

    internal fun updateTextOffset() {
        val valueOffset = if (labelEnabled) innerLabelCollapsedHeight() + _labelPadding else 0
        if (_field.paddingTop != valueOffset) {
            _field.updatePadding(top = valueOffset, bottom = 0)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        editText.updatePaddingRelative(
            start = _iconPadding + iconView.measuredWidth,
            end = _actionPadding + actionView.measuredWidth,
        )
        _placeholderView.setPaddingRelative(
            editText.compoundPaddingStart,
            editText.compoundPaddingTop,
            editText.compoundPaddingEnd,
            editText.compoundPaddingBottom,
        )
    }

    @Suppress("RestrictedApi")
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        DescendantOffsetUtils.getDescendantRect(this, editText, _fieldBounds)
        calculateCollapsedTextBounds(_fieldBounds)
        calculateExpandedTextBounds(_fieldBounds)

        if (labelEnabled) {
            _collapsingTextHelper.setExpandedTextSize(editText.textSize)
            _collapsingTextHelper.setCollapsedTextGravity(
                Gravity.TOP or editText.gravity and Gravity.VERTICAL_GRAVITY_MASK.inv(),
            )
            _collapsingTextHelper.setExpandedTextGravity(editText.gravity)
            _placeholderView.gravity = editText.gravity

            _collapsingTextHelper.setCollapsedBounds(_collapsedBounds)
            _collapsingTextHelper.setExpandedBounds(_expandedBounds)
            _collapsingTextHelper.recalculate()
        }
    }

    override fun draw(canvas: Canvas) {
        super.draw(canvas)
        if (DRAW_DEBUG) {
            canvas.drawRect(_fieldBounds, DebugPaint.configure(color = Color.RED, style = Paint.Style.STROKE))
            canvas.drawRect(_collapsedBounds, DebugPaint.configure(color = Color.GREEN, style = Paint.Style.STROKE))
            canvas.drawRect(_expandedBounds, DebugPaint.configure(color = Color.BLUE, style = Paint.Style.STROKE))
            canvas.drawLine(
                _fieldBounds.left.toFloat(),
                _fieldBounds.exactCenterY(),
                _fieldBounds.right.toFloat(),
                _fieldBounds.exactCenterY(),
                DebugPaint.configure(color = Color.RED, style = Paint.Style.STROKE),
            )
        }
        if (labelEnabled) {
            _collapsingTextHelper.draw(canvas)
        }
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val state = super.onCreateDrawableState(extraSpace + 2)
        if (labelEnabled) {
            mergeDrawableStates(state, intArrayOf(R.attr.sd_state_inner_label))
        }
        if (editText.isReadOnly) {
            mergeDrawableStates(state, intArrayOf(R.attr.sd_state_readonly))
        }
        return state
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        // Избавляемся от бесконечной рекурсии из-за setAddStatesFromChildren(true)
        if (_inDrawableStateChanged) return

        _inDrawableStateChanged = true
        val changed = _collapsingTextHelper.setState(drawableState)

        updateTextState(isLaidOut && isEnabled)

        if (changed) {
            invalidate()
        }

        _inDrawableStateChanged = false
    }

    @Suppress("CustomViewStyleable")
    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SdDecoratedFieldBox, defStyleAttr, 0)
        _iconSize = typedArray.getDimensionPixelSize(
            R.styleable.SdDecoratedFieldBox_sd_iconSize,
            LinearLayout.LayoutParams.WRAP_CONTENT,
        )
        _iconPadding = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_iconPadding, 0)
        setIcon(typedArray.getDrawable(R.styleable.SdDecoratedFieldBox_sd_icon))
        setIconTint(typedArray.getColorStateList(R.styleable.SdDecoratedFieldBox_sd_iconTint))

        _actionSize = typedArray.getDimensionPixelSize(
            R.styleable.SdDecoratedFieldBox_sd_actionSize,
            LinearLayout.LayoutParams.WRAP_CONTENT,
        )
        _actionPadding = typedArray.getDimensionPixelOffset(R.styleable.SdDecoratedFieldBox_sd_actionPadding, 0)
        setAction(typedArray.getDrawable(R.styleable.SdDecoratedFieldBox_sd_action))
        setActionTint(typedArray.getColorStateList(R.styleable.SdDecoratedFieldBox_sd_actionTint))

        val boxPadding = typedArray.getDimensionPixelOffset(R.styleable.SdDecoratedFieldBox_sd_boxPadding, 0)
        _boxPaddingStart =
            typedArray.getDimensionPixelOffset(R.styleable.SdDecoratedFieldBox_sd_boxPaddingStart, boxPadding)
        _boxPaddingTop =
            typedArray.getDimensionPixelOffset(R.styleable.SdDecoratedFieldBox_sd_boxPaddingTop, boxPadding)
        _boxPaddingEnd =
            typedArray.getDimensionPixelOffset(R.styleable.SdDecoratedFieldBox_sd_boxPaddingEnd, boxPadding)
        _boxPaddingBottom =
            typedArray.getDimensionPixelOffset(R.styleable.SdDecoratedFieldBox_sd_boxPaddingBottom, boxPadding)
        backgroundTintList = typedArray.getColorStateList(R.styleable.SdDecoratedFieldBox_sd_boxTint)
        setPaddingRelative(_boxPaddingStart, _boxPaddingTop, _boxPaddingEnd, _boxPaddingBottom)
        _labelPadding = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_innerLabelPadding, 0)
        state = ViewState.obtain(context, attrs, defStyleAttr)
        typedArray.recycle()
    }

    private fun innerLabelCollapsedHeight(): Int {
        return _collapsingTextHelper.collapsedTextHeight.toInt()
    }

    private fun updateTextState(animate: Boolean, force: Boolean = false) {
        val hasText = !editText.text.isNullOrEmpty()
        val isEnabledWithFocus = isEnabled && editText.hasFocus()
        val currentPlaceholder = placeholder
        var needInvalidate = true

        _collapsingTextHelper.setExpandedTextColor(editText.textColors)
        _placeholderView.isVisible = !currentPlaceholder.isNullOrEmpty() && !hasText

        if (labelEnabled) {
            if (hasText || _placeholderView.isVisible || isEnabledWithFocus) {
                if (force || isExpanded) {
                    needInvalidate = false
                    collapseLabel(animate)
                }
            } else {
                if (force || !isExpanded) {
                    needInvalidate = false
                    expandLabel(animate)
                }
            }
        }

        if (needInvalidate) {
            postInvalidate()
        }
    }

    override fun getBaseline(): Int {
        return editText.baseline + _collapsingTextHelper.collapsedTextHeight.toInt() + paddingTop
    }

    private fun calculateCollapsedTextBounds(bounds: Rect): Rect {
        _collapsedBounds.apply {
            left = bounds.left + editText.compoundPaddingLeft
            top = paddingTop
            right = bounds.right - editText.compoundPaddingRight
            bottom = top + innerLabelCollapsedHeight()
        }
        return _collapsedBounds
    }

    private fun calculateExpandedTextBounds(bounds: Rect): Rect {
        val labelHeight = _collapsingTextHelper.expandedTextHeight.toInt()
        val labelTop: Int = if (editText.maxLines == 1) {
            maxOf(paddingTop, (measuredHeight - labelHeight) / 2)
        } else {
            bounds.top + editText.compoundPaddingTop
        }
        val labelBottom = if (editText.maxLines == 1) {
            labelTop + labelHeight
        } else {
            bounds.bottom - editText.compoundPaddingBottom
        }

        _expandedBounds.set(
            bounds.left + editText.compoundPaddingLeft,
            labelTop,
            bounds.right - editText.compoundPaddingRight,
            labelBottom,
        )
        return _expandedBounds
    }

    private fun collapseLabel(animate: Boolean) {
        if (_animator.isRunning) _animator.cancel()
        isExpanded = false
        if (animate && _labelAnimationEnabled && !isInEditMode) {
            animateToExpansionFraction(1f)
        } else {
            _collapsingTextHelper.expansionFraction = 1f
        }
    }

    private fun expandLabel(animate: Boolean) {
        if (_animator.isRunning) _animator.cancel()
        isExpanded = true

        if (animate && _labelAnimationEnabled && !isInEditMode) {
            animateToExpansionFraction(0f)
        } else {
            _collapsingTextHelper.expansionFraction = 0f
        }
    }

    private fun animateToExpansionFraction(target: Float) {
        if (_collapsingTextHelper.expansionFraction == target) return

        _animator.setFloatValues(_collapsingTextHelper.expansionFraction, target)
        _animator.start()
    }

    private companion object {
        const val DRAW_DEBUG = false
        const val LABEL_ANIMATION_DURATION = 120L
        val DebugPaint: Paint by unsafeLazy {
            Paint().apply {
                isAntiAlias = true
                color = Color.CYAN
                strokeWidth = 3f
            }
        }
    }
}
