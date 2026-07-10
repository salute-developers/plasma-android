package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BusFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BusFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.518 2.036 h 6.964 c 0.813 0.0 1.469 0.0 2.0 0.044 c 0.546 0.044 1.026 0.139 1.47 0.365 c 0.706 0.36 1.28 0.933 1.64 1.639 c 0.226 0.444 0.32 0.924 0.365 1.47 C 21.0 6.087 21.0 6.742 21.0 7.555 v 1.45 h 0.25 c 0.414 0.0 0.75 0.337 0.75 0.75 v 1.497 c 0.0 0.414 -0.336 0.75 -0.75 0.75 H 21.0 v 8.25 c 0.0 0.966 -0.784 1.75 -1.75 1.75 s -1.75 -0.784 -1.75 -1.75 V 19.0 h -11.0 v 1.25 C 6.5 21.216 5.716 22.0 4.75 22.0 S 3.0 21.216 3.0 20.25 v -8.255 H 2.75 c -0.414 0.0 -0.75 -0.335 -0.75 -0.75 V 9.75 C 2.0 9.336 2.336 9.0 2.75 9.0 H 3.0 V 7.554 c 0.0 -0.813 0.0 -1.468 0.043 -2.0 c 0.045 -0.546 0.14 -1.026 0.366 -1.47 c 0.36 -0.706 0.933 -1.28 1.639 -1.64 c 0.444 -0.226 0.924 -0.32 1.47 -0.365 c 0.532 -0.043 1.187 -0.043 2.0 -0.043 Z M 19.5 7.586 V 9.5 h -15.0 V 7.586 c 0.0 -0.852 0.0 -1.447 0.038 -1.91 c 0.037 -0.453 0.107 -0.714 0.207 -0.911 C 4.961 4.34 5.305 3.997 5.73 3.78 c 0.197 -0.1 0.458 -0.17 0.912 -0.207 c 0.462 -0.037 1.057 -0.038 1.91 -0.038 h 6.9 c 0.851 0.0 1.446 0.0 1.908 0.039 c 0.454 0.037 0.715 0.106 0.912 0.206 c 0.424 0.216 0.768 0.56 0.984 0.984 c 0.1 0.197 0.17 0.458 0.207 0.912 c 0.037 0.463 0.038 1.057 0.038 1.91 Z M 7.5 16.0 C 8.328 16.0 9.0 15.33 9.0 14.5 C 9.0 13.672 8.328 13.0 7.5 13.0 S 6.0 13.672 6.0 14.5 C 6.0 15.33 6.672 16.0 7.5 16.0 Z m 9.0 0.0 c 0.828 0.0 1.5 -0.671 1.5 -1.5 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 S 15.0 13.672 15.0 14.5 c 0.0 0.829 0.672 1.5 1.5 1.5 Z")
        )
    }.build()
}
