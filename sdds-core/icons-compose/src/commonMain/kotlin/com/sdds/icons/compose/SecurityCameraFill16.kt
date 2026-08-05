package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SecurityCameraFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SecurityCameraFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.249 2.5 c -0.87 0.0 -1.575 0.705 -1.575 1.575 v 3.736 c 0.0 0.87 0.705 1.575 1.575 1.575 h 4.248 v 1.362 c 0.0 0.304 -0.246 0.55 -0.55 0.55 H 2.0 V 10.59 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 1.0 10.314 1.0 10.59 V 13.0 c 0.0 0.276 0.224 0.5 0.5 0.5 S 2.0 13.276 2.0 13.0 v -0.702 h 4.947 c 0.856 0.0 1.55 -0.694 1.55 -1.55 V 9.386 h 2.843 c 0.87 0.0 1.575 -0.705 1.575 -1.575 V 4.075 c 0.0 -0.87 -0.705 -1.575 -1.575 -1.575 H 3.25 Z m 11.513 1.47 c 0.146 0.09 0.236 0.251 0.236 0.424 v 3.098 c 0.0 0.173 -0.09 0.333 -0.236 0.424 c -0.146 0.092 -0.33 0.101 -0.485 0.025 l -0.35 -0.172 c -0.172 -0.084 -0.28 -0.258 -0.28 -0.449 V 4.566 c 0.0 -0.191 0.108 -0.365 0.28 -0.45 l 0.35 -0.171 c 0.155 -0.076 0.339 -0.067 0.485 0.024 Z M 4.309 4.581 c -0.277 0.0 -0.5 0.224 -0.5 0.5 s 0.223 0.5 0.5 0.5 h 2.459 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -2.46 Z")
        )
    }.build()
}
