package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ZoomMinusFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ZoomMinusFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.38 15.319 C 17.392 14.072 18.0 12.482 18.0 10.75 c 0.0 -4.004 -3.246 -7.25 -7.25 -7.25 S 3.5 6.746 3.5 10.75 S 6.746 18.0 10.75 18.0 c 1.732 0.0 3.322 -0.607 4.569 -1.62 l 4.65 4.65 c 0.294 0.293 0.768 0.293 1.061 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -4.65 -4.651 Z M 6.5 10.75 C 6.5 10.336 6.836 10.0 7.25 10.0 h 7.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -7.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
    }.build()
}
