package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDoneOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDoneOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.9 3.235 C 6.827 2.793 7.604 2.317 8.0 2.063 c 0.396 0.254 1.173 0.73 2.1 1.172 c 0.935 0.445 2.073 0.88 3.146 0.992 c -0.087 4.431 -1.389 6.85 -2.646 8.165 c -1.142 1.195 -2.294 1.527 -2.6 1.598 c -0.306 -0.07 -1.458 -0.403 -2.6 -1.598 c -1.257 -1.315 -2.559 -3.734 -2.645 -8.165 C 3.828 4.116 4.965 3.68 5.9 3.235 Z m 2.476 -2.121 c -0.229 -0.152 -0.523 -0.152 -0.751 0.0 C 7.35 1.295 6.508 1.837 5.469 2.332 C 4.416 2.834 3.23 3.254 2.25 3.254 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 4.934 1.412 7.744 2.927 9.329 c 1.507 1.576 3.057 1.879 3.232 1.909 h 0.002 h 0.003 l 0.014 0.002 C 7.942 14.996 7.968 15.0 8.0 15.0 c 0.033 0.0 0.059 -0.003 0.073 -0.005 l 0.014 -0.002 H 8.09 H 8.09 c 0.175 -0.03 1.725 -0.333 3.232 -1.91 c 1.515 -1.584 2.927 -4.394 2.927 -9.328 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.979 0.0 -2.166 -0.42 -3.22 -0.922 C 9.493 1.837 8.65 1.295 8.377 1.114 Z m 2.776 5.448 c 0.189 -0.201 0.179 -0.518 -0.023 -0.706 c -0.201 -0.19 -0.518 -0.18 -0.707 0.022 l -2.97 3.167 l -1.21 -1.083 C 6.036 7.777 5.72 7.795 5.536 8.0 C 5.35 8.206 5.369 8.523 5.575 8.707 l 1.574 1.409 c 0.202 0.181 0.512 0.168 0.698 -0.03 l 3.305 -3.524 Z")
        )
    }.build()
}
