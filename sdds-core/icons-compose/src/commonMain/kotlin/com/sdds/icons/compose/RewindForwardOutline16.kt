package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindForwardOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindForwardOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.532 3.732 c -1.03 -0.641 -2.338 0.115 -2.338 1.314 v 1.089 L 3.338 3.732 C 2.308 3.091 1.0 3.847 1.0 5.046 v 5.908 c 0.0 1.2 1.308 1.955 2.338 1.314 l 3.856 -2.403 v 1.089 c 0.0 1.2 1.308 1.955 2.338 1.314 l 4.741 -2.954 c 0.97 -0.604 0.97 -2.024 0.0 -2.628 L 9.532 3.732 Z M 7.194 8.687 L 2.809 11.42 C 2.463 11.634 2.0 11.389 2.0 10.954 V 5.046 c 0.0 -0.435 0.463 -0.68 0.81 -0.465 l 4.384 2.732 v 1.374 Z m 1.0 -3.64 c 0.0 -0.436 0.463 -0.681 0.81 -0.466 l 4.74 2.954 c 0.341 0.212 0.341 0.718 0.0 0.93 l -4.74 2.954 c -0.347 0.215 -0.81 -0.03 -0.81 -0.465 V 5.046 Z")
        )
    }.build()
}
