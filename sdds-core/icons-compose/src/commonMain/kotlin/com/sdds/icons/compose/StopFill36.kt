package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StopFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StopFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.5 11.5 c 0.0 -2.1 0.0 -3.15 0.409 -3.952 c 0.36 -0.706 0.933 -1.28 1.639 -1.64 C 8.35 5.5 9.4 5.5 11.5 5.5 h 13.0 c 2.1 0.0 3.15 0.0 3.953 0.409 c 0.705 0.36 1.279 0.933 1.638 1.639 C 30.5 8.35 30.5 9.4 30.5 11.5 v 13.0 c 0.0 2.1 0.0 3.15 -0.409 3.953 c -0.36 0.705 -0.933 1.279 -1.639 1.638 C 27.65 30.5 26.6 30.5 24.5 30.5 h -13.0 c -2.1 0.0 -3.15 0.0 -3.952 -0.409 c -0.706 -0.36 -1.28 -0.933 -1.64 -1.639 C 5.5 27.65 5.5 26.6 5.5 24.5 v -13.0 Z")
        )
    }.build()
}
