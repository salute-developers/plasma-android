package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder

/**
 * Компонент-заглушка с эффектом мерцания.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 30.05.2025
 */
open class RectSkeleton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_rectSkeletonStyle,
    defStyleRes: Int = R.style.Sdds_Components_RectSkeleton,
) : ShimmerLayout(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder {

    /**
     * Состояние внешнего вида компонента [RectSkeleton]
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }
}
