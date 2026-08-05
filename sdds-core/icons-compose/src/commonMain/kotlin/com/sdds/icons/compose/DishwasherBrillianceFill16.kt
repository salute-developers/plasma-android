package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherBrillianceFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherBrillianceFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.485 3.76 c 0.0 -1.274 1.081 -2.26 2.355 -2.26 s 2.356 0.986 2.356 2.26 h 3.686 c 0.303 0.0 0.549 0.233 0.549 0.52 c 0.0 0.287 -0.246 0.52 -0.55 0.52 h -0.915 v 4.01 L 12.72 8.098 c -0.386 -1.113 -2.048 -1.113 -2.435 0.0 L 9.9 9.208 c -0.11 0.315 -0.37 0.56 -0.7 0.664 l -1.173 0.366 c -1.175 0.366 -1.175 1.94 0.0 2.306 l 0.752 0.234 H 6.17 c -0.493 0.0 -0.897 0.0 -1.224 -0.025 c -0.34 -0.026 -0.646 -0.082 -0.932 -0.22 c -0.448 -0.217 -0.812 -0.562 -1.04 -0.986 c -0.146 -0.27 -0.205 -0.561 -0.233 -0.883 c -0.026 -0.31 -0.026 -0.692 -0.026 -1.16 V 4.8 H 1.799 C 1.496 4.8 1.25 4.567 1.25 4.28 c 0.0 -0.287 0.246 -0.52 0.55 -0.52 h 3.685 Z m 1.05 0.0 c 0.0 -0.642 0.558 -1.21 1.305 -1.21 c 0.748 0.0 1.306 0.568 1.306 1.21 H 6.535 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.667 8.398 c -0.054 -0.157 -0.276 -0.157 -0.33 0.0 l -0.394 1.133 c -0.218 0.63 -0.723 1.118 -1.36 1.316 l -1.206 0.377 c -0.164 0.05 -0.164 0.283 0.0 0.334 l 1.207 0.376 c 0.636 0.198 1.14 0.687 1.359 1.316 l 0.393 1.133 c 0.055 0.157 0.277 0.157 0.331 0.0 l 0.393 -1.133 c 0.219 -0.63 0.723 -1.118 1.36 -1.316 l 1.207 -0.376 c 0.164 -0.051 0.164 -0.284 0.0 -0.335 l -1.208 -0.376 c -0.636 -0.198 -1.14 -0.686 -1.359 -1.316 l -0.393 -1.133 Z")
        )
    }.build()
}
