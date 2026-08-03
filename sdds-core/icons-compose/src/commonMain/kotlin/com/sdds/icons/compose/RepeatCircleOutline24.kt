package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RepeatCircleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RepeatCircleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.97 2.72 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 2.5 2.5 c 0.293 0.293 0.293 0.767 0.0 1.06 l -2.5 2.5 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 1.22 -1.22 H 9.0 c -3.038 0.0 -5.5 2.462 -5.5 5.5 s 2.462 5.5 5.5 5.5 h 6.0 c 3.038 0.0 5.5 -2.462 5.5 -5.5 c 0.0 -1.24 -0.409 -2.38 -1.1 -3.3 c -0.248 -0.331 -0.182 -0.801 0.15 -1.05 c 0.33 -0.249 0.8 -0.182 1.05 0.149 C 21.479 8.969 22.0 10.425 22.0 12.0 c 0.0 3.866 -3.134 7.0 -7.0 7.0 H 9.0 c -3.866 0.0 -7.0 -3.134 -7.0 -7.0 s 3.134 -7.0 7.0 -7.0 h 4.19 l -1.22 -1.22 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
