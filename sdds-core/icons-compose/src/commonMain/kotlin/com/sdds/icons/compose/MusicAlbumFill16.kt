package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicAlbumFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicAlbumFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 9.217 3.46 C 8.95 3.388 8.677 3.547 8.605 3.814 C 8.533 4.08 8.692 4.354 8.958 4.426 c 0.628 0.168 1.2 0.498 1.66 0.958 c 0.458 0.459 0.789 1.03 0.957 1.658 c 0.071 0.267 0.345 0.425 0.612 0.354 c 0.267 -0.072 0.425 -0.346 0.354 -0.613 c -0.214 -0.797 -0.633 -1.523 -1.217 -2.107 c -0.583 -0.583 -1.31 -1.003 -2.107 -1.216 Z M 3.814 8.604 C 4.081 8.532 4.355 8.69 4.427 8.957 c 0.168 0.628 0.498 1.2 0.957 1.66 c 0.46 0.458 1.032 0.789 1.66 0.957 c 0.266 0.071 0.424 0.345 0.353 0.612 c -0.072 0.267 -0.346 0.425 -0.613 0.354 c -0.797 -0.214 -1.523 -0.633 -2.107 -1.217 c -0.583 -0.583 -1.003 -1.31 -1.216 -2.107 c -0.072 -0.266 0.087 -0.54 0.353 -0.612 Z M 8.0 9.925 c 1.063 0.0 1.925 -0.862 1.925 -1.925 c 0.0 -1.063 -0.862 -1.925 -1.925 -1.925 c -1.063 0.0 -1.925 0.862 -1.925 1.925 c 0.0 1.063 0.862 1.925 1.925 1.925 Z")
        )
    }.build()
}
