package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.0 19.052 c 1.657 0.0 3.0 1.343 3.0 3.0 v 2.85 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 6.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -2.85 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 24.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.0 8.102 c 1.657 0.0 3.0 1.343 3.0 3.0 v 2.85 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 6.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -2.85 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 24.0 Z")
        )
    }.build()
}
