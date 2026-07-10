package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureUpOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureUpOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.444 21.16 c -0.397 0.384 -1.03 0.372 -1.414 -0.025 L 18.0 14.88 l -6.03 6.254 c -0.384 0.397 -1.017 0.409 -1.414 0.025 c -0.398 -0.383 -0.41 -1.016 -0.026 -1.413 L 18.0 12.0 l 7.47 7.747 c 0.383 0.397 0.372 1.03 -0.026 1.413 Z")
        )
    }.build()
}
