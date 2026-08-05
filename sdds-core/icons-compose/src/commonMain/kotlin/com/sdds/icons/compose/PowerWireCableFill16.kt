package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireCableFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireCableFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.142 1.0 c 0.367 0.0 0.678 0.295 0.678 0.676 v 2.838 h 0.216 c 0.663 0.0 1.214 0.53 1.214 1.202 v 2.396 c 0.0 0.97 -0.431 1.889 -1.176 2.517 l -1.253 1.056 c -0.046 0.04 -0.071 0.096 -0.071 0.152 V 15.0 h -3.5 v -3.163 c 0.0 -0.056 -0.025 -0.112 -0.071 -0.152 L 4.926 10.63 C 4.18 10.0 3.75 9.082 3.75 8.112 V 5.716 c 0.0 -0.672 0.551 -1.202 1.214 -1.202 h 0.213 V 1.676 C 5.177 1.295 5.488 1.0 5.855 1.0 h 4.287 Z M 6.177 4.514 H 9.82 V 2.0 H 6.177 v 2.514 Z")
        )
    }.build()
}
