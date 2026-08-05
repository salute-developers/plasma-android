package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HummerOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HummerOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.858 2.42 l 1.053 1.056 L 7.933 3.5 c 0.146 0.146 0.249 0.249 0.329 0.35 c 0.647 0.819 0.647 1.974 0.0 2.792 L 8.253 6.652 l 1.072 1.076 c 0.823 -0.656 1.991 -0.653 2.812 0.006 c 0.097 0.078 0.195 0.177 0.335 0.317 l 0.021 0.022 l 0.375 0.375 l 1.426 -1.43 l -4.267 -4.28 c -0.861 -0.863 -2.192 -0.97 -3.169 -0.317 Z M 8.61 8.427 L 7.556 7.37 l -5.338 5.354 c -0.29 0.292 -0.29 0.766 0.0 1.058 c 0.29 0.29 0.76 0.29 1.05 0.0 L 8.61 8.426 Z M 5.763 2.033 c 1.373 -1.377 3.6 -1.377 4.972 0.0 l 4.62 4.632 c 0.194 0.195 0.194 0.511 0.0 0.706 L 13.221 9.51 c -0.094 0.094 -0.221 0.147 -0.354 0.147 c -0.133 0.0 -0.26 -0.053 -0.354 -0.147 l -0.729 -0.73 c -0.17 -0.17 -0.226 -0.227 -0.274 -0.265 c -0.458 -0.368 -1.11 -0.368 -1.567 0.0 C 9.896 8.552 9.84 8.608 9.67 8.779 l -5.692 5.709 c -0.681 0.683 -1.786 0.683 -2.467 0.0 c -0.68 -0.682 -0.68 -1.788 0.0 -2.47 l 5.692 -5.71 C 7.38 6.132 7.438 6.073 7.478 6.022 c 0.36 -0.455 0.36 -1.097 0.0 -1.551 c -0.04 -0.05 -0.098 -0.11 -0.276 -0.288 L 5.763 2.74 c -0.194 -0.195 -0.194 -0.511 0.0 -0.706 Z")
        )
    }.build()
}
