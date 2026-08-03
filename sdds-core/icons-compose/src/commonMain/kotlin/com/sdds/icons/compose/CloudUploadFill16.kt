package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudUploadFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudUploadFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 7.892 c 0.0 -1.74 1.287 -3.2 3.027 -3.61 l 0.002 -0.008 C 4.057 4.272 4.085 4.267 4.113 4.26 c 0.726 -0.192 1.49 -0.189 2.214 0.01 c 0.724 0.2 1.38 0.587 1.9 1.121 c 0.194 0.198 0.51 0.202 0.708 0.01 c 0.198 -0.193 0.202 -0.51 0.01 -0.707 C 8.298 4.03 7.485 3.552 6.591 3.306 C 5.952 3.13 5.285 3.078 4.628 3.15 C 5.48 2.002 6.908 1.25 8.525 1.25 c 2.61 0.0 4.725 1.958 4.725 4.374 c 0.0 0.153 -0.008 0.304 -0.025 0.454 C 14.275 6.55 15.0 7.547 15.0 8.702 c 0.0 1.61 -1.41 2.915 -3.15 2.915 H 8.5 V 8.704 L 9.75 9.937 c 0.196 0.194 0.513 0.192 0.707 -0.005 c 0.194 -0.196 0.192 -0.513 -0.005 -0.707 l -2.1 -2.073 c -0.194 -0.193 -0.507 -0.193 -0.702 0.0 l -2.1 2.073 C 5.352 9.419 5.35 9.735 5.544 9.932 c 0.194 0.197 0.51 0.199 0.707 0.005 l 1.25 -1.233 v 2.913 h 1.0 L 8.5 11.625 v 2.623 L 8.0 14.25 H 7.5 v -2.624 v -0.008 H 5.025 C 2.802 11.617 1.0 9.95 1.0 7.893 Z m 7.0 6.357 h 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 H 8.0 Z")
        )
    }.build()
}
