package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileCircleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileCircleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 6.25 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 Z M 9.75 10.0 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 s 2.25 1.007 2.25 2.25 s -1.007 2.25 -2.25 2.25 S 9.75 11.243 9.75 10.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 c 0.0 2.847 -1.19 5.417 -3.1 7.237 C 17.108 20.948 14.676 22.0 12.0 22.0 c -2.675 0.0 -5.107 -1.052 -6.9 -2.763 C 3.19 17.417 2.0 14.847 2.0 12.0 Z m 10.0 -8.5 c -4.694 0.0 -8.5 3.806 -8.5 8.5 c 0.0 2.118 0.774 4.053 2.055 5.542 C 6.974 15.968 9.375 15.0 12.0 15.0 c 2.625 0.0 5.026 0.968 6.445 2.542 C 19.726 16.053 20.5 14.118 20.5 12.0 c 0.0 -4.694 -3.806 -8.5 -8.5 -8.5 Z m 5.369 15.09 C 16.305 17.381 14.344 16.5 12.0 16.5 s -4.304 0.881 -5.369 2.09 C 8.095 19.785 9.963 20.5 12.0 20.5 s 3.905 -0.715 5.369 -1.91 Z")
        )
    }.build()
}
