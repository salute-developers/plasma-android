package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GroupOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GroupOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.454 10.94 c -0.586 0.585 -0.586 1.535 0.0 2.12 l 2.475 2.476 c 0.586 0.585 1.535 0.585 2.121 0.0 l 2.475 -2.475 c 0.586 -0.586 0.586 -1.536 0.0 -2.122 L 7.05 8.464 c -0.586 -0.585 -1.535 -0.585 -2.121 0.0 L 2.454 10.94 Z M 3.514 12.0 L 5.99 9.525 L 8.464 12.0 L 5.99 14.475 L 3.515 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.464 16.95 c -0.585 0.585 -0.585 1.535 0.0 2.121 l 2.475 2.475 c 0.586 0.586 1.536 0.586 2.122 0.0 l 2.475 -2.475 c 0.585 -0.586 0.585 -1.536 0.0 -2.121 l -2.475 -2.475 c -0.586 -0.586 -1.536 -0.586 -2.122 0.0 L 8.464 16.95 Z m 1.061 1.06 L 12.0 15.535 l 2.475 2.475 L 12.0 20.485 L 9.525 18.01 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.464 7.05 c -0.585 -0.586 -0.585 -1.535 0.0 -2.121 l 2.475 -2.475 c 0.586 -0.586 1.536 -0.586 2.122 0.0 l 2.475 2.475 c 0.585 0.586 0.585 1.535 0.0 2.121 L 13.06 9.525 c -0.586 0.586 -1.536 0.586 -2.122 0.0 L 8.464 7.05 Z M 12.0 3.515 L 9.525 5.99 L 12.0 8.464 l 2.475 -2.474 L 12.0 3.515 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.475 10.94 c -0.586 0.585 -0.586 1.535 0.0 2.12 l 2.475 2.476 c 0.585 0.585 1.535 0.585 2.121 0.0 l 2.475 -2.475 c 0.586 -0.586 0.586 -1.536 0.0 -2.122 L 19.07 8.464 c -0.586 -0.585 -1.536 -0.585 -2.121 0.0 l -2.475 2.475 Z m 1.06 1.06 l 2.475 -2.475 L 20.485 12.0 l -2.475 2.475 L 15.535 12.0 Z")
        )
    }.build()
}
