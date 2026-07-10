package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Line36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Line36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.457 5.293 c 0.39 0.39 0.39 1.024 0.0 1.414 l -24.75 24.75 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 24.75 -24.75 c 0.39 -0.39 1.024 -0.39 1.414 0.0 Z")
        )
    }.build()
}
