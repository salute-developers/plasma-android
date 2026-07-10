package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SearchFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SearchFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.596 14.535 C 16.475 13.427 17.0 12.025 17.0 10.5 C 17.0 6.91 14.09 4.0 10.5 4.0 S 4.0 6.91 4.0 10.5 S 6.91 17.0 10.5 17.0 c 1.525 0.0 2.927 -0.525 4.035 -1.404 l 5.435 5.434 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -5.434 -5.435 Z")
        )
    }.build()
}
