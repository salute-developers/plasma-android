package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PreviousFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PreviousFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.0 19.75 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 V 4.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 S 4.75 4.086 4.75 4.5 V 19.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.36 13.282 c -0.962 -0.584 -0.962 -1.98 0.0 -2.564 l 9.861 -5.993 c 1.0 -0.608 2.279 0.112 2.279 1.282 v 11.986 c 0.0 1.17 -1.28 1.89 -2.279 1.282 l -9.862 -5.993 Z")
        )
    }.build()
}
