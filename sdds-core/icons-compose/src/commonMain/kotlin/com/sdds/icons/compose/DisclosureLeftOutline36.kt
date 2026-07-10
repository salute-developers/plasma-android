package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureLeftOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureLeftOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.16 10.556 c 0.384 0.397 0.372 1.03 -0.025 1.414 L 14.88 18.0 l 6.254 6.03 c 0.397 0.383 0.409 1.017 0.025 1.414 c -0.383 0.398 -1.016 0.41 -1.413 0.026 L 12.0 18.0 l 7.747 -7.47 c 0.397 -0.383 1.03 -0.372 1.413 0.026 Z")
        )
    }.build()
}
