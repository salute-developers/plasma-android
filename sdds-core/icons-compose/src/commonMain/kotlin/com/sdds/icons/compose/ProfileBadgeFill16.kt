package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileBadgeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileBadgeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.926 4.875 c 0.0 1.643 -1.332 2.975 -2.975 2.975 S 4.976 6.518 4.976 4.875 S 6.308 1.9 7.95 1.9 s 2.975 1.332 2.975 2.975 Z m 2.489 6.27 c 0.32 0.246 0.497 0.635 0.484 1.04 c -0.014 0.46 -0.056 0.76 -0.183 1.01 c -0.168 0.329 -0.436 0.597 -0.765 0.764 c -0.374 0.191 -0.864 0.191 -1.844 0.191 H 4.793 c -0.98 0.0 -1.47 0.0 -1.844 -0.19 c -0.33 -0.168 -0.597 -0.436 -0.765 -0.765 c -0.127 -0.25 -0.17 -0.55 -0.183 -1.011 c -0.013 -0.405 0.164 -0.794 0.485 -1.04 C 4.044 9.948 5.925 9.25 7.95 9.25 c 2.025 0.0 3.906 0.699 5.465 1.895 Z M 9.5 11.975 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 h 2.101 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 9.5 Z")
        )
    }.build()
}
