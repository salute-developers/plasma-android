package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailPlusFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailPlusFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.482 4.0 H 7.518 c -0.813 0.0 -1.469 0.0 -2.0 0.043 c -0.546 0.045 -1.026 0.14 -1.47 0.366 c -0.706 0.36 -1.28 0.933 -1.64 1.639 c -0.226 0.444 -0.32 0.924 -0.365 1.47 C 2.0 8.05 2.0 8.706 2.0 9.519 v 4.964 c 0.0 0.813 0.0 1.469 0.043 2.0 c 0.045 0.546 0.14 1.026 0.366 1.47 c 0.36 0.706 0.933 1.28 1.639 1.64 c 0.444 0.226 0.924 0.32 1.47 0.365 C 6.05 20.0 6.706 20.0 7.519 20.0 h 3.98 C 11.178 19.23 11.0 18.386 11.0 17.5 c 0.0 -2.035 0.935 -3.851 2.399 -5.043 c -1.092 0.439 -2.341 0.344 -3.364 -0.286 L 5.107 9.14 C 4.754 8.922 4.644 8.459 4.86 8.107 c 0.217 -0.353 0.68 -0.463 1.032 -0.246 l 4.928 3.033 c 0.723 0.445 1.635 0.445 2.358 0.0 l 4.928 -3.033 c 0.353 -0.217 0.815 -0.107 1.032 0.246 c 0.217 0.353 0.107 0.815 -0.246 1.032 L 15.17 11.43 C 15.893 11.152 16.68 11.0 17.5 11.0 c 1.747 0.0 3.332 0.689 4.5 1.81 V 9.518 c 0.0 -0.813 0.0 -1.469 -0.043 -2.0 c -0.045 -0.546 -0.14 -1.026 -0.366 -1.47 c -0.36 -0.706 -0.933 -1.28 -1.639 -1.64 c -0.444 -0.226 -0.924 -0.32 -1.47 -0.365 C 17.95 4.0 17.294 4.0 16.482 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 17.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 20.538 12.0 17.5 s 2.462 -5.5 5.5 -5.5 s 5.5 2.462 5.5 5.5 Z M 17.5 14.0 c 0.276 0.0 0.5 0.224 0.5 0.5 V 17.0 h 2.5 c 0.276 0.0 0.5 0.224 0.5 0.5 S 20.776 18.0 20.5 18.0 H 18.0 v 2.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 17.0 20.776 17.0 20.5 V 18.0 h -2.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 H 17.0 v -2.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
