package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RadioFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RadioFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 1.7 C 4.5 1.313 4.186 1.0 3.8 1.0 C 3.413 1.0 3.1 1.313 3.1 1.7 v 2.11 C 2.789 3.837 2.506 3.894 2.242 4.028 C 1.814 4.244 1.466 4.589 1.248 5.014 c -0.14 0.27 -0.196 0.561 -0.222 0.883 C 1.0 6.207 1.0 6.59 1.0 7.057 v 3.168 c 0.0 0.467 0.0 0.85 0.026 1.16 c 0.026 0.322 0.083 0.612 0.222 0.883 c 0.218 0.425 0.566 0.77 0.994 0.986 c 0.274 0.138 0.567 0.194 0.89 0.22 c 0.314 0.026 0.7 0.026 1.171 0.026 h 7.394 c 0.471 0.0 0.857 0.0 1.17 -0.025 c 0.324 -0.027 0.617 -0.083 0.89 -0.22 c 0.429 -0.217 0.777 -0.562 0.995 -0.987 c 0.14 -0.271 0.196 -0.562 0.222 -0.883 C 15.0 11.075 15.0 10.692 15.0 10.225 V 7.057 c 0.0 -0.467 0.0 -0.85 -0.026 -1.16 c -0.026 -0.322 -0.083 -0.612 -0.222 -0.883 c -0.218 -0.425 -0.566 -0.77 -0.994 -0.986 c -0.274 -0.138 -0.567 -0.194 -0.89 -0.22 c -0.314 -0.026 -0.7 -0.026 -1.171 -0.026 H 4.5 V 1.7 Z m 0.0 9.023 c 0.0 0.384 -0.314 0.695 -0.7 0.695 c -0.387 0.0 -0.7 -0.311 -0.7 -0.695 c 0.0 -0.383 0.313 -0.694 0.7 -0.694 c 0.386 0.0 0.7 0.31 0.7 0.694 Z m 5.6 0.694 c 1.546 0.0 2.8 -1.243 2.8 -2.777 c 0.0 -1.533 -1.254 -2.776 -2.8 -2.776 c -1.547 0.0 -2.8 1.243 -2.8 2.776 c 0.0 1.534 1.253 2.777 2.8 2.777 Z m 1.4 -2.776 c 0.0 0.767 -0.627 1.389 -1.4 1.389 c -0.773 0.0 -1.4 -0.622 -1.4 -1.389 c 0.0 -0.766 0.627 -1.388 1.4 -1.388 c 0.773 0.0 1.4 0.622 1.4 1.388 Z")
        )
    }.build()
}
