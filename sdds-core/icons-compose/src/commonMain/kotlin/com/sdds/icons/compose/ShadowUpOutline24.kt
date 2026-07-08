package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowUpOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowUpOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.0 2.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 3.0 h -0.042 c -0.011 -0.067 -0.026 -0.134 -0.042 -0.2 c 0.042 0.177 0.07 0.359 0.08 0.546 L 20.0 8.5 V 19.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 7.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 8.5 l 0.004 -0.154 c 0.008 -0.151 0.03 -0.298 0.059 -0.443 C 4.056 7.936 4.046 7.967 4.042 8.0 H 4.0 V 5.0 c 0.0 -1.605 1.26 -2.916 2.846 -2.996 L 7.0 2.0 h 10.0 Z M 7.0 7.0 C 6.172 7.0 5.5 7.672 5.5 8.5 V 19.0 c 0.0 0.828 0.672 1.5 1.5 1.5 h 10.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 8.5 C 18.5 7.672 17.828 7.0 17.0 7.0 H 7.0 Z m 1.08 -4.0 L 5.0 6.081 v 0.187 C 5.495 5.824 6.137 5.54 6.846 5.504 L 6.968 5.5 L 9.47 3.0 H 8.08 Z m 8.95 2.501 L 17.0 5.5 c 0.564 0.0 1.09 0.158 1.54 0.429 L 19.0 5.469 V 5.0 c 0.0 -0.417 -0.129 -0.803 -0.347 -1.123 L 17.03 5.5 Z M 10.53 3.0 L 8.031 5.5 H 9.97 l 2.5 -2.5 H 10.53 Z M 7.0 3.0 C 5.895 3.0 5.0 3.895 5.0 5.0 v 0.02 L 7.02 3.0 H 7.0 Z m 5.969 2.5 l 2.5 -2.5 H 13.53 l -2.499 2.5 h 1.938 Z m 5.154 -2.153 C 17.803 3.129 17.417 3.0 17.0 3.0 h -0.47 l -2.499 2.5 h 1.938 l 2.154 -2.153 Z")
        )
    }.build()
}
