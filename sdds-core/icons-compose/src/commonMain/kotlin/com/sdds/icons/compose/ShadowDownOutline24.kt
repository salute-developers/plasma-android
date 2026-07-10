package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowDownOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowDownOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.0 2.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 10.5 l -0.004 0.154 c -0.01 0.187 -0.038 0.368 -0.08 0.544 c 0.016 -0.065 0.03 -0.131 0.042 -0.198 H 20.0 v 3.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 7.0 l -0.154 -0.004 C 5.26 21.916 4.0 20.606 4.0 19.0 v -3.0 h 0.042 c 0.005 0.032 0.014 0.064 0.02 0.096 c -0.029 -0.144 -0.05 -0.291 -0.058 -0.442 L 4.0 15.5 V 5.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 10.0 Z M 5.0 19.0 c 0.0 1.105 0.895 2.0 2.0 2.0 h 0.02 L 5.0 18.98 V 19.0 Z m 0.0 -1.081 L 8.08 21.0 h 1.39 l -2.502 -2.501 l -0.122 -0.003 c -0.71 -0.036 -1.35 -0.32 -1.846 -0.765 v 0.188 Z M 8.031 18.5 l 2.5 2.5 h 1.939 l -2.501 -2.5 H 8.03 Z M 7.0 3.5 C 6.172 3.5 5.5 4.172 5.5 5.0 v 10.5 C 5.5 16.328 6.172 17.0 7.0 17.0 h 10.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 5.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 H 7.0 Z M 13.53 21.0 h 1.94 l -2.501 -2.5 H 11.03 l 2.5 2.5 Z m 3.0 0.0 H 17.0 c 0.417 0.0 0.803 -0.129 1.123 -0.347 L 15.969 18.5 H 14.03 l 2.5 2.5 Z m 0.5 -2.501 l 1.623 1.624 C 18.871 19.803 19.0 19.417 19.0 19.0 v -0.47 l -0.46 -0.46 c -0.45 0.27 -0.976 0.43 -1.54 0.43 l 0.03 -0.001 Z")
        )
    }.build()
}
