package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header436: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header436",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.0 19.074 V 26.0 h 2.25 V 10.0 H 16.0 v 6.36 h -5.285 V 10.0 H 8.5 v 16.0 h 2.215 v -6.926 H 16.0 Z m 3.5 0.846 L 25.475 10.0 h 2.38 v 9.531 H 29.5 v 2.492 h -1.646 V 26.0 H 25.78 v -3.977 H 19.5 V 19.92 Z m 2.361 -0.389 h 3.918 v -6.354 l -3.918 6.354 Z")
        )
    }.build()
}
