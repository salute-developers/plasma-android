package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideDownFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideDownFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.33 4.25 c 1.381 0.0 2.5 1.12 2.5 2.5 v 13.007 h 4.92 c 0.402 0.0 0.765 0.24 0.921 0.611 c 0.157 0.37 0.075 0.8 -0.206 1.087 l -9.75 9.993 C 18.527 31.641 18.27 31.75 18.0 31.75 c -0.27 0.0 -0.528 -0.109 -0.716 -0.302 l -9.75 -9.993 c -0.281 -0.288 -0.362 -0.716 -0.205 -1.087 c 0.156 -0.37 0.519 -0.611 0.92 -0.611 h 4.92 V 6.75 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 h 4.662 Z")
        )
    }.build()
}
