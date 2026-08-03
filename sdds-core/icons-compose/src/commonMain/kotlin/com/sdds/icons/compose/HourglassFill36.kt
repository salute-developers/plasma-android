package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HourglassFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HourglassFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.085 3.0 h 0.165 h 13.5 h 0.165 C 25.8 3.0 26.483 3.0 27.073 3.178 c 1.318 0.4 2.35 1.431 2.75 2.75 C 30.0 6.518 30.0 7.2 30.0 8.085 V 8.25 c 0.0 2.523 -1.545 4.752 -3.16 6.42 c -1.379 1.425 -2.945 2.58 -4.073 3.33 c 1.128 0.75 2.694 1.906 4.074 3.33 c 1.614 1.668 3.16 3.898 3.16 6.42 v 0.165 c 0.0 0.884 0.0 1.568 -0.178 2.158 c -0.4 1.318 -1.432 2.35 -2.75 2.75 C 26.483 33.0 25.799 33.0 24.915 33.0 H 24.75 h -13.5 h -0.165 c -0.884 0.0 -1.568 0.001 -2.157 -0.178 c -1.319 -0.4 -2.35 -1.431 -2.75 -2.75 C 5.998 29.483 5.999 28.8 6.0 27.916 V 27.75 c 0.0 -2.522 1.545 -4.752 3.16 -6.42 c 1.379 -1.424 2.945 -2.58 4.073 -3.33 c -1.128 -0.75 -2.694 -1.905 -4.073 -3.33 C 7.545 13.002 6.0 10.773 6.0 8.25 V 8.085 C 6.0 7.201 6.0 6.517 6.178 5.928 c 0.4 -1.319 1.431 -2.35 2.75 -2.75 C 9.518 2.998 10.2 2.999 11.085 3.0 Z")
        )
    }.build()
}
