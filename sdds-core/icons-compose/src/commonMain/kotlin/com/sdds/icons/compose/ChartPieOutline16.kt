package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartPieOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartPieOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.987 2.8 C 5.896 2.276 6.928 2.0 7.976 2.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 8.251 1.0 7.975 1.0 C 6.751 1.0 5.548 1.322 4.488 1.934 c -0.24 0.139 -0.322 0.444 -0.184 0.683 C 4.443 2.857 4.748 2.94 4.987 2.8 Z m -2.37 1.504 C 2.857 4.443 2.94 4.748 2.8 4.987 C 2.276 5.896 2.0 6.928 2.0 7.976 c 0.0 1.049 0.276 2.08 0.8 2.988 c 0.139 0.239 0.057 0.544 -0.183 0.683 c -0.239 0.138 -0.544 0.056 -0.683 -0.184 C 1.322 10.402 1.0 9.2 1.0 7.976 c 0.0 -1.224 0.322 -2.427 0.934 -3.487 c 0.139 -0.24 0.444 -0.322 0.683 -0.184 Z M 14.45 7.475 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 1.224 -0.322 2.427 -0.934 3.488 c -0.613 1.06 -1.493 1.94 -2.553 2.553 c -1.06 0.612 -2.264 0.934 -3.488 0.934 c -1.224 0.0 -2.427 -0.322 -3.487 -0.934 c -0.24 -0.139 -0.322 -0.444 -0.184 -0.684 c 0.139 -0.239 0.444 -0.32 0.683 -0.183 c 0.909 0.525 1.94 0.801 2.988 0.801 c 1.049 0.0 2.08 -0.276 2.988 -0.8 c 0.908 -0.525 1.662 -1.28 2.187 -2.188 c 0.524 -0.908 0.8 -1.938 0.8 -2.987 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z m -3.67 -5.358 c 0.138 -0.239 0.443 -0.32 0.683 -0.183 c 1.06 0.613 1.94 1.493 2.553 2.553 c 0.138 0.24 0.056 0.545 -0.184 0.684 c -0.239 0.138 -0.544 0.056 -0.683 -0.184 c -0.524 -0.908 -1.278 -1.662 -2.186 -2.187 c -0.24 -0.138 -0.322 -0.443 -0.183 -0.683 Z M 4.975 7.975 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 s 3.0 1.343 3.0 3.0 s -1.343 3.0 -3.0 3.0 s -3.0 -1.343 -3.0 -3.0 Z m 3.0 -4.0 c -2.21 0.0 -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 s 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 Z")
        )
    }.build()
}
