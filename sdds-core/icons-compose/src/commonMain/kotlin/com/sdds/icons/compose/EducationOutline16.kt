package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EducationOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EducationOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.258 2.777 c -0.17 -0.036 -0.346 -0.036 -0.516 0.0 C 7.567 2.814 7.392 2.91 6.855 3.22 L 1.982 6.041 l 4.836 2.922 c 0.554 0.335 0.734 0.436 0.915 0.476 c 0.176 0.04 0.358 0.04 0.534 0.0 c 0.18 -0.04 0.361 -0.141 0.915 -0.476 l 4.836 -2.922 l -4.873 -2.82 C 8.607 2.908 8.433 2.813 8.258 2.776 Z M 1.5 6.918 v 3.308 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 6.032 C 0.5 5.854 0.595 5.69 0.75 5.6 l 5.604 -3.244 l 0.065 -0.038 c 0.445 -0.258 0.765 -0.443 1.114 -0.518 c 0.308 -0.065 0.626 -0.065 0.934 0.0 c 0.35 0.075 0.669 0.26 1.114 0.518 l 0.065 0.038 l 5.604 3.244 c 0.153 0.09 0.248 0.252 0.25 0.429 c 0.002 0.176 -0.09 0.34 -0.242 0.432 L 12.7 8.006 v 4.186 c 0.0 0.146 -0.064 0.285 -0.174 0.38 C 11.268 13.65 9.666 14.25 8.0 14.25 c -1.665 0.0 -3.268 -0.6 -4.526 -1.678 c -0.11 -0.095 -0.174 -0.234 -0.174 -0.38 V 8.006 L 1.5 6.918 Z M 4.3 8.61 v 3.347 C 5.349 12.79 6.651 13.25 8.0 13.25 c 1.349 0.0 2.651 -0.46 3.7 -1.293 V 8.61 l -2.0 1.209 l -0.069 0.04 c -0.457 0.278 -0.786 0.477 -1.148 0.556 c -0.318 0.07 -0.648 0.07 -0.966 0.0 c -0.362 -0.08 -0.69 -0.278 -1.148 -0.555 L 6.3 9.819 L 4.3 8.61 Z")
        )
    }.build()
}
