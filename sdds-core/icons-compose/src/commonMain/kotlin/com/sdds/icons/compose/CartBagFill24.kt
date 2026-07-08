package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CartBagFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CartBagFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.752 2.0 c -0.415 0.0 -0.75 0.336 -0.75 0.75 S 7.337 3.5 7.752 3.5 h 8.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 16.666 2.0 16.252 2.0 h -8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.472 5.0 h 5.06 c 0.634 0.0 1.155 0.0 1.58 0.034 c 0.44 0.035 0.838 0.11 1.215 0.292 c 0.592 0.287 1.082 0.747 1.407 1.32 c 0.207 0.364 0.307 0.757 0.37 1.194 c 0.061 0.421 0.095 0.94 0.136 1.574 l 0.488 7.563 c 0.045 0.712 0.083 1.294 0.074 1.767 c -0.01 0.488 -0.068 0.932 -0.258 1.35 c -0.295 0.65 -0.797 1.186 -1.428 1.523 c -0.404 0.216 -0.843 0.303 -1.33 0.343 C 16.315 22.0 15.732 22.0 15.018 22.0 H 8.986 c -0.715 0.0 -1.297 0.0 -1.769 -0.04 c -0.487 -0.04 -0.925 -0.127 -1.33 -0.343 c -0.63 -0.337 -1.133 -0.873 -1.428 -1.524 c -0.19 -0.417 -0.248 -0.86 -0.258 -1.35 c -0.009 -0.472 0.029 -1.054 0.075 -1.766 l 0.488 -7.563 c 0.04 -0.633 0.074 -1.153 0.135 -1.574 c 0.063 -0.437 0.164 -0.83 0.37 -1.195 c 0.325 -0.572 0.816 -1.032 1.407 -1.319 c 0.377 -0.183 0.776 -0.257 1.216 -0.292 C 8.317 5.0 8.837 5.0 9.472 5.0 Z m -0.72 2.75 c 0.414 0.0 0.75 0.336 0.75 0.75 c 0.0 0.328 0.064 0.653 0.19 0.957 c 0.126 0.303 0.31 0.579 0.542 0.81 c 0.232 0.233 0.508 0.417 0.81 0.543 c 0.304 0.125 0.63 0.19 0.958 0.19 c 0.328 0.0 0.653 -0.065 0.956 -0.19 c 0.304 -0.126 0.58 -0.31 0.811 -0.542 c 0.233 -0.232 0.417 -0.508 0.542 -0.811 c 0.126 -0.304 0.19 -0.629 0.19 -0.957 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 c 0.415 0.0 0.75 0.336 0.75 0.75 c 0.0 0.525 -0.103 1.045 -0.304 1.53 c -0.2 0.486 -0.495 0.927 -0.867 1.298 c -0.371 0.372 -0.812 0.667 -1.298 0.867 c -0.485 0.201 -1.005 0.305 -1.53 0.305 c -0.526 0.0 -1.046 -0.104 -1.531 -0.305 c -0.485 -0.2 -0.926 -0.495 -1.298 -0.867 c -0.371 -0.371 -0.666 -0.812 -0.867 -1.297 c -0.2 -0.486 -0.304 -1.006 -0.304 -1.531 c 0.0 -0.414 0.335 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
