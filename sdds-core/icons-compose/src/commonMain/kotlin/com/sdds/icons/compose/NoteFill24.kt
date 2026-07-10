package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NoteFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NoteFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.33 2.129 c 0.206 -0.14 0.467 -0.168 0.698 -0.075 l 6.558 2.622 C 19.44 5.018 20.0 5.846 20.0 6.766 V 11.0 c 0.0 0.249 -0.123 0.482 -0.33 0.621 c -0.206 0.14 -0.468 0.168 -0.699 0.075 L 12.5 9.108 v 8.642 c 0.0 2.347 -1.903 4.25 -4.25 4.25 S 4.0 20.097 4.0 17.75 s 1.903 -4.25 4.25 -4.25 c 1.049 0.0 2.009 0.38 2.75 1.01 V 2.75 c 0.0 -0.249 0.123 -0.482 0.33 -0.621 Z")
        )
    }.build()
}
