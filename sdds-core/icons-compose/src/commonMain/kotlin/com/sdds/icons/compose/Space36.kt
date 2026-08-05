package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Space36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Space36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 18.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 2.75 c 0.0 0.717 0.0 1.194 0.03 1.56 c 0.03 0.356 0.081 0.518 0.133 0.621 c 0.144 0.282 0.374 0.512 0.656 0.655 c 0.103 0.053 0.265 0.104 0.62 0.133 C 6.806 24.75 7.283 24.75 8.0 24.75 h 20.0 c 0.717 0.0 1.194 0.0 1.56 -0.03 c 0.356 -0.03 0.518 -0.081 0.621 -0.133 c 0.282 -0.144 0.512 -0.374 0.655 -0.656 c 0.053 -0.103 0.104 -0.265 0.133 -0.62 C 31.0 22.944 31.0 22.467 31.0 21.75 V 19.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 2.79 c 0.0 0.666 0.0 1.226 -0.037 1.683 c -0.04 0.48 -0.124 0.934 -0.345 1.366 c -0.335 0.659 -0.87 1.194 -1.529 1.53 c -0.432 0.22 -0.887 0.305 -1.366 0.344 c -0.457 0.037 -1.017 0.037 -1.683 0.037 H 7.96 c -0.666 0.0 -1.226 0.0 -1.683 -0.037 c -0.48 -0.04 -0.934 -0.124 -1.366 -0.345 c -0.659 -0.335 -1.194 -0.87 -1.53 -1.529 c -0.22 -0.432 -0.304 -0.887 -0.344 -1.366 C 3.0 23.016 3.0 22.456 3.0 21.79 V 19.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
    }.build()
}
