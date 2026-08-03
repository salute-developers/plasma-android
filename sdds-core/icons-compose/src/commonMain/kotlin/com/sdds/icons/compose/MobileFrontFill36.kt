package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileFrontFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileFrontFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.632 31.157 C 27.0 30.435 27.0 29.49 27.0 27.6 V 8.4 c 0.0 -1.89 0.0 -2.835 -0.368 -3.557 c -0.323 -0.635 -0.84 -1.152 -1.475 -1.475 C 24.435 3.0 23.49 3.0 21.6 3.0 h -7.2 c -1.89 0.0 -2.835 0.0 -3.557 0.368 c -0.635 0.323 -1.152 0.84 -1.475 1.475 C 9.0 5.565 9.0 6.51 9.0 8.4 v 19.2 c 0.0 1.89 0.0 2.835 0.368 3.557 c 0.323 0.635 0.84 1.152 1.475 1.475 C 11.565 33.0 12.51 33.0 14.4 33.0 h 7.2 c 1.89 0.0 2.835 0.0 3.557 -0.368 c 0.635 -0.323 1.152 -0.84 1.475 -1.475 Z M 16.125 6.875 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 3.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -3.75 Z")
        )
    }.build()
}
