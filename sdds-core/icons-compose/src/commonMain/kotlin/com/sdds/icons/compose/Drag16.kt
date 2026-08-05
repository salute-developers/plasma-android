package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Drag16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Drag16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.75 2.57 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 c 0.0 -0.829 0.672 -1.5 1.5 -1.5 s 1.5 0.671 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.25 2.57 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 c 0.0 -0.829 0.672 -1.5 1.5 -1.5 s 1.5 0.671 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.75 7.995 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 c 0.0 -0.829 0.672 -1.5 1.5 -1.5 s 1.5 0.671 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.25 7.995 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 c 0.0 -0.829 0.672 -1.5 1.5 -1.5 s 1.5 0.671 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.75 13.42 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 c 0.0 -0.829 0.672 -1.5 1.5 -1.5 s 1.5 0.671 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.25 13.42 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 c 0.0 -0.829 0.672 -1.5 1.5 -1.5 s 1.5 0.671 1.5 1.5 Z")
        )
    }.build()
}
