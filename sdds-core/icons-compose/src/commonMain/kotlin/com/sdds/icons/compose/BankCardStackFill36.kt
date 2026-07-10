package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardStackFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardStackFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.0 24.6 V 13.5 c 0.0 -1.399 -0.957 -2.574 -2.251 -2.906 l 0.001 0.724 v 8.863 c 0.0 0.875 0.0 1.663 -0.053 2.319 c -0.058 0.702 -0.188 1.448 -0.56 2.178 c -0.54 1.059 -1.4 1.92 -2.458 2.459 c -0.731 0.372 -1.477 0.502 -2.18 0.56 c -0.655 0.053 -1.442 0.053 -2.318 0.053 H 8.32 l -0.725 -0.001 c 0.333 1.294 1.508 2.25 2.906 2.25 h 17.1 c 1.89 0.0 2.835 0.0 3.557 -0.367 c 0.635 -0.324 1.152 -0.84 1.475 -1.475 C 33.0 27.435 33.0 26.49 33.0 24.6 Z m -4.5 -3.834 c -0.006 1.457 -0.046 2.26 -0.368 2.892 c -0.323 0.635 -0.84 1.15 -1.475 1.474 C 25.935 25.5 24.99 25.5 23.1 25.5 H 8.4 c -1.89 0.0 -2.835 0.0 -3.557 -0.368 c -0.635 -0.323 -1.152 -0.84 -1.475 -1.475 C 3.0 22.936 3.0 21.99 3.0 20.1 v -8.7 c 0.0 -1.89 0.0 -2.835 0.368 -3.557 c 0.323 -0.635 0.84 -1.152 1.475 -1.475 C 5.565 6.0 6.51 6.0 8.4 6.0 h 14.7 c 1.89 0.0 2.835 0.0 3.557 0.368 c 0.635 0.323 1.152 0.84 1.475 1.475 c 0.334 0.655 0.365 1.495 0.368 3.058 v 0.226 v 0.273 v 8.7 v 0.666 Z m -4.125 -9.14 c 0.0 0.62 -0.504 1.124 -1.125 1.124 h -15.0 c -0.621 0.0 -1.125 -0.504 -1.125 -1.125 S 7.629 10.5 8.25 10.5 h 15.0 c 0.621 0.0 1.125 0.504 1.125 1.125 Z")
        )
    }.build()
}
