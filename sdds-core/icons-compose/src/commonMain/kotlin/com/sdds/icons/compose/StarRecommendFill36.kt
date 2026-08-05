package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarRecommendFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarRecommendFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.843 5.967 c -0.54 -1.29 -2.366 -1.29 -2.905 0.0 l -2.553 6.096 c -0.227 0.543 -0.74 0.914 -1.327 0.961 l -6.606 0.527 c -1.4 0.11 -1.965 1.86 -0.896 2.769 l 5.018 4.27 c 0.452 0.384 0.65 0.99 0.51 1.567 L 7.55 28.553 c -0.327 1.36 1.152 2.44 2.349 1.714 l 5.675 -3.444 c 0.37 -0.225 0.809 -0.284 1.215 -0.178 l 0.75 -2.295 l -3.007 -2.171 c -2.298 -1.659 -1.117 -5.27 1.724 -5.27 h 3.718 l 1.149 -3.513 c 0.053 -0.164 0.117 -0.317 0.191 -0.46 c -0.409 -0.148 -0.745 -0.461 -0.918 -0.873 l -2.552 -6.096 Z m 7.427 7.89 c -0.427 -1.308 -2.29 -1.308 -2.717 0.0 l -1.487 4.545 h -4.81 c -1.384 0.0 -1.96 1.76 -0.84 2.567 l 3.892 2.81 l -1.487 4.545 c -0.428 1.308 1.079 2.395 2.199 1.587 l 3.892 -2.81 l 3.892 2.81 c 1.12 0.808 2.626 -0.28 2.198 -1.587 l -1.487 -4.545 l 3.892 -2.81 c 1.12 -0.808 0.545 -2.567 -0.84 -2.567 h -4.81 l -1.487 -4.546 Z")
        )
    }.build()
}
