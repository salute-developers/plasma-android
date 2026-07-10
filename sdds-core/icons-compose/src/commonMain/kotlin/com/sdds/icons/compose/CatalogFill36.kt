package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CatalogFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CatalogFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 10.016 c 0.0 -1.47 1.06 -2.726 2.507 -2.968 l 12.0 -2.006 C 21.335 4.736 23.0 6.15 23.0 8.01 v 19.98 c 0.0 1.86 -1.665 3.274 -3.493 2.968 l -12.0 -2.006 C 6.06 28.71 5.0 27.455 5.0 25.984 V 10.016 Z m 22.623 18.257 l 0.15 0.012 c 1.742 0.134 3.23 -1.248 3.23 -3.0 V 10.717 c 0.0 -1.753 -1.488 -3.135 -3.23 -3.0 l -0.15 0.01 c 0.241 0.434 0.38 0.934 0.38 1.468 v 17.61 c 0.0 0.535 -0.139 1.034 -0.38 1.467 Z m -3.837 1.536 l -0.376 -0.027 C 23.78 29.285 24.0 28.666 24.0 27.99 V 8.01 c 0.0 -0.675 -0.22 -1.292 -0.587 -1.79 l 0.373 -0.026 c 1.736 -0.124 3.213 1.255 3.213 3.002 v 17.611 c 0.0 1.747 -1.477 3.126 -3.213 3.002 Z")
        )
    }.build()
}
