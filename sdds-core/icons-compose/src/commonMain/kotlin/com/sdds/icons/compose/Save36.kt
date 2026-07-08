package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Save36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Save36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.5 9.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 9.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 31.5 h 18.0 c 2.485 0.0 4.5 -2.015 4.5 -4.5 V 11.743 c 0.0 -0.796 -0.316 -1.56 -0.879 -2.122 L 26.38 5.38 C 25.816 4.816 25.053 4.5 24.257 4.5 H 9.0 C 6.515 4.5 4.5 6.515 4.5 9.0 v 18.0 c 0.0 2.485 2.015 4.5 4.5 4.5 Z M 29.5 27.0 V 11.743 c 0.0 -0.266 -0.105 -0.52 -0.293 -0.707 l -4.242 -4.243 C 24.777 6.605 24.523 6.5 24.257 6.5 H 9.0 C 7.62 6.5 6.5 7.62 6.5 9.0 v 18.0 c 0.0 1.38 1.12 2.5 2.5 2.5 h 1.5 v -7.75 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 h 10.5 c 1.243 0.0 2.25 1.007 2.25 2.25 v 7.75 H 27.0 c 1.38 0.0 2.5 -1.12 2.5 -2.5 Z m -6.0 2.5 h -11.0 v -7.75 c 0.0 -0.138 0.112 -0.25 0.25 -0.25 h 10.5 c 0.138 0.0 0.25 0.112 0.25 0.25 v 7.75 Z")
        )
    }.build()
}
