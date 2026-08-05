package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.Silent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Silent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 6.371 2.37 c 1.265 -0.366 2.616 -0.296 3.836 0.2 c 0.307 0.124 0.657 -0.024 0.781 -0.33 c 0.125 -0.308 -0.023 -0.658 -0.33 -0.782 c -1.47 -0.597 -3.097 -0.682 -4.62 -0.241 c -1.524 0.44 -2.855 1.382 -3.778 2.672 c -0.924 1.29 -1.386 2.852 -1.313 4.436 c 0.073 1.585 0.677 3.098 1.716 4.298 c 1.038 1.199 2.45 2.013 4.007 2.312 C 8.228 15.234 9.84 15.0 11.25 14.27 c 1.408 -0.73 2.53 -1.912 3.184 -3.357 c 0.654 -1.445 0.803 -3.068 0.422 -4.607 c -0.08 -0.322 -0.405 -0.518 -0.726 -0.439 c -0.322 0.08 -0.518 0.405 -0.439 0.727 c 0.316 1.278 0.193 2.625 -0.35 3.824 c -0.544 1.2 -1.475 2.181 -2.644 2.787 c -1.169 0.605 -2.508 0.8 -3.8 0.552 c -1.294 -0.249 -2.465 -0.925 -3.327 -1.92 c -0.862 -0.995 -1.364 -2.252 -1.424 -3.567 c -0.061 -1.315 0.323 -2.612 1.09 -3.683 c 0.766 -1.07 1.87 -1.851 3.135 -2.217 Z m 2.227 2.758 c 0.0 -0.331 -0.268 -0.6 -0.6 -0.6 c -0.33 0.0 -0.6 0.269 -0.6 0.6 v 3.57 c 0.0 0.223 0.117 0.43 0.309 0.545 l 1.778 1.066 c 0.284 0.17 0.652 0.079 0.823 -0.205 c 0.17 -0.285 0.078 -0.653 -0.206 -0.824 L 8.598 8.378 v -3.25 Z")
            )
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 11.6 1.0 c 0.0 -0.331 0.269 -0.6 0.6 -0.6 h 3.03 c 0.65 0.0 0.949 0.809 0.455 1.231 L 13.622 3.4 H 15.3 c 0.331 0.0 0.6 0.269 0.6 0.6 c 0.0 0.331 -0.269 0.6 -0.6 0.6 h -3.03 c -0.65 0.0 -0.949 -0.809 -0.455 -1.231 L 13.878 1.6 H 12.2 c -0.331 0.0 -0.6 -0.269 -0.6 -0.6 Z")
            )
        }
    }.build()
}
