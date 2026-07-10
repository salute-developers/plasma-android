package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Scene3DOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Scene3DOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 2f,
            pathData = addPathNodes("M 18.0 30.75 c -4.905 0.0 -8.901 -3.838 -9.067 -8.634 c -2.692 0.425 -4.594 0.95 -5.601 1.268 c -0.298 0.095 -0.448 0.142 -0.552 0.114 c -0.096 -0.025 -0.17 -0.08 -0.222 -0.163 C 2.5 23.244 2.5 23.093 2.5 22.788 V 6.039 c 0.0 -0.353 0.0 -0.53 0.06 -0.622 c 0.057 -0.088 0.128 -0.138 0.23 -0.162 C 2.898 5.23 3.073 5.293 3.423 5.42 C 5.193 6.06 9.649 7.272 18.0 7.272 c 8.351 0.0 12.808 -1.213 14.577 -1.852 c 0.35 -0.127 0.525 -0.19 0.633 -0.165 c 0.102 0.024 0.173 0.074 0.23 0.162 c 0.06 0.093 0.06 0.27 0.06 0.622 v 16.749 c 0.0 0.304 0.0 0.456 -0.058 0.547 c -0.053 0.084 -0.126 0.138 -0.222 0.163 c -0.105 0.028 -0.254 -0.02 -0.552 -0.114 c -1.007 -0.317 -2.908 -0.843 -5.6 -1.268 c -0.165 4.796 -4.161 8.634 -9.067 8.634 Z m 0.0 0.0 c 5.012 0.0 9.074 -4.004 9.074 -8.944 c 0.0 -4.94 -4.062 -8.944 -9.073 -8.944 s -9.073 4.004 -9.073 8.944 c 0.0 4.94 4.062 8.944 9.073 8.944 Z")
        )
    }.build()
}
