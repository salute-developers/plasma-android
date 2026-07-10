package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BoardingPassFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BoardingPassFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.0 5.5 H 5.6 c -1.26 0.0 -1.89 0.0 -2.371 0.245 C 2.805 5.961 2.46 6.305 2.245 6.73 C 2.0 7.209 2.0 7.839 2.0 9.1 v 5.8 c 0.0 1.26 0.0 1.89 0.245 2.371 c 0.216 0.424 0.56 0.768 0.984 0.984 C 3.709 18.5 4.339 18.5 5.6 18.5 H 17.0 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 c 0.687 0.0 1.244 0.554 1.25 1.24 c 0.578 -0.02 0.956 -0.075 1.271 -0.235 c 0.424 -0.216 0.768 -0.56 0.984 -0.983 C 22.0 16.79 22.0 16.16 22.0 14.9 V 9.1 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 c -0.316 -0.16 -0.694 -0.216 -1.272 -0.235 c -0.006 0.686 -0.563 1.24 -1.25 1.24 C 17.56 6.75 17.0 6.19 17.0 5.5 Z M 5.75 9.75 C 5.336 9.75 5.0 10.086 5.0 10.5 s 0.336 0.75 0.75 0.75 h 7.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -7.0 Z m 0.0 3.0 C 5.336 12.75 5.0 13.086 5.0 13.5 s 0.336 0.75 0.75 0.75 h 5.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -5.0 Z m 13.75 -4.0 c 0.0 0.69 -0.56 1.25 -1.25 1.25 S 17.0 9.44 17.0 8.75 s 0.56 -1.25 1.25 -1.25 s 1.25 0.56 1.25 1.25 Z m -1.25 4.5 c 0.69 0.0 1.25 -0.56 1.25 -1.25 s -0.56 -1.25 -1.25 -1.25 S 17.0 11.31 17.0 12.0 s 0.56 1.25 1.25 1.25 Z m 1.25 2.0 c 0.0 0.69 -0.56 1.25 -1.25 1.25 S 17.0 15.94 17.0 15.25 S 17.56 14.0 18.25 14.0 s 1.25 0.56 1.25 1.25 Z")
        )
    }.build()
}
