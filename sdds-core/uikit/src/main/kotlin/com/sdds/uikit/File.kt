package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.isVisible
import androidx.core.widget.TextViewCompat
import com.sdds.uikit.CellLayout.CellContent
import com.sdds.uikit.File.Companion.ACTION_PLACEMENT_END
import com.sdds.uikit.File.Companion.ACTION_PLACEMENT_START
import com.sdds.uikit.File.Companion.PROGRESS_PLACEMENT_INNER
import com.sdds.uikit.File.Companion.PROGRESS_PLACEMENT_OUTER
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.statelist.StyleStateList
import com.sdds.uikit.statelist.getStyleStateList

/**
 * Компонент [File] позволяет компоновать дочерние [View] согласно заданным им ролей [FileContent] при помощи
 * атрибута [R.styleable.File_Layout_layout_fileContent]. Предназначен для отображения информации о загружаемом
 * контенте, показывая прогресс загрузки с помощью компонентов [ProgressBar] и [CircularProgressBar]
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */

open class File @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_fileStyle,
    defStyleRes: Int = R.style.Sdds_Components_File,
) : LinearLayout(
    wrapper(context, attrs, defStyleAttr, defStyleRes),
    attrs,
    defStyleAttr,
    defStyleRes,
),
    ColorStateHolder {

    private val cell: CellLayout = CellLayout(context, null, 0, 0)
    private var _contentStartPadding: Int = 0
    private var _contentEndPadding: Int = 0
    private var _contentBottomPadding: Int = 0
    private var _descriptionPadding: Int = 0
    private var labelAppearance: StyleStateList? = null
    private var labelColor: ColorStateList? = null
    private var descriptionAppearance: StyleStateList? = null
    private var descriptionColor: ColorStateList? = null
    private var iconTint: ColorStateList? = null
    private var _progressPlacement: Int = PROGRESS_PLACEMENT_INNER
    private var _actionPlacement: Int = ACTION_PLACEMENT_START
    private var _isLoading: Boolean = false
    private var iconView: View? = null
    private var imageView: View? = null
    private var actionView: View? = null
    private var labelView: View? = null
    private var descriptionView: View? = null
    private var progressView: View? = null

    init {
        orientation = VERTICAL
        gravity = Gravity.CENTER
        context.withStyledAttributes(attrs, R.styleable.File, defStyleAttr, defStyleRes) {
            _contentStartPadding = getDimensionPixelSize(R.styleable.File_sd_contentStartPadding, 0)
            _contentEndPadding = getDimensionPixelSize(R.styleable.File_sd_contentEndPadding, 0)
            _contentBottomPadding = getDimensionPixelSize(R.styleable.File_sd_contentBottomPadding, 0)
            _descriptionPadding = getDimensionPixelSize(R.styleable.File_sd_descriptionPadding, 0)
            labelAppearance = getStyleStateList(context, R.styleable.File_sd_labelAppearance)
            descriptionAppearance = getStyleStateList(context, R.styleable.File_sd_descriptionAppearance)
            labelColor = getColorStateList(R.styleable.File_sd_labelColor)
            descriptionColor = getColorStateList(R.styleable.File_sd_descriptionColor)
            iconTint = getColorStateList(R.styleable.File_sd_iconTint)
            _actionPlacement = getInt(R.styleable.File_sd_actionPlacement, 0)
            _progressPlacement = getInt(R.styleable.File_sd_progressPlacement, 0)
            _isLoading = getBoolean(R.styleable.File_sd_isLoading, false)
        }
        addView(cell)
        cell.apply {
            contentStartPadding = this@File._contentStartPadding
            contentEndPadding = this@File._contentEndPadding
            gravity = Gravity.CENTER_VERTICAL
        }
    }

    /**
     * Выравнивание дочерних элементов относительно строки, в которой они находятся.
     * @see Gravity
     */
    open var contentGravity: Int
        get() = cell.gravity
        set(value) {
            cell.gravity = value
        }

    /**
     * Отступ между контентом в начале [File] и компонентами с ролью Label/Description
     */
    open var contentStartPadding: Int
        get() = _contentStartPadding
        set(value) {
            if (_contentStartPadding != value) {
                _contentStartPadding = value
                cell.contentStartPadding = value
            }
        }

    /**
     * Отступ между компонентами с ролью Label/Description и контентом в конце [File]
     */
    open var contentEndPadding: Int
        get() = _contentEndPadding
        set(value) {
            if (_contentEndPadding != value) {
                _contentEndPadding = value
                cell.contentEndPadding = value
            }
        }

    /**
     * Отступ между контентом и горизонтальным прогрессом, если [progressPlacement] =
     * [PROGRESS_PLACEMENT_OUTER]
     */
    open var contentBottomPadding: Int
        get() = _contentBottomPadding
        set(value) {
            if (_contentBottomPadding != value) {
                _contentBottomPadding = value
                setContentBottomPadding()
            }
        }

    /**
     * Отступ между компонентами с ролями Label и Description
     */
    open var descriptionPadding: Int
        get() = _descriptionPadding
        set(value) {
            if (_descriptionPadding != value) {
                _descriptionPadding = value
                setDescriptionPadding()
            }
        }

    /**
     * Расположение прогресса
     */
    open var progressPlacement: Int
        get() = _progressPlacement
        set(value) {
            if (_progressPlacement != value) {
                _progressPlacement = value
                changeProgressPlacementGlobally()
                setContentVisibility()
            }
        }

    /**
     * Расположение контента предполагающего взаимодействие с ним
     */
    open var actionPlacement: Int
        get() = _actionPlacement
        set(value) {
            if (_actionPlacement != value) {
                _actionPlacement = value
                changePlacement()
                setCellContentVisibility()
            }
        }

    /**
     * Находится ли компонент в процессе загрузки в данный момент,
     * если true - отображается компонент прогресса в зависимости от
     * [progressPlacement]
     */
    open var isLoading: Boolean
        get() = _isLoading
        set(value) {
            if (_isLoading != value) {
                _isLoading = value
                setContentVisibility()
            }
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
     * Устанавливает Label, при этом ранее установленный Label будет удален
     * @param textView - [TextView] вью с текстом
     * @param params - [FileLayoutParams] лэйаут параметры для textview, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.LABEL]
     */
    open fun setLabel(textView: TextView, params: FileLayoutParams? = null) {
        val viewParams = textView.layoutParams as? FileLayoutParams
        val finalParams = params ?: viewParams
        addView(
            textView,
            finalParams ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.LABEL,
            ),
        )
    }

    /**
     * Устанавливает Description, при этом ранее установленный Description будет удален
     * @param textView - [TextView] вью с текстом
     * @param params - [FileLayoutParams] лэйаут параметры для textview, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.DESCRIPTION]
     */
    open fun setDescription(textView: TextView, params: FileLayoutParams? = null) {
        val viewParams = textView.layoutParams as? FileLayoutParams
        val finalParams = params ?: viewParams
        addView(
            textView,
            finalParams ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.DESCRIPTION,
            ),
        )
    }

    /**
     * Устанавливает Action - компонент предполагающий взаимодействие (например [LinkButton]),
     * при этом ранее установленный Action будет удален
     * @param view - [View] компонент для взаимодействия
     * @param params - [FileLayoutParams] лэйаут параметры для view, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.ACTION]
     */
    open fun setAction(view: View, params: FileLayoutParams? = null) {
        val viewParams = view.layoutParams as? FileLayoutParams
        val finalParams = params ?: viewParams
        addView(
            view,
            finalParams ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.ACTION,
            ),
        )
    }

    /**
     * Устанавливает переданную вью в качестве прогресса,
     * предполагаемые компоненты - [CircularProgressBar] или [ProgressBar],
     * при этом ранее установленная вью с ролью [FileContent.PROGRESS] будет удалена.
     * @param progress - [View]
     * @param params - [FileLayoutParams] лэйаут параметры для progress, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.PROGRESS]
     */
    open fun setProgress(progress: View, params: FileLayoutParams? = null) {
        val viewParams = progress.layoutParams as? FileLayoutParams
        val finalParams = params ?: viewParams
        addView(
            progress,
            finalParams ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.PROGRESS,
            ),
        )
    }

    /**
     * Устанавливает в качестве контента в начале - [ImageView] содержащую иконку,
     * при этом ранее установленный [ImageView] с ролью [FileContent.ICON] будет удален
     * @param image - [ImageView]
     * @param params - [FileLayoutParams] лэйаут параметры для image, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.ICON].
     * Если imageTintList == null, в этом случае к иконкам будет применен iconTint,
     * заданный в стиле, через атрибут [R.styleable.File_sd_iconTint]
     */
    open fun setIcon(image: ImageView, params: FileLayoutParams? = null) {
        val viewParams = image.layoutParams as? FileLayoutParams
        val finalParams = params ?: viewParams
        addView(
            image,
            finalParams ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.ICON,
            ),
        )
    }

    /**
     * Устанавливает в качестве контента в начале - [ImageView] содержащую изображение,
     * при этом ранее установленный [ImageView] с ролью [FileContent.IMAGE] будет удален
     * @param image - [ImageView]
     * @param params - [FileLayoutParams] лэйаут параметры для image, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.IMAGE]
     */
    open fun setImage(image: ImageView, params: FileLayoutParams? = null) {
        val viewParams = image.layoutParams as? FileLayoutParams
        val finalParams = params ?: viewParams
        addView(
            image,
            finalParams ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.IMAGE,
            ),
        )
    }

    /**
     * Удаляет установленную вью с ролью [FileContent.PROGRESS]
     */
    open fun removeProgress() {
        progressView?.let {
            val parent = it.parent as? ViewGroup
            parent?.removeView(it)
            progressView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [FileContent.ACTION]
     */
    open fun removeAction() {
        actionView?.let {
            cell.removeView(it)
            actionView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [FileContent.IMAGE]
     */
    open fun removeImage() {
        imageView?.let {
            cell.removeView(it)
            imageView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [FileContent.ICON]
     */
    open fun removeIcon() {
        iconView?.let {
            cell.removeView(it)
            iconView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [FileContent.LABEL]
     */
    open fun removeLabel() {
        labelView?.let {
            cell.removeView(it)
            labelView = null
        }
    }

    /**
     * Удаляет установленную вью с ролью [FileContent.DESCRIPTION]
     */
    open fun removeDescription() {
        descriptionView?.let {
            cell.removeView(it)
            descriptionView = null
        }
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (child == cell) {
            super.addView(child, childCount, params)
            return
        }
        val fileParams = params as? FileLayoutParams ?: return
        setRoleLink(child, fileParams)
        child?.applyContentRole(fileParams)

        if (fileParams.fileContent == FileContent.PROGRESS && progressPlacement == PROGRESS_PLACEMENT_OUTER) {
            super.addView(child, childCount, params)
        } else {
            val cellParams = convertToCellParams(fileParams)
            cell.addView(child, cell.childCount, cellParams)
        }
        setContentVisibility()
    }

    override fun removeView(view: View?) {
        if (view == cell) return
        val parent = view?.parent as? ViewGroup
        if (parent == this) super.removeView(view)
        if (parent == cell) cell.removeView(view)
        clearRoleLink(view)
    }

    override fun removeViewAt(index: Int) {
        val view = getChildAt(index)
        if (view == cell) return
        removeView(view)
    }

    override fun removeAllViews() {
        clearAllRoleLinks()
        cell.removeAllViews()
        children.filter { it != cell }
            .toList()
            .forEach(::removeView)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        iconView = null
        imageView = null
        actionView = null
        labelView = null
        descriptionView = null
        progressView = null
    }

    override fun generateDefaultLayoutParams(): FileLayoutParams {
        return FileLayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams?): Boolean {
        return p is FileLayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): FileLayoutParams {
        return FileLayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams?): FileLayoutParams {
        return FileLayoutParams(p)
    }

    /**
     * Параметры расположения дочерних [View] в [File]
     */
    class FileLayoutParams : LayoutParams {

        /**
         * Роль [View] внутри [File]
         */
        var fileContent: FileContent? = null

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            c.withStyledAttributes(attrs, R.styleable.File_Layout) {
                this@FileLayoutParams.fileContent =
                    getInt(R.styleable.File_Layout_layout_fileContent, 0)
                        .let { FileContent.values().getOrElse(it) { null } }
            }
        }

        constructor(width: Int, height: Int) : super(width, height)
        constructor(width: Int, height: Int, fileContent: FileContent) : super(width, height) {
            this.fileContent = fileContent
        }

        constructor(source: ViewGroup.LayoutParams?) : super(source) {
            if (source is FileLayoutParams) {
                this.fileContent = source.fileContent
            }
        }
    }

    /**
     * Роли для дочерних элементов [View] в [File]
     */
    enum class FileContent {
        /**
         * Назначает этой [View] роль Изображения.
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [File], в начало компонента.
         */
        IMAGE,

        /**
         * Назначает этой [View] роль Иконки.
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [File], в начало компонента.
         */
        ICON,

        /**
         * Назначает этой [View] роль Активного элемента (с которым предполагается какое-
         * то взаимодейстивие, например нажатие).
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [File], позиционирование зависит от
         * actionPlacement ([ACTION_PLACEMENT_START] - в начале компонента,
         * [ACTION_PLACEMENT_END] - в конце компонента).
         */
        ACTION,

        /**
         * Назначает этой [View] роль элемента отображающего Прогресс (обычно процесс загрузки).
         * Позиционирование зависит от progressPlacement, [PROGRESS_PLACEMENT_INNER] -
         * будет располагаться с той же стороны, что и Action, будет показан, когда isLoading = true,
         * предпочтительно использование компоннета [CircularProgressBar], если добавлено несколько компонентов -
         * они будут следовать друг за другом по горизонтали.
         * [PROGRESS_PLACEMENT_OUTER] - будет располагаться снизу, под всем остальным контентом (только
         * если это горизонтальный [ProgressBar]), если добавлено несколько компонентов [ProgressBar]
         * они будут следовать друг за другом по вертикали.
         */
        PROGRESS,

        /**
         * Назначает этой [View] роль Label, позиционирует по центру [File] между
         * контентом в начале (если есть Image или Icon) и контентом  в конце (Action).
         * Дополнительно применяет стили текста и цвета для элемента с этой ролью.
         */
        LABEL,

        /**
         * Назначает этой [View] роль Description, позиционирует по центру [File] между
         * контентом в начале (если есть Image или Icon) и контентом  в конце (Action),
         * если есть [LABEL], то будет следовать за ним, по вертикали.
         * Дополнительно применяет стили текста и цвета для элемента с этой ролью.
         */
        DESCRIPTION,
    }

    private fun clearRoleLink(view: View?) {
        when (view) {
            actionView -> actionView = null
            imageView -> imageView = null
            iconView -> iconView = null
            progressView -> progressView = null
            labelView -> labelView = null
            descriptionView -> descriptionView = null
            else -> {}
        }
    }

    private fun setRoleLink(view: View?, fileParams: FileLayoutParams) {
        when (fileParams.fileContent) {
            FileContent.ACTION -> {
                removeAction()
                actionView = view
            }

            FileContent.IMAGE -> {
                removeImage()
                imageView = view
            }

            FileContent.ICON -> {
                removeIcon()
                iconView = view
            }

            FileContent.PROGRESS -> {
                removeProgress()
                progressView = view
            }

            FileContent.LABEL -> {
                removeLabel()
                labelView = view
            }

            FileContent.DESCRIPTION -> {
                removeDescription()
                descriptionView = view
            }

            null -> {}
        }
    }

    private fun clearAllRoleLinks() {
        actionView = null
        imageView = null
        iconView = null
        progressView = null
        labelView = null
        descriptionView = null
    }

    private fun View.applyContentRole(fileParams: FileLayoutParams) {
        val group = this is ViewGroup
        when (fileParams.fileContent) {
            FileContent.PROGRESS -> {
                if (progressPlacement == PROGRESS_PLACEMENT_OUTER) fileParams.topMargin = _contentBottomPadding
            }

            FileContent.LABEL -> {
                if (group) {
                    (this as ViewGroup).children.forEach {
                        (it as? TextView)?.applyLabelRole()
                    }
                } else {
                    (this as? TextView)?.applyLabelRole()
                }
            }

            FileContent.DESCRIPTION -> {
                if (group) {
                    (this as ViewGroup).children.forEach {
                        (it as? TextView)?.applyDescriptionRole()
                    }
                } else {
                    (this as? TextView)?.applyDescriptionRole()
                }
            }

            FileContent.ICON -> {
                if (group) {
                    (this as ViewGroup).children.forEach {
                        checkForImageToApplyTintList(it)
                    }
                } else {
                    checkForImageToApplyTintList(this)
                }
            }

            else -> {}
        }
    }

    private fun checkForImageToApplyTintList(view: View) {
        if (view is ImageView) {
            if (view.imageTintList == null) {
                iconTint?.let { view.imageTintList = it }
            }
        }
    }

    private fun TextView.applyLabelRole() {
        labelAppearance?.let { setTextAppearancesList(it) }
        colorState = this@File.colorState
        labelColor?.let(::setTextColor)
        TextViewCompat.setCompoundDrawableTintList(this, labelColor)
    }

    private fun TextView.applyDescriptionRole() {
        descriptionAppearance?.let { setTextAppearancesList(it) }
        colorState = this@File.colorState
        descriptionColor?.let(::setTextColor)
        TextViewCompat.setCompoundDrawableTintList(this, descriptionColor)
    }

    private fun convertToCellParams(params: FileLayoutParams): CellLayout.LayoutParams {
        return CellLayout.LayoutParams(params).apply {
            cellContent = when (params.fileContent) {
                FileContent.ACTION, FileContent.PROGRESS -> {
                    when (_actionPlacement) {
                        ACTION_PLACEMENT_END -> CellContent.END
                        else -> CellContent.START
                    }
                }

                FileContent.LABEL -> CellContent.TITLE
                FileContent.DESCRIPTION -> CellContent.SUBTITLE
                FileContent.IMAGE, FileContent.ICON -> CellContent.START
                else -> CellContent.END
            }
            if (cellContent == CellContent.SUBTITLE) {
                topMargin = _descriptionPadding
            }
        }
    }

    private fun setContentBottomPadding() {
        children.forEach { child ->
            val lp = child.layoutParams as? FileLayoutParams
            if (lp?.fileContent == FileContent.PROGRESS) {
                lp.topMargin = _contentBottomPadding
            }
        }
        requestLayout()
        invalidate()
    }

    private fun setDescriptionPadding() {
        cell.children.forEach { child ->
            val lp = child.layoutParams as? CellLayout.LayoutParams
            if (lp?.cellContent == CellContent.SUBTITLE) {
                lp.topMargin = _descriptionPadding
            }
        }
        requestLayout()
        invalidate()
    }

    private fun setContentVisibility() {
        setProgressVisibility()
        setCellContentVisibility()
    }

    private fun setProgressVisibility() {
        progressView?.let {
            val parent = it.parent as? ViewGroup
            when (parent) {
                this -> it.isVisible = _progressPlacement == PROGRESS_PLACEMENT_OUTER && isLoading
                cell -> it.isVisible = _progressPlacement == PROGRESS_PLACEMENT_INNER && isLoading
                else -> {}
            }
        }
    }

    private fun setCellContentVisibility() {
        actionView?.let {
            it.isVisible = _progressPlacement == PROGRESS_PLACEMENT_OUTER ||
                _progressPlacement == PROGRESS_PLACEMENT_INNER && !isLoading
        }
        setImageOrIconVisibility(imageView)
        setImageOrIconVisibility(iconView)
    }

    private fun setImageOrIconVisibility(view: View?) {
        view?.isVisible = _actionPlacement != ACTION_PLACEMENT_START
    }

    private fun changePlacement() {
        changeViewPlacementInsideCell(actionView)
        changeViewPlacementInsideCell(progressView)
    }

    private fun changeViewPlacementInsideCell(view: View?) {
        view?.let {
            val lp = (it.layoutParams as? CellLayout.LayoutParams) ?: return
            val newLp = lp
            newLp.cellContent = if (_actionPlacement == ACTION_PLACEMENT_START) {
                CellContent.START
            } else {
                CellContent.END
            }
            it.layoutParams = newLp
        }
    }

    private fun changeProgressPlacementGlobally() {
        progressView?.let {
            addView(it)
        }
    }

    companion object {

        /**
         * Расположение Action в начале
         */
        const val ACTION_PLACEMENT_START = 0

        /**
         * Расположение Action в конце
         */
        const val ACTION_PLACEMENT_END = 1

        /**
         * Расположение ProgressBar. Предполагается использование
         * [CircularProgressBar] в начале или в конце.
         */
        const val PROGRESS_PLACEMENT_INNER = 0

        /**
         * Расположение ProgressBar. Предполагается использование
         * горизонтального [ProgressBar] снизу компонента.
         */
        const val PROGRESS_PLACEMENT_OUTER = 1

        internal fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var iconButtonStyleOverlay = 0
            var progressBarStyleOverlay = 0
            var circularBarStyleOverlay = 0
            context.withStyledAttributes(attrs, R.styleable.File, defStyleAttr, defStyleRes) {
                iconButtonStyleOverlay = getResourceId(R.styleable.File_sd_iconButtonStyleOverlay, 0)
                progressBarStyleOverlay = getResourceId(R.styleable.File_sd_progressBarStyleOverlay, 0)
                circularBarStyleOverlay = getResourceId(R.styleable.File_sd_circularProgressBarStyleOverlay, 0)
            }
            val themeOverlay = createMergedOverlayContext(
                context,
                iconButtonStyleOverlay,
                progressBarStyleOverlay,
                circularBarStyleOverlay,
            )
            return themeOverlay
        }

        private fun createMergedOverlayContext(base: Context, vararg overlays: Int): Context {
            if (overlays.all { it == 0 }) return base
            val newTheme = base.resources.newTheme()
            newTheme.setTo(base.theme)
            overlays.filter { it != 0 }
                .forEach { newTheme.applyStyle(it, true) }
            return ContextThemeWrapper(base, newTheme)
        }
    }
}
