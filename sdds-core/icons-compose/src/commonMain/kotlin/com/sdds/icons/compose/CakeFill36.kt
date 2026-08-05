package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CakeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CakeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.75 6.75 C 19.75 7.993 18.743 9.0 17.5 9.0 s -2.25 -1.007 -2.25 -2.25 c 0.0 -2.25 2.25 -5.25 2.25 -5.25 s 2.25 3.0 2.25 5.25 Z M 18.5 12.0 v -1.5 h -2.0 V 12.0 H 8.875 C 6.183 12.0 4.0 14.183 4.0 16.875 v 3.875 c 3.292 0.0 5.752 -2.574 6.507 -3.481 l 0.008 -0.01 c 0.033 -0.04 0.087 -0.105 0.14 -0.16 c 0.048 -0.05 0.207 -0.214 0.464 -0.302 c 0.272 -0.092 0.56 -0.08 0.825 0.033 c 0.249 0.107 0.394 0.284 0.438 0.337 c 0.049 0.06 0.098 0.129 0.127 0.171 l 0.008 0.01 c 0.28 0.398 0.888 1.173 1.763 1.84 c 0.872 0.666 1.957 1.187 3.22 1.187 c 1.263 0.0 2.348 -0.52 3.22 -1.186 c 0.875 -0.668 1.483 -1.443 1.763 -1.84 l 0.008 -0.011 c 0.03 -0.042 0.078 -0.111 0.127 -0.17 v -0.001 c 0.044 -0.053 0.189 -0.23 0.439 -0.337 c 0.263 -0.114 0.552 -0.125 0.824 -0.033 c 0.257 0.088 0.416 0.252 0.463 0.301 l 0.001 0.001 c 0.053 0.055 0.107 0.12 0.14 0.16 l 0.009 0.01 c 0.754 0.907 3.214 3.481 6.506 3.481 v -3.875 C 31.0 14.183 28.817 12.0 26.125 12.0 H 18.5 Z M 31.0 22.75 c -3.528 0.0 -6.179 -2.22 -7.44 -3.529 c -0.398 0.471 -0.944 1.037 -1.626 1.557 c -1.097 0.837 -2.598 1.597 -4.434 1.597 c -1.836 0.0 -3.338 -0.76 -4.434 -1.597 c -0.682 -0.52 -1.228 -1.086 -1.626 -1.557 C 10.179 20.53 7.528 22.75 4.0 22.75 v 3.875 C 4.0 29.317 6.183 31.5 8.875 31.5 h 17.25 c 2.692 0.0 4.875 -2.183 4.875 -4.875 V 22.75 Z")
        )
    }.build()
}
