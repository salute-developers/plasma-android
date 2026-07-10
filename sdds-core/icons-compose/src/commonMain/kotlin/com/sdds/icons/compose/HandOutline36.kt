package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.883 5.5 c -0.481 0.0 -0.873 0.39 -0.873 0.875 V 16.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 8.625 c 0.0 -0.484 -0.392 -0.875 -0.873 -0.875 c -0.48 0.0 -0.873 0.39 -0.873 0.875 v 12.74 c 0.0 0.486 -0.348 0.9 -0.826 0.985 c -0.478 0.084 -0.948 -0.187 -1.114 -0.643 l -1.88 -5.175 c -0.166 -0.454 -0.667 -0.687 -1.12 -0.522 c -0.452 0.165 -0.686 0.667 -0.521 1.122 l 2.947 8.104 c 1.51 4.153 6.094 6.292 10.24 4.782 c 3.22 -1.174 5.232 -4.207 5.26 -7.452 L 27.247 22.5 v -8.25 c 0.0 -0.484 -0.392 -0.875 -0.872 -0.875 c -0.482 0.0 -0.873 0.39 -0.873 0.875 v 4.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 V 9.375 c 0.0 -0.484 -0.392 -0.875 -0.873 -0.875 s -0.873 0.39 -0.873 0.875 v 8.25 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 V 6.375 c 0.0 -0.484 -0.392 -0.875 -0.873 -0.875 Z m 2.873 1.135 v -0.26 c 0.0 -1.587 -1.285 -2.875 -2.873 -2.875 c -1.425 0.0 -2.607 1.038 -2.834 2.398 c -0.286 -0.096 -0.593 -0.148 -0.912 -0.148 c -1.588 0.0 -2.873 1.288 -2.873 2.875 v 7.076 c -0.594 -1.394 -2.182 -2.096 -3.624 -1.57 c -1.491 0.543 -2.259 2.193 -1.717 3.684 L 9.87 25.92 c 1.887 5.19 7.62 7.866 12.804 5.977 c 4.059 -1.479 6.576 -5.315 6.576 -9.397 c 0.0 -0.023 -0.001 -0.047 -0.003 -0.07 v -8.18 c 0.0 -1.587 -1.285 -2.875 -2.872 -2.875 c -0.305 0.0 -0.598 0.047 -0.873 0.135 V 9.375 c 0.0 -1.587 -1.286 -2.875 -2.873 -2.875 c -0.305 0.0 -0.598 0.047 -0.873 0.135 Z")
        )
    }.build()
}
