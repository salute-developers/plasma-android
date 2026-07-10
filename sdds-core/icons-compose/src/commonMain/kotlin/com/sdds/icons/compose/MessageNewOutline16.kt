package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageNewOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageNewOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.149 2.975 c -2.693 0.0 -4.876 2.183 -4.876 4.876 c 0.0 0.582 0.102 1.138 0.288 1.654 c 0.176 0.49 0.261 1.06 0.103 1.626 l -0.468 1.673 l 1.672 -0.468 c 0.566 -0.159 1.138 -0.074 1.626 0.103 c 0.516 0.186 1.073 0.287 1.655 0.287 c 2.693 0.0 4.876 -2.183 4.876 -4.875 V 7.822 c 0.364 -0.138 0.692 -0.352 0.964 -0.622 c 0.023 0.214 0.036 0.43 0.036 0.65 c 0.0 3.246 -2.631 5.876 -5.876 5.876 c -0.7 0.0 -1.37 -0.122 -1.994 -0.347 c -0.362 -0.13 -0.712 -0.166 -1.017 -0.08 l -1.765 0.494 c -0.71 0.199 -1.365 -0.456 -1.166 -1.167 l 0.494 -1.764 c 0.085 -0.305 0.05 -0.655 -0.08 -1.017 C 2.395 9.222 2.272 8.55 2.272 7.85 c 0.0 -3.245 2.63 -5.876 5.876 -5.876 c 1.033 0.0 2.003 0.267 2.847 0.734 c -0.36 0.15 -0.68 0.373 -0.944 0.651 c -0.585 -0.248 -1.228 -0.385 -1.903 -0.385 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.137 7.035 c 1.015 0.0 1.838 -0.823 1.838 -1.838 c 0.0 -1.014 -0.823 -1.837 -1.838 -1.837 c -1.014 0.0 -1.837 0.823 -1.837 1.837 c 0.0 1.015 0.822 1.838 1.837 1.838 Z")
        )
    }.build()
}
