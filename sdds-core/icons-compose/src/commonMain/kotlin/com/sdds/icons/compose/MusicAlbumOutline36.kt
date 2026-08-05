package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicAlbumOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicAlbumOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 7.179 -5.82 12.999 -13.0 12.999 c -7.179 0.0 -12.999 -5.82 -12.999 -13.0 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 8.283 6.715 14.999 15.0 14.999 c 8.283 0.0 14.999 -6.716 14.999 -15.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z m 2.608 5.262 c -0.534 -0.143 -1.082 0.174 -1.225 0.707 c -0.143 0.534 0.174 1.082 0.707 1.225 c 1.37 0.367 2.62 1.089 3.623 2.092 c 1.003 1.003 1.724 2.252 2.091 3.622 c 0.143 0.534 0.691 0.85 1.225 0.707 c 0.533 -0.143 0.85 -0.691 0.707 -1.225 c -0.458 -1.709 -1.358 -3.267 -2.61 -4.519 c -1.25 -1.25 -2.809 -2.15 -4.518 -2.609 Z M 8.968 19.384 c 0.534 -0.143 1.082 0.174 1.225 0.707 c 0.367 1.37 1.089 2.62 2.092 3.622 c 1.003 1.003 2.252 1.725 3.622 2.092 c 0.534 0.143 0.85 0.691 0.707 1.225 c -0.143 0.533 -0.69 0.85 -1.224 0.707 c -1.71 -0.458 -3.268 -1.358 -4.52 -2.61 c -1.25 -1.25 -2.15 -2.81 -2.609 -4.518 c -0.142 -0.534 0.174 -1.082 0.708 -1.225 Z M 14.839 18.0 c 0.0 -1.747 1.416 -3.162 3.162 -3.162 s 3.162 1.415 3.162 3.162 c 0.0 1.746 -1.416 3.162 -3.162 3.162 S 14.838 19.745 14.838 18.0 Z M 18.0 12.838 c -2.851 0.0 -5.162 2.31 -5.162 5.162 c 0.0 2.85 2.311 5.162 5.162 5.162 c 2.85 0.0 5.162 -2.312 5.162 -5.162 c 0.0 -2.851 -2.311 -5.162 -5.162 -5.162 Z")
        )
    }.build()
}
