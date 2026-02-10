package com.sdds.uikit

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import com.sdds.uikit.internal.base.isClippedToOutline
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeHelper
import android.widget.LinearLayout as AndroidLinearLayout

/**
 * Реализация [LinearLayout] с поддержкой ShapeModel и селектором фокуса
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 27.08.2024
 */
open class LinearLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : AndroidLinearLayout(
    context,
    attrs,
    defStyleAttr,
    defStyleRes,
),
    Shapeable,
    HasFocusSelector by FocusSelectorDelegate() {

    private val _shapeable: ShapeHelper = shapeHelper(attrs, defStyleAttr, defStyleRes)

    /**
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _shapeable.shape

    init {
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
        @Suppress("LeakingThis")
        applySelector(this, context, attrs, defStyleAttr)
    }

    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
        updateFocusSelector(this, gainFocus)
    }

    override fun setPressed(pressed: Boolean) {
        if (isPressed != pressed) {
            handlePressedChange(this, pressed)
        }
        super.setPressed(pressed)
    }

    fun setShape(shape: ShapeModel) {
        _shapeable.setShape(shape)
    }
}
