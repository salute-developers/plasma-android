package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicOffFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicOffFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.004 18.95 c 0.548 0.07 0.935 0.573 0.863 1.12 c -0.314 2.42 -1.485 4.646 -3.3 6.26 c -1.562 1.39 -3.51 2.245 -5.567 2.455 v 3.59 c 0.0 0.553 -0.447 1.0 -1.0 1.0 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 v -3.59 c -1.667 -0.17 -3.263 -0.765 -4.64 -1.725 l 1.442 -1.442 c 1.254 0.792 2.707 1.218 4.198 1.218 c 1.925 0.0 3.788 -0.71 5.239 -2.0 c 1.451 -1.291 2.392 -3.076 2.645 -5.024 c 0.071 -0.547 0.573 -0.934 1.12 -0.863 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.75 4.082 c 0.39 -0.39 1.023 -0.39 1.413 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 30.952 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 5.334 -5.335 c -0.786 -1.24 -1.301 -2.65 -1.494 -4.133 c -0.07 -0.547 0.316 -1.05 0.863 -1.12 c 0.548 -0.072 1.05 0.315 1.12 0.862 c 0.136 1.041 0.469 2.035 0.97 2.932 l 2.075 -2.074 c -0.197 -0.598 -0.305 -1.242 -0.305 -1.913 v -9.08 c 0.0 -3.135 2.338 -5.675 5.222 -5.675 c 2.884 0.0 5.221 2.54 5.221 5.675 v 0.855 l 6.45 -6.45 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.3 18.757 c 0.0 3.134 -2.338 5.674 -5.223 5.674 c -0.879 0.0 -1.708 -0.236 -2.435 -0.653 l 7.657 -7.658 v 2.637 Z")
        )
    }.build()
}
