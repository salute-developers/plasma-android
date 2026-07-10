package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardLockFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardLockFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 13.0 c 0.005 -2.062 0.048 -3.174 0.49 -4.043 C 3.922 8.11 4.61 7.422 5.457 6.99 C 6.42 6.5 7.68 6.5 10.2 6.5 h 15.6 c 2.52 0.0 3.78 0.0 4.743 0.49 c 0.847 0.432 1.535 1.12 1.967 1.967 c 0.442 0.87 0.485 1.98 0.49 4.043 H 3.0 Z m 0.0 3.0 h 30.0 v 2.9 c -1.748 -1.496 -4.018 -2.4 -6.5 -2.4 c -5.523 0.0 -10.0 4.477 -10.0 10.0 c 0.0 1.045 0.16 2.053 0.458 3.0 H 10.2 c -2.52 0.0 -3.78 0.0 -4.743 -0.49 c -0.847 -0.432 -1.535 -1.12 -1.967 -1.967 C 3.0 26.08 3.0 24.82 3.0 22.3 V 16.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.5 21.0 c -1.104 0.0 -2.0 0.895 -2.0 2.0 v 2.0 h 4.0 v -2.0 c 0.0 -1.104 -0.895 -2.0 -2.0 -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 35.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 31.194 18.0 26.5 18.0 S 18.0 21.806 18.0 26.5 s 3.806 8.5 8.5 8.5 Z m 3.333 -11.8 v 1.6 c 0.92 0.0 1.667 0.716 1.667 1.6 v 4.0 c 0.0 0.884 -0.746 1.6 -1.667 1.6 h -6.666 c -0.92 0.0 -1.667 -0.716 -1.667 -1.6 v -4.0 c 0.0 -0.884 0.746 -1.6 1.667 -1.6 v -1.6 c 0.0 -1.767 1.492 -3.2 3.333 -3.2 c 1.84 0.0 3.333 1.433 3.333 3.2 Z")
        )
    }.build()
}
