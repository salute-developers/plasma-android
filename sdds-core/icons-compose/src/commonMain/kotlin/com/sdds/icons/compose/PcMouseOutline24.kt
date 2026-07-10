package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PcMouseOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PcMouseOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 6.75 C 12.75 6.336 12.414 6.0 12.0 6.0 s -0.75 0.336 -0.75 0.75 V 10.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 V 6.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 9.0 c 0.0 -3.866 3.134 -7.0 7.0 -7.0 s 7.0 3.134 7.0 7.0 v 6.0 c 0.0 3.866 -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 V 9.0 Z m 12.5 0.0 v 6.0 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 6.5 18.038 6.5 15.0 V 9.0 c 0.0 -3.038 2.462 -5.5 5.5 -5.5 s 5.5 2.462 5.5 5.5 Z")
        )
    }.build()
}
