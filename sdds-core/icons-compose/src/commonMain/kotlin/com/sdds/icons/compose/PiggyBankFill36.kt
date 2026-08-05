package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PiggyBankFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PiggyBankFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.85 5.0 c 0.499 0.0 0.982 0.079 1.432 0.225 c 0.526 0.17 0.814 0.733 0.644 1.258 c -0.17 0.526 -0.734 0.814 -1.259 0.644 C 8.414 7.045 8.139 7.0 7.85 7.0 C 6.453 7.0 5.475 8.017 5.475 9.088 c 0.0 0.729 0.212 1.315 0.463 1.73 c 2.495 -2.751 6.384 -4.485 10.649 -4.485 c 6.138 0.0 11.45 3.556 13.023 8.587 c 0.075 0.238 0.178 0.338 0.267 0.393 c 0.107 0.067 0.29 0.127 0.585 0.127 c 1.401 0.0 2.387 1.214 2.388 2.518 v 2.207 c 0.0 0.918 -0.503 1.692 -1.047 2.28 c -0.559 0.604 -1.29 1.151 -2.014 1.627 c -0.73 0.48 -1.505 0.919 -2.167 1.292 c -0.688 0.388 -1.213 0.683 -1.534 0.909 c -0.105 0.073 -0.176 0.203 -0.176 0.348 V 30.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -2.775 c -0.33 0.0 -0.638 -0.163 -0.825 -0.435 l -0.985 -1.436 c -2.443 0.607 -5.036 0.607 -7.48 0.0 l -0.986 1.436 C 11.675 30.837 11.367 31.0 11.037 31.0 H 8.262 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 v -3.412 c 0.0 -0.129 -0.062 -0.277 -0.197 -0.393 c -2.424 -2.082 -3.965 -4.99 -3.965 -8.237 c 0.0 -2.0 0.575 -3.859 1.58 -5.478 c -0.657 -0.754 -1.205 -1.934 -1.205 -3.392 C 3.475 6.748 5.519 5.0 7.85 5.0 Z m 16.355 9.333 c -0.828 0.0 -1.5 0.672 -1.5 1.5 s 0.672 1.5 1.5 1.5 h 0.014 c 0.828 0.0 1.5 -0.672 1.5 -1.5 s -0.672 -1.5 -1.5 -1.5 h -0.014 Z M 17.28 9.875 c -1.142 0.0 -2.232 0.295 -3.239 0.823 c -0.489 0.257 -0.677 0.861 -0.42 1.35 c 0.256 0.489 0.86 0.677 1.35 0.42 c 0.746 -0.391 1.52 -0.593 2.31 -0.593 c 0.789 0.0 1.563 0.202 2.31 0.594 c 0.489 0.256 1.094 0.068 1.35 -0.421 c 0.257 -0.489 0.068 -1.093 -0.42 -1.35 c -1.007 -0.528 -2.098 -0.823 -3.24 -0.823 Z")
        )
    }.build()
}
