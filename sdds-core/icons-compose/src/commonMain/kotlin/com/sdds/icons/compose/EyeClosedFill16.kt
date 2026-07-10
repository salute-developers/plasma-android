package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeClosedFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeClosedFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.525 1.646 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.707 l -11.88 11.88 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.708 l 1.82 -1.82 c -1.046 -0.656 -1.933 -1.53 -2.587 -2.559 L 0.869 9.13 C 0.725 8.905 0.61 8.726 0.538 8.416 C 0.51 8.286 0.5 8.129 0.5 8.0 s 0.009 -0.286 0.04 -0.416 c 0.071 -0.31 0.186 -0.49 0.328 -0.714 l 0.01 -0.017 C 2.352 4.543 4.99 3.0 8.0 3.0 c 1.23 0.0 2.398 0.258 3.45 0.72 l 2.075 -2.074 Z M 8.0 4.034 C 5.74 4.034 3.908 5.81 3.908 8.0 c 0.0 0.91 0.317 1.746 0.848 2.415 l 0.88 -0.88 C 5.332 9.096 5.153 8.568 5.153 8.0 c 0.0 -1.524 1.275 -2.759 2.847 -2.759 c 0.555 0.0 1.072 0.154 1.51 0.42 l 0.88 -0.88 C 9.717 4.311 8.892 4.034 8.0 4.034 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.22 4.773 c 0.75 0.582 1.395 1.286 1.901 2.08 l 0.01 0.018 c 0.143 0.224 0.258 0.403 0.33 0.713 C 15.49 7.714 15.5 7.87 15.5 8.0 s -0.009 0.286 -0.04 0.416 c -0.071 0.31 -0.186 0.49 -0.328 0.713 l -0.01 0.017 C 13.648 11.458 11.01 13.0 8.0 13.0 c -0.91 0.0 -1.785 -0.141 -2.604 -0.401 l 0.964 -0.965 c 0.502 0.213 1.057 0.332 1.64 0.332 c 2.26 0.0 4.092 -1.776 4.092 -3.966 c 0.0 -0.61 -0.142 -1.186 -0.396 -1.702 l 1.525 -1.525 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.741 7.253 C 10.81 7.49 10.847 7.74 10.847 8.0 c 0.0 1.523 -1.275 2.759 -2.847 2.759 c -0.236 0.0 -0.465 -0.028 -0.685 -0.08 l 3.426 -3.426 Z")
        )
    }.build()
}
