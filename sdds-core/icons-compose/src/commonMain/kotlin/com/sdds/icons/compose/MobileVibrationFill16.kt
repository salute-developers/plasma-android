package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileVibrationFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileVibrationFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.476 3.325 c 0.0 -0.87 0.706 -1.575 1.575 -1.575 h 3.895 c 0.87 0.0 1.575 0.705 1.575 1.575 v 9.35 c 0.0 0.87 -0.706 1.575 -1.575 1.575 H 6.052 c -0.87 0.0 -1.576 -0.705 -1.576 -1.575 v -9.35 Z M 6.62 4.008 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.76 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -1.76 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z M 1.657 3.829 C 1.463 4.026 1.465 4.343 1.66 4.537 l 0.695 0.685 l -0.895 0.884 c -0.282 0.278 -0.282 0.733 0.0 1.01 L 2.356 8.0 L 1.461 8.884 c -0.282 0.278 -0.282 0.732 0.0 1.01 l 0.895 0.884 l -0.695 0.686 c -0.196 0.194 -0.198 0.51 -0.004 0.707 c 0.193 0.196 0.51 0.198 0.707 0.005 l 0.904 -0.893 c 0.282 -0.278 0.282 -0.732 0.0 -1.01 L 2.372 9.389 l 0.896 -0.883 c 0.282 -0.279 0.282 -0.733 0.0 -1.011 L 2.372 6.61 l 0.896 -0.883 c 0.282 -0.278 0.282 -0.733 0.0 -1.011 L 2.364 3.825 C 2.167 3.63 1.85 3.633 1.657 3.829 Z m 12.684 0.0 c 0.194 0.197 0.192 0.514 -0.004 0.708 l -0.695 0.685 l 0.895 0.884 c 0.282 0.278 0.282 0.733 0.0 1.01 L 13.642 8.0 l 0.895 0.884 c 0.282 0.278 0.282 0.732 0.0 1.01 l -0.895 0.884 l 0.695 0.686 c 0.196 0.194 0.198 0.51 0.005 0.707 c -0.194 0.196 -0.511 0.198 -0.708 0.005 l -0.904 -0.893 c -0.282 -0.278 -0.282 -0.732 0.0 -1.01 l 0.896 -0.884 l -0.896 -0.883 c -0.282 -0.279 -0.282 -0.733 0.0 -1.011 l 0.896 -0.884 l -0.896 -0.883 c -0.282 -0.278 -0.282 -0.733 0.0 -1.011 l 0.904 -0.892 c 0.197 -0.194 0.514 -0.192 0.707 0.004 Z")
        )
    }.build()
}
