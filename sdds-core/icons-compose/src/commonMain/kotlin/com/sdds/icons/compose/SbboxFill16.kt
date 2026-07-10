package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.356 1.356 c -0.068 -0.068 -0.179 -0.068 -0.247 0.0 L 11.995 2.47 C 11.758 2.707 11.727 3.07 11.9 3.342 L 9.166 6.077 c -0.354 -0.349 -0.578 -0.55 -0.808 -0.683 c -0.813 -0.47 -1.813 -0.47 -2.625 0.0 c -0.3 0.173 -0.587 0.46 -1.163 1.036 L 2.838 8.162 C 2.262 8.737 1.975 9.025 1.802 9.324 c -0.469 0.813 -0.469 1.813 0.0 2.625 c 0.173 0.3 0.46 0.587 1.036 1.163 C 3.413 13.687 3.7 13.975 4.0 14.148 c 0.812 0.469 1.813 0.469 2.625 0.0 c 0.3 -0.173 0.587 -0.46 1.163 -1.036 l 1.732 -1.733 c 0.575 -0.575 0.863 -0.863 1.036 -1.162 c 0.469 -0.812 0.469 -1.813 0.0 -2.625 c -0.133 -0.23 -0.335 -0.454 -0.683 -0.808 l 2.734 -2.735 c 0.271 0.174 0.636 0.143 0.873 -0.094 l 1.114 -1.114 c 0.068 -0.068 0.068 -0.18 0.0 -0.248 l -1.238 -1.237 Z")
        )
    }.build()
}
