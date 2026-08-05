package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Nested16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Nested16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.5 2.5 C 2.776 2.5 3.0 2.724 3.0 3.0 v 1.4 c 0.0 0.988 0.0 1.7 0.046 2.258 c 0.045 0.553 0.132 0.912 0.281 1.204 c 0.288 0.564 0.747 1.023 1.311 1.311 c 0.292 0.149 0.651 0.236 1.204 0.281 C 6.4 9.5 7.112 9.5 8.1 9.5 h 4.193 L 9.964 7.172 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 c 0.196 -0.195 0.512 -0.195 0.708 0.0 l 3.182 3.182 c 0.195 0.196 0.195 0.512 0.0 0.708 l -3.182 3.182 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 l 2.329 -2.328 H 8.078 c -0.962 0.0 -1.713 0.0 -2.318 -0.05 c -0.614 -0.05 -1.12 -0.153 -1.576 -0.386 c -0.753 -0.383 -1.365 -0.995 -1.748 -1.748 C 2.203 7.859 2.1 7.354 2.049 6.74 C 2.0 6.135 2.0 5.384 2.0 4.422 V 3.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
