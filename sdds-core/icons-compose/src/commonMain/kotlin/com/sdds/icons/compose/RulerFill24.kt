package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RulerFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RulerFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.526 2.543 c -0.684 -0.675 -1.786 -0.671 -2.466 0.009 L 2.85 16.765 c -0.68 0.68 -0.683 1.78 -0.01 2.465 l 2.218 2.254 c 0.683 0.693 1.799 0.697 2.486 0.01 L 21.78 7.238 c 0.686 -0.687 0.682 -1.801 -0.01 -2.483 l -2.244 -2.213 Z M 4.683 16.793 l 1.272 1.273 c 0.293 0.293 0.768 0.293 1.061 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.061 l -1.273 -1.273 l -1.06 1.06 Z m 2.828 -2.829 l 1.273 1.273 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 l -1.272 -1.273 l -1.061 1.06 Z m 4.101 -1.555 l -1.273 -1.273 l 1.061 -1.06 l 1.273 1.272 c 0.293 0.293 0.293 0.768 0.0 1.06 c -0.293 0.294 -0.768 0.294 -1.06 0.0 Z m 1.556 -4.102 L 14.44 9.58 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 L 14.23 7.247 l -1.061 1.06 Z m 4.101 -1.555 l -1.273 -1.273 l 1.061 -1.06 L 18.33 5.69 c 0.293 0.293 0.293 0.768 0.0 1.06 c -0.293 0.294 -0.768 0.294 -1.06 0.0 Z")
        )
    }.build()
}
