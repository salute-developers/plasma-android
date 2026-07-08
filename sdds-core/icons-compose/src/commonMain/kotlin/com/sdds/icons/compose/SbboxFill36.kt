package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.977 4.477 c -0.146 -0.146 -0.383 -0.146 -0.53 0.0 l -2.386 2.387 c -0.526 0.525 -0.58 1.344 -0.162 1.93 l -5.85 5.85 c -0.788 -0.779 -1.278 -1.223 -1.783 -1.515 c -1.74 -1.004 -3.884 -1.004 -5.625 0.0 c -0.641 0.37 -1.258 0.987 -2.49 2.22 l -3.713 3.712 c -1.233 1.233 -1.85 1.85 -2.22 2.491 c -1.004 1.74 -1.004 3.885 0.0 5.625 c 0.37 0.642 0.987 1.258 2.22 2.491 s 1.85 1.85 2.49 2.22 c 1.741 1.005 3.885 1.005 5.626 0.0 c 0.641 -0.37 1.258 -0.987 2.49 -2.22 l 3.713 -3.712 c 1.233 -1.233 1.85 -1.85 2.22 -2.491 c 1.005 -1.74 1.005 -3.885 0.0 -5.625 c -0.292 -0.505 -0.736 -0.995 -1.514 -1.782 l 5.85 -5.85 c 0.586 0.417 1.404 0.363 1.93 -0.162 l 2.386 -2.387 c 0.147 -0.146 0.147 -0.384 0.0 -0.53 l -2.652 -2.652 Z")
        )
    }.build()
}
