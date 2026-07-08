package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.325 12.909 l -0.17 0.47 l 0.17 -0.47 Z m -1.321 -0.092 l 0.134 0.482 l -0.134 -0.482 Z m -2.315 -0.056 l -0.481 -0.135 l 0.481 0.135 Z m 0.55 0.55 l 0.135 0.482 l -0.135 -0.482 Z m 9.786 -5.46 c 0.0 2.692 -2.183 4.875 -4.876 4.875 v 1.0 c 3.246 0.0 5.876 -2.63 5.876 -5.875 h -1.0 Z m -9.751 0.0 c 0.0 -2.693 2.183 -4.876 4.875 -4.876 v -1.0 c -3.245 0.0 -5.875 2.63 -5.875 5.876 h 1.0 Z m 4.875 -4.876 c 2.693 0.0 4.876 2.183 4.876 4.876 h 1.0 c 0.0 -3.245 -2.63 -5.876 -5.876 -5.876 v 1.0 Z m -5.447 7.887 l -0.494 1.764 l 0.962 0.27 l 0.495 -1.765 l -0.963 -0.27 Z m 0.86 -1.357 C 3.375 8.99 3.274 8.432 3.274 7.851 h -1.0 c 0.0 0.699 0.122 1.37 0.347 1.994 l 0.94 -0.34 Z m 4.587 3.221 c -0.581 0.0 -1.138 -0.101 -1.654 -0.288 l -0.34 0.941 c 0.624 0.225 1.295 0.347 1.994 0.347 v -1.0 Z m -4.775 1.067 l 1.764 -0.494 l -0.27 -0.963 l -1.764 0.494 l 0.27 0.963 Z m 3.12 -1.354 c -0.488 -0.177 -1.06 -0.262 -1.625 -0.104 l 0.27 0.963 c 0.304 -0.085 0.655 -0.05 1.016 0.081 l 0.34 -0.94 Z m -2.83 -1.308 c 0.159 -0.565 0.074 -1.137 -0.102 -1.626 L 2.62 9.845 c 0.13 0.361 0.166 0.712 0.08 1.017 l 0.964 0.27 Z m -1.456 1.495 c -0.2 0.71 0.455 1.366 1.166 1.167 l -0.27 -0.963 c 0.006 -0.002 0.018 -0.003 0.03 0.0 c 0.01 0.004 0.018 0.008 0.023 0.013 c 0.005 0.005 0.01 0.012 0.013 0.023 c 0.003 0.012 0.002 0.024 0.0 0.03 l -0.962 -0.27 Z")
        )
    }.build()
}
