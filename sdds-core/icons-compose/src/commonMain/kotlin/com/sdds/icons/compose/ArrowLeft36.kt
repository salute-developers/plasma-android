package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowLeft36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowLeft36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.184 27.454 c 0.391 0.39 1.024 0.39 1.415 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 l -7.116 -7.115 h 23.284 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 H 7.627 L 14.6 9.953 c 0.39 -0.39 0.39 -1.023 0.0 -1.414 c -0.39 -0.39 -1.024 -0.39 -1.415 0.0 l -8.59 8.591 c -0.48 0.479 -0.48 1.254 0.0 1.733 l 8.59 8.591 Z")
        )
    }.build()
}
