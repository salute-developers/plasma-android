package com.sdds.uikit.fixtures.stories.indicator

import android.content.Context
import com.sdds.uikit.Indicator
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.styleWrapper

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
