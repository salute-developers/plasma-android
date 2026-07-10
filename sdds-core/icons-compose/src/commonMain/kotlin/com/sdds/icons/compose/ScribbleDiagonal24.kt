package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScribbleDiagonal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScribbleDiagonal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.54 12.54 C 4.487 11.268 10.33 4.792 13.8 3.29 c 2.398 -1.033 3.88 0.886 3.486 2.575 c -0.49 2.099 -1.62 4.042 -3.322 6.591 c -1.17 1.747 -2.406 3.649 -2.962 4.748 c -0.548 1.082 0.057 0.82 0.614 0.369 c 1.244 -1.017 3.453 -2.993 4.116 -3.518 c 1.145 -0.91 3.003 -1.877 4.026 -0.983 c 1.023 0.893 0.344 2.402 -0.27 3.607 s -1.874 3.116 -1.571 3.353 c 0.302 0.238 1.857 -0.738 2.307 -1.344 c 0.41 -0.541 1.023 -0.09 0.671 0.434 c -0.27 0.402 -2.39 2.64 -3.731 1.607 c -1.072 -0.828 0.564 -3.247 1.064 -4.206 c 0.499 -0.96 1.014 -2.025 0.711 -2.37 c -0.286 -0.327 -1.595 0.37 -2.675 1.485 c -0.802 0.828 -3.069 3.025 -4.075 3.804 c -2.308 1.77 -4.37 0.057 -3.225 -2.616 c 0.884 -2.057 2.005 -3.861 2.88 -5.255 c 0.958 -1.525 2.178 -3.583 2.75 -5.091 c 0.123 -0.312 -0.18 -0.558 -0.466 -0.361 c -1.154 0.82 -3.47 3.32 -4.427 4.46 c -1.195 1.427 -2.889 3.657 -3.519 4.378 c -0.63 0.722 -1.825 0.861 -2.602 0.123 c -0.851 -0.82 -0.68 -1.68 -0.04 -2.541 Z")
        )
    }.build()
}
