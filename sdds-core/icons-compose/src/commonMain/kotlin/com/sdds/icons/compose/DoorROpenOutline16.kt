package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorROpenOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorROpenOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.385 8.7 c -0.38 0.0 -0.689 -0.313 -0.689 -0.7 c 0.0 -0.385 0.308 -0.698 0.689 -0.698 c 0.38 0.0 0.689 0.313 0.689 0.699 c 0.0 0.386 -0.308 0.698 -0.689 0.698 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.497 0.8 C 6.73 0.573 5.96 1.15 5.96 1.95 v 0.113 H 3.705 C 3.039 2.063 2.5 2.611 2.5 3.286 v 9.43 c 0.0 0.675 0.54 1.223 1.205 1.223 h 2.254 v 0.112 c 0.0 0.801 0.77 1.377 1.538 1.152 l 5.142 -1.51 c 0.51 -0.15 0.861 -0.619 0.861 -1.151 V 3.46 c 0.0 -0.533 -0.35 -1.002 -0.861 -1.152 L 7.497 0.8 Z M 6.96 1.95 v 0.113 h 0.017 v 11.875 H 6.959 v 0.113 c 0.0 0.134 0.128 0.23 0.257 0.192 l 5.14 -1.51 c 0.086 -0.024 0.144 -0.103 0.144 -0.191 V 3.46 c 0.0 -0.09 -0.058 -0.167 -0.143 -0.192 l -5.141 -1.51 C 7.087 1.72 6.959 1.817 6.959 1.95 Z")
        )
    }.build()
}
