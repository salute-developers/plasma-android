package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinDirhamOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinDirhamOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.997 2.0 C 6.89 2.0 5.804 2.294 4.847 2.852 C 3.89 3.411 3.096 4.213 2.544 5.18 S 1.7 7.24 1.7 8.354 c 0.0 1.115 0.29 2.21 0.843 3.176 c 0.137 0.24 0.442 0.323 0.682 0.186 c 0.24 -0.137 0.323 -0.443 0.186 -0.682 c -0.466 -0.815 -0.71 -1.739 -0.71 -2.68 c 0.0 -0.94 0.244 -1.864 0.71 -2.679 c 0.465 -0.814 1.134 -1.49 1.939 -1.959 C 6.156 3.246 7.068 3.0 7.997 3.0 c 0.928 0.0 1.841 0.247 2.646 0.716 c 0.805 0.47 1.474 1.145 1.939 1.96 c 0.465 0.814 0.71 1.738 0.71 2.678 c 0.0 0.941 -0.245 1.865 -0.71 2.68 c -0.137 0.24 -0.054 0.545 0.186 0.682 s 0.545 0.054 0.682 -0.186 c 0.552 -0.966 0.843 -2.061 0.843 -3.176 c 0.0 -1.114 -0.29 -2.21 -0.843 -3.175 c -0.552 -0.966 -1.346 -1.768 -2.303 -2.327 C 10.189 2.294 9.103 2.0 7.997 2.0 Z M 1.5 12.999 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 12.996 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 1.5 Z M 8.833 5.5 c 0.277 0.0 0.5 0.224 0.5 0.5 v 2.188 H 11.0 V 6.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 S 12.0 5.724 12.0 6.0 v 5.6 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 11.0 11.876 11.0 11.6 V 9.188 H 9.333 V 11.6 c 0.0 0.276 -0.223 0.5 -0.5 0.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 6.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z M 4.5 5.5 C 4.224 5.5 4.0 5.724 4.0 6.0 v 5.6 c 0.0 0.276 0.224 0.5 0.5 0.5 h 0.9 c 1.436 0.0 2.6 -1.164 2.6 -2.6 V 8.1 c 0.0 -1.436 -1.164 -2.6 -2.6 -2.6 H 4.5 Z M 5.0 11.1 V 6.5 h 0.4 C 6.284 6.5 7.0 7.216 7.0 8.1 v 1.4 c 0.0 0.884 -0.716 1.6 -1.6 1.6 H 5.0 Z")
        )
    }.build()
}
