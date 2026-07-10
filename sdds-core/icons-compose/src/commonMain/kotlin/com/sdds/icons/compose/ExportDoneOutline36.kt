package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ExportDoneOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ExportDoneOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 18.0 c 4.694 0.0 8.5 3.806 8.5 8.5 c 0.0 4.695 -3.806 8.5 -8.5 8.5 S 18.0 31.195 18.0 26.5 c 0.0 -4.694 3.806 -8.5 8.5 -8.5 Z m 4.95 4.4 c -0.331 -0.248 -0.801 -0.181 -1.05 0.15 l -5.445 7.26 l -2.89 -3.304 c -0.273 -0.311 -0.748 -0.343 -1.06 -0.07 c -0.31 0.272 -0.342 0.747 -0.07 1.058 l 3.5 4.0 c 0.15 0.17 0.367 0.264 0.593 0.255 c 0.226 -0.008 0.436 -0.118 0.572 -0.299 l 6.0 -8.0 c 0.248 -0.331 0.181 -0.8 -0.15 -1.05 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.75 22.75 c 0.552 0.0 1.0 0.448 1.0 1.0 v 3.75 c 0.0 1.933 1.567 3.5 3.5 3.5 h 9.32 c 0.364 0.721 0.813 1.392 1.333 2.0 H 8.25 c -3.038 0.0 -5.5 -2.462 -5.5 -5.5 v -3.75 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.134 4.589 c 0.478 -0.478 1.254 -0.478 1.732 0.0 l 6.592 6.592 c 0.39 0.39 0.39 1.023 0.0 1.414 c -0.39 0.39 -1.023 0.39 -1.414 0.0 l -4.972 -4.972 v 12.183 c -0.871 0.966 -1.556 2.104 -2.0 3.356 V 7.48 l -5.115 5.115 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 6.59 -6.592 Z")
        )
    }.build()
}
