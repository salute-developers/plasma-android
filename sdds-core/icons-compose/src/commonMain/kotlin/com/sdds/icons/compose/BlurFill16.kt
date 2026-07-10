package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlurFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlurFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 8.597 2.297 c 0.137 -0.136 0.137 -0.358 0.0 -0.494 c -0.136 -0.137 -0.358 -0.137 -0.494 0.0 l -6.3 6.3 c -0.137 0.136 -0.137 0.358 0.0 0.494 c 0.136 0.137 0.358 0.137 0.494 0.0 l 6.3 -6.3 Z m 2.224 0.824 c 0.205 -0.205 0.205 -0.537 0.0 -0.742 c -0.205 -0.205 -0.537 -0.205 -0.742 0.0 l -7.7 7.7 c -0.205 0.205 -0.205 0.537 0.0 0.742 c 0.205 0.205 0.537 0.205 0.742 0.0 l 7.7 -7.7 Z m 2.8 2.8 c 0.205 -0.205 0.205 -0.537 0.0 -0.742 c -0.205 -0.205 -0.537 -0.205 -0.742 0.0 l -7.7 7.7 c -0.205 0.205 -0.205 0.537 0.0 0.742 c 0.205 0.205 0.537 0.205 0.742 0.0 l 7.7 -7.7 Z m 0.576 1.482 c 0.137 0.136 0.137 0.358 0.0 0.494 l -6.3 6.3 c -0.136 0.137 -0.358 0.137 -0.494 0.0 c -0.137 -0.136 -0.137 -0.358 0.0 -0.494 l 6.3 -6.3 c 0.136 -0.137 0.358 -0.137 0.495 0.0 Z m -1.626 -3.974 c 0.205 0.205 0.205 0.537 0.0 0.742 l -8.4 8.4 c -0.205 0.205 -0.537 0.205 -0.742 0.0 c -0.205 -0.205 -0.205 -0.537 0.0 -0.742 l 8.4 -8.4 c 0.205 -0.205 0.537 -0.205 0.742 0.0 Z m 0.927 7.618 c 0.136 -0.136 0.136 -0.358 0.0 -0.495 c -0.137 -0.136 -0.359 -0.136 -0.495 0.0 l -2.45 2.45 c -0.137 0.137 -0.137 0.359 0.0 0.495 c 0.136 0.137 0.358 0.137 0.494 0.0 l 2.45 -2.45 Z m -8.05 -8.544 c 0.136 0.136 0.136 0.358 0.0 0.494 l -2.45 2.45 c -0.137 0.137 -0.359 0.137 -0.495 0.0 c -0.137 -0.136 -0.137 -0.358 0.0 -0.494 l 2.45 -2.45 c 0.136 -0.137 0.358 -0.137 0.494 0.0 Z")
        )
    }.build()
}
