package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvBulbFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvBulbFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 9.0 c 0.0 -1.05 0.0 -1.575 0.204 -1.976 c 0.18 -0.353 0.467 -0.64 0.82 -0.82 C 4.424 6.0 4.95 6.0 6.0 6.0 h 24.0 c 1.05 0.0 1.575 0.0 1.976 0.204 c 0.353 0.18 0.64 0.467 0.82 0.82 C 33.0 7.424 33.0 7.95 33.0 9.0 v 7.5 c -1.368 -1.822 -3.547 -3.0 -6.0 -3.0 c -4.142 0.0 -7.5 3.358 -7.5 7.5 c 0.0 1.784 0.623 3.422 1.663 4.71 H 6.0 c -1.05 0.0 -1.575 0.0 -1.976 -0.205 c -0.353 -0.18 -0.64 -0.466 -0.82 -0.82 C 3.0 24.286 3.0 23.76 3.0 22.71 V 9.0 Z m 20.0 18.5 H 6.0 v 2.0 h 17.0 v -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.233 27.0 c -0.104 0.253 -0.186 0.515 -0.24 0.787 l -0.302 1.507 C 29.435 30.577 28.308 31.5 27.0 31.5 c -1.308 0.0 -2.435 -0.923 -2.691 -2.206 l -0.302 -1.507 c -0.054 -0.272 -0.137 -0.534 -0.24 -0.787 h 6.466 Z m 0.532 -1.0 c 0.285 -0.443 0.613 -0.864 0.94 -1.276 C 32.515 23.701 33.0 22.407 33.0 21.0 c 0.0 -3.314 -2.686 -6.0 -6.0 -6.0 s -6.0 2.686 -6.0 6.0 c 0.0 1.407 0.484 2.7 1.295 3.724 c 0.327 0.412 0.655 0.833 0.94 1.276 h 7.53 Z")
        )
    }.build()
}
