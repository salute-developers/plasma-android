package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PramFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PramFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.045 25.706 c 1.807 0.0 3.272 1.464 3.272 3.271 c 0.0 1.808 -1.465 3.272 -3.272 3.272 c -1.807 0.0 -3.272 -1.464 -3.273 -3.272 c 0.0 -1.807 1.466 -3.27 3.273 -3.27 Z m 0.0 2.0 c -0.703 0.0 -1.273 0.57 -1.273 1.271 c 0.0 0.702 0.57 1.272 1.273 1.272 s 1.272 -0.57 1.272 -1.271 c 0.0 -0.702 -0.569 -1.272 -1.272 -1.272 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.469 25.706 c 1.806 0.0 3.272 1.464 3.272 3.271 c 0.0 1.808 -1.466 3.272 -3.272 3.272 c -1.807 0.0 -3.273 -1.464 -3.273 -3.272 c 0.0 -1.807 1.466 -3.27 3.273 -3.27 Z m 0.0 2.0 c -0.704 0.0 -1.273 0.57 -1.273 1.271 c 0.0 0.702 0.57 1.272 1.273 1.272 s 1.272 -0.57 1.272 -1.271 c 0.0 -0.702 -0.569 -1.272 -1.272 -1.272 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.03 3.75 c 5.78 0.0 10.469 4.684 10.469 10.464 c 0.0 0.569 -0.046 1.127 -0.134 1.673 c -0.802 4.984 -5.123 8.79 -10.336 8.79 h -4.545 c -4.914 0.0 -9.038 -3.383 -10.165 -7.948 H 5.5 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 h 14.53 V 4.75 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 Z")
        )
    }.build()
}
