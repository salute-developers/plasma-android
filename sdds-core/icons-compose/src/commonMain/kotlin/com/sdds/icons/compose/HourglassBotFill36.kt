package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HourglassBotFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HourglassBotFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.085 3.0 C 10.201 3.0 9.517 3.0 8.928 3.178 c -1.319 0.4 -2.35 1.431 -2.75 2.75 C 5.998 6.518 5.999 7.2 6.0 8.085 V 8.25 c 0.0 2.523 1.545 4.752 3.16 6.42 c 1.379 1.425 2.945 2.58 4.073 3.33 c -1.128 0.75 -2.694 1.906 -4.073 3.33 C 7.545 22.998 6.0 25.229 6.0 27.75 v 0.165 C 6.0 28.8 6.0 29.483 6.178 30.073 c 0.4 1.318 1.431 2.35 2.75 2.75 C 9.518 33.0 10.2 33.0 11.085 33.0 h 13.83 c 0.884 0.0 1.568 0.001 2.158 -0.178 c 1.318 -0.4 2.35 -1.431 2.75 -2.75 C 30.0 29.483 30.0 28.8 30.0 27.916 V 27.75 c 0.0 -2.522 -1.545 -4.752 -3.16 -6.42 c -1.379 -1.424 -2.945 -2.58 -4.073 -3.33 c 1.128 -0.75 2.694 -1.905 4.074 -3.33 C 28.455 13.002 30.0 10.773 30.0 8.25 V 8.085 c 0.0 -0.884 0.0 -1.568 -0.178 -2.157 c -0.4 -1.319 -1.432 -2.35 -2.75 -2.75 c -0.59 -0.18 -1.274 -0.179 -2.158 -0.178 h -13.83 Z m 8.682 18.418 l -0.032 -0.02 c -0.965 -0.606 -2.35 -0.703 -3.469 0.0 l -0.032 0.02 c -0.98 0.617 -2.552 1.712 -3.84 3.043 c -1.013 1.046 -1.723 2.094 -1.865 3.454 c -0.019 0.18 -0.028 0.269 0.009 0.357 c 0.03 0.072 0.095 0.145 0.162 0.183 c 0.084 0.047 0.185 0.048 0.387 0.05 c 4.607 0.059 9.22 0.059 13.827 0.0 c 0.202 -0.002 0.303 -0.003 0.387 -0.05 c 0.068 -0.038 0.133 -0.111 0.162 -0.183 c 0.037 -0.088 0.028 -0.178 0.009 -0.357 c -0.142 -1.36 -0.851 -2.408 -1.864 -3.454 c -1.288 -1.331 -2.86 -2.425 -3.84 -3.043 Z")
        )
    }.build()
}
