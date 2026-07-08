package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlusCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlusCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 8.7 3.8 c 0.0 -0.387 -0.313 -0.7 -0.7 -0.7 c -0.387 0.0 -0.7 0.313 -0.7 0.7 v 3.5 H 3.8 C 3.413 7.3 3.1 7.613 3.1 8.0 c 0.0 0.387 0.313 0.7 0.7 0.7 h 3.5 v 3.5 c 0.0 0.387 0.313 0.7 0.7 0.7 c 0.387 0.0 0.7 -0.313 0.7 -0.7 V 8.7 h 3.5 c 0.387 0.0 0.7 -0.313 0.7 -0.7 c 0.0 -0.387 -0.313 -0.7 -0.7 -0.7 H 8.7 V 3.8 Z")
        )
    }.build()
}
