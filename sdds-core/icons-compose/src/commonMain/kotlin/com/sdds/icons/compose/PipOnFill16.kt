package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PipOnFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PipOnFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.103 1.75 H 3.706 c -0.369 0.0 -0.676 0.0 -0.928 0.02 C 2.516 1.793 2.27 1.84 2.037 1.959 c -0.358 0.183 -0.648 0.475 -0.83 0.835 c -0.119 0.234 -0.165 0.482 -0.186 0.745 C 1.0 3.791 1.0 4.101 1.0 4.472 v 5.667 c 0.0 0.371 0.0 0.68 0.02 0.934 c 0.022 0.263 0.068 0.511 0.187 0.745 c 0.182 0.36 0.472 0.652 0.83 0.835 c 0.233 0.12 0.479 0.166 0.741 0.188 c 0.252 0.02 0.56 0.02 0.928 0.02 h 3.509 V 10.89 c 0.0 -0.366 0.0 -0.682 0.021 -0.942 c 0.022 -0.275 0.072 -0.548 0.205 -0.81 c 0.198 -0.393 0.515 -0.711 0.905 -0.911 c 0.261 -0.134 0.533 -0.183 0.806 -0.206 C 9.41 8.0 9.724 8.0 10.088 8.0 h 4.72 V 4.472 c 0.0 -0.371 0.0 -0.68 -0.02 -0.934 c -0.021 -0.263 -0.068 -0.511 -0.186 -0.745 c -0.182 -0.36 -0.473 -0.652 -0.83 -0.835 c -0.233 -0.12 -0.479 -0.166 -0.741 -0.187 c -0.252 -0.021 -0.56 -0.021 -0.928 -0.021 Z M 5.834 7.112 c 0.276 0.0 0.5 -0.224 0.5 -0.5 V 3.665 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 V 5.4 l -2.08 -2.091 C 3.06 3.112 2.743 3.11 2.547 3.306 C 2.351 3.5 2.35 3.816 2.545 4.013 l 2.087 2.099 H 2.905 c -0.276 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.276 0.224 0.5 0.5 0.5 h 2.929 Z m 2.223 2.347 c -0.153 0.3 -0.153 0.691 -0.153 1.475 v 1.076 c 0.0 0.784 0.0 1.176 0.153 1.476 c 0.134 0.263 0.348 0.477 0.612 0.611 c 0.3 0.153 0.691 0.153 1.475 0.153 h 3.115 c 0.784 0.0 1.176 0.0 1.476 -0.153 c 0.263 -0.134 0.477 -0.348 0.612 -0.611 c 0.152 -0.3 0.152 -0.692 0.152 -1.476 v -1.076 c 0.0 -0.784 0.0 -1.176 -0.152 -1.475 c -0.135 -0.264 -0.349 -0.478 -0.612 -0.612 c -0.3 -0.153 -0.692 -0.153 -1.476 -0.153 h -3.115 c -0.784 0.0 -1.176 0.0 -1.475 0.153 C 8.405 8.981 8.19 9.195 8.057 9.459 Z")
        )
    }.build()
}
