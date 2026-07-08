package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PoopFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PoopFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.028 3.774 c 0.243 -0.361 0.83 -0.372 1.044 0.007 c 0.455 0.807 0.877 1.432 1.254 1.989 c 0.959 1.419 1.621 2.399 1.77 4.818 c -0.18 -0.02 -0.372 -0.039 -0.575 -0.058 c -1.28 -0.12 -3.008 -0.283 -5.078 -1.222 l -0.422 -0.194 c -0.83 -0.383 -1.727 -0.798 -2.74 -1.024 c 0.432 -0.775 1.22 -1.313 2.08 -1.9 c 0.921 -0.631 1.927 -1.318 2.667 -2.416 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.588 8.756 c -1.253 0.313 -1.789 1.017 -1.97 1.725 c -0.137 0.538 -0.08 1.12 0.102 1.613 c 0.242 0.018 0.484 0.073 0.72 0.168 c 7.063 2.843 9.665 1.532 11.663 0.526 c 0.746 -0.376 1.408 -0.709 2.187 -0.768 c -0.015 -0.178 -0.05 -0.28 -0.08 -0.339 c -0.03 -0.057 -0.069 -0.1 -0.142 -0.144 c -0.2 -0.117 -0.55 -0.188 -1.235 -0.257 l -0.381 -0.037 c -1.285 -0.12 -3.121 -0.293 -5.305 -1.283 c -0.138 -0.062 -0.276 -0.126 -0.415 -0.19 c -1.542 -0.71 -3.099 -1.426 -5.144 -1.014 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.174 12.926 c 5.075 2.043 8.012 2.028 10.116 1.402 c 0.856 -0.255 1.56 -0.61 2.148 -0.906 c 0.114 -0.058 0.223 -0.113 0.329 -0.165 c 0.67 -0.33 1.182 -0.53 1.768 -0.53 c 0.588 0.0 1.003 0.193 1.297 0.473 c 0.303 0.29 0.52 0.718 0.615 1.24 c 0.193 1.059 -0.14 2.34 -0.95 3.174 c -2.715 2.449 -6.573 3.157 -10.07 2.799 c -1.743 -0.179 -3.362 -0.62 -4.657 -1.215 c -1.314 -0.603 -2.216 -1.328 -2.632 -2.022 c -0.921 -1.537 -0.715 -2.77 -0.195 -3.501 c 0.546 -0.767 1.461 -1.059 2.231 -0.749 Z")
        )
    }.build()
}
