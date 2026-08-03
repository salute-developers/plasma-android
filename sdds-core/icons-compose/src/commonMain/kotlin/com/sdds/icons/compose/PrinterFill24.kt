package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PrinterFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PrinterFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 3.5 C 5.724 3.5 5.5 3.724 5.5 4.0 v 3.0 C 3.567 7.0 2.0 8.567 2.0 10.5 V 16.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 2.5 v 3.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 12.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -3.0 H 21.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -5.5 C 22.0 8.567 20.433 7.0 18.5 7.0 V 4.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 6.0 Z M 18.5 11.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z M 17.0 5.0 H 7.0 v 2.0 h 10.0 V 5.0 Z M 7.0 19.0 h 10.0 v -4.0 H 7.0 v 4.0 Z")
        )
    }.build()
}
