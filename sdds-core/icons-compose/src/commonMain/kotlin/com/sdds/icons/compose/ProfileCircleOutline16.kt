package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.002 8.0 c 0.0 -3.313 2.685 -5.998 5.998 -5.998 S 13.998 4.687 13.998 8.0 c 0.0 1.505 -0.554 2.88 -1.47 3.934 c -0.988 -1.112 -2.677 -1.8 -4.528 -1.8 c -1.851 0.0 -3.54 0.688 -4.528 1.8 C 2.556 10.881 2.002 9.505 2.002 8.0 Z M 8.0 11.134 c 1.666 0.0 3.06 0.631 3.81 1.499 c -1.036 0.853 -2.363 1.365 -3.81 1.365 s -2.774 -0.512 -3.81 -1.365 c 0.75 -0.867 2.144 -1.499 3.81 -1.499 Z M 8.0 1.002 C 4.135 1.002 1.002 4.135 1.002 8.0 c 0.0 1.992 0.833 3.791 2.169 5.065 C 4.426 14.262 6.128 14.998 8.0 14.998 c 1.872 0.0 3.574 -0.736 4.83 -1.933 C 14.164 11.79 14.997 9.992 14.997 8.0 c 0.0 -3.865 -3.133 -6.998 -6.998 -6.998 Z M 6.392 6.595 c 0.0 -0.888 0.72 -1.608 1.608 -1.608 c 0.888 0.0 1.607 0.72 1.607 1.608 c 0.0 0.887 -0.72 1.607 -1.607 1.607 c -0.888 0.0 -1.608 -0.72 -1.608 -1.607 Z M 8.0 3.987 c -1.44 0.0 -2.608 1.167 -2.608 2.608 c 0.0 1.44 1.168 2.607 2.608 2.607 c 1.44 0.0 2.607 -1.167 2.607 -2.607 c 0.0 -1.44 -1.167 -2.608 -2.607 -2.608 Z")
        )
    }.build()
}
