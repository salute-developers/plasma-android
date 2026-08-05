package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.594 11.949 c -0.733 -0.474 -0.843 -1.504 -0.226 -2.121 C 7.09 9.106 8.151 8.845 9.125 9.15 l 10.538 3.294 l 4.114 -4.375 c 1.135 -1.207 3.043 -1.236 4.214 -0.065 c 1.172 1.172 1.142 3.08 -0.065 4.214 l -4.374 4.114 l 3.294 10.538 c 0.304 0.973 0.043 2.035 -0.679 2.757 c -0.617 0.617 -1.647 0.507 -2.12 -0.226 l -5.436 -8.424 l -4.049 3.808 l 0.013 1.79 c 0.006 0.803 -0.31 1.575 -0.879 2.143 l -1.323 1.324 c -0.197 0.196 -0.531 0.118 -0.62 -0.145 l -1.435 -4.222 l -4.221 -1.434 c -0.263 -0.09 -0.341 -0.424 -0.145 -0.62 l 1.324 -1.324 c 0.568 -0.568 1.34 -0.885 2.143 -0.879 l 1.793 0.013 l 3.806 -4.047 l -8.424 -5.435 Z")
        )
    }.build()
}
