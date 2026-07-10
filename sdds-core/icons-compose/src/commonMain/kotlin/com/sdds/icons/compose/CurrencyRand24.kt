package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyRand24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyRand24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.25 8.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 2.25 c 1.657 0.0 3.0 1.343 3.0 3.0 c 0.0 1.248 -0.762 2.318 -1.847 2.77 l 1.75 3.112 c 0.204 0.361 0.076 0.819 -0.285 1.022 c -0.361 0.203 -0.819 0.075 -1.022 -0.286 l -2.035 -3.618 H 10.75 v 3.25 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 8.0 Z m 2.985 3.75 H 10.75 h 1.485 Z m 0.026 0.0 c 0.823 -0.006 1.489 -0.675 1.489 -1.5 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 h -1.5 v 3.0")
        )
    }.build()
}
