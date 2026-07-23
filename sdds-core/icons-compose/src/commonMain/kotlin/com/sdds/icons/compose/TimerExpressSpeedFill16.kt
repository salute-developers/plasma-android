package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerExpressSpeedFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerExpressSpeedFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.7 2.0 C 8.422 2.0 8.2 2.224 8.2 2.5 S 8.422 3.0 8.7 3.0 h 0.9 v 0.9 C 7.128 4.146 5.2 6.196 5.2 8.688 c 0.0 2.658 2.193 4.813 4.9 4.813 c 2.706 0.0 4.9 -2.155 4.9 -4.813 c 0.0 -2.492 -1.93 -4.542 -4.4 -4.788 V 3.0 h 0.9 C 11.774 3.0 12.0 2.776 12.0 2.5 S 11.774 2.0 11.5 2.0 H 8.7 Z M 2.4 4.75 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.45 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 2.4 Z M 1.0 7.5 C 0.724 7.5 0.5 7.724 0.5 8.0 S 0.724 8.5 1.0 8.5 h 2.45 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 1.0 Z m 0.2 3.25 c 0.0 -0.277 0.223 -0.5 0.5 -0.5 h 2.45 c 0.275 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.225 0.5 -0.5 0.5 H 1.7 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 Z m 9.809 -4.542 c 0.03 -0.092 -0.007 -0.194 -0.088 -0.243 c -0.08 -0.05 -0.182 -0.033 -0.245 0.04 L 8.051 9.028 C 8.0 9.09 7.985 9.177 8.017 9.252 c 0.031 0.074 0.102 0.122 0.18 0.122 H 9.76 l -0.57 1.791 c -0.03 0.093 0.007 0.194 0.088 0.244 c 0.08 0.049 0.182 0.033 0.245 -0.04 l 2.625 -3.025 c 0.052 -0.06 0.066 -0.147 0.034 -0.222 c -0.031 -0.075 -0.102 -0.123 -0.18 -0.123 H 10.44 l 0.57 -1.791 Z")
        )
    }.build()
}
