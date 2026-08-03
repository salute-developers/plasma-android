package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpeedometerOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpeedometerOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 7.179 -5.82 12.999 -13.0 12.999 c -7.179 0.0 -12.999 -5.82 -12.999 -13.0 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 8.283 6.715 14.999 15.0 14.999 c 8.283 0.0 14.999 -6.716 14.999 -15.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z m -3.382 6.835 c 1.797 -0.745 3.79 -0.875 5.669 -0.372 c 0.533 0.143 1.082 -0.174 1.225 -0.707 c 0.142 -0.533 -0.174 -1.082 -0.707 -1.225 c -2.305 -0.617 -4.749 -0.457 -6.953 0.456 c -2.204 0.913 -4.045 2.528 -5.238 4.594 c -1.193 2.066 -1.67 4.468 -1.36 6.833 c 0.312 2.365 1.395 4.562 3.082 6.249 c 0.39 0.39 1.024 0.39 1.415 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.415 c -1.376 -1.375 -2.26 -3.166 -2.513 -5.095 c -0.254 -1.929 0.135 -3.887 1.108 -5.572 c 0.973 -1.685 2.474 -3.002 4.272 -3.746 Z m 12.625 4.652 c 0.533 -0.143 1.082 0.174 1.225 0.707 c 0.492 1.838 0.492 3.773 0.0 5.61 c -0.493 1.838 -1.46 3.514 -2.805 4.859 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.391 -0.39 -0.391 -1.024 0.0 -1.415 c 1.097 -1.097 1.885 -2.463 2.287 -3.961 c 0.401 -1.499 0.401 -3.076 0.0 -4.575 c -0.143 -0.533 0.173 -1.082 0.707 -1.225 Z m -1.68 -4.181 c -0.333 -0.28 -0.821 -0.276 -1.15 0.01 l -8.127 7.071 c -1.199 1.044 -1.182 2.911 0.036 3.933 c 1.217 1.022 3.06 0.714 3.879 -0.648 l 5.552 -9.231 c 0.225 -0.373 0.144 -0.855 -0.19 -1.135 Z")
        )
    }.build()
}
