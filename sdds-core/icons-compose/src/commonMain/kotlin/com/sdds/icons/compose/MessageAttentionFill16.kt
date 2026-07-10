package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAttentionFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAttentionFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.9 5.067 c 0.331 0.0 0.6 0.268 0.6 0.6 v 2.431 c 0.0 0.332 -0.269 0.6 -0.6 0.6 c -0.332 0.0 -0.6 -0.268 -0.6 -0.6 V 5.667 c 0.0 -0.332 0.268 -0.6 0.6 -0.6 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.51 10.529 c 0.0 0.335 -0.273 0.608 -0.608 0.608 c -0.336 0.0 -0.608 -0.273 -0.608 -0.608 c 0.0 -0.336 0.272 -0.608 0.608 -0.608 c 0.335 0.0 0.607 0.272 0.607 0.608 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.053 1.975 c -3.297 0.0 -5.97 2.673 -5.97 5.97 c 0.0 0.716 0.125 1.403 0.357 2.04 c 0.13 0.36 0.166 0.71 0.08 1.015 l -0.51 1.821 c -0.198 0.71 0.457 1.366 1.167 1.167 l 1.821 -0.51 c 0.305 -0.086 0.656 -0.05 1.016 0.08 c 0.637 0.232 1.324 0.358 2.04 0.358 c 3.297 0.0 5.97 -2.673 5.97 -5.97 c 0.0 -3.298 -2.673 -5.971 -5.97 -5.971 Z m -4.97 5.97 c 0.0 -2.745 2.225 -4.97 4.97 -4.97 c 2.745 0.0 4.971 2.225 4.971 4.97 c 0.0 2.746 -2.225 4.971 -4.97 4.971 c -0.598 0.0 -1.17 -0.105 -1.699 -0.297 c -0.489 -0.178 -1.06 -0.263 -1.626 -0.104 l -1.73 0.484 l 0.485 -1.73 c 0.158 -0.565 0.073 -1.137 -0.104 -1.626 c -0.193 -0.529 -0.298 -1.1 -0.298 -1.697 Z")
        )
    }.build()
}
