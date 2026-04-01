package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Checkable
import androidx.annotation.DrawableRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.isNotEmpty
import androidx.core.view.isVisible
import com.sdds.uikit.CellLayout.CellContent
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.ViewAlphaHelper

/**
 * Компонент [SelectItemView] - обертка компонента [CellLayout] c возможностью
 * отображения в начале компоннета Иконки или [CheckBox], информирующих о том,
 * что [SelectItemView] выбран (находится в состоянии checked). Используется в
 * качестве элемента списка в выпадающем меню компонента [Select].
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 */
open class SelectItemView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_selectItemStyle,
    defStyleRes: Int = R.style.Sdds_Components_SelectItem,
) : LinearLayout(
    wrapper(context, attrs, defStyleAttr, defStyleRes),
    attrs,
    defStyleAttr,
    defStyleRes,
),
    ColorStateHolder,
    Checkable {

    @DrawableRes
    private var icon: Int = 0
    private var iconTint: ColorStateList? = null
    private var backgroundList: ColorStateList? = null
    private var _itemType: Int = SELECT_ITEM_TYPE_SINGLE
    private var _controlSize: Int = 0
    private var _controlMargin: Int = 0
    private val cell: CellLayout = CellLayout(this.context).apply {
        isDuplicateParentStateEnabled = true
        setForceDuplicateParentState(true)
    }
    private val controlBox: FrameLayout = FrameLayout(this.context).apply {
        isDuplicateParentStateEnabled = true
        clipChildren = false
    }

    private val iconView: ImageView = ImageView(context).apply {
        isDuplicateParentStateEnabled = true
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }

    private val checkBoxView: CheckBox = CheckBox(this.context).apply {
        isClickable = false
        clipChildren = false
    }
    private val viewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)

    private var _isCheckable: Boolean = false
    private var _onCheckedChangedListener: OnCheckedChangeListener? = null
    private var _isChecked: Boolean = false
        set(value) {
            if (field != value) {
                field = value
                _onCheckedChangedListener?.onCheckedChanged(this, value)
            }
        }

    /**
     * Тип [SelectItemView]
     * [SELECT_ITEM_TYPE_SINGLE] в состоянии checked отображается иконка
     * [SELECT_ITEM_TYPE_MULTIPLE] в состоянии checked отображается [CheckBox]
     */
    open var itemType: Int
        get() = _itemType
        set(value) {
            if (_itemType != value) {
                _itemType = value
                setControlContent()
            }
        }

    /**
     * Фиксированный размер области, для отображения контента в состоянии checked
     */
    open var controlSize: Int
        get() = _controlSize
        set(value) {
            if (_controlSize != value) {
                _controlSize = value
                configureControl()
            }
        }

    /**
     * Отступ от фиксированной области, для отображения контента в состоянии checked
     */
    open var controlMargin: Int
        get() = _controlMargin
        set(value) {
            if (_controlMargin != value) {
                _controlMargin = value
                setControlMargin()
            }
        }

    /**
     * Контролирует видимость элемента с ролью [SelectItemContent.DISCLOSURE]
     */
    open var disclosureEnabled: Boolean
        get() = cell.disclosureEnabled
        set(value) {
            cell.disclosureEnabled = value
        }

    /**
     * Изменяет текст элемента с ролью [SelectItemContent.DISCLOSURE], если он это поддерживает
     */
    open var disclosureText: CharSequence?
        get() = cell.disclosureText
        set(value) {
            cell.disclosureText = value
        }

    /**
     * Устанавливает иконку для элемента с ролью [SelectItemContent.DISCLOSURE], если он это поддерживает
     */
    open var disclosureIcon: Drawable?
        get() = cell.disclosureIcon
        set(value) {
            cell.disclosureIcon = value
        }

    /**
     * Отступ между [SelectItemContent.START] и [SelectItemContent.CENTER]
     */
    open var contentStartPadding: Int
        get() = cell.contentStartPadding
        set(value) {
            cell.contentStartPadding = value
        }

    /**
     * Отступ между [SelectItemContent.END] и [SelectItemContent.CENTER]
     */
    open var contentEndPadding: Int
        get() = cell.contentEndPadding
        set(value) {
            cell.contentEndPadding = value
        }

    /**
     * Может ли [SelectItemView] изменять состояние [isChecked]
     */
    open var isCheckable: Boolean
        get() = _isCheckable
        set(value) {
            if (_isCheckable != value) {
                _isCheckable = value
                refreshDrawableState()
            }
        }

    /**
     * @see ColorStateHolder.colorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    init {
        orientation = HORIZONTAL
        gravity = Gravity.CENTER_VERTICAL
        context.withStyledAttributes(attrs, R.styleable.SelectItem, defStyleAttr, defStyleRes) {
            _controlMargin = getDimensionPixelSize(R.styleable.SelectItem_sd_controlMargin, 0)
            _controlSize = getDimensionPixelSize(R.styleable.SelectItem_sd_controlSize, 0)
            icon = getResourceId(R.styleable.SelectItem_sd_icon, 0)
            setIconTintList(getColorStateList(R.styleable.SelectItem_sd_iconTint))
            installIconIfNeed()
            _itemType = getInt(R.styleable.SelectItem_sd_itemType, 0)
            backgroundList = getColorStateList(R.styleable.SelectItem_sd_background)
            _isChecked = getBoolean(R.styleable.SelectItem_android_checked, false)
            _isCheckable = getBoolean(R.styleable.SelectItem_android_checkable, false)
        }
        addView(
            controlBox,
            LayoutParams(
                if (controlSize != 0) controlSize else LayoutParams.WRAP_CONTENT,
                if (controlSize != 0) controlSize else LayoutParams.WRAP_CONTENT,
            ),
        )
        setControlMargin()
        setControlContent()
        addView(cell, SelectItemLayoutParams(0, LayoutParams.WRAP_CONTENT, 1f))
    }

    /**
     * Слушатель изменений состояния [isChecked]
     */
    fun interface OnCheckedChangeListener {

        /**
         * Колбэк изменений состояния [isChecked]
         */
        fun onCheckedChanged(selectItemView: SelectItemView, isChecked: Boolean)
    }

    /**
     * Устанавливает слушатель изменения состояния [isChecked]
     */
    open fun setOnCheckedChangedListener(listener: OnCheckedChangeListener?) {
        _onCheckedChangedListener = listener
    }

    /**
     * Устанавливает иконку, информирующую о состоянии checked, из ресурсов по идентификатору
     * @param iconRes идентификатор ресурса иконки
     */
    open fun setIconResource(@DrawableRes iconRes: Int) {
        if (icon != iconRes) {
            icon = iconRes
            installIconIfNeed()
        }
    }

    /**
     * Устанавливает цвета иконки, информирующей о состоянии checked
     * @param newIconTint окрас иконки
     */
    open fun setIconTintList(newIconTint: ColorStateList?) {
        if (iconTint != newIconTint) {
            iconTint = newIconTint
            iconView.imageTintList = iconTint
        }
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun setEnabled(enabled: Boolean) {
        children.forEach {
            it.isEnabled = enabled
            viewAlphaHelper?.updateAlphaByEnabledState(it)
        }
        super.setEnabled(enabled)
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (child == controlBox || child == cell) {
            super.addView(child, index, params)
            return
        }
        val selectItemParams = params as? SelectItemLayoutParams ?: return
        val cellParams = convertToCellParams(selectItemParams)
        cell.addView(child, cell.childCount, cellParams)
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 2)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        if (isChecked) {
            mergeDrawableStates(drawableState, intArrayOf(android.R.attr.state_checked))
        }
        return drawableState
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        backgroundTintList = backgroundList
        updateControlCheckedState()
    }

    override fun setChecked(checked: Boolean) {
        if (_isChecked != checked) {
            _isChecked = checked
            refreshDrawableState()
        }
    }

    override fun isChecked(): Boolean {
        return _isChecked
    }

    override fun toggle() {
        if (isCheckable) isChecked = !isChecked
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return SelectItemLayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams?): Boolean {
        return p is SelectItemLayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        return SelectItemLayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams?): LayoutParams {
        return SelectItemLayoutParams(p)
    }

    /**
     * Параметры расположения дочерних [View] в [SelectItemView]
     */
    class SelectItemLayoutParams : android.widget.LinearLayout.LayoutParams {

        /**
         * Роль [View] внутри [SelectItemView]
         */
        var itemContent: SelectItemContent? = null

        /**
         * Выравнивание [View] внутри [SelectItemView]
         */
        var gravity: Int = Gravity.NO_GRAVITY

        /**
         * Контролирует установку параметра [isDuplicateParentStateEnabled] для [View]
         */
        var forceDuplicateParentState: Boolean = true

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            c.withStyledAttributes(attrs, R.styleable.SelectItem_Layout) {
                this@SelectItemLayoutParams.itemContent =
                    getInt(R.styleable.SelectItem_Layout_layout_itemContent, 0)
                        .let { SelectItemContent.entries.toTypedArray().getOrElse(it) { null } }
            }
        }

        constructor(width: Int, height: Int) : super(width, height)
        constructor(width: Int, height: Int, weight: Float) : super(width, height, weight)
        constructor(width: Int, height: Int, itemContent: SelectItemContent) : super(width, height) {
            this.itemContent = itemContent
        }

        constructor(source: ViewGroup.LayoutParams?) : super(source) {
            if (source is SelectItemLayoutParams) {
                this.itemContent = source.itemContent
                this.gravity = source.gravity
                this.forceDuplicateParentState = source.forceDuplicateParentState
            }
        }
    }

    private fun configureControl() {
        val params = LayoutParams(
            if (controlSize != 0) controlSize else LayoutParams.WRAP_CONTENT,
            if (controlSize != 0) controlSize else LayoutParams.WRAP_CONTENT,
        )
        controlBox.layoutParams = params
        requestLayout()
    }

    private fun setControlMargin() {
        val params = (controlBox.layoutParams as? MarginLayoutParams) ?: return
        params.apply { marginEnd = _controlMargin }
        controlBox.layoutParams = params
        requestLayout()
    }

    private fun setControlContent() {
        controlBox.removeAllViews()
        if (itemType == SELECT_ITEM_TYPE_SINGLE) {
            controlBox.addView(iconView)
        } else {
            controlBox.addView(checkBoxView)
        }
    }

    private fun convertToCellParams(params: SelectItemLayoutParams): CellLayout.LayoutParams {
        return CellLayout.LayoutParams(params).apply {
            cellContent = when (params.itemContent) {
                SelectItemContent.CENTER -> CellContent.CENTER
                SelectItemContent.END -> CellContent.END
                SelectItemContent.LABEL -> CellContent.LABEL
                SelectItemContent.TITLE -> CellContent.TITLE
                SelectItemContent.SUBTITLE -> CellContent.SUBTITLE
                SelectItemContent.DISCLOSURE -> CellContent.DISCLOSURE
                else -> CellContent.START
            }
            forceDuplicateParentState = true
        }
    }

    private fun installIconIfNeed() {
        if (icon != 0) {
            iconView.setImageDrawable(
                AppCompatResources.getDrawable(context, icon),
            )
        } else {
            iconView.setImageDrawable(null)
        }
    }

    private fun updateControlCheckedState() {
        if (controlBox.isNotEmpty()) {
            controlBox.children.forEach { child ->
                when (child) {
                    is ImageView -> child.isVisible = isChecked
                    is CheckBox -> child.isChecked = this.isChecked
                    else -> {}
                }
            }
        }
    }

    /**
     * Роли для дочерних элементов [View] в [SelectItemView]
     */
    enum class SelectItemContent {
        /**
         * Позиционирует [View] в начале [SelectItemView], после [View] с ролью [CONTROL]
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [SelectItemView]
         */
        START,

        /**
         * Позиционирует [View] в середине [SelectItemView] - между [View] с ролями [START] и [END].
         * Несколько [View] с этой ролью будут следовать друг за другом по вертикали в том
         * порядке, в котором они добавлялись в [SelectItemView]
         */
        CENTER,

        /**
         * Позиционирует [View] в конце [SelectItemView].
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [SelectItemView]
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
         * Позиционирует [View] в самом конце [SelectItemView], после всех [View] с ролью [END], несмотря на то, в каком
         * порядке была добавлена [View] с этой ролью
         */
        DISCLOSURE,
    }

    companion object {

        /**
         * Тип [SelectItemView] для отображения в списке элементов поддерживающим одиночный выбор.
         */
        const val SELECT_ITEM_TYPE_SINGLE = 0

        /**
         * Тип [SelectItemView] для отображения в списке элементов поддерживающим множетсвенный выбор.
         */
        const val SELECT_ITEM_TYPE_MULTIPLE = 1

        internal fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var checkBoxStyleOverlay = 0
            var cellStyleOverlay = 0
            context.withStyledAttributes(attrs, R.styleable.SelectItem, defStyleAttr, defStyleRes) {
                checkBoxStyleOverlay = getResourceId(R.styleable.SelectItem_sd_checkBoxStyleOverlay, 0)
                cellStyleOverlay = getResourceId(R.styleable.SelectItem_sd_cellStyleOverlay, 0)
            }
            val themeOverlay = createMergedOverlayContext(
                context,
                checkBoxStyleOverlay,
                cellStyleOverlay,
            )
            return themeOverlay
        }

        private fun createMergedOverlayContext(base: Context, vararg overlays: Int): Context {
            val validOverlays = overlays.filter { it != 0 }
            if (validOverlays.isEmpty()) return base
            val newTheme = base.resources.newTheme()
            newTheme.setTo(base.theme)
            validOverlays.forEach { newTheme.applyStyle(it, true) }
            return ContextThemeWrapper(base, newTheme)
        }
    }
}
