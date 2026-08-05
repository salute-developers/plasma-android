package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.137 2.5 H 4.863 c -0.57 0.0 -1.028 0.0 -1.4 0.03 C 3.08 2.56 2.744 2.625 2.433 2.78 C 1.94 3.028 1.538 3.423 1.286 3.908 C 1.128 4.213 1.062 4.543 1.03 4.919 C 1.0 5.284 1.0 5.735 1.0 6.294 v 3.412 c 0.0 0.56 0.0 1.01 0.03 1.375 c 0.032 0.376 0.098 0.706 0.256 1.011 c 0.252 0.485 0.653 0.88 1.147 1.127 c 0.311 0.156 0.647 0.22 1.03 0.251 c 0.372 0.03 0.83 0.03 1.4 0.03 h 6.274 c 0.57 0.0 1.028 0.0 1.4 -0.03 c 0.383 -0.03 0.719 -0.095 1.03 -0.251 c 0.494 -0.247 0.895 -0.642 1.147 -1.127 c 0.158 -0.305 0.224 -0.635 0.256 -1.011 C 15.0 10.716 15.0 10.265 15.0 9.707 V 6.294 c 0.0 -0.56 0.0 -1.01 -0.03 -1.375 c -0.032 -0.376 -0.098 -0.706 -0.256 -1.011 c -0.252 -0.485 -0.653 -0.88 -1.147 -1.127 c -0.311 -0.156 -0.647 -0.22 -1.03 -0.251 c -0.372 -0.03 -0.83 -0.03 -1.4 -0.03 Z m -7.43 2.666 c -0.235 -0.143 -0.543 -0.067 -0.686 0.17 c -0.143 0.235 -0.067 0.543 0.17 0.686 l 3.463 2.093 c 0.827 0.5 1.863 0.5 2.69 0.0 l 3.464 -2.093 c 0.236 -0.143 0.312 -0.45 0.17 -0.687 c -0.144 -0.236 -0.451 -0.312 -0.687 -0.17 L 8.827 7.26 c -0.51 0.308 -1.147 0.308 -1.655 0.0 L 3.708 5.166 Z")
        )
    }.build()
}
