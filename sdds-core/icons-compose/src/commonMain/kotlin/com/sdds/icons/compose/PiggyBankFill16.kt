package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PiggyBankFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PiggyBankFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.25 1.9 c 0.236 0.0 0.466 0.038 0.68 0.107 c 0.262 0.085 0.406 0.366 0.321 0.629 c -0.085 0.262 -0.367 0.407 -0.63 0.322 C 3.507 2.921 3.381 2.9 3.25 2.9 c -0.636 0.0 -1.074 0.462 -1.074 0.94 c 0.0 0.313 0.083 0.567 0.187 0.753 c 1.173 -1.273 2.984 -2.07 4.965 -2.07 c 2.876 0.0 5.369 1.666 6.109 4.03 c 0.032 0.104 0.076 0.144 0.11 0.166 c 0.043 0.027 0.122 0.053 0.256 0.053 c 0.674 0.0 1.147 0.585 1.147 1.208 v 1.03 c 0.0 0.441 -0.24 0.81 -0.497 1.088 c -0.263 0.284 -0.607 0.542 -0.946 0.764 c -0.342 0.225 -0.704 0.43 -1.013 0.604 c -0.322 0.181 -0.566 0.319 -0.714 0.423 c -0.04 0.028 -0.067 0.077 -0.067 0.134 v 1.578 c 0.0 0.275 -0.224 0.5 -0.5 0.5 H 9.918 c -0.165 0.0 -0.319 -0.083 -0.412 -0.218 L 9.059 13.23 c -1.132 0.277 -2.33 0.277 -3.461 0.0 L 5.15 13.883 C 5.057 14.019 4.902 14.1 4.737 14.1 H 3.442 c -0.275 0.0 -0.5 -0.225 -0.5 -0.5 v -1.593 c 0.0 -0.05 -0.024 -0.11 -0.08 -0.158 C 1.725 10.873 1.0 9.507 1.0 7.98 c 0.0 -0.93 0.266 -1.797 0.73 -2.552 c -0.305 -0.359 -0.554 -0.91 -0.554 -1.587 c 0.0 -1.113 0.971 -1.94 2.074 -1.94 Z m 7.633 4.39 c -0.387 0.0 -0.7 0.313 -0.7 0.7 c 0.0 0.386 0.313 0.7 0.7 0.7 h 0.006 c 0.386 0.0 0.7 -0.314 0.7 -0.7 c 0.0 -0.387 -0.314 -0.7 -0.7 -0.7 h -0.006 Z M 7.65 4.175 c -0.539 0.0 -1.053 0.139 -1.527 0.387 c -0.244 0.129 -0.338 0.43 -0.21 0.675 c 0.129 0.244 0.43 0.34 0.675 0.211 c 0.344 -0.18 0.7 -0.273 1.062 -0.273 c 0.363 0.0 0.719 0.093 1.063 0.273 c 0.244 0.128 0.546 0.033 0.675 -0.21 c 0.128 -0.245 0.034 -0.547 -0.21 -0.676 C 8.705 4.315 8.19 4.176 7.65 4.176 Z")
        )
    }.build()
}
