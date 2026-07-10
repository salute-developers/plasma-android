package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RandFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RandFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.235 11.697 H 10.75 V 8.75 h 1.527 c 0.813 0.0 1.473 0.66 1.473 1.473 c 0.0 0.814 -0.66 1.474 -1.473 1.474 h -0.014 h -0.028 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z M 10.0 7.25 C 9.586 7.25 9.25 7.586 9.25 8.0 v 8.4 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -3.203 h 1.064 l 2.034 3.574 c 0.205 0.36 0.663 0.486 1.023 0.28 c 0.36 -0.204 0.486 -0.662 0.28 -1.022 l -1.739 -3.056 c 1.079 -0.447 1.838 -1.51 1.838 -2.75 c 0.0 -1.642 -1.331 -2.973 -2.973 -2.973 H 10.0 Z")
        )
    }.build()
}
