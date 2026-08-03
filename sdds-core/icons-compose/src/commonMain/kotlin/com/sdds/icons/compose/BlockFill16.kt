package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlockFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlockFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.694 10.987 l -6.68 -6.68 c 1.865 -1.513 4.61 -1.401 6.345 0.334 c 1.735 1.736 1.847 4.48 0.335 6.346 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.306 5.013 l 6.68 6.68 c -1.865 1.513 -4.61 1.401 -6.345 -0.334 c -1.735 -1.736 -1.847 -4.48 -0.335 -6.346 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z m 4.066 -11.066 C 9.82 1.69 6.18 1.69 3.934 3.934 c -2.245 2.246 -2.245 5.886 0.0 8.132 c 2.246 2.245 5.886 2.245 8.132 0.0 c 2.245 -2.246 2.245 -5.886 0.0 -8.132 Z")
        )
    }.build()
}
