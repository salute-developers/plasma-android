package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.YuanOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "YuanOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 8.954 h 1.46 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 8.926 l 1.592 -2.43 c 0.151 -0.23 0.087 -0.54 -0.144 -0.692 c -0.23 -0.152 -0.54 -0.087 -0.692 0.144 L 8.0 7.542 L 6.318 4.976 C 6.167 4.745 5.857 4.68 5.626 4.832 C 5.395 4.983 5.33 5.293 5.482 5.524 l 1.592 2.43 H 6.04 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 7.5 v 0.83 H 6.04 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 H 7.5 V 11.2 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -0.415 h 1.46 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 H 8.5 V 8.954 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 8.0 c 0.0 -3.866 3.134 -7.0 7.0 -7.0 s 7.0 3.134 7.0 7.0 s -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 Z m 7.0 -5.95 C 4.714 2.05 2.05 4.714 2.05 8.0 S 4.714 13.95 8.0 13.95 s 5.95 -2.664 5.95 -5.95 S 11.286 2.05 8.0 2.05 Z")
        )
    }.build()
}
