package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MarkerOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MarkerOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.907 13.07 L 2.93 12.093 l -1.474 1.474 l 1.47 0.488 l 0.982 -0.983 Z m 1.105 0.092 l 0.354 -0.353 c 1.19 -1.19 2.042 -1.627 2.553 -1.78 c 0.255 -0.078 0.428 -0.086 0.521 -0.081 c 0.048 0.002 0.077 0.008 0.088 0.01 H 8.53 c 0.18 0.063 0.382 0.018 0.518 -0.118 l 5.854 -5.855 c 0.176 -0.176 0.346 -0.462 0.299 -0.815 c -0.06 -0.454 -0.319 -1.223 -1.234 -2.138 c -0.915 -0.915 -1.684 -1.174 -2.138 -1.234 c -0.353 -0.046 -0.64 0.123 -0.815 0.299 L 5.159 6.951 C 5.024 7.087 4.978 7.29 5.041 7.47 V 7.47 c 0.003 0.011 0.008 0.04 0.01 0.088 c 0.005 0.094 -0.003 0.267 -0.08 0.521 c -0.154 0.511 -0.59 1.363 -1.78 2.553 l -0.354 0.354 l 2.175 2.175 Z m 9.183 -8.884 l -5.5 5.501 L 6.22 7.305 l 5.501 -5.5 l 0.01 -0.01 c 0.237 0.038 0.791 0.206 1.53 0.944 c 0.738 0.738 0.905 1.292 0.944 1.529 l -0.01 0.01 Z m -9.95 6.703 c 0.999 -1.071 1.467 -1.926 1.67 -2.567 l 1.67 1.67 c -0.641 0.203 -1.496 0.671 -2.566 1.67 L 4.245 10.98 Z")
        )
    }.build()
}
