package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WifiDefault36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WifiDefault36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.875 23.04 c 2.072 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.678 3.75 -3.75 3.75 c -2.07 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.875 15.5 c 3.05 0.0 5.976 1.212 8.132 3.368 c 0.39 0.39 0.39 1.024 0.0 1.414 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -1.781 -1.781 -4.198 -2.782 -6.718 -2.782 c -2.52 0.0 -4.936 1.0 -6.717 2.782 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 c 2.156 -2.156 5.081 -3.368 8.131 -3.368 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 10.375 c 4.244 0.0 8.313 1.686 11.314 4.687 c 0.39 0.39 0.39 1.023 0.0 1.414 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -2.626 -2.626 -6.187 -4.1 -9.9 -4.101 c -3.713 0.0 -7.274 1.475 -9.9 4.1 c -0.39 0.391 -1.023 0.39 -1.413 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 c 3.0 -3.0 7.07 -4.686 11.313 -4.686 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.875 5.0 c 5.437 0.0 10.652 2.16 14.496 6.004 c 0.39 0.39 0.39 1.024 0.0 1.415 c -0.39 0.39 -1.024 0.39 -1.415 0.0 C 27.487 8.949 22.782 7.0 17.876 7.0 c -4.907 0.0 -9.612 1.95 -13.082 5.419 c -0.39 0.39 -1.024 0.39 -1.415 0.0 c -0.39 -0.39 -0.39 -1.025 0.0 -1.415 C 7.224 7.159 12.44 5.0 17.875 5.0 Z")
        )
    }.build()
}
