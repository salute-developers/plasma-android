package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Formaldehyde16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Formaldehyde16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 8.35 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.6 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -2.3 H 4.0 v 2.3 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 3.0 14.726 3.0 14.45 v -5.6 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 S 4.0 8.575 4.0 8.85 v 2.3 h 2.5 v -2.3 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.85 8.35 c 1.243 0.0 2.25 1.008 2.25 2.25 v 2.1 c 0.0 1.242 -1.007 2.25 -2.25 2.25 c -1.242 0.0 -2.25 -1.007 -2.25 -2.25 v -2.1 c 0.0 -1.242 1.008 -2.25 2.25 -2.25 Z m 0.0 1.0 c -0.69 0.0 -1.25 0.56 -1.25 1.25 v 2.1 c 0.0 0.69 0.56 1.25 1.25 1.25 s 1.25 -0.56 1.25 -1.25 v -2.1 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 1.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.6 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 6.5 7.376 6.5 7.1 V 4.8 H 4.0 v 2.3 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 3.0 7.376 3.0 7.1 V 1.5 C 3.0 1.224 3.224 1.0 3.5 1.0 S 4.0 1.224 4.0 1.5 v 2.3 h 2.5 V 1.5 C 6.5 1.224 6.724 1.0 7.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.2 1.0 c 1.05 0.0 1.9 0.851 1.9 1.9 c 0.0 0.276 -0.224 0.5 -0.5 0.5 c -0.275 0.0 -0.5 -0.224 -0.5 -0.5 c 0.0 -0.496 -0.403 -0.9 -0.9 -0.9 h -0.35 C 10.16 2.0 9.6 2.56 9.6 3.25 v 2.1 c 0.0 0.69 0.56 1.25 1.25 1.25 h 0.35 c 0.497 0.0 0.9 -0.403 0.9 -0.9 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 0.277 0.0 0.5 0.224 0.5 0.5 c 0.0 1.05 -0.85 1.9 -1.9 1.9 h -0.35 C 9.609 7.6 8.6 6.592 8.6 5.35 v -2.1 C 8.6 2.007 9.609 1.0 10.85 1.0 h 0.35 Z")
        )
    }.build()
}
