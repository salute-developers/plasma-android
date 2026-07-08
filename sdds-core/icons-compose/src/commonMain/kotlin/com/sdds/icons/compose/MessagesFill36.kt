package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagesFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagesFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.172 18.949 l 0.481 -2.409 c 0.03 -0.145 0.1 -0.278 0.205 -0.383 L 27.645 4.37 c 0.824 -0.825 2.162 -0.825 2.987 0.0 c 0.824 0.825 0.824 2.162 0.0 2.987 L 18.845 19.143 c -0.104 0.105 -0.238 0.176 -0.383 0.206 l -2.408 0.481 c -0.524 0.105 -0.987 -0.358 -0.882 -0.882 Z m 5.256 1.78 c -0.417 0.418 -0.948 0.702 -1.526 0.818 l -2.414 0.482 c -2.09 0.418 -3.932 -1.425 -3.514 -3.515 l 0.482 -2.414 c 0.116 -0.578 0.4 -1.11 0.817 -1.526 L 24.476 4.369 h -13.68 c -1.005 0.0 -1.827 0.0 -2.496 0.055 C 7.608 4.48 6.984 4.6 6.4 4.898 C 5.487 5.363 4.744 6.106 4.279 7.02 C 3.982 7.603 3.861 8.23 3.805 8.92 C 3.75 9.588 3.75 10.411 3.75 11.417 v 12.79 c 0.0 1.005 0.0 1.828 0.055 2.496 c 0.056 0.692 0.177 1.317 0.474 1.901 c 0.465 0.913 1.208 1.656 2.121 2.121 c 0.584 0.298 1.208 0.418 1.9 0.475 c 0.669 0.055 1.49 0.055 2.496 0.055 h 12.788 c 1.006 0.0 1.828 0.0 2.496 -0.055 c 0.692 -0.057 1.317 -0.177 1.9 -0.475 c 0.914 -0.465 1.656 -1.208 2.122 -2.121 c 0.297 -0.584 0.418 -1.209 0.474 -1.9 c 0.055 -0.669 0.055 -1.492 0.055 -2.497 V 10.525 L 20.428 20.73 Z")
        )
    }.build()
}
