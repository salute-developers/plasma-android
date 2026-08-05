package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VkAltFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VkAltFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.08 6.33 c 0.101 5.2 2.373 7.403 4.172 7.857 V 6.33 h 2.9 v 4.485 c 1.777 -0.193 3.643 -2.237 4.273 -4.485 h 2.9 c -0.483 2.77 -2.507 4.815 -3.946 5.655 c 1.439 0.682 3.744 2.464 4.621 5.689 h -3.193 c -0.686 -2.157 -2.395 -3.827 -4.655 -4.054 v 4.054 h -0.348 c -6.15 0.0 -9.658 -4.258 -9.804 -11.344 h 3.08 Z")
        )
    }.build()
}
