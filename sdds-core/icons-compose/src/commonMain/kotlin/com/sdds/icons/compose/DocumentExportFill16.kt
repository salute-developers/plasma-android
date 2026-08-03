package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentExportFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentExportFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z m 2.0 4.8 c -0.193 0.0 -0.35 0.157 -0.35 0.35 c 0.0 0.36 -0.291 0.65 -0.65 0.65 h -2.0 c -0.359 0.0 -0.65 -0.29 -0.65 -0.65 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 c 0.0 0.746 0.604 1.35 1.35 1.35 h 2.0 c 0.745 0.0 1.35 -0.604 1.35 -1.35 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 Z m -2.0 -3.945 c -0.095 0.0 -0.185 0.038 -0.251 0.106 l -1.5 1.545 l -0.044 0.056 c -0.088 0.137 -0.07 0.321 0.05 0.439 c 0.122 0.118 0.308 0.13 0.442 0.038 l 0.054 -0.045 l 0.9 -0.927 V 13.0 l 0.006 0.07 c 0.033 0.16 0.174 0.28 0.343 0.28 c 0.17 0.0 0.311 -0.12 0.344 -0.28 L 12.35 13.0 v -2.682 l 0.898 0.926 c 0.135 0.139 0.356 0.142 0.495 0.007 c 0.139 -0.135 0.142 -0.356 0.007 -0.495 L 12.252 9.21 C 12.186 9.143 12.095 9.105 12.0 9.105 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.86 1.0 c 1.274 0.0 1.911 0.0 2.398 0.248 c 0.428 0.218 0.776 0.566 0.994 0.994 C 13.5 2.73 13.5 3.366 13.5 4.64 v 3.117 C 13.03 7.59 12.526 7.5 12.0 7.5 c -2.485 0.0 -4.5 2.015 -4.5 4.5 c 0.0 1.153 0.434 2.204 1.146 3.0 H 6.14 c -1.274 0.0 -1.911 0.0 -2.398 -0.248 c -0.428 -0.218 -0.776 -0.566 -0.994 -0.994 C 2.5 13.27 2.5 12.634 2.5 11.36 V 4.64 c 0.0 -1.274 0.0 -1.911 0.248 -2.398 c 0.218 -0.428 0.566 -0.776 0.994 -0.994 C 4.23 1.0 4.866 1.0 6.14 1.0 h 3.72 Z M 5.25 6.1 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 8.0 l 0.1 -0.01 C 8.329 7.043 8.5 6.84 8.5 6.6 c 0.0 -0.242 -0.172 -0.443 -0.4 -0.49 L 8.0 6.1 H 5.25 Z m 0.0 -2.275 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 5.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -5.5 Z")
        )
    }.build()
}
