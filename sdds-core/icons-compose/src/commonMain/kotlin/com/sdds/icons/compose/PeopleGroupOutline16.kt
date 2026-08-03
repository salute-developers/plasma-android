package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PeopleGroupOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PeopleGroupOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.11 5.242 C 4.11 4.288 4.898 3.5 5.891 3.5 c 0.994 0.0 1.784 0.788 1.784 1.742 c 0.0 0.953 -0.79 1.741 -1.784 1.741 c -0.993 0.0 -1.783 -0.788 -1.783 -1.741 Z M 5.891 2.5 C 4.364 2.5 3.11 3.719 3.11 5.242 c 0.0 1.522 1.255 2.741 2.783 2.741 c 1.529 0.0 2.784 -1.219 2.784 -2.741 C 8.676 3.719 7.42 2.5 5.892 2.5 Z M 2.29 11.116 c 1.032 -0.672 2.27 -1.063 3.603 -1.063 c 1.334 0.0 2.572 0.392 3.604 1.063 c 0.173 0.113 0.287 0.327 0.287 0.582 c 0.0 0.444 -0.36 0.804 -0.803 0.804 H 2.806 c -0.444 0.0 -0.804 -0.36 -0.804 -0.804 c 0.0 -0.256 0.114 -0.47 0.287 -0.582 Z m 3.603 -2.063 c -1.532 0.0 -2.958 0.45 -4.148 1.224 c -0.497 0.324 -0.742 0.878 -0.742 1.421 c 0.0 0.996 0.807 1.804 1.804 1.804 H 8.98 c 0.996 0.0 1.803 -0.808 1.803 -1.804 c 0.0 -0.543 -0.244 -1.096 -0.741 -1.42 c -1.19 -0.775 -2.618 -1.225 -4.15 -1.225 Z m 5.679 -3.197 c -0.573 0.0 -1.022 0.454 -1.022 0.995 c 0.0 0.54 0.449 0.994 1.022 0.994 s 1.022 -0.454 1.022 -0.994 s -0.449 -0.995 -1.022 -0.995 Z M 9.549 6.851 c 0.0 -1.11 0.914 -1.995 2.022 -1.995 c 1.108 0.0 2.022 0.885 2.022 1.995 s -0.914 1.994 -2.022 1.994 c -1.108 0.0 -2.022 -0.884 -2.022 -1.994 Z m 1.963 4.943 c 0.0 0.252 -0.034 0.496 -0.098 0.728 h 2.216 c 0.756 0.0 1.369 -0.612 1.369 -1.368 c 0.0 -0.41 -0.185 -0.835 -0.57 -1.086 c -0.82 -0.533 -1.803 -0.844 -2.857 -0.844 c -0.497 0.0 -0.978 0.07 -1.433 0.198 c 0.359 0.21 0.666 0.496 0.898 0.836 c 0.175 -0.022 0.354 -0.033 0.535 -0.033 c 0.856 0.0 1.65 0.25 2.311 0.681 c 0.062 0.04 0.116 0.126 0.116 0.248 c 0.0 0.204 -0.165 0.368 -0.369 0.368 H 11.5 c 0.008 0.09 0.012 0.18 0.012 0.272 Z")
        )
    }.build()
}
