package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SearchFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SearchFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.0 15.5 C 5.0 9.701 9.701 5.0 15.5 5.0 S 26.0 9.701 26.0 15.5 c 0.0 2.54 -0.901 4.868 -2.402 6.684 l 7.86 7.859 c 0.39 0.39 0.39 1.024 0.0 1.414 c -0.391 0.39 -1.025 0.39 -1.415 0.0 l -7.859 -7.859 C 20.368 25.098 18.039 26.0 15.5 26.0 C 9.701 26.0 5.0 21.299 5.0 15.5 Z")
        )
    }.build()
}
