package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableColumnFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableColumnFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.95 3.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 24.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 11.1 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 6.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 2.85 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.9 3.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 24.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 h -2.85 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 6.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 2.85 Z")
        )
    }.build()
}
