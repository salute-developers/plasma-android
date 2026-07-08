package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VkAltFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VkAltFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.822 4.0 c 0.072 3.668 1.673 5.222 2.942 5.542 V 4.0 H 8.81 v 3.163 C 10.062 7.027 11.378 5.586 11.822 4.0 h 2.046 c -0.34 1.954 -1.768 3.396 -2.783 3.988 c 1.015 0.48 2.64 1.738 3.259 4.012 h -2.252 c -0.484 -1.521 -1.689 -2.698 -3.282 -2.858 V 12.0 H 8.563 c -4.336 0.0 -6.81 -3.003 -6.914 -8.0 h 2.173 Z")
        )
    }.build()
}
