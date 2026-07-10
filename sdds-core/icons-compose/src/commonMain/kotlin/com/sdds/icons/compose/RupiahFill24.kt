package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RupiahFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RupiahFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z M 9.25 7.0 C 8.836 7.0 8.5 7.336 8.5 7.75 S 8.836 8.5 9.25 8.5 h 2.0 c 0.577 0.0 1.0 0.253 1.296 0.606 c 0.104 0.125 0.19 0.259 0.257 0.394 H 9.75 C 9.336 9.5 9.0 9.836 9.0 10.25 S 9.336 11.0 9.75 11.0 h 3.053 c -0.068 0.135 -0.153 0.27 -0.257 0.394 C 12.25 11.747 11.827 12.0 11.25 12.0 h -2.0 c -0.102 0.0 -0.199 0.02 -0.287 0.057 c -0.089 0.037 -0.171 0.09 -0.243 0.163 c -0.072 0.072 -0.126 0.154 -0.163 0.243 C 8.52 12.55 8.5 12.648 8.5 12.75 c 0.0 0.102 0.02 0.199 0.057 0.287 c 0.037 0.088 0.09 0.171 0.163 0.243 l 4.0 4.0 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -2.72 -2.72 h 0.19 c 1.08 0.0 1.906 -0.497 2.447 -1.144 c 0.34 -0.407 0.577 -0.884 0.701 -1.356 h 0.852 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 15.664 9.5 15.25 9.5 h -0.852 c -0.09 -0.34 -0.237 -0.683 -0.44 -1.0 h 1.292 C 15.664 8.5 16.0 8.164 16.0 7.75 S 15.664 7.0 15.25 7.0 h -6.0 Z")
        )
    }.build()
}
