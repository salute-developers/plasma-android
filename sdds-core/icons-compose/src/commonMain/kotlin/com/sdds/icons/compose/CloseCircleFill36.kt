package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloseCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloseCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m -4.94 -22.06 c -0.585 -0.586 -1.535 -0.586 -2.12 0.0 c -0.586 0.585 -0.586 1.535 0.0 2.12 L 15.878 18.0 l -4.94 4.94 c -0.585 0.585 -0.585 1.535 0.0 2.12 c 0.586 0.586 1.536 0.586 2.122 0.0 L 18.0 20.122 l 4.94 4.94 c 0.585 0.585 1.535 0.585 2.12 0.0 c 0.586 -0.586 0.586 -1.536 0.0 -2.122 L 20.122 18.0 l 4.94 -4.94 c 0.585 -0.585 0.585 -1.535 0.0 -2.12 c -0.586 -0.586 -1.536 -0.586 -2.122 0.0 L 18.0 15.878 l -4.94 -4.94 Z")
        )
    }.build()
}
