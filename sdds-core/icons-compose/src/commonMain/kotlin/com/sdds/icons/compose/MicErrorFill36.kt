package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicErrorFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicErrorFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.147 4.0 h -0.07 c -2.883 0.0 -5.221 2.54 -5.221 5.675 v 9.08 c 0.0 3.134 2.338 5.675 5.222 5.675 c 2.816 0.0 5.111 -2.423 5.218 -5.454 C 19.345 17.64 16.5 13.902 16.5 9.5 c 0.0 -2.032 0.606 -3.922 1.647 -5.5 Z m 7.837 15.487 c -0.05 0.099 -0.085 0.208 -0.1 0.324 c -0.252 1.947 -1.194 3.732 -2.646 5.023 c -1.45 1.29 -3.312 2.0 -5.237 2.0 c -1.925 0.0 -3.787 -0.71 -5.238 -2.0 c -1.452 -1.291 -2.393 -3.076 -2.646 -5.023 c -0.071 -0.548 -0.573 -0.934 -1.12 -0.863 c -0.548 0.07 -0.935 0.572 -0.864 1.12 c 0.315 2.421 1.486 4.646 3.3 6.26 c 1.563 1.39 3.512 2.245 5.568 2.455 v 3.591 c 0.0 0.552 0.447 1.0 1.0 1.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -3.59 c 2.055 -0.211 4.004 -1.066 5.567 -2.456 c 1.814 -1.614 2.985 -3.839 3.3 -6.26 c 0.03 -0.232 -0.022 -0.457 -0.135 -0.643 c -0.404 0.05 -0.815 0.075 -1.233 0.075 c -0.173 0.0 -0.345 -0.004 -0.516 -0.013 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 18.0 c 4.695 0.0 8.5 -3.806 8.5 -8.5 S 31.195 1.0 26.5 1.0 C 21.806 1.0 18.0 4.806 18.0 9.5 s 3.806 8.5 8.5 8.5 Z M 23.752 5.691 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.768 0.0 1.06 L 25.44 9.5 l -2.748 2.748 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.292 0.294 0.767 0.294 1.06 0.0 l 2.748 -2.747 l 2.748 2.748 c 0.293 0.293 0.768 0.293 1.061 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 L 27.561 9.5 l 2.748 -2.748 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.06 0.0 L 26.5 8.438 l -2.748 -2.748 Z")
        )
    }.build()
}
