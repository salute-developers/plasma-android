package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryEmptyFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryEmptyFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.0 2.0 C 9.448 2.0 9.0 2.448 9.0 3.0 v 1.108 C 8.712 4.16 8.468 4.236 8.247 4.348 c -0.602 0.308 -1.091 0.797 -1.398 1.4 C 6.5 6.431 6.5 7.327 6.5 9.12 v 7.76 c 0.0 1.792 0.0 2.688 0.349 3.373 c 0.307 0.602 0.796 1.091 1.398 1.398 C 8.932 22.0 9.827 22.0 11.62 22.0 h 0.76 c 1.792 0.0 2.688 0.0 3.373 -0.349 c 0.602 -0.307 1.091 -0.796 1.398 -1.398 c 0.349 -0.685 0.349 -1.58 0.349 -3.373 V 9.12 c 0.0 -1.792 0.0 -2.688 -0.349 -3.373 c -0.307 -0.602 -0.796 -1.091 -1.398 -1.398 c -0.221 -0.113 -0.465 -0.19 -0.753 -0.24 V 3.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -4.0 Z")
        )
    }.build()
}
