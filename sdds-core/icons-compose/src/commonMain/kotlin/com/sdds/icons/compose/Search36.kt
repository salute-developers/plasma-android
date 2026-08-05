package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Search36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Search36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.35 5.75 c -5.302 0.0 -9.6 4.298 -9.6 9.6 s 4.298 9.6 9.6 9.6 s 9.6 -4.298 9.6 -9.6 s -4.298 -9.6 -9.6 -9.6 Z m -11.6 9.6 c 0.0 -6.406 5.194 -11.6 11.6 -11.6 s 11.6 5.194 11.6 11.6 c 0.0 2.843 -1.023 5.447 -2.72 7.465 l 7.727 7.728 c 0.39 0.39 0.39 1.024 0.0 1.414 c -0.39 0.39 -1.024 0.39 -1.414 0.0 l -7.728 -7.728 c -2.018 1.698 -4.622 2.721 -7.465 2.721 c -6.406 0.0 -11.6 -5.194 -11.6 -11.6 Z")
        )
    }.build()
}
