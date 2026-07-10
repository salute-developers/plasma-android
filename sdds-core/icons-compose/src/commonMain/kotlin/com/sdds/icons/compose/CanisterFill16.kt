package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CanisterFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CanisterFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.581 2.358 c 0.28 -0.225 0.326 -0.634 0.102 -0.914 c -0.225 -0.28 -0.634 -0.326 -0.914 -0.102 L 12.35 1.677 c -0.276 0.22 -0.462 0.37 -0.623 0.538 c -0.428 0.449 -0.725 1.003 -0.864 1.603 c -0.579 -0.253 -1.217 -0.393 -1.889 -0.393 H 8.763 c -0.01 -0.128 -0.024 -0.242 -0.05 -0.35 C 8.515 2.252 7.873 1.61 7.05 1.412 C 6.79 1.35 6.49 1.35 6.066 1.35 H 5.633 c -0.393 0.0 -0.713 0.0 -0.975 0.018 c -0.27 0.018 -0.512 0.057 -0.744 0.153 C 3.363 1.75 2.924 2.188 2.696 2.74 C 2.6 2.97 2.561 3.214 2.543 3.483 C 2.525 3.745 2.525 4.065 2.525 4.457 v 0.905 C 2.509 5.472 2.5 5.585 2.5 5.7 v 6.65 c 0.0 1.256 1.019 2.275 2.275 2.275 h 6.65 c 1.256 0.0 2.275 -1.019 2.275 -2.275 v -4.2 c 0.0 -1.422 -0.628 -2.698 -1.623 -3.564 c 0.002 -0.126 0.007 -0.204 0.017 -0.279 c 0.061 -0.449 0.262 -0.867 0.575 -1.195 c 0.093 -0.097 0.206 -0.19 0.529 -0.448 l 0.383 -0.306 Z M 6.817 2.384 C 6.687 2.354 6.517 2.35 6.0 2.35 H 5.65 c -0.415 0.0 -0.7 0.0 -0.923 0.015 c -0.22 0.015 -0.34 0.043 -0.43 0.08 c -0.307 0.127 -0.55 0.37 -0.677 0.677 c -0.037 0.09 -0.065 0.21 -0.08 0.43 c -0.005 0.073 -0.008 0.154 -0.01 0.244 c 0.358 -0.235 0.785 -0.371 1.245 -0.371 H 7.76 C 7.755 3.379 7.749 3.342 7.74 3.308 C 7.63 2.851 7.274 2.494 6.817 2.384 Z M 6.179 6.396 c -0.196 -0.195 -0.512 -0.195 -0.708 0.0 c -0.195 0.196 -0.195 0.512 0.0 0.708 l 1.922 1.921 l -1.922 1.921 c -0.195 0.196 -0.195 0.512 0.0 0.707 c 0.196 0.196 0.512 0.196 0.708 0.0 L 8.1 9.733 l 1.921 1.92 c 0.196 0.196 0.512 0.196 0.708 0.0 c 0.195 -0.195 0.195 -0.511 0.0 -0.707 L 8.807 9.025 l 1.922 -1.921 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 c -0.196 -0.195 -0.512 -0.195 -0.708 0.0 L 8.1 8.318 L 6.179 6.396 Z")
        )
    }.build()
}
