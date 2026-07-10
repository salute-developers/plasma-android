package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlusSquareFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlusSquareFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.25 3.0 C 4.455 3.0 3.0 4.455 3.0 6.25 v 11.5 C 3.0 19.545 4.455 21.0 6.25 21.0 h 11.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 6.25 C 21.0 4.455 19.545 3.0 17.75 3.0 H 6.25 Z M 12.0 6.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 4.5 h 4.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -4.5 v 4.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -4.5 h -4.5 C 6.336 12.75 6.0 12.414 6.0 12.0 s 0.336 -0.75 0.75 -0.75 h 4.5 v -4.5 C 11.25 6.336 11.586 6.0 12.0 6.0 Z")
        )
    }.build()
}
