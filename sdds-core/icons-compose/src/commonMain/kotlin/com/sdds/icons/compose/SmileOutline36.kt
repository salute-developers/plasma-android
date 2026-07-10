package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SmileOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SmileOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 7.179 -5.82 12.999 -13.0 12.999 c -7.179 0.0 -12.999 -5.82 -12.999 -13.0 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 8.283 6.715 14.999 15.0 14.999 c 8.283 0.0 14.999 -6.716 14.999 -15.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z M 13.08 16.486 c 1.045 0.0 1.892 -0.847 1.892 -1.892 s -0.847 -1.892 -1.892 -1.892 s -1.891 0.847 -1.891 1.892 s 0.846 1.892 1.891 1.892 Z m 11.73 -1.892 c 0.0 1.045 -0.847 1.892 -1.892 1.892 s -1.892 -0.847 -1.892 -1.892 s 0.847 -1.892 1.892 -1.892 s 1.892 0.847 1.892 1.892 Z m -12.5 6.69 c -0.276 -0.479 -0.887 -0.643 -1.366 -0.366 c -0.478 0.276 -0.642 0.887 -0.366 1.366 c 0.752 1.302 1.834 2.383 3.136 3.135 c 1.303 0.752 2.78 1.148 4.284 1.148 s 2.981 -0.396 4.284 -1.148 c 1.302 -0.752 2.383 -1.833 3.135 -3.136 c 0.277 -0.478 0.113 -1.09 -0.366 -1.366 c -0.478 -0.276 -1.09 -0.112 -1.366 0.366 c -0.576 0.999 -1.405 1.828 -2.404 2.404 c -0.998 0.577 -2.13 0.88 -3.283 0.88 s -2.285 -0.303 -3.284 -0.88 c -0.998 -0.576 -1.827 -1.405 -2.403 -2.404 Z")
        )
    }.build()
}
