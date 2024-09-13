package com.sdds.uikit.internal.textfield

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.text.InputType
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.annotation.StyleRes
import androidx.core.view.children
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.view.postDelayed
import androidx.core.view.setPadding
import androidx.core.view.updateMarginsRelative
import androidx.core.view.updatePadding
import androidx.core.view.updatePaddingRelative
import androidx.core.widget.addTextChangedListener
import com.google.android.material.internal.DescendantOffsetUtils
import com.sdds.uikit.ChipGroup
import com.sdds.uikit.FlowLayout
import com.sdds.uikit.ImageView
import com.sdds.uikit.R
import com.sdds.uikit.TextView
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.internal.base.shape.Shapeable
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.shape.ShapeModel
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
) : FlowLayout(context, attrs, defStyleAttr), ViewStateHolder {

    private val _shapeHelper = ShapeHelper(this, attrs, defStyleAttr)
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
    private val _captionView: TextView by unsafeLazy {
        TextView(context).apply {
            id = R.id.sd_textFieldCaption
            includeFontPadding = false
        }
    }

    private val _counterView: TextView by unsafeLazy {
        TextView(context).apply {
            id = R.id.sd_textFieldCounter
            includeFontPadding = false
        }
    }
    private val _field = StatefulEditText(context, attrs).apply {
        id = R.id.sd_textFieldEditText
        hint = null
        background = null
        clipToPadding = true
        minEms = 1
        gravity = Gravity.TOP or Gravity.START
        isVerticalScrollBarEnabled = false
        isHorizontalScrollBarEnabled = false
        setPadding(0)
        this.addTextChangedListener(
            afterTextChanged = {
                updateTextState(false)
            },
        )
    }
    private lateinit var _editableContainer: FrameLayout
    private lateinit var chipGroup: ChipGroupWithEditText
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
    private var _helperTextPadding: Int = 0
    private var _labelAnimationEnabled: Boolean = true

    private var isExpanded: Boolean = false

    @StyleRes
    private var _chipGroupStyleOverlay: Int = 0
    private var _chipsPadding: Int = 0
    private var _tempRect: Rect = Rect()
    private var _allowBreakLines: Boolean = true
    private var _placeholderColors: ColorStateList? = null
    private var _smoothScrollRunnable: Runnable? = null

    val editText: StatefulEditText
        get() = _field

    val iconView: ImageView
        get() = _iconView

    val actionView: ImageView
        get() = _actionView

    var labelEnabled: Boolean = true
        get() = field && !hasChips()
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
                _actionView.state = field
                _iconView.state = field
                _field.state = field
            }
        }

    var placeholder: CharSequence?
        get() = editText.hint
        set(value) {
            if (editText.hint != value) {
                editText.hint = value
                updateTextState(false)
            }
        }

    var chipAdapter: ChipGroup.Adapter?
        get() = chipGroup.adapter
        set(value) {
            chipGroup.adapter = value
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
        initContent()
        updateTextOffset()
    }

    fun isSingleLine(): Boolean = editText.singleLine()

    fun setReadOnly(readonly: Boolean) {
        chipGroup.setReadOnly(readonly)
    }

    fun setIcon(drawable: Drawable?) {
        iconView.setImageDrawable(drawable)
        iconView.isVisible = drawable != null
        resetPaddings()
    }

    fun setIconTint(tint: ColorStateList?) {
        iconView.imageTintList = tint
    }

    fun setAction(drawable: Drawable?) {
        actionView.setImageDrawable(drawable)
        actionView.isVisible = drawable != null
        resetPaddings()
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

    fun setCaption(text: CharSequence?) {
        _captionView.text = text
        _captionView.isVisible = text?.isNotBlank() == true
        resetPaddings()
    }

    fun setCounter(text: CharSequence?) {
        _counterView.text = text
        _counterView.isVisible = text?.isNotBlank() == true
        resetPaddings()
    }

    fun setLabelAppearance(@StyleRes appearanceId: Int) {
        _collapsingTextHelper.setCollapsedTextAppearance(appearanceId)
        updateTextState(false)
    }

    fun setCaptionAppearance(@StyleRes appearanceId: Int) {
        _captionView.setTextAppearance(appearanceId)
    }

    fun setCounterAppearance(@StyleRes appearanceId: Int) {
        _counterView.setTextAppearance(appearanceId)
    }

    fun setLabelColor(colors: ColorStateList?) {
        if (_collapsingTextHelper.collapsedTextColor != colors) {
            _collapsingTextHelper.setCollapsedTextColor(colors)
            updateTextState(false)
        }
    }

    fun setPlaceholderColor(colors: ColorStateList?) {
        _placeholderColors = colors
        editText.setHintTextColor(colors)
    }

    fun setCaptionColor(colors: ColorStateList?) {
        _captionView.setTextColor(colors)
    }

    fun setCounterColor(colors: ColorStateList?) {
        _counterView.setTextColor(colors)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        chipGroup.isEnabled = enabled
    }

    internal fun shouldDisplayInnerLabel(): Boolean {
        val labelValueHeight = _collapsingTextHelper.run { expandedTextHeight.toInt() + collapsedTextHeight.toInt() }
        return (minimumHeight - labelValueHeight - _labelPadding - paddingTop - paddingBottom) >= 0
    }

    private fun getTextOffset(): Int = if (labelEnabled) innerLabelCollapsedHeight() + _labelPadding else 0

    internal fun updateTextOffset() {
        val valueOffset = getTextOffset()
        if (_editableContainer.paddingTop != valueOffset) {
            _editableContainer.updatePadding(top = valueOffset, bottom = 0)
        }
    }

    @Suppress("RestrictedApi")
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        DescendantOffsetUtils.getDescendantRect(this, _editableContainer, _fieldBounds)
        calculateCollapsedTextBounds(_fieldBounds)
        calculateExpandedTextBounds(_fieldBounds)

        if (labelEnabled) {
            _collapsingTextHelper.setExpandedTextSize(editText.textSize)
            _collapsingTextHelper.setCollapsedTextGravity(
                Gravity.TOP or editText.gravity and Gravity.VERTICAL_GRAVITY_MASK.inv(),
            )
            _collapsingTextHelper.setExpandedTextGravity(editText.gravity)

            _collapsingTextHelper.setCollapsedBounds(_collapsedBounds)
            _collapsingTextHelper.setExpandedBounds(_expandedBounds)
            _collapsingTextHelper.recalculate()
        }
    }

    override fun onMeasureChild(child: View, widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val containerHeightSpec = if (child == _editableContainer && !isSingleLine()) {
            val captionHeight = if (!_captionView.isGone) {
                super.onMeasureChild(_captionView, widthMeasureSpec, heightMeasureSpec)
                _captionView.measuredHeight + _helperTextPadding
            } else {
                0
            }
            val counterHeight = if (!_counterView.isGone) {
                super.onMeasureChild(_counterView, widthMeasureSpec, heightMeasureSpec)
                _counterView.measuredHeight + _helperTextPadding
            } else {
                0
            }
            val specHeight = MeasureSpec.getSize(heightMeasureSpec)
            val specMode = MeasureSpec.getMode(heightMeasureSpec)
            val newSpecHeight = specHeight - maxOf(captionHeight, counterHeight)
            if (newSpecHeight != specHeight) {
                MeasureSpec.makeMeasureSpec(newSpecHeight, specMode)
            } else {
                heightMeasureSpec
            }
        } else {
            heightMeasureSpec
        }
        super.onMeasureChild(child, widthMeasureSpec, containerHeightSpec)
    }

    override fun onLayoutChild(child: View, left: Int, top: Int, right: Int, bottom: Int, rowHeight: Int) {
        val needApplyOffset = child == iconView ||
            child == actionView ||
            (
                child == _editableContainer &&
                    editText.lineCount == 1 &&
                    editText.minLines == 1 &&
                    chipGroup.childCount == 1
                )
        val offset: Int = if (needApplyOffset) {
            ((calculateFirstRowHeight()) - (bottom - top)) / 2
        } else {
            0
        }
        super.onLayoutChild(child, left, top + offset, right, bottom + offset, rowHeight)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (DRAW_DEBUG) {
            canvas.drawRect(_fieldBounds, DebugPaint.configure(color = Color.RED, style = Paint.Style.STROKE))
            canvas.drawRect(_collapsedBounds, DebugPaint.configure(color = Color.GREEN, style = Paint.Style.STROKE))
            canvas.drawRect(_expandedBounds, DebugPaint.configure(color = Color.BLUE, style = Paint.Style.STROKE))
            canvas.drawLine(
                0f,
                height / 2f,
                width.toFloat(),
                height / 2f,
                DebugPaint.configure(color = Color.CYAN, style = Paint.Style.STROKE),
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

    override fun getBaseline(): Int {
        return editText.baseline + _collapsingTextHelper.collapsedTextHeight.toInt() + paddingTop
    }

    override fun performClick(): Boolean {
        val result = super.performClick()
        focusEditText()
        updateTextState(true)
        return result
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _editableContainer.removeCallbacks(_smoothScrollRunnable)
        _smoothScrollRunnable = null
    }

    @Suppress("CustomViewStyleable")
    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SdDecoratedFieldBox, defStyleAttr, 0)
        _iconSize = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_iconSize, 0)
        _iconPadding = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_iconPadding, 0)
        setIcon(typedArray.getDrawable(R.styleable.SdDecoratedFieldBox_sd_icon))
        setIconTint(typedArray.getColorStateList(R.styleable.SdDecoratedFieldBox_sd_iconTint))

        _actionSize = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_actionSize, 0)
        _actionPadding = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_actionPadding, 0)
        setAction(typedArray.getDrawable(R.styleable.SdDecoratedFieldBox_sd_action))
        setActionTint(typedArray.getColorStateList(R.styleable.SdDecoratedFieldBox_sd_actionTint))

        val boxPadding = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_boxPadding, 0)
        _boxPaddingStart =
            typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_boxPaddingStart, boxPadding)
        _boxPaddingTop =
            typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_boxPaddingTop, boxPadding)
        _boxPaddingEnd =
            typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_boxPaddingEnd, boxPadding)
        _boxPaddingBottom =
            typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_boxPaddingBottom, boxPadding)
        backgroundTintList = typedArray.getColorStateList(R.styleable.SdDecoratedFieldBox_sd_boxTint)
        _labelPadding = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_labelPadding, 0)
        _helperTextPadding = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_helperTextPadding, 0)
        state = ViewState.obtain(context, attrs, defStyleAttr)
        minimumHeight = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_boxMinHeight, 0)
        _chipGroupStyleOverlay = typedArray.getResourceId(R.styleable.SdDecoratedFieldBox_sd_chipGroupStyleOverlay, 0)
        _chipsPadding = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_chipsPadding, 0)
        _allowBreakLines = typedArray.getBoolean(R.styleable.SdDecoratedFieldBox_sd_allowBreakLines, true)

        editText.apply {
            inputType = typedArray.getInt(R.styleable.SdDecoratedFieldBox_android_inputType, InputType.TYPE_CLASS_TEXT)
            setImeActionLabel(
                typedArray.getString(R.styleable.SdDecoratedFieldBox_android_imeActionLabel),
                typedArray.getInt(R.styleable.SdDecoratedFieldBox_android_imeActionId, 0),
            )
            imeOptions =
                typedArray.getInt(R.styleable.SdDecoratedFieldBox_android_imeOptions, EditorInfo.IME_ACTION_UNSPECIFIED)
        }
        typedArray.recycle()
    }

    @Suppress()
    private fun initContent() {
        addView(
            iconView,
            generateDefaultLayoutParams().apply {
                width = if (_iconSize == 0) WRAP_CONTENT else _iconSize
                height = width
                gravity = Gravity.START or Gravity.TOP
                updateMarginsRelative(end = _iconPadding)
            },
        )

        addView(
            actionView,
            generateDefaultLayoutParams().apply {
                width = if (_actionSize == 0) WRAP_CONTENT else _actionSize
                height = width
                gravity = Gravity.END or Gravity.TOP
                updateMarginsRelative(start = _actionPadding)
            },
        )

        _editableContainer = if (isSingleLine()) HorizontalScrollView(context) else ScrollView(context)
        val chipTheme = if (_chipGroupStyleOverlay != 0) {
            ContextThemeWrapper(context, _chipGroupStyleOverlay)
        } else {
            context
        }
        chipGroup = ChipGroupWithEditText(chipTheme)
        chipGroup.addView(editText)
        _editableContainer.apply {
            setAddStatesFromChildren(true)
            backgroundTintList = ColorStateList.valueOf(Color.TRANSPARENT)
            isHorizontalScrollBarEnabled = false
            isVerticalScrollBarEnabled = false
            chipGroup.gravity = Gravity.START or Gravity.CENTER_VERTICAL
            addView(chipGroup)
        }
        addView(_editableContainer, LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply { occupy = true })

        addView(
            _counterView,
            generateDefaultLayoutParams().apply {
                gravity = Gravity.END or Gravity.TOP
                topMargin = _helperTextPadding
            },
        )
        addView(
            _captionView,
            generateDefaultLayoutParams().apply {
                gravity = Gravity.START or Gravity.TOP
                topMargin = _helperTextPadding
                occupy = true
            },
        )
        resetPaddings()
    }

    private fun resetPaddings() {
        val needOverridePaddings = _chipsPadding > 0 && hasChips()
        val paddingStart = if (needOverridePaddings && iconView.isGone) _chipsPadding else _boxPaddingStart
        val paddingTop = if (needOverridePaddings) _chipsPadding else _boxPaddingTop
        val paddingEnd = if (needOverridePaddings && actionView.isGone) _chipsPadding else _boxPaddingEnd
        val paddingBottom =
            if (needOverridePaddings && _captionView.isGone && _counterView.isGone) _chipsPadding else _boxPaddingEnd

        val valueMarginStart = if (needOverridePaddings) _boxPaddingStart - _chipsPadding else 0
        val valueMarginEnd = if (needOverridePaddings) _boxPaddingEnd - _chipsPadding else 0
        val textMarginStart = if (iconView.isGone) valueMarginStart else 0
        val textMarginEnd = if (actionView.isGone) valueMarginEnd else 0
        editText.updatePaddingRelative(start = valueMarginStart, end = valueMarginEnd)
        _captionView.updatePaddingRelative(start = textMarginStart, end = textMarginEnd)
        _counterView.updatePaddingRelative(start = textMarginStart, end = textMarginEnd)
        setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom)
    }

    private fun innerLabelCollapsedHeight(): Int {
        return _collapsingTextHelper.collapsedTextHeight.toInt()
    }

    private fun hasChips(): Boolean = ::chipGroup.isInitialized && chipGroup.childCount > 1

    private fun updateTextState(animate: Boolean, force: Boolean = false) {
        val hasText = !editText.text.isNullOrEmpty()
        val isEnabledWithFocus = isEnabled && editText.hasFocus()
        editText.setHintTextColor(
            if (!hasText && hasChips() && isEnabledWithFocus) {
                ColorStateList.valueOf(Color.TRANSPARENT)
            } else {
                _placeholderColors
            },
        )
        var needInvalidate = true

        _collapsingTextHelper.setExpandedTextColor(editText.textColors)

        if (labelEnabled) {
            if (hasText || isEnabledWithFocus) {
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

    private fun calculateFirstRowHeight(): Int {
        val contentFirstRowHeight = if (hasChips()) {
            chipGroup.getRowBounds(0, _tempRect)
            _tempRect.height()
        } else {
            getValueFirstLineHeight()
        }
        val iconHeight = if (iconView.isVisible) iconView.measuredHeight else 0
        val actionHeight = if (actionView.isVisible) actionView.measuredHeight else 0
        return maxOf(iconHeight, actionHeight, contentFirstRowHeight)
    }

    private fun getValueFirstLineHeight(): Int {
        editText.getLineBounds(0, _tempRect)
        return _tempRect.bottom + getTextOffset()
    }

    private fun calculateCollapsedTextBounds(bounds: Rect): Rect {
        _collapsedBounds.apply {
            left = bounds.left
            top = paddingTop
            right = bounds.right
            bottom = top + innerLabelCollapsedHeight()
        }
        return _collapsedBounds
    }

    private fun calculateExpandedTextBounds(bounds: Rect): Rect {
        val labelHeight = _collapsingTextHelper.expandedTextHeight.toInt()
        val labelTop: Int = paddingTop + (calculateFirstRowHeight() - labelHeight) / 2
        val labelBottom = labelTop + labelHeight

        _expandedBounds.set(
            bounds.left,
            labelTop,
            bounds.right,
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

    private fun focusEditText() {
        editText.requestFocus()
        if (!isSingleLine()) {
            _editableContainer.removeCallbacks(_smoothScrollRunnable)
            _smoothScrollRunnable = _editableContainer.postDelayed(100) {
                (_editableContainer as? ScrollView)?.smoothScrollTo(editText.left, editText.bottom)
            }
        }
    }

    private inner class ChipGroupWithEditText(context: Context) : ChipGroup(context) {
        private var _minTextRowHeight: Int = 0
        private var _editTextWasInFocus: Boolean = false
        private var groupShapeHelper: ShapeHelper? = null

        init {
            setAddStatesFromChildren(true)
        }

        fun setReadOnly(readonly: Boolean) {
            editText.isReadOnly = readonly
            children.forEach {
                if (it != editText) it.isEnabled = !readonly
            }
        }

        override fun repopulate() {
            _editTextWasInFocus = editText.isFocused
            super.repopulate()
            applyClip()
            updateEditText()
        }

        override fun setEnabled(enabled: Boolean) {
            super.setEnabled(enabled)
            children.forEach {
                it.isEnabled = !editText.isReadOnly && enabled
            }
        }

        override fun calculateRowHeight(child: View, layoutParams: LayoutParams): Int {
            val rowHeight = super.calculateRowHeight(child, layoutParams)
            return if (child == editText && _minTextRowHeight > 0) {
                val offset = (_minTextRowHeight - getValueFirstLineHeight()) / 2
                rowHeight + offset
            } else {
                rowHeight
            }
        }

        override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
            _minTextRowHeight = 0
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        }

        override fun onMeasureChild(child: View, widthMeasureSpec: Int, heightMeasureSpec: Int) {
            super.onMeasureChild(child, widthMeasureSpec, heightMeasureSpec)
            if (child != editText) _minTextRowHeight = maxOf(child.measuredHeight, _minTextRowHeight)
        }

        override fun onLayoutChild(child: View, left: Int, top: Int, right: Int, bottom: Int, rowHeight: Int) {
            val offset = if (child == editText && _minTextRowHeight > 0) {
                (_minTextRowHeight - getValueFirstLineHeight()) / 2
            } else {
                0
            }
            super.onLayoutChild(child, left, top + offset, right, bottom + offset, rowHeight)
        }

        private fun updateEditText() {
            if (childCount > 0) editText.text = null
            addView(editText, generateDefaultLayoutParams().apply { gravity = Gravity.TOP })
            editText.allowBreakLines = _allowBreakLines
            resetPaddings()
            if (_editTextWasInFocus) focusEditText()
        }

        private fun applyClip() {
            val needClip = childCount > 1
            _editableContainer.clipToOutline = needClip
            if (!needClip) return
            var shape: ShapeModel? = null
            children.forEach {
                val childShape = (it as Shapeable).shape
                if (shape != null && shape != childShape) return
                shape = childShape
            }
            if (groupShapeHelper == null) {
                groupShapeHelper = ShapeHelper(_editableContainer)
            }
            groupShapeHelper?.setShape(shape ?: return)
        }
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
