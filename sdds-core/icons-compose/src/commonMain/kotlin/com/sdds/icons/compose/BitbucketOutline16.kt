package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BitbucketOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BitbucketOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.665 1.709 c 0.176 0.04 0.298 0.212 0.267 0.398 l -1.983 11.9 l -0.016 0.061 c -0.043 0.118 -0.144 0.205 -0.267 0.227 L 12.603 14.3 H 3.396 c -0.15 0.0 -0.28 -0.095 -0.329 -0.232 l -0.016 -0.06 l -1.983 -11.9 C 1.033 1.893 1.197 1.7 1.413 1.7 h 13.174 l 0.078 0.009 Z M 3.947 13.299 h 8.106 L 13.236 6.2 h -2.561 l -0.536 4.293 l -0.014 0.063 C 10.079 10.7 9.945 10.8 9.79 10.8 H 6.209 c -0.155 0.0 -0.288 -0.101 -0.333 -0.244 l -0.014 -0.063 l -0.613 -4.9 C 5.226 5.412 5.349 5.248 5.52 5.21 L 5.597 5.2 h 7.805 l 0.417 -2.5 H 2.181 l 1.766 10.6 Z m 2.836 -3.5 h 2.435 L 9.668 6.2 H 6.333 l 0.45 3.6 Z")
        )
    }.build()
}
