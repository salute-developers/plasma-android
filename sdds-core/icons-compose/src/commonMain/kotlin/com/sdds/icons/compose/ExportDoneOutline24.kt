package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ExportDoneOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ExportDoneOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 12.0 c 3.038 0.0 5.5 2.463 5.5 5.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 c -3.037 0.0 -5.5 -2.462 -5.5 -5.5 c 0.0 -3.037 2.462 -5.5 5.5 -5.5 Z m 3.354 3.647 c -0.196 -0.195 -0.512 -0.195 -0.707 0.0 L 16.5 19.293 l -1.646 -1.646 c -0.196 -0.195 -0.512 -0.195 -0.707 0.0 c -0.196 0.195 -0.196 0.512 0.0 0.707 l 2.0 2.0 c 0.195 0.195 0.511 0.195 0.707 0.0 l 4.0 -4.0 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.5 15.25 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 c 0.0 1.243 1.008 2.25 2.25 2.25 h 6.372 c 0.323 0.558 0.726 1.063 1.193 1.5 H 5.5 c -2.07 0.0 -3.75 -1.679 -3.75 -3.75 V 16.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.357 3.008 c 0.352 -0.351 0.921 -0.351 1.273 0.0 l 4.727 4.728 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -3.505 -3.505 v 7.729 c -0.68 0.714 -1.2 1.582 -1.5 2.548 V 5.195 L 7.69 8.796 c -0.292 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 4.727 -4.728 Z")
        )
    }.build()
}
