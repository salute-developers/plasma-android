package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SettingsFilterOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SettingsFilterOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.232 2.354 c 0.196 -0.196 0.196 -0.512 0.0 -0.708 c -0.195 -0.195 -0.511 -0.195 -0.707 0.0 L 11.801 3.37 C 11.497 3.198 11.145 3.1 10.77 3.1 c -1.16 0.0 -2.1 0.94 -2.1 2.1 c 0.0 0.375 0.098 0.727 0.27 1.031 L 6.22 8.953 C 5.92 8.792 5.58 8.7 5.219 8.7 c -1.16 0.0 -2.1 0.94 -2.1 2.1 c 0.0 0.362 0.091 0.703 0.252 1.0 l -1.725 1.726 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 l 11.88 -11.88 Z m -10.09 8.675 l 1.306 -1.305 C 5.374 9.708 5.297 9.7 5.218 9.7 c -0.607 0.0 -1.1 0.493 -1.1 1.1 c 0.0 0.079 0.009 0.155 0.024 0.23 Z m 5.561 -5.56 l 1.336 -1.336 C 10.953 4.112 10.863 4.1 10.77 4.1 c -0.607 0.0 -1.1 0.493 -1.1 1.1 c 0.0 0.093 0.011 0.183 0.033 0.269 Z M 7.693 10.3 l -2.596 2.597 c 0.04 0.002 0.08 0.003 0.121 0.003 c 0.988 0.0 1.816 -0.681 2.04 -1.6 h 7.06 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 7.694 Z m 5.6 -5.6 L 10.696 7.3 L 10.77 7.3 c 0.987 0.0 1.816 -0.681 2.04 -1.6 h 1.46 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -0.976 Z m -4.563 1.0 H 1.67 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 7.06 C 8.69 4.86 8.67 5.028 8.67 5.2 s 0.02 0.34 0.06 0.5 Z m -5.552 5.6 c -0.039 -0.16 -0.06 -0.328 -0.06 -0.5 s 0.021 -0.34 0.06 -0.5 h -1.46 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 1.46 Z")
        )
    }.build()
}
