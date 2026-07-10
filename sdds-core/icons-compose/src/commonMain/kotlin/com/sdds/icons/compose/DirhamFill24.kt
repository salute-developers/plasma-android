package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DirhamFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DirhamFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 12.0 c 0.0 5.523 -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 S 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 Z m -8.81 -4.75 c 0.415 0.0 0.75 0.336 0.75 0.75 v 3.09 h 2.31 V 8.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 S 17.75 7.586 17.75 8.0 v 8.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -3.41 h -2.31 V 16.0 c 0.0 0.414 -0.335 0.75 -0.75 0.75 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 V 8.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z M 7.0 7.25 C 6.586 7.25 6.25 7.586 6.25 8.0 v 8.0 c 0.0 0.414 0.336 0.75 0.75 0.75 h 1.286 c 2.07 0.0 3.75 -1.679 3.75 -3.75 v -2.0 c 0.0 -2.071 -1.68 -3.75 -3.75 -3.75 H 7.0 Z m 1.286 8.0 H 7.75 v -6.5 h 0.536 c 1.242 0.0 2.25 1.007 2.25 2.25 v 2.0 c 0.0 1.243 -1.008 2.25 -2.25 2.25 Z")
        )
    }.build()
}
