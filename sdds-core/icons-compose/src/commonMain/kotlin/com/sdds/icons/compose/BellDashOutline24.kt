package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.848 3.235 C 13.948 3.477 14.0 3.737 14.0 4.0 h -0.022 c 0.956 0.266 1.733 0.74 2.35 1.39 c 0.202 0.21 0.382 0.437 0.545 0.676 l 3.082 -3.082 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.768 0.0 1.061 l -3.423 3.423 l -1.187 1.188 l -12.36 12.36 c -0.293 0.292 -0.768 0.292 -1.06 0.0 c -0.294 -0.293 -0.294 -0.768 0.0 -1.061 l 1.252 -1.252 C 3.952 18.596 3.75 18.322 3.75 18.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 0.839 c 0.097 -0.922 0.13 -1.95 0.166 -3.041 l 0.015 -0.453 c 0.05 -1.496 0.122 -3.083 0.4 -4.523 c 0.278 -1.437 0.777 -2.819 1.751 -3.844 C 8.29 4.74 9.066 4.266 10.022 4.0 H 10.0 c 0.0 -0.263 0.052 -0.523 0.152 -0.765 c 0.1 -0.243 0.248 -0.463 0.434 -0.65 c 0.185 -0.185 0.406 -0.332 0.649 -0.433 C 11.477 2.052 11.737 2.0 12.0 2.0 s 0.523 0.052 0.765 0.152 c 0.243 0.1 0.463 0.248 0.65 0.434 c 0.185 0.186 0.332 0.406 0.433 0.649 Z M 6.936 16.003 l 8.85 -8.85 c -0.16 -0.271 -0.34 -0.515 -0.544 -0.73 C 14.576 5.723 13.584 5.25 12.0 5.25 S 9.424 5.723 8.758 6.423 c -0.69 0.725 -1.112 1.781 -1.365 3.094 c -0.253 1.31 -0.323 2.785 -0.374 4.29 l -0.015 0.459 c -0.019 0.581 -0.038 1.166 -0.068 1.737 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.753 10.43 l 1.306 -1.306 l 0.021 0.109 c 0.279 1.44 0.35 3.027 0.4 4.523 l 0.015 0.453 c 0.036 1.09 0.07 2.119 0.166 3.041 H 19.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 8.432 l 1.5 -1.5 h 7.222 c -0.092 -0.947 -0.125 -1.97 -0.158 -2.984 l -0.015 -0.46 c -0.04 -1.164 -0.09 -2.31 -0.228 -3.377 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.17 20.0 c 0.413 1.165 1.524 2.0 2.83 2.0 s 2.417 -0.835 2.83 -2.0 H 9.17 Z")
        )
    }.build()
}
