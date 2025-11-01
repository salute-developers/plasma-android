package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.os.Build
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.withStyledAttributes
import androidx.core.view.isVisible
import androidx.core.view.marginBottom
import androidx.core.view.marginEnd
import androidx.core.view.marginStart
import androidx.core.view.marginTop
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import kotlin.math.abs

/**
 *
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 */
open class Note @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_noteStyle,
    defStyleRes: Int = R.style.Sdds_Components_Note,
) : FrameLayout(
    wrapper(context, attrs, defStyleAttr, defStyleRes),
    attrs,
    defStyleAttr,
    defStyleRes,
),
    ColorStateHolder {

    private var _title: CharSequence? = null
    private var _text: CharSequence? = null

    @StyleRes
    private var titleAppearance: Int = 0

    @StyleRes
    private var textAppearance: Int = 0
    private var titleColor: ColorStateList? = null
    private var textColor: ColorStateList? = null
    private var _closeIconSize: Int = 0
    private var _contentBeforeArrangement: ContentBeforeVerticalArrangement =
        ContentBeforeVerticalArrangement.Top
    private var _textTopMargin: Int = 0
    private var contentBeforeEndMargin: Int = 0
    private var iconTint: ColorStateList? = null
    private var closeIconTint: ColorStateList? = null
    private var _iconSize: Int = 0

    @DrawableRes
    private var icon: Int = 0

    @DrawableRes
    private var closeIcon: Int = 0
    private val iconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }
    private var titlePaddingEnd: Int = 0
    private var closeTopMargin: Int = 0
    private var closeEndMargin: Int = 0
    private var actionTopMargin: Int = 0

    protected val titleTv: TextView = TextView(context)
    protected val textTv: TextView = TextView(context)
    protected val closeIconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }
    protected var contentBefore: View? = null
    protected var action: View? = null

    init {
        obtainAttributes(attrs, defStyleAttr)
        installTitle()
        installText()
        installClose()
        installIconIfNeed()
    }

    /**
     * Состояние внешнего вида Note
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
            resetChildrenColorState()
        }

    /**
     * Заголовок
     */
    open var title: CharSequence?
        get() = _title
        set(value) {
            if (_title != value) {
                _title = value
                titleTv.text = _title
            }
            titleTv.isVisible = !_title.isNullOrEmpty()
        }

    /**
     * Текст
     */
    open var text: CharSequence?
        get() = _text
        set(value) {
            if (_text != value) {
                _text = value
                textTv.text = _text
            }
            textTv.isVisible = !_text.isNullOrEmpty()
        }

    /**
     * Отступ text от title
     */
    open var textTopMargin: Int
        get() = _textTopMargin
        set(value) {
            if (_textTopMargin != value) {
                _textTopMargin = value
                applyTextTopMargin()
            }
        }

    /**
     * Размер иконки в contentBefore
     */
    open var iconSize: Int
        get() = _iconSize
        set(value) {
            if (_iconSize != value) {
                _iconSize = value
                updateIconSize()
            }
        }

    /**
     * Размер иконки close
     */
    open var closeIconSize: Int
        get() = _closeIconSize
        set(value) {
            if (_closeIconSize != value) {
                _closeIconSize = value
                updateCloseIconSize()
            }
        }

    /**
     * Устанавливает расположение contentBefore
     */
    open var contentBeforeArrangement: ContentBeforeVerticalArrangement
        get() = _contentBeforeArrangement
        set(value) {
            if (_contentBeforeArrangement != value) {
                _contentBeforeArrangement = value
                requestLayout()
                invalidate()
            }
        }

    /**
     * Расположение contentBefore
     */
    enum class ContentBeforeVerticalArrangement {

        /**
         * Сверху
         */
        Top,

        /**
         * По центру
         */
        Center,

        /**
         * Снизу
         */
        Bottom,
    }

    /**
     * Устанавливает цвета заголовка [newTitleColor]
     */
    open fun setTitleColor(newTitleColor: ColorStateList?) {
        if (titleColor != newTitleColor) {
            titleColor = newTitleColor
            titleTv.setTextColor(titleColor)
        }
    }

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    open fun setTitleColor(@ColorInt titleColor: Int) = setTitleColor(ColorStateList.valueOf(titleColor))

    /**
     * Устанавливает цвета текста [newTextColor]
     */
    open fun setTextColor(newTextColor: ColorStateList?) {
        if (textColor != newTextColor) {
            textColor = newTextColor
            textTv.setTextColor(textColor)
        }
    }

    /**
     * Устанавливает цвет текста [textColor]
     */
    open fun setTextColor(@ColorInt textColor: Int) = setTextColor(ColorStateList.valueOf(textColor))

    /**
     * Устанавливает отступ от title до иконки close [paddingEnd]
     */
    open fun setTitlePaddingEnd(paddingEnd: Int) {
        if (titlePaddingEnd != paddingEnd) {
            titlePaddingEnd = paddingEnd
            titleTv.setPaddingRelative(0, 0, titlePaddingEnd, 0)
        }
    }

    /**
     * Устанавливает отступ от text до action [topMargin]
     */
    open fun setActionMarginTop(topMargin: Int) {
        if (actionTopMargin != topMargin) {
            actionTopMargin = topMargin
            updateActionTopMargin()
        }
    }

    /**
     * Устанавливает отступ от слота contentBefore в конце
     */
    open fun setContentBeforeEndMargin(endMargin: Int) {
        if (contentBeforeEndMargin != endMargin) {
            contentBeforeEndMargin = endMargin
            updateContentMarginEnd()
        }
    }

    /**
     * Устанавливает отступы от closeIcon
     */
    open fun setCloseIconMargins(topMargin: Int = 0, endMargin: Int = 0) {
        var change = false
        if (closeTopMargin != topMargin) {
            closeTopMargin = topMargin
            change = true
        }
        if (closeEndMargin != endMargin) {
            closeEndMargin = endMargin
            change = true
        }
        if (change) updateCloseIconMargins()
    }

    /**
     * Устанавливает слушатель нажатий на иконку закрытия.
     * @param listener колбэк нажатий
     */
    open fun setCloseIconClickListener(listener: OnClickListener) {
        closeIconView.setOnClickListener(listener)
    }

    /**
     * Устанавливает иконку из ресурсов по идентификатору
     * @param iconRes идентификатор ресурса иконки
     */
    open fun setIconResource(@DrawableRes iconRes: Int) {
        if (icon != iconRes && iconRes != 0) {
            icon = iconRes
            installIconIfNeed()
        }
    }

    /**
     * Устанавливает иконку close из ресурсов по идентификатору
     * @param closeIconRes идентификатор ресурса иконки
     */
    open fun setCloseIconResource(@DrawableRes closeIconRes: Int) {
        if (closeIcon != closeIconRes && closeIconRes != 0) {
            closeIcon = closeIconRes
            closeIconView.setImageDrawable(AppCompatResources.getDrawable(context, closeIcon))
        }
        setHasClose(closeIcon != 0)
    }

    /**
     * Устанавливает цвета иконки в contentBefore [newIconTint]
     */
    open fun setIconTintList(newIconTint: ColorStateList?) {
        if (iconTint != newIconTint) {
            iconTint = newIconTint
        }
        (contentBefore as? ImageView)?.apply {
            imageTintList = iconTint
        }
    }

    /**
     * Устанавливает цвета иконки close [newCloseIconTint]
     */
    open fun setCloseIconTintList(newCloseIconTint: ColorStateList?) {
        if (closeIconTint != newCloseIconTint) {
            closeIconTint = newCloseIconTint
        }
        closeIconView.imageTintList = closeIconTint
    }

    /**
     * Устанавливает видимость иконки close
     */
    fun setHasClose(hasClose: Boolean) {
        closeIconView.isVisible = hasClose
    }

    /**
     * Устанавливает контент в слот ContentBefore
     * @param view вью для установки в ContentBefore
     * @param params лэйаут парметры, с которыми будет добавлена вью
     */
    open fun setContentBefore(view: View?, params: ViewGroup.LayoutParams? = null) {
        if (view == null) return
        val noteParams = when (params) {
            is LayoutParams -> params
            null -> generateDefaultLayoutParams()
            else -> generateLayoutParams(params)
        }.apply {
            noteContent = NoteContent.CONTENT_BEFORE
        }
        addView(view, -1, noteParams)
    }

    /**
     * Устанавливает контент в слот Action
     * @param view вью для установки в Action
     * @param params лэйаут парметры, с которыми будет добавлена вью
     */
    open fun setAction(view: View?, params: ViewGroup.LayoutParams? = null) {
        if (view == null) return
        val noteParams = when (params) {
            is LayoutParams -> params
            null -> generateDefaultLayoutParams()
            else -> generateLayoutParams(params)
        }.apply {
            noteContent = NoteContent.ACTION
        }
        addView(view, -1, noteParams)
    }

    /**
     * Устанавливает контент в слот Action
     * @param id ссылка идентификкатор лэйаута
     * @param params лэйаут парметры, с которыми будет добавлена вью
     */
    open fun setAction(@LayoutRes id: Int, params: ViewGroup.LayoutParams? = null) {
        val view = LayoutInflater.from(context).inflate(id, this, false)
        setAction(view, params)
    }

    /**
     * Устанавливает контент в слот ContentBefore
     * @param id ссылка идентификкатор лэйаута
     * @param params лэйаут парметры, с которыми будет добавлена вью
     */
    fun setContentBefore(@LayoutRes id: Int, params: ViewGroup.LayoutParams? = null) {
        val view = LayoutInflater.from(context).inflate(id, this, false)
        setContentBefore(view, params)
    }

    /**
     * Удаляет контент из слота ContentBefore
     */
    open fun removeContentBefore() {
        contentBefore?.let { removeView(it) }
    }

    /**
     * Удаляет контент из слота Action
     */
    open fun removeAction() {
        action?.let { removeView(it) }
    }

    /**
     * Роли для дочерних элементов [View] в [Note]
     */
    enum class NoteContent {
        /**
         * Позиционирует [View] в начале [Note] в качестве contentBefore
         */
        CONTENT_BEFORE,

        /**
         * Позиционирует [View] в  [Note] - в качестве action
         */
        ACTION,
    }

    /**
     * Параметры расположения дочерних [View] в [Note]
     */
    class LayoutParams : android.widget.FrameLayout.LayoutParams {
        /**
         * Роль [View] внутри [Note]
         */
        var noteContent: NoteContent = NoteContent.CONTENT_BEFORE

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            c.withStyledAttributes(attrs, R.styleable.Note_Layout) {
                noteContent = getInt(R.styleable.Note_Layout_layout_noteContent, 0)
                    .let {
                        NoteContent.values().getOrElse(it) { NoteContent.CONTENT_BEFORE }
                    }
            }
        }

        constructor(width: Int, height: Int) : super(width, height)
        constructor(source: ViewGroup.LayoutParams) : super(source) {
            if (source is LayoutParams) {
                this.noteContent = source.noteContent
            }
        }
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams?): Boolean = p is LayoutParams
    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams? = LayoutParams(context, attrs)
    override fun generateLayoutParams(p: ViewGroup.LayoutParams?): LayoutParams {
        return if (p != null) LayoutParams(p) else generateDefaultLayoutParams()
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (child == null) return
        if (child == titleTv || child == textTv || child == closeIconView) {
            super.addView(child, index, params)
            return
        }
        val noteParams = when (params) {
            is LayoutParams -> params
            null -> generateDefaultLayoutParams()
            else -> generateLayoutParams(params)
        }
        child.applyContentRole(noteParams)
        super.addView(child, index, noteParams)
    }

    override fun removeView(view: View?) {
        if (view == textTv || view == titleTv || view == closeIconView) return
        if (view == contentBefore) contentBefore = null
        if (view == action) action = null
        super.removeView(view)
    }

    override fun onViewRemoved(child: View?) {
        super.onViewRemoved(child)
        if (child == null) return
        when (child) {
            contentBefore -> contentBefore = null
            action -> action = null
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val horizontalPaddings = paddingStart + paddingEnd
        val verticalPaddings = paddingTop + paddingBottom
        val extraBottomPadding = paddingTop - paddingBottom
        var widthUsed = 0
        var heightUsed = 0
        var contentWidth = 0
        var contentHeight = 0
        contentBefore?.let { cB ->
            measureChildWithMargins(
                cB,
                widthMeasureSpec,
                widthUsed,
                heightMeasureSpec,
                heightUsed,
            )
            contentWidth = cB.measuredWidth + cB.marginStart + cB.marginEnd
            contentHeight = cB.measuredHeight + cB.marginTop + cB.marginBottom
            widthUsed += contentWidth
            heightUsed += contentHeight
        }
        var titleWidth = 0
        var titleHeight = 0
        if (titleTv.isVisible) {
            measureChildWithMargins(titleTv, widthMeasureSpec, widthUsed, heightMeasureSpec, heightUsed)
            titleWidth = titleTv.measuredWidth
            titleHeight = titleTv.measuredHeight
            heightUsed += titleHeight
        }
        var textWidth = 0
        var textHeight = 0
        if (textTv.isVisible) {
            measureChildWithMargins(textTv, widthMeasureSpec, widthUsed, heightMeasureSpec, heightUsed)
            textWidth = textTv.measuredWidth
            textHeight = textTv.measuredHeight + textTopMargin
            heightUsed += textHeight
        }
        var actionWidth = 0
        var actionHeight = 0
        action?.let { ac ->
            measureChildWithMargins(ac, widthMeasureSpec, widthUsed, heightMeasureSpec, heightUsed)
            actionWidth = ac.measuredWidth + ac.marginStart + ac.marginEnd
            actionHeight = ac.measuredHeight + ac.marginTop + ac.marginBottom
        }
        measureChildWithMargins(closeIconView, widthMeasureSpec, 0, heightMeasureSpec, 0)
        val spacerHeight = if (extraBottomPadding > 0) extraBottomPadding else 0
        val layoutWidth = contentWidth + maxOf(titleWidth, textWidth, actionWidth) + horizontalPaddings
        val layoutHeight =
            calculateLayoutHeight(
                contentHeight, titleHeight, textHeight, spacerHeight, actionHeight, contentBeforeArrangement,
            ) + verticalPaddings
        val finalWidth = resolveSize(layoutWidth, widthMeasureSpec)
        val finalHeight = resolveSize(layoutHeight, heightMeasureSpec)
        setMeasuredDimension(finalWidth, finalHeight)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        var contentWidth = 0
        var contentHeight = 0
        var contentWidthMargins = 0
        contentBefore?.let { cB ->
            contentWidth = cB.measuredWidth
            contentHeight = cB.measuredHeight
            contentWidthMargins = contentWidth + cB.marginStart + cB.marginEnd
        }
        val titleHeight = if (titleTv.isVisible) titleTv.measuredHeight else 0
        val textHeight = if (textTv.isVisible) textTv.measuredHeight else 0
        val contentOffsetY = calculateContentOffsetY(contentHeight, titleHeight, textHeight)
        val positiveOffset = contentOffsetY > 0
        val titleOffsetY = if (positiveOffset) 0 else abs(contentOffsetY)
        val contentTop = if (positiveOffset) contentOffsetY else 0
        val x = paddingStart
        contentBefore?.let { cB ->
            cB.layout(
                x + cB.marginStart,
                paddingTop + contentTop + cB.marginTop,
                x + cB.marginStart + contentWidth,
                paddingTop + contentTop + cB.marginTop + contentHeight,
            )
        }
        var y = paddingTop + titleOffsetY
        if (titleTv.isVisible) {
            val titleWidth = titleTv.measuredWidth
            titleTv.layout(x + contentWidthMargins, y, x + contentWidthMargins + titleWidth, y + titleHeight)
            y += titleHeight
        }
        if (textTv.isVisible) {
            val textWidth = textTv.measuredWidth
            if (titleTv.isVisible) y += textTopMargin
            textTv.layout(
                x + contentWidthMargins,
                y,
                x + contentWidthMargins + textWidth,
                y + textHeight,
            )
            y += textHeight
        }
        action?.let { ac ->
            ac.layout(
                x + contentWidthMargins + ac.marginStart,
                y + ac.marginTop,
                x + contentWidthMargins + ac.marginStart + ac.measuredWidth,
                y + ac.marginTop + ac.measuredHeight,
            )
        }
        val closeLeft = if (layoutDirection == LAYOUT_DIRECTION_RTL) {
            closeEndMargin
        } else {
            measuredWidth - closeEndMargin - closeIconSize
        }
        closeIconView.layout(closeLeft, closeTopMargin, closeLeft + closeIconSize, closeTopMargin + closeIconSize)
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        context.withStyledAttributes(attrs, R.styleable.Note, defStyleAttr, 0) {
            _title = getString(R.styleable.Note_sd_title)
            _text = getString(R.styleable.Note_sd_text)
            titleAppearance = getResourceId(R.styleable.Note_sd_titleAppearance, 0)
            textAppearance = getResourceId(R.styleable.Note_sd_textAppearance, 0)
            titleColor = getColorStateList(R.styleable.Note_sd_titleColor)
            textColor = getColorStateList(R.styleable.Note_sd_textColor)
            _textTopMargin = getDimensionPixelSize(R.styleable.Note_sd_textTopMargin, 0)
            iconTint = getColorStateList(R.styleable.Note_sd_iconTint)
            _iconSize = getDimensionPixelSize(R.styleable.Note_sd_iconSize, 0)
            val arrangement = getInt(R.styleable.Note_sd_contentBeforeArrangement, 0)
            _contentBeforeArrangement = ContentBeforeVerticalArrangement.values().getOrElse(arrangement) {
                ContentBeforeVerticalArrangement.Top
            }
            contentBeforeEndMargin = getDimensionPixelSize(R.styleable.Note_sd_contentBeforeEndMargin, 0)
            closeIconTint = getColorStateList(R.styleable.Note_sd_closeIconTint)
            closeIcon = getResourceId(R.styleable.Note_sd_closeIcon, 0)
            val close = getDrawable(R.styleable.Note_sd_closeIcon)
            closeIconView.setImageDrawable(close)
            setHasClose(close != null)
            _closeIconSize = getDimensionPixelSize(R.styleable.Note_sd_closeIconSize, 0)
            icon = getResourceId(R.styleable.Note_sd_icon, 0)
            titlePaddingEnd = getDimensionPixelSize(R.styleable.Note_sd_titlePaddingEnd, 0)
            actionTopMargin = getDimensionPixelSize(R.styleable.Note_sd_actionTopMargin, 0)
            closeTopMargin = getDimensionPixelSize(R.styleable.Note_sd_closeTopMargin, 0)
            closeEndMargin = getDimensionPixelSize(R.styleable.Note_sd_closeEndMargin, 0)
        }
    }

    private fun installTitle() {
        titleTv.apply {
            if (titleAppearance != 0) setTextAppearance(titleAppearance)
            titleColor?.let { setTextColor(it) }
            setPaddingRelative(0, 0, titlePaddingEnd, 0)
            text = _title
        }
        titleTv.isVisible = !_title.isNullOrEmpty()
        addView(titleTv)
    }

    private fun installText() {
        textTv.apply {
            if (textAppearance != 0) setTextAppearance(textAppearance)
            textColor?.let { setTextColor(it) }
            text = _text
        }
        textTv.isVisible = !_text.isNullOrEmpty()
        addView(textTv)
    }

    private fun installClose() {
        val size = if (closeIconSize > 0) closeIconSize else ViewGroup.LayoutParams.WRAP_CONTENT
        val lp = LayoutParams(size, size).apply { setMargins(0, closeTopMargin, closeEndMargin, 0) }
        closeIconView.imageTintList = closeIconTint
        addView(closeIconView, lp)
    }

    private fun View.applyContentRole(noteParams: LayoutParams) {
        when (noteParams.noteContent) {
            NoteContent.CONTENT_BEFORE -> {
                if (contentBefore != this) {
                    removeContentBefore()
                    contentBefore = this
                }
                val lp = (noteParams as? MarginLayoutParams) ?: return
                (this as? ImageView)?.apply {
                    colorState = this@Note.colorState
                    imageTintList = iconTint
                    if (_iconSize > 0) {
                        lp.width = _iconSize
                        lp.height = _iconSize
                    }
                }
                lp.marginEnd = contentBeforeEndMargin
                this.layoutParams = lp
            }

            NoteContent.ACTION -> {
                if (action != this) {
                    removeAction()
                    action = this
                }
                updateActionTopMargin()
            }
        }
    }

    private fun applyTextTopMargin() {
        val lp = (textTv.layoutParams as? MarginLayoutParams)
        lp?.let {
            it.topMargin = _textTopMargin
            textTv.layoutParams = it
        }
    }

    private fun updateContentMarginEnd() {
        contentBefore?.let {
            val lp = (it.layoutParams as? MarginLayoutParams) ?: return
            lp.marginEnd = contentBeforeEndMargin
            it.layoutParams = lp
        }
    }

    private fun updateActionTopMargin() {
        action?.let {
            val lp = (it.layoutParams as? MarginLayoutParams) ?: return
            lp.topMargin = actionTopMargin
            it.layoutParams = lp
        }
    }

    private fun updateCloseIconMargins() {
        val lp = (closeIconView.layoutParams as? MarginLayoutParams) ?: return
        lp.topMargin = closeTopMargin
        lp.marginEnd = closeEndMargin
        closeIconView.layoutParams = lp
    }

    private fun updateIconSize() {
        if (_iconSize > 0) {
            (contentBefore as? ImageView)?.let { imageView ->
                val lp = (imageView.layoutParams as? MarginLayoutParams) ?: return
                lp.width = _iconSize
                lp.height = _iconSize
                imageView.layoutParams = lp
            }
        }
    }

    private fun updateCloseIconSize() {
        val lp = (closeIconView.layoutParams as? MarginLayoutParams) ?: return
        lp.width = _closeIconSize
        lp.height = _closeIconSize
        closeIconView.layoutParams = lp
    }

    private fun resetChildrenColorState() {
        titleTv.colorState = colorState
        textTv.colorState = colorState
        contentBefore?.let { if (it is ImageView) it.colorState = colorState }
    }

    private fun installIconIfNeed() {
        if (icon != 0) {
            iconView.setImageDrawable(
                AppCompatResources.getDrawable(context, icon),
            )
            if (contentBefore == null) {
                setContentBefore(iconView)
            }
        }
    }

    private fun calculateLayoutHeight(
        cbHeight: Int,
        titleHeight: Int,
        textHeight: Int,
        spacerHeight: Int,
        aHeight: Int,
        arrangement: ContentBeforeVerticalArrangement,
    ): Int {
        return when (arrangement) {
            ContentBeforeVerticalArrangement.Top ->
                calculateHeightWhenTop(cbHeight, titleHeight, textHeight, spacerHeight, aHeight)

            ContentBeforeVerticalArrangement.Center ->
                calculateHeightWhenCenter(cbHeight, titleHeight, textHeight, spacerHeight, aHeight)

            ContentBeforeVerticalArrangement.Bottom ->
                calculateHeightWhenBottom(cbHeight, titleHeight, textHeight, spacerHeight, aHeight)
        }
    }

    private fun calculateHeightWhenTop(
        cbHeight: Int,
        titleHeight: Int,
        textHeight: Int,
        spacerHeight: Int,
        aHeight: Int,
    ): Int {
        val half = cbHeight / 2
        val extraHeight = if (aHeight > 0) aHeight else spacerHeight
        return when {
            half >= (titleHeight / 2 + textHeight + aHeight) -> cbHeight + spacerHeight
            half > titleHeight / 2 -> half + titleHeight / 2 + textHeight + extraHeight
            else -> titleHeight + textHeight + extraHeight
        }
    }

    private fun calculateHeightWhenCenter(
        cbHeight: Int,
        titleHeight: Int,
        textHeight: Int,
        spacerHeight: Int,
        aHeight: Int,
    ): Int {
        val half = cbHeight / 2
        val extraHeight = if (aHeight > 0) aHeight else spacerHeight
        return when {
            half >= ((titleHeight + textHeight) / 2 + aHeight) -> cbHeight + spacerHeight
            half > (titleHeight + textHeight) / 2 -> half + (titleHeight + textHeight) / 2 + extraHeight
            else -> titleHeight + textHeight + extraHeight
        }
    }

    private fun calculateHeightWhenBottom(
        cbHeight: Int,
        titleHeight: Int,
        textHeight: Int,
        spacerHeight: Int,
        aHeight: Int,
    ): Int {
        val extraHeight = if (aHeight > 0) aHeight else spacerHeight
        return when {
            cbHeight >= (titleHeight + textHeight) -> cbHeight + extraHeight
            else -> titleHeight + textHeight + extraHeight
        }
    }

    private fun calculateContentOffsetY(contentHeight: Int, titleHeight: Int, textHeight: Int): Int {
        val someTextHeight = if (titleHeight > 0) titleHeight else textHeight
        val finalTextHeight = if (titleHeight > 0 && textHeight > 0) {
            textHeight + textTopMargin
        } else {
            textHeight
        }
        return when (contentBeforeArrangement) {
            ContentBeforeVerticalArrangement.Top -> (someTextHeight - contentHeight) / 2
            ContentBeforeVerticalArrangement.Center -> (titleHeight + finalTextHeight - contentHeight) / 2
            ContentBeforeVerticalArrangement.Bottom -> titleHeight + textHeight - contentHeight
        }
    }

    companion object {
        internal fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var linkButtonStyleOverlay = 0
            context.withStyledAttributes(attrs, R.styleable.Note, defStyleAttr, defStyleRes) {
                linkButtonStyleOverlay = getResourceId(R.styleable.Note_sd_linkButtonStyleOverlay, 0)
            }
            val themeOverlay =
                if (linkButtonStyleOverlay != 0) {
                    ContextThemeWrapper(context, linkButtonStyleOverlay)
                } else {
                    context
                }
            return themeOverlay
        }
    }
}
