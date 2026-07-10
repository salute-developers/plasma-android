package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileStackFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileStackFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.4 2.0 H 9.0 C 8.068 2.0 7.285 2.638 7.063 3.5 h 0.483 h 5.908 c 0.584 0.0 1.109 0.0 1.546 0.036 c 0.468 0.038 0.965 0.124 1.453 0.373 c 0.705 0.36 1.279 0.933 1.638 1.639 C 18.34 6.035 18.426 6.532 18.464 7.0 C 18.5 7.437 18.5 7.962 18.5 8.546 v 9.908 v 0.483 C 19.361 18.715 20.0 17.932 20.0 17.0 V 5.6 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 C 18.29 2.0 17.66 2.0 16.4 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.0 18.732 c -0.002 1.043 -0.023 1.602 -0.245 2.04 c -0.216 0.423 -0.56 0.767 -0.983 0.983 C 15.29 22.0 14.66 22.0 13.4 22.0 H 7.6 c -1.26 0.0 -1.89 0.0 -2.371 -0.245 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 C 4.0 20.29 4.0 19.66 4.0 18.4 V 8.6 c 0.0 -1.26 0.0 -1.89 0.245 -2.371 c 0.216 -0.424 0.56 -0.768 0.984 -0.984 C 5.666 5.023 6.225 5.002 7.268 5.0 H 7.6 h 5.8 c 1.26 0.0 1.89 0.0 2.371 0.245 c 0.424 0.216 0.768 0.56 0.984 0.984 C 17.0 6.709 17.0 7.339 17.0 8.6 v 9.8 v 0.332 Z M 7.0 9.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 5.5 C 13.664 8.75 14.0 9.086 14.0 9.5 s -0.336 0.75 -0.75 0.75 h -5.5 C 7.336 10.25 7.0 9.914 7.0 9.5 Z m 0.0 4.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 5.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -5.5 C 7.336 14.25 7.0 13.914 7.0 13.5 Z m 0.0 4.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 5.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -5.5 C 7.336 18.25 7.0 17.914 7.0 17.5 Z")
        )
    }.build()
}
