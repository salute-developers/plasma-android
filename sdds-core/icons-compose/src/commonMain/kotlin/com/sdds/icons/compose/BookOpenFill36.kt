package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookOpenFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookOpenFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.933 5.75 c 2.27 0.0 4.04 0.541 5.343 1.335 c 0.4 0.243 0.614 0.69 0.614 1.158 c 0.0 5.951 -0.004 15.799 -0.005 19.52 c 0.0 0.824 -0.414 0.989 -0.958 0.372 c -0.748 -0.848 -2.122 -1.87 -4.994 -1.87 c -2.414 0.0 -3.959 0.604 -4.868 1.212 c -0.458 0.306 -0.756 0.614 -0.928 0.85 c -0.208 0.284 -0.156 0.348 -0.156 0.177 c 0.0 0.412 -0.499 0.746 -1.115 0.746 S 2.75 28.916 2.75 28.504 v -17.25 l 0.006 -0.005 c 0.015 -0.247 0.08 -0.49 0.148 -0.684 c 0.086 -0.242 0.207 -0.508 0.362 -0.783 c 0.31 -0.552 0.778 -1.183 1.426 -1.78 c 1.313 -1.206 3.346 -2.252 6.24 -2.252 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.067 5.75 c 5.505 0.0 8.071 3.163 8.178 5.447 l 0.003 0.002 l 0.002 0.003 v 17.302 c 0.0 0.412 -0.5 0.746 -1.116 0.746 c -0.616 0.0 -1.115 -0.334 -1.115 -0.746 c 0.0 0.171 0.052 0.107 -0.156 -0.178 c -0.172 -0.235 -0.47 -0.543 -0.928 -0.85 c -0.909 -0.607 -2.454 -1.21 -4.868 -1.21 c -2.867 0.0 -4.247 1.018 -4.997 1.865 c -0.545 0.616 -0.954 0.456 -0.955 -0.367 L 19.111 8.288 c 0.0 -0.493 0.24 -0.96 0.671 -1.197 C 21.19 6.319 23.12 5.75 25.067 5.75 Z")
        )
    }.build()
}
