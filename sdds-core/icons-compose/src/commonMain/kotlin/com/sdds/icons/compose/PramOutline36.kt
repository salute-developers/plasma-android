package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PramOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PramOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.03 4.75 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 c 5.78 0.0 10.469 4.684 10.469 10.464 c 0.0 0.569 -0.046 1.127 -0.134 1.673 c -0.802 4.984 -5.123 8.79 -10.336 8.79 h -4.545 c -4.915 0.0 -9.038 -3.384 -10.165 -7.949 H 5.5 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 14.53 V 4.75 Z m 2.0 9.978 h 7.453 c 0.01 -0.17 0.016 -0.341 0.016 -0.514 c 0.0 -4.336 -3.263 -7.911 -7.47 -8.406 v 8.92 Z m 7.089 2.0 H 8.395 c 1.07 3.446 4.288 5.95 8.09 5.95 h 4.544 c 3.802 0.0 7.019 -2.504 8.09 -5.95 Z m -1.65 10.978 c -0.704 0.0 -1.273 0.57 -1.273 1.271 c 0.0 0.702 0.569 1.272 1.272 1.272 c 0.704 0.0 1.273 -0.57 1.273 -1.272 c 0.0 -0.701 -0.57 -1.271 -1.273 -1.271 Z m -3.273 1.271 c 0.0 -1.807 1.465 -3.271 3.272 -3.271 c 1.807 0.0 3.273 1.464 3.273 3.271 c 0.0 1.808 -1.466 3.272 -3.273 3.272 c -1.806 0.0 -3.272 -1.464 -3.272 -3.272 Z m -15.424 0.0 c 0.0 -0.701 0.57 -1.271 1.273 -1.271 s 1.273 0.57 1.273 1.271 c 0.0 0.702 -0.57 1.272 -1.273 1.272 s -1.273 -0.57 -1.273 -1.272 Z m 1.273 -3.271 c -1.807 0.0 -3.273 1.464 -3.273 3.271 c 0.0 1.808 1.466 3.272 3.273 3.272 c 1.807 0.0 3.273 -1.464 3.273 -3.272 c 0.0 -1.807 -1.466 -3.271 -3.273 -3.271 Z")
        )
    }.build()
}
