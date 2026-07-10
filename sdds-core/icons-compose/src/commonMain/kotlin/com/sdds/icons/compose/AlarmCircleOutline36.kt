package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AlarmCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AlarmCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.265 3.044 c 0.39 -0.391 1.023 -0.392 1.414 -0.002 l 5.278 5.266 c 0.39 0.39 0.392 1.023 0.002 1.414 c -0.39 0.39 -1.024 0.392 -1.415 0.001 l -5.278 -5.265 c -0.39 -0.39 -0.391 -1.023 -0.001 -1.414 Z m -16.53 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 4.455 9.723 c -0.39 0.39 -1.024 0.39 -1.414 -0.001 c -0.39 -0.391 -0.39 -1.024 0.002 -1.414 l 5.278 -5.266 c 0.39 -0.39 1.024 -0.39 1.414 0.002 Z m 8.268 3.637 c -6.252 0.0 -11.316 5.055 -11.316 11.286 c 0.0 3.117 1.265 5.937 3.314 7.98 c 2.049 2.044 4.876 3.307 8.002 3.307 c 2.777 0.0 5.318 -0.996 7.287 -2.651 c 2.466 -2.073 4.029 -5.172 4.029 -8.636 c 0.0 -6.23 -5.064 -11.286 -11.316 -11.286 Z M 4.687 17.967 c 0.0 -7.34 5.964 -13.286 13.316 -13.286 S 31.32 10.627 31.32 17.967 c 0.0 3.69 -1.508 7.027 -3.938 9.433 l 2.151 2.146 c 0.391 0.39 0.392 1.023 0.002 1.414 s -1.023 0.392 -1.414 0.002 l -2.267 -2.261 c -2.201 1.605 -4.916 2.553 -7.85 2.553 c -3.316 0.0 -6.351 -1.21 -8.682 -3.212 l -2.927 2.92 c -0.391 0.39 -1.024 0.39 -1.414 -0.002 c -0.39 -0.39 -0.39 -1.024 0.001 -1.414 l 2.924 -2.917 c -2.004 -2.325 -3.218 -5.353 -3.218 -8.662 Z m 13.196 -6.331 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 7.071 c 0.0 0.76 0.615 1.375 1.375 1.375 h 4.85 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -4.225 v -6.446 Z")
        )
    }.build()
}
