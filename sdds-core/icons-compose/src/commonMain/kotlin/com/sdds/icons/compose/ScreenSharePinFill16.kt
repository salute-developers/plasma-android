package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScreenSharePinFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScreenSharePinFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.976 11.004 l -1.096 1.098 l -0.052 0.057 c -0.107 0.142 -0.136 0.323 -0.094 0.486 l 0.04 0.177 c 0.06 0.328 0.021 0.583 -0.12 0.819 c -0.904 -0.909 -1.669 -1.674 -2.42 -2.42 c 0.12 -0.072 0.238 -0.113 0.36 -0.133 c 0.175 -0.028 0.381 -0.014 0.635 0.053 l 0.07 0.013 c 0.17 0.022 0.35 -0.03 0.48 -0.16 l 1.092 -1.095 l 1.105 1.105 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z m 1.365 1.155 c -0.238 -0.237 -0.605 -0.27 -0.877 -0.092 l -0.11 0.09 c -0.271 0.27 -0.713 0.71 -1.045 1.044 c -0.291 -0.07 -0.575 -0.095 -0.852 -0.05 c -0.228 0.037 -0.44 0.118 -0.64 0.244 l -0.195 0.141 c -0.27 0.22 -0.243 0.6 -0.032 0.81 l 1.085 1.085 l -0.99 0.991 c -0.137 0.137 -0.137 0.358 0.0 0.495 c 0.137 0.136 0.358 0.136 0.494 0.0 l 0.99 -0.991 l 1.091 1.09 l 0.086 0.07 c 0.186 0.122 0.444 0.134 0.635 -0.015 l 0.09 -0.088 c 0.415 -0.512 0.48 -1.069 0.334 -1.688 l 1.04 -1.041 c 0.275 -0.274 0.274 -0.717 0.0 -0.99 l -1.104 -1.105 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.385 2.625 c 0.384 0.0 0.702 0.0 0.96 0.02 c 0.265 0.022 0.511 0.069 0.743 0.187 c 0.357 0.182 0.648 0.473 0.83 0.83 c 0.118 0.232 0.165 0.478 0.187 0.742 c 0.02 0.259 0.02 0.577 0.02 0.961 v 3.406 c -0.796 -0.712 -1.847 -1.146 -3.0 -1.146 c -2.485 0.0 -4.5 2.015 -4.5 4.5 c 0.0 0.526 0.092 1.03 0.258 1.5 H 3.865 c -0.384 0.0 -0.702 0.0 -0.96 -0.02 c -0.265 -0.022 -0.511 -0.069 -0.743 -0.187 c -0.357 -0.182 -0.648 -0.473 -0.83 -0.83 c -0.118 -0.232 -0.165 -0.478 -0.186 -0.742 c -0.022 -0.259 -0.021 -0.577 -0.021 -0.961 v -5.52 c 0.0 -0.384 0.0 -0.702 0.02 -0.96 c 0.022 -0.265 0.069 -0.511 0.187 -0.743 c 0.182 -0.357 0.473 -0.648 0.83 -0.83 c 0.232 -0.118 0.478 -0.165 0.742 -0.186 c 0.259 -0.022 0.577 -0.021 0.961 -0.021 h 8.52 Z")
        )
    }.build()
}
