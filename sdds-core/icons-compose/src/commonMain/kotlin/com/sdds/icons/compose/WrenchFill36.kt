package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WrenchFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WrenchFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.24 6.19 c 2.269 -2.27 5.632 -2.775 8.389 -1.518 l -3.891 3.892 c -0.586 0.586 -0.586 1.535 0.0 2.121 l 1.578 1.579 c 0.586 0.585 1.536 0.585 2.122 0.0 l 3.89 -3.891 c 1.257 2.756 0.751 6.12 -1.517 8.388 c -2.064 2.063 -5.034 2.668 -7.629 1.814 l -11.94 11.94 c -1.314 1.314 -3.444 1.314 -4.757 0.0 c -1.314 -1.313 -1.314 -3.443 0.0 -4.757 l 11.94 -11.94 c -0.853 -2.595 -0.248 -5.565 1.815 -7.629 Z")
        )
    }.build()
}
