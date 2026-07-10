package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Whatsapp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Whatsapp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.059 7.937 c 0.0 1.223 0.32 2.416 0.93 3.468 L 1.0 15.0 l 3.695 -0.965 c 1.018 0.553 2.165 0.845 3.331 0.845 H 8.03 c 3.842 0.0 6.97 -3.113 6.971 -6.937 c 0.0 -1.854 -0.724 -3.597 -2.04 -4.908 C 11.644 1.723 9.894 1.0 8.03 1.0 C 4.186 1.0 1.06 4.112 1.058 7.937 Z m 2.2 3.287 l -0.138 -0.218 c -0.58 -0.918 -0.886 -1.98 -0.886 -3.069 c 0.002 -3.179 2.6 -5.765 5.796 -5.765 c 1.548 0.0 3.002 0.601 4.096 1.69 c 1.095 1.09 1.696 2.54 1.696 4.08 c -0.001 3.18 -2.6 5.766 -5.794 5.766 H 8.027 c -1.04 0.0 -2.06 -0.278 -2.949 -0.804 L 4.866 12.78 l -2.193 0.572 l 0.586 -2.128 Z m 4.77 3.656 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.287 5.037 c -0.13 -0.29 -0.268 -0.295 -0.392 -0.3 c -0.101 -0.004 -0.218 -0.004 -0.334 -0.004 c -0.116 0.0 -0.305 0.043 -0.464 0.217 c -0.16 0.173 -0.61 0.593 -0.61 1.446 s 0.624 1.677 0.711 1.793 c 0.087 0.116 1.205 1.923 2.976 2.617 c 1.47 0.578 1.77 0.463 2.09 0.434 c 0.319 -0.029 1.03 -0.419 1.175 -0.824 c 0.145 -0.405 0.145 -0.752 0.102 -0.824 c -0.044 -0.073 -0.16 -0.116 -0.334 -0.203 c -0.174 -0.086 -1.03 -0.506 -1.19 -0.564 C 9.857 8.768 9.74 8.74 9.625 8.912 c -0.116 0.174 -0.45 0.564 -0.551 0.68 c -0.102 0.116 -0.204 0.13 -0.378 0.043 c -0.174 -0.087 -0.735 -0.27 -1.4 -0.86 c -0.518 -0.46 -0.868 -1.027 -0.97 -1.201 c -0.101 -0.173 -0.01 -0.267 0.077 -0.354 c 0.078 -0.077 0.174 -0.202 0.261 -0.303 c 0.087 -0.102 0.116 -0.174 0.174 -0.29 c 0.058 -0.115 0.03 -0.217 -0.014 -0.303 C 6.78 6.237 6.442 5.38 6.287 5.037 Z")
        )
    }.build()
}
