package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvBulbOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvBulbOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.0 16.5 c -0.548 -0.73 -1.226 -1.357 -2.0 -1.845 V 8.0 H 5.0 v 15.153 h 14.814 c 0.214 0.717 0.533 1.39 0.94 2.0 H 4.58 c -0.087 0.0 -0.204 0.0 -0.309 -0.009 c -0.124 -0.01 -0.317 -0.037 -0.521 -0.141 c -0.259 -0.132 -0.47 -0.343 -0.601 -0.601 c -0.104 -0.205 -0.131 -0.397 -0.142 -0.522 C 3.0 23.776 3.0 23.66 3.0 23.572 V 7.58 c 0.0 -0.087 0.0 -0.204 0.008 -0.309 c 0.01 -0.124 0.038 -0.317 0.142 -0.521 c 0.132 -0.259 0.342 -0.47 0.6 -0.601 c 0.205 -0.104 0.398 -0.131 0.522 -0.142 C 4.377 6.0 4.494 6.0 4.581 6.0 h 26.838 c 0.087 0.0 0.204 0.0 0.309 0.008 c 0.124 0.01 0.317 0.038 0.521 0.142 c 0.259 0.132 0.47 0.342 0.601 0.6 c 0.104 0.205 0.131 0.398 0.142 0.522 C 33.0 7.377 33.0 7.494 33.0 7.581 v 8.918 Z M 22.5 27.0 c 0.161 0.122 0.328 0.237 0.5 0.345 v 1.657 H 5.893 V 27.0 H 22.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.233 27.0 c -0.104 0.253 -0.186 0.515 -0.24 0.787 l -0.302 1.507 C 29.435 30.577 28.308 31.5 27.0 31.5 c -1.308 0.0 -2.435 -0.923 -2.691 -2.206 l -0.302 -1.507 c -0.054 -0.272 -0.137 -0.534 -0.24 -0.787 h 6.466 Z m 0.532 -1.0 c 0.285 -0.443 0.613 -0.864 0.94 -1.276 C 32.515 23.701 33.0 22.407 33.0 21.0 c 0.0 -3.314 -2.686 -6.0 -6.0 -6.0 s -6.0 2.686 -6.0 6.0 c 0.0 1.407 0.484 2.7 1.295 3.724 c 0.327 0.412 0.655 0.833 0.94 1.276 h 7.53 Z")
        )
    }.build()
}
