// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.plasma.sd.service.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента NotificationContent
 */
public enum class NotificationContentColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.plasma_notificationcontent_state_default)),
    POSITIVE(intArrayOf(R.attr.plasma_notificationcontent_state_positive)),
    NEGATIVE(intArrayOf(R.attr.plasma_notificationcontent_state_negative)),
    WARNING(intArrayOf(R.attr.plasma_notificationcontent_state_warning)),
    INFO(intArrayOf(R.attr.plasma_notificationcontent_state_info)),
}

/**
 * Реализация [ColorStateProvider] для NotificationContentColorState
 */
@Keep
internal class NotificationContentColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): NotificationContentColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.NotificationContent,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int =
            typedArray.getInt(
                R.styleable.NotificationContent_plasma_notificationcontentColors,
                0,
            )
        typedArray.recycle()
        return NotificationContentColorState.values().getOrNull(stateOrdinal)
    }
}
