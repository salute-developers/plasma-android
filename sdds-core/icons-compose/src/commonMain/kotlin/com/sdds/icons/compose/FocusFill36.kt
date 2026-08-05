package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FocusFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FocusFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.25 18.0 c 0.0 -7.042 5.708 -12.75 12.75 -12.75 S 30.75 10.958 30.75 18.0 S 25.042 30.75 18.0 30.75 S 5.25 25.042 5.25 18.0 Z M 18.0 3.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 Z m 10.5 15.0 c 0.0 5.799 -4.701 10.5 -10.5 10.5 S 7.5 23.799 7.5 18.0 S 12.201 7.5 18.0 7.5 S 28.5 12.201 28.5 18.0 Z m -6.0 0.0 c 0.0 2.485 -2.015 4.5 -4.5 4.5 s -4.5 -2.015 -4.5 -4.5 s 2.015 -4.5 4.5 -4.5 s 4.5 2.015 4.5 4.5 Z")
        )
    }.build()
}
