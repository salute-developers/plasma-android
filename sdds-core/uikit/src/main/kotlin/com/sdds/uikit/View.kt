package com.sdds.uikit

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeHelper
import android.view.View as AndroidView

/**
 * Реализация [android.view.View] с поддержой селектора фокуса и [Shapeable]
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 07.03.2025
 */
open class View @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AndroidView(context, attrs, defStyleAttr), Shapeable, HasFocusSelector by FocusSelectorDelegate() {

    private val _shapeable: ShapeHelper = shapeHelper(attrs, defStyleAttr)

    /**
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _shapeable.shape

    init {
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
}
