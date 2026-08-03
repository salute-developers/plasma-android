package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideRightFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideRightFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.368 7.329 c 0.37 -0.157 0.8 -0.076 1.087 0.205 l 9.993 9.75 C 31.641 17.472 31.75 17.73 31.75 18.0 c 0.0 0.269 -0.109 0.527 -0.302 0.715 l -9.993 9.75 c -0.288 0.281 -0.716 0.363 -1.087 0.206 c -0.37 -0.156 -0.611 -0.52 -0.611 -0.921 v -4.92 H 6.75 c -1.38 0.0 -2.5 -1.119 -2.5 -2.5 v -4.66 c 0.0 -1.381 1.12 -2.5 2.5 -2.5 h 13.007 V 8.25 c 0.0 -0.402 0.24 -0.765 0.611 -0.921 Z")
        )
    }.build()
}
