package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneCircleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneCircleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 5.695 -12.281 c 0.397 -0.384 0.408 -1.017 0.024 -1.414 c -0.384 -0.397 -1.017 -0.408 -1.414 -0.024 l -6.546 6.328 l -2.064 -1.995 c -0.397 -0.384 -1.03 -0.373 -1.414 0.024 c -0.384 0.397 -0.373 1.03 0.024 1.414 l 2.759 2.667 c 0.387 0.375 1.002 0.375 1.39 0.0 l 7.241 -7.0 Z")
        )
    }.build()
}
