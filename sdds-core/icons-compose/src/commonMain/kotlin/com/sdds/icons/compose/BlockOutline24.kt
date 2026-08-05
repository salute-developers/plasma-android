package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlockOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlockOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.543 5.482 l 11.975 11.975 C 21.32 14.117 21.15 9.13 18.01 5.99 C 14.87 2.849 9.883 2.68 6.543 5.482 Z m 10.914 13.036 L 5.482 6.543 C 2.68 9.883 2.85 14.87 5.99 18.01 c 3.14 3.141 8.127 3.31 11.467 0.508 Z M 4.929 4.928 c 3.905 -3.904 10.237 -3.904 14.142 0.0 c 3.905 3.906 3.905 10.238 0.0 14.143 c -3.905 3.905 -10.237 3.905 -14.142 0.0 c -3.905 -3.905 -3.905 -10.237 0.0 -14.142 Z")
        )
    }.build()
}
