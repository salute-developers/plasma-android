package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileBadgeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileBadgeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 9.239 2.0 7.0 4.239 7.0 7.0 s 2.239 5.0 5.0 5.0 s 5.0 -2.239 5.0 -5.0 s -2.239 -5.0 -5.0 -5.0 Z M 8.5 7.0 c 0.0 -1.933 1.567 -3.5 3.5 -3.5 s 3.5 1.567 3.5 3.5 s -1.567 3.5 -3.5 3.5 S 8.5 8.933 8.5 7.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 17.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 13.586 18.5 14.0 18.5 h 3.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 17.414 17.0 17.0 17.0 h -3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 13.5 c -2.9 0.0 -5.6 0.867 -7.851 2.356 c -0.738 0.488 -1.2 1.357 -1.094 2.284 c 0.044 0.39 0.127 0.747 0.3 1.085 c 0.31 0.612 0.808 1.11 1.42 1.42 c 0.39 0.2 0.809 0.28 1.272 0.318 C 6.494 21.0 7.045 21.0 7.719 21.0 h 8.562 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.172 -0.339 0.255 -0.696 0.3 -1.086 c 0.104 -0.927 -0.357 -1.796 -1.095 -2.284 C 17.6 14.367 14.9 13.5 12.001 13.5 Z m -7.024 3.607 C 6.99 15.775 9.403 15.0 12.0 15.0 c 2.597 0.0 5.01 0.775 7.024 2.107 c 0.308 0.204 0.467 0.545 0.43 0.865 c -0.031 0.282 -0.082 0.448 -0.145 0.572 c -0.168 0.33 -0.435 0.598 -0.765 0.765 c -0.144 0.074 -0.343 0.13 -0.713 0.16 c -0.38 0.03 -0.869 0.031 -1.581 0.031 h -8.5 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.168 -0.597 -0.435 -0.765 -0.765 c -0.064 -0.124 -0.114 -0.29 -0.146 -0.572 c -0.036 -0.32 0.123 -0.66 0.431 -0.865 Z")
        )
    }.build()
}
