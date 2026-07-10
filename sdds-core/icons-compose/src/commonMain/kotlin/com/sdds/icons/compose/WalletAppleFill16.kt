package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WalletAppleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WalletAppleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.137 2.5 H 4.863 c -0.57 0.0 -1.028 0.0 -1.4 0.03 C 3.08 2.56 2.744 2.625 2.433 2.78 C 1.94 3.028 1.538 3.423 1.286 3.908 C 1.128 4.213 1.062 4.543 1.03 4.919 C 1.0 5.284 1.0 5.735 1.0 6.294 v 3.412 c 0.0 0.56 0.0 1.01 0.03 1.375 c 0.032 0.376 0.098 0.706 0.256 1.011 c 0.252 0.485 0.653 0.88 1.147 1.127 c 0.311 0.156 0.647 0.22 1.03 0.251 c 0.372 0.03 0.83 0.03 1.4 0.03 h 6.274 c 0.57 0.0 1.028 0.0 1.4 -0.03 c 0.383 -0.03 0.719 -0.095 1.03 -0.251 c 0.494 -0.247 0.895 -0.642 1.147 -1.127 c 0.158 -0.305 0.224 -0.635 0.256 -1.011 C 15.0 10.716 15.0 10.265 15.0 9.707 V 6.294 c 0.0 -0.56 0.0 -1.01 -0.03 -1.375 c -0.032 -0.376 -0.098 -0.706 -0.256 -1.011 c -0.252 -0.485 -0.653 -0.88 -1.147 -1.127 c -0.311 -0.156 -0.647 -0.22 -1.03 -0.251 c -0.372 -0.03 -0.83 -0.03 -1.4 -0.03 Z M 3.125 5.078 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 8.75 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -8.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.0 2.063 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 1.772 c 0.42 0.0 0.764 0.22 0.988 0.476 c 0.155 0.177 0.34 0.328 0.55 0.446 c 0.323 0.184 0.69 0.28 1.065 0.28 s 0.742 -0.096 1.066 -0.28 c 0.208 -0.118 0.394 -0.27 0.549 -0.446 c 0.224 -0.257 0.568 -0.476 0.988 -0.476 h 1.772 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -1.772 c -0.057 0.0 -0.146 0.032 -0.236 0.134 C 10.138 8.037 9.865 8.26 9.56 8.433 C 9.085 8.703 8.547 8.843 8.0 8.843 c -0.547 0.0 -1.085 -0.14 -1.56 -0.41 C 6.136 8.26 5.863 8.037 5.634 7.775 c -0.09 -0.102 -0.179 -0.134 -0.236 -0.134 H 3.625 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
