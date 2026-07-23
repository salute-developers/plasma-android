package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z m 3.986 -8.597 c 0.278 -0.268 0.286 -0.712 0.017 -0.99 c -0.268 -0.277 -0.712 -0.285 -0.99 -0.016 l -4.582 4.43 L 4.987 8.43 c -0.278 -0.269 -0.722 -0.261 -0.99 0.017 c -0.269 0.278 -0.261 0.72 0.016 0.99 l 1.932 1.866 c 0.27 0.263 0.701 0.263 0.973 0.0 l 5.068 -4.9 Z")
        )
    }.build()
}
