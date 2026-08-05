package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowDiagRightUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowDiagRightUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 2.5 C 7.224 2.5 7.0 2.724 7.0 3.0 s 0.224 0.5 0.5 0.5 h 4.293 l -9.147 9.146 c -0.195 0.196 -0.195 0.512 0.0 0.707 c 0.196 0.196 0.512 0.196 0.708 0.0 L 12.5 4.207 V 8.5 C 12.5 8.776 12.724 9.0 13.0 9.0 s 0.5 -0.224 0.5 -0.5 V 3.1 c 0.0 -0.331 -0.269 -0.6 -0.6 -0.6 H 7.5 Z")
        )
    }.build()
}
