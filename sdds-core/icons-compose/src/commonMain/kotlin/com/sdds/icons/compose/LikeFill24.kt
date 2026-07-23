package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LikeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LikeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.927 1.506 c -0.609 -0.174 -1.246 0.162 -1.446 0.763 l -1.023 3.069 c -0.123 0.368 -0.29 0.72 -0.5 1.048 l -2.36 3.708 c -0.156 0.247 -0.334 0.477 -0.532 0.689 C 7.531 9.91 6.421 9.448 5.354 9.849 L 4.4 10.206 c -0.833 0.313 -1.404 1.086 -1.456 1.975 l -0.36 6.124 c -0.07 1.183 0.79 2.217 1.967 2.364 l 0.999 0.125 c 0.866 0.108 1.671 -0.29 2.131 -0.954 l 5.885 1.279 c 1.82 0.396 3.686 -0.44 4.603 -2.062 l 2.519 -4.457 c 1.224 -2.166 -0.34 -4.85 -2.83 -4.85 h -2.056 c -0.493 0.0 -0.852 -0.466 -0.725 -0.942 l 0.957 -3.588 c 0.428 -1.605 -0.51 -3.258 -2.107 -3.714 Z M 5.88 11.253 c 0.505 -0.19 1.038 0.2 1.013 0.738 l -0.315 6.606 c -0.02 0.437 -0.409 0.763 -0.842 0.709 L 4.737 19.18 c -0.392 -0.05 -0.679 -0.394 -0.656 -0.788 l 0.36 -6.124 c 0.018 -0.296 0.208 -0.554 0.486 -0.659 l 0.953 -0.357 Z")
        )
    }.build()
}
