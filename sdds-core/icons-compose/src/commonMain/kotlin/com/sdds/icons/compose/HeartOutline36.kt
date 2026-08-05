package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.25 13.737 c 0.0 -3.72 3.165 -8.237 8.378 -8.237 c 1.549 0.0 2.93 0.614 4.102 1.433 c 0.837 0.584 1.597 1.293 2.27 2.011 c 0.673 -0.718 1.433 -1.427 2.27 -2.011 C 21.442 6.114 22.823 5.5 24.372 5.5 c 5.213 0.0 8.378 4.516 8.378 8.237 c 0.0 3.205 -1.5 6.226 -3.557 8.903 c -2.064 2.686 -4.765 5.123 -7.337 7.179 l -0.133 0.106 c -0.951 0.762 -1.645 1.317 -2.532 1.563 c -0.741 0.205 -1.64 0.205 -2.382 0.0 c -0.887 -0.245 -1.58 -0.801 -2.532 -1.563 l -0.133 -0.106 c -2.572 -2.056 -5.273 -4.493 -7.337 -7.179 c -2.058 -2.677 -3.557 -5.698 -3.557 -8.903 Z M 11.628 7.5 c -3.932 0.0 -6.378 3.435 -6.378 6.237 c 0.0 2.58 1.214 5.175 3.143 7.684 c 1.922 2.501 4.48 4.822 7.0 6.836 c 1.14 0.912 1.505 1.18 1.95 1.303 c 0.391 0.108 0.923 0.108 1.315 0.0 c 0.444 -0.123 0.808 -0.391 1.95 -1.303 c 2.519 -2.015 5.077 -4.335 7.0 -6.836 c 1.928 -2.509 3.142 -5.104 3.142 -7.684 c 0.0 -2.802 -2.447 -6.237 -6.378 -6.237 c -1.005 0.0 -1.991 0.398 -2.957 1.072 c -0.968 0.676 -1.859 1.59 -2.653 2.524 L 18.0 11.99 l -0.762 -0.894 c -0.794 -0.934 -1.685 -1.848 -2.653 -2.524 C 13.62 7.898 12.633 7.5 11.628 7.5 Z")
        )
    }.build()
}
