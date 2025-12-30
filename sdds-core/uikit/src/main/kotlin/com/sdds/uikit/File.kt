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

    init {
        orientation = VERTICAL
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
            }
            setContentVisibility()
        }

    /**
     * Расположение контента предполагающего взаимодействие с ним
     */
    open var actionPlacement: Int
        get() = _actionPlacement
        set(value) {
            if (_actionPlacement != value) {
                _actionPlacement = value
            }
            changeActionPlacement()
            setCellContentVisibility()
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
            }
            setContentVisibility()
        }

    /**
     * Устанавливает Label, при этом все ранее установленные Label будут удалены
     * @param textView - [TextView] вью с текстом
     * @param params - [FileLayoutParams] лэйаут параметры для textview, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.LABEL]
     */
    open fun setLabel(textView: TextView, params: FileLayoutParams? = null) {
        removeLabel()
        addView(
            textView,
            params ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.LABEL,
            ),
        )
    }

    /**
     * Устанавливает Description, при этом все ранее установленные Description будут удалены
     * @param textView - [TextView] вью с текстом
     * @param params - [FileLayoutParams] лэйаут параметры для textview, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.DESCRIPTION]
     */
    open fun setDescription(textView: TextView, params: FileLayoutParams? = null) {
        removeDescription()
        addView(
            textView,
            params ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.DESCRIPTION,
            ),
        )
    }

    /**
     * Устанавливает Action - компонент предполагающий взаимодействие (например [LinkButton]),
     * при этом все ранее установленные Action будут удалены
     * @param view - [View] компонент для взаимодействия
     * @param params - [FileLayoutParams] лэйаут параметры для view, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.ACTION]
     */
    open fun setAction(view: View, params: FileLayoutParams? = null) {
        removeActions()
        addView(
            view,
            params ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.ACTION,
            ),
        )
    }

    /**
     * Устанавливает  в качестве прогресса компонент [CircularProgressBar],
     * при этом все ранее установленные [CircularProgressBar] будут удалены
     * @param progress - [CircularProgressBar] круглый прогресс
     * @param params - [FileLayoutParams] лэйаут параметры для progress, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.PROGRESS]
     */
    open fun setCircularProgress(progress: CircularProgressBar, params: FileLayoutParams? = null) {
        removeCircularProgress()
        addView(
            progress,
            params ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.PROGRESS,
            ),
        )
    }

    /**
     * Устанавливает  в качестве прогресса компонент [ProgressBar],
     * при этом все ранее установленные [ProgressBar] будут удалены
     * @param progress - [ProgressBar] горизонтальный прогресс
     * @param params - [FileLayoutParams] лэйаут параметры для progress, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.PROGRESS]
     */
    open fun setHorizontalProgress(progress: ProgressBar, params: FileLayoutParams? = null) {
        removeHorizontalProgress()
        addView(
            progress,
            params ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                FileContent.PROGRESS,
            ),
        )
    }

    /**
     * Устанавливает в качестве контента в начале - [ImageView],
     * будьте внимательны, если вы использовали несколько [ImageView], они будут удалены
     * (например одна из вью использовалась для отображения иконки а другая - для изображения)
     * @param image - [ImageView]
     * @param asIcon - установите true, если собираетесь использовать [ImageView] для отображения
     * иконок, в этом случае к иконкам будет применен iconTint, заданный в стиле, через атрибут
     * [R.styleable.File_sd_iconTint]
     * @param params - [FileLayoutParams] лэйаут параметры для image, если не заданы,
     * ширина и высота будет установлена как [ViewGroup.LayoutParams.WRAP_CONTENT].
     * Роль назначается автоматически как [FileContent.IMAGE]
     */
    open fun setImage(image: ImageView, asIcon: Boolean, params: FileLayoutParams? = null) {
        removeImageAndIcon()
        addView(
            image,
            params ?: FileLayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                fileContent = if (asIcon) FileContent.ICON else FileContent.IMAGE,
            ),
        )
    }

    /**
     * Удаляет все установленные [ProgressBar]
     */
    open fun removeHorizontalProgress() {
        children
            .filter { it is ProgressBar }
            .toList()
            .forEach(::removeView)
    }

    /**
     * Удаляет все установленные [CircularProgressBar]
     */
    open fun removeCircularProgress() {
        cell.children
            .filter { it is CircularProgressBar }
            .toList()
            .forEach { cell.removeView(it) }
    }

    /**
     * Удаляет все установленные вью с ролью [FileContent.ACTION]
     */
    open fun removeActions() {
        cell.children
            .filter {
                (it.layoutParams as? CellLayout.LayoutParams)?.cellContent ==
                    when (_actionPlacement) {
                        ACTION_PLACEMENT_END -> CellContent.END
                        else -> CellContent.START
                    }
            }
            .filter { it !is ImageView }
            .toList()
            .forEach { cell.removeView(it) }
    }

    /**
     * Удаляет все установленные вью с ролью [FileContent.IMAGE]
     */
    open fun removeImageAndIcon() {
        cell.children
            .filter { it is ImageView }
            .toList()
            .forEach { cell.removeView(it) }
    }

    /**
     * Удаляет все установленные вью с ролью [FileContent.LABEL]
     */
    open fun removeLabel() {
        cell.children
            .filter { it is TextView }
            .toList()
            .forEach { view ->
                val lp = view.layoutParams as? CellLayout.LayoutParams
                if (lp?.cellContent == CellContent.TITLE) cell.removeView(view)
            }
    }

    /**
     * Удаляет все установленные вью с ролью [FileContent.DESCRIPTION]
     */
    open fun removeDescription() {
        cell.children
            .filter { it is TextView }
            .toList()
            .forEach { view ->
                val lp = view.layoutParams as? CellLayout.LayoutParams
                if (lp?.cellContent == CellContent.SUBTITLE) cell.removeView(view)
            }
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (child == cell) {
            super.addView(child, childCount, params)
            return
        }
        val fileParams = params as? FileLayoutParams ?: return
        child?.applyContentRole(fileParams)

        if (fileParams.fileContent == FileContent.PROGRESS && child is ProgressBar) {
            super.addView(child, childCount, params)
        } else {
            val cellParams = convertToCellParams(fileParams)
            cell.addView(child, cell.childCount, cellParams)
        }
        setContentVisibility()
    }

    override fun removeView(view: View?) {
        if (view == cell) return
        super.removeView(view)
    }

    override fun removeViewAt(index: Int) {
        val view = getChildAt(index)
        if (view == cell) return
        super.removeViewAt(index)
    }

    override fun removeAllViews() {
        cell.removeAllViews()
        children.filter { it != cell }
            .toList()
            .forEach(::removeView)
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
         * Назначает этой [View] роль Иображения.
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
         * Назначает этой [View] роль Активного элемента (с которым предполагается какое
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
         * Назначает этой [View] роль Label, позиционирует по центру [File] между
         * контентом в начале (если есть Image или Icon) и контентом  в конце (Action),
         * если есть [LABEL], то будет следовать за ним, по вертикали.
         * Дополнительно применяет стили текста и цвета для элемента с этой ролью.
         */
        DESCRIPTION,
    }

    private fun View.applyContentRole(fileParams: FileLayoutParams) {
        (this as? TextView)?.apply {
            when (fileParams.fileContent) {
                FileContent.LABEL -> this@apply.applyLabelRole()
                FileContent.DESCRIPTION -> this@apply.applyDescriptionRole()
                else -> Unit
            }
        }
        if ((fileParams.fileContent == FileContent.ICON) && this is ImageView) {
            if (imageTintList == null) {
                iconTint?.let { imageTintList = it }
            }
        }
        if (fileParams.fileContent == FileContent.PROGRESS && this is ProgressBar) {
            fileParams.topMargin = _contentBottomPadding
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
        setBottomContentVisibility()
        setCellContentVisibility()
    }

    private fun setBottomContentVisibility() {
        children.forEach { child ->
            val lp = child.layoutParams as? FileLayoutParams
            if (lp?.fileContent == FileContent.PROGRESS) {
                if (child is ProgressBar) {
                    child.isVisible =
                        _progressPlacement == PROGRESS_PLACEMENT_OUTER && isLoading
                }
            }
        }
    }

    private fun setCellContentVisibility() {
        cell.children.forEach { child ->
            val lp = child.layoutParams as? CellLayout.LayoutParams
            if (lp?.cellContent == CellContent.START) {
                if (_actionPlacement == ACTION_PLACEMENT_END) {
                    child.isVisible = child is ImageView
                } else {
                    cellChildrenVisibility(child)
                }
            } else if (lp?.cellContent == CellContent.END) {
                if (_actionPlacement == ACTION_PLACEMENT_START) {
                    child.isVisible = false
                } else {
                    cellChildrenVisibility(child)
                }
            }
        }
    }

    private fun cellChildrenVisibility(child: View) {
        when (child) {
            is CircularProgressBar ->
                child.isVisible = _progressPlacement == PROGRESS_PLACEMENT_INNER && isLoading

            is ImageView -> child.isVisible = _actionPlacement != ACTION_PLACEMENT_START
            else -> child.isVisible = !(_progressPlacement == PROGRESS_PLACEMENT_INNER && isLoading)
        }
    }

    private fun changeActionPlacement() {
        cell.children.forEach { child ->
            val lp = child.layoutParams as? CellLayout.LayoutParams
            when {
                lp?.cellContent == CellContent.END && _actionPlacement == ACTION_PLACEMENT_START -> {
                    val newLp = lp
                    newLp.cellContent = CellContent.START
                    child.layoutParams = newLp
                }

                lp?.cellContent == CellContent.START && _actionPlacement == ACTION_PLACEMENT_END -> {
                    if (child !is ImageView) {
                        val newLp = lp
                        newLp.cellContent = CellContent.END
                        child.layoutParams = newLp
                    }
                }
            }
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
            context.withStyledAttributes(attrs, R.styleable.File, defStyleAttr, defStyleRes) {
                iconButtonStyleOverlay = getResourceId(R.styleable.File_sd_iconButtonStyleOverlay, 0)
            }
            var progressBarStyleOverlay = 0
            context.withStyledAttributes(attrs, R.styleable.File, defStyleAttr, defStyleRes) {
                progressBarStyleOverlay = getResourceId(R.styleable.File_sd_progressBarStyleOverlay, 0)
            }
            var circularBarStyleOverlay = 0
            context.withStyledAttributes(attrs, R.styleable.File, defStyleAttr, defStyleRes) {
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
