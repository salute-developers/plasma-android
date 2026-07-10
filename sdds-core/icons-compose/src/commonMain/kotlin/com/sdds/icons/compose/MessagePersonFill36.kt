package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagePersonFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagePersonFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.11 5.25 c -6.98 0.0 -12.64 5.659 -12.64 12.64 c 0.0 1.502 0.263 2.944 0.745 4.283 c 0.29 0.804 0.373 1.593 0.178 2.288 L 5.324 28.28 c -0.409 1.46 0.937 2.806 2.397 2.397 l 3.818 -1.07 c 0.695 -0.194 1.484 -0.11 2.288 0.179 c 1.339 0.482 2.781 0.745 4.283 0.745 c 6.981 0.0 12.64 -5.66 12.64 -12.64 c 0.0 -6.981 -5.659 -12.64 -12.64 -12.64 Z m 7.013 17.873 l 0.001 -0.001 c -2.107 -1.066 -4.49 -1.667 -7.013 -1.667 c -2.524 0.0 -4.908 0.6 -7.016 1.668 h 0.001 v 0.001 c 1.595 2.136 4.143 3.518 7.013 3.518 c 2.871 0.0 5.42 -1.383 7.015 -3.518 Z m -11.52 -8.347 l 0.005 -0.033 c 0.273 -2.245 2.185 -3.983 4.503 -3.983 c 2.506 0.0 4.538 2.031 4.538 4.537 c 0.0 0.177 -0.01 0.35 -0.03 0.521 l -0.007 0.062 c -0.286 2.232 -2.192 3.956 -4.5 3.956 c -2.507 0.0 -4.538 -2.031 -4.538 -4.537 c 0.0 -0.177 0.01 -0.351 0.03 -0.523 Z")
        )
    }.build()
}
