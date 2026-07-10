package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowDiagLeftDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowDiagLeftDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 13.5 C 8.776 13.5 9.0 13.276 9.0 13.0 s -0.224 -0.5 -0.5 -0.5 H 4.207 l 9.147 -9.146 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 c -0.196 -0.195 -0.512 -0.195 -0.708 0.0 L 3.5 11.793 V 7.5 C 3.5 7.224 3.276 7.0 3.0 7.0 S 2.5 7.224 2.5 7.5 v 5.4 c 0.0 0.331 0.269 0.6 0.6 0.6 h 5.4 Z")
        )
    }.build()
}
