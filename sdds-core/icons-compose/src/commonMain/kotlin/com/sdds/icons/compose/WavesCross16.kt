package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WavesCross16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WavesCross16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.004 2.11 C 6.223 1.94 6.537 1.98 6.706 2.2 C 7.99 3.865 8.688 5.905 8.688 8.005 c 0.0 2.1 -0.697 4.14 -1.982 5.805 c -0.17 0.218 -0.483 0.259 -0.702 0.09 c -0.218 -0.169 -0.259 -0.483 -0.09 -0.701 c 1.15 -1.49 1.774 -3.316 1.774 -5.194 c 0.0 -1.878 -0.624 -3.704 -1.774 -5.194 c -0.169 -0.219 -0.128 -0.533 0.09 -0.702 Z m 4.321 3.414 C 10.13 5.33 9.813 5.331 9.618 5.526 C 9.423 5.722 9.424 6.04 9.62 6.234 l 1.782 1.77 L 9.62 9.777 c -0.196 0.194 -0.197 0.51 -0.002 0.707 c 0.195 0.195 0.511 0.197 0.707 0.002 l 1.786 -1.775 l 1.785 1.775 c 0.196 0.195 0.513 0.194 0.707 -0.002 c 0.195 -0.196 0.194 -0.513 -0.002 -0.707 L 12.82 8.005 L 14.6 6.234 c 0.196 -0.195 0.197 -0.512 0.002 -0.708 c -0.194 -0.195 -0.51 -0.196 -0.707 -0.002 L 12.111 7.3 l -1.786 -1.776 Z M 2.182 6.337 c -0.139 -0.239 -0.445 -0.32 -0.684 -0.181 C 1.26 6.294 1.178 6.6 1.317 6.839 c 0.206 0.355 0.314 0.757 0.314 1.166 c 0.0 0.41 -0.108 0.811 -0.314 1.166 C 1.178 9.41 1.259 9.716 1.498 9.855 c 0.239 0.138 0.545 0.057 0.684 -0.182 c 0.294 -0.507 0.45 -1.082 0.45 -1.668 c 0.0 -0.586 -0.156 -1.161 -0.45 -1.668 Z M 4.34 4.14 C 4.172 3.922 3.858 3.88 3.639 4.05 C 3.421 4.218 3.38 4.532 3.55 4.75 C 4.27 5.686 4.66 6.83 4.66 8.006 c 0.0 1.176 -0.39 2.32 -1.11 3.253 c -0.17 0.218 -0.13 0.532 0.09 0.701 c 0.218 0.169 0.532 0.128 0.7 -0.09 c 0.856 -1.108 1.32 -2.467 1.32 -3.864 c 0.0 -1.398 -0.464 -2.756 -1.32 -3.864 Z")
        )
    }.build()
}
