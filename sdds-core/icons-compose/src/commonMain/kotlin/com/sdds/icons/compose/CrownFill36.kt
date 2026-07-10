package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CrownFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CrownFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.198 8.853 c 0.152 -0.203 0.279 -0.427 0.376 -0.665 c 0.252 -0.616 0.296 -1.3 0.126 -1.943 c -0.17 -0.644 -0.546 -1.213 -1.067 -1.62 C 19.11 4.22 18.47 4.0 17.813 4.0 c -0.658 0.0 -1.297 0.22 -1.82 0.626 c -0.521 0.406 -0.896 0.975 -1.066 1.619 c -0.17 0.644 -0.127 1.327 0.125 1.943 c 0.098 0.238 0.225 0.462 0.376 0.665 l -4.574 5.387 c -0.116 0.137 -0.312 0.172 -0.467 0.083 l -2.692 -1.549 c 0.04 -0.277 0.043 -0.56 0.006 -0.84 c -0.085 -0.662 -0.384 -1.275 -0.85 -1.747 c -0.464 -0.471 -1.07 -0.774 -1.722 -0.861 c -0.653 -0.087 -1.315 0.046 -1.885 0.38 c -0.57 0.333 -1.015 0.848 -1.267 1.464 c -0.251 0.616 -0.295 1.298 -0.125 1.942 c 0.17 0.644 0.545 1.213 1.067 1.62 c 0.166 0.129 0.344 0.239 0.531 0.33 l 2.567 13.297 c 0.24 1.244 1.316 2.141 2.567 2.141 h 18.459 c 1.25 0.0 2.326 -0.897 2.566 -2.141 l 2.536 -13.137 c 0.336 -0.106 0.653 -0.271 0.936 -0.49 c 0.522 -0.407 0.897 -0.976 1.067 -1.62 c 0.17 -0.644 0.126 -1.326 -0.126 -1.942 c -0.251 -0.616 -0.697 -1.13 -1.266 -1.464 c -0.57 -0.334 -1.232 -0.467 -1.885 -0.38 c -0.652 0.087 -1.258 0.39 -1.723 0.861 c -0.465 0.472 -0.764 1.085 -0.85 1.746 c -0.027 0.213 -0.032 0.428 -0.015 0.64 l -3.043 1.75 c -0.156 0.089 -0.351 0.054 -0.468 -0.083 l -4.574 -5.387 Z m -2.385 17.104 c 1.65 0.0 2.989 -1.356 2.989 -3.028 c 0.0 -1.673 -1.338 -3.029 -2.989 -3.029 c -1.65 0.0 -2.988 1.356 -2.988 3.029 c 0.0 1.672 1.338 3.028 2.988 3.028 Z")
        )
    }.build()
}
