package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideRightFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideRightFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.1 3.04 C 9.286 2.962 9.499 3.0 9.644 3.14 l 4.703 4.5 C 14.444 7.733 14.5 7.864 14.5 8.0 c 0.0 0.136 -0.056 0.267 -0.154 0.361 l -4.703 4.5 C 9.498 13.0 9.285 13.04 9.1 12.96 c -0.184 -0.079 -0.304 -0.26 -0.304 -0.46 v -2.232 H 2.75 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 V 6.982 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 6.047 V 3.5 c 0.0 -0.2 0.12 -0.381 0.304 -0.46 Z")
        )
    }.build()
}
