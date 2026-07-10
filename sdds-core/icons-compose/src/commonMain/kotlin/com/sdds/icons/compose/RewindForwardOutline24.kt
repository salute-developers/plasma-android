package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindForwardOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindForwardOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.643 7.119 C 4.143 6.81 3.5 7.17 3.5 7.757 v 8.486 c 0.0 0.587 0.644 0.946 1.143 0.639 L 11.0 12.967 v -1.933 L 4.643 7.119 Z M 11.0 9.272 l -5.57 -3.43 C 3.93 4.918 2.0 5.997 2.0 7.757 v 8.486 c 0.0 1.76 1.93 2.84 3.43 1.916 l 5.57 -3.43 v 1.514 c 0.0 1.76 1.93 2.84 3.43 1.916 l 6.89 -4.243 c 1.426 -0.879 1.426 -2.953 0.0 -3.832 l -6.89 -4.242 C 12.93 4.918 11.0 5.997 11.0 7.757 v 1.515 Z m 2.643 -2.153 C 13.143 6.81 12.5 7.17 12.5 7.757 v 8.486 c 0.0 0.587 0.644 0.946 1.143 0.639 l 6.89 -4.243 c 0.475 -0.293 0.475 -0.984 0.0 -1.277 l -6.89 -4.243 Z")
        )
    }.build()
}
