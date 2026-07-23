package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header416: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header416",
        defaultWidth = 17.dp,
        defaultHeight = 16.dp,
        viewportWidth = 17f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.857 8.47 v 3.03 h 1.0 v -7.0 h -1.0 v 2.783 h -2.5 V 4.5 h -1.0 v 7.0 h 1.0 V 8.47 h 2.5 Z m 1.8 0.37 l 2.869 -4.34 h 1.142 v 4.17 h 0.79 v 1.09 h -0.79 v 1.74 h -0.996 V 9.76 H 9.658 V 8.84 Z m 1.134 -0.17 h 1.88 V 5.89 l -1.88 2.78 Z")
        )
    }.build()
}
