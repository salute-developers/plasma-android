package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelOffOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelOffOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.475 4.519 c -0.114 1.015 -0.613 1.956 -1.405 2.62 l -2.04 1.707 c -0.204 0.17 -0.322 0.424 -0.322 0.69 v 3.758 c 0.0 0.222 -0.147 0.417 -0.36 0.48 L 6.934 14.48 c -0.15 0.043 -0.314 0.014 -0.44 -0.08 c -0.125 -0.095 -0.2 -0.244 -0.2 -0.401 V 11.7 l 1.0 -1.0 v 2.632 l 1.414 -0.414 V 9.536 c 0.0 -0.092 0.009 -0.183 0.022 -0.272 l 4.745 -4.745 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.001 1.5 c 0.182 0.0 0.34 0.098 0.427 0.243 l 0.098 -0.097 c 0.195 -0.195 0.511 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 L 2.353 14.232 c -0.194 0.196 -0.51 0.196 -0.706 0.0 c -0.195 -0.195 -0.195 -0.511 0.0 -0.707 l 4.492 -4.493 C 6.093 8.963 6.037 8.9 5.972 8.846 l -2.04 -1.707 C 3.024 6.379 2.5 5.255 2.5 4.07 V 2.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 10.001 Z m -9.5 2.571 c 0.0 0.888 0.393 1.73 1.074 2.3 L 6.614 8.08 C 6.7 8.152 6.78 8.233 6.852 8.32 l 3.526 -3.525 h -1.86 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 2.414 c 0.124 0.0 0.236 0.047 0.323 0.122 l 1.246 -1.245 V 2.5 h -9.0 v 1.571 Z")
        )
    }.build()
}
