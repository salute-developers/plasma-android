package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SearchFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SearchFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.516 9.809 C 11.132 9.039 11.5 8.063 11.5 7.0 c 0.0 -2.485 -2.015 -4.5 -4.5 -4.5 S 2.5 4.515 2.5 7.0 s 2.015 4.5 4.5 4.5 c 1.063 0.0 2.039 -0.368 2.809 -0.984 l 3.887 3.888 c 0.196 0.195 0.512 0.195 0.708 0.0 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 L 10.516 9.81 Z")
        )
    }.build()
}
