package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StacksFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StacksFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.381 2.911 C 1.0 3.66 1.0 4.64 1.0 6.6 v 2.8 c 0.0 1.96 0.0 2.94 0.381 3.689 c 0.336 0.659 0.871 1.194 1.53 1.53 c 0.307 0.156 0.653 0.248 1.089 0.303 v -3.725 c 0.0 -1.157 0.0 -2.056 0.059 -2.776 c 0.06 -0.732 0.182 -1.323 0.453 -1.855 c 0.45 -0.884 1.17 -1.603 2.054 -2.054 C 7.098 4.242 7.69 4.12 8.421 4.06 C 9.14 4.0 10.04 4.0 11.197 4.0 h 3.725 c -0.055 -0.436 -0.147 -0.782 -0.304 -1.089 c -0.335 -0.659 -0.87 -1.194 -1.529 -1.53 C 12.34 1.0 11.36 1.0 9.4 1.0 H 6.6 C 4.64 1.0 3.66 1.0 2.911 1.381 c -0.659 0.336 -1.194 0.871 -1.53 1.53 Z M 14.988 5.0 H 11.22 c -1.184 0.0 -2.043 0.0 -2.718 0.056 c -0.67 0.054 -1.115 0.16 -1.482 0.347 C 6.324 5.758 5.758 6.324 5.403 7.02 C 5.216 7.387 5.11 7.833 5.056 8.502 C 5.0 9.177 5.0 10.036 5.0 11.22 v 3.768 C 5.45 15.0 5.975 15.0 6.6 15.0 h 0.9 v -3.662 c 0.0 -0.57 0.0 -1.027 0.03 -1.398 c 0.031 -0.381 0.097 -0.714 0.253 -1.02 c 0.25 -0.49 0.647 -0.887 1.137 -1.137 c 0.306 -0.156 0.639 -0.222 1.02 -0.253 c 0.37 -0.03 0.829 -0.03 1.399 -0.03 H 15.0 V 6.6 c 0.0 -0.625 0.0 -1.15 -0.012 -1.6 Z M 15.0 8.5 h -3.64 c -0.596 0.0 -1.013 0.0 -1.339 0.027 c -0.319 0.026 -0.505 0.075 -0.647 0.147 c -0.301 0.154 -0.546 0.399 -0.7 0.7 c -0.072 0.142 -0.121 0.328 -0.147 0.647 C 8.5 10.346 8.5 10.764 8.5 11.36 V 15.0 h 0.9 c 1.96 0.0 2.94 0.0 3.689 -0.382 c 0.659 -0.335 1.194 -0.87 1.53 -1.529 C 15.0 12.34 15.0 11.36 15.0 9.4 V 8.5 Z")
        )
    }.build()
}
