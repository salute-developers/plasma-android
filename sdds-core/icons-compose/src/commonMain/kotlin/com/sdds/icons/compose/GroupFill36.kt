package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GroupFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GroupFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.591 16.32 c -0.879 0.88 -0.879 2.304 0.0 3.183 l 3.712 3.712 c 0.88 0.878 2.304 0.878 3.182 0.0 l 3.713 -3.712 c 0.878 -0.88 0.878 -2.304 0.0 -3.182 l -3.713 -3.713 c -0.878 -0.878 -2.303 -0.878 -3.182 0.0 l -3.712 3.713 Z m 9.016 9.016 c -0.878 0.88 -0.878 2.304 0.0 3.182 l 3.713 3.712 c 0.878 0.88 2.303 0.88 3.181 0.0 l 3.713 -3.712 c 0.878 -0.878 0.878 -2.303 0.0 -3.182 L 19.5 21.624 c -0.878 -0.878 -2.303 -0.878 -3.181 0.0 l -3.713 3.712 Z m 0.0 -14.85 c -0.878 -0.878 -0.878 -2.303 0.0 -3.181 l 3.713 -3.712 c 0.878 -0.88 2.303 -0.88 3.181 0.0 l 3.713 3.712 c 0.878 0.878 0.878 2.303 0.0 3.182 L 19.5 14.199 c -0.878 0.879 -2.303 0.879 -3.181 0.0 l -3.713 -3.712 Z m 9.015 5.835 c -0.878 0.878 -0.878 2.303 0.0 3.181 l 3.712 3.713 c 0.88 0.878 2.304 0.878 3.183 0.0 l 3.712 -3.712 c 0.879 -0.88 0.879 -2.304 0.0 -3.182 l -3.712 -3.713 c -0.88 -0.878 -2.304 -0.878 -3.183 0.0 l -3.712 3.713 Z")
        )
    }.build()
}
