package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Contrast1Outline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Contrast1Outline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 12.625 v 10.75 c 2.968 0.0 5.375 -2.407 5.375 -5.375 c 0.0 -2.969 -2.407 -5.375 -5.375 -5.375 Z m 0.0 -2.0 c -4.073 0.0 -7.375 3.302 -7.375 7.375 s 3.302 7.375 7.375 7.375 s 7.375 -3.302 7.375 -7.375 s -3.302 -7.375 -7.375 -7.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.5 6.75 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 s 0.672 -1.5 1.5 -1.5 s 1.5 0.672 1.5 1.5 Z m 0.0 22.5 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 s 0.672 -1.5 1.5 -1.5 s 1.5 0.672 1.5 1.5 Z M 11.106 8.985 c 0.585 0.586 0.585 1.535 0.0 2.121 c -0.586 0.586 -1.536 0.586 -2.122 0.0 c -0.586 -0.586 -0.586 -1.535 0.0 -2.121 c 0.586 -0.586 1.536 -0.586 2.122 0.0 Z m 15.91 15.91 c 0.585 0.585 0.585 1.535 0.0 2.121 c -0.586 0.586 -1.536 0.586 -2.122 0.0 c -0.586 -0.586 -0.586 -1.536 0.0 -2.121 c 0.586 -0.586 1.536 -0.586 2.122 0.0 Z m -2.122 -13.79 c 0.586 0.586 1.536 0.586 2.122 0.0 c 0.585 -0.585 0.585 -1.535 0.0 -2.121 c -0.586 -0.586 -1.536 -0.586 -2.122 0.0 c -0.586 0.586 -0.586 1.536 0.0 2.121 Z m -15.91 15.91 c 0.586 0.586 1.536 0.586 2.122 0.0 c 0.585 -0.586 0.585 -1.535 0.0 -2.121 c -0.586 -0.586 -1.536 -0.586 -2.122 0.0 c -0.586 0.586 -0.586 1.535 0.0 2.121 Z M 29.25 19.5 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 s 0.672 -1.5 1.5 -1.5 s 1.5 0.672 1.5 1.5 s -0.672 1.5 -1.5 1.5 Z m -22.5 0.0 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 s 0.672 -1.5 1.5 -1.5 s 1.5 0.672 1.5 1.5 s -0.672 1.5 -1.5 1.5 Z")
        )
    }.build()
}
