package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoubleDisclosureLeft36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoubleDisclosureLeft36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.637 25.546 c 0.439 -0.44 0.439 -1.152 0.0 -1.591 L 19.682 18.0 l 5.955 -5.954 c 0.439 -0.44 0.439 -1.152 0.0 -1.591 c -0.44 -0.44 -1.152 -0.44 -1.591 0.0 L 16.5 18.0 l 7.546 7.546 c 0.439 0.439 1.151 0.439 1.59 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.591 25.546 c 0.44 -0.44 0.44 -1.152 0.0 -1.591 L 11.637 18.0 l 5.954 -5.954 c 0.44 -0.44 0.44 -1.152 0.0 -1.591 c -0.44 -0.44 -1.152 -0.44 -1.59 0.0 L 8.454 18.0 L 16.0 25.546 c 0.44 0.439 1.152 0.439 1.591 0.0 Z")
        )
    }.build()
}
