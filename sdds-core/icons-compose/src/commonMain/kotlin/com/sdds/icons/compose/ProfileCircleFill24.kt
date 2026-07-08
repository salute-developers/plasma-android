package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileCircleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileCircleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 3.5 -12.0 c 0.0 1.933 -1.567 3.5 -3.5 3.5 S 8.5 11.933 8.5 10.0 s 1.567 -3.5 3.5 -3.5 s 3.5 1.567 3.5 3.5 Z m 2.945 7.542 C 17.026 15.968 14.625 15.0 12.0 15.0 c -2.625 0.0 -5.026 0.968 -6.445 2.542 C 7.114 19.353 9.423 20.5 12.0 20.5 c 2.577 0.0 4.886 -1.147 6.445 -2.958 Z")
        )
    }.build()
}
