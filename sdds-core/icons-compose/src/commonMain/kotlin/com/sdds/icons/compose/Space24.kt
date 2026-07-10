package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Space24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Space24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 10.99 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.1 c 0.0 0.433 0.0 0.712 0.018 0.924 c 0.017 0.204 0.045 0.28 0.064 0.317 c 0.072 0.14 0.186 0.256 0.328 0.328 c 0.037 0.018 0.112 0.047 0.316 0.063 c 0.212 0.018 0.492 0.018 0.924 0.018 h 13.7 c 0.432 0.0 0.712 0.0 0.924 -0.018 c 0.204 -0.016 0.28 -0.045 0.316 -0.063 c 0.142 -0.072 0.256 -0.187 0.328 -0.328 c 0.02 -0.037 0.047 -0.113 0.064 -0.317 c 0.017 -0.212 0.018 -0.491 0.018 -0.924 v -2.1 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 S 22.0 11.326 22.0 11.74 v 2.13 c 0.0 0.395 0.0 0.736 -0.023 1.017 c -0.024 0.296 -0.078 0.59 -0.222 0.875 c -0.216 0.423 -0.56 0.767 -0.983 0.983 c -0.284 0.145 -0.58 0.198 -0.876 0.222 c -0.28 0.023 -0.622 0.023 -1.017 0.023 H 5.12 c -0.395 0.0 -0.736 0.0 -1.017 -0.023 c -0.297 -0.024 -0.592 -0.077 -0.875 -0.222 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 c -0.144 -0.284 -0.198 -0.579 -0.222 -0.876 C 2.0 14.607 2.0 14.265 2.0 13.87 V 11.74 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
