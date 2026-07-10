package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashATMFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashATMFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.25 4.5 C 21.664 4.5 22.0 4.164 22.0 3.75 S 21.664 3.0 21.25 3.0 H 2.75 C 2.336 3.0 2.0 3.336 2.0 3.75 S 2.336 4.5 2.75 4.5 h 18.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 10.5 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 s 2.0 -0.895 2.0 -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 5.5 h 12.0 V 18.0 c 0.0 0.7 0.0 1.05 -0.136 1.317 c -0.12 0.236 -0.311 0.427 -0.547 0.547 C 17.05 20.0 16.7 20.0 16.0 20.0 H 8.0 c -0.7 0.0 -1.05 0.0 -1.317 -0.136 c -0.236 -0.12 -0.427 -0.311 -0.547 -0.547 C 6.0 19.05 6.0 18.7 6.0 18.0 V 5.5 Z M 12.0 7.0 c 1.933 0.0 3.5 1.567 3.5 3.5 S 13.933 14.0 12.0 14.0 s -3.5 -1.567 -3.5 -3.5 S 10.067 7.0 12.0 7.0 Z m -1.0 8.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 10.586 17.0 11.0 17.0 h 2.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 13.414 15.5 13.0 15.5 h -2.0 Z")
        )
    }.build()
}
