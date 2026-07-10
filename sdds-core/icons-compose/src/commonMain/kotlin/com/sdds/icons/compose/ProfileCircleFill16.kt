package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z m 2.45 -8.4 c 0.0 1.353 -1.097 2.45 -2.45 2.45 c -1.353 0.0 -2.45 -1.097 -2.45 -2.45 c 0.0 -1.353 1.097 -2.45 2.45 -2.45 c 1.353 0.0 2.45 1.097 2.45 2.45 Z m 2.062 5.28 C 11.518 10.777 9.837 10.1 8.0 10.1 c -1.837 0.0 -3.518 0.678 -4.512 1.78 C 4.58 13.146 6.196 13.95 8.0 13.95 c 1.804 0.0 3.42 -0.803 4.511 -2.07 Z")
        )
    }.build()
}
