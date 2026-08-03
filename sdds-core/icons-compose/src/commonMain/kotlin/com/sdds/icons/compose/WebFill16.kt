package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WebFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WebFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 1.0 c 1.856 0.002 3.635 0.74 4.947 2.053 C 14.26 4.365 14.998 6.144 15.0 8.0 c 0.0 1.384 -0.41 2.738 -1.18 3.889 c -0.769 1.15 -1.862 2.048 -3.141 2.578 c -1.28 0.53 -2.687 0.668 -4.045 0.398 S 4.029 13.93 3.05 12.95 c -0.979 -0.979 -1.646 -2.227 -1.916 -3.585 C 0.864 8.008 1.003 6.6 1.532 5.321 C 2.062 4.042 2.96 2.95 4.11 2.18 C 5.262 1.41 6.616 1.0 8.0 1.0 Z m 2.877 9.692 c -0.302 1.109 -0.812 2.15 -1.5 3.069 c 0.832 -0.2 1.611 -0.577 2.284 -1.107 c 0.674 -0.53 1.226 -1.199 1.617 -1.962 h -2.4 Z m -4.627 0.0 c 0.345 1.13 0.944 2.165 1.75 3.029 c 0.807 -0.863 1.405 -1.899 1.75 -3.029 h -3.5 Z M 5.987 6.385 c -0.184 1.069 -0.184 2.161 0.0 3.23 h 4.03 c 0.186 -1.069 0.186 -2.161 0.0 -3.23 h -4.03 Z m 5.12 0.0 c 0.165 1.07 0.165 2.16 0.0 3.23 h 2.591 C 13.848 9.09 13.923 8.546 13.923 8.0 s -0.075 -1.09 -0.225 -1.615 h -2.591 Z M 8.0 2.279 C 7.194 3.142 6.595 4.178 6.25 5.308 h 3.5 C 9.405 4.178 8.806 3.142 8.0 2.279 Z m 1.373 -0.04 c 0.69 0.918 1.199 1.96 1.501 3.069 h 2.4 c -0.39 -0.763 -0.94 -1.432 -1.614 -1.961 c -0.673 -0.53 -1.454 -0.909 -2.287 -1.109 Z")
        )
    }.build()
}
