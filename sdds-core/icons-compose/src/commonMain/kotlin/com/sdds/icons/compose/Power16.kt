package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Power16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Power16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.502 1.502 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 5.269 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 1.5 Z m 2.627 1.75 c -0.238 -0.14 -0.544 -0.058 -0.683 0.18 c -0.14 0.24 -0.058 0.545 0.18 0.684 c 1.002 0.582 1.785 1.482 2.228 2.56 c 0.443 1.077 0.52 2.272 0.22 3.398 c -0.299 1.127 -0.959 2.122 -1.876 2.831 c -0.918 0.71 -2.04 1.093 -3.196 1.093 c -1.155 0.0 -2.279 -0.384 -3.196 -1.093 c -0.917 -0.709 -1.577 -1.704 -1.877 -2.83 c -0.3 -1.127 -0.222 -2.322 0.221 -3.4 c 0.443 -1.077 1.226 -1.977 2.227 -2.559 c 0.24 -0.139 0.32 -0.445 0.181 -0.684 c -0.139 -0.238 -0.445 -0.32 -0.683 -0.18 c -1.193 0.693 -2.123 1.763 -2.65 3.043 C 1.7 7.575 1.607 8.993 1.963 10.33 c 0.356 1.338 1.14 2.521 2.232 3.365 c 1.091 0.845 2.43 1.302 3.807 1.302 c 1.377 0.0 2.716 -0.457 3.807 -1.302 c 1.092 -0.844 1.876 -2.027 2.232 -3.365 c 0.356 -1.338 0.264 -2.756 -0.262 -4.036 c -0.527 -1.28 -1.457 -2.35 -2.65 -3.043 Z")
        )
    }.build()
}
