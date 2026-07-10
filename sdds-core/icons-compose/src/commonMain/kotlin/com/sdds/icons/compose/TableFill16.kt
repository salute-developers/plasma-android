package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.25 1.75 h 2.0 v 3.5 h -3.5 v -2.0 c 0.0 -0.83 0.67 -1.5 1.5 -1.5 Z m 3.0 0.0 h 3.5 v 3.5 h -3.5 v -3.5 Z m 4.5 0.0 h 2.0 c 0.82 0.0 1.5 0.67 1.5 1.5 v 2.0 h -3.5 v -3.5 Z m -9.0 4.5 h 3.5 v 3.5 h -3.5 v -3.5 Z m 4.5 0.0 h 3.5 v 3.5 h -3.5 v -3.5 Z m 8.0 0.0 v 3.5 h -3.5 v -3.5 h 3.5 Z m -12.5 4.5 h 3.5 v 3.5 h -2.0 c -0.83 0.0 -1.5 -0.68 -1.5 -1.5 v -2.0 Z m 4.5 0.0 h 3.5 v 3.5 h -3.5 v -3.5 Z m 8.0 0.0 v 2.0 c 0.0 0.82 -0.68 1.5 -1.5 1.5 h -2.0 v -3.5 h 3.5 Z")
        )
    }.build()
}
