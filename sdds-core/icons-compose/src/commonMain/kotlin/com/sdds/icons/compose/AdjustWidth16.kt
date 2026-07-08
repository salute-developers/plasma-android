package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AdjustWidth16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AdjustWidth16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.6 7.969 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.831 l -1.079 -1.044 c -0.198 -0.192 -0.203 -0.509 -0.012 -0.707 c 0.192 -0.199 0.509 -0.204 0.707 -0.012 l 1.97 1.903 c 0.096 0.095 0.152 0.225 0.152 0.36 c 0.0 0.136 -0.056 0.266 -0.153 0.36 l -1.969 1.901 c -0.198 0.192 -0.515 0.187 -0.707 -0.011 c -0.168 -0.174 -0.184 -0.438 -0.052 -0.63 l 0.065 -0.077 l 1.08 -1.043 H 10.1 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.51 3.668 c 0.046 -0.228 0.248 -0.4 0.49 -0.4 c 0.241 0.0 0.443 0.172 0.49 0.4 l 0.01 0.1 v 8.4 c 0.0 0.277 -0.224 0.5 -0.5 0.5 s -0.5 -0.223 -0.5 -0.5 v -8.4 l 0.01 -0.1 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.332 7.97 c 0.0 -0.136 0.055 -0.266 0.152 -0.36 l 1.969 -1.904 C 3.65 5.514 3.968 5.52 4.16 5.718 C 4.35 5.916 4.346 6.233 4.148 6.425 l -1.08 1.044 H 5.9 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 3.068 l 1.079 1.043 l 0.065 0.077 c 0.132 0.192 0.116 0.456 -0.052 0.63 c -0.192 0.198 -0.509 0.203 -0.707 0.011 l -1.97 -1.9 C 1.388 8.234 1.333 8.104 1.333 7.97 Z")
        )
    }.build()
}
