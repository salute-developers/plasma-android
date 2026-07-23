package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronRight36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronRight36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.043 29.207 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 L 21.836 18.0 l -9.793 -9.793 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 c 0.39 -0.39 1.024 -0.39 1.414 0.0 l 10.5 10.5 c 0.39 0.39 0.39 1.024 0.0 1.414 l -10.5 10.5 c -0.39 0.39 -1.024 0.39 -1.414 0.0 Z")
        )
    }.build()
}
