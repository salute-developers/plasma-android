package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicAlbumOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicAlbumOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.002 8.0 c 0.0 -3.313 2.685 -5.998 5.998 -5.998 S 13.998 4.687 13.998 8.0 S 11.313 13.998 8.0 13.998 S 2.002 11.313 2.002 8.0 Z M 8.0 1.002 C 4.135 1.002 1.002 4.135 1.002 8.0 S 4.135 14.998 8.0 14.998 S 14.998 11.865 14.998 8.0 S 11.865 1.002 8.0 1.002 Z m 1.22 2.443 C 8.955 3.374 8.68 3.532 8.609 3.8 c -0.071 0.267 0.087 0.54 0.354 0.612 c 0.63 0.17 1.204 0.5 1.665 0.962 c 0.461 0.461 0.793 1.035 0.962 1.665 c 0.071 0.267 0.345 0.425 0.612 0.354 c 0.267 -0.072 0.425 -0.346 0.354 -0.612 c -0.215 -0.8 -0.636 -1.529 -1.22 -2.114 C 10.748 4.08 10.02 3.66 9.22 3.446 Z M 3.8 8.608 C 4.065 8.536 4.34 8.695 4.411 8.96 c 0.169 0.63 0.5 1.205 0.961 1.666 c 0.461 0.46 1.036 0.793 1.666 0.961 c 0.266 0.072 0.425 0.346 0.353 0.613 c -0.071 0.266 -0.345 0.425 -0.612 0.353 c -0.8 -0.214 -1.529 -0.635 -2.114 -1.22 S 3.66 10.02 3.446 9.22 C 3.374 8.953 3.533 8.68 3.799 8.608 Z M 6.567 8.0 C 6.568 7.209 7.21 6.568 8.0 6.568 c 0.791 0.0 1.432 0.641 1.432 1.432 c 0.0 0.79 -0.64 1.432 -1.432 1.432 C 7.21 9.432 6.568 8.79 6.568 8.0 Z M 8.0 5.568 C 6.657 5.568 5.568 6.657 5.568 8.0 S 6.658 10.432 8.0 10.432 c 1.343 0.0 2.432 -1.09 2.432 -2.432 c 0.0 -1.343 -1.089 -2.432 -2.432 -2.432 Z")
        )
    }.build()
}
