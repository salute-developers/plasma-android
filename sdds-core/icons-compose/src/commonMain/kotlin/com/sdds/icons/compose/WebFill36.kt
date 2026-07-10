package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WebFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WebFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 3.0 c 3.977 0.005 7.79 1.586 10.602 4.398 C 31.414 10.211 32.996 14.023 33.0 18.0 c 0.0 2.967 -0.879 5.867 -2.527 8.334 c -1.648 2.467 -3.992 4.39 -6.733 5.524 c -2.74 1.136 -5.756 1.433 -8.666 0.854 c -2.91 -0.579 -5.583 -2.008 -7.68 -4.106 c -2.098 -2.097 -3.527 -4.77 -4.106 -7.68 c -0.579 -2.909 -0.282 -5.925 0.854 -8.666 C 5.277 9.519 7.2 7.177 9.667 5.528 C 12.134 3.88 15.034 3.0 18.0 3.0 Z m 6.166 20.77 c -0.647 2.374 -1.739 4.605 -3.216 6.574 c 1.784 -0.429 3.455 -1.236 4.897 -2.37 c 1.444 -1.136 2.625 -2.57 3.463 -4.204 h -5.144 Z m -9.916 0.0 c 0.74 2.42 2.022 4.64 3.75 6.49 c 1.729 -1.85 3.011 -4.07 3.75 -6.49 h -7.5 Z m -0.562 -9.232 c -0.397 2.29 -0.397 4.633 0.0 6.924 h 8.636 c 0.396 -2.29 0.396 -4.633 0.0 -6.924 h -8.636 Z m 10.97 0.0 c 0.354 2.294 0.354 4.63 0.0 6.924 h 5.554 c 0.32 -1.126 0.482 -2.291 0.48 -3.462 c 0.002 -1.17 -0.16 -2.336 -0.48 -3.462 h -5.554 Z M 18.0 5.74 c -1.728 1.85 -3.011 4.07 -3.75 6.49 h 7.5 C 21.01 9.81 19.728 7.59 18.0 5.74 Z m 2.945 -0.086 c 1.477 1.97 2.568 4.201 3.215 6.576 h 5.142 c -0.837 -1.633 -2.015 -3.068 -3.458 -4.203 c -1.443 -1.135 -3.114 -1.944 -4.9 -2.373 Z")
        )
    }.build()
}
