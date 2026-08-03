package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RandFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RandFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.355 17.5 H 16.0 v -4.75 h 2.375 c 1.312 0.0 2.375 1.063 2.375 2.375 c 0.0 1.307 -1.055 2.367 -2.36 2.375 h -0.035 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m -3.0 -22.25 c -0.552 0.0 -1.0 0.448 -1.0 1.0 V 24.5 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -5.0 h 1.79 l 3.088 5.49 c 0.271 0.482 0.88 0.652 1.362 0.382 c 0.482 -0.271 0.652 -0.88 0.382 -1.362 l -2.696 -4.793 c 1.65 -0.626 2.824 -2.222 2.824 -4.092 c 0.0 -2.416 -1.959 -4.375 -4.375 -4.375 H 15.0 Z")
        )
    }.build()
}
