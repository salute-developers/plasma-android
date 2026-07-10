package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashATMOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashATMOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.0 6.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -7.17 h -0.056 h -13.548 h -0.058 h -7.167 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 5.054 v 0.172 v 21.155 c 0.0 0.185 0.0 0.379 0.013 0.545 c 0.015 0.187 0.053 0.426 0.177 0.67 c 0.168 0.33 0.436 0.598 0.765 0.766 c 0.245 0.124 0.484 0.162 0.67 0.177 c 0.167 0.014 0.361 0.014 0.546 0.013 h 13.548 c 0.185 0.0 0.38 0.0 0.546 -0.013 c 0.187 -0.015 0.426 -0.053 0.67 -0.177 c 0.33 -0.168 0.597 -0.436 0.765 -0.765 c 0.125 -0.245 0.162 -0.484 0.177 -0.67 c 0.014 -0.167 0.014 -0.361 0.014 -0.546 V 6.672 V 6.5 H 32.0 Z m -7.254 0.0 H 11.255 h -0.2 v 0.2 v 21.098 v 0.2 h 0.2 h 13.49 h 0.2 v -0.2 V 6.7 V 6.5 h -0.2 Z M 18.0 12.564 c 1.745 0.0 3.162 1.418 3.162 3.17 c 0.0 1.751 -1.417 3.168 -3.162 3.168 c -1.745 0.0 -3.162 -1.417 -3.162 -3.169 s 1.417 -3.169 3.162 -3.169 Z m 5.162 3.17 c 0.0 -2.854 -2.31 -5.17 -5.162 -5.17 s -5.162 2.316 -5.162 5.17 c 0.0 2.853 2.31 5.168 5.162 5.168 s 5.162 -2.315 5.162 -5.169 Z m -7.674 8.716 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 3.027 c 0.552 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.448 1.0 -1.0 1.0 h -3.027 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 Z")
        )
    }.build()
}
