package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Formaldehyde24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Formaldehyde24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.5 12.5 c 0.414 0.0 0.75 0.336 0.75 0.75 v 8.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 18.0 h -3.5 v 3.25 C 6.25 21.664 5.914 22.0 5.5 22.0 s -0.75 -0.336 -0.75 -0.75 v -8.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 s 0.75 0.336 0.75 0.75 v 3.25 h 3.5 v -3.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.0 12.5 c 1.795 0.0 3.25 1.455 3.25 3.25 v 3.0 c 0.0 1.795 -1.455 3.25 -3.25 3.25 s -3.25 -1.455 -3.25 -3.25 v -3.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 Z m 0.0 1.5 c -0.966 0.0 -1.75 0.784 -1.75 1.75 v 3.0 c 0.0 0.966 0.784 1.75 1.75 1.75 s 1.75 -0.784 1.75 -1.75 v -3.0 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.5 2.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 8.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 7.5 h -3.5 v 3.25 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -8.0 C 4.75 2.336 5.086 2.0 5.5 2.0 s 0.75 0.336 0.75 0.75 V 6.0 h 3.5 V 2.75 C 9.75 2.336 10.086 2.0 10.5 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.5 2.0 c 1.519 0.0 2.75 1.231 2.75 2.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 H 16.0 c -0.966 0.0 -1.75 0.784 -1.75 1.75 v 3.0 C 14.25 9.216 15.034 10.0 16.0 10.0 h 0.5 c 0.69 0.0 1.25 -0.56 1.25 -1.25 C 17.75 8.336 18.086 8.0 18.5 8.0 s 0.75 0.336 0.75 0.75 c 0.0 1.519 -1.231 2.75 -2.75 2.75 H 16.0 c -1.795 0.0 -3.25 -1.455 -3.25 -3.25 v -3.0 C 12.75 3.455 14.205 2.0 16.0 2.0 h 0.5 Z")
        )
    }.build()
}
