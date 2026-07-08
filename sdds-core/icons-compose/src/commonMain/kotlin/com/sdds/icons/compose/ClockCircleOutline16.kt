package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ClockCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ClockCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.975 C 2.0 4.675 4.675 2.0 7.975 2.0 s 5.975 2.675 5.975 5.975 s -2.675 5.975 -5.975 5.975 S 2.0 11.275 2.0 7.975 Z M 7.975 1.0 C 4.123 1.0 1.0 4.123 1.0 7.975 c 0.0 3.852 3.123 6.975 6.975 6.975 c 3.852 0.0 6.975 -3.123 6.975 -6.975 C 14.95 4.123 11.827 1.0 7.975 1.0 Z m 0.5 3.825 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 3.5 c 0.0 0.167 0.084 0.323 0.223 0.416 l 2.1 1.4 c 0.23 0.153 0.54 0.091 0.693 -0.139 c 0.153 -0.23 0.091 -0.54 -0.139 -0.693 L 8.475 8.057 V 4.825 Z")
        )
    }.build()
}
