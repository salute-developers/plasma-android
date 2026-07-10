package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PrinterOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PrinterOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.25 10.477 V 7.25 h 15.5 v 3.227 h -15.5 Z M 8.25 6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 18.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 4.5 c 2.9 0.0 5.25 2.35 5.25 5.25 V 24.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 h -3.75 V 30.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 H 9.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -4.5 H 4.5 C 3.672 25.5 3.0 24.828 3.0 24.0 v -8.25 c 0.0 -2.9 2.35 -5.25 5.25 -5.25 V 6.0 Z M 31.0 23.5 h -3.25 V 21.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 9.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 2.5 H 5.0 v -7.75 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 h 19.5 c 1.795 0.0 3.25 1.455 3.25 3.25 v 7.75 Z m -20.75 5.25 h 15.5 v -6.5 h -15.5 v 6.5 Z m 16.0 -10.75 c 0.828 0.0 1.5 -0.672 1.5 -1.5 s -0.672 -1.5 -1.5 -1.5 s -1.5 0.672 -1.5 1.5 s 0.672 1.5 1.5 1.5 Z")
        )
    }.build()
}
