package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PeopleGroupBigFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PeopleGroupBigFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.001 7.65 c 1.362 0.0 2.466 -1.097 2.466 -2.45 c 0.0 -1.353 -1.104 -2.45 -2.466 -2.45 S 5.535 3.847 5.535 5.2 c 0.0 1.353 1.104 2.45 2.466 2.45 Z M 3.823 9.947 C 5.02 9.16 6.457 8.7 8.0 8.7 c 1.543 0.0 2.98 0.46 4.178 1.247 c 0.507 0.334 0.754 0.899 0.754 1.45 c 0.0 1.024 -0.835 1.853 -1.864 1.853 H 4.933 c -1.03 0.0 -1.865 -0.83 -1.865 -1.852 c 0.0 -0.552 0.248 -1.117 0.755 -1.45 Z m 9.813 1.553 c 0.0 0.657 -0.228 1.261 -0.609 1.739 h 1.304 c 0.784 0.0 1.419 -0.632 1.419 -1.41 c 0.0 -0.418 -0.187 -0.854 -0.582 -1.113 c -0.598 -0.394 -1.283 -0.669 -2.02 -0.79 c 0.308 0.448 0.488 0.99 0.488 1.574 Z M 2.972 13.24 c -0.38 -0.478 -0.609 -1.082 -0.609 -1.739 c 0.0 -0.583 0.18 -1.125 0.488 -1.574 c -0.737 0.122 -1.421 0.396 -2.02 0.79 c -0.394 0.26 -0.581 0.695 -0.581 1.113 c 0.0 0.779 0.635 1.41 1.419 1.41 h 1.303 Z m 11.72 -5.94 c 0.0 0.966 -0.788 1.75 -1.76 1.75 c -0.974 0.0 -1.762 -0.784 -1.762 -1.75 c 0.0 -0.967 0.788 -1.75 1.761 -1.75 c 0.973 0.0 1.762 0.783 1.762 1.75 Z M 3.07 9.05 c 0.973 0.0 1.761 -0.784 1.761 -1.75 c 0.0 -0.967 -0.788 -1.75 -1.761 -1.75 c -0.973 0.0 -1.761 0.783 -1.761 1.75 c 0.0 0.966 0.788 1.75 1.76 1.75 Z")
        )
    }.build()
}
