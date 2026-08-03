package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchSettingsOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchSettingsOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.375 16.25 c 3.659 0.0 6.625 -2.966 6.625 -6.625 S 30.034 3.0 26.375 3.0 H 9.625 C 5.966 3.0 3.0 5.966 3.0 9.625 s 2.966 6.625 6.625 6.625 h 16.75 Z M 31.0 9.625 c 0.0 2.554 -2.07 4.625 -4.625 4.625 H 9.625 C 7.071 14.25 5.0 12.18 5.0 9.625 C 5.0 7.071 7.07 5.0 9.625 5.0 h 16.75 C 28.929 5.0 31.0 7.07 31.0 9.625 Z M 26.45 6.85 c -1.519 0.0 -2.75 1.231 -2.75 2.75 s 1.231 2.75 2.75 2.75 S 29.2 11.12 29.2 9.6 s -1.231 -2.75 -2.75 -2.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.625 19.75 C 5.966 19.75 3.0 22.716 3.0 26.375 S 5.966 33.0 9.625 33.0 h 16.75 C 30.034 33.0 33.0 30.034 33.0 26.375 s -2.966 -6.625 -6.625 -6.625 H 9.625 Z M 5.0 26.375 c 0.0 -2.554 2.07 -4.625 4.625 -4.625 h 16.75 c 2.554 0.0 4.625 2.07 4.625 4.625 C 31.0 28.929 28.93 31.0 26.375 31.0 H 9.625 C 7.071 31.0 5.0 28.93 5.0 26.375 Z m 4.55 2.775 c 1.519 0.0 2.75 -1.231 2.75 -2.75 s -1.231 -2.75 -2.75 -2.75 S 6.8 24.88 6.8 26.4 s 1.231 2.75 2.75 2.75 Z")
        )
    }.build()
}
