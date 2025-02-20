package com.sdds.testing.vs.indicator

import android.content.Context
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Indicator

/**
 * Фабрика для создания [Indicator]
 */
fun indicator(
    context: Context,
    style: Int? = null,
): Indicator {
    return Indicator(context.styleWrapper(style))
        .apply { id = R.id.indicator }
}
