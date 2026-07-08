package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.482 4.0 H 7.518 c -0.813 0.0 -1.469 0.0 -2.0 0.043 c -0.546 0.045 -1.026 0.14 -1.47 0.366 c -0.706 0.36 -1.28 0.933 -1.64 1.639 c -0.226 0.444 -0.32 0.924 -0.365 1.47 C 2.0 8.05 2.0 8.706 2.0 9.519 v 4.964 c 0.0 0.813 0.0 1.469 0.043 2.0 c 0.045 0.546 0.14 1.026 0.366 1.47 c 0.36 0.706 0.933 1.28 1.639 1.64 c 0.444 0.226 0.924 0.32 1.47 0.365 C 6.05 20.0 6.706 20.0 7.519 20.0 h 8.964 c 0.813 0.0 1.469 0.0 2.0 -0.043 c 0.546 -0.045 1.026 -0.14 1.47 -0.366 c 0.706 -0.36 1.28 -0.933 1.64 -1.639 c 0.226 -0.444 0.32 -0.924 0.365 -1.47 C 22.0 15.95 22.0 15.295 22.0 14.482 V 9.518 c 0.0 -0.813 0.0 -1.469 -0.043 -2.0 c -0.045 -0.546 -0.14 -1.026 -0.366 -1.47 c -0.36 -0.706 -0.933 -1.28 -1.639 -1.64 c -0.444 -0.226 -0.924 -0.32 -1.47 -0.365 C 17.95 4.0 17.294 4.0 16.482 4.0 Z M 5.893 7.861 C 5.54 7.644 5.078 7.754 4.861 8.107 C 4.644 8.46 4.754 8.922 5.107 9.139 l 4.928 3.032 c 1.205 0.742 2.725 0.742 3.93 0.0 l 4.928 -3.032 c 0.353 -0.217 0.463 -0.68 0.246 -1.032 c -0.217 -0.353 -0.68 -0.463 -1.032 -0.246 l -4.928 3.033 c -0.723 0.445 -1.635 0.445 -2.358 0.0 L 5.893 7.86 Z")
        )
    }.build()
}
