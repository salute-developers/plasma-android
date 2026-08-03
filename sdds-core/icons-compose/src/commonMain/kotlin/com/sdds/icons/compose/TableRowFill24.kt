package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 12.7 c 1.105 0.0 2.0 0.896 2.0 2.0 v 1.9 c 0.0 1.104 -0.895 2.0 -2.0 2.0 H 4.0 c -1.105 0.0 -2.0 -0.896 -2.0 -2.0 v -1.9 c 0.0 -1.104 0.895 -2.0 2.0 -2.0 h 16.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 5.4 c 1.105 0.0 2.0 0.896 2.0 2.0 v 1.9 c 0.0 1.104 -0.895 2.0 -2.0 2.0 H 4.0 c -1.105 0.0 -2.0 -0.896 -2.0 -2.0 V 7.4 c 0.0 -1.104 0.895 -2.0 2.0 -2.0 h 16.0 Z")
        )
    }.build()
}
