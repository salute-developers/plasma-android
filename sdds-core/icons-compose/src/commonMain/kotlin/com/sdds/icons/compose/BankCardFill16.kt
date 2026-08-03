package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.266 3.877 C 1.064 4.28 1.016 4.777 1.004 5.6 h 13.992 c -0.011 -0.823 -0.06 -1.32 -0.262 -1.723 c -0.242 -0.48 -0.631 -0.87 -1.111 -1.11 C 13.093 2.5 12.4 2.5 11.017 2.5 H 4.983 c -1.384 0.0 -2.076 0.0 -2.606 0.266 c -0.48 0.242 -0.87 0.631 -1.11 1.111 Z M 15.0 7.1 H 1.0 v 2.4 c 0.0 1.4 0.0 2.1 0.272 2.635 c 0.24 0.47 0.623 0.853 1.093 1.092 C 2.9 13.5 3.6 13.5 5.0 13.5 h 6.8 c 1.12 0.0 1.68 0.0 2.108 -0.218 c 0.376 -0.192 0.682 -0.498 0.874 -0.874 C 15.0 11.98 15.0 11.42 15.0 10.3 V 7.1 Z")
        )
    }.build()
}
