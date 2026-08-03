package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.5 17.0 V 9.0 c 0.0 -0.7 0.0 -1.05 -0.136 -1.318 c -0.12 -0.235 -0.311 -0.426 -0.547 -0.546 C 21.623 7.037 21.386 7.01 21.0 7.003 v 7.042 c 0.0 0.31 0.0 0.627 -0.022 0.898 c -0.025 0.301 -0.084 0.675 -0.278 1.055 c -0.263 0.518 -0.684 0.939 -1.201 1.202 c -0.38 0.194 -0.755 0.253 -1.056 0.278 c -0.27 0.022 -0.587 0.022 -0.898 0.022 H 4.5 c 0.004 0.336 0.02 0.538 0.086 0.707 c 0.127 0.323 0.382 0.58 0.706 0.706 C 5.513 19.0 5.79 19.0 6.346 19.0 H 20.5 c 0.7 0.0 1.05 0.0 1.317 -0.136 c 0.236 -0.12 0.427 -0.311 0.547 -0.547 C 22.5 18.05 22.5 17.7 22.5 17.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.5 8.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 s 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.442 15.097 c -0.019 0.082 -0.044 0.154 -0.078 0.22 c -0.12 0.236 -0.311 0.427 -0.547 0.547 C 18.55 16.0 18.2 16.0 17.5 16.0 h -14.0 c -0.7 0.0 -1.05 0.0 -1.317 -0.136 c -0.236 -0.12 -0.427 -0.311 -0.547 -0.546 C 1.5 15.05 1.5 14.7 1.5 14.0 V 6.0 c 0.0 -0.7 0.0 -1.05 0.136 -1.317 c 0.12 -0.236 0.311 -0.427 0.547 -0.547 C 2.45 4.0 2.8 4.0 3.5 4.0 h 14.0 c 0.7 0.0 1.05 0.0 1.317 0.136 c 0.236 0.12 0.427 0.311 0.547 0.547 C 19.5 4.95 19.5 5.3 19.5 6.0 v 8.0 c 0.0 0.525 0.0 0.853 -0.058 1.097 Z M 7.0 10.0 c 0.0 -1.933 1.567 -3.5 3.5 -3.5 S 14.0 8.067 14.0 10.0 s -1.567 3.5 -3.5 3.5 S 7.0 11.933 7.0 10.0 Z")
        )
    }.build()
}
