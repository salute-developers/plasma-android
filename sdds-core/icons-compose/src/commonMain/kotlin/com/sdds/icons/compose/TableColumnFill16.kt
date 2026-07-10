package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableColumnFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableColumnFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.1 1.0 c 0.773 0.0 1.4 0.627 1.4 1.4 v 11.2 c 0.0 0.773 -0.627 1.4 -1.4 1.4 H 4.9 c -0.773 0.0 -1.4 -0.627 -1.4 -1.4 V 2.4 C 3.5 1.627 4.127 1.0 4.9 1.0 h 1.2 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.1 1.0 c 0.773 0.0 1.4 0.627 1.4 1.4 v 11.2 c 0.0 0.773 -0.627 1.4 -1.4 1.4 H 9.9 c -0.773 0.0 -1.4 -0.627 -1.4 -1.4 V 2.4 C 8.5 1.627 9.127 1.0 9.9 1.0 h 1.2 Z")
        )
    }.build()
}
