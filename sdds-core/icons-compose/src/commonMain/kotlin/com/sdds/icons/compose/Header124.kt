package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header124: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header124",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.658 12.705 v 4.545 h 1.407 V 6.75 h -1.407 v 4.23 H 6.895 V 6.75 H 5.5 v 10.5 h 1.395 v -4.545 h 3.763 Z m 2.787 -2.405 l 2.065 -1.624 v 7.174 h -2.065 v 1.4 h 5.0 v -1.4 h -1.5 v -9.1 H 15.51 l -2.065 1.723 v 1.826 Z")
        )
    }.build()
}
