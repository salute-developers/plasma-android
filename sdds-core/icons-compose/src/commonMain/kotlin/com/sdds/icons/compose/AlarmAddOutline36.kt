package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AlarmAddOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AlarmAddOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.265 3.044 c 0.39 -0.391 1.023 -0.392 1.414 -0.002 l 5.278 5.265 c 0.39 0.39 0.392 1.023 0.002 1.414 s -1.024 0.392 -1.415 0.002 l -5.277 -5.265 c -0.392 -0.39 -0.392 -1.023 -0.002 -1.414 Z m -16.53 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 4.455 9.723 c -0.39 0.39 -1.024 0.39 -1.414 -0.002 c -0.39 -0.39 -0.39 -1.024 0.002 -1.414 l 5.278 -5.265 c 0.39 -0.39 1.024 -0.39 1.414 0.002 Z m 8.268 3.636 c -6.252 0.0 -11.316 5.055 -11.316 11.285 c 0.0 3.116 1.265 5.936 3.314 7.98 c 2.049 2.044 4.876 3.306 8.002 3.306 c 2.777 0.0 5.318 -0.996 7.287 -2.65 c 2.466 -2.073 4.029 -5.172 4.029 -8.636 c 0.0 -6.23 -5.064 -11.285 -11.316 -11.285 Z M 4.687 17.965 c 0.0 -7.34 5.964 -13.285 13.316 -13.285 S 31.32 10.626 31.32 17.965 c 0.0 3.689 -1.508 7.027 -3.938 9.432 l 2.151 2.146 c 0.391 0.39 0.392 1.024 0.002 1.415 c -0.39 0.39 -1.023 0.391 -1.414 0.001 l -2.267 -2.26 c -2.201 1.604 -4.916 2.552 -7.85 2.552 c -3.316 0.0 -6.351 -1.21 -8.682 -3.212 l -2.927 2.92 c -0.391 0.39 -1.024 0.39 -1.414 -0.001 c -0.39 -0.391 -0.39 -1.025 0.001 -1.415 l 2.924 -2.917 c -2.004 -2.325 -3.218 -5.352 -3.218 -8.66 Z m 14.316 -6.33 c 0.0 -0.551 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.449 -1.0 1.0 v 5.33 h -5.345 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 5.345 v 5.329 c 0.0 0.552 0.447 1.0 1.0 1.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -5.329 h 5.344 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -5.344 v -5.33 Z")
        )
    }.build()
}
