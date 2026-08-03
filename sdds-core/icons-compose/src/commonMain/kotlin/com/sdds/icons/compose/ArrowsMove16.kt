package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowsMove16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowsMove16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.647 1.148 c 0.195 -0.195 0.512 -0.195 0.707 0.0 l 1.756 1.756 c 0.196 0.196 0.196 0.512 0.0 0.708 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 8.0 2.209 L 6.598 3.612 c -0.196 0.195 -0.512 0.195 -0.707 0.0 c -0.196 -0.196 -0.196 -0.512 0.0 -0.708 l 1.756 -1.756 Z M 9.404 8.0 c 0.0 0.776 -0.63 1.405 -1.405 1.405 c -0.776 0.0 -1.405 -0.629 -1.405 -1.405 s 0.629 -1.405 1.405 -1.405 S 9.404 7.225 9.404 8.0 Z m 3.692 -2.11 c -0.196 -0.196 -0.512 -0.196 -0.707 0.0 c -0.196 0.195 -0.196 0.512 0.0 0.707 L 13.79 8.0 L 12.39 9.402 c -0.196 0.195 -0.196 0.512 0.0 0.707 c 0.195 0.196 0.511 0.196 0.707 0.0 l 1.756 -1.756 C 14.946 8.26 14.998 8.133 14.998 8.0 c 0.0 -0.133 -0.052 -0.26 -0.146 -0.354 L 13.096 5.89 Z M 5.89 12.388 c 0.195 -0.195 0.511 -0.195 0.707 0.0 L 8.0 13.791 l 1.403 -1.403 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.196 0.196 0.196 0.512 0.0 0.707 l -1.756 1.757 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 5.89 13.095 c -0.196 -0.195 -0.196 -0.511 0.0 -0.707 Z M 3.61 6.597 c 0.196 -0.195 0.196 -0.512 0.0 -0.707 c -0.194 -0.196 -0.511 -0.196 -0.706 0.0 L 1.148 7.646 C 1.055 7.74 1.002 7.866 1.002 8.0 c 0.0 0.132 0.053 0.26 0.146 0.353 l 1.757 1.756 c 0.195 0.196 0.512 0.196 0.707 0.0 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 L 2.209 8.0 l 1.403 -1.403 Z")
        )
    }.build()
}
