package com.sdds.uikit.internal.codefield

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.R
import com.sdds.uikit.drawable.TextDrawable
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.dp
import com.sdds.uikit.shape.AbsoluteCornerSize
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.statelist.NumberStateList
import com.sdds.uikit.statelist.getIntForState
import com.sdds.uikit.statelist.getNumberStateList

/**
 * Компонент CodeItemDrawable
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @see Drawable
 */
internal class CodeItemDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : Drawable() {

    private var _content: CodeContent = CodeContent.Empty
    private var _focused: Boolean = false
    private var dotSize: Int = 0
    private var dotSizeNumberList: NumberStateList? = null
    private val textDrawable: TextDrawable = TextDrawable(context).apply {
        callback = this@CodeItemDrawable.callback
        ellipsize = null
    }
    private val dotDrawable: ShapeDrawable = ShapeDrawable().apply { callback = this@CodeItemDrawable.callback }
    private var strokeDotDrawable: ShapeDrawable = ShapeDrawable().apply { callback = this@CodeItemDrawable.callback }
    private var codeItemState: CodeItem.CodeItemState = CodeItem.CodeItemState.ORDINARY

    private var _hasCursor: Boolean = true
    private var cursorAlpha: Int = 0
    private var cursorColor: ColorStateList? = null
    private val cursorPaint: Paint = Paint().configure(isAntiAlias = true, color = Color.BLACK)
    private val cursorAnimator = ValueAnimator.ofInt(0, 255).apply {
        duration = 500
        repeatMode = ValueAnimator.REVERSE
        repeatCount = ValueAnimator.INFINITE
        addUpdateListener {
            cursorAlpha = it.animatedValue as Int
            invalidateSelf()
        }
    }

    var hasCursor: Boolean
        get() = _hasCursor
        set(value) {
            if (_hasCursor != value) {
                _hasCursor = value
                if (!_hasCursor) stopBlinkCursor()
            }
        }

    init {
        context.withStyledAttributes(attrs, R.styleable.SdCodeItemDrawable, defStyleAttr) {
            strokeDotDrawable.setStrokeWidth(
                getDimensionPixelSize(
                    R.styleable.SdCodeItemDrawable_sd_strokeWidth,
                    0,
                ).toFloat(),
            )
            dotSizeNumberList = getNumberStateList(context, R.styleable.SdCodeItemDrawable_sd_dotSize)
            cursorColor = getColorStateList(R.styleable.SdCodeItemDrawable_sd_cursorColor)
            cursorPaint.color = cursorColor?.colorForState(state) ?: Color.BLACK
            setItemTintList(getColorStateList(R.styleable.SdCodeItemDrawable_sd_background))
            setItemTextAppearance(context, getResourceId(R.styleable.SdCodeItemDrawable_sd_valueAppearance, 0))
            setTextColorList(getColorStateList(R.styleable.SdCodeItemDrawable_sd_valueColor))
            setDotFillColorList(getColorStateList(R.styleable.SdCodeItemDrawable_sd_dotColor))
            setDotStrokeWidth(getDimensionPixelSize(R.styleable.SdCodeItemDrawable_sd_strokeWidth, 0).toFloat())
            setDotStrokeTintList(getColorStateList(R.styleable.SdCodeItemDrawable_sd_strokeColor))
        }
    }

    /**
     * Устанавливает размеры точки, скрывающей вводимый символ
     * @param sizeList размеры точки
     */
    fun setDotSizeNumberList(sizeList: NumberStateList?) {
        if (dotSizeNumberList != sizeList) {
            dotSizeNumberList = sizeList
            invalidateSelf()
        }
    }

    /**
     * Устанавливает толщину бордера точки, скрывающей вводимый символ
     * @param strokeWidth толщина бордера
     */
    fun setDotStrokeWidth(strokeWidth: Float) {
        strokeDotDrawable.setStrokeWidth(strokeWidth)
    }

    /**
     * Устанавливает цвета фона
     * @param itemTintList цвета фона
     * @see ColorStateList
     */
    fun setItemTintList(itemTintList: ColorStateList?) {
        textDrawable.setTintList(itemTintList)
    }

    /**
     * Устанавливает стиль текста
     * @param context контекст
     * @param appearanceId ссылка на ресурс стиля
     */
    fun setItemTextAppearance(context: Context, @StyleRes appearanceId: Int) {
        textDrawable.setTextAppearance(context, appearanceId)
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     * @see ColorStateList
     */
    fun setTextColorList(colors: ColorStateList?) {
        textDrawable.setTextColor(colors)
    }

    /**
     * Устанавливает цвета окраса точки, скрвыающей символы
     * @param colors цвета текста
     * @see ColorStateList
     */
    fun setDotFillColorList(colors: ColorStateList?) {
        dotDrawable.setTintList(colors)
    }

    /**
     * Устанавливает цвета окраса бордера точки, скрвыающей символы
     * @param colors цвета текста
     * @see ColorStateList
     */
    fun setDotStrokeTintList(colors: ColorStateList?) {
        strokeDotDrawable.setStrokeTint(colors)
    }

    /**
     * Устанавливает [ShapeModel] для отрисовки новой формы
     * @param sModel [ShapeModel]
     */
    fun setShapeModel(sModel: ShapeModel) {
        textDrawable.setShapeModel(sModel)
    }

    /**
     * Устанавливает контент
     * @param content контент для отображения в ячейке ввода
     * @see CodeContent
     */
    fun setContent(content: CodeContent) {
        if (_content != content) {
            _content = content
            invalidateSelf()
        }
    }

    /**
     * Устанавливает цвета мигающего курсора
     * @param tint цвета курсора
     */
    fun setCursorTint(tint: ColorStateList?) {
        if (cursorColor != tint) {
            cursorColor = tint
            cursorPaint.color = tint.colorForState(state)
            invalidateSelf()
        }
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        textDrawable.bounds = bounds
        updateDotBounds()
    }

    override fun draw(canvas: Canvas) {
        when (val c = _content) {
            is CodeContent.Character -> {
                val newText = c.value.toString()
                if (textDrawable.text != newText) {
                    textDrawable.text = newText
                }
                textDrawable.draw(canvas)
            }

            is CodeContent.HiddenDot -> {
                if (textDrawable.text.isNotEmpty()) textDrawable.text = ""
                textDrawable.draw(canvas)
                dotDrawable.draw(canvas)
            }

            else -> {
                if (textDrawable.text.isNotEmpty()) textDrawable.text = ""
                textDrawable.draw(canvas)
                strokeDotDrawable.draw(canvas)
            }
        }
        if (codeItemState == CodeItem.CodeItemState.ACTIVATED || hasCursor) {
            drawCursor(canvas)
        }
    }

    override fun onStateChange(state: IntArray): Boolean {
        val focused = state.contains(android.R.attr.state_focused)
        val error = state.contains(R.attr.sd_state_error)
        val activated = state.contains(android.R.attr.state_activated)
        var change = false
        if (_focused != focused) {
            _focused = focused
            change = true
        }
        if (setCodeItemState(
                when {
                    error -> CodeItem.CodeItemState.ERROR
                    activated -> CodeItem.CodeItemState.ACTIVATED
                    else -> CodeItem.CodeItemState.ORDINARY
                },
            )
        ) {
            change = true
        }
        if (setDotSize(state)) change = true
        if (textDrawable.setState(state)) change = true
        if (dotDrawable.setState(state)) change = true
        if (strokeDotDrawable.setState(state)) change = true
        if (change) invalidateSelf()
        return super.onStateChange(state) || change
    }

    override fun isStateful(): Boolean {
        return true
    }

    @Suppress("OVERRIDE_DEPRECATION")
    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun setAlpha(alpha: Int) {
        textDrawable.alpha = alpha
        dotDrawable.alpha = alpha
        strokeDotDrawable.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) = Unit

    private fun setDotSize(state: IntArray): Boolean {
        val newSize = dotSizeNumberList?.getIntForState(state) ?: 0
        return if (dotSize != newSize) {
            dotSize = newSize
            val newModel = updateDotShapeModel()
            dotDrawable.setShapeModel(newModel)
            strokeDotDrawable.setShapeModel(newModel)
            updateDotBounds()
            true
        } else {
            false
        }
    }

    private fun updateDotShapeModel(): ShapeModel {
        val cornerSize = dotSize / 2f
        return ShapeModel(
            cornerSizeBottomLeft = AbsoluteCornerSize(cornerSize),
            cornerSizeTopLeft = AbsoluteCornerSize(cornerSize),
            cornerSizeBottomRight = AbsoluteCornerSize(cornerSize),
            cornerSizeTopRight = AbsoluteCornerSize(cornerSize),
        )
    }

    private fun updateDotBounds() {
        val left = bounds.centerX() - dotSize / 2
        val top = bounds.centerY() - dotSize / 2
        dotDrawable.bounds = Rect(left, top, left + dotSize, top + dotSize)
        strokeDotDrawable.bounds = Rect(left, top, left + dotSize, top + dotSize)
    }

    private fun setCodeItemState(itemState: CodeItem.CodeItemState): Boolean {
        val oldState = codeItemState
        if (oldState != itemState) {
            codeItemState = itemState
            if (codeItemState == CodeItem.CodeItemState.ACTIVATED && hasCursor) {
                startBlinkCursor()
            } else {
                stopBlinkCursor()
            }
            return true
        }
        return false
    }

    private fun drawCursor(canvas: Canvas) {
        cursorPaint.alpha = cursorAlpha
        val cx = bounds.centerX().toFloat()
        val height = 8
        val width = 1
        val top = (bounds.centerY() - height.dp).toFloat()
        val bottom = (bounds.centerY() + height.dp).toFloat()
        canvas.drawRect(cx - width.dp, top, cx + width.dp, bottom, cursorPaint)
    }

    private fun startBlinkCursor() {
        if (!cursorAnimator.isRunning) cursorAnimator.start()
    }

    private fun stopBlinkCursor() {
        cursorAnimator.cancel()
        cursorAlpha = 0
    }
}
