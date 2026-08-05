package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WrenchFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WrenchFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.859 4.464 c 1.517 -1.517 3.767 -1.855 5.61 -1.014 l -2.605 2.606 c -0.39 0.39 -0.39 1.023 0.0 1.414 l 1.06 1.06 c 0.391 0.39 1.024 0.39 1.415 0.0 l 2.606 -2.605 c 0.84 1.843 0.502 4.093 -1.015 5.61 c -1.38 1.38 -3.367 1.785 -5.103 1.214 l -7.986 7.986 c -0.879 0.879 -2.303 0.879 -3.182 0.0 c -0.879 -0.878 -0.879 -2.303 0.0 -3.182 l 7.986 -7.986 c -0.571 -1.735 -0.167 -3.722 1.214 -5.103 Z")
        )
    }.build()
}
