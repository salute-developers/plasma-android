package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BirrOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BirrOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.25 4.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 6.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 1.732 c 1.114 0.0 2.013 -0.91 2.0 -2.024 c -0.01 -0.775 -0.46 -1.444 -1.11 -1.767 C 8.127 7.373 8.278 6.954 8.278 6.5 c 0.0 -1.104 -0.896 -2.0 -2.0 -2.0 H 5.25 Z m 0.5 6.0 v -2.0 h 1.232 c 0.547 0.0 0.993 0.44 1.0 0.988 c 0.006 0.557 -0.443 1.012 -1.0 1.012 H 5.75 Z m 0.528 -3.0 H 5.75 v -2.0 h 0.528 c 0.552 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.448 1.0 -1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.75 8.324 c -0.721 0.0 -1.306 0.584 -1.306 1.305 V 11.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 9.63 V 9.587 v -1.94 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 s 0.5 0.223 0.5 0.5 v 0.08 c 0.371 -0.255 0.821 -0.404 1.306 -0.404 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.998 1.0 C 4.133 1.0 1.0 4.133 1.0 7.998 s 3.133 6.999 6.998 6.999 s 6.998 -3.133 6.998 -6.999 C 14.996 4.133 11.863 1.0 7.998 1.0 Z M 2.0 7.998 C 2.0 4.686 4.685 2.0 7.998 2.0 s 5.998 2.686 5.998 5.998 c 0.0 3.313 -2.685 5.999 -5.998 5.999 S 2.0 11.31 2.0 7.998 Z")
        )
    }.build()
}
