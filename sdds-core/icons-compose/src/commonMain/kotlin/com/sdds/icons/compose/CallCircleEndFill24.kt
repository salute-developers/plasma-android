package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallCircleEndFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallCircleEndFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 3.528 -7.609 C 16.584 14.586 18.0 14.637 18.0 13.508 c 0.0 -0.9 0.0 -4.504 -6.0 -4.504 s -6.0 3.604 -6.0 4.504 c 0.0 1.129 1.416 1.078 2.472 0.883 c 0.315 -0.058 0.472 -0.087 0.603 -0.16 c 0.143 -0.08 0.196 -0.129 0.291 -0.262 c 0.087 -0.122 0.176 -0.419 0.353 -1.012 c 0.22 -0.734 0.798 -1.549 2.281 -1.549 s 2.06 0.815 2.28 1.549 c 0.178 0.593 0.267 0.89 0.354 1.012 c 0.095 0.133 0.148 0.181 0.291 0.261 c 0.13 0.074 0.288 0.103 0.603 0.161 Z")
        )
    }.build()
}
