package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpeedMediumOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpeedMediumOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.83 10.331 c 0.44 -0.441 1.151 -0.441 1.59 0.0 l 7.181 7.214 c 0.388 0.39 0.388 1.02 0.0 1.41 l -7.18 7.214 c -0.44 0.441 -1.152 0.441 -1.591 0.0 c -0.44 -0.442 -0.44 -1.157 0.0 -1.599 l 6.292 -6.32 l -6.292 -6.32 c -0.44 -0.442 -0.44 -1.158 0.0 -1.599 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.33 10.331 c 0.44 -0.441 1.151 -0.441 1.59 0.0 l 7.181 7.214 c 0.388 0.39 0.388 1.02 0.0 1.41 l -7.18 7.214 c -0.44 0.441 -1.152 0.441 -1.591 0.0 c -0.44 -0.442 -0.44 -1.157 0.0 -1.599 l 6.292 -6.32 l -6.292 -6.32 c -0.44 -0.442 -0.44 -1.158 0.0 -1.599 Z")
        )
    }.build()
}
