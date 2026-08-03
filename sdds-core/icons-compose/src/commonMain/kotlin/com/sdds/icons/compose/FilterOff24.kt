package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.016 4.045 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.061 0.0 L 16.69 6.25 H 3.75 C 3.336 6.25 3.0 6.586 3.0 7.0 s 0.336 0.75 0.75 0.75 h 11.44 l -3.5 3.5 H 6.75 C 6.336 11.25 6.0 11.586 6.0 12.0 s 0.336 0.75 0.75 0.75 h 3.44 l -7.206 7.205 c -0.292 0.293 -0.292 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 l 16.97 -16.97 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.932 11.25 l -1.5 1.5 h 2.818 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -1.318 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.932 16.25 l -1.45 1.45 c 0.083 0.032 0.173 0.05 0.268 0.05 h 4.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -3.318 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.745 6.437 L 19.432 7.75 h 0.818 C 20.664 7.75 21.0 7.414 21.0 7.0 c 0.0 -0.224 -0.099 -0.426 -0.255 -0.563 Z")
        )
    }.build()
}
