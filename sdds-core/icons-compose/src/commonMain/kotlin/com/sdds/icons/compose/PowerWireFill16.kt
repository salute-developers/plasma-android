package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.145 1.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 2.883 h 0.391 c 0.67 0.0 1.214 0.542 1.214 1.213 v 2.428 c 0.0 0.979 -0.429 1.908 -1.173 2.544 L 9.824 11.64 C 9.777 11.68 9.75 11.738 9.75 11.8 V 15.0 h -3.5 v -3.2 c 0.0 -0.062 -0.027 -0.12 -0.074 -0.16 l -1.253 -1.072 C 4.179 9.932 3.75 9.003 3.75 8.024 V 5.596 c 0.0 -0.671 0.545 -1.213 1.214 -1.213 h 0.394 V 1.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 0.277 0.0 0.5 0.224 0.5 0.5 v 2.883 h 3.287 V 1.5 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
