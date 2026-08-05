package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.6 1.0 C 3.44 1.0 2.5 1.94 2.5 3.1 v 10.334 l 0.022 -0.015 v 0.007 v 0.007 v 0.039 c 0.013 0.838 0.69 1.515 1.528 1.527 h 0.039 H 12.8 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 4.092 H 4.064 c -0.297 -0.004 -0.537 -0.245 -0.542 -0.542 V 13.43 v -0.028 c 0.004 -0.241 0.162 -0.445 0.381 -0.515 h 8.095 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 2.5 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 H 4.6 Z")
        )
    }.build()
}
