package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarLightOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarLightOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.738 2.94 c 0.244 -0.334 0.17 -0.803 -0.166 -1.047 c -0.335 -0.243 -0.804 -0.169 -1.047 0.166 l -2.102 2.894 C 15.179 5.288 15.253 5.757 15.589 6.0 c 0.335 0.244 0.804 0.17 1.047 -0.166 l 2.102 -2.893 Z M 6.415 2.06 C 6.172 1.723 5.703 1.65 5.367 1.892 C 5.032 2.137 4.958 2.606 5.202 2.941 l 2.102 2.893 C 7.547 6.17 8.016 6.244 8.35 6.0 c 0.335 -0.243 0.41 -0.712 0.166 -1.047 L 6.415 2.059 Z M 5.633 13.827 c 0.394 -0.128 0.61 -0.55 0.482 -0.945 c -0.128 -0.394 -0.551 -0.61 -0.945 -0.481 l -3.402 1.105 c -0.393 0.128 -0.61 0.551 -0.481 0.945 c 0.128 0.394 0.551 0.61 0.945 0.482 l 3.401 -1.106 Z m 13.137 -1.426 c -0.394 -0.128 -0.817 0.087 -0.945 0.481 s 0.088 0.817 0.482 0.945 l 3.4 1.106 c 0.395 0.128 0.818 -0.088 0.946 -0.482 s -0.088 -0.817 -0.482 -0.945 l -3.4 -1.105 Z m -6.05 5.485 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 3.577 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -3.577 Z m 0.185 -14.723 c -0.39 -0.764 -1.48 -0.764 -1.87 0.0 L 9.077 6.999 L 4.824 7.676 C 3.978 7.81 3.64 8.848 4.246 9.455 l 3.043 3.047 l -0.67 4.254 c -0.134 0.846 0.749 1.488 1.513 1.099 l 3.838 -1.953 l 3.838 1.953 c 0.764 0.389 1.647 -0.253 1.514 -1.1 l -0.671 -4.253 l 3.043 -3.047 c 0.605 -0.607 0.268 -1.645 -0.578 -1.78 L 14.863 7.0 l -1.958 -3.835 Z M 10.31 7.885 l 1.661 -3.254 l 1.66 3.254 c 0.153 0.3 0.44 0.507 0.771 0.56 l 3.608 0.574 l -2.582 2.585 c -0.237 0.237 -0.346 0.574 -0.294 0.905 l 0.57 3.61 l -3.257 -1.657 c -0.3 -0.152 -0.653 -0.152 -0.952 0.0 l -3.256 1.656 l 0.569 -3.609 c 0.052 -0.331 -0.057 -0.668 -0.295 -0.905 L 5.931 9.019 l 3.608 -0.574 c 0.331 -0.053 0.618 -0.26 0.77 -0.56 Z")
        )
    }.build()
}
