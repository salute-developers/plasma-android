package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CandyOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CandyOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.59 9.702 c 0.294 -0.293 0.294 -0.768 0.0 -1.061 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 L 8.641 12.53 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.768 0.294 1.06 0.0 l 3.89 -3.888 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.077 2.228 c -0.543 -0.543 -1.47 -0.297 -1.672 0.444 L 14.733 5.14 c -1.193 -0.529 -2.64 -0.304 -3.617 0.674 l -5.303 5.303 c -0.978 0.978 -1.203 2.424 -0.674 3.617 l -2.467 0.672 c -0.74 0.203 -0.987 1.13 -0.444 1.672 l 4.694 4.694 c 0.543 0.543 1.47 0.297 1.672 -0.444 l 0.673 -2.467 c 1.193 0.53 2.639 0.305 3.617 -0.673 l 5.303 -5.303 c 0.978 -0.978 1.202 -2.424 0.673 -3.617 l 2.467 -0.673 c 0.741 -0.202 0.987 -1.129 0.444 -1.672 l -4.694 -4.694 Z M 3.898 16.626 L 6.12 16.02 l 1.86 1.86 l -0.606 2.222 l -3.476 -3.476 Z M 17.879 7.98 l 2.223 -0.606 l -3.476 -3.476 L 16.02 6.12 l 1.86 1.86 Z m -3.228 -1.107 c -0.683 -0.683 -1.791 -0.683 -2.474 0.0 l -5.304 5.304 c -0.683 0.683 -0.683 1.79 0.0 2.474 l 2.475 2.475 c 0.683 0.684 1.791 0.684 2.475 0.0 l 5.303 -5.303 c 0.684 -0.684 0.684 -1.792 0.0 -2.475 l -2.475 -2.475 Z")
        )
    }.build()
}
