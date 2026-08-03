package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LockFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LockFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.125 10.215 v 4.566 c 0.434 0.013 0.801 0.046 1.138 0.128 c 1.783 0.433 3.174 1.842 3.602 3.647 c 0.136 0.571 0.136 1.229 0.135 2.145 v 5.132 c 0.0 1.022 0.0 1.859 -0.055 2.539 c -0.056 0.703 -0.178 1.339 -0.476 1.933 c -0.468 0.928 -1.213 1.684 -2.13 2.157 c -0.587 0.302 -1.214 0.425 -1.91 0.482 C 24.76 33.0 23.933 33.0 22.923 33.0 h -9.844 c -1.01 0.0 -1.836 0.0 -2.508 -0.056 c -0.694 -0.057 -1.322 -0.18 -1.908 -0.482 c -0.917 -0.473 -1.663 -1.229 -2.13 -2.158 c -0.3 -0.593 -0.42 -1.229 -0.477 -1.932 C 6.0 27.692 6.0 26.855 6.0 25.832 v -5.131 c 0.0 -0.916 0.0 -1.574 0.135 -2.145 c 0.428 -1.805 1.82 -3.214 3.602 -3.647 c 0.337 -0.082 0.704 -0.115 1.138 -0.128 v -4.566 C 10.875 6.23 14.065 3.0 18.0 3.0 s 7.125 3.23 7.125 7.215 Z m -12.0 0.0 c 0.0 -2.726 2.183 -4.937 4.875 -4.937 s 4.875 2.21 4.875 4.937 v 4.557 h -9.75 v -4.557 Z M 18.0 26.924 c 1.657 0.0 3.0 -1.36 3.0 -3.038 c 0.0 -1.678 -1.343 -3.038 -3.0 -3.038 s -3.0 1.36 -3.0 3.038 c 0.0 1.678 1.343 3.038 3.0 3.038 Z")
        )
    }.build()
}
