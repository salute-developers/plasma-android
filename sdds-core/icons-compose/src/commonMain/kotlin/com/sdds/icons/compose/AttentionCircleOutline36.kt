package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AttentionCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AttentionCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 7.179 -5.82 12.999 -13.0 12.999 c -7.179 0.0 -12.999 -5.82 -12.999 -13.0 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 8.283 6.715 14.999 15.0 14.999 c 8.283 0.0 14.999 -6.716 14.999 -15.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z m -0.004 7.445 c 0.829 0.0 1.5 0.672 1.5 1.5 V 18.0 c 0.0 0.828 -0.671 1.5 -1.5 1.5 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 v -6.054 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 Z m 1.515 13.608 c 0.0 0.836 -0.677 1.513 -1.513 1.513 c -0.836 0.0 -1.514 -0.677 -1.514 -1.513 c 0.0 -0.836 0.678 -1.514 1.514 -1.514 s 1.513 0.678 1.513 1.514 Z")
        )
    }.build()
}
