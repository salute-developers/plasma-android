package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WifiLock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WifiLock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 9.955 c 0.376 0.0 0.681 0.305 0.681 0.682 v 0.681 h -1.363 v -0.681 c 0.0 -0.377 0.305 -0.682 0.681 -0.682 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.07 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.68 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z m 0.0 1.022 c -0.753 0.0 -1.364 0.61 -1.364 1.364 v 0.681 c -0.376 0.0 -0.682 0.306 -0.682 0.683 v 1.704 c 0.0 0.377 0.306 0.682 0.682 0.682 h 2.727 c 0.376 0.0 0.681 -0.305 0.681 -0.682 V 12.0 c 0.0 -0.377 -0.305 -0.683 -0.681 -0.683 v -0.681 c 0.0 -0.753 -0.61 -1.363 -1.364 -1.364 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.758 10.494 C 7.591 10.965 7.5 11.472 7.5 12.0 c 0.0 0.708 0.164 1.378 0.456 1.974 C 7.01 13.95 6.25 13.178 6.25 12.227 c 0.0 -0.885 0.657 -1.615 1.508 -1.733 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 6.925 c 0.975 0.0 1.922 0.264 2.748 0.752 c -0.423 0.122 -0.82 0.305 -1.181 0.538 C 9.07 8.025 8.54 7.925 8.0 7.925 c -1.166 0.0 -2.286 0.464 -3.11 1.289 c -0.196 0.195 -0.513 0.194 -0.708 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 C 5.195 7.494 6.57 6.925 8.0 6.925 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 4.475 c 1.99 0.0 3.898 0.79 5.304 2.196 c 0.195 0.195 0.194 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 C 11.378 6.159 9.724 5.475 8.0 5.475 c -1.723 0.0 -3.377 0.684 -4.596 1.903 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 C 4.103 5.265 6.012 4.475 8.0 4.475 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 2.025 c 2.545 0.0 4.988 1.012 6.789 2.812 c 0.194 0.195 0.194 0.512 0.0 0.707 c -0.196 0.195 -0.513 0.195 -0.708 0.0 C 12.468 3.932 10.28 3.026 8.0 3.025 c -2.28 0.0 -4.469 0.907 -6.082 2.519 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.194 -0.195 -0.194 -0.512 0.0 -0.707 c 1.8 -1.8 4.243 -2.811 6.789 -2.812 Z")
        )
    }.build()
}
