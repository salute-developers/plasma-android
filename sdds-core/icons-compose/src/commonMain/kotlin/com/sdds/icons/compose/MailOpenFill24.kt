package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailOpenFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailOpenFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.739 2.484 c -0.488 -0.098 -0.99 -0.098 -1.477 0.0 c -0.553 0.11 -1.064 0.387 -1.803 0.787 L 4.802 5.788 c -0.81 0.438 -1.37 0.74 -1.789 1.187 C 2.644 7.37 2.365 7.838 2.193 8.35 C 2.0 8.93 2.0 9.567 2.0 10.488 v 5.994 c 0.0 0.813 0.0 1.469 0.043 2.0 c 0.045 0.546 0.14 1.026 0.366 1.47 c 0.36 0.706 0.933 1.28 1.639 1.64 c 0.444 0.226 0.924 0.32 1.47 0.365 C 6.05 22.0 6.706 22.0 7.519 22.0 h 8.964 c 0.813 0.0 1.469 0.0 2.0 -0.043 c 0.546 -0.045 1.026 -0.14 1.47 -0.366 c 0.706 -0.36 1.28 -0.933 1.64 -1.639 c 0.226 -0.444 0.32 -0.924 0.365 -1.47 C 22.0 17.95 22.0 17.294 22.0 16.481 v -5.994 c 0.0 -0.921 0.0 -1.558 -0.193 -2.138 c -0.171 -0.512 -0.451 -0.981 -0.82 -1.375 c -0.418 -0.447 -0.979 -0.75 -1.79 -1.187 l -4.656 -2.517 c -0.74 -0.4 -1.25 -0.676 -1.803 -0.787 Z M 5.893 9.86 C 5.54 9.644 5.078 9.754 4.861 10.107 c -0.217 0.353 -0.107 0.815 0.246 1.032 l 4.928 3.032 c 1.205 0.742 2.725 0.742 3.93 0.0 l 4.928 -3.032 c 0.353 -0.217 0.463 -0.68 0.246 -1.032 c -0.217 -0.353 -0.68 -0.463 -1.032 -0.246 l -4.928 3.033 c -0.723 0.445 -1.635 0.445 -2.358 0.0 L 5.893 9.86 Z")
        )
    }.build()
}
