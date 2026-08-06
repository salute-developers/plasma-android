package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScreenShareUnpinOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScreenShareUnpinOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z m 1.693 2.057 c -0.136 -0.137 -0.358 -0.138 -0.495 -0.001 L 12.0 11.505 l -1.2 -1.2 c -0.136 -0.136 -0.357 -0.135 -0.493 0.0 c -0.137 0.137 -0.138 0.36 -0.001 0.496 L 11.505 12.0 l -1.2 1.2 c -0.136 0.136 -0.135 0.358 0.002 0.494 c 0.136 0.136 0.357 0.137 0.494 0.0 L 12.0 12.495 l 1.198 1.2 c 0.137 0.136 0.359 0.135 0.495 -0.002 c 0.137 -0.136 0.137 -0.357 0.0 -0.494 L 12.495 12.0 l 1.198 -1.2 c 0.137 -0.136 0.137 -0.357 0.0 -0.493 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.26 2.5 c 0.384 0.0 0.702 0.0 0.96 0.02 c 0.265 0.022 0.511 0.069 0.743 0.187 c 0.357 0.182 0.648 0.473 0.83 0.83 c 0.118 0.232 0.165 0.478 0.187 0.742 C 15.0 4.538 15.0 4.856 15.0 5.24 v 3.406 c -0.3 -0.268 -0.636 -0.497 -1.0 -0.678 V 5.24 c 0.0 -0.4 0.0 -0.67 -0.018 -0.879 c -0.016 -0.202 -0.045 -0.302 -0.08 -0.37 c -0.086 -0.17 -0.224 -0.307 -0.393 -0.393 c -0.068 -0.035 -0.168 -0.064 -0.37 -0.08 C 12.93 3.5 12.66 3.5 12.259 3.5 H 3.74 c -0.4 0.0 -0.67 0.0 -0.879 0.018 c -0.202 0.016 -0.302 0.045 -0.37 0.08 c -0.17 0.086 -0.307 0.224 -0.393 0.393 c -0.035 0.068 -0.064 0.168 -0.08 0.37 C 2.0 4.57 2.0 4.84 2.0 5.241 v 5.519 c 0.0 0.4 0.0 0.67 0.018 0.879 c 0.016 0.202 0.045 0.302 0.08 0.37 c 0.086 0.17 0.224 0.307 0.393 0.393 c 0.068 0.035 0.168 0.064 0.37 0.08 C 3.07 12.5 3.34 12.5 3.741 12.5 h 3.787 c 0.039 0.347 0.117 0.681 0.23 1.0 H 3.74 c -0.384 0.0 -0.702 0.0 -0.96 -0.02 c -0.265 -0.022 -0.511 -0.069 -0.743 -0.187 c -0.357 -0.182 -0.648 -0.473 -0.83 -0.83 c -0.118 -0.232 -0.165 -0.478 -0.186 -0.742 C 0.999 11.462 1.0 11.144 1.0 10.76 V 5.24 c 0.0 -0.384 0.0 -0.702 0.02 -0.96 c 0.022 -0.265 0.069 -0.511 0.187 -0.743 c 0.182 -0.357 0.473 -0.648 0.83 -0.83 C 2.27 2.589 2.515 2.542 2.78 2.521 C 3.038 2.499 3.356 2.5 3.74 2.5 h 8.52 Z")
        )
    }.build()
}
