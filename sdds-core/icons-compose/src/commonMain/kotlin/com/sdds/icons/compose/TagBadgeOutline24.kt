package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TagBadgeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TagBadgeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.0 8.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 17.828 5.5 17.0 5.5 c -0.829 0.0 -1.5 0.672 -1.5 1.5 S 16.17 8.5 17.0 8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.975 2.0 c -0.663 0.0 -1.3 0.263 -1.768 0.732 l -8.823 8.824 c -1.074 1.073 -1.074 2.815 0.0 3.889 L 8.43 20.49 c 1.074 1.074 2.815 1.074 3.89 0.0 l 8.947 -8.948 C 21.737 11.074 22.0 10.438 22.0 9.775 V 4.5 C 22.0 3.12 20.88 2.0 19.5 2.0 h -5.525 Z m -0.707 1.793 C 13.454 3.605 13.709 3.5 13.975 3.5 H 19.5 c 0.552 0.0 1.0 0.448 1.0 1.0 v 5.275 c 0.0 0.265 -0.106 0.52 -0.293 0.707 l -8.948 8.948 c -0.489 0.489 -1.28 0.489 -1.768 0.0 l -5.047 -5.046 c -0.488 -0.488 -0.488 -1.28 0.0 -1.768 l 8.824 -8.823 Z")
        )
    }.build()
}
