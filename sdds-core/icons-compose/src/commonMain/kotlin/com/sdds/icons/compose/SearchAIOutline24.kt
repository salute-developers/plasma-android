package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SearchAIOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SearchAIOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.576 12.607 c 0.341 -0.81 1.507 -0.81 1.848 0.0 l 0.03 0.084 l 0.591 1.793 c 0.23 0.696 0.775 1.242 1.47 1.471 l 1.794 0.59 c 0.921 0.304 0.921 1.607 0.0 1.91 l -1.793 0.59 l -0.129 0.047 c -0.634 0.251 -1.127 0.771 -1.342 1.424 l -0.59 1.793 c -0.304 0.921 -1.606 0.921 -1.909 0.0 l -0.59 -1.793 c -0.215 -0.653 -0.709 -1.173 -1.343 -1.424 l -0.128 -0.047 l -1.793 -0.59 c -0.922 -0.303 -0.922 -1.606 0.0 -1.91 l 1.793 -0.59 c 0.695 -0.229 1.241 -0.775 1.47 -1.47 l 0.591 -1.794 l 0.03 -0.084 Z M 10.5 3.25 c 4.004 0.0 7.25 3.246 7.25 7.25 c 0.0 1.732 -0.609 3.32 -1.622 4.567 l 4.903 4.903 c 0.292 0.293 0.292 0.768 0.0 1.06 c -0.293 0.293 -0.768 0.293 -1.06 0.0 l -4.903 -4.902 c -0.551 0.448 -1.17 0.815 -1.837 1.087 c -0.062 -0.5 -0.284 -0.983 -0.67 -1.348 c 2.158 -0.829 3.69 -2.918 3.69 -5.367 c 0.0 -3.176 -2.575 -5.75 -5.75 -5.75 c -3.176 0.0 -5.75 2.574 -5.75 5.75 c 0.0 0.333 0.029 0.66 0.083 0.977 c -0.164 0.181 -0.305 0.396 -0.41 0.646 l -0.01 0.026 l -0.01 0.026 l -0.03 0.083 l -0.009 0.021 l -0.006 0.022 l -0.422 1.28 C 3.497 12.644 3.25 11.6 3.25 10.5 c 0.0 -4.004 3.246 -7.25 7.25 -7.25 Z M 6.38 14.953 c -0.354 1.077 -1.168 1.936 -2.215 2.35 L 3.953 17.38 L 3.588 17.5 l 0.365 0.12 l 0.212 0.077 c 1.047 0.415 1.861 1.273 2.215 2.35 L 6.5 20.41 l 0.12 -0.364 l 0.077 -0.212 c 0.415 -1.047 1.273 -1.86 2.35 -2.215 l 0.364 -0.12 l -0.364 -0.12 c -1.077 -0.354 -1.935 -1.168 -2.35 -2.215 L 6.62 14.953 L 6.5 14.588 l -0.12 0.365 Z")
        )
    }.build()
}
