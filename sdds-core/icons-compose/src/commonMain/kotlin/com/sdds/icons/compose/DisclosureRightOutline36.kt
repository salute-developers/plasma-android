package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureRightOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureRightOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.84 25.444 c -0.384 -0.397 -0.372 -1.03 0.025 -1.414 L 21.12 18.0 l -6.254 -6.03 c -0.397 -0.384 -0.409 -1.017 -0.025 -1.414 c 0.383 -0.398 1.016 -0.41 1.414 -0.026 L 24.0 18.0 l -7.746 7.47 c -0.398 0.383 -1.03 0.372 -1.414 -0.026 Z")
        )
    }.build()
}
