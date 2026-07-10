package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RemoteControllerFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RemoteControllerFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.531 6.375 c 0.0 -0.797 0.647 -1.444 1.444 -1.444 c 0.797 0.0 1.444 0.647 1.444 1.444 c 0.0 0.797 -0.647 1.444 -1.444 1.444 c -0.797 0.0 -1.444 -0.647 -1.444 -1.444 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.903 0.25 h 2.144 c 0.471 0.0 0.857 0.0 1.17 0.026 c 0.324 0.026 0.617 0.083 0.89 0.222 c 0.429 0.218 0.777 0.566 0.995 0.994 c 0.14 0.274 0.196 0.567 0.223 0.89 c 0.025 0.314 0.025 0.7 0.025 1.17 v 8.795 c 0.0 0.471 0.0 0.857 -0.025 1.17 c -0.027 0.324 -0.083 0.617 -0.223 0.89 c -0.218 0.429 -0.566 0.777 -0.994 0.995 c -0.274 0.14 -0.567 0.196 -0.89 0.222 c -0.314 0.026 -0.7 0.026 -1.17 0.026 H 6.902 c -0.471 0.0 -0.857 0.0 -1.17 -0.026 c -0.324 -0.026 -0.617 -0.083 -0.89 -0.222 c -0.429 -0.218 -0.777 -0.566 -0.995 -0.994 c -0.14 -0.274 -0.196 -0.567 -0.222 -0.89 C 3.6 13.203 3.6 12.817 3.6 12.346 V 3.553 c 0.0 -0.471 0.0 -0.857 0.026 -1.17 c 0.026 -0.324 0.083 -0.617 0.222 -0.89 c 0.218 -0.429 0.566 -0.777 0.994 -0.995 c 0.274 -0.14 0.567 -0.196 0.891 -0.222 C 6.046 0.25 6.432 0.25 6.903 0.25 Z M 6.225 3.4 c 0.387 0.0 0.7 -0.313 0.7 -0.7 c 0.0 -0.387 -0.313 -0.7 -0.7 -0.7 c -0.386 0.0 -0.7 0.313 -0.7 0.7 c 0.0 0.387 0.313 0.7 0.7 0.7 Z m 0.0 7.35 c 0.387 0.0 0.7 -0.314 0.7 -0.7 c 0.0 -0.387 -0.313 -0.7 -0.7 -0.7 c -0.386 0.0 -0.7 0.313 -0.7 0.7 c 0.0 0.386 0.313 0.7 0.7 0.7 Z m 4.2 -8.05 c 0.0 0.387 -0.313 0.7 -0.7 0.7 c -0.386 0.0 -0.7 -0.313 -0.7 -0.7 c 0.0 -0.387 0.313 -0.7 0.7 -0.7 c 0.387 0.0 0.7 0.313 0.7 0.7 Z m -0.7 8.05 c 0.387 0.0 0.7 -0.314 0.7 -0.7 c 0.0 -0.387 -0.313 -0.7 -0.7 -0.7 c -0.386 0.0 -0.7 0.313 -0.7 0.7 c 0.0 0.386 0.313 0.7 0.7 0.7 Z m -1.75 -6.781 c -1.329 0.0 -2.406 1.077 -2.406 2.406 c 0.0 1.329 1.077 2.406 2.406 2.406 c 1.329 0.0 2.406 -1.077 2.406 -2.406 c 0.0 -1.329 -1.077 -2.406 -2.406 -2.406 Z")
        )
    }.build()
}
