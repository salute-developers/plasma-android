package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindBackwardFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindBackwardFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.1 22.995 V 13.01 l 6.475 -3.929 c 1.5 -0.91 3.418 0.17 3.418 1.924 V 25.0 c 0.0 1.754 -1.918 2.833 -3.418 1.923 l -6.474 -3.929 Z M 4.085 16.08 c -1.444 0.876 -1.444 2.97 0.0 3.847 l 11.532 6.998 c 1.5 0.91 3.417 -0.17 3.417 -1.923 V 11.003 c 0.0 -1.753 -1.917 -2.833 -3.417 -1.923 L 4.084 16.079 Z")
        )
    }.build()
}
