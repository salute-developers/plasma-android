package com.sdds.uikit.fixtures.stories.divider

import android.content.Context
import com.sdds.uikit.Divider
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.styleWrapper

/**
 * Фабрика для создания [Divider]
 */
fun divider(
    context: Context,
    style: Int? = null,
): Divider {
    return Divider(context.styleWrapper(style))
        .apply { id = R.id.divider }
}
