package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SettingsFilter36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SettingsFilter36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.88 14.5 c 1.382 0.0 2.5 -1.12 2.5 -2.5 s -1.118 -2.5 -2.5 -2.5 c -1.38 0.0 -2.5 1.12 -2.5 2.5 s 1.12 2.5 2.5 2.5 Z m 0.0 2.0 c 2.142 0.0 3.935 -1.496 4.39 -3.5 h 3.11 c 0.553 0.0 1.0 -0.448 1.0 -1.0 s -0.447 -1.0 -1.0 -1.0 h -3.11 l 0.016 0.075 C 27.859 9.034 26.049 7.5 23.88 7.5 c -2.142 0.0 -3.934 1.496 -4.389 3.5 H 4.381 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 15.111 c 0.455 2.004 2.247 3.5 4.389 3.5 Z m -11.75 10.0 c -1.38 0.0 -2.5 -1.12 -2.5 -2.5 s 1.12 -2.5 2.5 -2.5 c 1.382 0.0 2.5 1.12 2.5 2.5 s -1.118 2.5 -2.5 2.5 Z m 0.0 2.0 c -2.14 0.0 -3.933 -1.496 -4.388 -3.5 H 4.631 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 3.111 l -0.02 0.093 c 0.42 -2.05 2.234 -3.593 4.409 -3.593 c 2.141 0.0 3.934 1.496 4.388 3.5 h 15.112 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 16.519 c -0.454 2.004 -2.247 3.5 -4.388 3.5 Z")
        )
    }.build()
}
