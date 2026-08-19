package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAddOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAddOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.213 3.388 c 4.639 0.0 8.4 3.761 8.4 8.4 c -0.001 4.639 -3.761 8.4 -8.4 8.4 c -0.998 0.0 -1.957 -0.175 -2.847 -0.496 c -0.512 -0.184 -1.005 -0.233 -1.431 -0.114 L 5.432 20.28 c -1.042 0.292 -2.003 -0.668 -1.711 -1.71 l 0.7 -2.503 c 0.12 -0.426 0.071 -0.919 -0.113 -1.431 c -0.32 -0.89 -0.495 -1.85 -0.496 -2.847 c 0.0 -4.64 3.762 -8.4 8.4 -8.4 Z m 0.0 1.5 c -3.81 0.0 -6.9 3.09 -6.9 6.9 c 0.0 0.822 0.143 1.609 0.406 2.338 c 0.253 0.702 0.376 1.527 0.147 2.345 L 5.22 18.78 l 2.311 -0.647 c 0.818 -0.229 1.642 -0.106 2.344 0.147 c 0.73 0.263 1.517 0.407 2.339 0.407 c 3.81 0.0 6.899 -3.09 6.9 -6.9 c 0.0 -3.81 -3.09 -6.9 -6.9 -6.9 Z M 12.2 7.55 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.75 h 2.75 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -2.75 v 2.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -2.75 H 8.7 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 2.75 V 8.3 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
