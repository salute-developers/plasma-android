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
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.isVisible
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
open class DrawerOld @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_drawerStyle,
    defStyleRes: Int = R.style.Sdds_Components_Drawer,
) : LinearLayout(context) {

    private var innerDrawer: com.sdds.uikit.LinearLayout =
        com.sdds.uikit.LinearLayout(context, attrs, defStyleAttr, defStyleRes)
            .apply { orientation = VERTICAL }
    private var header: LinearLayout = LinearLayout(context).apply { orientation = HORIZONTAL }
    private var body: FrameLayout = FrameLayout(context)
    private var footer: FrameLayout = FrameLayout(context)
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
        orientation = HORIZONTAL
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
            closeIconSection.isVisible = closeIconPlacement != CloseIconPlacement.NONE
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
     * Устанавливает расположение иконки закрытия.
     * @param placement [CloseIconPlacement]
     * если placement == CLoseIconPlacement.NONE, то visibility = gone
     */
    open fun setCloseIconPlacement(placement: CloseIconPlacement) {
        if (closeIconPlacement != placement) {
            closeIconPlacement = placement
        }
        closeIconSection.isVisible = placement != CloseIconPlacement.NONE
        populateHeader()
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

//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        val parentWidthMode = MeasureSpec.getMode(widthMeasureSpec)
//        val parentWidthSize = MeasureSpec.getSize(widthMeasureSpec)
//        val horizontalPadding = innerDrawer.paddingLeft + innerDrawer.paddingRight
//
//        var maxWidth = 0
//        innerDrawer.children.forEach { child ->
//            if (!child.isGone) {
//                maxWidth = maxOf(child.measuredWidth, maxWidth)
//            }
//        }
//
//        val targetWidth = when (parentWidthMode) {
//            MeasureSpec.EXACTLY -> parentWidthSize - horizontalPadding
//            else -> maxWidth
//        }
//        innerDrawer.children.forEach { child ->
//            if (!child.isGone) {
//                val childWidthSpec = MeasureSpec.makeMeasureSpec(targetWidth, MeasureSpec.EXACTLY)
//                val childHeightSpec = MeasureSpec.makeMeasureSpec(child.measuredHeight, MeasureSpec.EXACTLY)
//                child.measure(childWidthSpec, childHeightSpec)
//            }
//        }
//        setMeasuredDimension(
//            resolveSize(targetWidth + horizontalPadding, widthMeasureSpec),
//            measuredHeight,
//        )
//    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        val movableChildren = children
            .filter { it != innerDrawer && it != closeIconSection }
        movableChildren.forEach { child ->
            val lp = child.layoutParams as? ContentLayoutParams
            val placement = lp?.contentPlacement ?: ContentPlacement.BODY
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
    class ContentLayoutParams : LinearLayout.LayoutParams {

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
        constructor(width: Int, height: Int, weight: Float) : super(width, height, weight)
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
            FrameLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT).apply {
                gravity = iconGravity
                marginEnd = if (closeIconAlignment == CloseIconAlignment.START) closeIconHeaderPadding else 0
                marginStart = if (closeIconAlignment == CloseIconAlignment.END) closeIconHeaderPadding else 0
            },
        )
    }

    private fun placeCloseIconOuter() {
        this.removeAllViews()
        val lp = ContentLayoutParams(WRAP_CONTENT, WRAP_CONTENT).apply {
            gravity = Gravity.TOP
            marginEnd = if (closeIconAlignment == CloseIconAlignment.START) closeIconOffsetX else 0
            marginStart = if (closeIconAlignment == CloseIconAlignment.END) closeIconOffsetX else 0
            topMargin = closeIconOffsetY
        }
        if (closeIconAlignment == CloseIconAlignment.START) {
            addView(closeIconSection, lp)
            addView(innerDrawer)
        } else {
            addView(innerDrawer)
            addView(closeIconSection, lp)
        }
    }

    private fun buildLayout() {
        innerDrawer.addView(header, ContentLayoutParams(WRAP_CONTENT, WRAP_CONTENT))
        innerDrawer.addView(body, ContentLayoutParams(WRAP_CONTENT, 0, 1f))
        innerDrawer.addView(footer, ContentLayoutParams(WRAP_CONTENT, WRAP_CONTENT))
        closeIconSection.addView(closeIconView, FrameLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT))
        addView(innerDrawer, ContentLayoutParams(MATCH_PARENT, WRAP_CONTENT, 1f))
        populateHeader()
    }

    private fun populateHeader() {
        header.removeAllViews()
        if (closeIconPlacement == CloseIconPlacement.OUTER) {
            header.addView(userHeaderSection, LayoutParams(0, WRAP_CONTENT, 1f))
            placeCloseIconOuter()
        } else {
            if (closeIconAlignment == CloseIconAlignment.START) {
                placeCloseIconInner()
                header.addView(userHeaderSection, LayoutParams(0, WRAP_CONTENT, 1f))
            } else {
                header.addView(userHeaderSection, LayoutParams(0, WRAP_CONTENT, 1f))
                placeCloseIconInner()
            }
        }
    }

    private fun getIconGravity(alignment: CloseIconAlignment): Int {
        return when (alignment) {
            CloseIconAlignment.START -> Gravity.TOP or Gravity.START
            else -> Gravity.TOP or Gravity.END
        }
    }
}
