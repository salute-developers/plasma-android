package com.sdds.uikit.fixtures.samples.autocomplete

import android.content.Context
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.autocomplete.autocomplete

@DocSample
fun Autocomplete_Simple(context: Context): View {
    return autocomplete(context).apply {
        id = R.id.autocomplete
    }
}
