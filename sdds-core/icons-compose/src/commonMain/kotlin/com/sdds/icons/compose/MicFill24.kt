package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 c -1.933 0.0 -3.5 1.679 -3.5 3.75 v 6.0 c 0.0 2.071 1.567 3.75 3.5 3.75 s 3.5 -1.679 3.5 -3.75 v -6.0 C 15.5 3.679 13.933 2.0 12.0 2.0 Z M 6.744 12.435 c -0.054 -0.41 -0.431 -0.7 -0.842 -0.645 c -0.41 0.054 -0.7 0.43 -0.646 0.841 c 0.214 1.624 1.01 3.114 2.242 4.194 c 1.042 0.914 2.335 1.48 3.7 1.633 v 2.292 c 0.0 0.414 0.336 0.75 0.75 0.75 c 0.415 0.0 0.75 -0.336 0.75 -0.75 v -2.292 c 1.366 -0.152 2.66 -0.72 3.701 -1.633 c 1.232 -1.08 2.028 -2.57 2.242 -4.194 c 0.054 -0.41 -0.235 -0.787 -0.646 -0.841 c -0.41 -0.054 -0.787 0.235 -0.841 0.645 c -0.166 1.263 -0.786 2.422 -1.744 3.262 C 14.453 16.537 13.222 17.0 11.95 17.0 c -1.274 0.0 -2.504 -0.463 -3.462 -1.303 c -0.957 -0.84 -1.577 -1.999 -1.743 -3.262 Z")
        )
    }.build()
}
