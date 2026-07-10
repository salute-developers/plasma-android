package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BackwardFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BackwardFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.367 3.349 c -0.148 -0.173 -0.316 -0.377 -0.715 -0.346 C 9.307 3.03 9.05 3.23 8.908 3.35 C 8.752 3.48 8.57 3.66 8.376 3.856 L 2.22 10.012 c -0.293 0.293 -0.293 0.768 0.0 1.06 l 6.156 6.157 c 0.195 0.195 0.376 0.376 0.532 0.506 c 0.143 0.12 0.4 0.32 0.744 0.346 c 0.348 0.012 0.641 -0.348 0.748 -0.488 c 0.107 -0.14 0.232 -0.588 0.249 -0.773 c 0.018 -0.203 0.018 -0.459 0.018 -0.735 v -2.419 v -0.04 l 0.03 0.001 c 2.957 0.089 5.081 0.363 6.384 1.229 c 1.31 0.871 2.195 2.052 3.293 3.519 c 0.0 0.0 0.08 0.114 0.126 0.218 c 0.453 1.0 1.5 1.15 1.5 0.3 v -0.226 c 0.0 -6.25 -5.168 -10.884 -11.333 -11.335 V 4.854 c 0.0 -0.276 0.0 -0.532 -0.018 -0.734 c -0.017 -0.186 -0.057 -0.509 -0.282 -0.771 Z")
        )
    }.build()
}
