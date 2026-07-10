package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AndroidFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AndroidFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.016 11.44 c 0.0 0.382 -0.316 0.693 -0.704 0.693 h -0.804 v 1.964 c 0.0 0.498 -0.404 0.903 -0.903 0.903 c -0.5 0.0 -0.902 -0.405 -0.902 -0.903 v -1.964 H 7.298 v 1.964 C 7.298 14.595 6.894 15.0 6.396 15.0 c -0.499 0.0 -0.904 -0.405 -0.904 -0.903 v -1.964 H 4.688 c -0.388 0.0 -0.703 -0.31 -0.704 -0.694 V 5.925 h 8.032 v 5.514 Z M 13.59 5.87 c 0.503 0.0 0.91 0.409 0.91 0.912 v 3.566 c 0.0 0.503 -0.407 0.912 -0.91 0.913 c -0.503 0.0 -0.912 -0.41 -0.912 -0.913 V 6.783 c 0.0 -0.504 0.41 -0.912 0.912 -0.912 Z m -11.179 0.0 c 0.504 0.001 0.911 0.41 0.911 0.913 v 3.564 c 0.0 0.503 -0.407 0.912 -0.91 0.912 c -0.504 0.0 -0.912 -0.41 -0.912 -0.912 V 6.784 c 0.0 -0.504 0.408 -0.912 0.911 -0.912 Z m 7.91 -4.728 c 0.103 -0.149 0.31 -0.188 0.461 -0.087 c 0.152 0.102 0.19 0.306 0.087 0.455 l -0.763 1.104 c 1.069 0.562 1.81 1.532 1.91 2.66 H 3.984 c 0.1 -1.127 0.842 -2.098 1.91 -2.66 L 5.132 1.511 C 5.028 1.36 5.067 1.158 5.218 1.056 c 0.151 -0.1 0.357 -0.062 0.46 0.086 l 0.833 1.206 C 6.972 2.19 7.473 2.1 8.0 2.1 c 0.527 0.0 1.028 0.09 1.49 0.248 l 0.831 -1.205 Z M 6.307 3.305 c -0.246 0.0 -0.445 0.196 -0.445 0.438 s 0.2 0.438 0.445 0.438 S 6.75 3.985 6.75 3.743 S 6.552 3.305 6.307 3.305 Z m 3.443 0.0 c -0.246 0.0 -0.444 0.196 -0.444 0.438 S 9.504 4.181 9.75 4.181 c 0.245 0.0 0.444 -0.196 0.444 -0.438 S 9.995 3.305 9.75 3.305 Z")
        )
    }.build()
}
