package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BusOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BusOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 16.0 C 8.328 16.0 9.0 15.33 9.0 14.5 C 9.0 13.672 8.328 13.0 7.5 13.0 S 6.0 13.672 6.0 14.5 C 6.0 15.33 6.672 16.0 7.5 16.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.5 16.0 c 0.828 0.0 1.5 -0.671 1.5 -1.5 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 S 15.0 13.672 15.0 14.5 c 0.0 0.829 0.672 1.5 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.518 2.036 c -0.813 0.0 -1.469 0.0 -2.0 0.043 c -0.546 0.045 -1.026 0.14 -1.47 0.366 c -0.706 0.36 -1.28 0.933 -1.64 1.639 c -0.226 0.444 -0.32 0.924 -0.365 1.47 C 3.0 6.087 3.0 6.742 3.0 7.555 V 9.0 H 2.75 C 2.336 9.0 2.0 9.336 2.0 9.75 v 1.496 c 0.0 0.415 0.336 0.75 0.75 0.75 H 3.0 v 8.254 C 3.0 21.217 3.784 22.0 4.75 22.0 s 1.75 -0.783 1.75 -1.75 V 19.0 h 11.0 v 1.25 c 0.0 0.967 0.784 1.75 1.75 1.75 S 21.0 21.217 21.0 20.25 v -8.249 h 0.25 c 0.414 0.0 0.75 -0.336 0.75 -0.75 V 9.755 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 21.0 v -1.45 c 0.0 -0.814 0.0 -1.47 -0.043 -2.0 c -0.045 -0.547 -0.14 -1.027 -0.366 -1.471 c -0.36 -0.706 -0.933 -1.28 -1.639 -1.639 c -0.444 -0.226 -0.924 -0.32 -1.47 -0.365 c -0.531 -0.044 -1.187 -0.044 -2.0 -0.044 H 8.518 Z M 19.5 9.5 V 7.586 c 0.0 -0.852 0.0 -1.446 -0.038 -1.91 c -0.038 -0.453 -0.107 -0.714 -0.207 -0.911 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 c -0.198 -0.1 -0.459 -0.17 -0.913 -0.206 c -0.462 -0.038 -1.057 -0.039 -1.909 -0.039 h -6.9 c -0.852 0.0 -1.447 0.0 -1.91 0.038 C 6.188 3.612 5.927 3.681 5.73 3.781 C 5.305 3.997 4.96 4.341 4.745 4.765 c -0.1 0.197 -0.17 0.458 -0.207 0.912 C 4.501 6.139 4.5 6.734 4.5 7.587 V 9.5 h 15.0 Z m -15.0 8.0 V 11.0 h 15.0 v 6.5 h -15.0 Z")
        )
    }.build()
}
