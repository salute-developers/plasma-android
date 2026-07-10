package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryChargeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryChargeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 3.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 4.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 1.108 c 0.288 0.052 0.532 0.128 0.753 0.24 c 0.602 0.308 1.091 0.797 1.398 1.4 C 17.5 6.431 17.5 7.327 17.5 9.12 v 7.76 c 0.0 1.792 0.0 2.688 -0.349 3.373 c -0.307 0.602 -0.796 1.091 -1.398 1.398 C 15.068 22.0 14.173 22.0 12.38 22.0 h -0.76 c -1.792 0.0 -2.688 0.0 -3.373 -0.349 c -0.602 -0.307 -1.091 -0.796 -1.398 -1.398 C 6.5 19.568 6.5 18.673 6.5 16.88 V 9.12 c 0.0 -1.792 0.0 -2.688 0.349 -3.373 c 0.307 -0.602 0.796 -1.091 1.398 -1.398 C 8.468 4.236 8.712 4.159 9.0 4.109 V 3.0 Z M 8.805 13.3 c -0.162 0.223 0.0 0.7 0.278 0.7 h 2.708 l -1.021 2.785 c -0.046 0.349 0.411 0.526 0.618 0.24 l 3.881 -4.323 C 15.431 12.477 15.279 12.0 15.0 12.0 h -2.74 l 0.99 -2.785 c 0.045 -0.348 -0.411 -0.525 -0.618 -0.24 L 8.805 13.3 Z")
        )
    }.build()
}
