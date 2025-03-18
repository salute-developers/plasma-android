
package com.sdds.uikit

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import com.sdds.uikit.fs.FocusSelectorSettings
import com.sdds.uikit.internal.base.isClippedToOutline
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeable
import android.widget.FrameLayout as AndroidFrameLayout
import androidx.constraintlayout.widget.ConstraintLayout as AndroidConstraintLayout

/**
 * Компонент контента карточки, который поддерживает возможность изменения формы (Shapeable)
 * и селектор фокуса.
 *
 * @param context контекст
 * @param attrs набор XML-атрибутов
 * @param defStyleAttr атрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 */
open class CardContent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_cardContentStyle,
    defStyleRes: Int = R.style.Sdds_Components_CardContent,
) : AndroidConstraintLayout(context, attrs, defStyleAttr, defStyleRes), Shapeable {

    private val shapeable = shapeable(attrs, defStyleAttr, defStyleRes)
    private val focusSelectorDelegate = FocusSelectorDelegate(
        FocusSelectorSettings.fromAttrs(context, attrs, defStyleAttr),
    )

    override val shape: ShapeModel?
        get() = shapeable.shape

    init {
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
    }

    @Suppress("ViewConstructor")
    internal class Wrapper(
        context: Context,
        target: CardContent,
    ) : AndroidFrameLayout(context), Shapeable, HasFocusSelector by target.focusSelectorDelegate {

        private var _targetShapeModel: ShapeModel? = null

        override val shape: ShapeModel?
            get() = _targetShapeModel

        init {
            addView(target)
            _targetShapeModel = target.shape
            isDuplicateParentStateEnabled = target.isDuplicateParentStateEnabled
            applySelector(this)
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
            if (isDuplicateParentStateEnabled) {
                val isFocused = drawableState.contains(android.R.attr.state_focused)
                updateFocusSelector(this, isFocused)
            }
        }
    }
}
