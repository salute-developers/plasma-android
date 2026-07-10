package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeadphonesOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeadphonesOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.875 5.0 C 10.765 5.0 5.0 10.764 5.0 17.875 v 1.752 c 0.776 -0.552 1.725 -0.877 2.75 -0.877 c 2.623 0.0 4.75 2.127 4.75 4.75 V 28.0 c 0.0 2.623 -2.127 4.75 -4.75 4.75 S 3.0 30.623 3.0 28.0 V 17.875 C 3.0 9.66 9.66 3.0 17.875 3.0 S 32.75 9.66 32.75 17.875 V 28.0 c 0.0 2.623 -2.127 4.75 -4.75 4.75 s -4.75 -2.127 -4.75 -4.75 v -4.5 c 0.0 -2.623 2.127 -4.75 4.75 -4.75 c 1.025 0.0 1.974 0.325 2.75 0.877 v -1.752 C 30.75 10.765 24.986 5.0 17.875 5.0 Z M 30.75 23.5 c 0.0 -1.519 -1.231 -2.75 -2.75 -2.75 s -2.75 1.231 -2.75 2.75 V 28.0 c 0.0 1.519 1.231 2.75 2.75 2.75 s 2.75 -1.231 2.75 -2.75 v -4.5 Z M 5.0 23.5 c 0.0 -1.519 1.231 -2.75 2.75 -2.75 s 2.75 1.231 2.75 2.75 V 28.0 c 0.0 1.519 -1.231 2.75 -2.75 2.75 S 5.0 29.519 5.0 28.0 v -4.5 Z")
        )
    }.build()
}
