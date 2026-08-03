package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlurOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlurOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.931 1.603 c 0.137 0.136 0.137 0.358 0.0 0.494 L 2.097 8.931 c -0.136 0.137 -0.358 0.137 -0.494 0.0 c -0.137 -0.136 -0.137 -0.358 0.0 -0.495 l 6.833 -6.833 c 0.137 -0.137 0.359 -0.137 0.495 0.0 Z m 2.156 0.576 c 0.195 0.195 0.195 0.512 0.0 0.707 l -8.2 8.2 c -0.196 0.196 -0.513 0.196 -0.708 0.0 c -0.195 -0.194 -0.195 -0.511 0.0 -0.706 l 8.2 -8.2 c 0.196 -0.196 0.513 -0.196 0.708 0.0 Z m 2.734 2.734 c 0.195 0.195 0.195 0.512 0.0 0.707 l -8.2 8.2 c -0.196 0.196 -0.513 0.196 -0.708 0.0 c -0.195 -0.194 -0.195 -0.51 0.0 -0.706 l 8.2 -8.2 c 0.196 -0.196 0.512 -0.196 0.708 0.0 Z m 0.577 2.652 c 0.137 -0.137 0.137 -0.359 0.0 -0.495 c -0.137 -0.137 -0.358 -0.137 -0.495 0.0 L 7.07 13.903 c -0.136 0.137 -0.136 0.359 0.0 0.495 c 0.137 0.137 0.359 0.137 0.495 0.0 l 6.834 -6.833 Z m -1.602 -3.653 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 l -8.884 8.884 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 l 8.884 -8.884 Z m 0.748 6.403 c 0.137 0.137 0.137 0.358 0.0 0.495 l -2.734 2.734 c -0.136 0.136 -0.358 0.136 -0.495 0.0 c -0.136 -0.137 -0.136 -0.359 0.0 -0.495 l 2.734 -2.734 c 0.137 -0.136 0.358 -0.136 0.495 0.0 Z M 5.685 2.951 c 0.137 -0.136 0.137 -0.358 0.0 -0.495 c -0.137 -0.136 -0.358 -0.136 -0.495 0.0 L 2.457 5.19 c -0.137 0.137 -0.137 0.358 0.0 0.495 c 0.136 0.137 0.358 0.137 0.494 0.0 l 2.734 -2.734 Z")
        )
    }.build()
}
