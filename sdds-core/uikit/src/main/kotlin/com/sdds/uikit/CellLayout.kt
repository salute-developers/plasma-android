package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.widget.TextViewCompat
import com.sdds.uikit.CellLayout.CellContent.CENTER
import com.sdds.uikit.CellLayout.CellContent.DISCLOSURE
import com.sdds.uikit.CellLayout.CellContent.END
import com.sdds.uikit.CellLayout.CellContent.LABEL
import com.sdds.uikit.CellLayout.CellContent.START
import com.sdds.uikit.CellLayout.CellContent.SUBTITLE
import com.sdds.uikit.CellLayout.CellContent.TITLE
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.isClippedToOutline
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeable
import com.sdds.uikit.viewstate.ViewState

/**
 * Компонент [CellLayout] (a.k.a Cell) позволяет компоновать дочерние [View] согласно заданным им ролей [CellContent] при помощи
 * атрибута [R.styleable.CellLayout_Layout_layout_cellContent].
 * Также поддерживает установку [ShapeModel].
 * [CellLayout] устанавливает [isDuplicateParentStateEnabled] = true для каждого дочернего элемента, если
 * [R.styleable.CellLayout_sd_forceDuplicateParentState] = true.
 * Также использование атрибута [R.styleable.CellLayout_Layout_sd_layout_forceDuplicateParentState] у дочерних [View]
 * позволяет точечно переопределить это поведение.
 * @see Shapeable
 * @author Малышев Александр on 11.10.2024
 */
open class CellLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_cellStyle,
    defStyleRes: Int = R.style.Sdds_Components_Cell,
) : ViewGroup(context, attrs, defStyleAttr, defStyleRes), Shapeable, HasFocusSelector by FocusSelectorDelegate() {

    private val _shaper = shapeable(attrs, defStyleAttr)
    private val _startContentBounds: Rect = Rect()
    private val _endContentBounds: Rect = Rect()
    private val _centerContentBounds: Rect = Rect()
    private val _cellBounds: Rect = Rect()

    private var _gravity: Int
    private var _contentStartPadding: Int = 0
    private var _contentEndPadding: Int = 0
    private var _labelAppearance: Int = 0
    private var _labelColor: ColorStateList? = null
    private var _titleAppearance: Int = 0
    private var _titleColor: ColorStateList? = null
    private var _subtitleAppearance: Int = 0
    private var _subtitleColor: ColorStateList? = null

    private var _disclosureText: CharSequence? = null
    private var _disclosureTextAppearance: Int = 0
    private var _disclosureColor: ColorStateList? = null
    private var _disclosureIcon: Drawable? = null
    private var _disclosureView: View? = null
    private var _disclosureEnabled: Boolean = false
    private var _forceDuplicateParentState: Boolean = false
    private var _contentStartPaddingEnabled = false
    private var _contentEndPaddingEnabled = false

    /**
     * Выравнивание дочерних элементов относительно строки, в которой они находятся.
     * @see Gravity
     */
    open var gravity: Int
        get() = _gravity
        set(value) {
            if (_gravity != value) {
                _gravity = value
                requestLayout()
            }
        }

    /**
     * Контролирует видимость элемента с ролью [CellContent.DISCLOSURE]
     */
    open var disclosureEnabled: Boolean
        get() = _disclosureEnabled
        set(value) {
            if (_disclosureEnabled != value) {
                _disclosureEnabled = value
                resetDisclosure()
            }
        }

    /**
     * Изменяет текст элемента с ролью [CellContent.DISCLOSURE], если он это поддерживает
     */
    open var disclosureText: CharSequence?
        get() = _disclosureText
        set(value) {
            if (_disclosureText != value) {
                _disclosureText = value
                resetDisclosure()
            }
        }

    /**
     * Устанавливает иконку для элемента с ролью [CellContent.DISCLOSURE], если он это поддерживает
     */
    open var disclosureIcon: Drawable?
        get() = _disclosureIcon
        set(value) {
            if (_disclosureIcon != value) {
                _disclosureIcon = value
                resetDisclosure()
            }
        }

    /**
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _shaper.shape

    init {
        setWillNotDraw(!DEBUG)
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CellLayout, defStyleAttr, defStyleRes)
        _gravity = typedArray.getInt(R.styleable.CellLayout_android_gravity, Gravity.TOP)
        _contentStartPadding = typedArray.getDimensionPixelSize(R.styleable.CellLayout_sd_contentStartPadding, 0)
        _contentEndPadding = typedArray.getDimensionPixelSize(R.styleable.CellLayout_sd_contentEndPadding, 0)
        _labelAppearance = typedArray.getResourceId(R.styleable.CellLayout_sd_labelAppearance, 0)
        _labelColor = typedArray.getColorStateList(R.styleable.CellLayout_sd_labelColor)
        _titleAppearance = typedArray.getResourceId(R.styleable.CellLayout_sd_titleAppearance, 0)
        _titleColor = typedArray.getColorStateList(R.styleable.CellLayout_sd_titleColor)
        _subtitleAppearance = typedArray.getResourceId(R.styleable.CellLayout_sd_subtitleAppearance, 0)
        _subtitleColor = typedArray.getColorStateList(R.styleable.CellLayout_sd_subtitleColor)
        _disclosureTextAppearance = typedArray.getResourceId(R.styleable.CellLayout_sd_disclosureTextAppearance, 0)
        _disclosureColor = typedArray.getColorStateList(R.styleable.CellLayout_sd_disclosureColor)
        _disclosureIcon = typedArray.getDrawable(R.styleable.CellLayout_sd_disclosureIcon)
        _disclosureText = typedArray.getString(R.styleable.CellLayout_sd_disclosureText)
        _disclosureEnabled = typedArray.getBoolean(R.styleable.CellLayout_sd_disclosureEnabled, false)
        _forceDuplicateParentState = typedArray.getBoolean(R.styleable.CellLayout_sd_forceDuplicateParentState, false)
        typedArray.recycle()
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
        @Suppress("LeakingThis")
        applySelector(this, context, attrs, defStyleAttr)
    }

    override fun setPressed(pressed: Boolean) {
        if (isPressed != pressed) {
            handlePressedChange(this, pressed)
        }
        super.setPressed(pressed)
    }

    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
        updateFocusSelector(this, gainFocus)
        isActivated = gainFocus
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        val cellParams = params as? LayoutParams ?: return

        child?.applyContentRole(cellParams)

        if (cellParams.cellContent == DISCLOSURE && child != _disclosureView) {
            removeView(_disclosureView)
            _disclosureView = child
            _disclosureView?.isVisible = _disclosureEnabled
        }
        super.addView(child, index, params)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _disclosureView = null
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (DEBUG) {
            canvas.drawRect(_startContentBounds, DebugPaint.configure(color = Color.RED))
            canvas.drawRect(_centerContentBounds, DebugPaint.configure(color = Color.YELLOW))
            canvas.drawRect(_endContentBounds, DebugPaint.configure(color = Color.GREEN))
            canvas.drawRect(_cellBounds, DebugPaint.configure(color = Color.MAGENTA))
        }
    }

    @Suppress("CyclomaticComplexMethod", "LongMethod")
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        _startContentBounds.setEmpty()
        _endContentBounds.setEmpty()
        _centerContentBounds.setEmpty()

        var totalWidth = paddingStart + paddingEnd
        var totalHeight = 0

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            val lp = child.layoutParams as LayoutParams
            if (child.isGone || lp.cellContent.isCenterAlignment()) continue
            measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, 0)

            val totalChildWidth = child.measuredWidth + lp.leftMargin + lp.rightMargin
            val totalChildHeight = child.measuredHeight + lp.topMargin + lp.bottomMargin

            when (lp.cellContent) {
                START -> {
                    if (!_contentStartPaddingEnabled) {
                        _contentStartPaddingEnabled = true
                        totalWidth += _contentStartPadding
                    }
                    _startContentBounds.apply {
                        right += totalChildWidth
                        bottom = maxOf(bottom, totalChildHeight)
                    }
                }
                END, DISCLOSURE -> {
                    if (!_contentEndPaddingEnabled) {
                        _contentEndPaddingEnabled = true
                        totalWidth += _contentEndPadding
                    }
                    _endContentBounds.apply {
                        right += totalChildWidth
                        bottom = maxOf(bottom, totalChildHeight)
                    }
                }

                else -> Unit
            }

            totalWidth += totalChildWidth
        }

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            val lp = child.layoutParams as LayoutParams
            if (child.isGone || !lp.cellContent.isCenterAlignment()) continue

            measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, 0)

            val totalChildWidth = child.measuredWidth + lp.leftMargin + lp.rightMargin
            val totalChildHeight = child.measuredHeight + lp.topMargin + lp.bottomMargin

            _centerContentBounds.apply {
                bottom += totalChildHeight
                right = maxOf(right, totalChildWidth)
            }
        }

        totalWidth += _centerContentBounds.width()
        totalHeight += maxOf(
            _startContentBounds.height(),
            _centerContentBounds.height(),
            _endContentBounds.height(),
        )
        totalHeight += paddingTop + paddingBottom

        // Выбираем конечные размеры согласно требованиям родителя
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
        setMeasuredDimension(maxOf(minimumWidth, desiredWidth), maxOf(minimumHeight, desiredHeight))
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        _cellBounds.set(
            paddingStart,
            paddingTop,
            w - paddingEnd,
            h - paddingBottom,
        )
    }

    @Suppress("CyclomaticComplexMethod", "LongMethod")
    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        alignContentBounds()

        var startContentChildLeft = _startContentBounds.left
        var endContentChildLeft = _endContentBounds.left
        var centerContentChildTop = _centerContentBounds.top

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            if (child.isGone) continue
            val lp = child.layoutParams as LayoutParams

            val totalChildWidth = child.measuredWidth + lp.leftMargin + lp.rightMargin
            val totalChildHeight = child.measuredHeight + lp.topMargin + lp.bottomMargin

            var childLeft: Int
            var childTop: Int

            val verticalGravity = lp.gravity and Gravity.VERTICAL_GRAVITY_MASK
            val horizontalGravity = Gravity.getAbsoluteGravity(
                lp.gravity and Gravity.HORIZONTAL_GRAVITY_MASK,
                layoutDirection,
            )

            when (lp.cellContent) {
                START -> {
                    childLeft = startContentChildLeft + lp.leftMargin
                    childTop = when (verticalGravity) {
                        Gravity.BOTTOM -> _startContentBounds.bottom - totalChildHeight
                        Gravity.CENTER_VERTICAL -> _startContentBounds.centerY() - totalChildHeight / 2
                        else -> _startContentBounds.top + lp.topMargin
                    }
                    startContentChildLeft += totalChildWidth
                }

                END -> {
                    childLeft = endContentChildLeft + lp.leftMargin
                    childTop = when (verticalGravity) {
                        Gravity.BOTTOM -> _endContentBounds.bottom - totalChildHeight
                        Gravity.CENTER_VERTICAL -> _endContentBounds.centerY() - totalChildHeight / 2
                        else -> _endContentBounds.top + lp.topMargin
                    }
                    endContentChildLeft += totalChildWidth
                }

                DISCLOSURE -> {
                    childLeft = _endContentBounds.right - totalChildWidth + lp.leftMargin
                    childTop = when (verticalGravity) {
                        Gravity.BOTTOM -> _endContentBounds.bottom - totalChildHeight
                        Gravity.CENTER_VERTICAL -> _endContentBounds.centerY() - totalChildHeight / 2
                        else -> _endContentBounds.top + lp.topMargin
                    }
                }

                else -> {
                    childLeft = when (horizontalGravity) {
                        Gravity.CENTER_HORIZONTAL -> _centerContentBounds.centerX() - totalChildWidth / 2
                        Gravity.RIGHT -> _centerContentBounds.right - totalChildWidth
                        else -> _centerContentBounds.left + lp.leftMargin
                    }
                    childTop = centerContentChildTop + lp.topMargin
                    centerContentChildTop += totalChildHeight
                }
            }

            child.layout(
                childLeft,
                childTop,
                childLeft + child.measuredWidth,
                childTop + child.measuredHeight,
            )
        }
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams?): Boolean {
        return p is LayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): ViewGroup.LayoutParams {
        return LayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams?): ViewGroup.LayoutParams {
        return LayoutParams(p)
    }

    private fun alignContentBounds() {
        val verticalGravity = _gravity and Gravity.VERTICAL_GRAVITY_MASK
        Gravity.apply(
            Gravity.END or verticalGravity,
            _endContentBounds.width(),
            _endContentBounds.height(),
            _cellBounds,
            _endContentBounds,
            layoutDirection,
        )

        Gravity.apply(
            Gravity.START or verticalGravity,
            _startContentBounds.width(),
            _startContentBounds.height(),
            _cellBounds,
            _startContentBounds,
            layoutDirection,
        )
        Gravity.apply(
            Gravity.START or verticalGravity,
            _centerContentBounds.width(),
            _centerContentBounds.height(),
            _cellBounds,
            _centerContentBounds,
            layoutDirection,
        )
        _centerContentBounds.offsetTo(
            _startContentBounds.right + (_contentStartPadding.takeIf { _contentStartPaddingEnabled } ?: 0),
            _centerContentBounds.top,
        )
    }

    private fun View.applyContentRole(cellParams: LayoutParams) {
        (this as? TextView)?.apply {
            when (cellParams.cellContent) {
                LABEL -> {
                    setTextAppearance(_labelAppearance)
                    _labelColor?.let(::setTextColor)
                    TextViewCompat.setCompoundDrawableTintList(this, _labelColor)
                    state = ViewState.SECONDARY
                }

                TITLE -> {
                    setTextAppearance(_titleAppearance)
                    _titleColor?.let(::setTextColor)
                    TextViewCompat.setCompoundDrawableTintList(this, _titleColor)
                    state = ViewState.PRIMARY
                }

                SUBTITLE -> {
                    setTextAppearance(_subtitleAppearance)
                    _subtitleColor?.let(::setTextColor)
                    TextViewCompat.setCompoundDrawableTintList(this, _subtitleColor)
                    state = ViewState.SECONDARY
                }

                else -> Unit
            }
        }

        if (cellParams.cellContent == DISCLOSURE) {
            when (this) {
                is ImageView -> imageTintList = _disclosureColor
                is TextView -> {
                    setTextAppearance(_disclosureTextAppearance)
                    _disclosureColor?.let(::setTextColor)
                    if (compoundDrawablesRelative.all { it == null }) {
                        setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, _disclosureIcon, null)
                    }
                    TextViewCompat.setCompoundDrawableTintList(this, _disclosureColor)
                    state = ViewState.SECONDARY
                }

                is Button -> {
                    if (icon == null) {
                        icon = _disclosureIcon
                    }
                    setIconTintList(_disclosureColor)
                    state = ViewState.SECONDARY
                }
            }
        }
    }

    private fun resetDisclosure() {
        if (!_disclosureText.isNullOrBlank() || _disclosureIcon != null) {
            var needAddView = false
            val view = _disclosureView ?: TextView(context).also {
                _disclosureView = it
                needAddView = true
            }
            view.apply {
                if (this is TextView) {
                    text = _disclosureText
                    setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, _disclosureIcon, null)
                    gravity = Gravity.CENTER_VERTICAL
                }
                isVisible = disclosureEnabled
            }
            if (needAddView) {
                addView(
                    view,
                    LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                    ).apply {
                        cellContent = DISCLOSURE
                        marginStart = _contentEndPadding
                    },
                )
            }
        }
        _disclosureView?.isVisible = disclosureEnabled
    }

    /**
     * Параметры расположения дочерних [View] в [CellLayout]
     */
    class LayoutParams : MarginLayoutParams {

        /**
         * Роль [View] внутри [CellLayout]
         */
        var cellContent: CellContent = START

        /**
         * Выравнивание [View] внутри [CellLayout]
         */
        var gravity: Int = Gravity.CENTER

        /**
         * Контролирует установку параметра [isDuplicateParentStateEnabled] для [View]
         */
        var forceDuplicateParentState: Boolean = true

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            val typedArray = c.obtainStyledAttributes(attrs, R.styleable.CellLayout_Layout)
            this.cellContent = typedArray.getInt(R.styleable.CellLayout_Layout_layout_cellContent, 0)
                .let { CellContent.values().getOrElse(it) { START } }
            this.gravity = typedArray.getInt(R.styleable.CellLayout_Layout_android_layout_gravity, Gravity.CENTER)
            this.forceDuplicateParentState = typedArray.getBoolean(
                R.styleable.CellLayout_Layout_sd_layout_forceDuplicateParentState,
                true,
            )
            typedArray.recycle()
        }

        constructor(width: Int, height: Int) : super(width, height)
        constructor(source: MarginLayoutParams?) : super(source)
        constructor(source: ViewGroup.LayoutParams?) : super(source)
    }

    /**
     * Роли для дочерних элементов [View] в [CellLayout]
     */
    enum class CellContent {
        /**
         * Позиционирует [View] в начале [CellLayout].
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [CellLayout]
         */
        START,

        /**
         * Позиционирует [View] в середине [CellLayout] - между [View] с ролями [START] и [END].
         * Несколько [View] с этой ролью будут следовать друг за другом по вертикали в том
         * порядке, в котором они добавлялись в [CellLayout]
         */
        CENTER,

        /**
         * Позиционирует [View] в конце [CellLayout].
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [CellLayout]
         */
        END,

        /**
         * Позиционирует так же, как [CENTER].
         * Дополнительно применяет стили текста и цвета для элемента с этой ролью.
         * Значение стилей берутся из [R.styleable.CellLayout_sd_labelAppearance] и
         * [R.styleable.CellLayout_sd_labelColor]
         */
        LABEL,

        /**
         * Позиционирует так же, как [CENTER].
         * Дополнительно применяет стили текста и цвета для элемента с этой ролью.
         * Значение стилей берутся из [R.styleable.CellLayout_sd_titleAppearance] и
         * [R.styleable.CellLayout_sd_titleColor]
         */
        TITLE,

        /**
         * Позиционирует так же, как [CENTER].
         * Дополнительно применяет стили текста и цвета для элемента с этой ролью.
         * Значение стилей берутся из [R.styleable.CellLayout_sd_subtitleAppearance] и
         * [R.styleable.CellLayout_sd_subtitleColor]
         */
        SUBTITLE,

        /**
         * Позиционирует [View] в самом конце [CellLayout], после всех [View] с ролью [END], несмотря на то, в каком
         * порядке была добавлена [View] с этой ролью
         */
        DISCLOSURE,
    }

    private companion object {
        const val DEBUG = false
        val DebugPaint = Paint().configure(style = Paint.Style.STROKE, strokeWidth = 5f, color = Color.MAGENTA)

        fun CellContent.isCenterAlignment(): Boolean =
            this == CENTER || this == LABEL || this == TITLE || this == SUBTITLE
    }
}
