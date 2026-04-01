package com.sdds.uikit.fixtures.samples.accordion

import android.content.Context
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.accordion.accordion

@DocSample
fun Accordion_Simple(context: Context): View {
    return accordion(
        context,
    ).apply { id = R.id.accordion }
}
