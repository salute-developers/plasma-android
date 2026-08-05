package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoOffFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoOffFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.854 2.854 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 c -0.196 -0.195 -0.512 -0.195 -0.708 0.0 L 10.542 4.75 C 10.2 4.143 9.549 3.733 8.8 3.733 H 3.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 v 4.5 c 0.0 1.104 0.895 2.0 2.0 2.0 h 0.06 l -1.414 1.413 c -0.195 0.196 -0.195 0.512 0.0 0.708 c 0.196 0.195 0.512 0.195 0.708 0.0 l 11.5 -11.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.8 12.233 H 5.762 L 10.8 7.195 v 3.038 c 0.0 1.104 -0.895 2.0 -2.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.0 5.623 c 0.0 -0.596 -0.722 -0.893 -1.14 -0.469 l -2.264 2.29 c -0.25 0.253 -0.257 0.657 -0.017 0.92 l 2.263 2.468 C 14.253 11.28 15.0 10.989 15.0 10.382 v -4.76 Z")
        )
    }.build()
}
