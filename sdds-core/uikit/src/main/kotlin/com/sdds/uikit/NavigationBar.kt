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
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.isVisible
import com.sdds.uikit.File.FileContent.LABEL
import com.sdds.uikit.NavigationBar.Companion.CONTENT_PLACEMENT_BOTTOM
import com.sdds.uikit.NavigationBar.Companion.CONTENT_PLACEMENT_INNER
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.navigationbar.CustomCenteringLayout
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.ShapeModel.Companion.SimpleRect
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.NumberStateList
import com.sdds.uikit.statelist.StyleStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.getIntForState
import com.sdds.uikit.statelist.getNumberStateList
import com.sdds.uikit.statelist.getStyleForState
import com.sdds.uikit.statelist.getStyleStateList
import com.sdds.uikit.statelist.setBackgroundValueList

/**
 * Верхняя панель интерфейса, служащая для навигации и отображения ключевых действий.
 * Позволяет компоновать дочерние [View] согласно заданным им ролей [NavigationBarContent] при помощи
 * атрибута [R.styleable.NavigationBar_Layout_layout_navigationBarContent].
 * Также поддерживает установку [ShapeModel].
 * @see Shapeable
 * @param context контекст
 * @param attrs атрибуты view
 * @param defStyleAttr атрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 */
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

    private var actionStartColors: ColorValueStateList? = null
    private var actionEndColors: ColorValueStateList? = null
    private var titleAppearances: StyleStateList? = null
    private var currentTitleAppearance: Int = 0
    private var currentDescriptionAppearance: Int = 0
    private var titleColors: ColorValueStateList? = null
    private var descriptionAppearances: StyleStateList? = null
    private var descriptionColors: ColorValueStateList? = null
    private var backIconTint: ColorValueStateList? = null
    private var backgroundList: ColorValueStateList? = null
    private var textBlockTopMargin: Int = 0
    private var horizontalSpacing: Int = 0
    private var backIconMargin: Int = 0
    private var descriptionMargins: NumberStateList? = null
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
    private var textAlignment: Int = TEXT_ALIGNMENT_CENTER
    private var _contentPlacement: Int = CONTENT_PLACEMENT_BOTTOM
    private var _textPlacement: Int = TEXT_PLACEMENT_BOTTOM
    private var _centerAlignmentStrategy: Int = ALIGNMENT_STRATEGY_ABSOLUTE

    @DrawableRes
    private var icon: Int = 0
    private val backIconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }

    private val containerWithPaddings: android.widget.LinearLayout =
        android.widget.LinearLayout(context).apply {
            isDuplicateParentStateEnabled = true
            orientation = VERTICAL
            layoutParams = LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT,
            )
        }
    private val actionsBlock: CustomCenteringLayout = CustomCenteringLayout(context).apply {
        isDuplicateParentStateEnabled = true
    }

    private val textBlock: android.widget.LinearLayout = android.widget.LinearLayout(context).apply {
        orientation = VERTICAL
        isDuplicateParentStateEnabled = true
        layoutParams = LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT,
        )
    }

    private val titlePlace: FrameLayout = FrameLayout(context).apply {
        isDuplicateParentStateEnabled = true
    }
    private val descriptionPlace: FrameLayout = FrameLayout(context).apply {
        isDuplicateParentStateEnabled = true
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
     * Выравнивание Title и Description внутри [NavigationBar]
     */
    open var textBlockAlignment: Int
        get() = textAlignment
        set(value) {
            if (textAlignment != value) {
                textAlignment = value
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
                resolveTextAlignment()
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
        placeServiceChildren()
        obtainAttributes(attrs, defStyleAttr, defStyleRes)
        installIconIfNeed()
        actionsBlock.setBackIcon(backIconView)
        resolveTitleAndDescriptionPlace()
        applyPaddingsToContainer()
        changeTextPlacementGlobally()
        resolveTextAlignment()
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

    /**
     * Слушатель нажатия иконки "назад"
     */
    open fun setOnBackIconClickListener(listener: () -> Unit) {
        backIconView.setOnClickListener { listener() }
    }

    /**
     * Устанавливает иконку из ресурсов по идентификатору
     * @param iconRes идентификатор ресурса иконки
     */
    open fun setBackIconResource(@DrawableRes iconRes: Int) {
        if (icon != iconRes) {
            icon = iconRes
            installIconIfNeed()
        }
    }

    /**
     * Устанавливает отступ текстового блока, содержащего
     * [NavigationBarContent.TITLE], [NavigationBarContent.DESCRIPTION], от блока с
     * [NavigationBarContent.ACTION_START] и [NavigationBarContent.ACTION_END]
     * @param margin отступ
     */
    open fun setTextBlockTopMargin(margin: Int) {
        if (textBlockTopMargin != margin) {
            textBlockTopMargin = margin
            resolveTextBlockPaddings()
        }
    }

    /**
     * Устанавливает отступ от иконки "назад" до [NavigationBarContent.ACTION_START]
     * @param margin отступ
     */
    open fun setBackIconMargin(margin: Int) {
        if (backIconMargin != margin) {
            backIconMargin = margin
            backIconView.setPaddingRelative(0, 0, backIconMargin, 0)
        }
    }

    /**
     * Устанавливает видимость иконки "назад"
     * @param isVisible видимость
     */
    open fun setBackIconVisibility(isVisible: Boolean) {
        backIconView.isVisible = isVisible
    }

    /**
     * Устанавливает отступ между всем контентом, находящимся в блоке с [NavigationBarContent.ACTION_START]
     * и [NavigationBarContent.ACTION_END]
     * @param spacing отступ
     */
    open fun setHorizontalSpacing(spacing: Int) {
        if (horizontalSpacing != spacing) {
            horizontalSpacing = spacing
            actionStartView?.setPaddingRelative(0, 0, horizontalSpacing, 0)
            actionEndView?.setPaddingRelative(horizontalSpacing, 0, 0, 0)
            resolveTextBlockPaddings()
        }
    }

    /**
     * Устанавливает paddings для контейнера, содержащего вью с ролями [NavigationBarContent.ACTION_START],
     * [NavigationBarContent.ACTION_END], [NavigationBarContent.TITLE], [NavigationBarContent.DESCRIPTION]
     * @param start padding в начале
     * @param top padding в верху
     * @param end padding в конце
     * @param bottom padding в низу
     */
    open fun setContentPaddingsRelative(start: Int, top: Int, end: Int, bottom: Int) {
        var changed = false
        if (contentPaddingStart != start) {
            contentPaddingStart = start
            changed = true
        }
        if (contentPaddingEnd != end) {
            contentPaddingEnd = end
            changed = true
        }
        if (contentPaddingTop != top) {
            contentPaddingTop = top
            changed = true
        }
        if (contentPaddingBottom != bottom) {
            contentPaddingBottom = bottom
            changed = true
        }
        if (changed) applyPaddingsToContainer()
    }

    /**
     * Устанавливает список стилей [StyleStateList] для view с ролью [NavigationBarContent.TITLE],
     * которые соответствуют drawableState
     * @param newTitleAppearances список стилей
     */
    open fun setTitleAppearancesList(newTitleAppearances: StyleStateList?) {
        if (titleAppearances != newTitleAppearances) {
            titleAppearances = newTitleAppearances
            applyTextAppearances(titleView, titleAppearances)
            refreshDrawableState()
        }
    }

    /**
     * Устанавливает стиль для view с ролью [NavigationBarContent.TITLE]
     * @param titleAppearanceId идентификатор стиля текста в ресурсах
     */
    fun setTitleAppearance(@StyleRes titleAppearanceId: Int) {
        setTitleAppearancesList(StyleStateList.valueOf(titleAppearanceId))
    }

    /**
     * Устанавливает список стилей [StyleStateList] для view с ролью [NavigationBarContent.DESCRIPTION],
     * которые соответствуют drawableState
     * @param newDescriptionAppearances список стилей
     */
    open fun setDescriptionAppearancesList(newDescriptionAppearances: StyleStateList?) {
        if (descriptionAppearances != newDescriptionAppearances) {
            descriptionAppearances = newDescriptionAppearances
            applyTextAppearances(titleView, titleAppearances)
            refreshDrawableState()
        }
    }

    /**
     * Устанавливает стиль для view с ролью [NavigationBarContent.DESCRIPTION]
     * @param descriptionAppearanceId идентификатор стиля текста в ресурсах
     */
    fun setDescriptionAppearance(@StyleRes descriptionAppearanceId: Int) {
        setDescriptionAppearancesList(StyleStateList.valueOf(descriptionAppearanceId))
    }

    /**
     * Устанавливает список, содержащий отступы [NumberStateList] для view с
     * ролью [NavigationBarContent.DESCRIPTION], которые соответствуют drawableState
     * @param newDescriptionMargins список со значениями отступов
     */
    open fun setDescriptionMarginsList(newDescriptionMargins: NumberStateList?) {
        if (descriptionMargins != newDescriptionMargins) {
            descriptionMargins = newDescriptionMargins
            refreshDescriptionMargin()
        }
    }

    /**
     * Устанавливает отступ для view с ролью [NavigationBarContent.DESCRIPTION]
     * @param margin отступ
     */
    fun setDescriptionMargin(margin: Int) {
        setDescriptionMarginsList(NumberStateList.valueOf(margin))
    }

    /**
     * Устанавливает цвета текста для view с ролью [NavigationBarContent.TITLE]
     * @param colors [ColorValueStateList] цвета
     */
    open fun setTitleTextColors(colors: ColorValueStateList?) {
        if (titleColors != colors) {
            titleColors = colors
            titleColors?.let { applyTextColors(titleView, it) }
        }
    }

    /**
     * Устанавливает цвета текста для view с ролью [NavigationBarContent.TITLE]
     * @param colors [ColorStateList] цвета
     */
    open fun setTitleTextColors(colors: ColorStateList?) {
        setTitleTextColors(ColorValueStateList.valueOf(colors))
    }

    /**
     * Устанавливает цвет текста для view с ролью [NavigationBarContent.TITLE]
     * @param color цвет текста
     */
    fun setTitleTextColor(@ColorInt color: Int) {
        setTitleTextColors(ColorValueStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета текста для view с ролью [NavigationBarContent.DESCRIPTION]
     * @param colors [ColorValueStateList] цвета
     */
    open fun setDescriptionTextColors(colors: ColorValueStateList?) {
        if (descriptionColors != colors) {
            descriptionColors = colors
            descriptionColors?.let { applyTextColors(descriptionView, it) }
        }
    }

    /**
     * Устанавливает цвета текста для view с ролью [NavigationBarContent.DESCRIPTION]
     * @param colors [ColorStateList] цвета
     */
    open fun setDescriptionTextColors(colors: ColorStateList?) {
        setDescriptionTextColors(ColorValueStateList.valueOf(colors))
    }

    /**
     * Устанавливает цвет текста для view с ролью [NavigationBarContent.DESCRIPTION]
     * @param color цвет текста
     */
    fun setDescriptionTextColor(@ColorInt color: Int) {
        setDescriptionTextColors(ColorValueStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета для view с ролью [NavigationBarContent.ACTION_START]
     * @param colors [ColorValueStateList] цвета
     */
    open fun setActionStartColors(colors: ColorValueStateList?) {
        if (actionStartColors != colors) {
            actionStartColors = colors
            applyImageColors(actionStartView, actionStartColors)
        }
    }

    /**
     * Устанавливает цвета для view с ролью [NavigationBarContent.ACTION_START]
     * @param colors [ColorStateList] цвета
     */
    open fun setActionStartColors(colors: ColorStateList?) {
        setActionStartColors(ColorValueStateList.valueOf(colors))
    }

    /**
     * Устанавливает цвет для view с ролью [NavigationBarContent.ACTION_START]
     * @param color цвет
     */
    fun setActionStartColor(@ColorInt color: Int) {
        setActionStartColors(ColorValueStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета для view с ролью [NavigationBarContent.ACTION_END]
     * @param colors [ColorValueStateList] цвета
     */
    open fun setActionEndColors(colors: ColorValueStateList?) {
        if (actionEndColors != colors) {
            actionEndColors = colors
            applyImageColors(actionEndView, actionEndColors)
        }
    }

    /**
     * Устанавливает цвета для view с ролью [NavigationBarContent.ACTION_END]
     * @param colors [ColorStateList] цвета
     */
    open fun setActionEndColors(colors: ColorStateList?) {
        setActionEndColors(ColorValueStateList.valueOf(colors))
    }

    /**
     * Устанавливает цвет для view с ролью [NavigationBarContent.ACTION_END]
     * @param color цвет
     */
    fun setActionEndColor(@ColorInt color: Int) {
        setActionEndColors(ColorValueStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета для иконки "назад"
     * @param colors [ColorValueStateList] цвета
     */
    open fun setBackIconColors(colors: ColorValueStateList?) {
        if (backIconTint != colors) {
            backIconTint = colors
            backIconView.setImageTintValueList(backIconTint)
        }
    }

    /**
     * Устанавливает цвета для иконки "назад"
     * @param colors [ColorStateList] цвета
     */
    open fun setBackIconColors(colors: ColorStateList?) {
        setBackIconColors(ColorValueStateList.valueOf(colors))
    }

    /**
     * Устанавливает цвет для иконки "назад"
     * @param color цвет
     */
    fun setBackIconColor(@ColorInt color: Int) {
        setBackIconColors(ColorValueStateList.valueOf(color))
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
        refreshDescriptionMargin()
    }

    override fun generateDefaultLayoutParams(): NavigationBarLayoutParams {
        return NavigationBarLayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT,
            navigationBarContent = NavigationBarContent.CONTENT,
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
        var navigationBarContent: NavigationBarContent = NavigationBarContent.CONTENT

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            c.withStyledAttributes(attrs, R.styleable.NavigationBar_Layout) {
                navigationBarContent =
                    getInt(R.styleable.NavigationBar_Layout_layout_navigationBarContent, 0)
                        .let {
                            NavigationBarContent.entries.toTypedArray().getOrElse(it) { NavigationBarContent.CONTENT }
                        }
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

    override fun removeAllViews() {
        removeActionStart()
        removeActionEnd()
        removeTitle()
        removeDescription()
        removeContent()
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (checkViewToInternalAdd(child)) {
            super.addView(child, index, params)
            return
        }
        val params = params as? NavigationBarLayoutParams ?: generateDefaultLayoutParams()
        setRoleLink(child, params)
        child?.applyContentRole(params)
        when (params.navigationBarContent) {
            NavigationBarContent.ACTION_START ->
                actionsBlock.setActionStart(child, convertToLinearParams(params))

            NavigationBarContent.ACTION_END ->
                actionsBlock.setActionEnd(child, convertToLinearParams(params))

            NavigationBarContent.CONTENT -> {
                if (contentPlacement == CONTENT_PLACEMENT_INNER) {
                    actionsBlock.addCenterContent(child, convertToLinearParams(params))
                } else {
                    super.addView(child, index, params)
                }
                resolveContentAlignment()
            }

            NavigationBarContent.TITLE -> {
                titlePlace.addView(child, convertToFrameParams(params))
                resolveDescriptionMargin()
                resolveTextBlockPaddings()
            }

            NavigationBarContent.DESCRIPTION -> {
                descriptionPlace.addView(child, convertToFrameParams(params))
                resolveDescriptionMargin()
                resolveTextBlockPaddings()
            }

            else -> {}
        }
    }

    /**
     * Роли для дочерних элементов [View] в [NavigationBar]
     */
    enum class NavigationBarContent {

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
            titleColors = getColorValueStateList(context, R.styleable.NavigationBar_sd_titleColor)
            descriptionAppearances = getStyleStateList(context, R.styleable.NavigationBar_sd_descriptionAppearance)
            descriptionAppearances?.let {
                currentDescriptionAppearance = it.getStyleForState(drawableState)
            }
            descriptionColors = getColorValueStateList(context, R.styleable.NavigationBar_sd_descriptionColor)

            actionStartColors = getColorValueStateList(context, R.styleable.NavigationBar_sd_actionStartColor)
            actionEndColors = getColorValueStateList(context, R.styleable.NavigationBar_sd_actionEndColor)

            textBlockTopMargin = getDimensionPixelSize(R.styleable.NavigationBar_sd_textBlockTopMargin, 0)
            horizontalSpacing = getDimensionPixelSize(R.styleable.NavigationBar_sd_horizontalSpacing, 0)
            backIconMargin = getDimensionPixelSize(R.styleable.NavigationBar_sd_backIconMargin, 0)
            descriptionMargins = getNumberStateList(context, R.styleable.NavigationBar_sd_descriptionMargin)
            descriptionMargins?.let {
                currentDescriptionMargin = it.getIntForState(drawableState)
            }
            contentPaddingStart = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingStart, 0)
            contentPaddingTop = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingTop, 0)
            contentPaddingEnd = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingEnd, 0)
            contentPaddingBottom = getDimensionPixelSize(R.styleable.NavigationBar_sd_contentPaddingBottom, 0)
            backIconTint = getColorValueStateList(context, R.styleable.NavigationBar_sd_backIconTint)
            backIconView.setImageTintValueList(backIconTint)
            icon = getResourceId(R.styleable.NavigationBar_sd_backIcon, 0)
            _textPlacement = getInt(R.styleable.NavigationBar_sd_navbarTextPlacement, TEXT_PLACEMENT_BOTTOM)
            textAlignment = getInt(R.styleable.NavigationBar_sd_navbarTextAlignment, TEXT_ALIGNMENT_CENTER)
            _contentPlacement =
                getInt(R.styleable.NavigationBar_sd_navbarContentPlacement, CONTENT_PLACEMENT_BOTTOM)
            centerAlignmentStrategy =
                getInt(R.styleable.NavigationBar_sd_centerAlignmentStrategy, ALIGNMENT_STRATEGY_ABSOLUTE)
            actionsBlock.alignmentInCenterContent =
                getInt(
                    R.styleable.NavigationBar_sd_contentAlignmentBetweenActions,
                    CONTENT_ALIGNMENT_BETWEEN_ACTIONS_CENTER,
                )
        }
    }

    private fun installIconIfNeed() {
        if (icon != 0) {
            backIconView.setImageDrawable(
                AppCompatResources.getDrawable(context, icon),
            )
            backIconView.setPaddingRelative(0, 0, backIconMargin, 0)
        } else {
            backIconView.setImageDrawable(null)
            backIconView.setPaddingRelative(0, 0, 0, 0)
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

            NavigationBarContent.TITLE -> {
                removeTitle()
                titleView = view
            }

            NavigationBarContent.DESCRIPTION -> {
                removeDescription()
                descriptionView = view
            }

            else -> {
                removeContent()
                contentView = view
            }
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
            }

            NavigationBarContent.ACTION_START -> {
                applyImageColors(this, actionStartColors)
                actionStartView?.setPaddingRelative(0, 0, horizontalSpacing, 0)
            }

            NavigationBarContent.ACTION_END -> {
                applyImageColors(this, actionEndColors)
                actionEndView?.setPaddingRelative(horizontalSpacing, 0, 0, 0)
            }

            else -> {}
        }
    }

    private fun TextView.applyTitleRole() {
        isDuplicateParentStateEnabled = true
        titleAppearances?.let { setTextAppearancesList(it) }
        colorState = this@NavigationBar.colorState
        titleColors?.let(::setTextColor)
    }

    private fun TextView.applyDescriptionRole() {
        isDuplicateParentStateEnabled = true
        descriptionAppearances?.let { setTextAppearancesList(it) }
        colorState = this@NavigationBar.colorState
        descriptionColors?.let(::setTextColor)
    }

    private fun resolveDescriptionMargin() {
        val lp = descriptionView?.layoutParams as? FrameLayout.LayoutParams
        lp?.let {
            it.topMargin = currentDescriptionMargin
            requestLayout()
            invalidate()
        }
    }

    private fun applyPaddingsToContainer() {
        containerWithPaddings.setPaddingRelative(
            contentPaddingStart,
            contentPaddingTop,
            contentPaddingEnd,
            contentPaddingBottom,
        )
    }

    private fun resolveTextBlockPaddings() {
        val lp = titleView?.layoutParams as? FrameLayout.LayoutParams
        if (textPlacement == TEXT_PLACEMENT_BOTTOM) {
            lp?.let {
                it.topMargin = textBlockTopMargin
                requestLayout()
                invalidate()
            }
        } else {
            lp?.let {
                it.topMargin = 0
                requestLayout()
                invalidate()
            }
            if (contentView != null && contentPlacement == CONTENT_PLACEMENT_INNER) {
                textBlock.setPaddingRelative(0, 0, horizontalSpacing, 0)
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
        resolveTextBlockPaddings()
    }

    private fun changeContentPlacementGlobally() {
        (contentView?.parent as? ViewGroup)?.removeView(contentView)
        if (contentPlacement == CONTENT_PLACEMENT_INNER) {
            actionsBlock.addCenterContent(contentView)
            if (textPlacement == TEXT_PLACEMENT_INNER) resolveTextBlockPaddings()
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
            (view == contentView && contentPlacement == CONTENT_PLACEMENT_BOTTOM)
    }

    private fun refreshDescriptionMargin() {
        val stateList = descriptionMargins ?: return
        val old = currentDescriptionMargin
        currentDescriptionMargin = stateList.getIntForState(drawableState)
        if (old != currentDescriptionMargin) {
            resolveDescriptionMargin()
        }
    }

    private fun applyTextAppearances(view: View?, appearances: StyleStateList?) {
        view ?: return
        val group = view is ViewGroup
        if (group) {
            (view as ViewGroup).children.forEach {
                (it as? TextView)?.setTextAppearancesList(appearances)
            }
        } else {
            (view as? TextView)?.setTextAppearancesList(appearances)
        }
    }

    private fun applyTextColors(view: View?, colors: ColorValueStateList) {
        view ?: return
        val group = view is ViewGroup
        if (group) {
            (view as ViewGroup).children.forEach {
                (it as? TextView)?.setTextColor(colors)
            }
        } else {
            (view as? TextView)?.setTextColor(colors)
        }
    }

    private fun applyImageColors(view: View?, colors: ColorValueStateList?) {
        view ?: return
        val group = view is ViewGroup
        if (group) {
            (view as ViewGroup).children.forEach {
                (it as? ImageView)?.applyTint(colors)
            }
        } else {
            (view as? ImageView)?.applyTint(colors)
        }
    }

    private fun ImageView.applyTint(tint: ColorValueStateList?) {
        colorState = this@NavigationBar.colorState
        if (imageTintList == null) setImageTintValueList(tint)
    }

    private fun resolveTitleAndDescriptionPlace() {
        textBlock.addView(titlePlace, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        textBlock.addView(descriptionPlace, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
    }

    private fun convertToLinearParams(params: NavigationBarLayoutParams): LayoutParams {
        return LayoutParams(params.width, params.height)
    }

    private fun convertToFrameParams(params: NavigationBarLayoutParams): FrameLayout.LayoutParams {
        return FrameLayout.LayoutParams(params.width, params.height)
    }

    private fun placeServiceChildren() {
        addView(containerWithPaddings)
        containerWithPaddings.addView(actionsBlock)
        containerWithPaddings.addView(textBlock)
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
