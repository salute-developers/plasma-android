package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColorFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColorFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.556 11.098 c 0.248 -0.175 0.584 -0.056 0.717 0.216 c 0.944 1.919 2.68 3.356 4.747 3.916 c 0.63 0.18 1.29 0.27 1.98 0.27 c 0.487 0.0 0.954 -0.046 1.407 -0.13 c 0.289 -0.055 0.575 0.13 0.588 0.423 C 13.998 15.863 14.0 15.932 14.0 16.0 c 0.0 1.77 -0.77 3.37 -2.0 4.46 C 10.94 21.42 9.54 22.0 8.0 22.0 c -3.31 0.0 -6.0 -2.69 -6.0 -6.0 c 0.0 -2.025 1.014 -3.818 2.556 -4.902 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.727 11.315 c 0.133 -0.272 0.47 -0.392 0.718 -0.217 C 20.986 12.182 22.0 13.976 22.0 16.0 c 0.0 3.31 -2.69 6.0 -6.0 6.0 c -0.745 0.0 -1.461 -0.136 -2.12 -0.386 c -0.318 -0.12 -0.377 -0.529 -0.155 -0.788 C 14.867 19.494 15.5 17.786 15.5 16.0 c 0.0 -0.34 -0.03 -0.68 -0.08 -1.0 c -0.03 -0.184 0.064 -0.366 0.228 -0.456 c 1.323 -0.733 2.405 -1.856 3.079 -3.229 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 2.0 c 3.31 0.0 6.0 2.69 6.0 6.0 c 0.0 0.78 -0.15 1.53 -0.42 2.21 c -0.69 1.74 -2.17 3.08 -4.0 3.58 C 13.08 13.93 12.55 14.0 12.0 14.0 s -1.08 -0.07 -1.58 -0.21 c -1.83 -0.5 -3.31 -1.84 -4.0 -3.58 C 6.15 9.53 6.0 8.78 6.0 8.0 c 0.0 -3.31 2.69 -6.0 6.0 -6.0 Z")
        )
    }.build()
}
