package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoubleDisclosureRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoubleDisclosureRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.03 17.03 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 L 11.0 12.0 L 7.03 8.03 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.768 -0.293 1.06 0.0 L 13.122 12.0 l -5.03 5.03 c -0.293 0.293 -0.768 0.293 -1.06 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.409 17.03 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 3.97 -3.97 l -3.97 -3.97 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.768 -0.293 1.06 0.0 L 18.5 12.0 l -5.03 5.03 c -0.292 0.293 -0.767 0.293 -1.06 0.0 Z")
        )
    }.build()
}
