package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.379 12.872 c -0.205 -0.205 -0.205 -0.538 0.0 -0.743 l 4.129 -4.128 l -4.13 -4.13 c -0.204 -0.204 -0.204 -0.537 0.0 -0.742 c 0.206 -0.205 0.538 -0.205 0.743 0.0 l 4.5 4.5 c 0.205 0.205 0.205 0.538 0.0 0.743 l -4.5 4.5 c -0.205 0.205 -0.537 0.205 -0.742 0.0 Z")
        )
    }.build()
}
