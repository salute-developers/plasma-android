package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashATMOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashATMOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.5 10.5 C 15.5 8.567 13.933 7.0 12.0 7.0 s -3.5 1.567 -3.5 3.5 S 10.067 14.0 12.0 14.0 s 3.5 -1.567 3.5 -3.5 Z m -3.5 -2.0 c 1.105 0.0 2.0 0.895 2.0 2.0 s -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 s 0.895 -2.0 2.0 -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.25 16.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 2.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 13.414 17.0 13.0 17.0 h -2.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.25 4.5 C 21.664 4.5 22.0 4.164 22.0 3.75 S 21.664 3.0 21.25 3.0 H 2.75 C 2.336 3.0 2.0 3.336 2.0 3.75 S 2.336 4.5 2.75 4.5 H 6.0 v 0.03 v 13.94 c 0.0 0.122 0.0 0.255 0.01 0.37 c 0.01 0.13 0.036 0.3 0.126 0.477 c 0.12 0.236 0.311 0.427 0.547 0.547 c 0.176 0.09 0.348 0.116 0.478 0.127 C 7.275 20.0 7.408 20.0 7.53 20.0 h 8.94 c 0.122 0.0 0.255 0.0 0.37 -0.01 c 0.13 -0.01 0.3 -0.036 0.477 -0.126 c 0.236 -0.12 0.427 -0.311 0.547 -0.547 c 0.09 -0.176 0.116 -0.348 0.127 -0.477 C 18.0 18.725 18.0 18.591 18.0 18.47 V 4.53 V 4.5 h 3.25 Z M 7.5 4.5 h 9.0 v 14.0 h -9.0 v -14.0 Z")
        )
    }.build()
}
