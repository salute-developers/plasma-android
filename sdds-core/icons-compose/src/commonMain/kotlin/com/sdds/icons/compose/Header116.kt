package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header116: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header116",
        defaultWidth = 17.dp,
        defaultHeight = 16.dp,
        viewportWidth = 17f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.429 8.47 v 3.03 h 1.0 v -7.0 h -1.0 v 2.82 h -2.5 V 4.5 h -1.0 v 7.0 h 1.0 V 8.47 h 2.5 Z m 2.0 -1.604 l 1.445 -1.082 v 4.783 H 9.429 V 11.5 h 3.5 v -0.933 h -1.05 V 4.5 h -1.005 L 9.429 5.649 v 1.217 Z")
        )
    }.build()
}
