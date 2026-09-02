package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.27 11.174 c 0.849 0.0 1.497 0.756 1.363 1.592 l -0.816 5.075 c -0.083 0.52 0.051 1.052 0.371 1.47 l 2.35 3.07 c 0.969 1.268 0.062 3.092 -1.537 3.093 H 27.12 v 6.05 l -1.3 1.65 l -1.3 -1.65 v -6.05 h -3.883 c -1.6 0.0 -2.506 -1.825 -1.538 -3.092 l 2.35 -3.07 c 0.32 -0.42 0.455 -0.951 0.371 -1.471 l -0.815 -5.075 c -0.134 -0.835 0.514 -1.592 1.363 -1.592 h 6.901 Z M 13.035 18.5 c 2.01 0.0 3.935 0.377 5.709 1.063 l -1.235 1.616 l -0.037 0.05 c -1.235 -0.418 -2.546 -0.668 -3.908 -0.72 L 13.036 20.5 c -2.838 0.0 -5.479 0.854 -7.687 2.325 c -0.306 0.204 -0.51 0.585 -0.51 1.038 c 0.0 0.787 0.639 1.425 1.426 1.425 h 10.84 c 0.452 0.918 1.255 1.663 2.287 2.0 H 6.265 c -1.892 0.0 -3.425 -1.534 -3.425 -3.425 c 0.0 -1.034 0.468 -2.08 1.4 -2.702 C 6.765 19.48 9.79 18.5 13.036 18.5 Z m 10.759 -0.977 c 0.17 1.063 -0.104 2.149 -0.758 3.003 l -2.254 2.948 h 10.071 l -2.253 -2.948 c -0.654 -0.854 -0.929 -1.94 -0.758 -3.003 l 0.699 -4.35 h -5.446 l 0.699 4.35 Z M 13.037 5.488 c 3.182 0.0 5.736 2.616 5.736 5.809 s -2.554 5.808 -5.736 5.808 s -5.736 -2.614 -5.736 -5.808 s 2.554 -5.809 5.736 -5.809 Z m 0.0 2.0 c -2.05 0.0 -3.736 1.691 -3.736 3.809 c 0.0 2.117 1.687 3.808 3.736 3.808 c 2.05 0.0 3.736 -1.69 3.736 -3.808 c 0.0 -2.117 -1.687 -3.808 -3.736 -3.809 Z")
        )
    }.build()
}
