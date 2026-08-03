package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.63 8.735 c -0.293 0.293 -0.293 0.768 0.0 1.061 c 0.292 0.293 0.767 0.293 1.06 0.0 l 4.601 -4.601 v 15.32 c 0.0 0.415 0.336 0.75 0.75 0.75 c 0.415 0.0 0.75 -0.335 0.75 -0.75 V 5.292 l 4.506 4.505 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 L 12.63 3.007 c -0.352 -0.352 -0.921 -0.352 -1.273 0.0 L 5.63 8.735 Z")
        )
    }.build()
}
