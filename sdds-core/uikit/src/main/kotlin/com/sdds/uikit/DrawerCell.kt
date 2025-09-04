package com.sdds.uikit

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import android.widget.LinearLayout.LayoutParams
import android.widget.LinearLayout.VERTICAL
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.isVisible
import com.sdds.uikit.DrawerOld.CloseIconAlignment
import com.sdds.uikit.DrawerOld.ContentLayoutParams
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.setBackgroundValueList

/**
 * Контейнер - играет роль выдвижной панели в [DrawerLayout],
 * для удобства расположения контента компонент разделен на три секции - Header, Body, Footer.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 */
open class Drawer @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_drawerStyle,
    defStyleRes: Int = R.style.Sdds_Components_Drawer,
) : FrameLayout(context) {

    private var cell: CellLayout = CellLayout(context)
    private var header: LinearLayout = LinearLayout(context).apply { orientation = HORIZONTAL }
    private var body: FrameLayout = FrameLayout(context)
    private var footer: FrameLayout = FrameLayout(context)
    private var innerDrawer: com.sdds.uikit.LinearLayout =
        com.sdds.uikit.LinearLayout(context, attrs, defStyleAttr, defStyleRes)
            .apply { orientation = VERTICAL }

    private var userHeaderSection: FrameLayout = FrameLayout(context)
    private var closeIconSection: FrameLayout = FrameLayout(context)

    private var closeIconHeaderPadding: Int = 0
    private var closeIconOffsetX: Int = 0
    private var closeIconOffsetY: Int = 0
    private var closeIconAlignment: CloseIconAlignment = CloseIconAlignment.END
    private var closeIconPlacement: CloseIconPlacement = CloseIconPlacement.NONE
    private var backgroundList: ColorValueStateList? = null
    private val closeIconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }

    init {
        context.withStyledAttributes(
            attrs,
            R.styleable.Drawer,
            defStyleAttr,
            defStyleRes,
        ) {
            closeIconView.imageTintList = getColorStateList(R.styleable.Drawer_sd_closeIconTint)
            val icon = getDrawable(R.styleable.Drawer_sd_closeIcon)
            closeIconView.setImageDrawable(icon)
            val closePlacement = getInt(R.styleable.Drawer_sd_closeIconPlacement, 0)
            closeIconPlacement = CloseIconPlacement.values().getOrElse(closePlacement) { CloseIconPlacement.NONE }
            closeIconHeaderPadding = getDimensionPixelSize(R.styleable.Drawer_sd_closeIconHeaderPadding, 0)
            closeIconOffsetX = getDimensionPixelSize(R.styleable.Drawer_sd_closeIconOffsetX, 0)
            closeIconOffsetY = getDimensionPixelSize(R.styleable.Drawer_sd_closeIconOffsetY, 0)
            val cAl = getInt(R.styleable.Drawer_sd_drawerCloseAlignment, 0)
            closeIconAlignment = CloseIconAlignment.values().getOrElse(cAl) { CloseIconAlignment.END }
            backgroundList = getColorValueStateList(context, R.styleable.Drawer_sd_background)
            closeIconSection.isVisible = closeIconPlacement == CloseIconPlacement.INNER
        }
        buildLayout()
    }

    /**
     * Роли для дочерних элементов [View] в [Drawer]
     */
    enum class ContentPlacement {

        /**
         * Позиционирует [View] наверху [Drawer].
         */
        HEADER,

        /**
         * Позиционирует [View] в середине [Drawer] - между [View] с ролями [HEADER] и [FOOTER].
         */
        BODY,

        /**
         * Позиционирует [View] внизу [Drawer].
         */
        FOOTER,
    }

    /**
     * Расположение иконки закрытия в секции Header
     */
    enum class CloseIconAlignment {

        /**
         * Слева от контента
         */
        START,

        /**
         * Справа от контента
         */
        END,
    }

    /**
     * Расположение иконки закрытия в секции Header
     */
    enum class CloseIconPlacement {

        /**
         * Внутри Drawer
         */
        INNER,

        /**
         * Снаружи Drawer
         */
        OUTER,

        /**
         * Отсутствует
         */
        NONE,
    }

    /**
     * Устанавливает новый контент в секцию Header,
     * удаляя ранее размещенный.
     * @param content новый контент
     */
    open fun setHeader(content: View?) {
        if (content == null) return
        clearHeader()
        userHeaderSection.addView(content)
    }

    /**
     * Устанавливает новый контент в секцию Footer,
     * удаляя ранее размещенный.
     * @param content новый контент
     */
    open fun setFooter(content: View?) {
        if (content == null) return
        clearFooter()
        footer.addView(content)
    }

    /**
     * Устанавливает новый контент в секцию Body,
     * удаляя ранее размещенный.
     * @param content новый контент
     */
    open fun setBody(content: View?) {
        if (content == null) return
        clearBody()
        body.addView(content)
    }

    /**
     * Устанавливает весь контент из секции Header.
     */
    open fun clearHeader() {
        userHeaderSection.removeAllViews()
    }

    /**
     * Устанавливает весь контент из секции Body.
     */
    open fun clearBody() {
        body.removeAllViews()
    }

    /**
     * Устанавливает весь контент из секции Footer.
     */
    open fun clearFooter() {
        footer.removeAllViews()
    }

    /**
     * Устанавливает слушатель нажатий на иконку закрытия.
     * @param listener колбэк нажатий
     */
    fun setCloseIconClickListener(listener: OnClickListener) {
        closeIconView.setOnClickListener(listener)
    }

    /**
     * Устанавливает выравнивание иконки закрытия в секции Header.
     * @param alignment
     * @see [CloseIconAlignment]
     */
    fun setCloseIconAlignment(alignment: CloseIconAlignment) {
        if (closeIconAlignment == alignment) return
        closeIconAlignment = alignment
        populateHeader()
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        innerDrawer.setBackgroundValueList(backgroundList)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        val movableChildren = children
            .filter { it != cell }
        movableChildren.forEach { child ->
            val lp = child.layoutParams as? ContentLayoutParams
            val placement = lp?.contentPlacement ?: com.sdds.uikit.Drawer.ContentPlacement.BODY
            (child.parent as? ViewGroup)?.removeView(child)
            when (placement) {
                ContentPlacement.HEADER -> userHeaderSection.addView(child)
                ContentPlacement.BODY -> body.addView(child)
                ContentPlacement.FOOTER -> footer.addView(child)
            }
        }
    }

    override fun generateDefaultLayoutParams(): ContentLayoutParams {
        return ContentLayoutParams(
            WRAP_CONTENT,
            WRAP_CONTENT,
        )
    }

    override fun generateLayoutParams(attrs: AttributeSet): ContentLayoutParams {
        return ContentLayoutParams(context, attrs)
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean {
        return p is ContentLayoutParams
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams): ContentLayoutParams {
        return ContentLayoutParams(p)
    }

    /**
     * Параметры расположения дочерних [View] в [Drawer]
     */
    class ContentLayoutParams : FrameLayout.LayoutParams {

        /**
         * Роль [View] внутри [Drawer]
         */
        var contentPlacement: ContentPlacement = ContentPlacement.BODY

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            c.withStyledAttributes(attrs, R.styleable.Drawer_Layout) {
                contentPlacement = getInt(R.styleable.Drawer_Layout_sd_contentPlacement, 1)
                    .let {
                        ContentPlacement.values().getOrElse(it) { ContentPlacement.BODY }
                    }
            }
        }

        constructor(width: Int, height: Int) : super(width, height)
        constructor(source: ViewGroup.LayoutParams) : super(source) {
            if (source is ContentLayoutParams) {
                this.contentPlacement = source.contentPlacement
            }
        }
    }

    private fun placeCloseIconInner() {
        val iconGravity = getIconGravity(closeIconAlignment)
        header.addView(
            closeIconSection,
            LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT).apply {
                gravity = iconGravity
                marginEnd = if (closeIconAlignment == CloseIconAlignment.START) closeIconHeaderPadding else 0
                marginStart = if (closeIconAlignment == CloseIconAlignment.END) closeIconHeaderPadding else 0
            },
        )
    }

    private fun placeCloseIconOuter() {
        (closeIconSection.parent as? ViewGroup)?.removeView(closeIconSection)
        val lp = CellLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT).apply {
            gravity = Gravity.TOP
            marginEnd = if (closeIconAlignment == CloseIconAlignment.START) closeIconOffsetX else 0
            marginStart = if (closeIconAlignment == CloseIconAlignment.END) closeIconOffsetX else 0
            topMargin = closeIconOffsetY
        }
        if (closeIconAlignment == CloseIconAlignment.START) {
            cell.addView(closeIconSection, lp
                .apply { cellContent = CellLayout.CellContent.START })
        } else {
            cell.addView(closeIconSection, lp
                .apply { cellContent = CellLayout.CellContent.END })
        }
    }

    private fun populateHeader() {
        when (closeIconPlacement) {
            CloseIconPlacement.INNER -> {
                header.removeAllViews()
                if (closeIconAlignment == CloseIconAlignment.START) {
                    placeCloseIconInner()
                    header.addView(userHeaderSection, LayoutParams(0, WRAP_CONTENT, 1f))
                } else {
                    header.addView(userHeaderSection, LayoutParams(0, WRAP_CONTENT, 1f))
                    placeCloseIconInner()
                }
            }
            CloseIconPlacement.OUTER -> {
                header.removeAllViews()
                header.addView(userHeaderSection, LayoutParams(0, WRAP_CONTENT, 1f))
                placeCloseIconOuter()
            }
            CloseIconPlacement.NONE -> {
                header.removeAllViews()
                header.addView(userHeaderSection, LayoutParams(0, WRAP_CONTENT, 1f))
            }
        }


    }

    private fun buildLayout() {
        addView(cell, ContentLayoutParams(MATCH_PARENT, MATCH_PARENT))
        innerDrawer.addView(header, LayoutParams(WRAP_CONTENT, WRAP_CONTENT))
        innerDrawer.addView(body, LayoutParams(WRAP_CONTENT, 0, 1f))
        innerDrawer.addView(footer, LayoutParams(WRAP_CONTENT, WRAP_CONTENT))
        Log.d("closeIconSection", "width = ${closeIconSection.width}, height = ${closeIconSection.height}")
        closeIconSection.addView(closeIconView)
        Log.d("closeIconSection", "width = ${closeIconSection.width}, height = ${closeIconSection.height}")
        Log.d("closeIconView", "width = ${closeIconView.width}, height = ${closeIconView.height}")
        populateHeader()
        cell.addView(innerDrawer, CellLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT).apply { cellContent = CellLayout.CellContent.CENTER })
    }

    private fun getIconGravity(alignment: CloseIconAlignment): Int {
        return when (alignment) {
            CloseIconAlignment.START -> Gravity.TOP or Gravity.START
            else -> Gravity.TOP or Gravity.END
        }
    }
}