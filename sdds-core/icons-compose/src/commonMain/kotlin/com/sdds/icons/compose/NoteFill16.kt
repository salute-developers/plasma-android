package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NoteFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NoteFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.549 1.085 c 0.138 -0.093 0.313 -0.11 0.468 -0.048 l 4.518 1.842 C 13.12 3.117 13.5 3.684 13.5 4.314 v 2.983 c 0.0 0.166 -0.083 0.322 -0.22 0.415 c -0.139 0.093 -0.314 0.112 -0.468 0.049 L 8.328 5.933 v 6.108 C 8.328 13.666 7.032 15.0 5.414 15.0 S 2.5 13.666 2.5 12.04 c 0.0 -1.625 1.296 -2.959 2.914 -2.959 c 0.735 0.0 1.403 0.275 1.914 0.728 V 1.5 c 0.0 -0.166 0.083 -0.322 0.22 -0.415 Z")
        )
    }.build()
}
