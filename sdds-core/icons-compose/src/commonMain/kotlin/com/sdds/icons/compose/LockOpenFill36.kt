package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LockOpenFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LockOpenFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.125 9.646 c 0.0 -2.412 1.93 -4.368 4.313 -4.368 c 2.381 0.0 4.312 1.956 4.312 4.368 v 7.405 c 0.0 0.629 0.504 1.139 1.125 1.139 S 33.0 17.68 33.0 17.05 V 9.647 C 33.0 5.976 30.062 3.0 26.437 3.0 c -3.624 0.0 -6.562 2.975 -6.562 6.646 v 5.126 h -9.797 c -1.01 0.0 -1.836 0.0 -2.508 0.056 c -0.694 0.057 -1.322 0.18 -1.908 0.482 c -0.917 0.473 -1.663 1.229 -2.13 2.158 c -0.3 0.593 -0.42 1.229 -0.477 1.932 C 3.0 20.08 3.0 20.917 3.0 21.94 v 3.892 c 0.0 1.023 0.0 1.86 0.055 2.54 c 0.057 0.703 0.178 1.339 0.476 1.933 c 0.468 0.928 1.214 1.684 2.13 2.157 c 0.587 0.302 1.215 0.425 1.91 0.482 C 8.24 33.0 9.067 33.0 10.077 33.0 h 9.844 c 1.01 0.0 1.836 0.0 2.508 -0.056 c 0.695 -0.057 1.322 -0.18 1.908 -0.482 c 0.918 -0.473 1.663 -1.229 2.13 -2.158 c 0.3 -0.593 0.42 -1.229 0.477 -1.932 C 27.0 27.692 27.0 26.855 27.0 25.832 v -5.131 c 0.0 -0.916 0.0 -1.574 -0.135 -2.145 c -0.428 -1.805 -1.82 -3.214 -3.602 -3.647 c -0.337 -0.082 -0.704 -0.115 -1.138 -0.128 V 9.646 Z M 15.0 26.924 c 1.657 0.0 3.0 -1.36 3.0 -3.038 c 0.0 -1.678 -1.343 -3.038 -3.0 -3.038 s -3.0 1.36 -3.0 3.038 c 0.0 1.678 1.343 3.038 3.0 3.038 Z")
        )
    }.build()
}
