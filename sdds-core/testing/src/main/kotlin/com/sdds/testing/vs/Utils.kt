package com.sdds.testing.vs

import android.content.Context
import com.sdds.testing.R
import com.sdds.uikit.colorFromAttr

internal fun Context.getTextColorPrimary(): Int {
    return colorFromAttr(R.attr.testingTextColorPrimary)
}
