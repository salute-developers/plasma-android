package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header136: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header136",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.0 19.074 V 26.0 h 2.25 V 10.0 H 16.0 v 6.446 h -5.285 V 10.0 H 8.5 v 16.0 h 2.215 v -6.926 H 16.0 Z m 4.25 -3.665 l 3.097 -2.475 v 10.933 H 20.25 V 26.0 h 7.5 v -2.133 H 25.5 V 10.0 h -2.153 l -3.097 2.625 v 2.784 Z")
        )
    }.build()
}
