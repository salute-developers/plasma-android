package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppleLogoFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppleLogoFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.916 4.388 c 0.48 0.02 1.826 0.182 2.691 1.385 c -0.07 0.044 -1.604 0.898 -1.59 2.667 c 0.023 2.114 1.96 2.822 1.983 2.829 c -0.023 0.05 -0.312 1.008 -1.02 1.98 c -0.614 0.868 -1.266 1.715 -2.257 1.73 c -0.99 0.02 -1.309 -0.554 -2.433 -0.554 c -1.131 0.0 -1.479 0.539 -2.418 0.574 c -0.969 0.035 -1.701 -0.924 -2.322 -1.77 c -1.265 -1.73 -2.234 -4.914 -0.932 -7.056 c 0.643 -1.064 1.797 -1.736 3.047 -1.757 c 0.946 -0.014 1.848 0.608 2.433 0.608 c 0.576 0.0 1.672 -0.748 2.818 -0.636 Z M 10.93 1.0 c 0.097 0.819 -0.251 1.644 -0.769 2.232 c -0.51 0.595 -1.353 1.058 -2.182 0.995 C 7.87 3.422 8.282 2.582 8.756 2.05 C 9.296 1.469 10.19 1.028 10.93 1.0 Z")
        )
    }.build()
}
