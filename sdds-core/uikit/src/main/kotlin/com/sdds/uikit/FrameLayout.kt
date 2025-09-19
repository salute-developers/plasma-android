package com.sdds.uikit

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.internal.base.isClippedToOutline
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeHelper
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.setBackgroundValueList
import android.widget.FrameLayout as AndroidFrameLayout

/**
 * Реализация [FrameLayout] с поддержкой ShapeModel и селектором фокуса
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 27.08.2024
 */
open class FrameLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : AndroidFrameLayout(
    context,
    attrs,
    defStyleAttr,
    defStyleRes,
),
    Shapeable,
    HasFocusSelector by FocusSelectorDelegate() {

    private val _shapeable = shapeHelper(attrs, defStyleAttr, defStyleRes)
    private var _backgroundList: ColorValueStateList? = null

    /**
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _shapeable.shape

    init {
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
        context.withStyledAttributes(attrs, R.styleable.FrameLayout, defStyleAttr, defStyleRes) {
            _backgroundList = getColorValueStateList(context, R.styleable.FrameLayout_sd_background)
        }
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

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        setBackgroundValueList(_backgroundList)
    }

    internal fun setShape(shapeModel: ShapeModel?) {
        if (shapeModel != null) {
            _shapeable.setShape(shapeModel)
        }
    }
}
