package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AiOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AiOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.682 12.716 c 0.498 -1.513 2.638 -1.513 3.136 0.0 l 1.204 3.661 c 0.335 1.018 1.133 1.817 2.15 2.152 l 3.664 1.205 c 1.512 0.497 1.512 2.636 0.0 3.134 l -3.663 1.204 c -1.018 0.335 -1.816 1.134 -2.151 2.152 l -1.204 3.661 c -0.498 1.513 -2.638 1.513 -3.136 0.0 l -1.204 -3.66 c -0.335 -1.019 -1.133 -1.818 -2.151 -2.153 l -3.66 -1.204 c -1.513 -0.497 -1.513 -2.637 0.0 -3.134 l 3.66 -1.206 c 1.018 -0.334 1.816 -1.133 2.151 -2.15 l 1.204 -3.662 Z m 0.934 4.363 c -0.558 1.697 -1.89 3.03 -3.586 3.587 L 8.1 21.301 l 1.93 0.634 c 1.697 0.559 3.028 1.89 3.586 3.586 l 0.634 1.928 l 0.634 -1.928 c 0.558 -1.696 1.89 -3.027 3.586 -3.586 l 1.929 -0.634 l -1.93 -0.635 c -1.696 -0.558 -3.027 -1.89 -3.585 -3.587 l -0.634 -1.928 l -0.634 1.928 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.965 6.48 c 0.087 -0.28 0.485 -0.28 0.572 0.0 l 0.66 2.141 c 0.293 0.948 1.034 1.692 1.982 1.984 l 2.143 0.66 c 0.28 0.087 0.281 0.486 0.0 0.573 l -2.143 0.659 c -0.948 0.293 -1.69 1.036 -1.982 1.984 l -0.66 2.14 c -0.087 0.282 -0.485 0.282 -0.572 0.0 l -0.662 -2.14 c -0.292 -0.948 -1.035 -1.692 -1.983 -1.984 l -2.14 -0.66 c -0.282 -0.086 -0.282 -0.486 0.0 -0.573 l 2.14 -0.659 c 0.948 -0.292 1.69 -1.036 1.983 -1.984 l 0.662 -2.14 Z")
        )
    }.build()
}
