package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CapsuleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CapsuleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.357 9.616 L 6.384 5.643 L 9.156 2.87 c 1.097 -1.098 2.876 -1.098 3.973 0.0 c 1.098 1.097 1.098 2.876 0.0 3.973 l -2.772 2.772 Z M 13.87 2.13 c -1.506 -1.507 -3.948 -1.507 -5.455 0.0 L 2.13 8.415 c -1.507 1.507 -1.507 3.949 0.0 5.455 c 1.506 1.507 3.948 1.507 5.455 0.0 l 6.285 -6.285 c 1.507 -1.507 1.507 -3.949 0.0 -5.455 Z M 5.556 8.873 c 0.29 0.0 0.524 -0.235 0.524 -0.524 c 0.0 -0.29 -0.235 -0.524 -0.524 -0.524 c -0.29 0.0 -0.524 0.235 -0.524 0.524 c 0.0 0.29 0.235 0.524 0.524 0.524 Z m -1.572 1.572 c 0.0 0.29 -0.234 0.524 -0.524 0.524 c -0.289 0.0 -0.524 -0.235 -0.524 -0.524 c 0.0 -0.29 0.235 -0.524 0.524 -0.524 c 0.29 0.0 0.524 0.235 0.524 0.524 Z m 3.667 0.524 c 0.289 0.0 0.523 -0.235 0.523 -0.524 c 0.0 -0.29 -0.234 -0.524 -0.523 -0.524 c -0.29 0.0 -0.524 0.235 -0.524 0.524 c 0.0 0.29 0.234 0.524 0.524 0.524 Z m -1.571 1.57 c 0.0 0.29 -0.235 0.524 -0.524 0.524 c -0.29 0.0 -0.524 -0.234 -0.524 -0.523 c 0.0 -0.29 0.235 -0.524 0.524 -0.524 c 0.29 0.0 0.524 0.234 0.524 0.524 Z m -0.524 -1.57 c 0.29 0.0 0.524 -0.235 0.524 -0.524 c 0.0 -0.29 -0.235 -0.524 -0.524 -0.524 c -0.29 0.0 -0.524 0.235 -0.524 0.524 c 0.0 0.29 0.235 0.524 0.524 0.524 Z")
        )
    }.build()
}
