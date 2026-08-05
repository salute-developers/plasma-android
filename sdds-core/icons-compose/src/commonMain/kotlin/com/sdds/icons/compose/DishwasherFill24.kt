package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.25 2.0 C 4.455 2.0 3.0 3.455 3.0 5.25 V 8.0 h 18.0 V 5.25 C 21.0 3.455 19.545 2.0 17.75 2.0 H 6.25 Z M 8.0 6.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 S 6.0 6.552 6.0 6.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z m 4.75 -0.75 C 12.336 5.25 12.0 5.586 12.0 6.0 s 0.336 0.75 0.75 0.75 h 4.5 C 17.664 6.75 18.0 6.414 18.0 6.0 s -0.336 -0.75 -0.75 -0.75 h -4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.0 18.75 V 9.5 H 3.0 v 9.25 C 3.0 20.545 4.455 22.0 6.25 22.0 h 11.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 Z")
        )
    }.build()
}
