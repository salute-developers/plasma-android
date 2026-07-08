package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoQualityHD36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoQualityHD36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.295 25.5 v -6.107 H 6.308 V 25.5 H 3.0 v -15.0 h 3.308 v 5.679 h 6.987 V 10.5 h 3.307 v 15.0 h -3.307 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.625 10.5 h 4.9 c 5.87 0.0 8.475 2.593 8.475 7.2 c 0.0 5.336 -3.308 7.8 -8.29 7.8 h -5.085 v -15.0 Z m 3.308 11.786 h 1.88 c 3.288 0.0 4.735 -1.715 4.735 -4.329 c 0.0 -2.786 -1.282 -4.243 -4.776 -4.243 h -1.84 v 8.572 Z")
        )
    }.build()
}
