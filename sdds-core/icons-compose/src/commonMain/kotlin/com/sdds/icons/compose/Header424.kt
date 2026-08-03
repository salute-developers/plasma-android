package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header424: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header424",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.658 12.705 v 4.545 h 1.407 V 6.75 h -1.407 v 4.174 H 6.895 V 6.75 H 5.5 v 10.5 h 1.395 v -4.545 h 3.763 Z m 2.188 0.555 l 4.033 -6.51 h 1.606 v 6.255 h 1.11 v 1.635 h -1.11 v 2.61 h -1.4 v -2.61 h -4.24 v -1.38 Z m 1.594 -0.255 h 2.644 v -4.17 l -2.644 4.17 Z")
        )
    }.build()
}
