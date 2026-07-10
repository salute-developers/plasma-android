package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartDashOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.923 8.707 c 1.184 1.514 1.827 3.352 1.827 5.03 c 0.0 3.205 -1.499 6.225 -3.557 8.903 c -2.064 2.685 -4.765 5.122 -7.337 7.178 l -0.132 0.107 c -0.952 0.761 -1.647 1.317 -2.534 1.562 c -0.74 0.205 -1.64 0.205 -2.38 0.0 c -0.887 -0.245 -1.582 -0.8 -2.534 -1.562 l -0.132 -0.107 c -0.781 -0.624 -1.575 -1.283 -2.358 -1.974 l 1.417 -1.417 c 0.722 0.633 1.458 1.245 2.19 1.83 c 1.14 0.912 1.505 1.18 1.949 1.302 c 0.392 0.109 0.924 0.109 1.316 0.0 c 0.444 -0.122 0.809 -0.39 1.95 -1.302 c 2.519 -2.014 5.078 -4.336 7.0 -6.836 c 1.928 -2.51 3.142 -5.104 3.142 -7.685 c 0.0 -1.19 -0.442 -2.496 -1.253 -3.603 l 1.426 -1.426 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.749 4.293 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.023 0.0 1.414 L 5.707 31.163 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 4.639 -4.64 c -0.756 -0.795 -1.473 -1.62 -2.125 -2.47 c -2.058 -2.677 -3.557 -5.697 -3.557 -8.903 c 0.0 -3.72 3.165 -8.236 8.378 -8.236 c 1.549 0.0 2.93 0.614 4.102 1.433 c 0.838 0.584 1.597 1.293 2.27 2.011 c 0.673 -0.718 1.432 -1.427 2.27 -2.011 C 21.442 6.114 22.823 5.5 24.372 5.5 c 1.274 0.0 2.425 0.27 3.438 0.731 l 1.939 -1.938 Z M 24.372 7.5 c -1.005 0.0 -1.99 0.398 -2.957 1.072 c -0.968 0.676 -1.858 1.59 -2.653 2.524 L 18.0 11.99 l -0.762 -0.894 c -0.795 -0.934 -1.685 -1.848 -2.653 -2.524 C 13.619 7.898 12.633 7.5 11.628 7.5 c -3.931 0.0 -6.378 3.435 -6.378 6.236 c 0.0 2.58 1.214 5.176 3.143 7.685 c 0.596 0.776 1.255 1.535 1.954 2.273 l 15.91 -15.91 C 25.677 7.601 25.047 7.5 24.373 7.5 Z")
        )
    }.build()
}
