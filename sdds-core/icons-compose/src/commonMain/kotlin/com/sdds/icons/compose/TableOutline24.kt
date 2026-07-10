package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 12.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 6.0 c -0.235 0.0 -0.464 -0.03 -0.684 -0.081 L 5.2 20.889 l -0.154 -0.046 l -0.121 -0.044 l -0.146 -0.06 l -0.125 -0.061 c -0.044 -0.023 -0.088 -0.044 -0.13 -0.069 c -0.044 -0.025 -0.087 -0.05 -0.13 -0.078 c -0.037 -0.024 -0.074 -0.047 -0.11 -0.073 c -0.04 -0.027 -0.077 -0.055 -0.114 -0.084 c -0.038 -0.029 -0.075 -0.058 -0.111 -0.089 c -0.04 -0.034 -0.08 -0.07 -0.118 -0.106 l -0.08 -0.077 c -0.04 -0.041 -0.077 -0.084 -0.115 -0.126 c -0.027 -0.032 -0.056 -0.063 -0.082 -0.095 c -0.03 -0.037 -0.056 -0.075 -0.084 -0.113 c -0.028 -0.038 -0.056 -0.076 -0.082 -0.115 c -0.035 -0.052 -0.066 -0.106 -0.098 -0.16 c -0.015 -0.028 -0.033 -0.055 -0.047 -0.083 C 3.33 19.37 3.31 19.326 3.29 19.283 c -0.022 -0.046 -0.045 -0.09 -0.064 -0.138 c -0.015 -0.035 -0.026 -0.071 -0.04 -0.107 C 3.069 18.714 3.0 18.365 3.0 18.0 V 6.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 12.0 Z M 4.5 18.0 c 0.0 0.828 0.672 1.5 1.5 1.5 h 2.5 v -4.0 h -4.0 V 18.0 Z m 5.5 1.5 h 4.0 v -4.0 h -4.0 v 4.0 Z m 5.5 0.0 H 18.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 v -2.5 h -4.0 v 4.0 Z M 4.5 10.0 v 4.0 h 4.0 v -4.0 h -4.0 Z m 5.5 0.0 v 4.0 h 4.0 v -4.0 h -4.0 Z m 5.5 0.0 v 4.0 h 4.0 v -4.0 h -4.0 Z m 0.0 -1.5 h 4.0 V 6.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 h -2.5 v 4.0 Z m -5.5 0.0 h 4.0 v -4.0 h -4.0 v 4.0 Z m -4.0 -4.0 C 5.172 4.5 4.5 5.172 4.5 6.0 v 2.5 h 4.0 v -4.0 H 6.0 Z")
        )
    }.build()
}
