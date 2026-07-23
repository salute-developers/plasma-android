package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Sum36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Sum36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.783 7.653 C 8.138 6.908 8.667 5.75 9.653 5.75 h 16.02 c 0.636 0.0 1.15 0.515 1.15 1.15 v 1.618 c 0.0 0.552 -0.447 1.0 -1.0 1.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 V 7.75 H 13.043 l 7.555 9.616 c 0.052 0.062 0.095 0.13 0.129 0.202 c 0.13 0.273 0.129 0.587 0.005 0.854 c -0.034 0.072 -0.076 0.141 -0.128 0.204 l -7.402 9.624 h 11.623 v -0.768 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 V 29.1 c 0.0 0.635 -0.515 1.15 -1.15 1.15 H 9.652 c -0.985 0.0 -1.514 -1.159 -0.869 -1.903 L 17.75 18.0 L 8.783 7.653 Z")
        )
    }.build()
}
