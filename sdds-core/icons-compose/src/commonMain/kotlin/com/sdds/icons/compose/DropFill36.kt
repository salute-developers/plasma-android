package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.18 3.272 c 0.482 -0.363 1.158 -0.363 1.64 0.0 l 0.25 0.195 l 0.541 0.44 c 0.3 0.25 0.623 0.53 0.963 0.834 c 1.292 1.157 2.584 2.46 3.792 3.886 C 27.876 12.768 30.0 17.09 30.0 21.427 C 30.0 27.819 24.627 33.0 18.0 33.0 S 6.0 27.818 6.0 21.428 c 0.0 -4.338 2.124 -8.66 5.634 -12.801 c 1.208 -1.426 2.5 -2.729 3.792 -3.886 c 0.34 -0.304 0.662 -0.583 0.963 -0.834 l 0.293 -0.241 l 0.498 -0.394 Z")
        )
    }.build()
}
