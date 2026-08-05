package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2TopRFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2TopRFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.75 3.129 c 1.795 0.0 3.25 1.455 3.25 3.25 v 6.8 c 0.0 1.794 -1.455 3.25 -3.25 3.25 h -6.8 c -1.794 0.0 -3.25 -1.456 -3.25 -3.25 v -6.8 c 0.0 -1.795 1.456 -3.25 3.25 -3.25 h 6.8 Z M 31.0 6.379 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 h -6.8 c -0.69 0.0 -1.25 0.56 -1.25 1.25 v 6.8 c 0.0 0.69 0.56 1.25 1.25 1.25 h 6.8 c 0.69 0.0 1.25 -0.56 1.25 -1.25 v -6.8 Z M 12.426 4.506 c 1.45 0.0 2.625 1.175 2.625 2.625 v 5.296 c 0.0 1.45 -1.175 2.625 -2.625 2.625 H 7.13 c -1.45 0.0 -2.625 -1.175 -2.625 -2.625 V 7.131 c 0.0 -1.45 1.175 -2.625 2.625 -2.625 h 5.296 Z m 2.625 19.197 c 0.0 -1.45 -1.175 -2.625 -2.625 -2.625 H 7.13 c -1.45 0.0 -2.625 1.175 -2.625 2.625 V 29.0 c 0.0 1.45 1.175 2.625 2.625 2.625 h 5.296 c 1.45 0.0 2.625 -1.176 2.625 -2.625 v -5.297 Z m 13.947 -2.625 c 1.45 0.0 2.625 1.175 2.625 2.625 V 29.0 c 0.0 1.45 -1.175 2.625 -2.625 2.625 h -5.296 c -1.45 0.0 -2.625 -1.176 -2.625 -2.625 v -5.297 c 0.0 -1.45 1.175 -2.625 2.625 -2.625 h 5.296 Z")
        )
    }.build()
}
