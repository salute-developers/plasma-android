package com.sdds.testing.vs.divider

import android.content.Context
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Divider

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
