package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinYuanFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinYuanFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.5 18.75 c 0.0 2.775 -0.837 5.355 -2.273 7.5 h -10.36 C 18.95 26.103 19.0 25.932 19.0 25.75 v -0.961 h 3.2 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 H 19.0 v -1.924 h 3.2 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -2.349 l 3.485 -5.317 c 0.303 -0.462 0.174 -1.082 -0.288 -1.384 c -0.462 -0.303 -1.082 -0.174 -1.384 0.288 L 18.0 18.042 l -3.664 -5.59 c -0.302 -0.462 -0.922 -0.591 -1.384 -0.288 c -0.462 0.302 -0.591 0.922 -0.288 1.384 l 3.485 5.317 H 13.8 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 H 17.0 v 1.924 h -3.2 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 H 17.0 v 0.961 c 0.0 0.182 0.049 0.353 0.134 0.5 H 6.774 C 5.336 24.105 4.5 21.525 4.5 18.75 c 0.0 -7.456 6.044 -13.5 13.5 -13.5 s 13.5 6.044 13.5 13.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.125 28.5 C 3.504 28.5 3.0 29.004 3.0 29.625 s 0.504 1.125 1.125 1.125 h 27.75 c 0.621 0.0 1.125 -0.504 1.125 -1.125 S 32.496 28.5 31.875 28.5 H 4.125 Z")
        )
    }.build()
}
