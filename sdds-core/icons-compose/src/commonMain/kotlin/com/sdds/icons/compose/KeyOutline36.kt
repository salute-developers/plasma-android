package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KeyOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KeyOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.015 5.016 c 4.256 0.024 7.73 3.497 7.754 7.754 c 0.024 4.248 -3.397 7.669 -7.645 7.645 c -1.136 -0.006 -2.213 -0.258 -3.185 -0.703 c -0.872 -0.4 -1.99 0.191 -1.983 1.266 l 0.011 2.056 l -2.77 -0.015 c -0.765 -0.004 -1.387 0.617 -1.382 1.383 l 0.01 2.013 l -3.526 -0.02 c -0.765 -0.004 -1.387 0.618 -1.382 1.383 l 0.017 3.061 l -3.965 -0.022 l -0.028 -5.013 l 10.343 -10.343 c 0.276 -0.276 0.384 -0.674 0.296 -1.046 c -0.134 -0.563 -0.207 -1.15 -0.21 -1.754 c -0.024 -4.248 3.397 -7.67 7.645 -7.645 Z m 9.754 7.743 c -0.03 -5.353 -4.39 -9.713 -9.743 -9.743 c -5.361 -0.03 -9.687 4.295 -9.656 9.656 c 0.003 0.584 0.058 1.157 0.16 1.714 L 3.342 24.574 c -0.26 0.26 -0.405 0.613 -0.403 0.98 l 0.034 5.892 c 0.004 0.753 0.614 1.363 1.367 1.367 l 5.215 0.03 c 0.765 0.004 1.387 -0.618 1.382 -1.383 l -0.017 -3.061 l 3.527 0.02 c 0.765 0.004 1.387 -0.618 1.383 -1.383 l -0.012 -2.014 l 2.77 0.016 c 0.766 0.004 1.387 -0.617 1.383 -1.383 l -0.01 -1.78 c 0.99 0.344 2.05 0.534 3.152 0.54 c 5.361 0.03 9.686 -4.295 9.656 -9.656 Z m -8.182 0.721 c 1.253 0.007 2.263 -1.003 2.256 -2.256 c -0.007 -1.253 -1.029 -2.275 -2.282 -2.282 c -1.253 -0.007 -2.263 1.003 -2.256 2.256 c 0.007 1.254 1.029 2.275 2.282 2.282 Z")
        )
    }.build()
}
