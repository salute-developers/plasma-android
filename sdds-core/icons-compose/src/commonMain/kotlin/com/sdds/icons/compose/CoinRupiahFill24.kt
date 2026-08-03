package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRupiahFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRupiahFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.485 17.0 C 20.442 15.57 21.0 13.85 21.0 12.0 c 0.0 -4.97 -4.03 -9.0 -9.0 -9.0 s -9.0 4.03 -9.0 9.0 c 0.0 1.85 0.558 3.57 1.516 5.0 h 7.923 l -3.72 -3.72 c -0.071 -0.072 -0.125 -0.154 -0.162 -0.243 C 8.52 12.95 8.5 12.852 8.5 12.75 c 0.0 -0.102 0.02 -0.199 0.057 -0.287 c 0.037 -0.088 0.09 -0.171 0.163 -0.243 c 0.072 -0.072 0.154 -0.127 0.243 -0.163 C 9.05 12.02 9.148 12.0 9.25 12.0 h 2.0 c 0.577 0.0 1.0 -0.253 1.296 -0.606 c 0.104 -0.125 0.19 -0.259 0.257 -0.394 H 9.75 C 9.336 11.0 9.0 10.664 9.0 10.25 S 9.336 9.5 9.75 9.5 h 3.053 c -0.068 -0.135 -0.153 -0.27 -0.257 -0.394 C 12.25 8.753 11.827 8.5 11.25 8.5 h -2.0 C 8.836 8.5 8.5 8.164 8.5 7.75 S 8.836 7.0 9.25 7.0 h 6.0 C 15.664 7.0 16.0 7.336 16.0 7.75 S 15.664 8.5 15.25 8.5 h -1.292 c 0.203 0.317 0.35 0.66 0.44 1.0 h 0.852 c 0.414 0.0 0.75 0.336 0.75 0.75 S 15.664 11.0 15.25 11.0 h -0.852 c -0.124 0.472 -0.36 0.949 -0.701 1.356 c -0.541 0.647 -1.367 1.144 -2.447 1.144 h -0.19 l 2.72 2.72 c 0.211 0.21 0.27 0.516 0.177 0.78 h 5.527 Z M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
