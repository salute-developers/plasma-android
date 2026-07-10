package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.InfoCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "InfoCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z m 0.7 -9.8 c 0.0 0.387 -0.313 0.7 -0.7 0.7 c -0.387 0.0 -0.7 -0.313 -0.7 -0.7 c 0.0 -0.387 0.313 -0.7 0.7 -0.7 c 0.387 0.0 0.7 0.313 0.7 0.7 Z M 8.0 6.775 c 0.29 0.0 0.525 0.235 0.525 0.525 v 4.2 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 7.3 C 7.475 7.01 7.71 6.775 8.0 6.775 Z")
        )
    }.build()
}
