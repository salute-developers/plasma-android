package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BirrFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BirrFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.75 10.5 v -2.0 h 1.232 c 0.547 0.0 0.993 0.44 1.0 0.988 c 0.006 0.557 -0.443 1.012 -1.0 1.012 H 5.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.278 7.5 H 5.75 v -2.0 h 0.528 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 5.25 4.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 6.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 1.732 c 1.114 0.0 2.013 -0.91 2.0 -2.024 c -0.01 -0.776 -0.46 -1.444 -1.11 -1.768 C 8.127 7.373 8.278 6.954 8.278 6.5 c 0.0 -1.105 -0.896 -2.0 -2.0 -2.0 H 5.25 Z m 6.5 3.824 c -0.721 0.0 -1.306 0.584 -1.306 1.305 V 11.0 c 0.0 0.276 -0.223 0.5 -0.5 0.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 9.63 V 9.587 v -1.94 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 c 0.277 0.0 0.5 0.223 0.5 0.5 v 0.08 c 0.372 -0.255 0.821 -0.404 1.306 -0.404 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 Z")
        )
    }.build()
}
