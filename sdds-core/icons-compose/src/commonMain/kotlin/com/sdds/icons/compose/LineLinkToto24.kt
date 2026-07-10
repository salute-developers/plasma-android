package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LineLinkToto24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LineLinkToto24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.03 3.47 l 2.75 2.75 C 21.921 6.36 22.0 6.55 22.0 6.75 s -0.079 0.39 -0.22 0.53 l -2.75 2.75 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 1.47 -1.47 H 15.0 c -1.243 0.0 -2.25 1.007 -2.25 2.25 v 4.5 C 12.75 16.321 11.071 18.0 9.0 18.0 H 4.56 l 1.47 1.47 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -2.75 -2.75 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 2.75 -2.75 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 L 4.56 16.5 H 9.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 v -4.5 C 11.25 7.679 12.929 6.0 15.0 6.0 h 4.44 l -1.47 -1.47 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.767 -0.293 1.06 0.0 Z")
        )
    }.build()
}
