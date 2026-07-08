package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyPound24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyPound24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.25 8.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 6.75 7.586 6.75 8.0 v 7.9 c 0.0 0.47 0.38 0.85 0.85 0.85 h 3.5 c 0.415 0.0 0.75 -0.336 0.75 -0.75 s -0.335 -0.75 -0.75 -0.75 H 8.25 V 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.9 7.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 7.9 c 0.0 0.47 0.38 0.85 0.85 0.85 h 3.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -2.85 v -2.66 h 2.55 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -2.55 V 8.75 h 2.55 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -3.3 Z")
        )
    }.build()
}
