package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandPointerFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandPointerFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.928 2.695 c 0.0 -0.236 0.091 -0.404 0.221 -0.516 c 0.133 -0.115 0.315 -0.177 0.503 -0.18 C 6.839 1.998 7.02 2.057 7.15 2.17 c 0.127 0.108 0.22 0.278 0.22 0.526 v 4.527 c 0.0 0.096 0.08 0.174 0.179 0.174 c 0.099 0.0 0.178 -0.078 0.178 -0.175 V 5.83 c 0.0 -0.312 0.102 -0.53 0.239 -0.668 c 0.138 -0.14 0.321 -0.21 0.506 -0.21 c 0.184 0.0 0.367 0.07 0.505 0.21 C 9.115 5.3 9.217 5.517 9.217 5.83 v 1.933 c 0.0 0.097 0.08 0.175 0.178 0.175 c 0.099 0.0 0.179 -0.079 0.179 -0.175 V 6.177 c 0.0 -0.361 0.32 -0.6 0.674 -0.596 c 0.171 0.002 0.337 0.063 0.46 0.19 c 0.123 0.128 0.22 0.336 0.22 0.659 v 1.836 c 0.0 0.097 0.08 0.174 0.178 0.174 c 0.098 0.0 0.178 -0.078 0.178 -0.174 V 7.222 c 0.0 -0.403 0.35 -0.656 0.726 -0.64 c 0.183 0.007 0.364 0.08 0.5 0.231 c 0.136 0.15 0.24 0.392 0.24 0.757 v 2.785 c 0.0 1.81 -1.478 3.232 -3.254 3.57 c -0.884 0.167 -1.834 0.063 -2.699 -0.394 c -0.863 -0.457 -1.654 -1.271 -2.21 -2.544 C 3.654 8.557 3.653 8.556 3.3 7.52 L 3.297 7.515 C 3.15 7.084 3.367 6.736 3.675 6.596 C 3.83 6.526 4.003 6.51 4.163 6.561 C 4.32 6.61 4.477 6.727 4.598 6.949 c 0.081 0.182 0.327 0.7 0.552 1.173 L 5.455 8.76 l 0.133 0.277 c 0.035 0.074 0.118 0.114 0.2 0.097 c 0.082 -0.018 0.14 -0.09 0.14 -0.17 V 2.694 Z")
        )
    }.build()
}
