package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlankFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlankFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.36 1.005 v 2.5 c 0.0 0.375 0.0 0.686 0.02 0.94 c 0.022 0.265 0.068 0.51 0.186 0.743 c 0.183 0.357 0.473 0.648 0.83 0.83 c 0.233 0.118 0.479 0.165 0.743 0.186 c 0.254 0.021 0.565 0.021 0.94 0.021 h 2.416 C 13.5 6.341 13.5 6.465 13.5 6.602 v 5.095 c 0.0 0.471 0.0 0.857 -0.025 1.17 c -0.026 0.324 -0.082 0.617 -0.219 0.89 c -0.214 0.429 -0.556 0.777 -0.976 0.995 c -0.269 0.14 -0.556 0.196 -0.875 0.223 C 11.098 15.0 10.72 15.0 10.256 15.0 H 5.744 c -0.463 0.0 -0.842 0.0 -1.15 -0.025 c -0.318 -0.027 -0.605 -0.084 -0.874 -0.223 c -0.42 -0.218 -0.762 -0.566 -0.976 -0.994 c -0.137 -0.274 -0.193 -0.566 -0.219 -0.89 C 2.5 12.553 2.5 12.167 2.5 11.696 V 4.303 c 0.0 -0.471 0.0 -0.857 0.025 -1.17 c 0.026 -0.324 0.082 -0.617 0.219 -0.89 C 2.958 1.813 3.3 1.465 3.72 1.247 c 0.269 -0.14 0.556 -0.196 0.875 -0.222 C 4.902 1.0 5.28 1.0 5.744 1.0 h 2.254 c 0.131 0.0 0.25 0.0 0.361 0.005 Z m 1.0 0.334 v 2.146 c 0.0 0.4 0.0 0.67 0.017 0.879 c 0.016 0.203 0.046 0.302 0.08 0.37 c 0.087 0.17 0.224 0.307 0.394 0.393 c 0.067 0.035 0.167 0.064 0.37 0.08 c 0.208 0.018 0.478 0.018 0.878 0.018 h 2.075 c -0.112 -0.164 -0.257 -0.311 -0.434 -0.491 l -2.907 -2.96 C 9.66 1.597 9.517 1.452 9.36 1.339 Z")
        )
    }.build()
}
