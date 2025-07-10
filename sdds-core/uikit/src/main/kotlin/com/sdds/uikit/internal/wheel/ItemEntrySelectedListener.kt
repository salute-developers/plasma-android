package com.sdds.uikit.internal.wheel

import com.sdds.uikit.Wheel.WheelItemEntry

internal fun interface ItemEntrySelectedListener {

    fun onEntrySelected(entry: WheelItemEntry)
}
