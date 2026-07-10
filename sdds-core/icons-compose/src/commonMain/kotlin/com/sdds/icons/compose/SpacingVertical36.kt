package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpacingVertical36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpacingVertical36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.25 30.5 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 6.75 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 22.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.996 8.692 c 0.274 0.0 0.536 0.11 0.726 0.308 l 4.91 5.118 c 0.383 0.399 0.37 1.032 -0.027 1.414 c -0.399 0.383 -1.032 0.37 -1.415 -0.03 L 19.0 12.18 v 11.448 l 3.21 -3.151 c 0.395 -0.387 1.028 -0.38 1.415 0.013 c 0.387 0.394 0.381 1.027 -0.013 1.414 L 18.7 26.725 c -0.39 0.383 -1.018 0.381 -1.406 -0.005 l -4.838 -4.822 c -0.391 -0.39 -0.393 -1.023 -0.003 -1.415 c 0.39 -0.39 1.023 -0.391 1.414 -0.002 L 17.0 23.602 V 12.205 l -3.111 3.292 c -0.38 0.401 -1.013 0.42 -1.414 0.04 s -0.42 -1.012 -0.04 -1.413 l 4.838 -5.12 c 0.188 -0.198 0.45 -0.31 0.723 -0.312 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.25 3.5 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 6.75 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 22.5 Z")
        )
    }.build()
}
