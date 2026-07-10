package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PrinterOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PrinterOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.45 4.47 V 3.008 h 7.1 V 4.47 h -7.1 Z m -1.0 -2.117 C 3.45 2.158 3.605 2.0 3.8 2.0 h 8.4 c 0.193 0.0 0.35 0.158 0.35 0.353 V 4.47 c 1.352 0.0 2.45 1.106 2.45 2.47 v 3.883 c 0.0 0.39 -0.313 0.706 -0.7 0.706 h -1.75 v 2.117 c 0.0 0.195 -0.158 0.353 -0.35 0.353 H 3.8 c -0.194 0.0 -0.35 -0.158 -0.35 -0.353 V 11.53 H 1.7 c -0.387 0.0 -0.7 -0.316 -0.7 -0.706 V 6.94 c 0.0 -1.364 1.096 -2.47 2.45 -2.47 V 2.353 Z M 14.0 10.52 h -1.45 v -1.11 c 0.0 -0.194 -0.158 -0.352 -0.35 -0.352 H 3.8 c -0.194 0.0 -0.35 0.158 -0.35 0.353 v 1.11 H 2.0 v -3.58 c 0.0 -0.808 0.65 -1.463 1.45 -1.463 h 9.1 c 0.8 0.0 1.45 0.655 1.45 1.462 v 3.58 Z m -9.55 -0.454 v 2.925 h 7.1 v -2.925 h -7.1 Z M 11.85 8.0 c 0.387 0.0 0.7 -0.316 0.7 -0.706 c 0.0 -0.39 -0.313 -0.705 -0.7 -0.705 c -0.386 0.0 -0.7 0.316 -0.7 0.705 c 0.0 0.39 0.314 0.706 0.7 0.706 Z")
        )
    }.build()
}
