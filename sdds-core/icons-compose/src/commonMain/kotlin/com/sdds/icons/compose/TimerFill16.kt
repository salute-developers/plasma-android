package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.557 1.75 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 h 3.882 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 6.057 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 Z M 8.0 14.754 c 3.314 0.0 6.0 -2.639 6.0 -5.895 c 0.0 -1.544 -0.605 -2.95 -1.594 -4.001 l 0.448 -0.449 c 0.196 -0.195 0.196 -0.512 0.0 -0.707 c -0.195 -0.195 -0.511 -0.195 -0.707 0.0 l -0.486 0.486 C 10.648 3.421 9.378 2.964 8.0 2.964 c -3.314 0.0 -6.0 2.64 -6.0 5.895 c 0.0 3.256 2.686 5.895 6.0 5.895 Z m 2.662 -8.12 c 0.207 -0.204 0.21 -0.536 0.007 -0.743 c -0.204 -0.207 -0.536 -0.21 -0.743 -0.007 L 7.632 8.138 c -0.207 0.204 -0.21 0.536 -0.006 0.743 c 0.203 0.207 0.535 0.21 0.742 0.006 l 2.294 -2.254 Z")
        )
    }.build()
}
