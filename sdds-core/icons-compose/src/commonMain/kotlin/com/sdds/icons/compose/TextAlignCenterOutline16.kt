package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TextAlignCenterOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TextAlignCenterOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 11.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 8.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.0 7.5 C 4.724 7.5 4.5 7.724 4.5 8.0 S 4.724 8.5 5.0 8.5 h 6.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 11.276 7.5 11.0 7.5 H 5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 3.5 C 2.724 3.5 2.5 3.724 2.5 4.0 S 2.724 4.5 3.0 4.5 h 10.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 13.276 3.5 13.0 3.5 H 3.0 Z")
        )
    }.build()
}
