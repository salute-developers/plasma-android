package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AdjustHeight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AdjustHeight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 9.569 c 0.276 0.0 0.5 0.224 0.5 0.5 v 2.83 l 1.044 -1.078 c 0.192 -0.198 0.508 -0.204 0.707 -0.012 c 0.199 0.192 0.204 0.509 0.012 0.707 l -1.904 1.969 C 8.265 14.582 8.134 14.637 8.0 14.637 c -0.135 0.0 -0.265 -0.055 -0.36 -0.152 l -1.9 -1.969 c -0.192 -0.198 -0.187 -0.515 0.011 -0.707 c 0.174 -0.168 0.438 -0.184 0.63 -0.053 l 0.077 0.066 L 7.5 12.9 v -2.832 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.3 7.478 c 0.228 0.047 0.4 0.249 0.4 0.49 c 0.0 0.242 -0.171 0.444 -0.4 0.49 l -0.1 0.01 H 3.8 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 8.4 l 0.1 0.01 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.999 1.3 c 0.136 0.0 0.266 0.055 0.36 0.153 l 1.904 1.968 c 0.192 0.199 0.187 0.515 -0.012 0.707 c -0.198 0.192 -0.515 0.187 -0.707 -0.011 L 8.5 3.037 V 5.87 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 3.037 L 6.457 4.116 L 6.38 4.18 C 6.188 4.313 5.924 4.296 5.75 4.128 C 5.552 3.937 5.547 3.62 5.738 3.421 L 7.64 1.453 C 7.734 1.355 7.864 1.3 7.999 1.3 Z")
        )
    }.build()
}
