package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.85 2.852 C 5.806 2.294 6.892 2.0 8.0 2.0 c 1.105 0.0 2.192 0.294 3.149 0.852 c 0.957 0.559 1.752 1.361 2.304 2.327 c 0.552 0.966 0.842 2.06 0.842 3.175 c 0.0 1.114 -0.29 2.21 -0.842 3.175 c -0.137 0.24 -0.443 0.323 -0.682 0.186 c -0.24 -0.137 -0.324 -0.442 -0.186 -0.682 c 0.465 -0.814 0.71 -1.738 0.71 -2.679 c 0.0 -0.94 -0.245 -1.865 -0.71 -2.679 c -0.466 -0.814 -1.135 -1.49 -1.94 -1.959 C 9.84 3.246 8.928 3.0 8.0 3.0 C 7.07 3.0 6.158 3.247 5.353 3.716 c -0.805 0.47 -1.474 1.145 -1.94 1.96 c -0.465 0.813 -0.71 1.737 -0.71 2.678 c 0.0 0.94 0.245 1.865 0.71 2.679 c 0.138 0.24 0.055 0.545 -0.185 0.682 s -0.545 0.054 -0.682 -0.186 c -0.552 -0.966 -0.843 -2.06 -0.843 -3.175 c 0.0 -1.114 0.29 -2.21 0.843 -3.175 c 0.552 -0.966 1.346 -1.768 2.303 -2.327 Z M 7.498 4.63 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 0.55 0.0 1.096 0.11 1.604 0.323 c 0.509 0.212 0.97 0.524 1.36 0.917 c 0.388 0.392 0.696 0.858 0.906 1.37 c 0.21 0.512 0.318 1.061 0.318 1.615 c 0.0 0.277 -0.224 0.5 -0.5 0.5 s -0.5 -0.223 -0.5 -0.5 c 0.0 -0.424 -0.082 -0.844 -0.243 -1.235 c -0.16 -0.392 -0.396 -0.748 -0.692 -1.047 c -0.297 -0.3 -0.648 -0.536 -1.035 -0.698 C 8.831 5.212 8.417 5.129 8.0 5.129 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z M 1.5 13.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 12.997 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 1.5 Z")
        )
    }.build()
}
