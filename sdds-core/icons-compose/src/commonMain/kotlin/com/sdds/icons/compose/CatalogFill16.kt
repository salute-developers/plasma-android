package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CatalogFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CatalogFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 4.315 c 0.0 -0.679 0.495 -1.258 1.17 -1.37 l 5.6 -0.926 c 0.853 -0.14 1.63 0.512 1.63 1.37 v 9.222 c 0.0 0.858 -0.777 1.51 -1.63 1.37 l -5.6 -0.926 C 2.495 12.943 2.0 12.364 2.0 11.685 v -7.37 Z m 10.422 8.426 l 0.07 0.005 C 13.306 12.81 14.0 12.171 14.0 11.362 V 4.639 c 0.0 -0.81 -0.694 -1.447 -1.508 -1.385 l -0.07 0.005 c 0.113 0.2 0.177 0.43 0.177 0.677 v 8.129 c 0.0 0.246 -0.064 0.476 -0.177 0.676 Z m -1.72 0.709 l -0.176 -0.013 c 0.172 -0.23 0.275 -0.514 0.275 -0.827 V 3.39 c 0.0 -0.312 -0.103 -0.597 -0.274 -0.826 L 10.7 2.55 c 0.81 -0.058 1.5 0.579 1.5 1.385 v 8.128 c 0.0 0.806 -0.69 1.443 -1.5 1.386 Z")
        )
    }.build()
}
