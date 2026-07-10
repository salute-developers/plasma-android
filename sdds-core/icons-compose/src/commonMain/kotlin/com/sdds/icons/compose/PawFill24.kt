package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PawFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PawFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.753 5.504 c 0.0 -1.245 1.007 -2.254 2.25 -2.254 s 2.25 1.01 2.25 2.254 c 0.0 1.246 -1.007 2.255 -2.25 2.255 s -2.25 -1.01 -2.25 -2.255 Z M 4.5 8.233 c -1.243 0.0 -2.25 1.01 -2.25 2.254 c 0.0 1.245 1.007 2.255 2.25 2.255 s 2.25 -1.01 2.25 -2.255 c 0.0 -1.245 -1.007 -2.254 -2.25 -2.254 Z m 10.168 2.493 c -1.264 -1.998 -4.064 -1.998 -5.329 0.0 l -3.048 4.816 c -1.368 2.162 0.036 5.208 2.665 5.208 h 6.096 c 2.628 0.0 4.032 -3.046 2.664 -5.208 l -3.048 -4.816 Z M 19.5 8.233 c -1.243 0.0 -2.25 1.01 -2.25 2.254 c 0.0 1.245 1.007 2.255 2.25 2.255 s 2.25 -1.01 2.25 -2.255 c 0.0 -1.245 -1.007 -2.254 -2.25 -2.254 Z m -6.747 -2.729 c 0.0 -1.245 1.008 -2.254 2.25 -2.254 c 1.243 0.0 2.25 1.01 2.25 2.254 c 0.0 1.246 -1.007 2.255 -2.25 2.255 c -1.242 0.0 -2.25 -1.01 -2.25 -2.255 Z")
        )
    }.build()
}
