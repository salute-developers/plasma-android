package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 6.079 C 1.0 4.336 2.518 2.25 4.988 2.25 c 0.736 0.0 1.392 0.284 1.95 0.663 C 7.327 3.179 7.684 3.5 8.0 3.826 C 8.315 3.5 8.671 3.18 9.063 2.913 c 0.557 -0.379 1.213 -0.663 1.95 -0.663 C 13.481 2.25 15.0 4.336 15.0 6.079 c 0.0 1.5 -0.725 2.908 -1.71 4.148 c -0.988 1.245 -2.278 2.373 -3.5 3.32 l -0.065 0.05 c -0.436 0.339 -0.76 0.59 -1.173 0.702 c -0.344 0.093 -0.76 0.093 -1.104 0.0 c -0.412 -0.111 -0.737 -0.363 -1.173 -0.702 l -0.064 -0.05 c -1.223 -0.947 -2.513 -2.075 -3.501 -3.32 C 1.725 8.987 1.0 7.58 1.0 6.08 Z M 4.988 3.25 C 3.134 3.25 2.0 4.822 2.0 6.079 c 0.0 1.178 0.573 2.368 1.493 3.527 c 0.915 1.153 2.133 2.223 3.33 3.151 c 0.528 0.41 0.69 0.524 0.885 0.577 c 0.174 0.047 0.41 0.047 0.584 0.0 c 0.195 -0.053 0.357 -0.168 0.885 -0.577 c 1.197 -0.928 2.415 -1.998 3.33 -3.151 C 13.427 8.447 14.0 7.256 14.0 6.079 c 0.0 -1.257 -1.134 -2.829 -2.988 -2.829 c -0.471 0.0 -0.934 0.182 -1.387 0.49 C 9.17 4.049 8.75 4.467 8.376 4.895 L 8.0 5.325 l -0.376 -0.43 C 7.249 4.467 6.83 4.049 6.375 3.74 C 5.922 3.432 5.46 3.25 4.988 3.25 Z")
        )
    }.build()
}
