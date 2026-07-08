package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WasherFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WasherFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.375 3.0 C 6.683 3.0 4.5 5.183 4.5 7.875 v 20.25 C 4.5 30.817 6.683 33.0 9.375 33.0 h 17.25 c 2.692 0.0 4.875 -2.183 4.875 -4.875 V 7.875 C 31.5 5.183 29.317 3.0 26.625 3.0 H 9.375 Z m 1.125 7.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 s -0.672 -1.5 -1.5 -1.5 S 9.0 8.172 9.0 9.0 s 0.672 1.5 1.5 1.5 Z M 19.125 8.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 6.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -6.75 Z M 12.25 19.875 c 0.0 -3.176 2.574 -5.75 5.75 -5.75 s 5.75 2.574 5.75 5.75 c 0.0 0.132 -0.004 0.263 -0.013 0.392 l -0.1 0.046 C 22.865 20.666 22.133 21.0 21.0 21.0 c -1.5 0.0 -2.25 -0.375 -3.0 -0.75 s -1.5 -0.75 -3.0 -0.75 c -1.33 0.0 -2.071 0.295 -2.745 0.623 c -0.003 -0.082 -0.005 -0.165 -0.005 -0.248 Z m -1.935 1.007 c -0.043 -0.33 -0.065 -0.666 -0.065 -1.007 c 0.0 -4.28 3.47 -7.75 7.75 -7.75 c 4.188 0.0 7.6 3.322 7.745 7.475 l 0.124 -0.02 c 0.004 0.098 0.006 0.196 0.006 0.295 c 0.0 4.35 -3.526 7.875 -7.875 7.875 c -4.0 0.0 -7.304 -2.983 -7.809 -6.845 l 0.124 -0.023 Z")
        )
    }.build()
}
