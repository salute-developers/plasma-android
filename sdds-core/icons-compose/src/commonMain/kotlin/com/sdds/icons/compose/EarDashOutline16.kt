package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EarDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EarDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.205 4.79 c 0.19 0.565 0.292 1.172 0.292 1.803 c 0.0 2.15 -1.194 4.02 -2.948 4.957 c -0.677 0.361 -1.246 1.057 -1.71 1.81 c -0.604 0.979 -1.68 1.636 -2.91 1.636 c -0.818 0.0 -1.568 -0.29 -2.156 -0.774 l 0.712 -0.713 c 0.405 0.306 0.905 0.487 1.445 0.487 c 0.862 0.0 1.625 -0.46 2.057 -1.161 c 0.492 -0.798 1.176 -1.68 2.091 -2.168 c 1.436 -0.766 2.419 -2.301 2.419 -4.074 c 0.0 -0.34 -0.036 -0.673 -0.104 -0.991 l 0.812 -0.813 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.999 1.0 c 1.684 0.0 3.186 0.77 4.193 1.979 l 1.333 -1.333 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.195 0.194 -0.511 0.194 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.709 l 1.002 -1.002 C 2.553 12.202 2.5 11.863 2.5 11.51 c 0.0 -0.296 0.037 -0.585 0.105 -0.86 c 0.067 -0.268 0.339 -0.432 0.607 -0.365 c 0.268 0.067 0.43 0.339 0.363 0.607 C 3.525 11.09 3.5 11.297 3.5 11.51 c 0.0 0.052 0.002 0.104 0.005 0.155 l 2.268 -2.269 c -0.072 -0.152 -0.167 -0.3 -0.28 -0.424 c -0.438 -0.476 -0.735 -1.065 -0.86 -1.702 c -0.123 -0.636 -0.07 -1.295 0.154 -1.903 C 5.012 4.76 5.4 4.228 5.907 3.83 c 0.508 -0.397 1.115 -0.642 1.754 -0.706 C 8.301 3.06 8.944 3.18 9.52 3.469 c 0.468 0.235 0.874 0.576 1.19 0.992 l 0.772 -0.772 C 10.655 2.658 9.401 2.0 8.0 2.0 C 5.523 2.0 3.5 4.047 3.5 6.593 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 C 2.5 3.513 4.954 1.0 7.999 1.0 Z M 7.762 4.12 c -0.45 0.044 -0.88 0.217 -1.24 0.498 C 6.162 4.9 5.886 5.28 5.726 5.715 c -0.161 0.435 -0.2 0.908 -0.11 1.365 c 0.088 0.457 0.3 0.878 0.612 1.216 c 0.101 0.11 0.196 0.234 0.28 0.366 l 3.486 -3.485 C 9.758 4.829 9.441 4.549 9.07 4.362 C 8.664 4.158 8.211 4.074 7.762 4.12 Z")
        )
    }.build()
}
