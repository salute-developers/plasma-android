package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Timer45Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Timer45Fill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.559 1.75 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 H 9.94 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 6.059 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 Z M 14.0 8.86 c 0.0 3.255 -2.686 5.895 -6.0 5.895 s -6.0 -2.64 -6.0 -5.896 s 2.686 -5.895 6.0 -5.895 c 1.385 0.0 2.661 0.461 3.677 1.236 l 0.561 -0.552 c 0.197 -0.193 0.514 -0.19 0.707 0.006 c 0.194 0.197 0.191 0.514 -0.006 0.708 l -0.52 0.51 C 13.402 5.922 14.0 7.322 14.0 8.859 Z M 8.38 6.951 c 0.0 -0.276 0.225 -0.5 0.5 -0.5 h 2.471 c 0.277 0.0 0.5 0.224 0.5 0.5 s -0.223 0.5 -0.5 0.5 h -1.97 v 1.081 h 1.27 c 0.663 0.0 1.2 0.537 1.2 1.2 v 0.68 c 0.0 0.663 -0.537 1.2 -1.2 1.2 h -1.77 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.275 0.224 -0.5 0.5 -0.5 h 1.77 c 0.11 0.0 0.2 -0.089 0.2 -0.2 v -0.68 c 0.0 -0.11 -0.09 -0.2 -0.2 -0.2 h -1.77 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 v -2.08 Z m -3.234 0.0 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 2.081 c 0.0 0.276 0.224 0.5 0.5 0.5 h 1.971 v 1.58 c 0.0 0.277 0.224 0.5 0.5 0.5 s 0.5 -0.223 0.5 -0.5 v -4.16 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 s -0.5 0.223 -0.5 0.5 v 1.58 h -1.47 v -1.58 Z")
        )
    }.build()
}
