package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BoxFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BoxFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.313 1.75 c -0.863 0.0 -1.563 0.7 -1.563 1.563 v 1.93 h 12.5 v -1.93 c 0.0 -0.863 -0.7 -1.563 -1.563 -1.563 H 3.313 Z m 10.259 4.493 H 2.428 l 0.016 0.004 v 5.746 c 0.0 1.246 1.01 2.257 2.257 2.257 H 11.3 c 1.246 0.0 2.257 -1.01 2.257 -2.257 V 6.247 l 0.016 -0.004 Z M 8.173 7.996 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 h 3.5 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 h -3.5 Z M 9.037 10.8 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 2.0 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 h -2.0 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 Z")
        )
    }.build()
}
