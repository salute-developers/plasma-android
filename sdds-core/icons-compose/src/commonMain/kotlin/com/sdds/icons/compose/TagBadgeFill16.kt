package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TagBadgeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TagBadgeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.422 1.0 C 8.96 1.0 8.519 1.184 8.192 1.512 L 2.06 7.685 c -0.747 0.751 -0.747 1.97 0.0 2.72 l 3.508 3.532 c 0.746 0.75 1.957 0.75 2.703 0.0 l 6.22 -6.26 C 14.817 7.347 15.0 6.902 15.0 6.44 V 2.749 C 15.0 1.783 14.222 1.0 13.262 1.0 h -3.84 Z m 2.103 4.548 c 0.576 0.0 1.043 -0.47 1.043 -1.05 c 0.0 -0.579 -0.467 -1.049 -1.043 -1.049 c -0.576 0.0 -1.043 0.47 -1.043 1.05 c 0.0 0.58 0.467 1.049 1.043 1.049 Z")
        )
    }.build()
}
