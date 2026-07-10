package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyYuan36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyYuan36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.336 11.253 c -0.302 -0.462 -0.922 -0.591 -1.384 -0.289 c -0.462 0.303 -0.591 0.923 -0.288 1.385 l 3.485 5.317 H 13.8 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 H 17.0 v 1.924 h -3.2 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 H 17.0 v 0.96 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 v -0.96 h 3.2 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 H 19.0 v -1.924 h 3.2 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -2.349 l 3.486 -5.317 c 0.302 -0.462 0.173 -1.082 -0.289 -1.385 c -0.462 -0.302 -1.081 -0.173 -1.384 0.289 L 18.0 16.843 l -3.664 -5.59 Z")
        )
    }.build()
}
