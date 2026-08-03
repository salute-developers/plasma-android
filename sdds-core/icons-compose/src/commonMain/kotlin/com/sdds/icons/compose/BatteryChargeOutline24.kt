package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryChargeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryChargeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 3.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 4.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 1.045 c 0.524 0.044 0.914 0.131 1.253 0.304 c 0.602 0.307 1.091 0.796 1.398 1.398 C 18.0 6.432 18.0 7.327 18.0 9.12 v 7.76 c 0.0 1.792 0.0 2.688 -0.349 3.373 c -0.307 0.602 -0.796 1.091 -1.398 1.398 C 15.568 22.0 14.673 22.0 12.88 22.0 h -1.76 c -1.792 0.0 -2.688 0.0 -3.373 -0.349 c -0.602 -0.307 -1.091 -0.796 -1.398 -1.398 C 6.0 19.568 6.0 18.673 6.0 16.88 V 9.12 c 0.0 -1.792 0.0 -2.688 0.349 -3.373 c 0.307 -0.602 0.796 -1.091 1.398 -1.398 C 8.086 4.176 8.476 4.089 9.0 4.045 V 3.0 Z m 0.5 2.5 c -1.105 0.0 -2.0 0.895 -2.0 2.0 v 11.0 c 0.0 1.105 0.895 2.0 2.0 2.0 h 5.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 v -11.0 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 h -5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.043 14.166 c -0.278 0.0 -0.44 -0.477 -0.278 -0.7 l 3.827 -4.323 c 0.207 -0.286 0.663 -0.11 0.618 0.239 l -0.99 2.784 h 2.74 c 0.278 0.0 0.43 0.478 0.269 0.701 l -3.881 4.324 c -0.207 0.286 -0.664 0.109 -0.618 -0.24 l 1.021 -2.785 H 9.043 Z")
        )
    }.build()
}
