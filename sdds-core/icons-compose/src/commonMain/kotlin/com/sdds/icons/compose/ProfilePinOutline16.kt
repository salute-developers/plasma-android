package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinOutline16",
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
            pathData = addPathNodes("M 8.278 9.47 c -0.21 0.307 -0.382 0.643 -0.511 0.999 c -1.736 0.046 -3.348 0.597 -4.703 1.514 c -0.216 0.147 -0.332 0.392 -0.31 0.63 c 0.022 0.228 0.06 0.358 0.109 0.454 c 0.12 0.235 0.31 0.427 0.546 0.547 c 0.104 0.053 0.248 0.092 0.507 0.113 c 0.266 0.022 0.61 0.023 1.106 0.023 h 2.83 c 0.152 0.36 0.351 0.695 0.587 1.0 H 5.022 c -0.48 0.0 -0.872 0.0 -1.188 -0.025 c -0.321 -0.027 -0.61 -0.083 -0.88 -0.22 c -0.423 -0.216 -0.767 -0.56 -0.983 -0.984 c -0.128 -0.25 -0.184 -0.518 -0.212 -0.812 c -0.06 -0.624 0.243 -1.214 0.744 -1.554 c 1.575 -1.066 3.466 -1.69 5.5 -1.69 c 0.091 0.0 0.183 0.002 0.275 0.005 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.001 1.25 c 1.93 0.0 3.477 1.592 3.477 3.535 S 9.93 8.321 8.0 8.321 c -1.929 0.0 -3.476 -1.593 -3.476 -3.536 S 6.072 1.25 8.0 1.25 Z m 0.0 1.0 c -1.358 0.0 -2.476 1.126 -2.476 2.535 c 0.0 1.41 1.118 2.536 2.476 2.536 c 1.359 0.0 2.477 -1.126 2.477 -2.536 C 10.478 3.375 9.36 2.25 8.0 2.25 Z")
        )
    }.build()
}
