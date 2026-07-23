package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StopFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StopFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.75 7.75 c 0.0 -1.4 0.0 -2.1 0.272 -2.635 c 0.24 -0.47 0.623 -0.853 1.093 -1.093 C 5.65 3.75 6.35 3.75 7.75 3.75 h 8.5 c 1.4 0.0 2.1 0.0 2.635 0.272 c 0.47 0.24 0.853 0.623 1.092 1.093 C 20.25 5.65 20.25 6.35 20.25 7.75 v 8.5 c 0.0 1.4 0.0 2.1 -0.273 2.635 c -0.24 0.47 -0.622 0.853 -1.092 1.092 c -0.535 0.273 -1.235 0.273 -2.635 0.273 h -8.5 c -1.4 0.0 -2.1 0.0 -2.635 -0.273 c -0.47 -0.24 -0.853 -0.622 -1.093 -1.092 C 3.75 18.35 3.75 17.65 3.75 16.25 v -8.5 Z")
        )
    }.build()
}
