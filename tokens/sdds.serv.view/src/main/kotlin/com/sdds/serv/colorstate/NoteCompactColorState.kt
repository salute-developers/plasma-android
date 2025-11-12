// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.serv.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента NoteCompact
 */
public enum class NoteCompactColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_notecompact_state_default)),
    POSITIVE(intArrayOf(R.attr.serv_notecompact_state_positive)),
    NEGATIVE(intArrayOf(R.attr.serv_notecompact_state_negative)),
    WARNING(intArrayOf(R.attr.serv_notecompact_state_warning)),
    INFO(intArrayOf(R.attr.serv_notecompact_state_info)),
}

/**
 * Реализация [ColorStateProvider] для NoteCompactColorState
 */
@Keep
internal class NoteCompactColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): NoteCompactColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.NoteCompact,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.NoteCompact_serv_notecompactColors, 0)
        typedArray.recycle()
        return NoteCompactColorState.values().getOrNull(stateOrdinal)
    }
}
