package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPinOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPinOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.55 6.6 c 0.0 -2.522 2.003 -4.55 4.451 -4.55 c 2.449 0.0 4.451 2.028 4.451 4.55 c 0.0 1.742 -0.978 3.461 -2.113 4.853 c -0.883 1.085 -1.82 1.922 -2.338 2.35 c -0.517 -0.428 -1.454 -1.265 -2.338 -2.35 C 4.529 10.061 3.55 8.343 3.55 6.6 Z M 8.001 1.0 c -3.048 0.0 -5.5 2.518 -5.5 5.6 c 0.0 2.109 1.166 4.065 2.348 5.516 c 1.193 1.465 2.471 2.5 2.833 2.777 c 0.189 0.143 0.45 0.143 0.638 0.0 c 0.362 -0.277 1.64 -1.312 2.834 -2.777 c 1.182 -1.451 2.348 -3.407 2.348 -5.516 c 0.0 -3.082 -2.453 -5.6 -5.5 -5.6 Z M 6.637 6.6 c 0.0 -0.783 0.62 -1.4 1.363 -1.4 c 0.742 0.0 1.362 0.617 1.362 1.4 C 9.362 7.383 8.742 8.0 8.0 8.0 C 7.257 8.0 6.637 7.383 6.637 6.6 Z M 8.0 4.15 c -1.342 0.0 -2.413 1.107 -2.413 2.45 c 0.0 1.343 1.07 2.45 2.413 2.45 c 1.342 0.0 2.412 -1.107 2.412 -2.45 c 0.0 -1.343 -1.07 -2.45 -2.412 -2.45 Z")
        )
    }.build()
}
