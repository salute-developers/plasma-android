package com.sdds.uikit.internal.codefield

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.RectF
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.ViewGroup
import androidx.annotation.StyleRes
import com.sdds.uikit.drawable.TextDrawable
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.shape.ShapeModel

/**
 * Компонент CodeItem
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @see ViewGroup
 */
internal class CodeItem(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : Drawable() {

    private val rect: RectF = RectF()
    private val paint: Paint = Paint().configure(isAntiAlias = true)
    private var _content: CodeContent = CodeContent.Empty
    private var shapeTintList: ColorStateList? = null
    private var dotSize: Int = 0
    private var textDrawable: TextDrawable = TextDrawable(context)

    private val dotPaint: Paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLACK
        strokeWidth = 4f
        style = Paint.Style.STROKE
    }

    fun setHiddenDotSize(size: Int){
        if (dotSize != size) {
            dotSize = size
        }
    }

    /**
     * Устанавливает цвета заливки фона
     * @param itemTintList цвета фона
     * @see ColorStateList
     */
    fun setItemTintList(itemTintList: ColorStateList? = null) {
        shapeTintList = itemTintList
        textDrawable.setTintList(itemTintList)
    }

    /**
     * Устанавливает стиль текста
     * @param context контекст
     * @param appearanceId ссылка на ресурс стиля
     */
    fun setTextAppearance(context: Context, @StyleRes appearanceId: Int) {
        textDrawable.setTextAppearance(context, appearanceId)
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     * @see ColorStateList
     */
    fun setTextColor(colors: ColorStateList?) {
        textDrawable.setTextColor(colors)
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
     * Устанавливает [ShapeModel] для отрисовки новой формы
     * @param sModel [ShapeModel]
     */
    fun setShapeModel(sModel: ShapeModel) {
        textDrawable.setShapeModel(sModel)
    }

    override fun draw(canvas: Canvas) {
        textDrawable.bounds = bounds
        bounds.let { b ->
            rect.set(b.left.toFloat(), b.top.toFloat(), b.right.toFloat(), b.bottom.toFloat())
        }
        when (val c = _content) {
            is CodeContent.Character -> {
                Log.d("item draw","char")
                val newText = c.value.toString()
                if (textDrawable.text != newText) {
                    textDrawable.text = newText
                }
                textDrawable.draw(canvas)
            }

            is CodeContent.HiddenDot -> {
                Log.d("item draw","dot")
                if (textDrawable.text.isNotEmpty()) textDrawable.text = ""
                textDrawable.draw(canvas)
                canvas.drawCircle(rect.centerX(), rect.centerY(), dotSize / 2f, dotPaint)
            }

            is CodeContent.Empty -> {
                if (textDrawable.text.isNotEmpty()) textDrawable.text = ""
                textDrawable.draw(canvas)
            }
        }
    }

    override fun onStateChange(state: IntArray): Boolean {
        var change = false
        if (textDrawable.setState(state)) change = true
        return change
    }

    override fun isStateful(): Boolean {
        return textDrawable.isStateful
    }

    @Suppress("OVERRIDE_DEPRECATION")
    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun setAlpha(alpha: Int) {
        paint.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) = Unit
}
