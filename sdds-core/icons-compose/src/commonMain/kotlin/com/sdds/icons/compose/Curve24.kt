package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Curve24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Curve24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.716 5.162 c 0.324 0.258 0.378 0.73 0.12 1.054 l -5.325 6.708 c -0.906 1.142 -2.546 1.378 -3.737 0.539 l -2.412 -1.7 c -0.542 -0.381 -1.287 -0.274 -1.7 0.245 l -5.325 6.708 c -0.258 0.324 -0.73 0.379 -1.054 0.121 c -0.324 -0.258 -0.378 -0.73 -0.12 -1.054 l 5.325 -6.708 c 0.906 -1.142 2.546 -1.378 3.737 -0.538 l 2.412 1.7 c 0.542 0.38 1.287 0.274 1.7 -0.245 l 5.325 -6.709 c 0.258 -0.324 0.73 -0.378 1.054 -0.12 Z")
        )
    }.build()
}
