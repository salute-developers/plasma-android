package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Commit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Commit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFFEFEFE)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 4.5 c 1.763 0.0 3.221 1.304 3.464 3.0 H 15.0 v 1.0 h -3.536 c -0.243 1.696 -1.7 3.0 -3.464 3.0 c -1.763 0.0 -3.221 -1.304 -3.464 -3.0 H 1.0 v -1.0 h 3.536 c 0.243 -1.696 1.7 -3.0 3.464 -3.0 Z m 0.0 1.0 C 6.62 5.5 5.5 6.62 5.5 8.0 s 1.12 2.5 2.5 2.5 s 2.5 -1.12 2.5 -2.5 S 9.38 5.5 8.0 5.5 Z")
        )
    }.build()
}
