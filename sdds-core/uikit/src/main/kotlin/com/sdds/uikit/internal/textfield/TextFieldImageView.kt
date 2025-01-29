package com.sdds.uikit.internal.textfield

import android.content.Context
import android.util.AttributeSet
import com.sdds.uikit.ImageView
import com.sdds.uikit.R

/**
 * [ImageView] для [TextField]
 * @author Малышев Александр on 17.01.2025
 */
internal class TextFieldImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ImageView(context, attrs, defStyleAttr) {

    var isReadOnly: Boolean = false
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (isReadOnly) {
            mergeDrawableStates(drawableState, intArrayOf(R.attr.sd_state_readonly))
        }
        return drawableState
    }
}
