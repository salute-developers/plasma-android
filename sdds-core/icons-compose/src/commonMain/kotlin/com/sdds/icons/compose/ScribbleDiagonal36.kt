package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScribbleDiagonal36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScribbleDiagonal36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.309 18.81 C 6.732 16.902 15.497 7.186 20.7 4.936 c 3.596 -1.55 5.818 1.328 5.229 3.862 c -0.737 3.148 -2.43 6.063 -4.984 9.887 c -1.755 2.62 -3.608 5.473 -4.443 7.121 c -0.822 1.623 0.086 1.23 0.92 0.553 c 1.866 -1.524 5.18 -4.488 6.175 -5.276 c 1.718 -1.365 4.504 -2.816 6.039 -1.475 c 1.534 1.34 0.515 3.603 -0.405 5.41 c -0.921 1.809 -2.811 4.674 -2.357 5.03 c 0.454 0.358 2.786 -1.106 3.461 -2.016 c 0.614 -0.812 1.535 -0.135 1.007 0.652 c -0.405 0.602 -3.584 3.96 -5.597 2.41 c -1.608 -1.242 0.847 -4.87 1.595 -6.309 c 0.75 -1.439 1.522 -3.037 1.068 -3.554 c -0.43 -0.492 -2.393 0.553 -4.014 2.226 c -1.202 1.242 -4.602 4.538 -6.112 5.707 c -3.462 2.656 -6.555 0.086 -4.836 -3.924 c 1.325 -3.087 3.007 -5.792 4.32 -7.883 c 1.436 -2.287 3.265 -5.374 4.125 -7.637 c 0.184 -0.467 -0.27 -0.836 -0.7 -0.541 c -1.73 1.23 -5.204 4.98 -6.64 6.69 c -1.793 2.14 -4.333 5.485 -5.279 6.567 c -0.945 1.082 -2.737 1.292 -3.903 0.185 c -1.277 -1.23 -1.019 -2.521 -0.061 -3.813 Z")
        )
    }.build()
}
