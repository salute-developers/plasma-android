package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DashboardOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DashboardOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.25 7.3 c 0.58 0.0 1.05 0.47 1.05 1.05 v 5.6 l -0.005 0.108 c -0.05 0.494 -0.444 0.886 -0.938 0.936 L 6.25 15.0 h -4.2 l -0.108 -0.006 c -0.493 -0.05 -0.886 -0.443 -0.936 -0.936 L 1.0 13.95 v -5.6 C 1.0 7.77 1.47 7.3 2.05 7.3 h 4.2 Z m -4.2 1.0 C 2.022 8.3 2.0 8.322 2.0 8.35 v 5.6 C 2.0 13.978 2.022 14.0 2.05 14.0 h 4.2 c 0.027 0.0 0.05 -0.022 0.05 -0.05 v -5.6 c 0.0 -0.028 -0.022 -0.05 -0.05 -0.05 h -4.2 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.95 10.1 c 0.58 0.0 1.05 0.47 1.05 1.05 v 2.8 c 0.0 0.543 -0.413 0.99 -0.942 1.044 L 13.95 15.0 h -4.2 l -0.107 -0.006 C 9.113 14.94 8.7 14.493 8.7 13.95 v -2.8 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 h 4.2 Z m -4.2 1.0 c -0.027 0.0 -0.05 0.022 -0.05 0.05 v 2.8 C 9.7 13.976 9.722 14.0 9.75 14.0 h 4.2 c 0.028 0.0 0.05 -0.023 0.05 -0.05 v -2.8 c 0.0 -0.028 -0.023 -0.05 -0.05 -0.05 h -4.2 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.95 1.0 C 14.53 1.0 15.0 1.47 15.0 2.05 v 5.6 l -0.005 0.108 c -0.05 0.494 -0.443 0.886 -0.937 0.936 L 13.95 8.7 h -4.2 L 9.643 8.694 c -0.494 -0.05 -0.886 -0.442 -0.937 -0.936 L 8.7 7.65 v -5.6 C 8.7 1.47 9.17 1.0 9.75 1.0 h 4.2 Z m -4.2 1.0 C 9.723 2.0 9.7 2.022 9.7 2.05 v 5.6 c 0.0 0.028 0.023 0.05 0.05 0.05 h 4.2 C 13.978 7.7 14.0 7.678 14.0 7.65 v -5.6 C 14.0 2.022 13.978 2.0 13.95 2.0 h -4.2 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.25 1.0 C 6.83 1.0 7.3 1.47 7.3 2.05 v 2.8 c 0.0 0.543 -0.413 0.99 -0.943 1.045 L 6.25 5.9 h -4.2 L 1.942 5.895 C 1.413 5.84 1.0 5.393 1.0 4.85 v -2.8 C 1.0 1.47 1.47 1.0 2.05 1.0 h 4.2 Z m -4.2 1.0 C 2.022 2.0 2.0 2.022 2.0 2.05 v 2.8 C 2.0 4.877 2.022 4.9 2.05 4.9 h 4.2 c 0.028 0.0 0.05 -0.023 0.05 -0.05 v -2.8 C 6.3 2.022 6.278 2.0 6.25 2.0 h -4.2 Z")
        )
    }.build()
}
