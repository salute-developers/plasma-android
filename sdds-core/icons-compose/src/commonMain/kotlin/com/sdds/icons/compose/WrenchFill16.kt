package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WrenchFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WrenchFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.466 2.535 c 1.073 -1.073 2.663 -1.312 3.966 -0.717 l -1.846 1.846 c -0.273 0.273 -0.273 0.716 0.0 0.99 l 0.76 0.759 c 0.273 0.273 0.716 0.273 0.99 0.0 l 1.845 -1.846 c 0.593 1.303 0.354 2.893 -0.718 3.965 c -0.975 0.976 -2.38 1.262 -3.606 0.858 l -5.643 5.643 c -0.621 0.621 -1.628 0.621 -2.249 0.0 c -0.621 -0.62 -0.621 -1.627 0.0 -2.248 L 7.608 6.14 C 7.205 4.914 7.491 3.51 8.466 2.535 Z")
        )
    }.build()
}
