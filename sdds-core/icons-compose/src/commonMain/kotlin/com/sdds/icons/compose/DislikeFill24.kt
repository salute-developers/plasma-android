package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DislikeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DislikeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.927 22.49 c -0.609 0.174 -1.246 -0.163 -1.446 -0.763 l -1.023 -3.07 c -0.123 -0.368 -0.29 -0.72 -0.5 -1.047 L 8.599 13.9 c -0.156 -0.246 -0.334 -0.477 -0.532 -0.688 c -0.535 0.872 -1.645 1.334 -2.712 0.934 L 4.4 13.789 c -0.833 -0.312 -1.404 -1.086 -1.456 -1.974 L 2.584 5.69 c -0.07 -1.183 0.79 -2.218 1.967 -2.365 L 5.55 3.201 C 6.416 3.093 7.22 3.491 7.68 4.156 l 5.885 -1.28 c 1.82 -0.395 3.686 0.44 4.603 2.062 l 2.519 4.457 c 1.224 2.167 -0.34 4.85 -2.83 4.85 h -2.056 c -0.493 0.0 -0.852 0.467 -0.725 0.943 l 0.957 3.587 c 0.428 1.606 -0.51 3.258 -2.107 3.715 Z M 5.88 12.742 c 0.505 0.19 1.038 -0.2 1.013 -0.738 L 6.578 5.398 C 6.558 4.962 6.17 4.636 5.736 4.69 L 4.737 4.815 C 4.345 4.864 4.058 5.208 4.081 5.603 l 0.36 6.124 c 0.018 0.296 0.208 0.554 0.486 0.658 l 0.953 0.357 Z")
        )
    }.build()
}
