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
import android.view.GestureDetector.SimpleOnGestureListener
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.annotation.StyleRes
import androidx.core.view.GestureDetectorCompat
import androidx.core.view.children
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.view.postDelayed
import androidx.core.view.setPadding
import androidx.core.view.updateMarginsRelative
import androidx.core.view.updatePadding
import androidx.core.view.updatePaddingRelative
import androidx.core.widget.NestedScrollView
import androidx.core.widget.addTextChangedListener
import com.google.android.material.internal.DescendantOffsetUtils
import com.sdds.uikit.CellLayout
import com.sdds.uikit.ChipGroup
import com.sdds.uikit.FlowLayout
import com.sdds.uikit.ImageView
import com.sdds.uikit.R
import com.sdds.uikit.TextField
import com.sdds.uikit.TextField.Companion.MASK_DISPLAY_MODE_ALWAYS
import com.sdds.uikit.TextField.Mask
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.drawable.TextDrawable
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.fullHeight
import com.sdds.uikit.internal.base.fullWidth
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.internal.textfield.mask.MaskedEditText
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeable
import kotlin.math.roundToInt

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
) : ViewGroup(context), ColorStateHolder, Shapeable {

    private val _gestureDetector = GestureDetectorCompat(
        context,
        object : SimpleOnGestureListener() {
            override fun onDown(e: MotionEvent): Boolean {
                return true
            }

            override fun onSingleTapUp(e: MotionEvent): Boolean {
                handleTap()
                return true
            }
        },
    )
    private val focusSelectorDelegate: FocusSelectorDelegate = FocusSelectorDelegate()
    private val _shapeable: Shapeable = shapeable(attrs, defStyleAttr)
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
    private val _iconView: TextFieldImageView by unsafeLazy {
        TextFieldImageView(context).apply {
            id = generateViewId()
        }
    }
    private val _actionView: TextFieldImageView by unsafeLazy {
        TextFieldImageView(context).apply {
            id = generateViewId()
        }
    }
    private val _captionView: TextFieldTextView by unsafeLazy {
        TextFieldTextView(context).apply {
            id = generateViewId()
            includeFontPadding = false
            isClickable = false
        }
    }

    private val _counterView: TextFieldTextView by unsafeLazy {
        TextFieldTextView(context).apply {
            id = generateViewId()
            includeFontPadding = false
            isClickable = false
        }
    }
    private val _field = MaskedEditText(context).apply {
        id = generateViewId()
        hint = null
        background = null
        clipToPadding = true
        gravity = Gravity.TOP or Gravity.START
        isVerticalScrollBarEnabled = false
        isHorizontalScrollBarEnabled = false
        isFocusable = true
        isFocusableInTouchMode = true
        isClickable = true
        isLongClickable = true
        showSoftInputOnFocus = true
        setTextIsSelectable(true)
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

    private var _alignmentLineHeight: Int = 0
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
    private var _smoothScrollRunnable: Runnable? = null

    private val _scrollBarTrackDrawable: Drawable = ScrollBarIndicatorDrawable(context).apply {
        callback = this@DecoratedFieldBox
    }
    private val _scrollBarThumbDrawable: Drawable = ScrollBarIndicatorDrawable(context).apply {
        callback = this@DecoratedFieldBox
    }
    private var _scrollBarEnabled: Boolean = false
    private var _scrollBarThickness: Int = 0
    private var _scrollBarPaddingTop: Int = 0
    private var _scrollBarPaddingStart: Int = 0
    private var _scrollBarPaddingEnd: Int = 0
    private var _scrollBarPaddingBottom: Int = 0
    private var _scrollBarTrackColors: ColorStateList? = null
    private var _scrollBarThumbColors: ColorStateList? = null
    private val _shouldDrawScrollBar: Boolean
        get() {
            val chipsContentHeight = chipGroup.measuredHeight + _editableContainer.paddingTop +
                _editableContainer.paddingBottom
            return _scrollBarEnabled && _editableContainer.measuredHeight < chipsContentHeight
        }

    val editText: MaskedEditText
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
                invalidate()
                requestLayout()
            }
        }

    var maximumHeight: Int = Int.MAX_VALUE
        set(value) {
            if (field != value) {
                field = value
                invalidate()
                requestLayout()
            }
        }

    override var colorState: ColorState? = null
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
            _actionView.colorState = field
            _iconView.colorState = field
            _field.colorState = field
            _captionView.colorState = field
            _counterView.colorState = field
        }

    var placeholder: CharSequence?
        get() = editText.placeholder
        set(value) {
            if (editText.placeholder != value) {
                editText.placeholder = value
                updateTextState(false)
            }
        }

    var chipAdapter: ChipGroup.Adapter?
        get() = chipGroup.adapter
        set(value) {
            chipGroup.adapter = value
        }

    /**
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _shapeable.shape

    init {
        setWillNotDraw(false)
        obtainAttributes(context, attrs, defStyleAttr)
        setFocusDelegate(context, attrs, defStyleAttr)
        _collapsingTextHelper.apply {
            setTextSizeInterpolator(AnimationUtils.LINEAR_INTERPOLATOR)
            setPositionInterpolator(AnimationUtils.LINEAR_INTERPOLATOR)
            setTypefaces(editText.typeface)
            setExpandedTextSize(editText.textSize)
            setCollapsedTextGravity(Gravity.TOP or editText.gravity and Gravity.VERTICAL_GRAVITY_MASK.inv())
        }
        initContent()
        updateTextOffset()
        setChildrenDuplicateParentState(true)
    }

    private fun setChildrenDuplicateParentState(enabled: Boolean) {
        _iconView.isDuplicateParentStateEnabled = enabled
        _iconView.refreshDrawableState()

        _actionView.isDuplicateParentStateEnabled = enabled
        _actionView.refreshDrawableState()

        _captionView.isDuplicateParentStateEnabled = enabled
        _captionView.refreshDrawableState()

        _counterView.isDuplicateParentStateEnabled = enabled
        _counterView.refreshDrawableState()

        _editableContainer.isDuplicateParentStateEnabled = enabled
        _editableContainer.refreshDrawableState()

        chipGroup.isDuplicateParentStateEnabled = enabled
        chipGroup.refreshDrawableState()

        _field.isDuplicateParentStateEnabled = enabled
        _field.refreshDrawableState()
    }

    fun isSingleLine(): Boolean = editText.singleLine()

    fun setReadOnly(readonly: Boolean) {
        chipGroup.setReadOnly(readonly)
        _captionView.isReadOnly = readonly
        _counterView.isReadOnly = readonly
        _iconView.isReadOnly = readonly
        _actionView.isReadOnly = readonly
        refreshDrawableState()
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
        editText.setPlaceholderColors(colors)
    }

    fun setCaptionColor(colors: ColorStateList?) {
        _captionView.setTextColor(colors)
    }

    fun setCounterColor(colors: ColorStateList?) {
        _counterView.setTextColor(colors)
    }

    fun setMask(mask: Mask?, displayMode: Int = MASK_DISPLAY_MODE_ALWAYS) {
        _field.apply {
            this.mask = mask
            maskDisplayMode = displayMode
            updateTextState(true)
        }
    }

    fun getCompoundPaddingStart(): Int =
        paddingStart + if (iconView.isVisible) iconView.measuredWidth + _iconPadding else 0

    fun getCompoundPaddingEnd(): Int =
        paddingEnd + if (actionView.isVisible) actionView.measuredWidth + _actionPadding else 0

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        children.forEach { it.isEnabled = enabled }
        chipGroup.isEnabled = enabled
    }

    private fun getTextOffset(): Int = if (labelEnabled) innerLabelCollapsedHeight() + _labelPadding else 0

    internal fun updateTextOffset() {
        val valueOffset = getTextOffset()
        if (_editableContainer.paddingTop != valueOffset) {
            _editableContainer.updatePadding(top = valueOffset, bottom = 0)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        var totalHeight = 0
        var totalWidth = 0
        var helperTotalWidth = 0

        measureChild(_counterView, widthMeasureSpec, heightMeasureSpec, helperTotalWidth, totalHeight)
        helperTotalWidth += _counterView.fullWidth()

        measureChild(_captionView, widthMeasureSpec, heightMeasureSpec, helperTotalWidth, totalHeight)
        helperTotalWidth += _captionView.fullWidth()

        totalHeight += maxOf(_captionView.fullHeight(), _counterView.fullHeight())

        measureChild(_iconView, widthMeasureSpec, heightMeasureSpec, totalWidth, totalHeight)
        totalWidth += _iconView.fullWidth()

        measureChild(_actionView, widthMeasureSpec, heightMeasureSpec, totalWidth, totalHeight)
        totalWidth += _actionView.fullWidth()

        measureChild(_editableContainer, widthMeasureSpec, heightMeasureSpec, totalWidth, totalHeight)
        totalWidth += _editableContainer.fullWidth()

        totalWidth = maxOf(totalWidth, helperTotalWidth) + paddingStart + paddingEnd
        totalHeight += +paddingTop + paddingBottom + maxOf(
            _iconView.fullHeight(),
            _actionView.fullHeight(),
            _editableContainer.fullHeight(),
        )

        val desiredWidth = when (widthMode) {
            MeasureSpec.EXACTLY -> specWidth
            MeasureSpec.AT_MOST -> minOf(totalWidth, specWidth)
            else -> totalWidth
        }
        val desiredHeight = when (heightMode) {
            MeasureSpec.EXACTLY -> specHeight
            MeasureSpec.AT_MOST -> minOf(totalHeight, specHeight)
            else -> totalHeight
        }
        setMeasuredDimension(
            desiredWidth.coerceAtLeast(minimumWidth),
            desiredHeight.coerceIn(minimumHeight, maximumHeight),
        )
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        var childLeft = paddingLeft
        var childTop = paddingTop

        val firstRowHeight = calculateFirstRowHeight()
        layoutChild(_iconView, childLeft, childTop + (firstRowHeight - _iconView.fullHeight()) / 2)
        childLeft += _iconView.fullWidth()

        layoutChild(_editableContainer, childLeft, childTop)
        childLeft += _editableContainer.fullWidth()

        layoutChild(
            _actionView,
            measuredWidth - paddingRight - _actionView.fullWidth(),
            childTop + (firstRowHeight - _actionView.fullHeight()) / 2,
        )
        childTop += maxOf(_iconView.fullHeight(), _actionView.fullHeight(), _editableContainer.fullHeight())
        childLeft = paddingLeft

        layoutChild(_captionView, childLeft, childTop)
        childLeft += _captionView.fullWidth()

        layoutChild(_counterView, measuredWidth - paddingRight - _counterView.fullWidth(), childTop)
        adjustEditable()
    }

    private fun measureChild(
        child: View,
        widthMeasureSpec: Int,
        heightMeasureSpec: Int,
        usedWidth: Int,
        usedHeight: Int,
    ) {
        if (child.isGone) return
        measureChildWithMargins(child, widthMeasureSpec, usedWidth, heightMeasureSpec, usedHeight)
    }

    private fun layoutChild(child: View, childLeft: Int, childTop: Int) {
        if (child.isGone) return
        val lp = child.layoutParams as MarginLayoutParams
        val l = childLeft + lp.leftMargin
        val t = childTop + lp.topMargin
        child.layout(
            l,
            t,
            l + child.measuredWidth,
            t + child.measuredHeight,
        )
    }

    @Suppress("RestrictedApi")
    private fun adjustEditable() {
        DescendantOffsetUtils.getDescendantRect(this, _editableContainer, _fieldBounds)
        calculateCollapsedTextBounds(_fieldBounds)
        calculateExpandedTextBounds(_fieldBounds)

        if (labelEnabled) {
            _collapsingTextHelper.setExpandedTextSize(editText.textSize)
            _collapsingTextHelper.setCollapsedTextGravity(
                Gravity.TOP or editText.gravity and Gravity.VERTICAL_GRAVITY_MASK.inv(),
            )

            _collapsingTextHelper.setCollapsedBounds(_collapsedBounds)
            _collapsingTextHelper.setExpandedBounds(_expandedBounds)
            _collapsingTextHelper.recalculate()
        }
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

        if (_shouldDrawScrollBar) {
            drawScrollBar(canvas)
        }
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 3)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        if (labelEnabled) {
            mergeDrawableStates(drawableState, intArrayOf(R.attr.sd_state_inner_label))
        }
        if (editText?.isReadOnly == true) {
            mergeDrawableStates(drawableState, intArrayOf(R.attr.sd_state_readonly))
        }
        return drawableState
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        // Избавляемся от бесконечной рекурсии из-за setAddStatesFromChildren(true)
        if (_inDrawableStateChanged) return

        _inDrawableStateChanged = true
        _scrollBarThumbDrawable.state = drawableState
        _scrollBarTrackDrawable.state = drawableState
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
        handleTap()
        return result
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _scrollBarThumbDrawable || who == _scrollBarTrackDrawable
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _editableContainer.removeCallbacks(_smoothScrollRunnable)
        _smoothScrollRunnable = null
    }

    override fun generateDefaultLayoutParams(): MarginLayoutParams {
        return MarginLayoutParams(
            WRAP_CONTENT,
            WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: LayoutParams?): Boolean {
        return p is MarginLayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        return CellLayout.LayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: LayoutParams?): LayoutParams {
        return MarginLayoutParams(p)
    }

    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
        focusSelectorDelegate.updateFocusSelector(this, gainFocus)
        setChildrenDuplicateParentState(gainFocus && !isActivated)
    }

    override fun setPressed(pressed: Boolean) {
        if (isPressed != pressed) {
            focusSelectorDelegate.handlePressedChange(this, pressed)
        }
        super.setPressed(pressed)
    }

    @Suppress("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return _gestureDetector.onTouchEvent(event)
    }

    @Suppress("CustomViewStyleable", "LongMethod")
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
        colorState = ColorState.obtain(context, attrs, defStyleAttr)
        _alignmentLineHeight = typedArray.getDimensionPixelSize(
            R.styleable.SdDecoratedFieldBox_sd_alignmentLineHeight,
            0,
        )
        _chipGroupStyleOverlay = typedArray.getResourceId(R.styleable.SdDecoratedFieldBox_sd_chipGroupStyleOverlay, 0)
        _chipsPadding = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_chipsPadding, 0)
        _allowBreakLines = typedArray.getBoolean(R.styleable.SdDecoratedFieldBox_sd_allowBreakLines, true)

        _scrollBarEnabled = typedArray.getBoolean(R.styleable.SdDecoratedFieldBox_sd_scrollBarEnabled, false)
        _scrollBarThickness = typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_scrollBarThickness, 0)
        _scrollBarPaddingTop =
            typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_scrollBarPaddingTop, 0)
        _scrollBarPaddingStart =
            typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_scrollBarPaddingStart, 0)
        _scrollBarPaddingEnd =
            typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_scrollBarPaddingEnd, 0)
        _scrollBarPaddingBottom =
            typedArray.getDimensionPixelSize(R.styleable.SdDecoratedFieldBox_sd_scrollBarPaddingBottom, 0)
        _scrollBarTrackColors = typedArray.getColorStateList(R.styleable.SdDecoratedFieldBox_sd_scrollBarTrackColor)
        _scrollBarThumbColors = typedArray.getColorStateList(R.styleable.SdDecoratedFieldBox_sd_scrollBarThumbColor)

        editText.apply {
            inputType = typedArray.getInt(R.styleable.SdDecoratedFieldBox_android_inputType, InputType.TYPE_CLASS_TEXT)
            val maskPattern = typedArray.getString(R.styleable.SdDecoratedFieldBox_sd_inputMask)
            if (maskPattern != null) mask = TextField.Mask.Custom(maskPattern)
            maskDisplayMode = typedArray.getInt(
                R.styleable.SdDecoratedFieldBox_sd_inputMaskDisplayMode,
                MaskedEditText.MASK_DISPLAY_MODE_ALWAYS,
            )
            setImeActionLabel(
                typedArray.getString(R.styleable.SdDecoratedFieldBox_android_imeActionLabel),
                typedArray.getInt(R.styleable.SdDecoratedFieldBox_android_imeActionId, 0),
            )
            imeOptions =
                typedArray.getInt(R.styleable.SdDecoratedFieldBox_android_imeOptions, EditorInfo.IME_ACTION_UNSPECIFIED)
            prefixTextPadding = typedArray.getDimensionPixelSize(
                R.styleable.SdDecoratedFieldBox_sd_prefixTextPadding,
                0,
            )
            suffixTextPadding = typedArray.getDimensionPixelSize(
                R.styleable.SdDecoratedFieldBox_sd_suffixTextPadding,
                0,
            )
            val prefixText = typedArray.getString(R.styleable.SdDecoratedFieldBox_sd_prefixText)
            val prefixDrawable = typedArray.getDrawable(R.styleable.SdDecoratedFieldBox_sd_prefixDrawable)
            prefix = prefixDrawable ?: prefixText?.let { TextDrawable(context).apply { text = it } }

            val suffixText = typedArray.getString(R.styleable.SdDecoratedFieldBox_sd_suffixText)
            val suffixDrawable = typedArray.getDrawable(R.styleable.SdDecoratedFieldBox_sd_suffixDrawable)
            suffix = suffixDrawable ?: suffixText?.let { TextDrawable(context).apply { text = it } }
            if (singleLine()) maxLines = 1
        }
        typedArray.recycle()
    }

    private fun setFocusDelegate(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        isFocusable = true
        isClickable = true
        focusSelectorDelegate.applySelector(this, context, attrs, defStyleAttr)
        if (!focusSelectorDelegate.isEnabled) {
            isFocusable = false
        }
    }

    private fun handleTap() {
        focusEditText()
        updateTextState(true)
    }

    @Suppress()
    private fun initContent() {
        addView(
            iconView,
            generateDefaultLayoutParams().apply {
                width = if (_iconSize == 0) WRAP_CONTENT else _iconSize
                height = width
                updateMarginsRelative(end = _iconPadding)
            },
        )
        configureEditableContainer()
        val editableLp = if (isSingleLine()) {
            LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        } else {
            LayoutParams(MATCH_PARENT, WRAP_CONTENT)
        }
        addView(_editableContainer, editableLp)
        addView(
            actionView,
            generateDefaultLayoutParams().apply {
                width = if (_actionSize == 0) WRAP_CONTENT else _actionSize
                height = width
                updateMarginsRelative(start = _actionPadding)
            },
        )
        addView(
            _counterView,
            generateDefaultLayoutParams().apply {
                topMargin = _helperTextPadding
            },
        )
        addView(
            _captionView,
            generateDefaultLayoutParams().apply {
                topMargin = _helperTextPadding
            },
        )
        resetPaddings()
    }

    private fun configureEditableContainer() {
        _editableContainer = if (isSingleLine()) HorizontalScrollView(context) else NestedScrollView(context)
        val chipTheme = if (_chipGroupStyleOverlay != 0) {
            ContextThemeWrapper(context, _chipGroupStyleOverlay)
        } else {
            context
        }
        chipGroup = ChipGroupWithEditText(chipTheme)
        _editableContainer.apply {
            clipChildren = false
            backgroundTintList = ColorStateList.valueOf(Color.TRANSPARENT)
            isHorizontalScrollBarEnabled = false
            isVerticalScrollBarEnabled = false
            chipGroup.alignment = FlowLayout.ALIGNMENT_CENTER
            addView(chipGroup, LayoutParams(WRAP_CONTENT, WRAP_CONTENT))
            chipGroup.repopulate()
        }
        _scrollBarTrackDrawable.setTintList(_scrollBarTrackColors)
        _scrollBarThumbDrawable.setTintList(_scrollBarThumbColors)
    }

    private fun resetPaddings() {
        val needOverridePaddings = _chipsPadding > 0 && hasChips()
        val paddingStart = if (needOverridePaddings && iconView.isGone) _chipsPadding else _boxPaddingStart
        val paddingTop = if (needOverridePaddings) _chipsPadding else _boxPaddingTop
        val paddingEnd = if (needOverridePaddings && actionView.isGone) _chipsPadding else _boxPaddingEnd
        val paddingBottom =
            if (needOverridePaddings && _captionView.isGone && _counterView.isGone) _chipsPadding else _boxPaddingBottom

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

    @Suppress("CyclomaticComplexMethod")
    private fun updateTextState(animate: Boolean, force: Boolean = false) {
        val hasText = !editText.text.isNullOrEmpty() || editText.isMaskVisible
        val isEnabledWithFocus = isEnabled && editText.hasFocus()
        editText.placeholderEnabled = !hasText && if (hasChips()) !isEnabledWithFocus else true
        var needInvalidate = true
        val placeholderVisible = editText.placeholderEnabled && !editText.placeholder.isNullOrEmpty()
        val helpersVisible = placeholderVisible || editText.hasPrefix() || editText.hasSuffix()
        _collapsingTextHelper.setExpandedTextColor(editText.hintTextColors)

        if (labelEnabled) {
            if (hasText || helpersVisible || isEnabledWithFocus) {
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
        return maxOf(iconHeight, actionHeight, contentFirstRowHeight, getAlignmentLine())
    }

    private fun getValueFirstLineHeight(): Int {
        editText.getLineBounds(0, _tempRect)
        return _tempRect.bottom + getTextOffset()
    }

    private fun getAlignmentLine(): Int =
        _alignmentLineHeight - 2 * paddingTop

    private fun calculateCollapsedTextBounds(bounds: Rect): Rect {
        _collapsedBounds.apply {
            left = bounds.left
            top = paddingTop
            right = measuredWidth - getCompoundPaddingEnd()
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
            measuredWidth - getCompoundPaddingEnd(),
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
        editText.forceFocus()
        _editableContainer.removeCallbacks(_smoothScrollRunnable)
        if (!isSingleLine()) {
            _smoothScrollRunnable = _editableContainer.postDelayed(100) {
                (_editableContainer as? ScrollView)?.smoothScrollTo(editText.left, editText.bottom)
            }
        }
    }

    private fun drawScrollBar(canvas: Canvas) {
        val trackLeft = measuredWidth - _scrollBarPaddingEnd - _scrollBarThickness
        val trackRight = measuredWidth - _scrollBarPaddingEnd
        val trackTop = _scrollBarPaddingTop
        val thumbHeightPercent = (_editableContainer.height * 1f / chipGroup.height).let { if (it.isNaN()) 0f else it }
        val thumbOffsetPercent = (_editableContainer.scrollY * 1f / (chipGroup.bottom - _editableContainer.height))
            .let { if (it.isNaN()) 0f else it }
        _scrollBarTrackDrawable.setBounds(
            trackLeft,
            trackTop,
            trackRight,
            measuredHeight - _scrollBarPaddingBottom,
        )
        val trackHeight = _scrollBarTrackDrawable.bounds.height()

        val thumbHeight = trackHeight * thumbHeightPercent
        val thumbOffset = thumbOffsetPercent * (trackHeight - thumbHeight)
        _scrollBarThumbDrawable.setBounds(
            trackLeft,
            thumbOffset.roundToInt(),
            trackRight,
            (thumbOffset + thumbHeight).roundToInt(),
        )
        canvas.save()
        canvas.translate(trackLeft.toFloat(), trackTop.toFloat())
        _scrollBarTrackDrawable.draw(canvas)
        canvas.translate(0f, thumbOffset)
        _scrollBarThumbDrawable.draw(canvas)
        canvas.restore()
    }

    private inner class ChipGroupWithEditText(context: Context) : ChipGroup(context) {
        private var _minTextRowHeight: Int = 0
        private var _editTextWasInFocus: Boolean = false
        private var groupShapeHelper: ShapeHelper? = null
        private var _childrenWasEnabled: Boolean = true

        fun setReadOnly(readonly: Boolean) {
            editText.isReadOnly = readonly
            updateTextState(false)
            children.forEach {
                if (it != editText) {
                    it.isEnabled = _childrenWasEnabled && !readonly
                }
            }
        }

        override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
            super.addView(child, index, params)
            (child as? HasFocusSelector)?.apply {
                val border = settings.border
                val chipFsSettings = settings.copy(
                    border = border.copy(strokeInsets = -border.strokeWidth.roundToInt(), shapeAdjustment = 0f),
                    scaleFactor = 0f,
                )
                updateSettings(child, chipFsSettings)
            }
        }

        override fun repopulate() {
            _editTextWasInFocus = editText.isFocused
            super.repopulate()
            applyClip()
            updateEditText()
            updateTextOffset()
        }

        override fun setEnabled(enabled: Boolean) {
            super.setEnabled(enabled)
            children.forEach {
                _childrenWasEnabled = enabled
                it.isEnabled = enabled
            }
        }

        override fun calculateLineCrossAxisSize(child: View, layoutParams: LayoutParams): Int {
            val rowHeight = super.calculateLineCrossAxisSize(child, layoutParams)
            return if (child == editText && _minTextRowHeight > 0) {
                val offset = (_minTextRowHeight - getValueFirstLineHeight()) / 2
                rowHeight + offset
            } else {
                rowHeight
            }
        }

        override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
            _minTextRowHeight = getAlignmentLine()
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        }

        override fun onMeasureChild(child: View, widthMeasureSpec: Int, heightMeasureSpec: Int) {
            super.onMeasureChild(child, widthMeasureSpec, heightMeasureSpec)
            if (child != editText) _minTextRowHeight = maxOf(child.measuredHeight, _minTextRowHeight)
        }

        override fun onLayoutChild(child: View, left: Int, top: Int, right: Int, bottom: Int, rowBounds: Rect) {
            val offset = if (child == editText && _minTextRowHeight > 0) {
                (_minTextRowHeight - getValueFirstLineHeight()) / 2
            } else {
                0
            }
            super.onLayoutChild(child, left, top + offset, right, bottom + offset, rowBounds)
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
