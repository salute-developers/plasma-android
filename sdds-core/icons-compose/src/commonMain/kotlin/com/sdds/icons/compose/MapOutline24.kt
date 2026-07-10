package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MapOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MapOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.714 4.161 C 21.894 4.303 22.0 4.521 22.0 4.75 v 13.0 c 0.0 0.347 -0.238 0.648 -0.575 0.73 l -6.25 1.5 c -0.117 0.027 -0.24 0.027 -0.357 -0.002 l -5.822 -1.456 l -6.071 1.457 c -0.223 0.054 -0.459 0.002 -0.64 -0.14 C 2.106 19.697 2.0 19.479 2.0 19.25 v -13.0 c 0.0 -0.347 0.238 -0.648 0.575 -0.73 l 6.25 -1.5 c 0.117 -0.027 0.24 -0.027 0.357 0.002 l 5.822 1.456 l 6.071 -1.457 c 0.223 -0.054 0.459 -0.002 0.64 0.14 Z M 14.25 6.836 L 9.75 5.71 v 11.453 l 4.5 1.125 V 6.836 Z m 1.5 11.463 l 4.75 -1.14 V 5.7 l -4.75 1.14 V 18.3 Z m -7.5 -1.14 V 5.7 L 3.5 6.841 V 18.3 l 4.75 -1.14 Z")
        )
    }.build()
}
