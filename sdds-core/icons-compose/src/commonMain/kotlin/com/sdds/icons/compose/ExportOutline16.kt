package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ExportOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ExportOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.55 10.15 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.75 c 0.0 1.436 -1.164 2.6 -2.6 2.6 h -9.1 c -1.436 0.0 -2.6 -1.165 -2.6 -2.6 v -1.75 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 1.75 c 0.0 0.883 0.716 1.6 1.6 1.6 h 9.1 c 0.884 0.0 1.6 -0.717 1.6 -1.6 v -1.75 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.58 1.995 c 0.234 -0.234 0.614 -0.234 0.849 0.0 l 2.818 2.819 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 8.536 3.518 v 8.15 c 0.0 0.275 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 3.452 L 5.47 5.521 c -0.196 0.195 -0.512 0.195 -0.707 0.0 c -0.196 -0.195 -0.196 -0.512 0.0 -0.707 L 7.58 1.995 Z")
        )
    }.build()
}
