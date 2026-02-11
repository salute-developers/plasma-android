package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.os.Build
import android.util.AttributeSet
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.widget.TextViewCompat
import com.sdds.uikit.File.FileContent.LABEL
import com.sdds.uikit.NavigationBar.Companion.CONTENT_PLACEMENT_BOTTOM
import com.sdds.uikit.NavigationBar.Companion.CONTENT_PLACEMENT_INNER
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.navigationbar.CustomCenteringLayout
import com.sdds.uikit.shape.ShapeModel.Companion.SimpleRect
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.NumberStateList
import com.sdds.uikit.statelist.StyleStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.getIntForState
import com.sdds.uikit.statelist.getNumberStateList
import com.sdds.uikit.statelist.getStyleStateList
import com.sdds.uikit.statelist.setBackgroundValueList

open class NavigationBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_navigationBarStyle,
    defStyleRes: Int = R.style.Sdds_Components_NavigationBar,
) : LinearLayout(
    wrapper(context, attrs, defStyleAttr, defStyleRes),
    attrs,
    defStyleAttr,
    defStyleRes
), ColorStateHolder {

    private var actionStartColor: ColorStateList? = null
    private var actionEndColor: ColorStateList? = null
    private var titleAppearance: StyleStateList? = null
    private var titleColor: ColorStateList? = null
    private var descriptionAppearance: StyleStateList? = null
    private var descriptionColor: ColorStateList? = null
    private var backIconTint: ColorStateList? = null
    private var backgroundList: ColorValueStateList? = null
    private var _textBlockTopMargin: Int = 0
    private var _horizontalSpacing: Int = 0
    private var _backIconMargin: Int = 0
    private var _descriptionMargin: NumberStateList? = null

    private var contentPaddingStart: Int = 0
    private var contentPaddingTop: Int = 0
    private var contentPaddingEnd: Int = 0
    private var contentPaddingBottom: Int = 0

    private var contentView: View? = null
    private var titleView: View? = null
    private var descriptionView: View? = null
    private var actionStartView: View? = null
    private var actionEndView: View? = null

    private var _contentPlacement: Int = CONTENT_PLACEMENT_BOTTOM
    private var _textPlacement: Int = TEXT_PLACEMENT_BOTTOM
    private val backIconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }
    private val actionsBlock: CustomCenteringLayout = CustomCenteringLayout(context, attrs)

    private val textBlock: android.widget.LinearLayout = android.widget.LinearLayout(context).apply {
        orientation = VERTICAL
        layoutParams = LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        )
    }

    /**
     * @see ColorStateHolder.colorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * Расположение view с ролью [NavigationBarContent.CONTENT]
     */
    open var contentPlacement: Int
        get() = _contentPlacement
        set(value) {
            if (_contentPlacement != value) {
                _contentPlacement = value
                changeContentPlacementGlobally()
            }
        }

    /**
     * Расположение view с ролями [NavigationBarContent.TITLE]
     * и [NavigationBarContent.DESCRIPTION]
     */
    open var textPlacement: Int
        get() = _textPlacement
        set(value) {
            if (_textPlacement != value) {
                _textPlacement = value
                changeTextPlacementGlobally()
            }
        }

    init {
        orientation = VERTICAL
        obtainAttributes(attrs, defStyleAttr, defStyleRes)
        addView(actionsBlock)
        addView(textBlock)
        applyPaddingsToActionsBlock()
        changeTextPlacementGlobally()
    }

    /**
     * Устанавливает Title, при этом ранее установленный Title будет удален
     * @param title - [View] вью
     * @param params - [NavigationBarLayoutParams] лэйаут параметры для view, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [NavigationBarContent.TITLE]
     */
    open fun setTitle(title: View, params: NavigationBarLayoutParams? = null) {
        universalAddView(title, params, NavigationBarContent.TITLE)
    }

    /**
     * Устанавливает Description, при этом ранее установленный Description будет удален
     * @param description - [View] вью
     * @param params - [NavigationBarLayoutParams] лэйаут параметры для view, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [NavigationBarContent.DESCRIPTION]
     */
    open fun setDescription(description: View, params: NavigationBarLayoutParams? = null) {
        universalAddView(description, params, NavigationBarContent.DESCRIPTION)
    }

    /**
     * Устанавливает Content, при этом ранее установленный Content будет удален
     * @param content - [View] вью
     * @param params - [NavigationBarLayoutParams] лэйаут параметры для view, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [NavigationBarContent.CONTENT]
     */
    open fun setContent(content: View, params: NavigationBarLayoutParams? = null) {
        universalAddView(content, params, NavigationBarContent.CONTENT)
    }

    /**
     * Устанавливает ActionStart, при этом ранее установленный ActionStart будет удален
     * @param actionStart - [View] вью
     * @param params - [NavigationBarLayoutParams] лэйаут параметры для view, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [NavigationBarContent.ACTION_START]
     */
    open fun setActionStart(actionStart: View, params: NavigationBarLayoutParams? = null) {
        universalAddView(actionStart, params, NavigationBarContent.ACTION_START)
    }

    /**
     * Устанавливает ActionEnd, при этом ранее установленный ActionEnd будет удален
     * @param actionEnd - [View] вью
     * @param params - [NavigationBarLayoutParams] лэйаут параметры для view, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [NavigationBarContent.ACTION_START]
     */
    open fun setActionEnd(actionEnd: View, params: NavigationBarLayoutParams? = null) {
        universalAddView(actionEnd, params, NavigationBarContent.ACTION_END)
    }

    /**
     * Удаляет установленную вью с ролью [NavigationBarContent.ACTION_START]
     */
    open fun removeActionStart() {
        actionStartView?.let {
            actionsBlock.removeActionStart()
            actionStartView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [NavigationBarContent.ACTION_END]
     */
    open fun removeActionEnd() {
        actionEndView?.let {
            actionsBlock.removeActionEnd()
            actionEndView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [NavigationBarContent.CONTENT]
     */
    open fun removeContent() {
        contentView?.let {
            (it.parent as? ViewGroup)?.removeView(it)
            contentView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [NavigationBarContent.TITLE]
     */
    open fun removeTitle() {
        titleView?.let {
            textBlock.removeView(it)
            titleView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [NavigationBarContent.DESCRIPTION]
     */
    open fun removeDescription() {
        descriptionView?.let {
            textBlock.removeView(it)
            descriptionView = null
        }
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 2)
        if (textPlacement == TEXT_PLACEMENT_INNER) {
            mergeDrawableStates(drawableState, InlinedState)
        }
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        setBackgroundValueList(backgroundList)
    }

    override fun generateDefaultLayoutParams(): NavigationBarLayoutParams {
        return NavigationBarLayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams?): Boolean {
        return p is NavigationBarLayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): NavigationBarLayoutParams {
        return NavigationBarLayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams?): NavigationBarLayoutParams {
        return NavigationBarLayoutParams(p)
    }

    /**
     * Параметры расположения дочерних [View] в [File]
     */
    class NavigationBarLayoutParams : LayoutParams {

        /**
         * Роль [View] внутри [File]
         */
        var navigationBarContent: NavigationBarContent? = null

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            c.withStyledAttributes(attrs, R.styleable.NavigationBar_Layout) {
                this@NavigationBarLayoutParams.navigationBarContent =
                    getInt(R.styleable.NavigationBar_Layout_layout_navigationBarContent, 0)
                        .let { NavigationBarContent.entries.toTypedArray().getOrElse(it) { null } }
            }
        }

        constructor(width: Int, height: Int) : super(width, height)
        constructor(width: Int, height: Int, navigationBarContent: NavigationBarContent) : super(width, height) {
            this.navigationBarContent = navigationBarContent
        }

        constructor(source: ViewGroup.LayoutParams?) : super(source) {
            if (source is NavigationBarLayoutParams) {
                this.navigationBarContent = source.navigationBarContent
            }
        }
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (checkViewToInternalAdd(child)) {
            super.addView(child, index, params)
            return
        }
        val params = params as? NavigationBarLayoutParams ?: return
        setRoleLink(child, params)
        child?.applyContentRole(params)
        when (params.navigationBarContent) {
            NavigationBarContent.ACTION_START -> actionsBlock.setActionStart(child)
            NavigationBarContent.ACTION_END -> actionsBlock.setActionEnd(child)
            NavigationBarContent.CONTENT -> {
                if (contentPlacement == CONTENT_PLACEMENT_INNER) {
                    actionsBlock.addCenterContent(contentView)
                } else {
                    super.addView(child, index, params)
                }
            }

            NavigationBarContent.TITLE -> placeTextInternal()
            NavigationBarContent.DESCRIPTION -> {
                textBlock.addView(child)
                resolveDescriptionMargin()
            }

            else -> {}
        }
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        actionStartView = null
        actionEndView = null
        titleView = null
        descriptionView = null
        contentView = null
    }

    /**
     * Роли для дочерних элементов [View] в [NavigationBar]
     */
    enum class NavigationBarContent {

        /**
         * Назначает этой [View] роль Активного элемента (с которым предполагается какое-
         * то взаимодейстивие, например нажатие). Расположение - в начале компонента.
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [NavigationBar], позиционирование зависит от
         */
        ACTION_START,

        /**
         * Назначает этой [View] роль Активного элемента (с которым предполагается какое-
         * то взаимодейстивие, например нажатие). Расположение - в конце компонента.
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [NavigationBar], позиционирование зависит от
         */
        ACTION_END,

        /**
         * Назначает этой [View] роль элемента отображающего дополнительный контент.
         * Позиционирование зависит от contentPlacement, [CONTENT_PLACEMENT_INNER] -
         * будет располагаться в том же блоке, что и Actions.
         * [CONTENT_PLACEMENT_BOTTOM] - будет располагаться снизу, под всем остальным контентом
         * компонента [NavigationBar]
         */
        CONTENT,

        /**
         * Назначает этой [View] роль Title (Заголовок). Если view c этой ролью содержит [TextView],
         * будет применен стиль и цвет текста,  заданный в атрибутах [NavigationBar].
         */
        TITLE,

        /**
         * Назначает этой [View] роль Description (Описание). Если view c этой ролью содержит [TextView],
         * будет применен стиль и цвет текста,  заданный в атрибутах [NavigationBar].
         * Если есть [LABEL], то будет следовать за ним, по вертикали.
         */
        DESCRIPTION,
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.NavigationBar, defStyleAttr, defStyleRes) {
            shape?.let {
                val correctShape = it.copy(cornerSizeTopLeft = SimpleRect, cornerSizeTopRight = SimpleRect)
                setShape(correctShape)
            }
            backIconView.imageTintList = getColorStateList(R.styleable.NavigationBar_sd_backIconTint)
            val icon = getDrawable(R.styleable.NavigationBar_sd_backIcon)
            backIconView.setImageDrawable(icon)
            backgroundList = getColorValueStateList(context, R.styleable.NavigationBar_sd_background)
            titleAppearance = getStyleStateList(context, R.styleable.NavigationBar_sd_titleAppearance)
            titleColor = getColorStateList(R.styleable.NavigationBar_sd_titleColor)
            descriptionAppearance = getStyleStateList(context, R.styleable.NavigationBar_sd_descriptionAppearance)
            descriptionColor = getColorStateList(R.styleable.NavigationBar_sd_descriptionColor)
            backIconTint = getColorStateList(R.styleable.NavigationBar_sd_backIconTint)

            actionStartColor = getColorStateList(R.styleable.NavigationBar_sd_actionStartColor)
            actionEndColor = getColorStateList(R.styleable.NavigationBar_sd_actionEndColor)

            _textBlockTopMargin = getDimensionPixelSize(R.styleable.NavigationBar_sd_textBlockTopMargin, 0)
            _horizontalSpacing = getDimensionPixelSize(R.styleable.NavigationBar_sd_horizontalSpacing, 0)
            _backIconMargin = getDimensionPixelSize(R.styleable.NavigationBar_sd_backIconMargin, 0)
            _descriptionMargin = getNumberStateList(context,R.styleable.NavigationBar_sd_descriptionMargin)

            contentPaddingStart = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingStart, 0)
            contentPaddingTop = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingTop, 0)
            contentPaddingEnd = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingEnd, 0)
            contentPaddingBottom = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingBottom, 0)
        }
    }

    private fun setRoleLink(view: View?, navigationBarParams: NavigationBarLayoutParams) {
        when (navigationBarParams.navigationBarContent) {
            NavigationBarContent.ACTION_END -> {
                removeActionEnd()
                actionEndView = view
            }

            NavigationBarContent.ACTION_START -> {
                removeActionStart()
                actionStartView = view
            }

            NavigationBarContent.CONTENT -> {
                removeContent()
                contentView = view
            }

            NavigationBarContent.TITLE -> {
                removeTitle()
                titleView = view
            }

            NavigationBarContent.DESCRIPTION -> {
                removeDescription()
                descriptionView = view
            }

            null -> {}
        }
    }

    private fun View.applyContentRole(navigationBarParams: NavigationBarLayoutParams) {
        val group = this is ViewGroup
        when (navigationBarParams.navigationBarContent) {
            NavigationBarContent.TITLE -> {
                if (group) {
                    (this as ViewGroup).children.forEach {
                        (it as? TextView)?.applyTitleRole()
                    }
                } else {
                    (this as? TextView)?.applyTitleRole()
                }
            }

            NavigationBarContent.DESCRIPTION -> {
                if (group) {
                    (this as ViewGroup).children.forEach {
                        (it as? TextView)?.applyDescriptionRole()
                    }
                } else {
                    (this as? TextView)?.applyDescriptionRole()
                }
                navigationBarParams.topMargin = _descriptionMargin?.getIntForState(drawableState) ?: 0
            }

            NavigationBarContent.ACTION_START -> {
                if (group) {
                    (this as ViewGroup).children.forEach {
                        (it as? ImageView)?.applyTint(actionStartColor)
                    }
                } else {
                    (this as? ImageView)?.applyTint(actionStartColor)
                }
                actionStartView?.setPaddingRelative(0, 0, _horizontalSpacing, 0)
            }

            NavigationBarContent.ACTION_END -> {
                if (group) {
                    (this as ViewGroup).children.forEach {
                        (it as? ImageView)?.applyTint(actionEndColor)
                    }
                } else {
                    (this as? ImageView)?.applyTint(actionEndColor)
                }
                actionEndView?.setPaddingRelative(_horizontalSpacing, 0, 0, 0)
            }

            else -> {}
        }
    }


    private fun TextView.applyTitleRole() {
        titleAppearance?.let { setTextAppearancesList(it) }
        colorState = this@NavigationBar.colorState
        titleColor?.let(::setTextColor)
        TextViewCompat.setCompoundDrawableTintList(this, titleColor)
    }

    private fun TextView.applyDescriptionRole() {
        descriptionAppearance?.let { setTextAppearancesList(it) }
        colorState = this@NavigationBar.colorState
        descriptionColor?.let(::setTextColor)
        TextViewCompat.setCompoundDrawableTintList(this, descriptionColor)
    }

    private fun ImageView.applyTint(tint: ColorStateList?) {
        if (imageTintList == null) imageTintList = tint
    }

    private fun resolveDescriptionMargin() {
        if (titleIsNotBlank()) setDescriptionMargin()
    }

    private fun titleIsNotBlank(): Boolean {
        var blank = false
        titleView?.let {
            blank = it.measuredWidth > 0 && it.measuredHeight > 0
        }
        return blank
    }

    private fun setDescriptionMargin() {
        val lp = descriptionView?.layoutParams as? LayoutParams
        lp?.let {
            it.topMargin = _descriptionMargin?.getIntForState(drawableState) ?: 0
            requestLayout()
            invalidate()
        }
    }

    private fun placeTextInternal() {
        if (descriptionView != null) {
            textBlock.removeView(descriptionView)
            textBlock.addView(titleView)
            textBlock.addView(descriptionView)
        } else {
            textBlock.addView(titleView)
        }
        resolveDescriptionMargin()
    }

    private fun applyPaddingsToActionsBlock() {
        if (textPlacement == TEXT_PLACEMENT_INNER) {
            Log.d("applyPaddings","textPlacement == TEXT_PLACEMENT_INNER")
            actionsBlock.setPaddingRelative(
                contentPaddingStart,
                contentPaddingTop,
                contentPaddingEnd,
                contentPaddingBottom,
            )
        } else {
            Log.d("applyPaddings","textPlacement == TEXT_PLACEMENT_BOTTOM")
            actionsBlock.setPaddingRelative(
                contentPaddingStart,
                contentPaddingTop,
                contentPaddingEnd,
                0,
            )
        }
    }

    private fun applyPaddingsToTextBlock() {
        if (textPlacement == TEXT_PLACEMENT_BOTTOM) {
            textBlock.setPaddingRelative(
                contentPaddingStart,
                contentPaddingTop,
                contentPaddingEnd,
                contentPaddingBottom,
            )
        } else {
            if (contentView != null && contentPlacement == CONTENT_PLACEMENT_INNER) {
                textBlock.setPaddingRelative(0, 0, _horizontalSpacing, 0)
            } else {
                textBlock.setPaddingRelative(0, 0, 0, 0)
            }
        }
    }

    private fun changeTextPlacementGlobally() {
        (textBlock.parent as? ViewGroup)?.removeView(textBlock)
        if (textPlacement == TEXT_PLACEMENT_BOTTOM) {
            if (contentView != null && contentPlacement == CONTENT_PLACEMENT_BOTTOM) {
                removeView(contentView)
                addView(textBlock)
                addView(contentView)
            } else {
                addView(textBlock)
            }
        } else {
            if (contentView != null && contentPlacement == CONTENT_PLACEMENT_INNER) {
                actionsBlock.removeCenterContent()
                actionsBlock.addCenterContent(textBlock)
                actionsBlock.addCenterContent(contentView)
            } else {
                actionsBlock.setCenterContent(textBlock)
            }
        }
        applyPaddingsToTextBlock()
    }

    private fun changeContentPlacementGlobally() {
        (contentView?.parent as? ViewGroup)?.removeView(contentView)
        if (contentPlacement == CONTENT_PLACEMENT_INNER) {
            actionsBlock.addCenterContent(contentView)
        } else {
            addView(contentView)
        }
        val lp = contentView?.layoutParams
        (lp as? LayoutParams)?.gravity = Gravity.CENTER
        contentView?.layoutParams = lp
    }

    private fun universalAddView(
        view: View,
        params: NavigationBarLayoutParams? = null,
        role: NavigationBarContent,
    ) {
        val viewParams = view.layoutParams as? NavigationBarLayoutParams
        val finalParams = params ?: viewParams
        addView(
            view,
            finalParams ?: NavigationBarLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                role,
            ),
        )
    }

    private fun checkViewToInternalAdd(view: View?): Boolean {
        return view == actionsBlock ||
                view == textBlock ||
                view == contentView && contentPlacement == CONTENT_PLACEMENT_BOTTOM
    }

    companion object {

        /**
         * Расположение view с ролью [NavigationBarContent.CONTENT] в блоке с Actions.
         */
        const val CONTENT_PLACEMENT_INNER = 0

        /**
         * Расположение view с ролью [NavigationBarContent.CONTENT] вне блока с Actions,
         * внизу NavigationBar, после всего остального контента.
         */
        const val CONTENT_PLACEMENT_BOTTOM = 1

        /**
         * Расположение текстового блока, содержащего view с ролями [NavigationBarContent.TITLE]
         * и  [NavigationBarContent.DESCRIPTION] в блоке с Actions.
         */
        const val TEXT_PLACEMENT_INNER = 0

        /**
         * Расположение текстового блока, содержащего view с ролями [NavigationBarContent.TITLE]
         * и [NavigationBarContent.DESCRIPTION] после блока с Actions (по вертикали).
         */
        const val TEXT_PLACEMENT_BOTTOM = 1

        const val TEXT_ALIGNMENT_START = 0
        const val TEXT_ALIGNMENT_CENTER = 1
        const val TEXT_ALIGNMENT_END = 2

        const val ALIGNMENT_STRATEGY_ABSOLUTE = 0
        const val ALIGNMENT_STRATEGY_RELATIVE = 1

        private val InlinedState = intArrayOf(R.attr.sd_state_collapsed)

        internal fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var overlay = context
            context.withStyledAttributes(attrs, R.styleable.NavigationBar, defStyleAttr, defStyleRes) {
                val buttonStyle = getResourceId(R.styleable.NavigationBar_sd_iconButtonStyleOverlay, 0)
                if (buttonStyle != 0) overlay = ContextThemeWrapper(context, buttonStyle)
            }
            return overlay
        }
    }
}