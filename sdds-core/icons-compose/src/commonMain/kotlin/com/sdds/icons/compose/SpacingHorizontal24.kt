package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpacingHorizontal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpacingHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 3.75 c 0.414 0.0 0.75 0.336 0.75 0.75 v 15.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -15.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.0 3.75 c 0.414 0.0 0.75 0.336 0.75 0.75 v 15.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -15.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.6 8.19 c 0.296 -0.29 0.77 -0.285 1.061 0.01 l 3.215 3.275 c 0.288 0.293 0.286 0.763 -0.004 1.054 l -3.215 3.226 c -0.292 0.293 -0.767 0.294 -1.06 0.002 c -0.293 -0.293 -0.294 -0.767 -0.002 -1.06 l 1.94 -1.947 H 8.348 l 2.042 1.93 c 0.3 0.285 0.313 0.76 0.029 1.061 c -0.285 0.3 -0.76 0.314 -1.06 0.03 l -3.413 -3.226 c -0.149 -0.141 -0.233 -0.337 -0.234 -0.542 c 0.0 -0.205 0.082 -0.402 0.23 -0.544 l 3.412 -3.274 c 0.3 -0.287 0.774 -0.278 1.061 0.021 c 0.287 0.299 0.277 0.774 -0.021 1.06 L 8.327 11.25 h 7.225 L 13.59 9.251 c -0.29 -0.296 -0.286 -0.77 0.01 -1.06 Z")
        )
    }.build()
}
