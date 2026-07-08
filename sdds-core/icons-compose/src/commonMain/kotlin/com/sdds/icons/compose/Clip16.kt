package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Clip16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Clip16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.152 3.048 c 1.66 -1.66 4.35 -1.66 6.01 0.0 c 1.66 1.66 1.66 4.35 0.0 6.01 l -4.88 4.882 c -0.845 0.844 -2.172 0.962 -3.152 0.28 c -1.259 -0.878 -1.419 -2.68 -0.334 -3.765 L 9.721 5.53 c 0.195 -0.195 0.511 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -4.925 4.924 c -0.644 0.645 -0.55 1.716 0.199 2.237 c 0.582 0.405 1.37 0.335 1.872 -0.166 l 4.882 -4.882 c 1.269 -1.269 1.269 -3.327 0.0 -4.596 c -1.27 -1.27 -3.327 -1.27 -4.597 0.0 L 2.437 9.178 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 l 5.423 -5.423 Z")
        )
    }.build()
}
