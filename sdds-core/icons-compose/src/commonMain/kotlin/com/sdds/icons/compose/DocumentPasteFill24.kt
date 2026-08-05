package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentPasteFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentPasteFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.25 1.25 c 0.631 0.0 1.193 0.293 1.56 0.75 H 16.0 c 1.4 0.0 2.1 0.0 2.635 0.272 c 0.47 0.24 0.853 0.623 1.092 1.093 C 20.0 3.9 20.0 4.6 20.0 6.0 v 12.0 c 0.0 1.4 0.0 2.1 -0.273 2.635 c -0.24 0.47 -0.622 0.853 -1.092 1.092 C 18.1 22.0 17.4 22.0 16.0 22.0 H 8.0 c -1.4 0.0 -2.1 0.0 -2.635 -0.273 c -0.47 -0.24 -0.853 -0.622 -1.093 -1.092 C 4.0 20.1 4.0 19.4 4.0 18.0 V 6.0 c 0.0 -1.4 0.0 -2.1 0.272 -2.635 c 0.24 -0.47 0.623 -0.853 1.093 -1.093 C 5.9 2.0 6.6 2.0 8.0 2.0 h 0.69 c 0.367 -0.457 0.929 -0.75 1.56 -0.75 h 4.0 Z M 8.0 9.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.586 10.75 8.0 10.75 h 4.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 12.414 9.25 12.0 9.25 H 8.0 Z M 8.0 6.0 C 7.586 6.0 7.25 6.336 7.25 6.75 S 7.586 7.5 8.0 7.5 h 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 16.414 6.0 16.0 6.0 H 8.0 Z m 2.25 -3.25 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 4.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -4.0 Z")
        )
    }.build()
}
