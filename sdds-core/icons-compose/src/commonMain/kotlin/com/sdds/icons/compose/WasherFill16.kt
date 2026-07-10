package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WasherFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WasherFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.025 1.0 C 2.769 1.0 1.75 2.019 1.75 3.275 v 9.45 C 1.75 13.981 2.769 15.0 4.025 15.0 h 7.95 c 1.256 0.0 2.275 -1.019 2.275 -2.275 v -9.45 C 14.25 2.019 13.231 1.0 11.975 1.0 h -7.95 Z m 0.503 3.5 c 0.384 0.0 0.695 -0.313 0.695 -0.7 c 0.0 -0.386 -0.311 -0.7 -0.695 -0.7 c -0.383 0.0 -0.694 0.314 -0.694 0.7 c 0.0 0.387 0.31 0.7 0.694 0.7 Z m 3.993 -1.2 c -0.276 0.0 -0.5 0.225 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 h 3.125 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.275 -0.224 -0.5 -0.5 -0.5 H 8.521 Z m -3.12 5.576 c 0.0 -1.454 1.169 -2.625 2.6 -2.625 c 1.433 0.0 2.6 1.17 2.6 2.625 c 0.0 0.071 -0.002 0.142 -0.008 0.212 C 10.244 9.249 9.907 9.4 9.39 9.4 c -0.694 0.0 -1.041 -0.175 -1.388 -0.35 C 7.654 8.875 7.307 8.7 6.612 8.7 C 6.038 8.7 5.7 8.82 5.404 8.961 L 5.402 8.876 Z m 2.6 -3.675 c -2.019 0.0 -3.65 1.649 -3.65 3.675 c 0.0 2.025 1.631 3.675 3.65 3.675 c 2.02 0.0 3.65 -1.65 3.65 -3.675 c 0.0 -2.026 -1.63 -3.675 -3.65 -3.675 Z")
        )
    }.build()
}
