package com.sdkit.star.designsystem

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeable
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewState.Companion.isDefined
import com.sdds.uikit.viewstate.ViewStateHolder

/**
 * View из дизайн-системы
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Александр Малышев on 21.07.2023
 */
class StarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : View(context, attrs, defStyleAttr), Shapeable, ViewStateHolder {

    private val shaper = shapeable(attrs, defStyleAttr)

    override var state: ViewState? = ViewState.obtain(context, attrs)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    override val shape: ShapeModel?
        get() = shaper.shape

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (state?.isDefined() == true) {
            mergeDrawableStates(drawableState, state?.attr)
        }
        return drawableState
    }
}
