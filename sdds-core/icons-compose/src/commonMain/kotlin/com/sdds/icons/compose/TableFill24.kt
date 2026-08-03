package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.5 3.05 H 8.0 v 5.0 H 3.0 v -2.5 c 0.0 -1.39 1.11 -2.5 2.5 -2.5 Z m 4.0 0.0 h 5.0 v 5.0 h -5.0 v -5.0 Z m 6.5 0.0 h 2.5 c 1.38 0.0 2.5 1.11 2.5 2.5 v 2.5 h -5.0 v -5.0 Z m -8.0 6.5 v 5.0 H 3.0 v -5.0 h 5.0 Z m 6.5 0.0 v 5.0 h -5.0 v -5.0 h 5.0 Z m 6.5 0.0 v 5.0 h -5.0 v -5.0 h 5.0 Z M 3.0 16.04 h 5.0 v 5.01 H 5.5 c -1.39 0.0 -2.5 -1.12 -2.5 -2.51 v -2.5 Z m 11.5 0.0 v 5.01 h -5.0 v -5.01 h 5.0 Z m 6.5 0.0 v 2.5 c 0.0 1.39 -1.12 2.51 -2.5 2.51 H 16.0 v -5.01 h 5.0 Z")
        )
    }.build()
}
