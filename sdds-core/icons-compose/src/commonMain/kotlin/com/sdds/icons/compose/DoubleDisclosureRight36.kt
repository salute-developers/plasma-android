package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoubleDisclosureRight36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoubleDisclosureRight36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.364 25.546 c -0.44 -0.44 -0.44 -1.152 0.0 -1.591 L 16.318 18.0 l -5.954 -5.954 c -0.44 -0.44 -0.44 -1.152 0.0 -1.591 c 0.439 -0.44 1.151 -0.44 1.59 0.0 L 19.5 18.0 l -7.545 7.546 c -0.44 0.439 -1.152 0.439 -1.591 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.374 25.546 c -0.44 -0.44 -0.44 -1.152 0.0 -1.591 L 24.328 18.0 l -5.954 -5.954 c -0.44 -0.44 -0.44 -1.152 0.0 -1.591 c 0.44 -0.44 1.152 -0.44 1.591 0.0 L 27.511 18.0 l -7.546 7.546 c -0.44 0.439 -1.152 0.439 -1.591 0.0 Z")
        )
    }.build()
}
