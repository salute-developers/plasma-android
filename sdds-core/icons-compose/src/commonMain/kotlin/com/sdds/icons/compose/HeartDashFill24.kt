package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.44 2.47 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.294 0.293 0.294 0.767 0.0 1.06 L 3.53 20.5 c -0.293 0.294 -0.767 0.294 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 3.847 -3.848 C 4.42 13.533 3.0 11.22 3.0 8.819 C 3.0 6.648 4.887 4.0 7.963 4.0 c 1.718 0.0 3.186 1.349 4.287 2.63 c 1.101 -1.28 2.568 -2.629 4.286 -2.63 c 0.432 0.0 0.84 0.056 1.223 0.151 l 1.681 -1.68 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.35 5.802 c 0.743 0.9 1.15 2.01 1.15 3.017 c 0.0 3.866 -3.674 7.504 -7.108 10.217 c -0.718 0.567 -1.077 0.85 -1.53 0.975 c -0.376 0.102 -0.848 0.102 -1.223 0.0 c -0.454 -0.125 -0.813 -0.408 -1.53 -0.975 c -0.545 -0.43 -1.095 -0.883 -1.635 -1.356 L 20.35 5.802 Z")
        )
    }.build()
}
