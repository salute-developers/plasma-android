package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileBadgeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileBadgeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.25 7.5 c 0.0 2.347 -1.902 4.25 -4.25 4.25 c -2.347 0.0 -4.25 -1.903 -4.25 -4.25 S 9.653 3.25 12.0 3.25 c 2.348 0.0 4.25 1.903 4.25 4.25 Z m 3.556 8.955 c 0.459 0.352 0.71 0.908 0.693 1.486 c -0.02 0.66 -0.08 1.088 -0.262 1.444 c -0.24 0.47 -0.622 0.853 -1.093 1.092 c -0.534 0.273 -1.234 0.273 -2.635 0.273 H 7.491 c -1.4 0.0 -2.1 0.0 -2.635 -0.273 c -0.47 -0.24 -0.853 -0.622 -1.093 -1.092 c -0.181 -0.356 -0.242 -0.784 -0.262 -1.443 c -0.018 -0.577 0.234 -1.134 0.693 -1.485 C 6.42 14.748 9.108 13.75 12.0 13.75 c 2.892 0.0 5.579 0.998 7.805 2.705 Z M 14.5 17.75 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 3.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -3.0 Z")
        )
    }.build()
}
