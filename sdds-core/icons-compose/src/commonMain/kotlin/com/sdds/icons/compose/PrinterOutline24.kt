package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PrinterOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PrinterOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 7.0 V 5.0 h 10.0 v 2.0 H 7.0 Z M 5.5 7.0 V 4.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 12.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 3.0 c 1.933 0.0 3.5 1.567 3.5 3.5 V 16.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -2.5 v 3.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 6.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 v -3.0 H 3.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 v -5.5 C 2.0 8.567 3.567 7.0 5.5 7.0 Z m 15.0 8.5 h -2.0 V 14.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 6.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 1.5 h -2.0 v -5.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 13.0 c 1.105 0.0 2.0 0.895 2.0 2.0 v 5.0 Z M 7.0 19.0 h 10.0 v -4.0 H 7.0 v 4.0 Z m 10.5 -7.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z")
        )
    }.build()
}
