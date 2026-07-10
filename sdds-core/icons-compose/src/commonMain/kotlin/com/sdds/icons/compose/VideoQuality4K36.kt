package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoQuality4K36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoQuality4K36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.75 19.457 l 6.653 -8.957 h 3.39 v 8.786 h 1.653 v 2.85 h -1.653 V 25.5 h -3.2 v -3.364 H 3.75 v -2.679 Z m 3.2 -0.171 h 3.644 v -4.779 l -3.645 4.779 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.423 19.393 V 25.5 h -3.39 v -15.0 h 3.39 v 5.957 h 1.95 l 3.855 -5.957 h 4.026 l -4.958 7.029 L 32.25 25.5 h -4.28 l -4.407 -6.107 h -2.14 Z")
        )
    }.build()
}
