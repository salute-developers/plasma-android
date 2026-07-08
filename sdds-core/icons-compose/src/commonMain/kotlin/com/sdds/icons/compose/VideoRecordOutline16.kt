package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoRecordOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoRecordOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.998 C 2.0 4.686 4.686 2.0 7.999 2.0 c 3.313 0.0 5.999 2.686 5.999 5.998 c 0.0 3.313 -2.686 5.998 -6.0 5.998 C 4.687 13.996 2.0 11.311 2.0 7.998 Z M 7.999 1.0 C 4.134 1.0 1.0 4.133 1.0 7.998 s 3.134 6.998 6.999 6.998 c 3.865 0.0 6.999 -3.133 6.999 -6.998 S 11.864 1.0 7.998 1.0 Z m 0.0 10.16 c 1.747 0.0 3.162 -1.416 3.162 -3.162 S 9.746 4.838 8.0 4.838 c -1.747 0.0 -3.162 1.414 -3.162 3.16 c 0.0 1.746 1.415 3.162 3.162 3.162 Z")
        )
    }.build()
}
