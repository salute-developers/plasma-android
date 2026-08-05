package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileWavesFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileWavesFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.9 3.0 h -4.5 c -1.89 0.0 -2.835 0.0 -3.557 0.368 c -0.635 0.323 -1.152 0.84 -1.475 1.475 C 9.0 5.565 9.0 6.51 9.0 8.4 v 19.2 c 0.0 1.89 0.0 2.835 0.368 3.557 c 0.323 0.635 0.84 1.152 1.475 1.475 C 11.565 33.0 12.51 33.0 14.4 33.0 h 7.2 c 1.89 0.0 2.835 0.0 3.557 -0.368 c 0.635 -0.323 1.152 -0.84 1.475 -1.475 C 27.0 30.435 27.0 29.49 27.0 27.6 v -8.112 c -0.166 0.008 -0.332 0.012 -0.5 0.012 c -5.523 0.0 -10.0 -4.477 -10.0 -10.0 c 0.0 -0.21 0.006 -0.418 0.02 -0.625 h -0.395 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 0.723 C 17.241 5.426 17.952 4.108 18.9 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 35.0 9.5 c 0.0 4.694 -3.806 8.5 -8.5 8.5 S 18.0 14.194 18.0 9.5 S 21.806 1.0 26.5 1.0 S 35.0 4.806 35.0 9.5 Z M 22.175 9.097 c 0.143 -0.534 0.691 -0.85 1.225 -0.708 c 0.87 0.233 1.638 0.747 2.186 1.462 c 0.549 0.714 0.846 1.59 0.846 2.49 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 c 0.0 -0.46 -0.152 -0.908 -0.432 -1.273 c -0.28 -0.365 -0.673 -0.628 -1.118 -0.747 c -0.533 -0.143 -0.85 -0.691 -0.707 -1.224 Z m 2.111 -4.8 c -0.533 -0.143 -1.082 0.174 -1.225 0.707 c -0.143 0.534 0.174 1.082 0.707 1.225 c 1.43 0.384 2.695 1.228 3.596 2.403 c 0.902 1.175 1.39 2.614 1.39 4.095 c 0.0 0.553 0.448 1.0 1.0 1.0 c 0.553 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -1.92 -0.633 -3.788 -1.803 -5.313 c -1.17 -1.524 -2.81 -2.62 -4.665 -3.117 Z")
        )
    }.build()
}
