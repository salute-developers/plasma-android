package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoubleDisclosureDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoubleDisclosureDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.97 7.03 c 0.293 -0.293 0.767 -0.293 1.06 0.0 L 12.0 11.0 l 3.97 -3.97 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.768 0.0 1.06 L 12.0 13.122 l -5.03 -5.03 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.97 12.409 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 3.97 3.97 l 3.97 -3.97 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.768 0.0 1.06 L 12.0 18.5 l -5.03 -5.03 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
