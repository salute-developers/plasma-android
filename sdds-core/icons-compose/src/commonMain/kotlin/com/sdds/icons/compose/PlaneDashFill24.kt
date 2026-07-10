package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.987 9.999 c 1.094 -0.033 2.0 0.845 2.0 1.94 c 0.0 1.094 -0.905 1.972 -2.0 1.939 l -4.051 -0.122 l -3.43 6.456 c -0.32 0.601 -0.945 0.976 -1.626 0.976 c -0.587 0.0 -1.025 -0.542 -0.9 -1.116 l 0.813 -3.712 l 6.272 -6.272 l 2.922 -0.089 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.44 2.47 c 0.293 -0.293 0.768 -0.293 1.061 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 L 3.531 20.5 c -0.293 0.294 -0.768 0.294 -1.061 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 5.884 -5.884 l -1.684 -0.051 l -0.848 0.848 c -0.375 0.375 -0.883 0.585 -1.414 0.585 H 3.141 c -0.186 0.0 -0.307 -0.195 -0.224 -0.36 l 1.32 -2.64 l -1.32 -2.637 C 2.834 9.135 2.955 8.939 3.141 8.938 h 1.267 c 0.53 0.0 1.04 0.211 1.414 0.586 l 0.848 0.849 l 3.723 -0.113 L 8.98 3.806 C 8.855 3.232 9.293 2.688 9.88 2.688 c 0.68 0.0 1.307 0.377 1.626 0.978 l 2.337 4.4 L 19.44 2.47 Z")
        )
    }.build()
}
