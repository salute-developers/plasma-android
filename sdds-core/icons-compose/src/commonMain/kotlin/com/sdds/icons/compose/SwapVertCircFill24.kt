package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVertCircFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVertCircFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 5.03 -12.72 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -0.72 -0.72 v 8.69 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 6.75 c 0.0 -0.303 0.183 -0.577 0.463 -0.693 c 0.28 -0.116 0.603 -0.052 0.817 0.163 l 2.0 2.0 c 0.293 0.293 0.293 0.767 0.0 1.06 Z M 6.97 14.72 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 0.72 0.72 V 6.75 C 8.75 6.336 9.086 6.0 9.5 6.0 s 0.75 0.336 0.75 0.75 v 10.5 c 0.0 0.303 -0.183 0.577 -0.463 0.693 c -0.28 0.116 -0.603 0.052 -0.817 -0.163 l -2.0 -2.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
