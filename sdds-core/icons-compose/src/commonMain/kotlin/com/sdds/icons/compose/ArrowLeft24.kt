package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.724 18.369 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.294 -0.293 0.294 -0.768 0.0 -1.06 l -4.6 -4.602 h 15.32 c 0.415 0.0 0.75 -0.336 0.75 -0.75 s -0.335 -0.75 -0.75 -0.75 H 5.28 l 4.506 -4.505 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.06 0.0 l -5.728 5.727 c -0.352 0.351 -0.352 0.92 0.0 1.272 l 5.727 5.728 Z")
        )
    }.build()
}
