package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header236: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header236",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.0 19.074 V 26.0 h 2.25 V 10.0 H 16.0 v 6.446 h -5.285 V 10.0 H 8.5 v 16.0 h 2.215 v -6.926 H 16.0 Z M 19.75 26.0 h 9.0 v -2.595 h -5.623 l 0.774 -0.79 c 3.34 -3.362 4.49 -5.416 4.49 -8.011 c 0.0 -2.776 -1.49 -4.581 -4.264 -4.604 c -1.868 -0.022 -3.32 0.813 -3.962 1.58 v 3.001 c 0.868 -1.196 2.113 -1.85 3.623 -1.827 c 1.415 0.0 2.283 0.88 2.283 2.437 c 0.0 1.624 -0.85 3.294 -6.321 8.868 V 26.0 Z")
        )
    }.build()
}
