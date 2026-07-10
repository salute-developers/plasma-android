package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.974 12.444 c 0.018 0.121 0.027 0.245 0.027 0.37 v 5.229 c 0.0 2.088 -0.906 4.073 -2.48 5.432 l -2.668 2.304 c -0.112 0.097 -0.176 0.239 -0.176 0.388 v 6.832 h -7.353 v -6.832 c 0.0 -0.15 -0.064 -0.29 -0.177 -0.388 l -0.272 -0.235 l 13.1 -13.1 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.564 3.0 c 0.553 0.0 1.0 0.448 1.0 1.0 v 6.26 h 0.006 l 6.18 -6.18 c 0.391 -0.39 1.024 -0.39 1.415 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.709 30.95 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 6.613 -6.613 c -1.219 -1.317 -1.907 -3.06 -1.907 -4.88 v -5.228 c 0.0 -1.412 1.135 -2.555 2.535 -2.555 h 0.902 V 4.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 c 0.553 0.0 1.0 0.448 1.0 1.0 v 6.26 h 7.126 V 4.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
    }.build()
}
