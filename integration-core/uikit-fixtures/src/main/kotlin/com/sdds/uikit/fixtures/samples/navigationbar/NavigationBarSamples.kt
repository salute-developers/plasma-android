package com.sdds.uikit.fixtures.samples.navigationbar

import android.content.Context
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.navigationbar.AlignmentStrategy
import com.sdds.uikit.fixtures.stories.navigationbar.ContentBetweenActionsAlignment
import com.sdds.uikit.fixtures.stories.navigationbar.ContentPlacement
import com.sdds.uikit.fixtures.stories.navigationbar.NavigationBarUiState
import com.sdds.uikit.fixtures.stories.navigationbar.TextAlignment
import com.sdds.uikit.fixtures.stories.navigationbar.TextPlacement
import com.sdds.uikit.fixtures.stories.navigationbar.navigationBar

@DocSample
fun NavigationBar_Simple(context: Context): View {
    return navigationBar(
        context,
        state = NavigationBarUiState(
            title = "Title",
            description = "",
            contentText = "Content",
            hasActionStart = true,
            hasActionEnd = true,
            textPlacement = TextPlacement.Inner,
            contentPlacement = ContentPlacement.Inner,
            textAlign = TextAlignment.Center,
            contentBetweenActionsAlignment = ContentBetweenActionsAlignment.Center,
            centerAlignmentStrategy = AlignmentStrategy.Absolute,
        ),
    ).apply {
        id = R.id.navigation_bar
    }
}
