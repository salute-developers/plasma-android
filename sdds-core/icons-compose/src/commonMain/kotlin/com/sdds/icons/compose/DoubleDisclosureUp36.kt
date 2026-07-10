package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoubleDisclosureUp36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoubleDisclosureUp36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.454 25.593 c 0.44 0.44 1.152 0.44 1.591 0.0 L 18.0 19.64 l 5.954 5.954 c 0.44 0.44 1.152 0.44 1.591 0.0 c 0.44 -0.439 0.44 -1.151 0.0 -1.59 L 18.0 16.457 l -7.546 7.546 c -0.439 0.439 -0.439 1.151 0.0 1.59 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.454 17.593 c 0.44 0.44 1.152 0.44 1.591 0.0 L 18.0 11.64 l 5.954 5.954 c 0.44 0.44 1.152 0.44 1.591 0.0 c 0.44 -0.439 0.44 -1.151 0.0 -1.59 L 18.0 8.457 l -7.546 7.546 c -0.439 0.439 -0.439 1.151 0.0 1.59 Z")
        )
    }.build()
}
