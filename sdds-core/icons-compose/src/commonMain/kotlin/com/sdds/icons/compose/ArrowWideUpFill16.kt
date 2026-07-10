package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideUpFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideUpFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 1.5 c 0.136 0.0 0.267 0.056 0.361 0.154 l 4.5 4.703 C 13.0 6.502 13.04 6.715 12.96 6.9 c -0.079 0.184 -0.26 0.304 -0.46 0.304 h -2.232 v 6.047 c 0.0 0.69 -0.56 1.25 -1.25 1.25 H 6.982 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 V 7.203 H 3.5 c -0.2 0.0 -0.381 -0.12 -0.46 -0.304 C 2.961 6.715 3.0 6.502 3.14 6.357 l 4.5 -4.703 C 7.733 1.556 7.864 1.5 8.0 1.5 Z")
        )
    }.build()
}
