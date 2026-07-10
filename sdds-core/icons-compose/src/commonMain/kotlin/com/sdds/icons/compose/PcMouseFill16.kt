package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PcMouseFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PcMouseFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.0 C 5.293 1.0 3.1 3.194 3.1 5.9 v 4.2 C 3.1 12.806 5.293 15.0 8.0 15.0 c 2.706 0.0 4.9 -2.194 4.9 -4.9 V 5.9 C 12.9 3.194 10.706 1.0 8.0 1.0 Z m 0.5 2.8 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 7.5 3.524 7.5 3.8 v 2.75 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 3.8 Z")
        )
    }.build()
}
