package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlasherFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlasherFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.75 3.749 c 0.0 -0.414 -0.335 -0.75 -0.75 -0.75 c -0.413 0.0 -0.75 0.336 -0.75 0.75 v 3.497 c 0.0 0.414 0.337 0.75 0.75 0.75 c 0.415 0.0 0.75 -0.336 0.75 -0.75 V 3.749 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 19.78 6.656 c 0.293 -0.293 0.293 -0.768 0.0 -1.061 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 l -1.768 1.768 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 1.768 -1.767 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 4.222 5.607 c 0.293 -0.293 0.767 -0.293 1.06 0.0 L 7.05 7.375 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.768 0.293 -1.06 0.0 L 4.221 6.668 c -0.293 -0.293 -0.293 -0.768 0.0 -1.061 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 17.155 18.5 l -0.285 -5.415 c -0.091 -1.726 -1.517 -3.08 -3.246 -3.08 h -3.256 c -1.729 0.0 -3.155 1.354 -3.246 3.08 L 6.837 18.5 h 10.319 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 18.323 19.494 C 18.3 19.498 18.276 19.5 18.251 19.5 H 5.75 c -0.025 0.0 -0.049 -0.002 -0.073 -0.006 c -0.38 0.037 -0.677 0.357 -0.677 0.747 c 0.0 0.414 0.336 0.75 0.75 0.75 h 12.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.39 -0.297 -0.71 -0.678 -0.747 Z")
        )
    }.build()
}
