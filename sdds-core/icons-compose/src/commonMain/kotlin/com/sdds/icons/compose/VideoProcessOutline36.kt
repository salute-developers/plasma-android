package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoProcessOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoProcessOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 7.179 -5.82 12.999 -13.0 12.999 c -7.179 0.0 -12.999 -5.82 -12.999 -13.0 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 8.283 6.715 14.999 15.0 14.999 c 8.283 0.0 14.999 -6.716 14.999 -15.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z m -4.551 8.946 c -0.83 0.0 -1.501 0.672 -1.501 1.501 v 9.106 c 0.0 0.829 0.672 1.5 1.5 1.5 h 9.106 c 0.83 0.0 1.501 -0.671 1.501 -1.5 v -9.106 c 0.0 -0.829 -0.672 -1.5 -1.5 -1.5 h -9.106 Z")
        )
    }.build()
}
