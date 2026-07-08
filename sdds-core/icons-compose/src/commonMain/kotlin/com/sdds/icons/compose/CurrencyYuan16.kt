package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyYuan16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyYuan16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.318 4.976 C 6.167 4.745 5.857 4.68 5.626 4.832 C 5.395 4.983 5.33 5.293 5.482 5.524 l 1.592 2.43 H 6.04 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 7.5 v 0.83 H 6.04 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 H 7.5 V 11.2 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -0.415 h 1.46 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 H 8.5 V 8.954 h 1.46 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 8.926 l 1.592 -2.43 c 0.151 -0.23 0.087 -0.54 -0.144 -0.692 c -0.23 -0.152 -0.54 -0.087 -0.692 0.144 L 8.0 7.542 L 6.318 4.976 Z")
        )
    }.build()
}
