package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideLeftFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideLeftFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.545 7.534 c 0.288 -0.281 0.716 -0.362 1.087 -0.205 c 0.37 0.156 0.611 0.519 0.611 0.92 v 4.92 H 29.25 c 1.38 0.0 2.5 1.12 2.5 2.5 v 4.662 c 0.0 1.38 -1.12 2.5 -2.5 2.5 H 16.243 v 4.919 c 0.0 0.402 -0.24 0.765 -0.611 0.921 c -0.37 0.157 -0.8 0.075 -1.087 -0.206 l -9.993 -9.75 C 4.359 18.527 4.25 18.27 4.25 18.0 c 0.0 -0.27 0.109 -0.528 0.302 -0.716 l 9.993 -9.75 Z")
        )
    }.build()
}
