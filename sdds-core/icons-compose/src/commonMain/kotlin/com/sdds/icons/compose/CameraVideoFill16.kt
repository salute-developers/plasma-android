package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 3.733 c -1.105 0.0 -2.0 0.895 -2.0 2.0 v 4.5 c 0.0 1.104 0.895 2.0 2.0 2.0 h 5.8 c 1.105 0.0 2.0 -0.896 2.0 -2.0 v -4.5 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 H 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.0 5.623 c 0.0 -0.596 -0.722 -0.893 -1.14 -0.469 l -2.264 2.29 c -0.25 0.253 -0.257 0.657 -0.017 0.92 l 2.263 2.468 C 14.253 11.28 15.0 10.989 15.0 10.382 v -4.76 Z")
        )
    }.build()
}
