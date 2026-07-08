package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.49 8.957 C 3.048 9.827 3.005 10.937 3.0 13.0 h 30.0 c -0.005 -2.062 -0.048 -3.174 -0.49 -4.043 c -0.432 -0.847 -1.12 -1.535 -1.967 -1.967 C 29.58 6.5 28.32 6.5 25.8 6.5 H 10.2 c -2.52 0.0 -3.78 0.0 -4.743 0.49 C 4.61 7.422 3.922 8.11 3.49 8.957 Z M 33.0 16.0 H 3.0 v 6.3 c 0.0 2.52 0.0 3.78 0.49 4.743 c 0.432 0.847 1.12 1.535 1.967 1.966 C 6.42 29.5 7.68 29.5 10.2 29.5 h 15.6 c 2.52 0.0 3.78 0.0 4.743 -0.49 c 0.847 -0.432 1.535 -1.12 1.967 -1.967 C 33.0 26.08 33.0 24.82 33.0 22.3 V 16.0 Z")
        )
    }.build()
}
