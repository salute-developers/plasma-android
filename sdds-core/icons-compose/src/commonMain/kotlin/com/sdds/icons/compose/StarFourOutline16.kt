package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarFourOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarFourOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.802 1.842 c 0.394 -1.067 1.903 -1.067 2.298 0.0 l 1.311 3.545 c 0.018 0.047 0.056 0.085 0.104 0.102 l 3.544 1.312 c 1.066 0.394 1.066 1.903 0.0 2.298 l -3.544 1.311 c -0.048 0.018 -0.086 0.056 -0.104 0.104 L 9.1 14.058 c -0.395 1.066 -1.903 1.066 -2.298 0.0 L 5.49 10.514 c -0.017 -0.048 -0.055 -0.086 -0.102 -0.104 L 1.843 9.1 c -1.066 -0.395 -1.067 -1.904 0.0 -2.298 l 3.545 -1.312 C 5.435 5.471 5.473 5.434 5.49 5.387 l 1.312 -3.545 Z m 1.313 0.364 c -0.056 -0.152 -0.271 -0.152 -0.328 0.0 L 6.476 5.751 c -0.124 0.335 -0.389 0.6 -0.724 0.724 L 2.207 7.786 c -0.152 0.057 -0.152 0.272 0.0 0.328 l 3.545 1.312 c 0.335 0.124 0.6 0.388 0.724 0.723 l 1.311 3.544 c 0.057 0.153 0.272 0.153 0.328 0.0 l 1.312 -3.544 c 0.124 -0.335 0.388 -0.6 0.723 -0.723 l 3.544 -1.312 c 0.153 -0.056 0.153 -0.271 0.0 -0.328 L 10.15 6.475 C 9.815 6.35 9.551 6.086 9.427 5.75 L 8.115 2.206 Z")
        )
    }.build()
}
