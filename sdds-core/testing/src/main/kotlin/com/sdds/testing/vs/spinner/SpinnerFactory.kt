package com.sdds.testing.vs.spinner

import android.content.Context
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Spinner

/**
 * Фабрика для создания [Spinner]
 */
fun spinner(
    context: Context,
    style: Int? = null,
): Spinner {
    return Spinner(context.styleWrapper(style))
        .apply { id = R.id.spinner }
}
