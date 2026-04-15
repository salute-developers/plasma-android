package com.sdds.uikit.fixtures.samples.list

import android.content.Context
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.list.ListUiState
import com.sdds.uikit.fixtures.stories.list.listView

@DocSample
fun List_Simple(context: Context): View {
    return listView(
        context,
        state = ListUiState(
            variant = "",
            amount = 5,
            itemTitle = "Title",
            hasDisclosure = true,
        ),
    ).apply {
        id = R.id.list_view
    }
}
