package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.871 10.622 c -0.205 0.205 -0.537 0.205 -0.742 0.0 L 8.0 6.493 l -4.129 4.129 c -0.205 0.205 -0.537 0.205 -0.742 0.0 c -0.205 -0.205 -0.205 -0.538 0.0 -0.743 l 4.5 -4.5 c 0.205 -0.205 0.537 -0.205 0.742 0.0 l 4.5 4.5 c 0.205 0.205 0.205 0.538 0.0 0.743 Z")
        )
    }.build()
}
