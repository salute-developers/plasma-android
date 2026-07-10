package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HelpCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HelpCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 7.179 -5.82 12.999 -13.0 12.999 c -7.179 0.0 -12.999 -5.82 -12.999 -13.0 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 8.283 6.715 14.999 15.0 14.999 c 8.283 0.0 14.999 -6.716 14.999 -15.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z m -2.51 8.316 c -0.538 0.418 -1.033 1.215 -1.033 2.9 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 c 0.0 -2.1 0.64 -3.572 1.805 -4.479 c 1.114 -0.866 2.523 -1.062 3.735 -1.062 c 1.213 0.0 2.622 0.196 3.736 1.062 c 1.165 0.906 1.805 2.38 1.805 4.479 c 0.0 2.415 -1.52 3.626 -2.67 4.489 c -1.265 0.948 -1.87 1.403 -1.87 2.321 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -1.953 1.427 -3.005 2.437 -3.749 l 0.233 -0.172 c 1.119 -0.84 1.87 -1.521 1.87 -2.89 c 0.0 -1.684 -0.496 -2.481 -1.033 -2.899 c -0.588 -0.458 -1.45 -0.64 -2.508 -0.64 c -1.057 0.0 -1.919 0.182 -2.507 0.64 Z M 19.51 24.81 c 0.0 0.835 -0.677 1.513 -1.513 1.513 c -0.836 0.0 -1.514 -0.678 -1.514 -1.513 c 0.0 -0.836 0.678 -1.514 1.514 -1.514 s 1.513 0.678 1.513 1.514 Z")
        )
    }.build()
}
