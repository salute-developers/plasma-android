package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AdjustWidth36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AdjustWidth36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.5 17.969 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 6.246 l -2.441 -2.362 c -0.397 -0.383 -0.408 -1.017 -0.024 -1.414 c 0.384 -0.396 1.017 -0.407 1.414 -0.023 l 4.22 4.08 c 0.194 0.188 0.304 0.448 0.304 0.719 c 0.0 0.27 -0.111 0.53 -0.306 0.718 l -4.218 4.076 l -0.077 0.067 c -0.398 0.314 -0.977 0.28 -1.337 -0.092 s -0.373 -0.951 -0.046 -1.339 l 0.07 -0.074 l 2.438 -2.356 H 22.5 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.0 8.969 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 s 1.0 0.447 1.0 1.0 v 18.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.781 17.969 c 0.0 -0.271 0.11 -0.53 0.305 -0.719 l 4.219 -4.08 c 0.397 -0.384 1.03 -0.373 1.414 0.023 c 0.384 0.397 0.373 1.03 -0.024 1.414 L 7.254 16.97 H 13.5 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 7.257 l 2.437 2.356 l 0.07 0.074 c 0.328 0.387 0.314 0.967 -0.045 1.34 c -0.384 0.396 -1.016 0.407 -1.413 0.024 l -4.22 -4.076 C 3.893 18.5 3.782 18.24 3.782 17.97 Z")
        )
    }.build()
}
