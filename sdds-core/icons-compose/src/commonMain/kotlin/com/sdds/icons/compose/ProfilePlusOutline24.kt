package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePlusOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePlusOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 7.0 c 0.0 -2.761 2.239 -5.0 5.0 -5.0 c 2.762 0.0 5.0 2.239 5.0 5.0 s -2.238 5.0 -5.0 5.0 C 9.24 12.0 7.0 9.761 7.0 7.0 Z m 5.0 -3.5 c -1.933 0.0 -3.5 1.567 -3.5 3.5 s 1.567 3.5 3.5 3.5 s 3.5 -1.567 3.5 -3.5 s -1.567 -3.5 -3.5 -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.976 17.107 c 1.883 -1.245 4.114 -2.003 6.518 -2.097 c 0.226 -0.543 0.522 -1.049 0.879 -1.505 C 12.249 13.502 12.125 13.5 12.0 13.5 c -2.9 0.0 -5.6 0.867 -7.851 2.356 c -0.738 0.488 -1.199 1.357 -1.094 2.284 c 0.044 0.39 0.127 0.747 0.3 1.085 c 0.311 0.612 0.808 1.11 1.42 1.42 c 0.39 0.2 0.809 0.28 1.272 0.318 C 6.495 21.0 7.045 21.0 7.72 21.0 h 4.303 c -0.297 -0.463 -0.536 -0.966 -0.708 -1.5 H 7.75 c -0.712 0.0 -1.201 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.168 -0.597 -0.435 -0.765 -0.765 c -0.063 -0.124 -0.114 -0.29 -0.146 -0.572 c -0.036 -0.32 0.123 -0.66 0.431 -0.865 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 17.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 c -3.037 0.0 -5.5 -2.462 -5.5 -5.5 s 2.463 -5.5 5.5 -5.5 c 3.038 0.0 5.5 2.462 5.5 5.5 Z M 17.5 14.0 c 0.276 0.0 0.5 0.224 0.5 0.5 V 17.0 h 2.5 c 0.276 0.0 0.5 0.224 0.5 0.5 S 20.776 18.0 20.5 18.0 H 18.0 v 2.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 17.0 20.776 17.0 20.5 V 18.0 h -2.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 H 17.0 v -2.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
