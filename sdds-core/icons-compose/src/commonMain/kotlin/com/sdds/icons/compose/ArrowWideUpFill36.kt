package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideUpFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideUpFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 4.25 c 0.269 0.0 0.527 0.109 0.715 0.302 l 9.75 9.993 c 0.281 0.288 0.363 0.716 0.206 1.087 c -0.156 0.37 -0.52 0.611 -0.921 0.611 h -4.92 V 29.25 c 0.0 1.38 -1.119 2.5 -2.5 2.5 h -4.66 c -1.381 0.0 -2.5 -1.12 -2.5 -2.5 V 16.243 H 8.25 c -0.402 0.0 -0.765 -0.24 -0.921 -0.611 c -0.157 -0.37 -0.076 -0.8 0.205 -1.087 l 9.75 -9.993 C 17.472 4.359 17.73 4.25 18.0 4.25 Z")
        )
    }.build()
}
