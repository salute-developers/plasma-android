package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 2.5 2.25 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 10.0 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 3.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.563 3.7 h -9.1 c -1.0 0.0 -1.7 0.844 -1.7 1.747 v 1.306 C 1.763 7.221 1.95 7.673 2.27 8.0 C 1.95 8.327 1.76 8.779 1.76 9.247 v 1.306 c 0.0 0.903 0.702 1.747 1.7 1.747 h 9.1 c 1.0 0.0 1.7 -0.844 1.7 -1.747 V 9.247 c 0.0 -0.468 -0.187 -0.92 -0.507 -1.247 c 0.32 -0.327 0.509 -0.779 0.509 -1.247 V 5.447 c 0.0 -0.903 -0.702 -1.747 -1.7 -1.747 Z m -9.8 1.747 c 0.0 -0.413 0.313 -0.747 0.7 -0.747 h 9.1 c 0.386 0.0 0.7 0.334 0.7 0.747 v 1.306 c 0.0 0.413 -0.314 0.747 -0.7 0.747 h -9.1 c -0.387 0.0 -0.7 -0.334 -0.7 -0.747 V 5.447 Z m -0.001 3.8 c 0.0 -0.413 0.313 -0.747 0.7 -0.747 h 9.1 c 0.386 0.0 0.7 0.334 0.7 0.747 v 1.306 c 0.0 0.413 -0.314 0.747 -0.7 0.747 h -9.1 c -0.387 0.0 -0.7 -0.334 -0.7 -0.747 V 9.247 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 3.0 13.3 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 10.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 3.0 Z")
        )
    }.build()
}
