package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxTopFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxTopFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 0.5 6.96 c 0.0 -0.686 0.0 -1.03 0.134 -1.291 c 0.117 -0.23 0.304 -0.418 0.535 -0.535 C 1.43 5.0 1.774 5.0 2.46 5.0 h 11.48 c 0.686 0.0 1.03 0.0 1.291 0.134 c 0.23 0.117 0.418 0.304 0.536 0.535 C 15.9 5.93 15.9 6.274 15.9 6.96 v 0.98 c 0.0 0.686 0.0 1.03 -0.133 1.291 c -0.118 0.23 -0.305 0.418 -0.536 0.535 C 14.97 9.9 14.626 9.9 13.94 9.9 H 2.46 c -0.686 0.0 -1.03 0.0 -1.291 -0.134 C 0.939 9.65 0.75 9.462 0.634 9.231 C 0.5 8.97 0.5 8.626 0.5 7.94 V 6.96 Z m 8.925 0.49 c 0.0 0.676 -0.548 1.225 -1.225 1.225 S 6.975 8.126 6.975 7.45 c 0.0 -0.677 0.548 -1.225 1.225 -1.225 S 9.425 6.773 9.425 7.45 Z M 2.95 6.05 H 1.9 v 2.8 h 1.05 v -2.8 Z m 11.55 0.0 v 2.8 h -1.05 v -2.8 h 1.05 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 10.625 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 8.4 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 4.0 Z")
        )
    }.build()
}
