package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NetworkFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NetworkFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.393 6.962 c 0.393 -0.387 0.398 -1.02 0.01 -1.414 c -0.387 -0.393 -1.02 -0.398 -1.414 -0.01 c -2.392 2.357 -3.739 5.558 -3.739 8.899 c 0.0 3.34 1.347 6.541 3.74 8.899 c 0.393 0.387 1.026 0.383 1.414 -0.01 c 0.387 -0.394 0.383 -1.027 -0.01 -1.415 c -2.015 -1.985 -3.144 -4.674 -3.144 -7.474 s 1.129 -5.49 3.143 -7.475 Z m 3.68 7.474 c 0.0 -2.116 1.744 -3.855 3.926 -3.855 c 2.183 0.0 3.928 1.74 3.928 3.855 s -1.745 3.855 -3.928 3.855 c -2.182 0.0 -3.927 -1.74 -3.927 -3.855 Z m 3.926 -5.855 c -3.26 0.0 -5.927 2.607 -5.927 5.855 c 0.0 2.908 2.14 5.303 4.927 5.772 v 9.54 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 v -9.54 c 2.788 -0.469 4.928 -2.864 4.928 -5.772 c 0.0 -3.248 -2.668 -5.855 -5.928 -5.855 Z m 7.596 -3.033 c 0.388 -0.393 1.02 -0.398 1.414 -0.01 c 2.393 2.357 3.74 5.558 3.74 8.899 c 0.0 3.34 -1.347 6.541 -3.74 8.899 c -0.393 0.387 -1.026 0.383 -1.414 -0.01 c -0.388 -0.394 -0.383 -1.027 0.01 -1.415 c 2.015 -1.985 3.143 -4.674 3.143 -7.474 s -1.128 -5.49 -3.143 -7.475 c -0.393 -0.387 -0.398 -1.02 -0.01 -1.414 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.5 14.5 c 0.0 2.485 -2.015 4.5 -4.5 4.5 s -4.5 -2.015 -4.5 -4.5 c 0.0 -2.486 2.015 -4.5 4.5 -4.5 s 4.5 2.014 4.5 4.5 Z")
        )
    }.build()
}
