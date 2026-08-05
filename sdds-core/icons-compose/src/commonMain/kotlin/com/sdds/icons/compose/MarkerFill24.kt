package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MarkerFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MarkerFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 7.757 19.425 l -3.182 -3.182 l 0.53 -0.53 c 1.71 -1.71 2.334 -2.933 2.553 -3.663 c 0.109 -0.364 0.12 -0.61 0.113 -0.741 v -0.003 l 4.923 4.924 h -0.002 c -0.132 -0.007 -0.378 0.003 -0.742 0.113 c -0.73 0.219 -1.953 0.842 -3.662 2.552 l -0.53 0.53 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 14.121 15.536 L 8.464 9.879 l 7.896 -7.896 c 0.258 -0.257 0.678 -0.506 1.198 -0.437 c 0.66 0.088 1.777 0.465 3.104 1.792 c 1.327 1.327 1.704 2.444 1.792 3.105 c 0.07 0.52 -0.18 0.94 -0.437 1.197 l -7.896 7.896 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 6.166 19.248 l -1.414 -1.414 l -2.121 2.121 l 2.121 0.707 l 1.414 -1.414 Z")
        )
    }.build()
}
