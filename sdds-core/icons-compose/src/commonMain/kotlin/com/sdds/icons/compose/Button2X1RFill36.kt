package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X1RFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X1RFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.632 7.843 C 33.0 8.565 33.0 9.51 33.0 11.4 v 13.2 c 0.0 1.89 0.0 2.835 -0.368 3.557 c -0.323 0.635 -0.84 1.152 -1.475 1.475 C 30.435 30.0 29.49 30.0 27.6 30.0 h -4.2 c -1.89 0.0 -2.835 0.0 -3.557 -0.368 c -0.635 -0.323 -1.152 -0.84 -1.475 -1.475 C 18.0 27.435 18.0 26.49 18.0 24.6 V 11.4 c 0.0 -1.89 0.0 -2.835 0.368 -3.557 c 0.323 -0.635 0.84 -1.152 1.475 -1.475 C 20.565 6.0 21.51 6.0 23.4 6.0 h 4.2 c 1.89 0.0 2.835 0.0 3.557 0.368 c 0.635 0.323 1.152 0.84 1.475 1.475 Z m -18.0 3.0 C 15.0 11.565 15.0 12.51 15.0 14.4 v 7.2 c 0.0 1.89 0.0 2.835 -0.368 3.557 c -0.323 0.635 -0.84 1.152 -1.475 1.475 C 12.435 27.0 11.49 27.0 9.6 27.0 H 8.4 c -1.89 0.0 -2.835 0.0 -3.557 -0.368 c -0.635 -0.323 -1.152 -0.84 -1.475 -1.475 C 3.0 24.435 3.0 23.49 3.0 21.6 v -7.2 c 0.0 -1.89 0.0 -2.835 0.368 -3.557 c 0.323 -0.635 0.84 -1.152 1.475 -1.475 C 5.565 9.0 6.51 9.0 8.4 9.0 h 1.2 c 1.89 0.0 2.835 0.0 3.557 0.368 c 0.635 0.323 1.152 0.84 1.475 1.475 Z")
        )
    }.build()
}
