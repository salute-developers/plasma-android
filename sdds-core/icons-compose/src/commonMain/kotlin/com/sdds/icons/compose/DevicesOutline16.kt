package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DevicesOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DevicesOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.204 11.667 c 0.04 0.0 0.097 0.0 0.149 -0.004 c 0.061 -0.005 0.16 -0.018 0.265 -0.072 c 0.131 -0.067 0.239 -0.174 0.306 -0.306 c 0.053 -0.105 0.067 -0.203 0.072 -0.265 C 15.0 10.97 15.0 10.912 15.0 10.872 V 3.296 c 0.0 -0.04 0.0 -0.097 -0.004 -0.149 c -0.005 -0.061 -0.019 -0.16 -0.072 -0.265 c -0.067 -0.131 -0.175 -0.239 -0.306 -0.306 c -0.105 -0.053 -0.204 -0.067 -0.265 -0.072 C 14.3 2.5 14.244 2.5 14.204 2.5 H 1.796 c -0.04 0.0 -0.097 0.0 -0.149 0.004 c -0.061 0.005 -0.16 0.019 -0.265 0.072 c -0.131 0.067 -0.239 0.175 -0.306 0.306 C 1.023 2.987 1.01 3.086 1.004 3.147 C 1.0 3.2 1.0 3.256 1.0 3.296 v 7.576 c 0.0 0.04 0.0 0.097 0.004 0.148 c 0.005 0.062 0.019 0.16 0.072 0.265 c 0.067 0.132 0.174 0.239 0.306 0.306 c 0.105 0.054 0.204 0.067 0.265 0.072 c 0.052 0.005 0.109 0.004 0.149 0.004 H 7.65 v -1.05 h -5.6 V 3.55 h 11.9 v 8.117 h 0.254 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.4 12.377 h 5.25 v 1.059 H 2.4 v -1.059 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.7 8.557 c 0.0 -0.393 0.0 -0.589 0.076 -0.738 c 0.067 -0.132 0.174 -0.24 0.306 -0.306 c 0.15 -0.076 0.346 -0.076 0.738 -0.076 h 1.96 c 0.392 0.0 0.588 0.0 0.738 0.076 c 0.131 0.067 0.239 0.174 0.306 0.306 C 12.9 7.969 12.9 8.164 12.9 8.557 v 4.818 c 0.0 0.392 0.0 0.588 -0.076 0.738 c -0.067 0.132 -0.175 0.239 -0.306 0.306 c -0.15 0.076 -0.346 0.076 -0.738 0.076 H 9.82 c -0.392 0.0 -0.588 0.0 -0.738 -0.076 c -0.132 -0.067 -0.239 -0.174 -0.306 -0.306 C 8.7 13.963 8.7 13.767 8.7 13.375 V 8.557 Z m 0.7 4.701 c 0.0 -0.097 0.078 -0.175 0.175 -0.175 h 2.45 c 0.097 0.0 0.175 0.078 0.175 0.175 v 0.356 c 0.0 0.096 -0.078 0.175 -0.175 0.175 h -2.45 c -0.097 0.0 -0.175 -0.079 -0.175 -0.175 v -0.356 Z")
        )
    }.build()
}
