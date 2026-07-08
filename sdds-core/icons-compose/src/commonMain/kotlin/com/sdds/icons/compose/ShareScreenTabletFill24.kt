package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareScreenTabletFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareScreenTabletFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 2.0 5.75 C 2.0 4.231 3.231 3.0 4.75 3.0 h 14.5 C 20.769 3.0 22.0 4.231 22.0 5.75 v 5.75 H 11.5 c -1.105 0.0 -2.0 0.895 -2.0 2.0 V 19.0 H 4.75 C 3.231 19.0 2.0 17.769 2.0 16.25 V 5.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 11.109 13.546 C 11.0 13.76 11.0 14.04 11.0 14.6 v 4.8 c 0.0 0.56 0.0 0.84 0.109 1.054 c 0.096 0.188 0.249 0.341 0.437 0.437 C 11.76 21.0 12.04 21.0 12.6 21.0 h 7.8 c 0.56 0.0 0.84 0.0 1.054 -0.109 c 0.188 -0.096 0.341 -0.249 0.437 -0.437 C 22.0 20.24 22.0 19.96 22.0 19.4 v -4.8 c 0.0 -0.56 0.0 -0.84 -0.109 -1.054 c -0.096 -0.188 -0.249 -0.341 -0.437 -0.437 C 21.24 13.0 20.96 13.0 20.4 13.0 h -7.8 c -0.56 0.0 -0.84 0.0 -1.054 0.109 c -0.188 0.096 -0.341 0.249 -0.437 0.437 Z")
        )
    }.build()
}
