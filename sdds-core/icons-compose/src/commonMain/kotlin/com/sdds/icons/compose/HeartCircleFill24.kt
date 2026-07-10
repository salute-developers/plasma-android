package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartCircleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartCircleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z M 6.0 10.184 C 6.0 8.75 7.224 7.0 9.22 7.0 c 1.114 0.0 2.066 0.89 2.78 1.737 C 12.714 7.89 13.666 7.0 14.78 7.0 C 16.776 7.0 18.0 8.75 18.0 10.184 c 0.0 2.726 -2.715 5.28 -5.058 7.103 c -0.324 0.253 -0.486 0.379 -0.68 0.431 c -0.165 0.045 -0.359 0.045 -0.523 0.0 c -0.195 -0.052 -0.357 -0.178 -0.681 -0.43 C 8.715 15.463 6.0 12.91 6.0 10.183 Z")
        )
    }.build()
}
