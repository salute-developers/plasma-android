package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbportalFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbportalFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 4.5 c 0.0 1.105 -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 s 0.895 -2.0 2.0 -2.0 s 2.0 0.895 2.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 7.5 c 1.657 0.0 3.0 -1.343 3.0 -3.0 c 0.0 -0.17 -0.014 -0.337 -0.041 -0.5 h 5.291 C 21.216 4.0 22.0 4.784 22.0 5.75 v 9.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 H 3.75 C 2.784 17.0 2.0 16.216 2.0 15.25 v -9.5 C 2.0 4.784 2.784 4.0 3.75 4.0 h 5.291 C 9.014 4.163 9.0 4.33 9.0 4.5 c 0.0 1.657 1.343 3.0 3.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 20.0 c -1.876 0.0 -3.573 -0.765 -4.796 -2.0 h 9.592 c -1.223 1.235 -2.92 2.0 -4.796 2.0 Z")
        )
    }.build()
}
