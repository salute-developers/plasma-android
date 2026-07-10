package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbBoxTopOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbBoxTopOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.975 23.5 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -18.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 s 0.447 -1.0 1.0 -1.0 h 18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.975 14.75 c 1.035 0.0 1.875 0.84 1.875 1.875 c 0.0 1.035 -0.84 1.875 -1.875 1.875 c -1.036 0.0 -1.875 -0.84 -1.875 -1.875 c 0.0 -1.035 0.84 -1.875 1.875 -1.875 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.85 11.5 c 1.38 0.0 2.5 1.12 2.5 2.5 v 5.25 c 0.0 1.38 -1.12 2.5 -2.5 2.5 H 4.1 c -1.38 0.0 -2.5 -1.12 -2.5 -2.5 V 14.0 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 h 27.75 Z m -27.75 2.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 5.25 c 0.0 0.276 0.224 0.5 0.5 0.5 h 2.125 V 13.5 H 4.1 Z m 25.875 6.25 h 1.875 c 0.276 0.0 0.5 -0.224 0.5 -0.5 V 14.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -1.875 v 6.25 Z m -21.75 0.0 h 19.75 V 13.5 H 8.225 v 6.25 Z")
        )
    }.build()
}
