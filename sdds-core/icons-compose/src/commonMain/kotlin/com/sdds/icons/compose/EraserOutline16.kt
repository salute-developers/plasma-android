package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EraserOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EraserOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.035 1.86 c 0.45 -0.147 0.935 -0.147 1.385 0.0 c 0.286 0.094 0.53 0.258 0.775 0.468 c 0.237 0.202 0.508 0.473 0.84 0.806 l 0.95 0.954 l 0.014 0.014 c 0.332 0.334 0.602 0.605 0.804 0.843 c 0.208 0.247 0.372 0.49 0.465 0.777 c 0.146 0.451 0.146 0.937 0.0 1.388 c -0.093 0.287 -0.257 0.53 -0.465 0.777 c -0.202 0.238 -0.472 0.51 -0.804 0.843 l -4.503 4.52 h 5.754 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 5.817 c -0.97 0.0 -1.901 -0.386 -2.586 -1.074 l -0.603 -0.605 c -0.331 -0.333 -0.602 -0.604 -0.803 -0.843 c -0.209 -0.246 -0.373 -0.49 -0.466 -0.777 c -0.145 -0.45 -0.145 -0.936 0.0 -1.387 c 0.093 -0.287 0.257 -0.53 0.466 -0.777 c 0.201 -0.238 0.472 -0.51 0.803 -0.843 l 4.792 -4.81 C 7.752 2.801 8.022 2.53 8.26 2.328 c 0.245 -0.21 0.488 -0.374 0.775 -0.468 Z m -1.95 11.39 l 3.328 -3.342 l -4.165 -4.18 l -2.896 2.907 C 3.002 8.987 2.76 9.229 2.588 9.433 C 2.42 9.632 2.347 9.76 2.311 9.872 c -0.081 0.25 -0.081 0.52 0.0 0.771 c 0.036 0.112 0.109 0.24 0.277 0.44 c 0.172 0.203 0.413 0.446 0.764 0.797 l 0.587 0.59 c 0.498 0.5 1.173 0.78 1.878 0.78 h 1.267 Z M 6.953 5.02 l 4.165 4.18 l 1.157 -1.161 c 0.35 -0.352 0.591 -0.595 0.763 -0.798 c 0.168 -0.2 0.241 -0.328 0.277 -0.44 c 0.082 -0.25 0.082 -0.52 0.0 -0.77 c -0.036 -0.112 -0.109 -0.24 -0.277 -0.44 c -0.172 -0.203 -0.413 -0.446 -0.763 -0.798 L 11.34 3.855 c -0.35 -0.351 -0.592 -0.594 -0.795 -0.766 c -0.198 -0.17 -0.326 -0.242 -0.436 -0.278 c -0.249 -0.081 -0.517 -0.081 -0.765 0.0 c -0.11 0.036 -0.239 0.109 -0.437 0.278 C 8.705 3.26 8.464 3.504 8.113 3.855 L 6.953 5.02 Z")
        )
    }.build()
}
