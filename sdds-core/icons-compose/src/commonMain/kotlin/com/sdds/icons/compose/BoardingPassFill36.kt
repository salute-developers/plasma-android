package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BoardingPassFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BoardingPassFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.5 8.25 H 8.4 c -1.89 0.0 -2.835 0.0 -3.557 0.368 c -0.635 0.323 -1.152 0.84 -1.475 1.475 C 3.0 10.815 3.0 11.76 3.0 13.65 v 8.7 c 0.0 1.89 0.0 2.835 0.368 3.557 c 0.323 0.635 0.84 1.152 1.475 1.475 C 5.565 27.75 6.51 27.75 8.4 27.75 h 17.1 c 0.0 -1.035 0.84 -1.875 1.875 -1.875 c 1.03 0.0 1.867 0.831 1.875 1.86 c 0.866 -0.029 1.435 -0.112 1.907 -0.353 c 0.635 -0.323 1.152 -0.84 1.475 -1.475 C 33.0 25.185 33.0 24.24 33.0 22.35 v -8.7 c 0.0 -1.89 0.0 -2.835 -0.368 -3.557 c -0.323 -0.635 -0.84 -1.152 -1.475 -1.475 c -0.472 -0.241 -1.04 -0.324 -1.907 -0.353 c -0.008 1.029 -0.845 1.86 -1.875 1.86 c -1.035 0.0 -1.875 -0.84 -1.875 -1.875 Z m -16.875 6.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 10.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -10.5 Z m 0.0 4.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 7.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -7.5 Z m 20.625 -6.125 c 0.0 1.036 -0.84 1.875 -1.875 1.875 c -1.035 0.0 -1.875 -0.84 -1.875 -1.875 c 0.0 -1.036 0.84 -1.875 1.875 -1.875 c 1.035 0.0 1.875 0.84 1.875 1.875 Z m -1.875 6.75 c 1.035 0.0 1.875 -0.84 1.875 -1.875 c 0.0 -1.035 -0.84 -1.875 -1.875 -1.875 c -1.035 0.0 -1.875 0.84 -1.875 1.875 c 0.0 1.035 0.84 1.875 1.875 1.875 Z m 1.875 3.0 c 0.0 1.035 -0.84 1.875 -1.875 1.875 c -1.035 0.0 -1.875 -0.84 -1.875 -1.875 C 25.5 21.84 26.34 21.0 27.375 21.0 c 1.035 0.0 1.875 0.84 1.875 1.875 Z")
        )
    }.build()
}
