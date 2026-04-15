package com.sdds.uikit.fixtures.stories.spinner

import android.content.Context
import com.sdds.uikit.Spinner
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.styleWrapper

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
