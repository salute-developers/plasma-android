package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NextFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NextFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.25 4.25 C 20.664 4.25 21.0 4.586 21.0 5.0 v 14.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 5.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.89 10.718 c 0.962 0.584 0.962 1.98 0.0 2.564 L 6.03 19.275 c -1.0 0.608 -2.279 -0.112 -2.279 -1.282 V 6.007 c 0.0 -1.17 1.28 -1.89 2.279 -1.282 l 9.862 5.993 Z")
        )
    }.build()
}
