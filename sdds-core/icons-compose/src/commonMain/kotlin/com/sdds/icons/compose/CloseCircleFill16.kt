package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloseCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloseCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 5.695 4.705 c -0.273 -0.273 -0.717 -0.273 -0.99 0.0 s -0.273 0.717 0.0 0.99 L 7.01 8.0 l -2.305 2.305 c -0.273 0.273 -0.273 0.717 0.0 0.99 s 0.717 0.273 0.99 0.0 L 8.0 8.99 l 2.305 2.305 c 0.273 0.273 0.717 0.273 0.99 0.0 s 0.273 -0.717 0.0 -0.99 L 8.99 8.0 l 2.305 -2.305 c 0.273 -0.273 0.273 -0.717 0.0 -0.99 s -0.717 -0.273 -0.99 0.0 L 8.0 7.01 L 5.695 4.705 Z")
        )
    }.build()
}
