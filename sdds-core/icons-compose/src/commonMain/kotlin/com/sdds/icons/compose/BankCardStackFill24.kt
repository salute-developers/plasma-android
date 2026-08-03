package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardStackFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardStackFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.0 16.4 V 9.0 c 0.0 -0.932 -0.638 -1.716 -1.5 -1.937 v 0.483 v 5.908 c 0.0 0.584 0.0 1.109 -0.036 1.546 c -0.038 0.468 -0.124 0.965 -0.373 1.452 c -0.36 0.706 -0.933 1.28 -1.639 1.64 c -0.487 0.248 -0.984 0.334 -1.452 0.372 c -0.437 0.036 -0.962 0.036 -1.546 0.036 H 5.546 H 5.063 C 5.285 19.361 6.068 20.0 7.0 20.0 h 11.4 c 1.26 0.0 1.89 0.0 2.372 -0.245 c 0.423 -0.216 0.767 -0.56 0.983 -0.984 C 22.0 18.291 22.0 17.661 22.0 16.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.97 14.878 c -0.031 0.375 -0.093 0.653 -0.215 0.893 c -0.216 0.424 -0.56 0.768 -0.983 0.984 C 17.29 17.0 16.66 17.0 15.4 17.0 H 5.6 c -1.26 0.0 -1.89 0.0 -2.371 -0.245 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 C 2.0 15.29 2.0 14.66 2.0 13.4 V 7.6 c 0.0 -1.26 0.0 -1.89 0.245 -2.371 c 0.216 -0.424 0.56 -0.768 0.984 -0.984 C 3.709 4.0 4.339 4.0 5.6 4.0 h 9.8 c 1.26 0.0 1.89 0.0 2.371 0.245 c 0.424 0.216 0.768 0.56 0.984 0.984 c 0.222 0.437 0.243 0.996 0.245 2.039 V 7.6 v 5.8 m -2.75 -5.65 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -10.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 5.086 7.0 5.5 7.0 h 10.0 c 0.414 0.0 0.75 0.336 0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.0 13.4 c 0.0 0.63 0.0 1.103 -0.03 1.478 L 19.0 13.4 Z")
        )
    }.build()
}
