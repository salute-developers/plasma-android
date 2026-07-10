package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureDownOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureDownOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.556 14.839 c 0.397 -0.384 1.03 -0.372 1.414 0.025 l 6.03 6.39 L 24.03 15.0 c 0.383 -0.398 1.017 -0.545 1.414 -0.161 c 0.398 0.383 0.41 1.016 0.026 1.414 L 18.0 23.999 l -7.47 -7.746 c -0.383 -0.398 -0.372 -1.03 0.026 -1.414 Z")
        )
    }.build()
}
