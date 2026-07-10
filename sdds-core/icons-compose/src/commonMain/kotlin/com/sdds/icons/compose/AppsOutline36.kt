package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppsOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppsOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.75 16.5 c 3.728 0.0 6.75 -3.022 6.75 -6.75 S 13.478 3.0 9.75 3.0 S 3.0 6.022 3.0 9.75 s 3.022 6.75 6.75 6.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.625 19.75 C 5.966 19.75 3.0 22.716 3.0 26.375 S 5.966 33.0 9.625 33.0 s 6.625 -2.966 6.625 -6.625 s -2.966 -6.625 -6.625 -6.625 Z M 5.0 26.375 c 0.0 -2.554 2.07 -4.625 4.625 -4.625 c 2.554 0.0 4.625 2.07 4.625 4.625 C 14.25 28.93 12.18 31.0 9.625 31.0 C 7.071 31.0 5.0 28.93 5.0 26.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.75 26.375 c 0.0 -3.659 2.966 -6.625 6.625 -6.625 S 33.0 22.716 33.0 26.375 S 30.034 33.0 26.375 33.0 s -6.625 -2.966 -6.625 -6.625 Z m 6.625 -4.625 c -2.554 0.0 -4.625 2.07 -4.625 4.625 c 0.0 2.554 2.07 4.625 4.625 4.625 C 28.929 31.0 31.0 28.93 31.0 26.375 c 0.0 -2.554 -2.07 -4.625 -4.625 -4.625 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.375 3.0 c -3.659 0.0 -6.625 2.966 -6.625 6.625 s 2.966 6.625 6.625 6.625 S 33.0 13.284 33.0 9.625 S 30.034 3.0 26.375 3.0 Z M 21.75 9.625 C 21.75 7.071 23.82 5.0 26.375 5.0 C 28.929 5.0 31.0 7.07 31.0 9.625 c 0.0 2.554 -2.07 4.625 -4.625 4.625 c -2.554 0.0 -4.625 -2.07 -4.625 -4.625 Z")
        )
    }.build()
}
