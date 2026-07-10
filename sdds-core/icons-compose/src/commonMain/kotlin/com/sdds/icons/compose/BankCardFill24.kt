package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.327 5.638 C 2.02 6.24 2.001 7.018 2.0 8.5 h 20.0 c -0.001 -1.483 -0.02 -2.26 -0.327 -2.862 c -0.288 -0.564 -0.746 -1.023 -1.311 -1.311 C 19.72 4.0 18.88 4.0 17.2 4.0 H 6.8 C 5.12 4.0 4.28 4.0 3.638 4.327 C 3.074 4.615 2.615 5.074 2.327 5.638 Z M 22.0 11.0 H 2.0 v 4.2 c 0.0 1.68 0.0 2.52 0.327 3.162 c 0.288 0.565 0.747 1.023 1.311 1.311 C 4.28 20.0 5.12 20.0 6.8 20.0 h 10.4 c 1.68 0.0 2.52 0.0 3.162 -0.327 c 0.565 -0.288 1.023 -0.746 1.311 -1.311 C 22.0 17.72 22.0 16.88 22.0 15.2 V 11.0 Z")
        )
    }.build()
}
