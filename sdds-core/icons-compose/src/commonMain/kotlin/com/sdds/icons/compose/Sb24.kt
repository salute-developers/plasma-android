package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Sb24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Sb24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 4.31 c -1.982 0.0 -3.792 0.753 -5.157 1.99 C 5.29 7.708 4.311 9.741 4.31 12.0 c 0.0 1.982 0.755 3.792 1.99 5.157 h 0.001 c 1.408 1.554 3.442 2.533 5.7 2.533 c 1.982 0.0 3.792 -0.755 5.157 -1.99 v -0.002 c 1.554 -1.408 2.532 -3.441 2.532 -5.7 l -0.003 -0.204 l 2.153 -1.586 C 21.945 10.79 22.0 11.388 22.0 12.0 c 0.0 2.761 -1.12 5.262 -2.93 7.07 l 0.001 0.001 c -1.81 1.81 -4.31 2.929 -7.07 2.929 h -0.025 c -2.752 -0.007 -5.242 -1.125 -7.046 -2.93 l -0.001 0.001 C 3.119 17.261 2.0 14.761 2.0 12.0 s 1.119 -5.261 2.928 -7.07 c 1.81 -1.811 4.31 -2.93 7.072 -2.93 c 2.38 0.0 4.565 0.83 6.281 2.218 l -1.945 1.434 C 15.2 4.873 13.846 4.39 12.384 4.32 l -0.206 -0.008 l -0.177 -0.002 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.112 7.873 c -0.323 -0.71 -0.726 -1.377 -1.198 -1.987 L 12.0 11.718 L 8.194 9.33 v 2.871 L 12.0 14.59 l 9.11 -6.716 Z")
        )
    }.build()
}
