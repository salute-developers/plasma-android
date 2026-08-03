package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.11 12.19 C 18.957 13.34 18.163 15.0 16.765 15.0 H 13.23 v 5.5 l -1.0 1.5 l -1.0 -1.5 v -4.935 l 5.393 -5.394 l 1.486 2.019 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.25 2.0 c 0.743 0.0 1.31 0.688 1.192 1.447 l -0.486 3.149 l 3.985 -3.985 c 0.293 -0.292 0.767 -0.292 1.06 0.0 c 0.293 0.293 0.293 0.769 0.0 1.062 l -16.97 16.97 c -0.293 0.293 -0.768 0.293 -1.061 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.061 l 4.588 -4.587 c -1.314 -0.104 -2.03 -1.692 -1.21 -2.805 l 2.056 -2.793 c 0.28 -0.38 0.399 -0.864 0.326 -1.336 L 8.016 3.447 C 7.899 2.687 8.466 2.0 9.209 2.0 h 6.041 Z")
        )
    }.build()
}
