package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.184 12.236 c -0.196 0.195 -0.512 0.195 -0.707 0.0 c -0.196 -0.195 -0.196 -0.512 0.0 -0.707 l 3.067 -3.067 H 2.33 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 10.15 L 9.477 4.458 c -0.196 -0.195 -0.196 -0.512 0.0 -0.707 c 0.195 -0.195 0.511 -0.195 0.707 0.0 l 3.818 3.818 c 0.234 0.235 0.234 0.615 0.0 0.849 l -3.818 3.818 Z")
        )
    }.build()
}
