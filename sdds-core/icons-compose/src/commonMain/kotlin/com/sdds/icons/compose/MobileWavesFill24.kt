package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileWavesFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileWavesFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 12.0 c 3.038 0.0 5.5 -2.462 5.5 -5.5 S 20.538 1.0 17.5 1.0 S 12.0 3.462 12.0 6.5 s 2.462 5.5 5.5 5.5 Z m -1.788 -6.156 c -0.4 -0.107 -0.812 0.13 -0.919 0.53 c -0.107 0.4 0.13 0.811 0.53 0.919 c 0.266 0.07 0.501 0.228 0.669 0.446 c 0.167 0.218 0.258 0.486 0.258 0.761 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 c 0.0 -0.605 -0.2 -1.194 -0.568 -1.674 c -0.369 -0.48 -0.885 -0.826 -1.47 -0.982 Z M 15.57 3.526 c 0.107 -0.4 0.518 -0.637 0.918 -0.53 c 1.223 0.328 2.303 1.05 3.074 2.054 c 0.77 1.004 1.188 2.234 1.188 3.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -0.936 -0.309 -1.845 -0.878 -2.587 c -0.57 -0.742 -1.368 -1.276 -2.272 -1.518 c -0.4 -0.107 -0.638 -0.519 -0.53 -0.919 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.6 2.0 h 3.21 c -0.673 0.701 -1.19 1.553 -1.497 2.5 H 9.75 C 9.336 4.5 9.0 4.836 9.0 5.25 S 9.336 6.0 9.75 6.0 h 1.269 C 11.006 6.165 11.0 6.332 11.0 6.5 c 0.0 3.59 2.91 6.5 6.5 6.5 c 0.168 0.0 0.335 -0.006 0.5 -0.019 V 18.4 c 0.0 1.26 0.0 1.89 -0.245 2.372 c -0.216 0.423 -0.56 0.767 -0.983 0.983 C 16.29 22.0 15.66 22.0 14.4 22.0 H 9.6 c -1.26 0.0 -1.89 0.0 -2.371 -0.245 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 C 6.0 20.29 6.0 19.66 6.0 18.4 V 5.6 c 0.0 -1.26 0.0 -1.89 0.245 -2.371 c 0.216 -0.424 0.56 -0.768 0.984 -0.984 C 7.709 2.0 8.339 2.0 9.6 2.0 Z")
        )
    }.build()
}
