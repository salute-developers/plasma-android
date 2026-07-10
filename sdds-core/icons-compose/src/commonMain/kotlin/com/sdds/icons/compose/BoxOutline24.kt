package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BoxOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BoxOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.5 12.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 4.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -4.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.25 15.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 2.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 16.664 15.0 16.25 15.0 h -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 5.25 C 3.0 4.007 4.007 3.0 5.25 3.0 h 13.5 C 19.993 3.0 21.0 4.007 21.0 5.25 v 3.0 c 0.0 0.605 -0.43 1.11 -1.0 1.225 v 8.275 c 0.0 1.795 -1.455 3.25 -3.25 3.25 h -9.5 C 5.455 21.0 4.0 19.545 4.0 17.75 V 9.475 C 3.43 9.359 3.0 8.855 3.0 8.25 v -3.0 Z M 5.25 4.5 C 4.836 4.5 4.5 4.836 4.5 5.25 V 8.0 h 15.0 V 5.25 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 5.25 Z m 0.25 5.0 v 8.25 c 0.0 0.966 0.784 1.75 1.75 1.75 h 9.5 c 0.966 0.0 1.75 -0.784 1.75 -1.75 V 9.5 h -13.0 Z")
        )
    }.build()
}
