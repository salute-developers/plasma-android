package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LangFlow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LangFlow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.124 12.473 h 2.675 c 0.525 0.0 0.951 0.424 0.952 0.948 v 1.576 c 0.0 0.524 -0.427 0.948 -0.952 0.948 h -2.334 c -0.252 0.0 -0.493 0.1 -0.671 0.279 l -4.006 3.998 c -0.179 0.178 -0.42 0.278 -0.673 0.278 h -1.926 c -0.515 0.0 -0.937 -0.41 -0.95 -0.924 l -0.041 -1.61 c -0.014 -0.533 0.415 -0.973 0.95 -0.973 h 1.657 c 0.252 0.0 0.494 -0.1 0.672 -0.278 l 3.973 -3.965 c 0.178 -0.178 0.42 -0.278 0.672 -0.278 h 0.002 Z m 2.675 -6.943 c 0.525 0.0 0.95 0.425 0.95 0.949 v 1.576 c 0.0 0.524 -0.425 0.949 -0.95 0.949 h -2.334 c -0.252 0.0 -0.494 0.1 -0.672 0.277 l -4.006 4.0 c -0.179 0.177 -0.42 0.278 -0.672 0.278 h -2.34 c -0.245 0.0 -0.481 0.094 -0.658 0.263 L 5.62 18.124 c -0.177 0.17 -0.413 0.264 -0.658 0.264 h -1.64 c -0.524 0.0 -0.95 -0.426 -0.95 -0.95 V 15.82 c 0.0 -0.524 0.426 -0.948 0.95 -0.948 h 1.629 c 0.252 0.0 0.493 -0.1 0.672 -0.278 l 4.27 -4.263 c 0.178 -0.178 0.42 -0.278 0.673 -0.278 h 2.24 c 0.251 0.0 0.493 -0.1 0.671 -0.279 L 17.45 5.81 c 0.178 -0.178 0.42 -0.279 0.672 -0.279 h 2.677 Z M 12.852 3.5 c 0.525 0.0 0.951 0.424 0.951 0.948 v 1.576 c 0.0 0.524 -0.426 0.95 -0.95 0.95 h -2.335 c -0.252 0.0 -0.494 0.1 -0.672 0.277 L 5.84 11.25 c -0.178 0.178 -0.42 0.278 -0.672 0.278 H 3.242 c -0.515 0.0 -0.937 -0.41 -0.95 -0.925 L 2.25 8.995 C 2.237 8.462 2.666 8.021 3.2 8.021 h 1.657 c 0.252 0.0 0.494 -0.1 0.672 -0.277 L 9.503 3.78 c 0.178 -0.178 0.42 -0.278 0.671 -0.278 L 10.176 3.5 h 2.676 Z")
        )
    }.build()
}
