package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudErrorFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudErrorFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.918 8.072 C 14.58 8.64 15.0 9.474 15.0 10.406 c 0.0 1.709 -1.41 3.094 -3.15 3.094 H 5.025 C 2.802 13.5 1.0 11.73 1.0 9.547 c 0.0 -1.82 1.252 -3.352 2.955 -3.812 l 0.028 -0.007 c 0.533 -0.14 1.09 -0.171 1.636 -0.09 c 0.546 0.08 1.07 0.269 1.538 0.556 C 7.625 6.48 8.028 6.859 8.34 7.306 C 8.654 7.753 8.87 8.258 8.976 8.79 c 0.056 0.284 0.332 0.469 0.617 0.412 c 0.284 -0.056 0.469 -0.332 0.412 -0.617 c -0.043 -0.217 -0.1 -0.431 -0.172 -0.64 C 10.476 8.299 11.214 8.5 12.0 8.5 c 0.686 0.0 1.336 -0.153 1.918 -0.428 Z M 7.734 2.565 C 6.428 2.78 5.304 3.523 4.596 4.562 C 4.987 4.529 5.382 4.54 5.772 4.598 c 0.678 0.1 1.33 0.334 1.915 0.69 C 7.565 4.878 7.5 4.447 7.5 4.0 c 0.0 -0.502 0.082 -0.984 0.234 -1.435 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.137 -0.357 -0.137 -0.494 0.0 s -0.137 0.358 0.0 0.495 L 11.505 4.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.138 0.137 0.36 0.137 0.496 0.0 L 12.0 4.495 l 1.198 1.199 c 0.137 0.137 0.359 0.137 0.495 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 4.0 l 1.199 -1.199 c 0.136 -0.137 0.136 -0.358 0.0 -0.495 c -0.137 -0.137 -0.359 -0.137 -0.496 0.0 L 12.0 3.505 l -1.2 -1.199 Z")
        )
    }.build()
}
