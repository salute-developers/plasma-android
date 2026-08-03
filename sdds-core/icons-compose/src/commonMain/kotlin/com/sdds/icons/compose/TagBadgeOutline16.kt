package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TagBadgeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TagBadgeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.432 1.0 c -0.46 0.0 -0.9 0.184 -1.224 0.51 L 2.05 7.713 c -0.735 0.74 -0.735 1.936 0.0 2.676 l 3.518 3.545 c 0.743 0.748 1.954 0.748 2.697 0.0 l 6.233 -6.28 c 0.32 -0.323 0.5 -0.76 0.5 -1.215 V 2.725 C 15.0 1.772 14.227 1.0 13.274 1.0 H 9.432 Z M 8.917 2.214 C 9.054 2.077 9.24 2.0 9.432 2.0 h 3.842 C 13.674 2.0 14.0 2.325 14.0 2.725 v 3.714 c 0.0 0.191 -0.075 0.375 -0.21 0.51 l -6.233 6.28 c -0.352 0.355 -0.925 0.355 -1.277 0.0 L 2.76 9.685 c -0.348 -0.35 -0.348 -0.917 0.0 -1.268 l 6.156 -6.203 Z m 2.619 3.325 c 0.577 0.0 1.046 -0.472 1.046 -1.054 c 0.0 -0.582 -0.469 -1.053 -1.046 -1.053 c -0.578 0.0 -1.046 0.471 -1.046 1.053 s 0.468 1.054 1.046 1.054 Z")
        )
    }.build()
}
