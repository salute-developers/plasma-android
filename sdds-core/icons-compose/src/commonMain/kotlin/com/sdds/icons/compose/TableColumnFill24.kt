package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableColumnFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableColumnFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.3 2.0 c 1.104 0.0 2.0 0.895 2.0 2.0 v 16.0 c 0.0 1.105 -0.896 2.0 -2.0 2.0 H 7.4 c -1.104 0.0 -2.0 -0.895 -2.0 -2.0 V 4.0 c 0.0 -1.105 0.896 -2.0 2.0 -2.0 h 1.9 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.6 2.0 c 1.104 0.0 2.0 0.895 2.0 2.0 v 16.0 c 0.0 1.105 -0.896 2.0 -2.0 2.0 h -1.9 c -1.104 0.0 -2.0 -0.895 -2.0 -2.0 V 4.0 c 0.0 -1.105 0.896 -2.0 2.0 -2.0 h 1.9 Z")
        )
    }.build()
}
