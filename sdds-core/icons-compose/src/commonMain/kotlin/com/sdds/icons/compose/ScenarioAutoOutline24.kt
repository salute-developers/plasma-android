package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScenarioAutoOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScenarioAutoOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.889 3.547 c -2.013 -0.212 -4.035 0.302 -5.703 1.448 C 5.518 6.141 4.313 7.845 3.79 9.8 c -0.098 0.364 -0.45 0.599 -0.823 0.55 c -0.373 -0.05 -0.652 -0.368 -0.652 -0.744 v -5.23 c 0.0 -0.413 0.336 -0.75 0.75 -0.75 s 0.75 0.337 0.75 0.75 v 1.879 c 0.68 -0.968 1.53 -1.816 2.521 -2.496 c 1.962 -1.349 4.341 -1.953 6.71 -1.704 c 2.367 0.249 4.569 1.334 6.208 3.061 c 1.639 1.728 2.608 3.983 2.732 6.36 c 0.022 0.414 -0.296 0.767 -0.71 0.789 c -0.413 0.022 -0.766 -0.296 -0.788 -0.71 c -0.105 -2.02 -0.93 -3.938 -2.322 -5.406 c -1.393 -1.468 -3.265 -2.39 -5.277 -2.602 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 2.723 11.735 c 0.414 -0.021 0.767 0.296 0.789 0.71 c 0.106 2.021 0.93 3.938 2.322 5.406 c 1.394 1.468 3.265 2.39 5.277 2.602 c 2.013 0.212 4.036 -0.302 5.703 -1.448 c 1.668 -1.146 2.873 -2.85 3.396 -4.805 c 0.098 -0.364 0.45 -0.599 0.823 -0.55 c 0.373 0.05 0.652 0.368 0.652 0.744 v 5.23 c 0.0 0.413 -0.336 0.75 -0.75 0.75 s -0.75 -0.337 -0.75 -0.75 v -1.879 c -0.68 0.968 -1.53 1.816 -2.52 2.496 c -1.963 1.349 -4.342 1.953 -6.71 1.704 c -2.368 -0.249 -4.57 -1.334 -6.209 -3.061 c -1.639 -1.728 -2.608 -3.983 -2.732 -6.36 c -0.022 -0.414 0.296 -0.767 0.71 -0.789 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.67 7.665 C 12.545 7.41 12.285 7.25 12.0 7.25 c -0.284 0.0 -0.544 0.16 -0.67 0.415 l -3.5 7.0 c -0.186 0.37 -0.036 0.82 0.335 1.006 c 0.37 0.185 0.82 0.035 1.006 -0.336 l 1.043 -2.085 h 3.572 l 1.043 2.085 c 0.185 0.37 0.636 0.521 1.006 0.336 s 0.521 -0.636 0.336 -1.006 l -3.5 -7.0 Z M 12.0 9.677 l 1.037 2.073 h -2.074 L 12.0 9.677 Z")
        )
    }.build()
}
