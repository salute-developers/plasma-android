package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SafeDiagramFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SafeDiagramFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.95 5.252 C 4.5 6.135 4.5 7.29 4.5 9.6 v 13.913 c 0.0 2.31 0.0 3.465 0.45 4.348 c 0.395 0.776 1.026 1.407 1.802 1.802 c 0.26 0.133 0.543 0.226 0.873 0.292 v 2.04 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 v -1.888 c 0.433 0.006 0.921 0.006 1.475 0.006 h 13.8 c 0.554 0.0 1.042 0.0 1.475 -0.006 v 1.888 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 v -2.04 c 0.33 -0.066 0.613 -0.16 0.873 -0.292 c 0.776 -0.395 1.407 -1.026 1.802 -1.802 c 0.45 -0.883 0.45 -2.038 0.45 -4.348 V 9.6 c 0.0 -2.31 0.0 -3.465 -0.45 -4.348 c -0.395 -0.776 -1.026 -1.407 -1.802 -1.802 C 28.365 3.0 27.21 3.0 24.9 3.0 H 11.1 C 8.79 3.0 7.635 3.0 6.752 3.45 C 5.976 3.845 5.345 4.476 4.95 5.252 Z m 21.259 8.998 c 0.39 -0.392 0.388 -1.025 -0.003 -1.415 c -0.392 -0.39 -1.025 -0.388 -1.415 0.003 L 19.5 18.152 l -3.791 -3.807 C 15.52 14.156 15.266 14.05 15.0 14.05 c -0.266 0.0 -0.52 0.106 -0.709 0.295 l -4.5 4.518 c -0.39 0.392 -0.388 1.025 0.003 1.415 c 0.392 0.39 1.025 0.388 1.415 -0.003 L 15.0 16.467 l 3.791 3.808 c 0.188 0.188 0.443 0.294 0.709 0.294 c 0.266 0.0 0.52 -0.106 0.709 -0.294 l 6.0 -6.025 Z")
        )
    }.build()
}
