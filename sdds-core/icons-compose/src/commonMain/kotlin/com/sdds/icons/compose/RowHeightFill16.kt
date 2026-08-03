package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 2.5 2.2 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 10.0 c 0.276 0.0 0.5 0.224 0.5 0.5 S 13.276 2.7 13.0 2.7 H 3.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 2.74 3.64 c -0.58 0.0 -1.05 0.47 -1.05 1.05 v 1.9 c 0.0 0.58 0.47 1.05 1.05 1.05 h 10.5 c 0.58 0.0 1.05 -0.47 1.05 -1.05 v -1.9 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 H 2.74 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 2.792 8.34 c -0.58 0.0 -1.05 0.47 -1.05 1.05 v 1.9 c 0.0 0.58 0.47 1.05 1.05 1.05 h 10.5 c 0.58 0.0 1.05 -0.47 1.05 -1.05 v -1.9 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 h -10.5 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 2.5 13.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 10.0 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 3.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
