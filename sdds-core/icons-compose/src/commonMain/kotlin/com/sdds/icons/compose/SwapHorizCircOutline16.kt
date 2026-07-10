package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapHorizCircOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapHorizCircOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 2.002 C 4.687 2.002 2.002 4.687 2.002 8.0 S 4.687 13.998 8.0 13.998 S 13.998 11.313 13.998 8.0 S 11.313 2.002 8.0 2.002 Z M 1.002 8.0 c 0.0 -3.865 3.133 -6.998 6.998 -6.998 S 14.998 4.135 14.998 8.0 S 11.865 14.998 8.0 14.998 S 1.002 11.865 1.002 8.0 Z m 5.07 -3.514 c 0.194 0.195 0.194 0.511 0.0 0.707 L 5.52 5.744 h 6.169 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 4.312 c -0.202 0.0 -0.384 -0.122 -0.461 -0.309 C 3.773 6.25 3.816 6.034 3.959 5.891 l 1.405 -1.405 c 0.195 -0.196 0.512 -0.196 0.707 0.0 Z m 3.859 6.322 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 l 1.405 -1.405 c 0.143 -0.143 0.186 -0.358 0.108 -0.545 c -0.077 -0.187 -0.26 -0.309 -0.461 -0.309 H 4.313 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 h 6.17 L 9.93 10.808 Z")
        )
    }.build()
}
