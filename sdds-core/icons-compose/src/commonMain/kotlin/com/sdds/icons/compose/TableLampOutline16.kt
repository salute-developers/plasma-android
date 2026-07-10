package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableLampOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableLampOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.74 1.0 C 6.251 1.0 5.81 1.297 5.628 1.75 L 2.536 9.39 c -0.062 0.155 -0.044 0.33 0.05 0.468 c 0.092 0.138 0.248 0.22 0.414 0.22 h 4.5 v 3.919 H 4.726 c -0.277 0.0 -0.5 0.224 -0.5 0.5 s 0.223 0.5 0.5 0.5 h 6.548 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 8.5 v -3.919 h 4.501 c 0.167 0.0 0.322 -0.082 0.415 -0.22 c 0.093 -0.138 0.111 -0.313 0.049 -0.467 l -3.097 -7.642 C 10.184 1.296 9.745 1.0 9.256 1.0 H 6.74 Z M 6.555 2.125 C 6.585 2.049 6.658 2.0 6.74 2.0 h 2.516 C 9.337 2.0 9.41 2.05 9.44 2.125 l 2.818 6.953 H 3.742 l 2.813 -6.953 Z")
        )
    }.build()
}
