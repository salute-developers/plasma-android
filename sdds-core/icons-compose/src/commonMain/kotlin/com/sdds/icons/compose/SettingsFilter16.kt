package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SettingsFilter16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SettingsFilter16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.77 6.3 c 0.608 0.0 1.1 -0.492 1.1 -1.1 c 0.0 -0.607 -0.492 -1.1 -1.1 -1.1 c -0.607 0.0 -1.1 0.493 -1.1 1.1 c 0.0 0.608 0.493 1.1 1.1 1.1 Z m 0.0 1.0 c 0.988 0.0 1.816 -0.681 2.04 -1.6 h 1.46 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -1.46 c -0.223 -0.918 -1.052 -1.6 -2.04 -1.6 c -1.16 0.0 -2.1 0.94 -2.1 2.1 c 0.0 1.16 0.94 2.1 2.1 2.1 Z M 8.73 5.7 H 1.67 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 7.06 C 8.69 4.86 8.67 5.028 8.67 5.2 s 0.02 0.34 0.06 0.5 Z m -3.512 6.2 c -0.608 0.0 -1.1 -0.492 -1.1 -1.1 c 0.0 -0.607 0.492 -1.1 1.1 -1.1 c 0.607 0.0 1.1 0.493 1.1 1.1 c 0.0 0.608 -0.493 1.1 -1.1 1.1 Z m 0.0 1.0 c -0.988 0.0 -1.816 -0.681 -2.04 -1.6 h -1.46 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 1.46 c 0.224 -0.918 1.052 -1.6 2.04 -1.6 c 1.16 0.0 2.1 0.94 2.1 2.1 c 0.0 1.16 -0.94 2.1 -2.1 2.1 Z m 2.04 -1.6 h 7.06 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 h -7.06 c 0.04 0.16 0.06 0.328 0.06 0.5 s -0.02 0.34 -0.06 0.5 Z")
        )
    }.build()
}
