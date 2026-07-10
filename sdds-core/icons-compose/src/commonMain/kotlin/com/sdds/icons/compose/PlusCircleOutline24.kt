package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlusCircleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlusCircleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.5 12.0 c 0.0 -4.694 3.806 -8.5 8.5 -8.5 s 8.5 3.806 8.5 8.5 s -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 Z M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z m 0.75 4.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 11.25 5.586 11.25 6.0 v 5.25 H 6.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 5.586 12.75 6.0 12.75 h 5.25 V 18.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -5.25 H 18.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -5.25 V 6.0 Z")
        )
    }.build()
}
