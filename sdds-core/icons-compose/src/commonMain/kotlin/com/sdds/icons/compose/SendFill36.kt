package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SendFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SendFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.125 19.0 c 0.383 -0.188 0.625 -0.575 0.625 -1.0 c 0.0 -0.425 -0.242 -0.813 -0.625 -1.0 L 4.865 3.615 c -0.422 -0.208 -0.93 -0.13 -1.27 0.196 c -0.341 0.326 -0.44 0.828 -0.248 1.257 l 4.215 9.443 l 7.884 3.14 c 0.315 0.126 0.315 0.571 0.0 0.697 l -7.884 3.14 l -4.215 9.444 c -0.192 0.429 -0.093 0.931 0.247 1.257 c 0.34 0.325 0.849 0.404 1.272 0.196 L 32.126 19.0 Z")
        )
    }.build()
}
