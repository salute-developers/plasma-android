package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X1LFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X1LFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.368 7.843 C 3.0 8.565 3.0 9.51 3.0 11.4 v 13.2 c 0.0 1.89 0.0 2.835 0.368 3.557 c 0.323 0.635 0.84 1.152 1.475 1.475 C 5.565 30.0 6.51 30.0 8.4 30.0 h 4.2 c 1.89 0.0 2.835 0.0 3.557 -0.368 c 0.635 -0.323 1.152 -0.84 1.475 -1.475 C 18.0 27.435 18.0 26.49 18.0 24.6 V 11.4 c 0.0 -1.89 0.0 -2.835 -0.368 -3.557 c -0.323 -0.635 -0.84 -1.152 -1.475 -1.475 C 15.435 6.0 14.49 6.0 12.6 6.0 H 8.4 C 6.51 6.0 5.565 6.0 4.843 6.368 C 4.208 6.69 3.69 7.208 3.368 7.843 Z m 18.0 3.0 C 21.0 11.565 21.0 12.51 21.0 14.4 v 7.2 c 0.0 1.89 0.0 2.835 0.368 3.557 c 0.323 0.635 0.84 1.152 1.475 1.475 C 23.565 27.0 24.51 27.0 26.4 27.0 h 1.2 c 1.89 0.0 2.835 0.0 3.557 -0.368 c 0.635 -0.323 1.152 -0.84 1.475 -1.475 C 33.0 24.435 33.0 23.49 33.0 21.6 v -7.2 c 0.0 -1.89 0.0 -2.835 -0.368 -3.557 c -0.323 -0.635 -0.84 -1.152 -1.475 -1.475 C 30.435 9.0 29.49 9.0 27.6 9.0 h -1.2 c -1.89 0.0 -2.835 0.0 -3.557 0.368 c -0.635 0.323 -1.152 0.84 -1.475 1.475 Z")
        )
    }.build()
}
