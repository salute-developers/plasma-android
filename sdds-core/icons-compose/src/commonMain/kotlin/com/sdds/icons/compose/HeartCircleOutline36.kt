package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.127 10.125 c -3.516 0.0 -5.652 3.012 -5.652 5.521 c 0.0 2.244 1.123 4.302 2.544 6.046 c 1.433 1.757 3.274 3.324 4.938 4.6 l 0.093 0.072 c 0.383 0.295 0.796 0.614 1.308 0.75 c 0.435 0.117 0.924 0.117 1.358 0.0 c 0.512 -0.136 0.926 -0.455 1.308 -0.75 l 0.094 -0.072 c 1.664 -1.276 3.505 -2.843 4.937 -4.6 c 1.422 -1.744 2.545 -3.802 2.545 -6.046 c 0.0 -2.509 -2.136 -5.521 -5.653 -5.521 c -1.086 0.0 -2.033 0.427 -2.805 0.96 c -0.4 0.276 -0.768 0.592 -1.105 0.918 c -0.336 -0.326 -0.705 -0.642 -1.104 -0.918 c -0.772 -0.533 -1.72 -0.96 -2.806 -0.96 Z m -3.402 5.521 c 0.0 -1.453 1.307 -3.271 3.402 -3.271 c 0.481 0.0 0.987 0.188 1.527 0.561 c 0.541 0.375 1.055 0.893 1.53 1.446 c 0.214 0.248 0.525 0.391 0.853 0.391 c 0.328 0.0 0.64 -0.143 0.853 -0.391 c 0.476 -0.553 0.99 -1.071 1.531 -1.446 c 0.54 -0.373 1.046 -0.561 1.526 -0.561 c 2.096 0.0 3.403 1.818 3.403 3.271 c 0.0 1.493 -0.759 3.054 -2.039 4.624 c -1.268 1.557 -2.948 2.999 -4.562 4.236 c -0.253 0.194 -0.394 0.301 -0.506 0.374 c -0.05 0.032 -0.078 0.048 -0.093 0.055 l -0.013 0.006 h -0.003 c -0.053 0.015 -0.14 0.015 -0.194 0.0 h -0.003 l -0.012 -0.006 c -0.015 -0.007 -0.044 -0.023 -0.094 -0.055 c -0.111 -0.073 -0.252 -0.18 -0.505 -0.374 c -1.614 -1.237 -3.294 -2.679 -4.563 -4.236 c -1.28 -1.57 -2.038 -3.13 -2.038 -4.624 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 Z M 5.25 18.0 c 0.0 -7.042 5.708 -12.75 12.75 -12.75 S 30.75 10.958 30.75 18.0 S 25.042 30.75 18.0 30.75 S 5.25 25.042 5.25 18.0 Z")
        )
    }.build()
}
