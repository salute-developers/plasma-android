package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowRightOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowRightOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.654 4.004 c 0.187 0.01 0.368 0.037 0.544 0.079 c -0.065 -0.016 -0.131 -0.03 -0.198 -0.041 V 4.0 h 3.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 10.0 l -0.004 0.154 C 21.916 18.74 20.606 20.0 19.0 20.0 h -3.0 v -0.042 c 0.032 -0.005 0.064 -0.015 0.096 -0.021 c -0.144 0.029 -0.291 0.051 -0.442 0.06 L 15.5 20.0 H 5.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 7.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 10.5 l 0.154 0.004 Z M 18.5 17.032 l -0.003 0.122 c -0.036 0.709 -0.32 1.35 -0.764 1.846 h 0.187 L 21.0 15.92 v -1.39 l -2.501 2.502 Z M 18.981 19.0 H 19.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 v -0.02 L 18.98 19.0 Z M 17.0 7.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 H 5.0 C 4.172 5.5 3.5 6.172 3.5 7.0 v 10.0 c 0.0 0.828 0.672 1.5 1.5 1.5 h 10.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 7.0 Z m 1.5 7.031 v 1.938 l 2.5 -2.5 V 11.53 l -2.5 2.501 Z m 0.0 -3.0 v 1.938 l 2.5 -2.5 V 8.53 l -2.5 2.501 Z m 0.0 -3.0 V 9.97 l 2.5 -2.5 V 7.0 c 0.0 -0.417 -0.129 -0.803 -0.347 -1.123 L 18.5 8.031 Z m -0.001 -1.06 l 1.624 -1.624 C 19.803 5.129 19.417 5.0 19.0 5.0 h -0.47 l -0.46 0.459 C 18.341 5.909 18.5 6.436 18.5 7.0 l -0.001 -0.03 Z")
        )
    }.build()
}
