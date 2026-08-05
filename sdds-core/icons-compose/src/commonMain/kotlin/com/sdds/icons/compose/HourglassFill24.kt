package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HourglassFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HourglassFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.39 2.0 H 7.5 h 9.0 h 0.11 c 0.59 0.0 1.045 0.0 1.438 0.119 c 0.88 0.266 1.567 0.954 1.834 1.833 C 20.0 4.345 20.0 4.8 20.0 5.39 V 5.5 c 0.0 1.682 -1.03 3.168 -2.106 4.28 c -0.92 0.95 -1.964 1.72 -2.716 2.22 c 0.752 0.5 1.796 1.27 2.716 2.22 C 18.97 15.332 20.0 16.818 20.0 18.5 v 0.11 c 0.0 0.59 0.0 1.045 -0.118 1.438 c -0.267 0.88 -0.955 1.567 -1.834 1.834 C 17.655 22.0 17.2 22.0 16.61 22.0 H 16.5 h -9.0 h -0.11 c -0.59 0.0 -1.045 0.0 -1.438 -0.118 c -0.88 -0.267 -1.567 -0.955 -1.833 -1.834 C 3.999 19.655 3.999 19.2 4.0 18.61 V 18.5 c 0.0 -1.682 1.03 -3.168 2.106 -4.28 c 0.92 -0.95 1.964 -1.72 2.716 -2.22 c -0.752 -0.5 -1.796 -1.27 -2.716 -2.22 C 5.03 8.668 4.0 7.182 4.0 5.5 V 5.39 C 4.0 4.8 4.0 4.345 4.119 3.952 c 0.266 -0.88 0.954 -1.567 1.833 -1.833 C 6.345 1.999 6.8 1.999 7.39 2.0 Z")
        )
    }.build()
}
