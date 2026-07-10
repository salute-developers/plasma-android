package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.438 4.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 6.26 h -0.903 c -1.4 0.0 -2.535 1.144 -2.535 2.555 v 5.228 c 0.0 2.088 0.906 4.072 2.479 5.431 l 2.668 2.305 c 0.112 0.097 0.177 0.239 0.177 0.388 V 33.0 h 7.352 v -6.832 c 0.0 -0.149 0.065 -0.29 0.177 -0.388 l 2.668 -2.305 C 26.094 22.115 27.0 20.131 27.0 18.043 v -5.228 c 0.0 -1.411 -1.135 -2.555 -2.535 -2.555 h -0.9 V 4.0 c 0.0 -0.552 -0.449 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 6.26 h -7.128 V 4.0 Z")
        )
    }.build()
}
