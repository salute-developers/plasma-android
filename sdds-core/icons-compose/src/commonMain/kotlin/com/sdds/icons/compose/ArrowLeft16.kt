package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.824 3.75 c 0.195 -0.194 0.512 -0.194 0.707 0.0 c 0.196 0.196 0.196 0.513 0.0 0.708 L 3.464 7.526 h 10.214 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 3.528 l 3.003 3.003 c 0.196 0.195 0.196 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 2.006 8.418 c -0.234 -0.234 -0.234 -0.614 0.0 -0.849 l 3.818 -3.818 Z")
        )
    }.build()
}
