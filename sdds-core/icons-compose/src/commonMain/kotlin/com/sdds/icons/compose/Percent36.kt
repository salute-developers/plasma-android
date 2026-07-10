package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Percent36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Percent36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.424 6.5 C 8.257 6.5 6.5 8.257 6.5 10.424 s 1.757 3.924 3.924 3.924 s 3.924 -1.757 3.924 -3.924 S 12.59 6.5 10.424 6.5 Z M 4.5 10.424 C 4.5 7.152 7.152 4.5 10.424 4.5 c 3.272 0.0 5.924 2.652 5.924 5.924 c 0.0 3.272 -2.652 5.924 -5.924 5.924 c -3.272 0.0 -5.924 -2.652 -5.924 -5.924 Z m 25.207 -4.131 c 0.39 0.39 0.39 1.024 0.0 1.414 l -22.0 22.0 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 22.0 -22.0 c 0.39 -0.39 1.024 -0.39 1.414 0.0 Z M 21.65 25.575 c 0.0 -2.167 1.757 -3.924 3.924 -3.924 s 3.924 1.757 3.924 3.924 c 0.0 2.168 -1.757 3.924 -3.924 3.924 s -3.924 -1.756 -3.924 -3.924 Z m 3.924 -5.924 c -3.271 0.0 -5.924 2.653 -5.924 5.924 c 0.0 3.272 2.653 5.924 5.924 5.924 c 3.272 0.0 5.924 -2.652 5.924 -5.924 c 0.0 -3.271 -2.652 -5.924 -5.924 -5.924 Z")
        )
    }.build()
}
