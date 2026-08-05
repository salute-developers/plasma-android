package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SizeExpand36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SizeExpand36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 30.5 c 0.0 0.552 0.448 1.0 1.0 1.0 h 6.06 c 0.553 0.0 1.0 -0.448 1.0 -1.0 s -0.447 -1.0 -1.0 -1.0 H 7.915 l 5.111 -5.111 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 L 6.5 28.085 V 24.44 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 V 30.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 5.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 6.06 c 0.553 0.0 1.0 0.448 1.0 1.0 s -0.447 1.0 -1.0 1.0 H 7.915 l 5.111 5.111 c 0.39 0.39 0.39 1.024 0.0 1.414 c -0.39 0.39 -1.023 0.39 -1.414 0.0 L 6.5 7.915 v 3.646 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 5.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.5 5.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -6.06 c -0.553 0.0 -1.0 0.448 -1.0 1.0 s 0.447 1.0 1.0 1.0 h 3.646 l -5.111 5.111 c -0.39 0.39 -0.39 1.024 0.0 1.414 c 0.39 0.39 1.023 0.39 1.414 0.0 l 5.111 -5.11 v 3.646 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 5.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.5 30.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -6.06 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 s 0.447 -1.0 1.0 -1.0 h 3.646 l -5.111 -5.111 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 c 0.39 -0.39 1.023 -0.39 1.414 0.0 l 5.111 5.11 V 24.44 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 V 30.5 Z")
        )
    }.build()
}
