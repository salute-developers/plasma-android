package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlayOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlayOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.375 10.047 c 1.5 0.866 1.5 3.03 0.0 3.897 l -10.5 6.062 C 7.375 20.872 5.5 19.79 5.5 18.057 V 5.933 c 0.0 -1.732 1.875 -2.815 3.375 -1.949 l 10.5 6.063 Z m -0.75 2.598 c 0.5 -0.289 0.5 -1.01 0.0 -1.3 l -10.5 -6.061 C 7.625 4.994 7.0 5.356 7.0 5.933 v 12.124 c 0.0 0.578 0.625 0.939 1.125 0.65 l 10.5 -6.062 Z")
        )
    }.build()
}
