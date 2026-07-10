package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareScreenMobileFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareScreenMobileFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 2.0 5.75 C 2.0 4.231 3.231 3.0 4.75 3.0 h 14.5 C 20.769 3.0 22.0 4.231 22.0 5.75 v 10.5 c 0.0 1.434 -1.098 2.613 -2.5 2.739 V 11.5 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 h -5.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 V 19.0 H 4.75 C 3.231 19.0 2.0 17.769 2.0 16.25 V 5.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.109 11.546 C 12.0 11.76 12.0 12.04 12.0 12.6 v 6.8 c 0.0 0.56 0.0 0.84 0.109 1.054 c 0.096 0.188 0.249 0.341 0.437 0.437 C 12.76 21.0 13.04 21.0 13.6 21.0 h 2.8 c 0.56 0.0 0.84 0.0 1.054 -0.109 c 0.188 -0.096 0.341 -0.249 0.437 -0.437 C 18.0 20.24 18.0 19.96 18.0 19.4 v -6.8 c 0.0 -0.56 0.0 -0.84 -0.109 -1.054 c -0.096 -0.188 -0.249 -0.341 -0.437 -0.437 C 17.24 11.0 16.96 11.0 16.4 11.0 h -2.8 c -0.56 0.0 -0.84 0.0 -1.054 0.109 c -0.188 0.096 -0.341 0.249 -0.437 0.437 Z")
        )
    }.build()
}
