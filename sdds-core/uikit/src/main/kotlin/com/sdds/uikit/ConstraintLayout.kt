package com.sdds.uikit

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import com.sdds.uikit.internal.base.isClippedToOutline
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeable
import androidx.constraintlayout.widget.ConstraintLayout as AndroidConstraintLayout

/**
 * Реализация [ConstraintLayout] с поддержкой [ShapeModel] и селектором фокуса
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class ConstraintLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : AndroidConstraintLayout(context, attrs, defStyleAttr, defStyleRes),
    Shapeable,
    HasFocusSelector by FocusSelectorDelegate() {

    private val _shapeable: Shapeable = shapeable(attrs, defStyleAttr, defStyleRes)

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
}
