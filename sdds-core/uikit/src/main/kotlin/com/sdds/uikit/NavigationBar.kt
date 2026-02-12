package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.os.Build
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.isNotEmpty
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
import com.sdds.uikit.statelist.getStyleForState
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
    defStyleRes,
),
    ColorStateHolder {

    private var actionStartColor: ColorStateList? = null
    private var actionEndColor: ColorStateList? = null
    private var titleAppearances: StyleStateList? = null
    private var currentTitleAppearance: Int = 0
    private var currentDescriptionAppearance: Int = 0
    private var titleColor: ColorStateList? = null
    private var descriptionAppearances: StyleStateList? = null
    private var descriptionColor: ColorStateList? = null
    private var backIconTint: ColorStateList? = null
    private var backgroundList: ColorValueStateList? = null
    private var _textBlockTopMargin: Int = 0
    private var _horizontalSpacing: Int = 0
    private var _backIconMargin: Int = 0
    private var _descriptionMargins: NumberStateList? = null
    private var currentDescriptionMargin: Int = 0

    private var contentPaddingStart: Int = 0
    private var contentPaddingTop: Int = 0
    private var contentPaddingEnd: Int = 0
    private var contentPaddingBottom: Int = 0

    private var contentView: View? = null
    private var titleView: View? = null
    private var descriptionView: View? = null
    private var actionStartView: View? = null
    private var actionEndView: View? = null
    private var _textAlignment: Int = TEXT_ALIGNMENT_CENTER
    private var _contentPlacement: Int = CONTENT_PLACEMENT_BOTTOM
    private var _textPlacement: Int = TEXT_PLACEMENT_BOTTOM
    private var _centerAlignmentStrategy: Int = ALIGNMENT_STRATEGY_ABSOLUTE
    private val backIconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }

    private val containerWithPaddings: android.widget.LinearLayout =
        android.widget.LinearLayout(context).apply {
            orientation = VERTICAL
            layoutParams = LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT,
            )
        }
    private val actionsBlock: CustomCenteringLayout = CustomCenteringLayout(context, attrs)

    private val textBlock: android.widget.LinearLayout = android.widget.LinearLayout(context).apply {
        orientation = VERTICAL
        layoutParams = LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT,
        )
    }

    private val titlePlace: FrameLayout = FrameLayout(context)
    private val descriptionPlace: FrameLayout = FrameLayout(context)

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

    var onBackPressed: (() -> Unit)? = null

    /**
     * Выравнивание Title и Description внутри [NavigationBar]
     */
    open var textBlockAlignment: Int
        get() = _textAlignment
        set(value) {
            if (_textAlignment != value) {
                _textAlignment = value
                resolveTextAlignment()
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
                refreshDrawableState()
                changeTextPlacementGlobally()
            }
        }

    /**
     * Стратегия центрирования контента, находящегося в одном блоке
     * с [NavigationBarContent.ACTION_START] и [NavigationBarContent.ACTION_END] по горизонтали.
     */
    open var centerAlignmentStrategy: Int
        get() = _centerAlignmentStrategy
        set(value) {
            if (_centerAlignmentStrategy != value) {
                _centerAlignmentStrategy = value
                if (_centerAlignmentStrategy == ALIGNMENT_STRATEGY_ABSOLUTE) {
                    actionsBlock.centeringStrategy = CustomCenteringLayout.CenteringStrategy.ABSOLUTE
                } else {
                    actionsBlock.centeringStrategy = CustomCenteringLayout.CenteringStrategy.RELATIVE
                }
            }
        }

    /**
     * Выравнивание контента, находящегося между [NavigationBarContent.ACTION_START]
     * и [NavigationBarContent.ACTION_END] по горизонтали.
     */
    open var contentAlignmentBetweenActions: Int
        get() = actionsBlock.alignmentInCenterContent
        set(value) {
            if (actionsBlock.alignmentInCenterContent != value) {
                actionsBlock.alignmentInCenterContent = value
                resolveTextAlignment()
                resolveContentAlignment()
            }
        }

    init {
        orientation = VERTICAL
        obtainAttributes(attrs, defStyleAttr, defStyleRes)
        addView(containerWithPaddings)
        actionsBlock.setBackIcon(backIconView)
        containerWithPaddings.addView(actionsBlock)
        resolveTitleAndIconPlace()
        containerWithPaddings.addView(textBlock)
        applyPaddingsToContainer()
        changeTextPlacementGlobally()
        resolveTextAlignment()
        backIconView.setOnClickListener {
            onBackPressed?.invoke()
        }
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
            titlePlace.removeView(it)
            titleView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [NavigationBarContent.DESCRIPTION]
     */
    open fun removeDescription() {
        descriptionView?.let {
            descriptionPlace.removeView(it)
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
        refreshTextBlockAppearancesAndMargin()
    }

    override fun generateDefaultLayoutParams(): NavigationBarLayoutParams {
        return NavigationBarLayoutParams(
            LayoutParams.WRAP_CONTENT,
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
                        .let { NavigationBarContent.values().getOrElse(it) { null } }
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
                resolveContentAlignment()
            }

            NavigationBarContent.TITLE -> {
                resolveTitlePlacement()
                applyPaddingsToTextBlock()
            }
            NavigationBarContent.DESCRIPTION -> {
                descriptionPlace.addView(child)
                resolveDescriptionMargin()
                applyPaddingsToTextBlock()
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
            backgroundList = getColorValueStateList(context, R.styleable.NavigationBar_sd_background)
            titleAppearances = getStyleStateList(context, R.styleable.NavigationBar_sd_titleAppearance)
            titleAppearances?.let {
                currentTitleAppearance = it.getStyleForState(drawableState)
            }
            titleColor = getColorStateList(R.styleable.NavigationBar_sd_titleColor)
            descriptionAppearances = getStyleStateList(context, R.styleable.NavigationBar_sd_descriptionAppearance)
            descriptionAppearances?.let {
                currentDescriptionAppearance = it.getStyleForState(drawableState)
            }
            descriptionColor = getColorStateList(R.styleable.NavigationBar_sd_descriptionColor)
            backIconTint = getColorStateList(R.styleable.NavigationBar_sd_backIconTint)

            actionStartColor = getColorStateList(R.styleable.NavigationBar_sd_actionStartColor)
            actionEndColor = getColorStateList(R.styleable.NavigationBar_sd_actionEndColor)

            _textBlockTopMargin = getDimensionPixelSize(R.styleable.NavigationBar_sd_textBlockTopMargin, 0)
            _horizontalSpacing = getDimensionPixelSize(R.styleable.NavigationBar_sd_horizontalSpacing, 0)
            _backIconMargin = getDimensionPixelSize(R.styleable.NavigationBar_sd_backIconMargin, 0)
            _descriptionMargins = getNumberStateList(context, R.styleable.NavigationBar_sd_descriptionMargin)
            _descriptionMargins?.let {
                currentDescriptionMargin = it.getIntForState(drawableState)
            }
            contentPaddingStart = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingStart, 0)
            contentPaddingTop = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingTop, 0)
            contentPaddingEnd = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingEnd, 0)
            contentPaddingBottom = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingBottom, 0)
            backIconView.imageTintList = getColorStateList(R.styleable.NavigationBar_sd_backIconTint)

            val icon = getDrawable(R.styleable.NavigationBar_sd_backIcon)
            icon?.let {
                backIconView.setImageDrawable(icon)
                backIconView.setPaddingRelative(0, 0, _backIconMargin, 0)
            }
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
                navigationBarParams.topMargin = currentDescriptionMargin
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
        if (currentTitleAppearance != 0) applyTextAppearance(titleView, currentTitleAppearance)
        colorState = this@NavigationBar.colorState
        titleColor?.let(::setTextColor)
        TextViewCompat.setCompoundDrawableTintList(this, titleColor)
    }

    private fun TextView.applyDescriptionRole() {
        if (currentDescriptionAppearance != 0) applyTextAppearance(descriptionView, currentDescriptionAppearance)
        colorState = this@NavigationBar.colorState
        descriptionColor?.let(::setTextColor)
        TextViewCompat.setCompoundDrawableTintList(this, descriptionColor)
    }

    private fun ImageView.applyTint(tint: ColorStateList?) {
        if (imageTintList == null) imageTintList = tint
    }

    private fun resolveDescriptionMargin() {
        if (titleIsNotBlank()) {
            val lp = descriptionPlace.layoutParams as? LayoutParams
            lp?.let {
                it.topMargin = currentDescriptionMargin
                requestLayout()
                invalidate()
            }
        }
    }

    private fun titleIsNotBlank(): Boolean {
        return when (titleView) {
            is TextView -> (titleView as TextView).text.isNotBlank()
            is ViewGroup -> (titleView as ViewGroup).isNotEmpty()
            else -> false
        }
    }

    private fun resolveTitlePlacement() {
        titlePlace.addView(titleView)
        resolveDescriptionMargin()
    }

    private fun applyPaddingsToContainer() {
        containerWithPaddings.setPaddingRelative(
            contentPaddingStart,
            contentPaddingTop,
            contentPaddingEnd,
            contentPaddingBottom,
        )
    }

    private fun applyPaddingsToTextBlock() {
        if (titleView == null && descriptionView == null) return
        if (textPlacement == TEXT_PLACEMENT_BOTTOM) {
            textBlock.setPadding(0, _textBlockTopMargin, 0, 0)
        } else {
            if (contentView != null && contentPlacement == CONTENT_PLACEMENT_INNER) {
                textBlock.setPaddingRelative(0, 0, _horizontalSpacing, 0)
            } else {
                textBlock.setPadding(0, 0, 0, 0)
            }
        }
    }

    private fun changeTextPlacementGlobally() {
        (textBlock.parent as? ViewGroup)?.removeView(textBlock)
        if (textPlacement == TEXT_PLACEMENT_BOTTOM) {
            containerWithPaddings.addView(textBlock)
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
            if (textPlacement == TEXT_PLACEMENT_INNER) applyPaddingsToTextBlock()
        } else {
            addView(contentView)
        }
        resolveContentAlignment()
    }

    private fun resolveContentAlignment() {
        val lp = contentView?.layoutParams ?: return
        (lp as? LayoutParams)?.gravity =
            if (contentPlacement == CONTENT_PLACEMENT_INNER) {
                Gravity.CENTER_VERTICAL
            } else {
                this@NavigationBar.gravity
            }
        contentView?.layoutParams = lp
    }

    private fun resolveTextAlignment() {
        if (textPlacement == TEXT_PLACEMENT_BOTTOM) containerWithPaddings.gravity = textBlockAlignment
        textBlock.children.forEach { child ->
            val lp = child.layoutParams as? LayoutParams
            lp?.let {
                it.gravity = if (textPlacement == TEXT_PLACEMENT_BOTTOM) {
                    textBlockAlignment
                } else {
                    contentAlignmentBetweenActions
                }
                child.layoutParams = lp
            }
        }
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
        return view == containerWithPaddings ||
            view == contentView && contentPlacement == CONTENT_PLACEMENT_BOTTOM
    }

    private fun refreshTextBlockAppearancesAndMargin() {
        if (titleView != null) refreshTitleAppearance()
        if (descriptionView != null) refreshDescriptionAppearance()
        refreshDescriptionMargin()
    }

    private fun refreshDescriptionMargin() {
        val stateList = _descriptionMargins ?: return
        val old = currentDescriptionMargin
        currentDescriptionMargin = stateList.getIntForState(drawableState)
        if (old != currentDescriptionMargin) {
            resolveDescriptionMargin()
        }
    }

    private fun refreshTitleAppearance() {
        val stateList = titleAppearances ?: return
        val old = currentTitleAppearance
        currentTitleAppearance = stateList.getStyleForState(drawableState)
        if (old != currentTitleAppearance) {
            applyTextAppearance(titleView, currentTitleAppearance)
        }
    }

    private fun refreshDescriptionAppearance() {
        val stateList = descriptionAppearances ?: return
        val old = currentDescriptionAppearance
        currentDescriptionAppearance = stateList.getStyleForState(drawableState)
        if (old != currentDescriptionAppearance) {
            applyTextAppearance(descriptionView, currentDescriptionAppearance)
        }
    }

    private fun applyTextAppearance(view: View?, @StyleRes resId: Int) {
        view ?: return
        val group = view is ViewGroup
        if (group) {
            (view as ViewGroup).children.forEach {
                (it as? TextView)?.setTextAppearance(resId)
            }
        } else {
            (view as? TextView)?.setTextAppearance(context, resId)
        }
    }

    private fun resolveTitleAndIconPlace() {
        textBlock.addView(titlePlace, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        textBlock.addView(descriptionPlace, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
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

        /**
         * Выравнивание текстового блока, содержащего view с ролями [NavigationBarContent.TITLE]
         * и [NavigationBarContent.DESCRIPTION], а так же самих этих view по краю в начале.
         */
        const val TEXT_ALIGNMENT_START = Gravity.START

        /**
         * Выравнивание текстового блока, содержащего view с ролями [NavigationBarContent.TITLE]
         * и [NavigationBarContent.DESCRIPTION], а так же самих этих view по центру.
         */
        const val TEXT_ALIGNMENT_CENTER = Gravity.CENTER

        /**
         * Выравнивание текстового блока, содержащего view с ролями [NavigationBarContent.TITLE]
         * и [NavigationBarContent.DESCRIPTION], а так же самих этих view по краю в конце.
         */
        const val TEXT_ALIGNMENT_END = Gravity.END

        /**
         * Центрирование контента, находящегося в одном блоке с [NavigationBarContent.ACTION_START]
         * и [NavigationBarContent.ACTION_END], относительно ширины [NavigationBar].
         */
        const val ALIGNMENT_STRATEGY_ABSOLUTE = 0

        /**
         * Центрирование контента, находящегося в одном блоке с [NavigationBarContent.ACTION_START]
         * и [NavigationBarContent.ACTION_END], относительно ширины этого блока .
         */
        const val ALIGNMENT_STRATEGY_RELATIVE = 1

        /**
         * Выравнивание контента, находящегося между [NavigationBarContent.ACTION_START]
         * и [NavigationBarContent.ACTION_END] по краю в начале.
         */
        const val CONTENT_ALIGNMENT_BETWEEN_ACTIONS_START = Gravity.START or Gravity.CENTER_VERTICAL

        /**
         * Выравнивание контента, находящегося между [NavigationBarContent.ACTION_START]
         * и [NavigationBarContent.ACTION_END] по центру.
         */
        const val CONTENT_ALIGNMENT_BETWEEN_ACTIONS_CENTER = Gravity.CENTER or Gravity.CENTER_VERTICAL

        /**
         * Выравнивание контента, находящегося между [NavigationBarContent.ACTION_START]
         * и [NavigationBarContent.ACTION_END] по краю в конце.
         */
        const val CONTENT_ALIGNMENT_BETWEEN_ACTIONS_END = Gravity.END or Gravity.CENTER_VERTICAL

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
