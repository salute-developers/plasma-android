package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowDiagRightDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowDiagRightDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 13.5 C 7.224 13.5 7.0 13.276 7.0 13.0 s 0.224 -0.5 0.5 -0.5 h 4.293 L 2.646 3.354 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 c 0.196 -0.195 0.512 -0.195 0.708 0.0 l 9.146 9.147 V 7.5 C 12.5 7.224 12.724 7.0 13.0 7.0 s 0.5 0.224 0.5 0.5 v 5.4 c 0.0 0.331 -0.269 0.6 -0.6 0.6 H 7.5 Z")
        )
    }.build()
}
