package com.sdds.uikit

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.core.content.withStyledAttributes
import androidx.core.view.isGone
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
open class Drawer @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_drawerStyle,
    defStyleRes: Int = R.style.Sdds_Components_Drawer,
) : com.sdds.uikit.LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private var header: LinearLayout? = null
    private var body: FrameLayout? = null
    private var footer: FrameLayout? = null
    private var userHeaderSection: FrameLayout? = null
    private var closeIconSection: FrameLayout? = null
    private var _closeIconSize: Int = DEFAULT_ICON_SIZE
    private var _closeIconPadding: Int = 0
    private var _closeIconAlignment: CloseIconAlignment = CloseIconAlignment.END
    private var _backgroundList: ColorValueStateList? = null
    private val closeIconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }

    init {
        orientation = VERTICAL
        context.withStyledAttributes(
            attrs,
            R.styleable.Drawer,
            defStyleAttr,
            defStyleRes,
        ) {
            closeIconView.imageTintList = getColorStateList(R.styleable.Drawer_sd_closeIconTint)
            val icon = getDrawable(R.styleable.Drawer_sd_closeIcon)
            closeIconView.setImageDrawable(icon)
            setHasClose(icon != null)
            _closeIconSize = getDimensionPixelSize(R.styleable.Drawer_sd_closeIconSize, DEFAULT_ICON_SIZE)
            _closeIconPadding = getDimensionPixelSize(R.styleable.Drawer_sd_closeIconPadding, 0)
            val cAl = getInt(R.styleable.Drawer_sd_drawerCloseAlignment, 0)
            _closeIconAlignment = CloseIconAlignment.values().getOrElse(cAl) { CloseIconAlignment.END }
            _backgroundList = getColorValueStateList(context, R.styleable.Drawer_sd_background)
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
     * Устанавливает новый контент в секцию Header,
     * удаляя ранее размещенный.
     * @param content новый контент
     */
    open fun setHeader(content: View?) {
        if (content == null) return
        clearHeader()
        userHeaderSection?.addView(content)
    }

    /**
     * Устанавливает новый контент в секцию Footer,
     * удаляя ранее размещенный.
     * @param content новый контент
     */
    open fun setFooter(content: View?) {
        if (content == null) return
        clearFooter()
        footer?.addView(content)
    }

    /**
     * Устанавливает новый контент в секцию Body,
     * удаляя ранее размещенный.
     * @param content новый контент
     */
    open fun setBody(content: View?) {
        if (content == null) return
        clearBody()
        body?.addView(content)
    }

    /**
     * Устанавливает весь контент из секции Header.
     */
    open fun clearHeader() {
        userHeaderSection?.removeAllViews()
    }

    /**
     * Устанавливает весь контент из секции Body.
     */
    open fun clearBody() {
        body?.removeAllViews()
    }

    /**
     * Устанавливает весь контент из секции Footer.
     */
    open fun clearFooter() {
        footer?.removeAllViews()
    }

    /**
     * Устанавливает видимость иконки закрытия.
     * @param hasClose если true - visible, false - gone
     */
    open fun setHasClose(hasClose: Boolean) {
        closeIconView.isVisible = hasClose
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
        if (_closeIconAlignment == alignment) return
        _closeIconAlignment = alignment
        header?.removeAllViews()
        populateHeader()
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        setBackgroundValueList(_backgroundList)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val parentWidthMode = MeasureSpec.getMode(widthMeasureSpec)
        val parentWidthSize = MeasureSpec.getSize(widthMeasureSpec)
        val horizontalPadding = paddingLeft + paddingRight

        var maxWidth = 0
        for (index in 0 until childCount) {
            val child = getChildAt(index)
            if (child.isGone) continue
            maxWidth = maxOf(child.measuredWidth, maxWidth)
        }

        val targetWidth = when (parentWidthMode) {
            MeasureSpec.EXACTLY -> parentWidthSize - horizontalPadding
            else -> maxWidth
        }
        for (index in 0 until childCount) {
            val child = getChildAt(index)
            if (child.isGone) continue
            val childWidthSpec = MeasureSpec.makeMeasureSpec(targetWidth, MeasureSpec.EXACTLY)
            val childHeightSpec = MeasureSpec.makeMeasureSpec(child.measuredHeight, MeasureSpec.EXACTLY)
            child.measure(childWidthSpec, childHeightSpec)
        }
        setMeasuredDimension(
            resolveSize(targetWidth + horizontalPadding, widthMeasureSpec),
            measuredHeight,
        )
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        val movableChildren = (0 until childCount)
            .map { getChildAt(it) }
            .filter { it != header && it != body && it != footer }
        movableChildren.forEach { child ->
            val lp = child.layoutParams as? ContentLayoutParams
            val placement = lp?.contentPlacement ?: ContentPlacement.BODY
            (child.parent as? ViewGroup)?.removeView(child)
            when (placement) {
                ContentPlacement.HEADER -> userHeaderSection?.addView(child)
                ContentPlacement.BODY -> body?.addView(child)
                ContentPlacement.FOOTER -> footer?.addView(child)
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

    private fun placeCloseIcon() {
        val iconGravity = getIconGravity(_closeIconAlignment)
        header?.addView(
            closeIconSection,
            FrameLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT).apply {
                gravity = iconGravity
                marginEnd = if (_closeIconAlignment == CloseIconAlignment.START) {
                    _closeIconPadding
                } else {
                    0
                }
                marginStart = if (_closeIconAlignment == CloseIconAlignment.END) {
                    _closeIconPadding
                } else {
                    0
                }
            },
        )
    }

    private fun buildLayout() {
        header = LinearLayout(context).apply { orientation = HORIZONTAL }
        addView(header, ContentLayoutParams(WRAP_CONTENT, WRAP_CONTENT))
        body = FrameLayout(context)
        addView(body, ContentLayoutParams(WRAP_CONTENT, 0, 1f))
        footer = FrameLayout(context)
        addView(footer, ContentLayoutParams(WRAP_CONTENT, WRAP_CONTENT))
        userHeaderSection = FrameLayout(context)
        closeIconSection = FrameLayout(context)
        closeIconSection?.addView(closeIconView, FrameLayout.LayoutParams(_closeIconSize, _closeIconSize))
        populateHeader()
    }

    private fun populateHeader() {
        header ?: return
        if (_closeIconAlignment == CloseIconAlignment.START) {
            placeCloseIcon()
            userHeaderSection?.let { header?.addView(it, LayoutParams(0, WRAP_CONTENT, 1f)) }
        } else {
            userHeaderSection?.let { header?.addView(it, LayoutParams(0, WRAP_CONTENT, 1f)) }
            placeCloseIcon()
        }
    }

    private fun getIconGravity(alignment: CloseIconAlignment): Int {
        return when (alignment) {
            CloseIconAlignment.START -> Gravity.TOP or Gravity.START
            else -> Gravity.TOP or Gravity.END
        }
    }

    companion object {
        private const val DEFAULT_ICON_SIZE = WRAP_CONTENT
    }
}
