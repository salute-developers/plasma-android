package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.525 1.646 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.707 l -11.88 11.88 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.708 l 0.763 -0.763 C 1.546 12.004 1.0 10.878 1.0 9.629 C 1.0 7.71 2.28 6.086 4.03 5.634 C 4.63 3.68 6.41 2.25 8.526 2.25 c 1.216 0.0 2.318 0.472 3.152 1.242 l 1.846 -1.846 Z M 8.527 3.25 c -1.735 0.0 -3.208 1.235 -3.609 2.924 C 4.872 6.368 4.714 6.517 4.517 6.55 C 3.1 6.794 2.0 8.07 2.0 9.629 c 0.0 0.984 0.44 1.853 1.12 2.423 L 10.97 4.2 c -0.655 -0.592 -1.51 -0.95 -2.443 -0.95 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.847 5.148 c 0.255 0.597 0.396 1.256 0.396 1.947 c 0.0 0.18 -0.01 0.36 -0.028 0.537 C 14.275 8.152 15.0 9.26 15.0 10.534 c 0.0 1.762 -1.39 3.216 -3.135 3.216 H 5.014 c -0.241 0.0 -0.478 -0.022 -0.706 -0.063 l 0.937 -0.937 h 6.62 c 1.165 0.0 2.135 -0.978 2.135 -2.216 c 0.0 -0.999 -0.635 -1.833 -1.493 -2.113 c -0.24 -0.078 -0.383 -0.323 -0.335 -0.57 c 0.047 -0.244 0.071 -0.497 0.071 -0.756 c 0.0 -0.409 -0.061 -0.801 -0.175 -1.17 l 0.779 -0.777 Z")
        )
    }.build()
}
