package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DataBaseFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DataBaseFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.462 21.188 c 0.025 0.185 0.038 0.373 0.038 0.562 v 4.5 c 0.0 4.142 -6.044 7.5 -13.5 7.5 s -13.5 -3.358 -13.5 -7.5 v -4.5 c 0.0 -0.19 0.012 -0.377 0.037 -0.563 c 0.518 3.88 6.348 6.938 13.463 6.938 c 7.115 0.0 12.944 -3.058 13.462 -6.938 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.462 13.313 c 0.025 0.185 0.038 0.373 0.038 0.562 v 4.5 c 0.0 4.142 -6.044 7.5 -13.5 7.5 s -13.5 -3.358 -13.5 -7.5 v -4.5 c 0.0 -0.19 0.012 -0.377 0.037 -0.563 c 0.518 3.88 6.348 6.938 13.463 6.938 c 7.115 0.0 12.944 -3.058 13.462 -6.938 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 3.0 c 7.456 0.0 13.5 3.358 13.5 7.5 c 0.0 4.142 -6.044 7.5 -13.5 7.5 S 4.5 14.642 4.5 10.5 C 4.5 6.358 10.544 3.0 18.0 3.0 Z")
        )
    }.build()
}
