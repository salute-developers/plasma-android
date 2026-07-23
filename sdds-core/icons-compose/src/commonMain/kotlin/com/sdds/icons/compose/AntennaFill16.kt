package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AntennaFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AntennaFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 5.52 c 0.0 0.979 -0.784 1.772 -1.75 1.772 S 1.0 6.499 1.0 5.52 C 1.0 4.543 1.784 3.75 2.75 3.75 S 4.5 4.543 4.5 5.52 Z m 2.625 4.96 c 0.0 0.978 -0.784 1.77 -1.75 1.77 s -1.75 -0.792 -1.75 -1.77 s 0.784 -1.771 1.75 -1.771 s 1.75 0.793 1.75 1.77 Z m 3.5 1.77 c 0.966 0.0 1.75 -0.792 1.75 -1.77 s -0.784 -1.771 -1.75 -1.771 s -1.75 0.793 -1.75 1.77 c 0.0 0.979 0.784 1.772 1.75 1.772 Z M 15.0 5.52 c 0.0 0.979 -0.784 1.772 -1.75 1.772 S 11.5 6.499 11.5 5.52 c 0.0 -0.978 0.784 -1.771 1.75 -1.771 S 15.0 4.543 15.0 5.52 Z M 8.0 7.293 c 0.966 0.0 1.75 -0.793 1.75 -1.771 C 9.75 4.543 8.966 3.75 8.0 3.75 S 6.25 4.543 6.25 5.52 C 6.25 6.5 7.034 7.293 8.0 7.293 Z")
        )
    }.build()
}
