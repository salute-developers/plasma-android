package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.976 11.004 l -1.096 1.098 l -0.052 0.057 c -0.106 0.142 -0.136 0.323 -0.093 0.486 l 0.04 0.177 c 0.06 0.328 0.02 0.583 -0.121 0.819 c -0.903 -0.909 -1.669 -1.674 -2.42 -2.42 c 0.12 -0.071 0.238 -0.113 0.36 -0.133 c 0.176 -0.028 0.382 -0.014 0.635 0.053 l 0.071 0.013 c 0.17 0.022 0.349 -0.03 0.479 -0.16 l 1.092 -1.095 l 1.105 1.105 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.68 3.75 3.75 c 0.0 2.07 -1.679 3.75 -3.75 3.75 c -2.07 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.68 -3.75 3.75 -3.75 Z m 1.366 1.155 c -0.238 -0.237 -0.606 -0.27 -0.877 -0.092 l -0.11 0.09 c -0.272 0.27 -0.714 0.71 -1.046 1.044 c -0.29 -0.07 -0.574 -0.095 -0.851 -0.05 c -0.228 0.036 -0.44 0.118 -0.64 0.244 l -0.195 0.141 c -0.27 0.22 -0.244 0.6 -0.032 0.81 l 1.085 1.085 l -0.99 0.991 c -0.137 0.137 -0.137 0.358 0.0 0.495 c 0.136 0.136 0.357 0.136 0.493 0.0 l 0.99 -0.991 l 1.091 1.09 l 0.086 0.07 c 0.186 0.122 0.444 0.134 0.635 -0.015 l 0.09 -0.088 c 0.416 -0.512 0.481 -1.069 0.334 -1.688 L 14.47 11.5 c 0.274 -0.274 0.273 -0.717 0.0 -0.99 l -1.104 -1.105 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.356 9.36 C 7.817 10.1 7.5 11.012 7.5 12.0 c 0.0 0.82 0.22 1.588 0.604 2.25 h -3.31 c -0.98 0.0 -1.471 0.0 -1.845 -0.191 c -0.33 -0.168 -0.597 -0.436 -0.765 -0.765 C 2.058 13.046 2.015 12.746 2.0 12.286 c -0.012 -0.404 0.165 -0.794 0.486 -1.04 C 4.045 10.05 5.925 9.35 7.95 9.35 c 0.136 0.0 0.271 0.003 0.406 0.01 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.95 2.0 c 1.643 0.0 2.976 1.332 2.976 2.975 S 9.594 7.95 7.951 7.95 S 4.976 6.618 4.976 4.975 S 6.308 2.0 7.95 2.0 Z")
        )
    }.build()
}
