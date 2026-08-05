package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Code36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Code36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.793 5.331 c 0.16 -0.528 0.719 -0.827 1.248 -0.667 c 0.528 0.16 0.826 0.719 0.666 1.247 l -7.5 24.75 c -0.16 0.529 -0.718 0.827 -1.247 0.667 c -0.528 -0.16 -0.827 -0.718 -0.667 -1.247 l 7.5 -24.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.793 12.04 c 0.39 -0.39 1.024 -0.391 1.414 0.0 c 0.39 0.39 0.39 1.023 0.0 1.413 l -4.543 4.543 l 4.543 4.543 c 0.39 0.39 0.39 1.024 0.0 1.414 c -0.39 0.39 -1.023 0.39 -1.414 0.0 l -5.038 -5.038 c -0.507 -0.507 -0.507 -1.33 0.0 -1.838 l 5.038 -5.038 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.793 12.04 c 0.39 -0.391 1.024 -0.391 1.414 0.0 l 5.038 5.037 c 0.508 0.508 0.508 1.33 0.0 1.838 l -5.038 5.038 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 4.543 -4.543 l -4.543 -4.543 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 Z")
        )
    }.build()
}
