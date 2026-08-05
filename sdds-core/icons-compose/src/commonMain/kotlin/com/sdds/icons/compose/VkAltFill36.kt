package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VkAltFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VkAltFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.121 9.492 c 0.152 7.801 3.559 11.106 6.257 11.787 V 9.492 h 4.35 v 6.728 c 2.665 -0.29 5.464 -3.355 6.409 -6.728 h 4.351 c -0.725 4.156 -3.761 7.222 -5.92 8.483 c 2.159 1.022 5.616 3.696 6.932 8.533 h -4.79 c -1.029 -3.236 -3.592 -5.74 -6.982 -6.08 v 6.08 h -0.522 C 9.981 26.508 4.72 20.12 4.5 9.492 h 4.621 Z")
        )
    }.build()
}
