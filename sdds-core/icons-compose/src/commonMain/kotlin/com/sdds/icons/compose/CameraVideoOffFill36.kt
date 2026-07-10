package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoOffFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoOffFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.706 6.708 c 0.391 -0.39 0.392 -1.024 0.002 -1.414 c -0.39 -0.391 -1.024 -0.392 -1.414 -0.002 l -5.866 5.855 c -0.74 -1.283 -2.126 -2.146 -3.713 -2.146 H 7.285 C 4.92 9.001 3.0 10.921 3.0 13.287 v 9.429 C 3.0 25.083 4.919 27.0 7.286 27.0 h 0.26 l -3.252 3.247 c -0.391 0.39 -0.392 1.023 -0.002 1.414 s 1.024 0.392 1.415 0.002 l 25.0 -24.956 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.715 27.001 h -7.021 L 24.0 15.823 v 6.893 C 24.0 25.083 22.081 27.0 19.715 27.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 33.0 13.2 c 0.0 -1.272 -1.538 -1.91 -2.439 -1.01 l -4.838 4.838 c -0.543 0.544 -0.56 1.42 -0.037 1.982 l 4.838 5.216 C 31.408 25.178 33.0 24.553 33.0 23.254 V 13.2 Z")
        )
    }.build()
}
