package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TextAlignLeftOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TextAlignLeftOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 11.5 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 3.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 10.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 7.5 c 0.276 0.0 0.5 0.224 0.5 0.5 S 9.276 8.5 9.0 8.5 H 3.0 C 2.724 8.5 2.5 8.276 2.5 8.0 S 2.724 7.5 3.0 7.5 h 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 3.5 c 0.276 0.0 0.5 0.224 0.5 0.5 S 13.276 4.5 13.0 4.5 H 3.0 C 2.724 4.5 2.5 4.276 2.5 4.0 S 2.724 3.5 3.0 3.5 h 10.0 Z")
        )
    }.build()
}
