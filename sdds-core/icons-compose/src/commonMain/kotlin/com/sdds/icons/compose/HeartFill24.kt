package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.963 4.0 C 4.888 4.0 3.0 6.648 3.0 8.82 c 0.0 3.865 3.674 7.503 7.108 10.216 c 0.718 0.567 1.077 0.85 1.53 0.975 c 0.376 0.103 0.848 0.103 1.223 0.0 c 0.454 -0.124 0.813 -0.408 1.53 -0.975 c 3.435 -2.713 7.109 -6.35 7.109 -10.216 C 21.5 6.648 19.613 4.0 16.537 4.0 c -1.718 0.0 -3.186 1.348 -4.287 2.629 C 11.149 5.349 9.681 4.0 7.963 4.0 Z")
        )
    }.build()
}
