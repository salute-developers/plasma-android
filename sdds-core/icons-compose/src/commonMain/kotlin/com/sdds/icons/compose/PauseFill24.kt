package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PauseFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PauseFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 17.85 c 0.0 0.84 0.0 1.26 -0.163 1.581 c -0.144 0.282 -0.374 0.512 -0.656 0.655 c -0.32 0.164 -0.74 0.164 -1.581 0.164 h -0.2 c -0.84 0.0 -1.26 0.0 -1.581 -0.163 c -0.282 -0.144 -0.512 -0.374 -0.655 -0.656 C 13.0 19.111 13.0 18.691 13.0 17.85 V 6.15 c 0.0 -0.84 0.0 -1.26 0.164 -1.581 c 0.143 -0.282 0.373 -0.512 0.655 -0.656 c 0.32 -0.163 0.74 -0.163 1.581 -0.163 h 0.2 c 0.84 0.0 1.26 0.0 1.581 0.163 c 0.282 0.144 0.512 0.374 0.655 0.656 C 18.0 4.889 18.0 5.309 18.0 6.15 v 11.7 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 6.15 c 0.0 -0.84 0.0 -1.26 0.163 -1.581 c 0.144 -0.282 0.374 -0.512 0.656 -0.656 C 7.139 3.75 7.559 3.75 8.4 3.75 h 0.2 c 0.84 0.0 1.26 0.0 1.581 0.163 c 0.282 0.144 0.512 0.374 0.655 0.656 C 11.0 4.889 11.0 5.309 11.0 6.15 v 11.7 c 0.0 0.84 0.0 1.26 -0.164 1.581 c -0.143 0.282 -0.373 0.512 -0.655 0.655 c -0.32 0.164 -0.74 0.164 -1.581 0.164 H 8.4 c -0.84 0.0 -1.26 0.0 -1.581 -0.163 c -0.282 -0.144 -0.512 -0.374 -0.656 -0.656 C 6.0 19.111 6.0 18.691 6.0 17.85 V 6.15 Z")
        )
    }.build()
}
