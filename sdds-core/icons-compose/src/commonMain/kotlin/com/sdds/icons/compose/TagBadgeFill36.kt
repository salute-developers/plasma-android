package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TagBadgeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TagBadgeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.017 3.0 c -0.99 0.0 -1.94 0.396 -2.64 1.1 L 5.203 17.36 c -1.604 1.614 -1.604 4.231 0.0 5.845 l 7.535 7.585 c 1.604 1.614 4.204 1.614 5.807 0.0 l 13.362 -13.448 c 0.7 -0.705 1.093 -1.66 1.093 -2.657 V 6.757 C 33.0 4.682 31.329 3.0 29.267 3.0 h -8.25 Z m 4.518 9.769 c 1.237 0.0 2.24 -1.01 2.24 -2.255 c 0.0 -1.245 -1.003 -2.254 -2.24 -2.254 c -1.237 0.0 -2.24 1.01 -2.24 2.254 c 0.0 1.245 1.003 2.255 2.24 2.255 Z")
        )
    }.build()
}
