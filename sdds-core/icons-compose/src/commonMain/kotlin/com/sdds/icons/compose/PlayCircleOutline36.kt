package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlayCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlayCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 7.179 -5.82 12.999 -13.0 12.999 c -7.179 0.0 -12.999 -5.82 -12.999 -13.0 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 8.283 6.715 14.999 15.0 14.999 c 8.283 0.0 14.999 -6.716 14.999 -15.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z m 6.941 16.515 c 1.167 -0.673 1.167 -2.357 0.0 -3.03 l -9.1 -5.255 c -1.167 -0.674 -2.625 0.168 -2.625 1.515 v 10.51 c 0.0 1.346 1.458 2.188 2.625 1.515 l 9.1 -5.255 Z m -9.725 -6.337 L 23.566 18.0 l -8.35 4.821 v -9.643 Z")
        )
    }.build()
}
