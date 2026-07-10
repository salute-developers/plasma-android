package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowDiagLeftUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowDiagLeftUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 2.5 C 8.776 2.5 9.0 2.724 9.0 3.0 S 8.776 3.5 8.5 3.5 H 4.207 l 9.147 9.146 c 0.195 0.196 0.195 0.512 0.0 0.707 c -0.196 0.196 -0.512 0.196 -0.708 0.0 L 3.5 4.207 V 8.5 C 3.5 8.776 3.276 9.0 3.0 9.0 S 2.5 8.776 2.5 8.5 V 3.1 c 0.0 -0.331 0.269 -0.6 0.6 -0.6 h 5.4 Z")
        )
    }.build()
}
