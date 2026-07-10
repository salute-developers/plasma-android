package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.5 8.92 c 4.768 0.0 11.068 -3.976 12.29 -4.778 c 0.129 -0.085 0.291 -0.085 0.42 0.0 C 19.432 4.944 25.732 8.92 30.5 8.92 c 0.0 20.776 -12.017 23.0 -12.486 23.079 c -0.015 0.002 -0.013 0.002 -0.028 0.0 C 17.517 31.92 5.5 29.697 5.5 8.92 Z")
        )
    }.build()
}
