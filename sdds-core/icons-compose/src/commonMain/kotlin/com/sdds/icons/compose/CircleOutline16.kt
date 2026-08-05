package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 2.0 C 4.686 2.0 2.0 4.686 2.0 8.0 s 2.686 6.0 6.0 6.0 s 6.0 -2.686 6.0 -6.0 s -2.686 -6.0 -6.0 -6.0 Z M 1.0 8.0 c 0.0 -3.866 3.134 -7.0 7.0 -7.0 s 7.0 3.134 7.0 7.0 s -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 Z")
        )
    }.build()
}
