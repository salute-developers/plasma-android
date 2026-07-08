package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.999 2.25 c -2.071 0.0 -3.75 1.679 -3.75 3.75 v 6.0 c 0.0 2.071 1.679 3.75 3.75 3.75 c 2.07 0.0 3.75 -1.679 3.75 -3.75 V 6.0 c 0.0 -2.071 -1.68 -3.75 -3.75 -3.75 Z M 9.749 6.0 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 c 1.242 0.0 2.25 1.007 2.25 2.25 v 6.0 c 0.0 1.243 -1.008 2.25 -2.25 2.25 c -1.243 0.0 -2.25 -1.007 -2.25 -2.25 V 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.794 12.685 c -0.054 -0.41 -0.431 -0.7 -0.842 -0.645 c -0.41 0.054 -0.7 0.43 -0.645 0.841 c 0.213 1.624 1.01 3.114 2.241 4.194 c 1.042 0.914 2.335 1.48 3.7 1.633 V 21.0 c 0.0 0.414 0.337 0.75 0.75 0.75 c 0.415 0.0 0.75 -0.336 0.75 -0.75 v -2.292 c 1.366 -0.152 2.66 -0.72 3.701 -1.633 c 1.232 -1.08 2.028 -2.57 2.242 -4.194 c 0.054 -0.41 -0.235 -0.787 -0.646 -0.841 c -0.41 -0.054 -0.787 0.235 -0.841 0.645 c -0.166 1.263 -0.786 2.422 -1.744 3.262 c -0.957 0.84 -2.188 1.303 -3.461 1.303 c -1.274 0.0 -2.504 -0.463 -3.462 -1.303 c -0.957 -0.84 -1.577 -1.999 -1.743 -3.262 Z")
        )
    }.build()
}
