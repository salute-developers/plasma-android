package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookOpenFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookOpenFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.366 4.0 c 1.49 0.0 2.65 0.369 3.504 0.91 c 0.262 0.165 0.403 0.47 0.403 0.788 c 0.0 4.052 -0.003 10.756 -0.004 13.29 c 0.0 0.56 -0.272 0.673 -0.628 0.253 c -0.49 -0.577 -1.391 -1.273 -3.275 -1.273 c -1.583 0.0 -2.596 0.411 -3.192 0.825 c -0.3 0.209 -0.496 0.418 -0.609 0.578 c -0.136 0.194 -0.101 0.238 -0.101 0.121 C 3.464 19.772 3.135 20.0 2.73 20.0 C 2.328 20.0 2.001 19.773 2.0 19.492 V 7.748 l 0.004 -0.004 C 2.014 7.576 2.056 7.41 2.1 7.278 c 0.056 -0.165 0.135 -0.345 0.237 -0.533 c 0.204 -0.376 0.51 -0.805 0.935 -1.21 C 4.134 4.711 5.468 4.0 7.366 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.634 4.0 c 3.61 0.0 5.293 2.154 5.363 3.709 L 22.0 7.71 L 22.0 7.712 v 11.78 C 22.0 19.772 21.672 20.0 21.269 20.0 c -0.404 0.0 -0.733 -0.227 -0.733 -0.508 c 0.0 0.117 0.035 0.073 -0.101 -0.12 c -0.113 -0.161 -0.308 -0.37 -0.609 -0.579 c -0.596 -0.414 -1.61 -0.825 -3.192 -0.825 c -1.88 0.0 -2.785 0.694 -3.277 1.27 c -0.357 0.42 -0.625 0.31 -0.626 -0.25 L 12.73 5.727 c 0.0 -0.336 0.157 -0.654 0.44 -0.815 C 14.09 4.388 15.357 4.0 16.634 4.0 Z")
        )
    }.build()
}
