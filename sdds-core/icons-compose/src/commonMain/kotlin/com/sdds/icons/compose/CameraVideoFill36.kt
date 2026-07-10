package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.286 9.0 C 4.919 9.0 3.0 10.919 3.0 13.286 v 9.428 C 3.0 25.081 4.919 27.0 7.286 27.0 h 12.429 C 22.08 27.0 24.0 25.081 24.0 22.714 v -9.428 C 24.0 10.919 22.081 9.0 19.715 9.0 H 7.285 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 33.0 13.199 c 0.0 -1.273 -1.538 -1.91 -2.439 -1.01 l -4.838 4.838 c -0.543 0.543 -0.56 1.419 -0.037 1.982 l 4.838 5.215 C 31.408 25.176 33.0 24.551 33.0 23.253 V 13.199 Z")
        )
    }.build()
}
