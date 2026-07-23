package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Login16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Login16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.975 1.75 c 0.472 0.0 0.857 0.0 1.169 0.026 c 0.323 0.026 0.612 0.082 0.881 0.22 c 0.424 0.215 0.768 0.56 0.984 0.983 c 0.137 0.269 0.193 0.558 0.22 0.88 c 0.025 0.313 0.025 0.698 0.025 1.17 v 5.946 c 0.0 0.472 0.0 0.857 -0.026 1.17 c -0.026 0.322 -0.082 0.611 -0.22 0.88 c -0.215 0.424 -0.56 0.768 -0.983 0.984 c -0.269 0.137 -0.558 0.193 -0.881 0.22 c -0.312 0.025 -0.697 0.025 -1.169 0.025 H 9.082 c -0.97 0.0 -1.754 -0.785 -1.754 -1.754 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 0.416 0.337 0.754 0.754 0.754 h 1.872 c 0.498 0.0 0.842 0.0 1.109 -0.022 c 0.26 -0.021 0.403 -0.06 0.508 -0.114 c 0.236 -0.12 0.427 -0.311 0.547 -0.546 c 0.053 -0.105 0.092 -0.248 0.114 -0.51 c 0.022 -0.266 0.022 -0.61 0.022 -1.108 V 5.05 c 0.0 -0.498 0.0 -0.842 -0.022 -1.109 c -0.022 -0.26 -0.06 -0.404 -0.114 -0.508 c -0.12 -0.236 -0.311 -0.427 -0.547 -0.547 c -0.104 -0.053 -0.248 -0.093 -0.508 -0.114 c -0.267 -0.022 -0.61 -0.022 -1.11 -0.022 H 9.079 c -0.415 0.0 -0.75 0.336 -0.75 0.75 c 0.0 0.276 -0.224 0.5 -0.5 0.5 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 c 0.0 -0.966 0.783 -1.75 1.75 -1.75 h 1.897 Z M 9.352 7.648 C 9.447 7.742 9.5 7.87 9.5 8.002 c 0.0 0.133 -0.053 0.261 -0.148 0.355 l -2.117 2.107 c -0.196 0.195 -0.513 0.194 -0.708 -0.001 C 6.333 10.267 6.333 9.95 6.53 9.756 l 1.26 -1.254 h -4.79 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 4.79 L 6.528 6.25 C 6.333 6.055 6.333 5.738 6.527 5.542 C 6.722 5.347 7.04 5.346 7.235 5.541 l 2.117 2.107 Z")
        )
    }.build()
}
