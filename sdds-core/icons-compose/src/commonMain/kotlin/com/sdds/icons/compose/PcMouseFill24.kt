package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PcMouseFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PcMouseFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 8.134 2.0 5.0 5.134 5.0 9.0 v 6.0 c 0.0 3.866 3.134 7.0 7.0 7.0 s 7.0 -3.134 7.0 -7.0 V 9.0 c 0.0 -3.866 -3.134 -7.0 -7.0 -7.0 Z m 0.75 4.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 11.25 5.586 11.25 6.0 v 4.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 V 6.0 Z")
        )
    }.build()
}
