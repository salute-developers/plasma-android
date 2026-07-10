package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ZoomPlusOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ZoomPlusOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 7.0 c 0.0 -2.21 1.79 -4.0 4.0 -4.0 s 4.0 1.79 4.0 4.0 s -1.79 4.0 -4.0 4.0 s -4.0 -1.79 -4.0 -4.0 Z m 4.0 -5.0 C 4.239 2.0 2.0 4.239 2.0 7.0 s 2.239 5.0 5.0 5.0 c 1.2 0.0 2.303 -0.423 3.165 -1.129 l 3.531 3.532 c 0.196 0.196 0.512 0.196 0.707 0.0 c 0.196 -0.195 0.196 -0.511 0.0 -0.707 l -3.531 -3.532 C 11.577 9.302 12.0 8.201 12.0 7.0 c 0.0 -2.761 -2.239 -5.0 -5.0 -5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 4.2 c 0.275 0.0 0.5 0.224 0.5 0.5 v 1.8 h 1.8 c 0.275 0.0 0.5 0.224 0.5 0.5 S 9.574 7.5 9.3 7.5 H 7.5 v 1.8 c 0.0 0.276 -0.225 0.5 -0.5 0.5 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 V 7.5 H 4.7 C 4.422 7.5 4.2 7.276 4.2 7.0 s 0.223 -0.5 0.5 -0.5 h 1.8 V 4.7 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
