package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.os.Build
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import com.sdds.uikit.CellLayout.CellContent
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.ViewAlphaHelper

open class SelectItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_listItemViewStyle,
    defStyleRes: Int = R.style.Sdds_Components_ListItem,
) : LinearLayout(
    wrapper(context, attrs, defStyleAttr, defStyleRes),
    attrs,
    defStyleAttr,
    defStyleRes,
),
    ColorStateHolder {

    @DrawableRes
    private var icon: Int = 0
    private var iconTint: ColorStateList? = null
    private var backgroundList: ColorStateList? = null
    private var _itemType: Int = SELECT_ITEM_TYPE_SINGLE
    private var _controlSize: Int = 0
    private var _controlMargin: Int = 0
    private val cell: CellLayout = CellLayout(this.context)
    private val controlBox: FrameLayout = FrameLayout(this.context)
    private val controlView: View? = null

    private val iconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }

    private val checkBoxView: CheckBox = CheckBox(this.context)
    private val viewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)

    open var itemType: Int
        get() = _itemType
        set(value) {
            if (_itemType != value) {
                _itemType = value
                setControlContent()
            }
        }

    open var controlSize: Int
        get() = _controlSize
        set(value) {
            if (_controlSize != value) {
                _controlSize = value
                configureControl()
            }
        }

    /**
     * Контролирует видимость элемента с ролью [CellContent.DISCLOSURE]
     */
    open var disclosureEnabled: Boolean
        get() = cell.disclosureEnabled
        set(value) {
            cell.disclosureEnabled = value
        }

    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    init {
        orientation = HORIZONTAL
        context.withStyledAttributes(attrs, R.styleable.SelectItem, defStyleAttr, defStyleRes) {
            _controlMargin = getDimensionPixelSize(R.styleable.SelectItem_sd_controlMargin, 0)
            _controlSize = getDimensionPixelSize(R.styleable.SelectItem_sd_controlSize, 0)
            icon = getResourceId(R.styleable.SelectItem_sd_icon, 0)
            setIconTintList(getColorStateList(R.styleable.SelectItem_sd_iconTint))
            installIconIfNeed()
            _itemType = getInt(R.styleable.SelectItem_sd_itemType, 0)
            backgroundList = getColorStateList(R.styleable.SelectItem_sd_background)
        }
        super<LinearLayout>.addView(
            controlBox,
            LayoutParams(
                if (controlSize != 0) controlSize else LayoutParams.WRAP_CONTENT,
                if (controlSize != 0) controlSize else LayoutParams.WRAP_CONTENT,
            ),
        )
        setControlMargin()
        setControlContent()
        addView(cell)
    }

    /**
     * Устанавливает цвета иконки в control [newIconTint]
     */
    open fun setIconTintList(newIconTint: ColorStateList?) {
        if (iconTint != newIconTint) {
            iconTint = newIconTint
            iconView.imageTintList = iconTint
        }
//        (contentBefore as? ImageView)?.apply {
//            imageTintList = iconTint
//        }
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
        if (selectItemParams.itemContent == SelectItemContent.CONTROL) {
            controlBox.addView(child)
        } else {
            val cellParams = convertToCellParams(selectItemParams)
            cell.addView(child, cell.childCount, cellParams)
        }
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        backgroundTintList = backgroundList
    }

    override fun generateDefaultLayoutParams(): SelectItemLayoutParams {
        return SelectItemLayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams?): Boolean {
        return p is SelectItemLayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): SelectItemLayoutParams {
        return SelectItemLayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams?): SelectItemLayoutParams {
        return SelectItemLayoutParams(p)
    }

    /**
     * Параметры расположения дочерних [View] в [SelectItem]
     */
    class SelectItemLayoutParams : LayoutParams {

        /**
         * Роль [View] внутри [SelectItem]
         */
        var itemContent: SelectItemContent? = null

        /**
         * Выравнивание [View] внутри [SelectItem]
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
            forceDuplicateParentState = params.forceDuplicateParentState
        }
    }

    private fun installIconIfNeed() {
        if (icon != 0) {
            iconView.setImageDrawable(
                AppCompatResources.getDrawable(context, icon),
            )
        }
    }

    /**
     * Роли для дочерних элементов [View] в [SelectItem]
     */
    enum class SelectItemContent {

        /**
         * Позиционирует [View] в самом начале [SelectItem], перед всеми [View] с ролью [START], несмотря на то, в каком
         * порядке была добавлена [View] с этой ролью
         */
        CONTROL,

        /**
         * Позиционирует [View] в начале [SelectItem], после [View] с ролью [CONTROL]
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [SelectItem]
         */
        START,

        /**
         * Позиционирует [View] в середине [SelectItem] - между [View] с ролями [START] и [END].
         * Несколько [View] с этой ролью будут следовать друг за другом по вертикали в том
         * порядке, в котором они добавлялись в [SelectItem]
         */
        CENTER,

        /**
         * Позиционирует [View] в конце [SelectItem].
         * Несколько [View] с этой ролью будут следовать друг за другом по горизонтали в том
         * порядке, в котором они добавлялись в [SelectItem]
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
         * Позиционирует [View] в самом конце [SelectItem], после всех [View] с ролью [END], несмотря на то, в каком
         * порядке была добавлена [View] с этой ролью
         */
        DISCLOSURE,
    }

    companion object {
        const val SELECT_ITEM_TYPE_SINGLE = 0
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
