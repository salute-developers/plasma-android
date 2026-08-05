package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVertCircOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVertCircOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.002 8.0 c 0.0 3.313 2.685 5.998 5.998 5.998 S 13.998 11.313 13.998 8.0 S 11.313 2.002 8.0 2.002 S 2.002 4.687 2.002 8.0 Z M 8.0 14.998 c -3.865 0.0 -6.998 -3.133 -6.998 -6.998 S 4.135 1.002 8.0 1.002 S 14.998 4.135 14.998 8.0 S 11.865 14.998 8.0 14.998 Z M 4.486 9.93 c 0.195 -0.195 0.511 -0.195 0.707 0.0 l 0.551 0.552 V 4.31 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 7.377 c 0.0 0.202 -0.122 0.384 -0.309 0.462 c -0.186 0.077 -0.401 0.034 -0.544 -0.109 l -1.405 -1.405 c -0.196 -0.195 -0.196 -0.511 0.0 -0.707 Z m 6.322 -3.86 c 0.195 0.196 0.512 0.196 0.707 0.0 c 0.195 -0.195 0.195 -0.511 0.0 -0.707 L 10.11 3.957 C 9.967 3.814 9.752 3.772 9.565 3.85 C 9.378 3.926 9.256 4.109 9.256 4.31 v 7.376 c 0.0 0.276 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.224 0.5 -0.5 V 5.518 l 0.552 0.551 Z")
        )
    }.build()
}
