package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlashDriveFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlashDriveFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.425 1.0 C 5.748 1.0 5.2 1.55 5.2 2.225 V 4.51 C 4.413 4.597 3.8 5.264 3.8 6.075 v 7.35 C 3.8 14.295 4.505 15.0 5.375 15.0 h 5.25 c 0.87 0.0 1.575 -0.705 1.575 -1.575 v -7.35 c 0.0 -0.81 -0.612 -1.478 -1.4 -1.565 V 2.225 C 10.8 1.55 10.252 1.0 9.575 1.0 h -3.15 Z M 9.75 4.5 V 2.225 c 0.0 -0.096 -0.078 -0.175 -0.175 -0.175 h -3.15 C 6.328 2.05 6.25 2.13 6.25 2.225 V 4.5 h 3.5 Z")
        )
    }.build()
}
