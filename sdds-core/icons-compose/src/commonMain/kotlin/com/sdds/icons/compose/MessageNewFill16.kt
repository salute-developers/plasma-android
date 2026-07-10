package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageNewFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageNewFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.152 7.948 c 0.0 -3.257 2.64 -5.898 5.898 -5.898 c 1.021 0.0 1.982 0.26 2.82 0.716 C 9.94 3.207 9.3 4.154 9.3 5.25 C 9.3 6.769 10.53 8.0 12.05 8.0 c 0.717 0.0 1.371 -0.275 1.86 -0.725 c 0.026 0.22 0.039 0.446 0.039 0.673 c 0.0 3.258 -2.641 5.899 -5.899 5.899 c -0.7 0.0 -1.374 -0.122 -1.999 -0.348 c -0.375 -0.135 -0.743 -0.174 -1.067 -0.083 l -1.782 0.5 c -0.681 0.19 -1.31 -0.438 -1.119 -1.12 l 0.5 -1.781 c 0.09 -0.324 0.051 -0.693 -0.084 -1.068 C 2.274 9.323 2.152 8.65 2.152 7.948 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.137 7.035 c 1.015 0.0 1.838 -0.823 1.838 -1.838 c 0.0 -1.014 -0.823 -1.837 -1.838 -1.837 c -1.014 0.0 -1.837 0.823 -1.837 1.837 c 0.0 1.015 0.822 1.838 1.837 1.838 Z")
        )
    }.build()
}
