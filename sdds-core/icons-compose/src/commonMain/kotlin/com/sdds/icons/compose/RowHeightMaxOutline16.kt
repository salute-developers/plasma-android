package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightMaxOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightMaxOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 2.5 2.254 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 10.0 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 3.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.412 3.7 h 9.1 c 0.939 0.0 1.7 0.761 1.7 1.7 v 5.1 c 0.0 0.939 -0.761 1.7 -1.7 1.7 h -9.1 c -0.939 0.0 -1.7 -0.761 -1.7 -1.7 V 5.4 c 0.0 -0.939 0.761 -1.7 1.7 -1.7 Z m 0.0 1.0 c -0.387 0.0 -0.7 0.313 -0.7 0.7 v 5.1 c 0.0 0.387 0.313 0.7 0.7 0.7 h 9.1 c 0.386 0.0 0.7 -0.313 0.7 -0.7 V 5.4 c 0.0 -0.387 -0.313 -0.7 -0.7 -0.7 h -9.1 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 3.001 13.3 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 10.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -10.0 Z")
        )
    }.build()
}
