package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Visa16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Visa16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.24 7.189 C 8.232 7.815 8.802 8.165 9.23 8.373 c 0.441 0.214 0.59 0.35 0.587 0.541 C 9.814 9.206 9.466 9.335 9.14 9.34 C 8.572 9.35 8.241 9.188 7.98 9.065 L 7.774 10.02 c 0.263 0.12 0.751 0.226 1.258 0.231 c 1.188 0.0 1.965 -0.584 1.97 -1.489 c 0.004 -1.148 -1.597 -1.212 -1.586 -1.726 c 0.004 -0.155 0.153 -0.321 0.48 -0.364 c 0.162 -0.02 0.609 -0.037 1.115 0.195 l 0.2 -0.923 c -0.273 -0.098 -0.623 -0.193 -1.06 -0.193 c -1.118 0.0 -1.904 0.592 -1.91 1.439 Z m 4.88 -1.36 c -0.216 0.0 -0.399 0.126 -0.48 0.32 l -1.698 4.033 h 1.188 l 0.236 -0.65 h 1.45 l 0.138 0.65 H 15.0 L 14.087 5.83 H 13.12 Z m 0.167 1.176 l 0.342 1.635 h -0.938 l 0.596 -1.635 Z M 6.8 5.83 l -0.936 4.352 h 1.132 L 7.932 5.83 H 6.8 Z m -1.674 0.0 L 3.95 8.792 L 3.474 6.273 C 3.418 5.992 3.197 5.83 2.952 5.83 H 1.027 L 1.0 5.956 c 0.395 0.085 0.844 0.223 1.116 0.37 c 0.167 0.09 0.214 0.169 0.269 0.383 l 0.902 3.473 h 1.196 L 6.315 5.83 H 5.127 Z")
        )
    }.build()
}
