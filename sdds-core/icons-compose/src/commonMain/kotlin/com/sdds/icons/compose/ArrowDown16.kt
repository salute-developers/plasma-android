package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.762 10.173 c -0.196 -0.195 -0.196 -0.511 0.0 -0.707 c 0.195 -0.195 0.512 -0.195 0.707 0.0 l 3.067 3.068 V 2.32 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 10.15 l 3.004 -3.004 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.707 l -3.818 3.819 c -0.235 0.234 -0.615 0.234 -0.849 0.0 l -3.818 -3.819 Z")
        )
    }.build()
}
