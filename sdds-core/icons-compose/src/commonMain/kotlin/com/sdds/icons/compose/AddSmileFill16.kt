package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AddSmileFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AddSmileFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.55 2.02 h -0.467 c -0.63 0.0 -1.14 0.507 -1.14 1.132 c 0.0 0.625 0.51 1.132 1.14 1.132 h 1.069 V 5.61 c 0.0 0.596 0.486 1.079 1.086 1.079 c 0.6 0.0 1.087 -0.483 1.087 -1.079 V 5.508 c 0.277 0.755 0.428 1.57 0.428 2.419 c 0.0 3.906 -3.19 7.073 -7.127 7.073 C 3.691 15.0 0.5 11.833 0.5 7.927 c 0.0 -3.907 3.19 -7.073 7.126 -7.073 c 1.45 0.0 2.798 0.43 3.923 1.167 Z M 6.2 6.336 c 0.0 0.489 -0.399 0.885 -0.89 0.885 c -0.493 0.0 -0.891 -0.396 -0.891 -0.885 c 0.0 -0.488 0.398 -0.884 0.89 -0.884 s 0.891 0.396 0.891 0.884 Z m 4.632 0.0 c 0.0 0.489 -0.399 0.885 -0.89 0.885 c -0.492 0.0 -0.891 -0.396 -0.891 -0.885 c 0.0 -0.488 0.399 -0.884 0.89 -0.884 c 0.492 0.0 0.891 0.396 0.891 0.884 Z M 5.003 9.43 C 4.856 9.176 4.53 9.09 4.273 9.236 C 4.018 9.382 3.93 9.706 4.078 9.96 c 0.36 0.619 0.877 1.132 1.5 1.489 c 0.623 0.357 1.33 0.545 2.048 0.545 c 0.72 0.0 1.426 -0.188 2.05 -0.545 c 0.622 -0.357 1.14 -0.87 1.5 -1.489 c 0.147 -0.253 0.06 -0.578 -0.197 -0.724 c -0.255 -0.147 -0.582 -0.06 -0.73 0.194 c -0.265 0.457 -0.648 0.836 -1.108 1.1 c -0.46 0.264 -0.983 0.403 -1.515 0.403 c -0.531 0.0 -1.054 -0.139 -1.514 -0.403 c -0.46 -0.264 -0.843 -0.643 -1.109 -1.1 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.328 0.5 c 0.295 0.0 0.534 0.238 0.534 0.53 v 1.592 h 1.604 C 15.76 2.622 16.0 2.859 16.0 3.152 c 0.0 0.293 -0.24 0.53 -0.534 0.53 h -1.604 v 1.592 c 0.0 0.293 -0.24 0.53 -0.534 0.53 c -0.296 0.0 -0.535 -0.237 -0.535 -0.53 V 3.683 H 11.19 c -0.296 0.0 -0.535 -0.238 -0.535 -0.53 c 0.0 -0.294 0.24 -0.531 0.535 -0.531 h 1.603 V 1.03 c 0.0 -0.292 0.24 -0.53 0.535 -0.53 Z")
        )
    }.build()
}
