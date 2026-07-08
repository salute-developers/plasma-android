package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlockFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlockFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 5.274 -5.787 L 7.786 6.726 c 2.65 -2.123 6.53 -1.956 8.987 0.501 s 2.624 6.336 0.501 8.986 Z M 6.726 7.787 l 9.488 9.488 c -2.65 2.123 -6.53 1.956 -8.987 -0.501 s -2.624 -6.336 -0.501 -8.987 Z m 11.108 -1.62 c -3.222 -3.221 -8.446 -3.221 -11.668 0.0 c -3.221 3.222 -3.221 8.446 0.0 11.668 c 3.222 3.221 8.446 3.221 11.668 0.0 c 3.221 -3.222 3.221 -8.446 0.0 -11.668 Z")
        )
    }.build()
}
