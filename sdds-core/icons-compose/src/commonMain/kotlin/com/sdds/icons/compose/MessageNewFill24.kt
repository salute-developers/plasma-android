package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageNewFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageNewFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.95 11.762 c 0.0 -4.577 3.71 -8.287 8.287 -8.287 c 1.414 0.0 2.745 0.354 3.91 0.978 C 14.871 5.122 14.0 6.46 14.0 8.0 c 0.0 2.209 1.79 4.0 4.0 4.0 c 0.946 0.0 1.815 -0.329 2.5 -0.878 c 0.016 0.211 0.024 0.425 0.024 0.64 c 0.0 4.577 -3.71 8.288 -8.287 8.288 c -0.985 0.0 -1.931 -0.172 -2.809 -0.489 c -0.527 -0.19 -1.044 -0.244 -1.5 -0.116 l -2.503 0.7 c -0.957 0.268 -1.84 -0.614 -1.572 -1.571 l 0.701 -2.503 c 0.128 -0.456 0.073 -0.973 -0.117 -1.5 c -0.316 -0.878 -0.488 -1.824 -0.488 -2.809 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.125 10.475 c 1.45 0.0 2.625 -1.176 2.625 -2.625 c 0.0 -1.45 -1.175 -2.625 -2.625 -2.625 S 15.5 6.4 15.5 7.85 s 1.175 2.625 2.625 2.625 Z")
        )
    }.build()
}
