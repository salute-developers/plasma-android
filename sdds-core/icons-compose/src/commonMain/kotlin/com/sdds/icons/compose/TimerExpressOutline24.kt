package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerExpressOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerExpressOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 3.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 5.5 c 0.414 0.0 0.75 0.336 0.75 0.75 S 15.164 4.0 14.75 4.0 h -5.5 C 8.836 4.0 8.5 3.664 8.5 3.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.73 8.994 c 0.057 -0.169 -0.013 -0.353 -0.165 -0.443 c -0.153 -0.09 -0.348 -0.06 -0.467 0.072 l -5.0 5.5 c -0.1 0.11 -0.126 0.268 -0.066 0.404 s 0.195 0.223 0.343 0.223 h 2.98 l -1.086 3.256 c -0.056 0.169 0.014 0.353 0.166 0.443 c 0.153 0.09 0.348 0.06 0.467 -0.072 l 5.0 -5.5 c 0.1 -0.11 0.126 -0.268 0.066 -0.404 c -0.06 -0.135 -0.195 -0.223 -0.343 -0.223 h -2.98 l 1.086 -3.256 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 5.0 c -1.116 0.0 -2.222 0.22 -3.253 0.647 C 7.716 6.074 6.78 6.7 5.99 7.49 C 5.2 8.279 4.574 9.216 4.147 10.247 C 3.72 11.278 3.5 12.384 3.5 13.5 s 0.22 2.222 0.647 3.253 C 4.574 17.784 5.2 18.72 5.99 19.51 c 0.789 0.79 1.726 1.416 2.757 1.843 C 9.778 21.78 10.884 22.0 12.0 22.0 s 2.222 -0.22 3.253 -0.647 c 1.031 -0.427 1.968 -1.053 2.757 -1.843 c 0.79 -0.789 1.416 -1.726 1.843 -2.757 c 0.427 -1.031 0.647 -2.137 0.647 -3.253 s -0.22 -2.222 -0.647 -3.253 c -0.377 -0.909 -0.908 -1.745 -1.569 -2.47 L 19.03 7.03 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 l -0.79 0.79 c -0.59 -0.453 -1.238 -0.827 -1.927 -1.113 C 14.222 5.22 13.116 5.0 12.0 5.0 Z M 9.321 7.033 C 10.171 6.68 11.081 6.5 12.0 6.5 c 0.92 0.0 1.83 0.181 2.679 0.533 c 0.85 0.352 1.62 0.867 2.27 1.517 c 0.65 0.65 1.166 1.422 1.518 2.271 C 18.82 11.671 19.0 12.581 19.0 13.5 c 0.0 0.92 -0.181 1.83 -0.533 2.679 c -0.352 0.85 -0.867 1.62 -1.517 2.27 c -0.65 0.65 -1.422 1.166 -2.271 1.518 C 13.829 20.32 12.919 20.5 12.0 20.5 c -0.92 0.0 -1.83 -0.181 -2.679 -0.533 c -0.85 -0.352 -1.62 -0.867 -2.27 -1.517 c -0.65 -0.65 -1.166 -1.422 -1.518 -2.271 C 5.18 15.329 5.0 14.419 5.0 13.5 c 0.0 -0.92 0.181 -1.83 0.533 -2.679 c 0.352 -0.85 0.867 -1.62 1.517 -2.27 C 7.7 7.9 8.472 7.384 9.321 7.032 Z")
        )
    }.build()
}
