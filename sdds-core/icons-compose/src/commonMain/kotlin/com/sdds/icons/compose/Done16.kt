package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Done16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Done16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.597 3.89 c 0.199 0.192 0.205 0.509 0.013 0.707 l -7.242 7.5 c -0.094 0.098 -0.224 0.153 -0.36 0.153 c -0.135 0.0 -0.265 -0.055 -0.36 -0.153 L 3.89 9.24 C 3.698 9.041 3.704 8.725 3.903 8.533 C 4.1 8.341 4.418 8.347 4.61 8.546 l 2.399 2.484 l 6.881 -7.127 c 0.192 -0.199 0.509 -0.205 0.707 -0.013 Z")
        )
    }.build()
}
