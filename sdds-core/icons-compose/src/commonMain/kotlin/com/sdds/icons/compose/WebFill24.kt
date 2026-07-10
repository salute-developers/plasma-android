package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WebFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WebFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 2.0 c 2.651 0.003 5.193 1.058 7.067 2.933 C 20.942 6.807 21.997 9.349 22.0 12.0 c 0.0 1.978 -0.587 3.911 -1.686 5.556 c -1.098 1.644 -2.66 2.926 -4.487 3.683 c -1.827 0.757 -3.838 0.954 -5.778 0.569 c -1.94 -0.386 -3.722 -1.338 -5.12 -2.737 c -1.399 -1.398 -2.35 -3.18 -2.737 -5.12 c -0.386 -1.94 -0.188 -3.95 0.569 -5.778 C 3.518 6.346 4.8 4.784 6.444 3.686 C 8.09 2.586 10.022 2.0 12.0 2.0 Z m 4.11 13.846 c -0.431 1.583 -1.16 3.07 -2.144 4.384 c 1.19 -0.286 2.303 -0.826 3.264 -1.582 c 0.963 -0.756 1.75 -1.712 2.309 -2.802 H 16.11 Z m -6.61 0.0 c 0.493 1.613 1.348 3.094 2.5 4.327 c 1.152 -1.233 2.007 -2.713 2.5 -4.327 h -5.0 Z M 9.125 9.692 c -0.264 1.527 -0.264 3.088 0.0 4.616 h 5.758 c 0.264 -1.527 0.264 -3.089 0.0 -4.616 H 9.125 Z m 7.313 0.0 c 0.236 1.53 0.236 3.086 0.0 4.616 h 3.704 c 0.213 -0.751 0.32 -1.528 0.32 -2.308 c 0.0 -0.78 -0.107 -1.557 -0.32 -2.308 h -3.704 Z M 12.0 3.827 C 10.848 5.06 9.993 6.54 9.5 8.154 h 5.0 C 14.007 6.541 13.152 5.06 12.0 3.827 Z m 1.963 -0.057 c 0.985 1.313 1.712 2.8 2.143 4.384 h 3.428 c -0.558 -1.09 -1.344 -2.046 -2.305 -2.802 c -0.962 -0.757 -2.076 -1.297 -3.266 -1.582 Z")
        )
    }.build()
}
