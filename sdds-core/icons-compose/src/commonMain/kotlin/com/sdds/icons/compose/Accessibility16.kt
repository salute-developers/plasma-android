package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Accessibility16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Accessibility16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.277 4.111 c 0.322 -0.07 0.64 0.137 0.71 0.463 c 0.069 0.327 -0.137 0.648 -0.46 0.718 c -0.943 0.205 -1.82 0.365 -2.66 0.477 l -0.149 0.02 c -0.45 0.073 -0.581 0.248 -0.638 0.36 C 10.0 6.308 9.992 6.501 9.992 6.716 v 7.679 C 9.992 14.729 9.724 15.0 9.394 15.0 c -0.33 0.0 -0.597 -0.27 -0.597 -0.604 v -2.432 c 0.0 -0.74 -0.134 -1.127 -0.27 -1.316 C 8.42 10.498 8.272 10.417 8.0 10.417 c -0.27 0.0 -0.419 0.081 -0.527 0.231 c -0.135 0.189 -0.27 0.575 -0.27 1.316 v 2.431 C 7.203 14.73 6.936 15.0 6.606 15.0 c -0.33 0.0 -0.598 -0.27 -0.598 -0.604 v -7.68 C 6.008 6.502 6.0 6.309 5.92 6.149 c -0.056 -0.11 -0.188 -0.286 -0.637 -0.36 l -0.148 -0.02 c -0.841 -0.111 -1.718 -0.27 -2.662 -0.476 C 2.15 5.222 1.945 4.9 2.014 4.574 c 0.07 -0.326 0.387 -0.533 0.709 -0.463 c 0.917 0.2 1.759 0.352 2.559 0.458 c 0.057 0.006 0.113 0.014 0.168 0.023 c 1.76 0.222 3.34 0.222 5.101 0.0 c 0.055 -0.009 0.11 -0.017 0.168 -0.023 c 0.8 -0.106 1.641 -0.258 2.558 -0.458 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 1.0 C 8.866 1.0 9.568 1.71 9.57 2.586 c 0.0 0.876 -0.703 1.587 -1.569 1.587 S 6.432 3.462 6.432 2.586 S 7.134 1.0 8.0 1.0 Z")
        )
    }.build()
}
