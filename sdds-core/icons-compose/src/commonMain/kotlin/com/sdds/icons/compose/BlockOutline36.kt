package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlockOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlockOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.541 8.127 l 18.33 18.33 c 4.386 -5.107 4.16 -12.81 -0.68 -17.65 c -4.838 -4.838 -12.542 -5.065 -17.65 -0.68 Z m 16.916 19.745 L 8.128 9.542 c -4.385 5.107 -4.158 12.81 0.68 17.65 c 4.84 4.838 12.543 5.065 17.65 0.68 Z M 7.394 7.393 c 5.858 -5.857 15.355 -5.857 21.213 0.0 c 5.857 5.858 5.857 15.355 0.0 21.213 c -5.858 5.857 -15.355 5.857 -21.213 0.0 c -5.857 -5.858 -5.857 -15.355 0.0 -21.213 Z")
        )
    }.build()
}
