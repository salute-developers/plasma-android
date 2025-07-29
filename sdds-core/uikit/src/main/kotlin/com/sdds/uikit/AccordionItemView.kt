package com.sdds.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.graphics.drawable.DrawableWrapper
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.widget.FrameLayout
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import androidx.core.content.ContextCompat
import androidx.core.content.withStyledAttributes
import androidx.core.graphics.toRectF
import androidx.core.graphics.withSave
import androidx.core.view.doOnNextLayout
import androidx.core.view.doOnPreDraw
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import androidx.recyclerview.widget.RecyclerView
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.fs.FocusSelectorSettings
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.AnimationUtils.lerp
import com.sdds.uikit.internal.base.fullHeight
import com.sdds.uikit.internal.base.fullWidth
import com.sdds.uikit.internal.base.isClippedToOutline
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeHelper
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.setBackgroundValueList

/**
 * Компонент UI, представляющий элемент аккордеона с заголовком и разворачиваемым контентом.
 *
 * Поддерживает настройку заголовка, иконок, анимаций открытия/закрытия, цветов и отступов.
 *
 * @constructor Создаёт экземпляр компонента с заданными атрибутами стиля и внешнего вида.
 *
 * @param context Контекст, в котором используется компонент.
 * @param attrs Атрибуты XML, применённые к компоненту.
 * @param defStyleAttr Стиль по умолчанию.
 * @param defStyleRes Ресурс стиля по умолчанию, если не указан в XML.
 */
open class AccordionItemView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_accordionItemViewStyle,
    defStyleRes: Int = R.style.Sdds_Components_AccordionItem,
) : ViewGroup(context, attrs, defStyleAttr, defStyleRes),
    ColorStateHolder,
    Shapeable,
    HasFocusSelector by FocusSelectorDelegate(
        FocusSelectorSettings.fromAttrs(
            context,
            attrs,
            defStyleAttr,
            defStyleRes,
        ),
    ) {

    private val _shapeable: ShapeHelper = shapeHelper(attrs, defStyleAttr, defStyleRes)

    private val _header: ListItemView = ListItemView(context).apply {
        isFocusable = false
        foreground = null
    }
    private val _headerTitle: TextView = TextView(context)
    private val _headerIconOpened: ImageView = ImageView(context)
    private val _headerIconClosed: ImageView = ImageView(context)
    private val _headerIconContainer: FrameLayout = FrameLayout(context)
    private val _content: LinearLayout = LinearLayout(context).apply {
        orientation = android.widget.LinearLayout.VERTICAL
        isFocusable = false
    }
    private var _contentTextView: TextView? = null

    private var _backgroundList: ColorValueStateList? = null
    private var _opened: Boolean = false
    private var _titleAppearance: Int = 0
    private var _titleColor: ColorValueStateList? = null
    private var _title: CharSequence? = null

    private var _contentTextAppearance: Int = 0
    private var _contentTextColor: ColorValueStateList? = null
    private var _contentText: CharSequence? = null

    private var _iconPadding: Int = 0
    private var _iconPlacement: Int = ICON_PLACEMENT_START
    private var _closedIcon: Drawable? = null
    private var _openedIcon: Drawable? = null
    private var _iconColor: ColorValueStateList? = null
    private var _openedIconAppearAnimation: Animation? = null
    private var _openedIconDisappearAnimation: Animation? = null
    private var _closedIconAppearAnimation: Animation? = null
    private var _closedIconDisappearAnimation: Animation? = null
    private var _delayedAnimationsEnabled: Boolean = false
    private var _isAnimationDelayed: Boolean = false

    private val _openContentAnimator = ValueAnimator.ofFloat(0f, 1f).apply {
        duration = AnimationUtils.DEFAULT_DURATION
    }
    private val _animatorClipRect = Rect()
    private val _backgroundAnimBounds: Rect = Rect()
    private val _foregroundAnimBounds: Rect = Rect()
    private var _backgroundWrapper: BackgroundWrapper? = null
    private var _foregroundWrapper: BackgroundWrapper? = null

    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
        set(value) {
            if (field != value) {
                field = value
                _header.colorState = value
                refreshDrawableState()
            }
        }

    /** Ресурс стиля текста заголовка. */
    var titleAppearance: Int
        get() = _titleAppearance
        set(value) {
            if (_titleAppearance != value) {
                _titleAppearance = value
                updateTitle()
            }
        }

    /** Цвет заголовка в виде состояния. */
    var titleColor: ColorValueStateList?
        get() = _titleColor
        set(value) {
            if (_titleColor != value) {
                _titleColor = value
                updateTitle()
            }
        }

    /** Текст заголовка. */
    var title: CharSequence?
        get() = _title
        set(value) {
            if (_title != value) {
                _title = value
                updateTitle()
            }
        }

    /** Ресурс стиля текста содержимого. */
    var contentTextAppearance: Int
        get() = _contentTextAppearance
        set(value) {
            if (_contentTextAppearance != value) {
                _contentTextAppearance = value
                updateContentText()
            }
        }

    /** Цвет содержимого в виде состояния. */
    var contentTextColor: ColorValueStateList?
        get() = _contentTextColor
        set(value) {
            if (_contentTextColor != value) {
                _contentTextColor = value
                updateContentText()
            }
        }

    /** Текст содержимого, отображаемого под заголовком. */
    var contentText: CharSequence?
        get() = _contentText
        set(value) {
            if (_contentText != value) {
                _contentText = value
                updateContentText()
            }
        }

    /** Отступ между иконкой и содержимым заголовка. */
    var iconPadding: Int
        get() = _iconPadding
        set(value) {
            if (_iconPadding != value) {
                _iconPadding = value
                updateIcon()
            }
        }

    /** Положение иконки: в начале или в конце заголовка. */
    var iconPlacement: Int
        get() = _iconPlacement
        set(value) {
            if (_iconPlacement != value) {
                _iconPlacement = value
                updateIcon()
            }
        }

    /** Иконка, отображаемая в закрытом состоянии. */
    var closedIcon: Drawable?
        get() = _closedIcon
        set(value) {
            if (_closedIcon != value) {
                _closedIcon = value
                updateIcon()
            }
        }

    /** Иконка, отображаемая в открытом состоянии. */
    var openedIcon: Drawable?
        get() = _openedIcon
        set(value) {
            if (_openedIcon != value) {
                _openedIcon = value
                updateIcon()
            }
        }

    /** Цвет иконок в виде состояния. */
    var iconColor: ColorValueStateList?
        get() = _iconColor
        set(value) {
            if (_iconColor != value) {
                _iconColor = value
                updateIcon()
            }
        }

    /** Начальный отступ контента. */
    val contentPaddingStart: Int
        get() = _content.paddingStart

    /** Верхний отступ контента. */
    val contentPaddingTop: Int
        get() = _content.paddingTop

    /** Конечный отступ контента. */
    val contentPaddingEnd: Int
        get() = _content.paddingEnd

    /** Нижний отступ контента. */
    val contentPaddingBottom: Int
        get() = _content.paddingBottom

    /** Состояние: открыт ли аккордеон. */
    var opened: Boolean
        get() = _opened
        set(value) {
            if (_opened != value) {
                _opened = value
                updateOpenedState(value, false)
            }
        }

    /**
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _shapeable.shape

    init {
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        initContent()
        @Suppress("LeakingThis")
        applySelector(this)
    }

    /**
     * Устанавливает состояние открыт/закрыт.
     * Если [animate] == true, открытие/закрытие контента будет происходить с анимацией.
     */
    fun setOpened(opened: Boolean, animate: Boolean) {
        if (_opened != opened) {
            _opened = opened
            updateOpenedState(opened, animate)
        }
    }

    /**
     * Устанавливает цвет заголовка.
     *
     * @param color Цвет в формате ARGB.
     */
    fun setTitleColor(@ColorInt color: Int) {
        titleColor = ColorValueStateList.valueOf(color)
    }

    /**
     * Устанавливает цвет текста содержимого.
     *
     * @param color Цвет в формате ARGB.
     */
    fun setContentTextColor(@ColorInt color: Int) {
        contentTextColor = ColorValueStateList.valueOf(color)
    }

    /**
     * Устанавливает иконку закрытого состояния по ресурсу.
     *
     * @param resId Идентификатор ресурса Drawable.
     */
    fun setClosedIcon(@DrawableRes resId: Int) {
        closedIcon = ContextCompat.getDrawable(context, resId)
    }

    /**
     * Устанавливает иконку открытого состояния по ресурсу.
     *
     * @param resId Идентификатор ресурса Drawable.
     */
    fun setOpenedIcon(@DrawableRes resId: Int) {
        openedIcon = ContextCompat.getDrawable(context, resId)
    }

    /**
     * Устанавливает цвет иконок.
     *
     * @param color Цвет в формате ARGB.
     */
    fun setIconColor(@ColorInt color: Int) {
        iconColor = ColorValueStateList.valueOf(color)
    }

    /**
     * Устанавливает внутренние отступы контента.
     *
     * @param paddingStart Начальный отступ.
     * @param paddingTop Верхний отступ.
     * @param paddingEnd Конечный отступ.
     * @param paddingBottom Нижний отступ.
     */
    fun setContentPaddingsRelative(
        paddingStart: Int,
        paddingTop: Int,
        paddingEnd: Int,
        paddingBottom: Int,
    ) {
        _content.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom)
    }

    /**
     * Устанавливает внутренние отступы заголовка.
     *
     * @param paddingStart Начальный отступ.
     * @param paddingTop Верхний отступ.
     * @param paddingEnd Конечный отступ.
     * @param paddingBottom Нижний отступ.
     */
    fun setHeaderPaddingsRelative(
        paddingStart: Int,
        paddingTop: Int,
        paddingEnd: Int,
        paddingBottom: Int,
    ) {
        _header.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom)
    }

    /**
     * Назначает слушатель клика по заголовку.
     *
     * @param listener Слушатель события нажатия.
     */
    fun setHeaderClickListener(listener: OnClickListener) {
        _header.setOnClickListener(listener)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        _delayedAnimationsEnabled = parent is RecyclerView
    }

    override fun setForeground(foreground: Drawable?) {
        _foregroundWrapper = foreground?.let { BackgroundWrapper(it) }
        super.setForeground(_foregroundWrapper)
    }

    override fun setBackground(background: Drawable?) {
        _backgroundWrapper = background?.let { BackgroundWrapper(background) }
        super.setBackground(_backgroundWrapper)
    }

    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
        updateFocusSelector(this, gainFocus)
    }

    override fun setPressed(pressed: Boolean) {
        if (isPressed != pressed) {
            handlePressedChange(this, pressed)
        }
        super.setPressed(pressed)
    }

    override fun addView(child: View?, index: Int, params: LayoutParams?) {
        if (child == _content || child == _header) {
            super.addView(child, index, params)
        } else {
            _content.addView(child, params)
        }
    }

    override fun dispatchDraw(canvas: Canvas) {
        if (!_animatorClipRect.isEmpty) {
            canvas.withSave {
                clipRect(_animatorClipRect)
                super.dispatchDraw(this)
            }
        } else {
            super.dispatchDraw(canvas)
        }
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        setBackgroundValueList(_backgroundList)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        measureChildWithMargins(_header, widthMeasureSpec, 0, heightMeasureSpec, 0)
        measureChildWithMargins(_content, widthMeasureSpec, 0, heightMeasureSpec, _header.measuredHeight)

        val width = paddingStart + paddingEnd + maxOf(_header.fullWidth(), _content.fullWidth())
        if (!opened && _content.isVisible) {
            setMeasuredDimension(width, _header.fullHeight())
        } else {
            setMeasuredDimension(width, _header.fullHeight() + _content.fullHeight())
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        if (_animatorClipRect.isEmpty) {
            _animatorClipRect.set(
                0,
                paddingTop + _header.paddingTop,
                measuredWidth,
                measuredHeight - paddingBottom - _content.paddingBottom,
            )
        }
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        var childTop = paddingTop
        for (i in 0 until childCount) {
            val child = getChildAt(i)
            if (child.isGone) continue
            child.layout(
                paddingStart,
                childTop,
                paddingStart + child.fullWidth(),
                childTop + child.fullHeight(),
            )
            childTop += child.fullHeight()
        }
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return android.widget.LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        return android.widget.LinearLayout.LayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: LayoutParams?): LayoutParams {
        return android.widget.LinearLayout.LayoutParams(p)
    }

    private fun initContent() {
        _header.apply {
            _headerTitle.apply {
                text = _title
                setTextAppearance(_titleAppearance)
                setTextColor(_titleColor)
            }
            val headerTitleParams =
                CellLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT).apply {
                    cellContent = CellLayout.CellContent.TITLE
                }
            addView(_headerTitle, headerTitleParams)

            _headerIconOpened.apply {
                setImageTintValueList(_iconColor)
                setImageDrawable(_openedIcon)
                visibility = if (_opened) VISIBLE else INVISIBLE
            }
            _headerIconClosed.apply {
                setImageTintValueList(_iconColor)
                setImageDrawable(_closedIcon)
                visibility = if (_opened) INVISIBLE else VISIBLE
            }
            _headerIconContainer.addView(_headerIconOpened)
            _headerIconContainer.addView(_headerIconClosed)
            val headerIconParams = CellLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT).apply {
                cellContent = when (_iconPlacement) {
                    ICON_PLACEMENT_END -> CellLayout.CellContent.END
                    else -> CellLayout.CellContent.START
                }
            }
            addView(_headerIconContainer, headerIconParams)
            when (_iconPlacement) {
                ICON_PLACEMENT_END -> contentStartPadding = _iconPadding
                else -> contentEndPadding = _iconPadding
            }
        }
        addView(_header, MarginLayoutParams(LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)))

        _content.apply {
            isVisible = _opened
        }
        addView(_content, MarginLayoutParams(LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)))
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.AccordionItemView, defStyleAttr, defStyleRes) {
            _opened = getBoolean(R.styleable.AccordionItemView_sd_opened, false)
            _titleAppearance = getResourceId(R.styleable.AccordionItemView_sd_titleAppearance, 0)
            _titleColor = getColorValueStateList(context, R.styleable.AccordionItemView_sd_titleColor)
            _title = getString(R.styleable.AccordionItemView_sd_title)
            _contentTextAppearance = getResourceId(R.styleable.AccordionItemView_sd_contentTextAppearance, 0)
            _contentTextColor = getColorValueStateList(context, R.styleable.AccordionItemView_sd_contentTextColor)
            _contentText = getString(R.styleable.AccordionItemView_sd_contentText)
            _iconPadding = getDimensionPixelSize(R.styleable.AccordionItemView_sd_iconPadding, 0)
            _iconPlacement = getInt(R.styleable.AccordionItemView_sd_iconPlacement, ICON_PLACEMENT_START)
            _closedIcon = getDrawable(R.styleable.AccordionItemView_sd_closedIcon)
            _openedIcon = getDrawable(R.styleable.AccordionItemView_sd_openedIcon)
            _iconColor = getColorValueStateList(context, R.styleable.AccordionItemView_sd_iconColor) ?: _titleColor
            val contentPadding = getDimensionPixelSize(R.styleable.AccordionItemView_sd_contentPadding, 0)
            val contentPaddingStart =
                getDimensionPixelSize(R.styleable.AccordionItemView_sd_contentPaddingStart, contentPadding)
            val contentPaddingTop =
                getDimensionPixelSize(R.styleable.AccordionItemView_sd_contentPaddingTop, contentPadding)
            val contentPaddingEnd =
                getDimensionPixelSize(R.styleable.AccordionItemView_sd_contentPaddingEnd, contentPadding)
            val contentPaddingBottom =
                getDimensionPixelSize(R.styleable.AccordionItemView_sd_contentPaddingBottom, contentPadding)
            setContentPaddingsRelative(contentPaddingStart, contentPaddingTop, contentPaddingEnd, contentPaddingBottom)
            val headerPadding = getDimensionPixelSize(R.styleable.AccordionItemView_sd_headerPadding, 0)
            val headerPaddingStart =
                getDimensionPixelSize(R.styleable.AccordionItemView_sd_headerPaddingStart, headerPadding)
            val headerPaddingTop =
                getDimensionPixelSize(R.styleable.AccordionItemView_sd_headerPaddingTop, headerPadding)
            val headerPaddingEnd =
                getDimensionPixelSize(R.styleable.AccordionItemView_sd_headerPaddingEnd, headerPadding)
            val headerPaddingBottom =
                getDimensionPixelSize(R.styleable.AccordionItemView_sd_headerPaddingBottom, headerPadding)
            setHeaderPaddingsRelative(headerPaddingStart, headerPaddingTop, headerPaddingEnd, headerPaddingBottom)
            _openedIconAppearAnimation = AnimationUtils.loadAnimation(
                context,
                getResourceId(R.styleable.AccordionItemView_sd_openedIconAppearAnimation, 0),
            )
            _openedIconDisappearAnimation = AnimationUtils.loadAnimation(
                context,
                getResourceId(R.styleable.AccordionItemView_sd_openedIconDisappearAnimation, 0),
            )
            _closedIconAppearAnimation = AnimationUtils.loadAnimation(
                context,
                getResourceId(R.styleable.AccordionItemView_sd_closedIconAppearAnimation, 0),
            )
            _closedIconDisappearAnimation = AnimationUtils.loadAnimation(
                context,
                getResourceId(R.styleable.AccordionItemView_sd_closedIconDisappearAnimation, 0),
            )
            _backgroundList = getColorValueStateList(context, R.styleable.AccordionItemView_sd_background)
        }
    }

    private fun updateTitle() {
        doOnPreDraw { updateInitialBounds() }
        _headerTitle.apply {
            text = title
            setTextAppearance(titleAppearance)
            setTextColor(titleColor)
        }
        invalidate()
    }

    private fun updateContentText() {
        doOnPreDraw { updateInitialBounds() }
        if (contentText == null && _contentTextView != null) {
            removeView(_contentTextView)
            _contentTextView = null
            return
        }
        val contentTextView = _contentTextView
            ?: TextView(context).also {
                _contentTextView = it
                _content.addView(it, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))
            }

        contentTextView.apply {
            text = contentText
            setTextAppearance(contentTextAppearance)
            setTextColor(contentTextColor)
        }
        invalidate()
    }

    private fun updateIcon() {
        _header.apply {
            when (iconPlacement) {
                ICON_PLACEMENT_END -> contentStartPadding = iconPadding
                else -> contentEndPadding = iconPadding
            }
        }
        _headerIconOpened.apply {
            setImageTintValueList(iconColor)
            setImageDrawable(openedIcon)
            visibility = if (opened) VISIBLE else INVISIBLE
        }
        _headerIconClosed.apply {
            setImageTintValueList(iconColor)
            setImageDrawable(closedIcon)
            visibility = if (opened) INVISIBLE else VISIBLE
        }
        _headerIconContainer.apply {
            updateLayoutParams<CellLayout.LayoutParams> {
                cellContent = when (iconPlacement) {
                    ICON_PLACEMENT_END -> CellLayout.CellContent.END
                    else -> CellLayout.CellContent.START
                }
            }
        }
    }

    private fun updateOpenedState(opened: Boolean, animate: Boolean) {
        switchIcon(opened, animate)
        if (animate) {
            animateClip()
        } else {
            doOnNextLayout { updateInitialBounds() }
            _content.isVisible = opened
        }
    }

    private fun switchIcon(opened: Boolean, animate: Boolean) {
        val openAnimAppear = _openedIconAppearAnimation
        val openAnimDisappear = _openedIconDisappearAnimation
        val closeAnimAppear = _closedIconAppearAnimation
        val closeAnimDisappear = _closedIconDisappearAnimation

        val openIconAnim = if (opened) openAnimAppear else openAnimDisappear
        val closeIconAnim = if (opened) closeAnimDisappear else closeAnimAppear

        if (!animate || openIconAnim == null || closeIconAnim == null) {
            _headerIconOpened.visibility = if (opened) VISIBLE else INVISIBLE
            _headerIconClosed.visibility = if (opened) INVISIBLE else VISIBLE
            return
        }
        openIconAnim.doOnAnimationEnd {
            _headerIconOpened.visibility = if (opened) VISIBLE else INVISIBLE
        }
        closeIconAnim.doOnAnimationEnd {
            _headerIconClosed.visibility = if (opened) INVISIBLE else VISIBLE
        }
        _headerIconOpened.startAnimation(openIconAnim)
        _headerIconClosed.startAnimation(closeIconAnim)
    }

    private fun getBackgroundInset(): Int {
        return _shapeable.shapeDrawable?.let { shapeDrawable ->
            shapeDrawable.shape?.cornerSizeTopLeft?.getSize(shapeDrawable.bounds.toRectF())
                ?.toInt()
        } ?: 0
    }

    private fun animateClip() {
        _openContentAnimator.run {
            cancel()
            removeAllUpdateListeners()
            removeAllListeners()

            val inset = getBackgroundInset()
            doOnStart {
                updateInitialBounds(inset)
            }
            animateBounds(_animatorClipRect, inset)
            background?.let {
                var skip = true
                animateBounds(_backgroundAnimBounds) {
                    if (skip) {
                        skip = false
                        _backgroundWrapper?.shouldSkipBoundsChange = true
                        return@animateBounds
                    }
                    background?.bounds = it
                }
            }

            foreground?.let {
                var skip = true
                animateBounds(_foregroundAnimBounds) {
                    if (skip) {
                        skip = false
                        _foregroundWrapper?.shouldSkipBoundsChange = true
                        return@animateBounds
                    }
                    foreground?.bounds = it
                }
            }
            runWithLayoutChange()
        }
    }

    private fun ValueAnimator.runWithLayoutChange() {
        _backgroundWrapper?.shouldSkipBoundsChange = true
        _foregroundWrapper?.shouldSkipBoundsChange = true
        if (!_delayedAnimationsEnabled) {
            doOnNextLayout {
                start()
            }
        }
        doOnEnd { _isAnimationDelayed = false }
        _isAnimationDelayed = _delayedAnimationsEnabled
        if (opened) {
            _content.isVisible = true
        } else {
            doOnEnd { _content.isVisible = false }
            requestLayout()
        }
    }

    internal fun runDelayedAnimations() {
        if (_delayedAnimationsEnabled && _isAnimationDelayed) {
            _openContentAnimator.start()
        }
    }

    private fun getClosedHeight(): Int =
        paddingTop + _header.measuredHeight + paddingBottom

    private fun getOpenedHeight(): Int {
        if (_content.measuredHeight == 0) {
            _content.measure(
                MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
                MeasureSpec.UNSPECIFIED,
            )
        }
        return paddingTop + _header.measuredHeight + _content.measuredHeight + paddingBottom
    }

    private fun updateInitialBounds(inset: Int = getBackgroundInset()) {
        _animatorClipRect.set(
            0,
            inset,
            measuredWidth,
            measuredHeight - inset,
        )
        _backgroundAnimBounds.set(background?.bounds)
        if (_backgroundAnimBounds.isEmpty) {
            _backgroundAnimBounds.set(0, 0, measuredWidth, measuredHeight)
        }

        _foregroundAnimBounds.set(foreground?.bounds)
        if (_foregroundAnimBounds.isEmpty) {
            _foregroundAnimBounds.set(0, 0, measuredWidth, measuredHeight)
        }
    }

    private fun ValueAnimator.animateBounds(
        bounds: Rect,
        inset: Int = 0,
        apply: ((Rect) -> Unit)? = null,
    ) {
        var from = 0
        var to = 0
        doOnStart {
            val closedHeight = getClosedHeight()
            val openedHeight = getOpenedHeight()
            from = if (opened) closedHeight - inset else openedHeight - inset
            to = if (opened) openedHeight - inset else closedHeight - inset
        }
        addUpdateListener {
            val progress = it.animatedFraction
            bounds.bottom = bounds.top + lerp(from, to, progress)
            apply?.invoke(bounds)
            postInvalidateOnAnimation()
        }
    }

    /**
     * Обёртка для Drawable, позволяющая временно игнорировать изменение границ.
     *
     * @param background Исходный Drawable.
     */
    private inner class BackgroundWrapper(background: Drawable) : DrawableWrapper(background) {

        /** Флаг, указывающий, нужно ли игнорировать изменение границ. */
        var shouldSkipBoundsChange: Boolean = false

        override fun setBounds(left: Int, top: Int, right: Int, bottom: Int) {
            if (shouldSkipBoundsChange) {
                shouldSkipBoundsChange = false
                return
            }
            super.setBounds(left, top, right, bottom)
        }
    }

    companion object {
        /** Значение, указывающее, что иконка размещается в начале заголовка. */
        const val ICON_PLACEMENT_START = 0

        /** Значение, указывающее, что иконка размещается в конце заголовка. */
        const val ICON_PLACEMENT_END = 1

        private fun Rect.set(from: Rect?) {
            if (from != null) {
                this.set(from)
            } else {
                setEmpty()
            }
        }

        private fun Animation.doOnAnimationEnd(
            onEnd: (Animation) -> Unit,
        ) {
            setAnimationListener(
                object : AnimationListener {
                    override fun onAnimationStart(animation: Animation) = Unit

                    override fun onAnimationEnd(animation: Animation) {
                        onEnd(animation)
                    }

                    override fun onAnimationRepeat(animation: Animation) = Unit
                },
            )
        }
    }
}
