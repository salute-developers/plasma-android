package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.internal.focusselector.SelectorDrawable
import com.sdds.uikit.shape.ShapeModel

/**
 * Компонент "Группа кнопок".
 * Группирует кнопки согласно заданному стилю.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class ButtonGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_buttonGroupStyle,
    defStyleRes: Int = R.style.Sdds_Components_ButtonGroup,
) : LinearLayout(
    wrapper(context, attrs, defStyleAttr, defStyleRes),
    attrs,
    defStyleAttr,
    defStyleRes,
) {
    private val buttons: MutableList<Button> = mutableListOf()
    private var _externalShape: ShapeModel = ShapeModel()
    private var _internalShape: ShapeModel = ShapeModel()
    private var _spacing: Int = 0

    init {
        context.withStyledAttributes(attrs, R.styleable.ButtonGroup, defStyleAttr, defStyleRes) {
            val externalShape = getResourceId(R.styleable.ButtonGroup_sd_externalShapeAppearance, 0)
            val internalShape = getResourceId(R.styleable.ButtonGroup_sd_internalShapeAppearance, 0)
            _externalShape = ShapeModel.create(context, externalShape)
            _internalShape = ShapeModel.create(context, internalShape)
            _spacing = getDimensionPixelSize(R.styleable.ButtonGroup_sd_buttonSpacing, 0)
        }
    }

    /**
     * Возвращает состояние горизонтальной ориентации [ButtonGroup]
     */
    val isHorizontal: Boolean
        get() = orientation == HORIZONTAL

    /**
     * Возвращает состояние вертикальной ориентации [ButtonGroup]
     */
    val isVertical: Boolean
        get() = orientation == VERTICAL

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (child !is Button) return
        val viewIndex = index.coerceIn(0, childCount)
        val buttonIndex = index.coerceIn(0, buttons.size)
        val layoutParams = (params as? LayoutParams) ?: LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
        super.addView(child, viewIndex, layoutParams)
        buttons.add(buttonIndex, child)
        applyShapes()
        updateSpacing()
    }

    override fun removeView(view: View?) {
        super.removeView(view)
        if (view is Button) {
            buttons.remove(view)
            applyShapes()
        }
    }

    override fun removeAllViews() {
        super.removeAllViews()
        buttons.clear()
    }

    private fun updateSpacing() {
        buttons.forEachIndexed { index, button ->
            val lp = button.layoutParams as? MarginLayoutParams ?: return@forEachIndexed
            if (orientation == HORIZONTAL) {
                lp.marginEnd = if (index != buttons.lastIndex) _spacing else 0
                lp.bottomMargin = 0
            } else {
                lp.bottomMargin = if (index != buttons.lastIndex) _spacing else 0
                lp.marginEnd = 0
            }
            button.layoutParams = lp
        }
    }

    private fun applyShapes() {
        buttons.forEachIndexed { index, b ->
            updateShapeAt(index)
            b.setOnFocusChangeListener { v, hasFocus ->
                v.translationZ = if (hasFocus) 10f else 0f
            }
        }
    }

    private fun updateShapeAt(index: Int) {
        val shape = getShapeAt(index)
        buttons[index].setShape(shape)
        (buttons[index].foreground as? SelectorDrawable)?.updateShapeModel(shape)
    }

    private fun getShapeAt(index: Int): ShapeModel {
        if (_externalShape == _internalShape) return _externalShape
        return when (buttons.size) {
            1 -> _externalShape
            2 -> if (index == 0) getStartShape() else getEndShape()
            else -> when (index) {
                0 -> getStartShape()
                buttons.size - 1 -> getEndShape()
                else -> _internalShape
            }
        }
    }

    private fun getStartShape(): ShapeModel {
        val tLeft = calculateStartCorner(Corner.TopLeft)
        val tRight = calculateStartCorner(Corner.TopRight)
        val bLeft = calculateStartCorner(Corner.BottomLeft)
        val bRight = calculateStartCorner(Corner.BottomRight)
        return ShapeModel(tLeft, tRight, bRight, bLeft)
    }

    private fun getEndShape(): ShapeModel {
        val tLeft = calculateEndCorner(Corner.TopLeft)
        val tRight = calculateEndCorner(Corner.TopRight)
        val bLeft = calculateEndCorner(Corner.BottomLeft)
        val bRight = calculateEndCorner(Corner.BottomRight)
        return ShapeModel(tLeft, tRight, bRight, bLeft)
    }

    private fun calculateStartCorner(corner: Corner) =
        if (orientation == HORIZONTAL) {
            when (corner) {
                Corner.TopLeft -> _externalShape.cornerSizeTopLeft
                Corner.TopRight -> _internalShape.cornerSizeTopRight
                Corner.BottomRight -> _internalShape.cornerSizeBottomRight
                Corner.BottomLeft -> _externalShape.cornerSizeBottomLeft
            }
        } else {
            when (corner) {
                Corner.TopLeft -> _externalShape.cornerSizeTopLeft
                Corner.TopRight -> _externalShape.cornerSizeTopRight
                Corner.BottomRight -> _internalShape.cornerSizeBottomRight
                Corner.BottomLeft -> _internalShape.cornerSizeBottomLeft
            }
        }

    private fun calculateEndCorner(corner: Corner) =
        if (orientation == HORIZONTAL) {
            when (corner) {
                Corner.TopLeft -> _internalShape.cornerSizeTopLeft
                Corner.TopRight -> _externalShape.cornerSizeTopRight
                Corner.BottomRight -> _externalShape.cornerSizeBottomRight
                Corner.BottomLeft -> _internalShape.cornerSizeBottomLeft
            }
        } else {
            when (corner) {
                Corner.TopLeft -> _internalShape.cornerSizeTopLeft
                Corner.TopRight -> _internalShape.cornerSizeTopRight
                Corner.BottomRight -> _externalShape.cornerSizeBottomRight
                Corner.BottomLeft -> _externalShape.cornerSizeBottomLeft
            }
        }

    private enum class Corner {
        TopLeft, TopRight, BottomRight, BottomLeft
    }

    companion object {
        internal fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var overlay = context
            context.withStyledAttributes(attrs, R.styleable.ButtonGroup, defStyleAttr, defStyleRes) {
                val buttonStyle = getResourceId(R.styleable.ButtonGroup_sd_buttonStyleOverlay, 0)
                if (buttonStyle != 0) overlay = ContextThemeWrapper(context, buttonStyle)
            }
            return overlay
        }
    }
}
