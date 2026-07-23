package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.712 5.376 c -0.085 0.15 -0.1 0.346 -0.128 0.738 l -0.567 7.923 c -0.24 3.33 2.132 6.208 5.322 6.711 l -0.003 0.078 v 7.2 c -2.865 0.238 -5.05 1.479 -5.05 2.974 h 12.1 c 0.0 -1.495 -2.184 -2.736 -5.05 -2.974 v -7.2 c 0.0 -0.026 0.0 -0.052 -0.003 -0.078 c 3.19 -0.503 5.561 -3.381 5.323 -6.71 l -0.568 -7.924 c -0.028 -0.392 -0.042 -0.589 -0.128 -0.738 c -0.075 -0.13 -0.188 -0.236 -0.324 -0.301 C 16.48 5.0 16.285 5.0 15.89 5.0 H 6.78 c -0.393 0.0 -0.59 0.0 -0.745 0.075 C 5.9 5.14 5.787 5.245 5.712 5.376 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.14 8.424 c -0.082 0.16 -0.082 0.37 -0.082 0.79 v 11.223 c 0.0 1.536 1.017 2.834 2.413 3.258 c -0.006 0.047 -0.01 0.096 -0.01 0.146 v 4.218 c -2.025 0.302 -3.537 1.504 -3.537 2.941 h 9.074 c 0.0 -1.437 -1.512 -2.639 -3.537 -2.941 v -4.218 c 0.0 -0.05 -0.004 -0.099 -0.01 -0.146 c 1.396 -0.424 2.413 -1.722 2.413 -3.258 V 9.214 c 0.0 -0.42 0.0 -0.63 -0.082 -0.79 c -0.072 -0.141 -0.186 -0.256 -0.327 -0.328 c -0.16 -0.082 -0.37 -0.082 -0.79 -0.082 h -4.407 c -0.42 0.0 -0.63 0.0 -0.79 0.082 c -0.142 0.072 -0.256 0.187 -0.328 0.328 Z")
        )
    }.build()
}
