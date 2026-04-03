package com.sdds.uikit.fixtures.samples.tabs

import android.content.Context
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.tabs.DisplayMode
import com.sdds.uikit.fixtures.stories.tabs.TabItemIcon
import com.sdds.uikit.fixtures.stories.tabs.TabsUiState
import com.sdds.uikit.fixtures.stories.tabs.tabs

@DocSample
fun Tabs_Simple(context: Context): View {
    return tabs(
        context = context,
        state = TabsUiState(
            variant = "",
            amount = 3,
            icon = TabItemIcon.End,
            tabItemLabel = "Label",
            tabItemValue = "",
            enabled = true,
            displayMode = DisplayMode.SCROLL,
            counter = false,
            count = "123",
            actionEnabled = true,
            dividerEnabled = true,
            indicatorEnabled = true,
        ),
    ).apply {
        id = R.id.tabs
    }
}
