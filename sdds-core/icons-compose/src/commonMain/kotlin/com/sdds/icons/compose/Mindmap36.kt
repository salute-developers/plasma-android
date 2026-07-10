package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Mindmap36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Mindmap36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.594 8.0 c -1.326 0.0 -2.405 1.078 -2.405 2.413 c 0.0 1.335 1.08 2.413 2.405 2.413 c 1.326 0.0 2.405 -1.078 2.405 -2.413 C 31.0 9.078 29.92 8.0 28.594 8.0 Z m -8.346 3.41 h 4.054 c 0.45 1.955 2.2 3.416 4.292 3.416 c 2.435 0.0 4.405 -1.978 4.405 -4.413 C 33.0 7.978 31.03 6.0 28.594 6.0 c -2.09 0.0 -3.837 1.457 -4.29 3.41 h -4.056 c -1.795 0.0 -3.25 1.454 -3.25 3.25 v 4.338 h -5.302 c -0.452 -1.954 -2.2 -3.413 -4.291 -3.413 C 4.97 13.585 3.0 15.563 3.0 17.998 c 0.0 2.435 1.97 4.413 4.405 4.413 c 2.091 0.0 3.839 -1.459 4.291 -3.413 h 5.302 v 4.336 c 0.0 1.795 1.455 3.25 3.25 3.25 h 4.055 c 0.452 1.955 2.2 3.414 4.291 3.414 c 2.435 0.0 4.405 -1.978 4.405 -4.413 c 0.0 -2.435 -1.97 -4.413 -4.405 -4.413 c -2.09 0.0 -3.838 1.458 -4.29 3.412 h -4.056 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 V 12.66 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 Z M 5.0 17.997 c 0.0 -1.335 1.079 -2.413 2.405 -2.413 c 1.326 0.0 2.405 1.078 2.405 2.413 c 0.0 1.335 -1.08 2.413 -2.405 2.413 C 6.079 20.411 5.0 19.333 5.0 17.998 Z m 21.19 7.587 c 0.0 -1.335 1.078 -2.413 2.404 -2.413 c 1.326 0.0 2.405 1.078 2.405 2.413 c 0.0 1.335 -1.079 2.413 -2.405 2.413 c -1.326 0.0 -2.405 -1.078 -2.405 -2.413 Z")
        )
    }.build()
}
