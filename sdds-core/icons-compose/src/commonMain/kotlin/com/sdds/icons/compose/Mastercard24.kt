package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Mastercard24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Mastercard24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.363 7.008 C 9.858 8.184 9.05 10.5 9.05 12.0 s 0.526 3.5 2.313 4.907 c -1.0 0.637 -1.98 1.008 -3.276 1.008 c -3.472 0.0 -6.287 -2.667 -6.287 -5.958 C 1.8 8.667 4.615 6.0 8.087 6.0 c 1.296 0.0 2.276 0.371 3.276 1.008 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.863 16.907 c 1.0 0.637 1.668 1.008 2.963 1.008 c 3.473 0.0 6.287 -2.667 6.287 -5.958 C 22.113 8.667 19.3 6.0 15.826 6.0 c -1.295 0.0 -1.962 0.363 -2.963 1.0 c 1.506 1.176 2.325 3.484 2.288 4.992 c -0.038 1.508 -0.782 3.74 -2.288 4.915 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.454 11.957 c 0.0 -1.897 -0.915 -3.587 -2.34 -4.68 c -1.426 1.093 -2.341 2.783 -2.341 4.68 c 0.0 1.898 0.915 3.588 2.34 4.681 c 1.426 -1.093 2.34 -2.783 2.34 -4.68 Z")
        )
    }.build()
}
