package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PoundOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PoundOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.25 11.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 11.0 h 4.4 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 11.4 c -0.635 0.0 -1.15 -0.515 -1.15 -1.15 V 12.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.3 13.0 h -3.95 v 3.76 h 3.95 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -3.95 V 23.0 h 4.4 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 19.5 c -0.635 0.0 -1.15 -0.515 -1.15 -1.15 V 12.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 4.95 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 18.0 C 3.0 9.714 9.715 3.0 18.0 3.0 c 8.283 0.0 14.999 6.715 14.999 15.0 c 0.0 8.283 -6.716 14.999 -15.0 14.999 c -8.284 0.0 -14.999 -6.716 -14.999 -15.0 Z M 18.0 5.0 C 10.82 5.0 5.0 10.82 5.0 18.0 c 0.0 7.179 5.82 12.999 13.0 12.999 c 7.179 0.0 12.999 -5.82 12.999 -13.0 c 0.0 -7.179 -5.82 -12.999 -13.0 -12.999 Z")
        )
    }.build()
}
