package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DataBaseOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DataBaseOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 c 7.456 0.0 13.5 3.358 13.5 7.5 v 15.288 l -0.005 0.102 c -0.006 0.056 -0.017 0.111 -0.032 0.165 C 30.952 29.938 25.12 33.0 18.0 33.0 c -7.12 0.0 -12.953 -3.062 -13.464 -6.945 C 4.521 26.0 4.511 25.946 4.505 25.89 L 4.5 25.788 V 10.5 C 4.5 6.358 10.544 3.0 18.0 3.0 Z M 6.5 25.5 c 0.0 1.015 0.765 2.354 2.926 3.555 C 11.519 30.218 14.546 31.0 18.0 31.0 c 3.453 0.0 6.48 -0.782 8.574 -1.945 c 2.026 -1.126 2.825 -2.373 2.917 -3.36 L 29.5 25.5 v -3.572 C 27.123 24.07 22.863 25.5 18.0 25.5 s -9.123 -1.43 -11.5 -3.572 V 25.5 Z m 0.0 -7.5 c 0.0 1.015 0.765 2.354 2.926 3.555 C 11.519 22.718 14.546 23.5 18.0 23.5 c 3.453 0.0 6.48 -0.782 8.574 -1.945 c 2.026 -1.126 2.825 -2.373 2.917 -3.36 L 29.5 18.0 v -3.572 C 27.123 16.57 22.863 18.0 18.0 18.0 s -9.123 -1.43 -11.5 -3.572 V 18.0 Z M 18.0 5.0 c -3.453 0.0 -6.48 0.782 -8.574 1.945 C 7.265 8.146 6.5 9.485 6.5 10.5 c 0.0 1.015 0.765 2.354 2.926 3.555 C 11.519 15.218 14.546 16.0 18.0 16.0 c 3.453 0.0 6.48 -0.782 8.574 -1.945 c 2.161 -1.201 2.926 -2.54 2.926 -3.555 c 0.0 -1.015 -0.765 -2.354 -2.926 -3.555 C 24.481 5.782 21.454 5.0 18.0 5.0 Z")
        )
    }.build()
}
