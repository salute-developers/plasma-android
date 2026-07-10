package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.97 2.0 C 8.224 2.0 7.655 2.688 7.773 3.448 L 8.489 8.06 c 0.073 0.473 -0.045 0.956 -0.326 1.337 L 6.1 12.189 C 5.25 13.341 6.046 15.0 7.45 15.0 h 3.547 v 5.5 L 12.0 22.0 l 1.003 -1.5 V 15.0 h 3.547 c 1.404 0.0 2.2 -1.659 1.35 -2.81 l -2.063 -2.792 c -0.281 -0.381 -0.399 -0.865 -0.326 -1.337 l 0.716 -4.614 C 16.345 2.688 15.777 2.0 15.03 2.0 H 8.97 Z")
        )
    }.build()
}
