package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HummerFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HummerFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.641 18.642 l -2.07 -2.113 L 5.625 27.707 c -0.572 0.584 -0.572 1.53 0.0 2.114 c 0.572 0.583 1.498 0.583 2.07 0.0 L 18.64 18.642 Z m -2.846 -4.49 L 4.072 26.122 c -1.43 1.46 -1.43 3.825 0.0 5.284 c 1.429 1.459 3.745 1.459 5.174 0.0 L 20.97 19.435 c 0.317 -0.323 0.42 -0.427 0.506 -0.5 c 0.945 -0.792 2.307 -0.792 3.252 0.0 c 0.086 0.073 0.19 0.177 0.506 0.5 l 1.501 1.532 c 0.206 0.21 0.485 0.329 0.776 0.329 c 0.291 0.0 0.57 -0.119 0.776 -0.329 l 4.392 -4.483 c 0.428 -0.438 0.428 -1.148 0.0 -1.585 l -9.513 -9.713 c -2.854 -2.914 -7.48 -2.915 -10.335 0.0 c -0.206 0.21 -0.321 0.495 -0.321 0.792 c 0.0 0.297 0.115 0.582 0.321 0.792 l 2.964 3.027 c 0.317 0.323 0.419 0.429 0.49 0.517 c 0.776 0.965 0.776 2.356 0.0 3.32 c -0.071 0.089 -0.173 0.194 -0.49 0.518 Z")
        )
    }.build()
}
