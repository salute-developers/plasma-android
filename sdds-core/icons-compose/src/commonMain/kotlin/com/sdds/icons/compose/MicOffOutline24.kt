package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicOffOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicOffOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.995 2.25 c -2.07 0.0 -3.75 1.679 -3.75 3.75 v 6.0 c 0.0 0.764 0.23 1.475 0.622 2.068 L 7.79 15.144 c -0.535 -0.716 -0.882 -1.561 -1.0 -2.459 c -0.055 -0.41 -0.431 -0.7 -0.842 -0.645 c -0.41 0.054 -0.7 0.43 -0.646 0.841 c 0.162 1.227 0.656 2.377 1.419 3.332 L 2.98 19.955 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.29 0.292 0.762 0.294 1.055 0.006 l 0.005 -0.005 l 16.97 -16.97 l 0.006 -0.006 c 0.288 -0.293 0.286 -0.764 -0.005 -1.055 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 l -4.206 4.204 V 6.0 c 0.0 -2.071 -1.678 -3.75 -3.75 -3.75 Z m 3.75 9.182 l -2.142 2.142 l -0.033 0.034 l -2.105 2.105 c 0.173 0.024 0.35 0.037 0.53 0.037 c 2.072 0.0 3.75 -1.679 3.75 -3.75 v -0.568 Z m -5.513 5.513 l -1.146 1.146 c 0.678 0.324 1.408 0.533 2.16 0.617 V 21.0 c 0.0 0.414 0.335 0.75 0.75 0.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -2.292 c 1.365 -0.152 2.658 -0.72 3.7 -1.633 c 1.231 -1.08 2.028 -2.57 2.242 -4.194 c 0.054 -0.41 -0.235 -0.787 -0.646 -0.841 c -0.41 -0.054 -0.787 0.235 -0.841 0.645 c -0.167 1.263 -0.786 2.422 -1.744 3.262 c -0.958 0.84 -2.188 1.303 -3.462 1.303 c -0.605 0.0 -1.201 -0.105 -1.763 -0.305 Z M 9.965 12.97 l 4.28 -4.28 V 6.0 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 c -1.242 0.0 -2.25 1.007 -2.25 2.25 v 6.0 c 0.0 0.347 0.08 0.676 0.22 0.97 Z")
        )
    }.build()
}
