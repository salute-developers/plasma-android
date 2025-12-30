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
 * Реализация [ColorState] для компонента File
 */
public enum class FileColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_file_state_default)),
    NEGATIVE(intArrayOf(R.attr.serv_file_state_negative)),
}

/**
 * Реализация [ColorStateProvider] для FileColorState
 */
@Keep
internal class FileColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): FileColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.File,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.File_serv_fileColors, 0)
        typedArray.recycle()
        return FileColorState.values().getOrNull(stateOrdinal)
    }
}
