package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardErrorFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardErrorFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 8.5 c 0.001 -1.483 0.02 -2.26 0.327 -2.862 c 0.288 -0.564 0.747 -1.023 1.311 -1.311 C 4.28 4.0 5.12 4.0 6.8 4.0 h 10.4 c 1.68 0.0 2.52 0.0 3.162 0.327 c 0.565 0.288 1.023 0.747 1.311 1.311 C 21.98 6.24 21.999 7.018 22.0 8.5 H 2.0 Z M 17.5 11.0 H 22.0 v 1.81 C 20.832 11.689 19.247 11.0 17.5 11.0 Z m -6.002 9.0 H 6.8 c -1.68 0.0 -2.52 0.0 -3.162 -0.327 c -0.564 -0.288 -1.023 -0.746 -1.311 -1.311 C 2.0 17.72 2.0 16.88 2.0 15.2 V 11.0 h 15.5 c -3.59 0.0 -6.5 2.91 -6.5 6.5 c 0.0 0.886 0.177 1.73 0.498 2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 23.0 c 3.038 0.0 5.5 -2.462 5.5 -5.5 S 20.538 12.0 17.5 12.0 S 12.0 14.462 12.0 17.5 s 2.462 5.5 5.5 5.5 Z m -1.768 -7.975 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 c -0.195 0.195 -0.195 0.512 0.0 0.707 l 1.768 1.768 l -1.768 1.768 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 l 1.768 -1.768 l 1.768 1.768 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 L 18.207 17.5 l 1.768 -1.768 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 L 17.5 16.793 l -1.768 -1.768 Z")
        )
    }.build()
}
