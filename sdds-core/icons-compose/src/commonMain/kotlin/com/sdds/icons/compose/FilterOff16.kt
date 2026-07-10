package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.232 2.354 c 0.196 -0.196 0.196 -0.512 0.0 -0.708 c -0.195 -0.195 -0.511 -0.195 -0.707 0.0 L 11.172 4.0 H 2.0 C 1.724 4.0 1.5 4.224 1.5 4.5 S 1.724 5.0 2.0 5.0 h 8.172 l -2.5 2.5 H 4.0 C 3.724 7.5 3.5 7.724 3.5 8.0 S 3.724 8.5 4.0 8.5 h 2.672 l -5.026 5.026 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 l 11.88 -11.88 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.495 7.5 l -1.0 1.0 H 12.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 12.276 7.5 12.0 7.5 h -1.505 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.995 11.0 l -1.0 1.0 H 6.0 h 4.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 10.276 11.0 10.0 11.0 H 6.995 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.995 4.0 l -1.0 1.0 H 14.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 14.276 4.0 14.0 4.0 h -0.005 Z")
        )
    }.build()
}
