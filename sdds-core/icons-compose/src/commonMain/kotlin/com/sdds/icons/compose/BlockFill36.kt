package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlockFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlockFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.92 24.507 L 11.494 10.079 c 4.027 -3.316 9.99 -3.091 13.755 0.673 c 3.764 3.764 3.988 9.728 0.673 13.755 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.08 11.493 l 14.427 14.428 c -4.027 3.316 -9.99 3.091 -13.755 -0.673 c -3.764 -3.765 -3.989 -9.728 -0.673 -13.755 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 8.662 -23.662 c -4.784 -4.784 -12.54 -4.784 -17.324 0.0 c -4.784 4.784 -4.784 12.54 0.0 17.324 c 4.784 4.784 12.54 4.784 17.324 0.0 c 4.784 -4.784 4.784 -12.54 0.0 -17.324 Z")
        )
    }.build()
}
