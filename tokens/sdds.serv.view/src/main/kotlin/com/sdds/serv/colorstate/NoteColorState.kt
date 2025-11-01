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
 * Реализация [ColorState] для компонента Note
 */
public enum class NoteColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_note_state_default)),
    POSITIVE(intArrayOf(R.attr.serv_note_state_positive)),
    NEGATIVE(intArrayOf(R.attr.serv_note_state_negative)),
    WARNING(intArrayOf(R.attr.serv_note_state_warning)),
    INFO(intArrayOf(R.attr.serv_note_state_info)),
}

/**
 * Реализация [ColorStateProvider] для NoteColorState
 */
@Keep
internal class NoteColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): NoteColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Note,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Note_serv_noteColors, 0)
        typedArray.recycle()
        return NoteColorState.values().getOrNull(stateOrdinal)
    }
}
