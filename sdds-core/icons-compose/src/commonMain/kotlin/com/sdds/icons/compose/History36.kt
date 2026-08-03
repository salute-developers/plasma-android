package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.History36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "History36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.0 18.0 c 0.0 -7.18 -5.82 -13.0 -13.0 -13.0 c -4.833 0.0 -9.053 2.638 -11.293 6.556 h 2.737 c 0.553 0.0 1.0 0.447 1.0 1.0 c 0.0 0.552 -0.447 1.0 -1.0 1.0 H 4.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 V 7.11 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 3.401 C 7.591 6.023 12.442 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -6.217 0.0 -11.548 -3.782 -13.823 -9.166 c -0.215 -0.51 0.023 -1.096 0.532 -1.31 c 0.509 -0.216 1.095 0.023 1.31 0.531 C 7.992 27.725 12.615 31.0 18.0 31.0 c 7.18 0.0 13.0 -5.82 13.0 -13.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.75 13.0 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 s -1.25 0.56 -1.25 1.25 v 7.539 c 0.0 0.466 0.245 0.899 0.645 1.14 l 3.754 2.251 c 0.592 0.355 1.36 0.163 1.715 -0.428 c 0.355 -0.592 0.163 -1.36 -0.43 -1.715 l -3.184 -1.911 V 13.0 Z")
        )
    }.build()
}
