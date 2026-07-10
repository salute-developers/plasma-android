package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Commit36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Commit36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 10.5 c 3.803 0.0 6.943 2.83 7.432 6.5 H 33.0 v 2.0 h -7.568 c -0.49 3.67 -3.629 6.5 -7.432 6.5 c -3.803 0.0 -6.943 -2.83 -7.432 -6.5 H 3.0 v -2.0 h 7.568 c 0.49 -3.67 3.629 -6.5 7.432 -6.5 Z m 0.0 2.0 c -3.038 0.0 -5.5 2.462 -5.5 5.5 s 2.462 5.5 5.5 5.5 s 5.5 -2.462 5.5 -5.5 s -2.462 -5.5 -5.5 -5.5 Z")
        )
    }.build()
}
