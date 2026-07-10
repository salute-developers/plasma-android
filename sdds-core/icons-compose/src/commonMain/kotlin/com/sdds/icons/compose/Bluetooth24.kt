package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Bluetooth24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Bluetooth24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.68 2.324 c 0.26 -0.125 0.568 -0.09 0.793 0.09 l 5.625 4.5 C 18.276 7.057 18.38 7.272 18.38 7.5 c 0.0 0.228 -0.104 0.443 -0.282 0.586 L 13.206 12.0 l 4.892 3.914 c 0.178 0.143 0.282 0.358 0.282 0.586 c 0.0 0.228 -0.104 0.443 -0.282 0.586 l -5.625 4.5 c -0.225 0.18 -0.533 0.215 -0.793 0.09 S 11.255 21.288 11.255 21.0 v -7.44 l -4.407 3.526 c -0.323 0.258 -0.795 0.206 -1.054 -0.117 c -0.258 -0.324 -0.206 -0.796 0.117 -1.055 L 10.804 12.0 L 5.911 8.086 C 5.588 7.826 5.536 7.355 5.794 7.03 c 0.259 -0.323 0.731 -0.375 1.054 -0.117 l 4.407 3.526 V 3.0 c 0.0 -0.288 0.165 -0.551 0.425 -0.676 Z m 1.075 11.236 l 3.674 2.94 l -3.674 2.94 v -5.88 Z m 0.0 -3.12 V 4.56 l 3.674 2.94 l -3.674 2.94 Z")
        )
    }.build()
}
