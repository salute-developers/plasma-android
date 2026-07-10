package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Mastercard36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Mastercard36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.124 10.523 c -2.224 1.776 -3.417 5.275 -3.417 7.541 s 0.777 5.288 3.417 7.413 C 15.646 26.44 14.199 27.0 12.284 27.0 C 7.158 27.0 3.0 22.97 3.0 18.0 s 4.157 -9.0 9.285 -9.0 c 1.913 0.0 3.361 0.561 4.839 1.523 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.34 25.477 C 20.816 26.44 21.801 27.0 23.714 27.0 C 28.843 27.0 33.0 22.97 33.0 18.0 s -4.157 -9.0 -9.285 -9.0 c -1.913 0.0 -2.898 0.549 -4.376 1.51 c 2.224 1.777 3.433 5.264 3.378 7.542 c -0.055 2.278 -1.154 5.65 -3.378 7.425 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.688 18.0 c 0.0 -2.866 -1.35 -5.42 -3.456 -7.071 c -2.106 1.65 -3.457 4.205 -3.457 7.071 c 0.0 2.866 1.35 5.42 3.457 7.071 c 2.105 -1.65 3.456 -4.205 3.456 -7.071 Z")
        )
    }.build()
}
