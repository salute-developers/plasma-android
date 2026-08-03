package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UsbCOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UsbCOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 12.0 c -3.314 0.0 -6.0 2.686 -6.0 6.0 c 0.0 3.313 2.686 5.999 6.0 5.999 h 18.0 c 3.313 0.0 5.999 -2.686 5.999 -6.0 c 0.0 -3.313 -2.686 -5.999 -6.0 -5.999 H 9.0 Z m -4.0 6.0 c 0.0 -2.21 1.79 -4.0 4.0 -4.0 h 18.0 c 2.208 0.0 3.999 1.79 3.999 4.0 c 0.0 2.208 -1.79 3.999 -4.0 3.999 H 9.0 c -2.208 0.0 -3.999 -1.79 -3.999 -4.0 Z m 5.055 -1.0 c -0.553 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.551 0.447 1.0 1.0 1.0 h 15.89 c 0.553 0.0 1.0 -0.449 1.0 -1.0 c 0.0 -0.553 -0.447 -1.0 -1.0 -1.0 h -15.89 Z")
        )
    }.build()
}
