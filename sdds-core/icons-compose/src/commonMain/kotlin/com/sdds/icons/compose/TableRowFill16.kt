package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.6 8.5 c 0.773 0.0 1.4 0.627 1.4 1.4 v 1.2 c 0.0 0.773 -0.627 1.4 -1.4 1.4 H 2.4 c -0.773 0.0 -1.4 -0.627 -1.4 -1.4 V 9.9 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 h 11.2 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.6 3.5 c 0.773 0.0 1.4 0.627 1.4 1.4 v 1.2 c 0.0 0.773 -0.627 1.4 -1.4 1.4 H 2.4 C 1.627 7.5 1.0 6.873 1.0 6.1 V 4.9 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 h 11.2 Z")
        )
    }.build()
}
