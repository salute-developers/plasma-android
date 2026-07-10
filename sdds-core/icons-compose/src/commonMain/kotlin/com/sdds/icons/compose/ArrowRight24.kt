package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.263 18.359 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 l 4.6 -4.602 H 3.484 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 15.225 L 14.203 6.69 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 5.728 5.727 c 0.351 0.352 0.351 0.922 0.0 1.273 l -5.728 5.728 Z")
        )
    }.build()
}
