package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDoneOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDoneOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.398 8.07 c 2.055 -0.936 3.767 -1.944 4.601 -2.459 c 0.834 0.515 2.547 1.523 4.602 2.46 c 2.056 0.937 4.551 1.848 6.888 2.065 c -0.183 9.23 -3.02 14.267 -5.77 17.01 c -2.53 2.524 -5.084 3.204 -5.72 3.34 c -0.635 -0.136 -3.19 -0.816 -5.72 -3.34 c -2.75 -2.743 -5.587 -7.78 -5.77 -17.01 c 2.337 -0.217 4.833 -1.128 6.889 -2.065 Z m 5.343 -4.354 c -0.454 -0.288 -1.03 -0.288 -1.483 0.0 c -0.585 0.372 -2.422 1.501 -4.69 2.535 C 10.273 7.297 7.664 8.185 5.5 8.185 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 10.264 3.08 16.098 6.366 19.377 c 3.265 3.257 6.613 3.87 6.96 3.927 h 0.005 l 0.021 0.004 c 0.023 0.003 0.078 0.01 0.147 0.01 c 0.07 0.0 0.124 -0.007 0.148 -0.01 l 0.023 -0.004 h 0.005 h -0.002 c 0.347 -0.057 3.694 -0.67 6.96 -3.927 c 3.286 -3.279 6.366 -9.113 6.366 -19.377 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 c -2.165 0.0 -4.773 -0.888 -7.069 -1.934 c -2.267 -1.034 -4.104 -2.163 -4.689 -2.535 Z m 6.033 11.292 c 0.387 -0.394 0.381 -1.028 -0.013 -1.415 c -0.394 -0.386 -1.027 -0.38 -1.414 0.014 l -6.53 6.65 l -2.712 -2.32 c -0.42 -0.358 -1.05 -0.309 -1.41 0.11 c -0.359 0.42 -0.31 1.052 0.11 1.41 l 3.422 2.928 c 0.4 0.341 0.995 0.316 1.364 -0.06 l 7.183 -7.317 Z")
        )
    }.build()
}
