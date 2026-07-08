package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LineLinkToto16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LineLinkToto16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.87 1.91 L 14.72 3.76 c 0.094 0.094 0.147 0.221 0.147 0.354 c 0.0 0.132 -0.053 0.26 -0.147 0.353 l -1.944 1.945 c -0.196 0.195 -0.512 0.195 -0.707 0.0 c -0.196 -0.196 -0.196 -0.512 0.0 -0.707 l 1.06 -1.061 l -3.136 0.076 c -0.853 0.021 -1.54 0.708 -1.56 1.561 l -0.08 3.249 c -0.033 1.386 -1.15 2.502 -2.535 2.536 l -3.22 0.078 l 1.027 1.027 c 0.196 0.196 0.196 0.512 0.0 0.707 c -0.195 0.196 -0.511 0.196 -0.707 0.0 l -1.852 -1.851 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 l 1.945 -1.944 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 l -1.06 1.06 l 3.135 -0.076 c 0.853 -0.02 1.54 -0.707 1.56 -1.56 l 0.08 -3.25 c 0.034 -1.386 1.15 -2.501 2.536 -2.535 l 3.22 -0.079 l -1.028 -1.027 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 c 0.195 -0.195 0.512 -0.195 0.707 0.0 Z")
        )
    }.build()
}
