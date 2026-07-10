package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 5.25 -18.0 c 0.0 2.9 -2.35 5.25 -5.25 5.25 S 12.75 17.9 12.75 15.0 S 15.1 9.75 18.0 9.75 s 5.25 2.35 5.25 5.25 Z m 4.418 11.313 c -2.128 -2.36 -5.73 -3.813 -9.667 -3.813 c -3.937 0.0 -7.54 1.452 -9.668 3.813 c 2.338 2.717 5.802 4.437 9.668 4.437 c 3.865 0.0 7.33 -1.72 9.667 -4.437 Z")
        )
    }.build()
}
