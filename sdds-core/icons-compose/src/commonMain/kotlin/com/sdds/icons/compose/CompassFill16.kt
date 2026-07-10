package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CompassFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CompassFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z m 2.933 -10.893 c 0.164 0.123 0.236 0.333 0.182 0.53 l -1.088 4.008 c -0.128 0.47 -0.433 0.874 -0.85 1.127 l -3.551 2.15 c -0.175 0.106 -0.397 0.095 -0.56 -0.028 c -0.164 -0.123 -0.236 -0.333 -0.182 -0.53 l 1.089 -4.007 C 6.1 6.886 6.405 6.482 6.822 6.23 l 3.551 -2.151 c 0.175 -0.106 0.397 -0.095 0.56 0.028 Z M 6.938 7.62 c 0.03 -0.111 0.081 -0.215 0.15 -0.306 l 1.824 1.375 c -0.069 0.09 -0.154 0.168 -0.253 0.228 L 6.177 10.42 l 0.76 -2.8 Z")
        )
    }.build()
}
