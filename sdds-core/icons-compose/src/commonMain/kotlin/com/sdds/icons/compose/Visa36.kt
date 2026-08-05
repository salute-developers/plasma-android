package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Visa36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Visa36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.515 16.197 c -0.017 1.393 1.203 2.17 2.122 2.633 c 0.944 0.474 1.261 0.778 1.257 1.202 c -0.007 0.649 -0.753 0.935 -1.45 0.946 c -1.219 0.02 -1.927 -0.339 -2.49 -0.61 l -0.439 2.119 c 0.565 0.268 1.611 0.503 2.696 0.513 c 2.546 0.0 4.211 -1.297 4.22 -3.308 c 0.01 -2.553 -3.42 -2.694 -3.397 -3.835 c 0.008 -0.346 0.328 -0.715 1.029 -0.81 c 0.347 -0.047 1.304 -0.083 2.39 0.433 l 0.426 -2.05 C 24.295 13.21 23.545 13.0 22.61 13.0 c -2.396 0.0 -4.081 1.315 -4.095 3.197 Z m 10.458 -3.02 c -0.465 0.0 -0.857 0.28 -1.031 0.71 l -3.637 8.962 h 2.544 l 0.506 -1.444 h 3.11 l 0.293 1.444 H 33.0 l -1.957 -9.672 h -2.07 Z m 0.356 2.613 l 0.734 3.632 h -2.01 l 1.276 -3.632 Z m -13.898 -2.613 l -2.005 9.672 h 2.424 l 2.004 -9.672 h -2.423 Z m -3.586 0.0 L 9.32 19.76 l -1.02 -5.598 c -0.12 -0.625 -0.593 -0.985 -1.118 -0.985 H 3.058 L 3.0 13.457 c 0.847 0.19 1.809 0.496 2.392 0.823 c 0.356 0.2 0.458 0.375 0.575 0.85 l 1.934 7.72 h 2.562 l 3.927 -9.673 h -2.546 Z")
        )
    }.build()
}
