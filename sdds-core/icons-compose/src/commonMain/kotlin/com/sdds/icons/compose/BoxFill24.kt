package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BoxFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BoxFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.25 3.0 C 4.007 3.0 3.0 4.007 3.0 5.25 V 8.0 h 18.0 V 5.25 C 21.0 4.007 19.993 3.0 18.75 3.0 H 5.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.0 9.5 H 4.0 v 8.25 C 4.0 19.545 5.455 21.0 7.25 21.0 h 9.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 9.5 Z M 12.25 12.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 4.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 16.664 12.0 16.25 12.0 h -4.0 Z m 1.25 3.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 2.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -2.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
    }.build()
}
