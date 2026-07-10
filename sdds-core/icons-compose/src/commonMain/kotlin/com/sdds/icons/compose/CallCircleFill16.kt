package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 7.19 5.317 C 6.763 4.698 6.088 3.972 5.53 4.531 C 5.083 4.976 3.3 6.76 6.27 9.73 c 2.97 2.97 4.753 1.186 5.199 0.74 c 0.559 -0.558 -0.167 -1.234 -0.787 -1.66 c -0.184 -0.127 -0.277 -0.19 -0.377 -0.219 c -0.111 -0.03 -0.161 -0.034 -0.274 -0.015 c -0.104 0.018 -0.294 0.12 -0.676 0.326 C 8.883 9.157 8.194 9.274 7.46 8.54 S 6.843 7.117 7.097 6.645 c 0.206 -0.382 0.31 -0.573 0.326 -0.676 c 0.02 -0.113 0.017 -0.163 -0.014 -0.274 c -0.029 -0.1 -0.092 -0.193 -0.22 -0.378 Z")
        )
    }.build()
}
