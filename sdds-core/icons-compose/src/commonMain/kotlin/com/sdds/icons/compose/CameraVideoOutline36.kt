package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 13.138 C 3.0 10.853 4.853 9.0 7.138 9.0 h 12.414 c 2.285 0.0 4.138 1.853 4.138 4.138 v 9.724 c 0.0 2.285 -1.853 4.138 -4.138 4.138 H 7.138 C 4.853 27.0 3.0 25.147 3.0 22.862 v -9.724 Z M 7.138 11.0 h 12.414 c 1.18 0.0 2.138 0.957 2.138 2.138 v 9.724 c 0.0 1.18 -0.957 2.138 -2.138 2.138 H 7.138 C 5.958 25.0 5.0 24.043 5.0 22.862 v -9.724 C 5.0 11.958 5.957 11.0 7.138 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 33.0 13.199 c 0.0 -1.273 -1.538 -1.91 -2.438 -1.01 l -4.839 4.838 c -0.543 0.543 -0.56 1.419 -0.037 1.982 l 4.838 5.215 C 31.409 25.176 33.0 24.551 33.0 23.253 V 13.199 Z")
        )
    }.build()
}
