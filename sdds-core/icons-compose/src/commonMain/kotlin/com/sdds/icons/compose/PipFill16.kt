package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PipFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PipFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.706 1.75 h 8.397 c 0.369 0.0 0.677 0.0 0.928 0.02 c 0.263 0.022 0.509 0.069 0.742 0.188 c 0.357 0.183 0.648 0.475 0.83 0.835 c 0.118 0.234 0.165 0.482 0.186 0.745 c 0.02 0.253 0.02 0.563 0.02 0.934 V 8.0 h -4.72 C 9.723 8.0 9.41 8.0 9.151 8.02 C 8.879 8.044 8.607 8.093 8.346 8.227 c -0.39 0.2 -0.707 0.518 -0.905 0.91 C 7.308 9.4 7.258 9.673 7.236 9.947 c -0.021 0.26 -0.021 0.577 -0.021 0.943 v 1.971 H 3.706 c -0.368 0.0 -0.676 0.0 -0.928 -0.02 c -0.262 -0.022 -0.508 -0.069 -0.741 -0.188 c -0.358 -0.183 -0.648 -0.475 -0.83 -0.835 c -0.119 -0.234 -0.165 -0.482 -0.186 -0.745 C 1.0 10.82 1.0 10.51 1.0 10.139 V 4.472 C 1.0 4.1 1.0 3.792 1.02 3.538 c 0.022 -0.263 0.068 -0.511 0.187 -0.745 c 0.182 -0.36 0.472 -0.652 0.83 -0.835 c 0.233 -0.12 0.479 -0.166 0.741 -0.187 C 3.03 1.75 3.338 1.75 3.706 1.75 Z m 4.35 7.709 c -0.152 0.3 -0.152 0.691 -0.152 1.475 v 1.076 c 0.0 0.784 0.0 1.176 0.153 1.476 c 0.134 0.263 0.348 0.477 0.612 0.611 c 0.3 0.153 0.691 0.153 1.475 0.153 h 3.115 c 0.785 0.0 1.177 0.0 1.476 -0.153 c 0.264 -0.134 0.478 -0.348 0.612 -0.611 c 0.152 -0.3 0.152 -0.692 0.152 -1.476 v -1.076 c 0.0 -0.784 0.0 -1.176 -0.152 -1.475 c -0.134 -0.264 -0.348 -0.478 -0.612 -0.612 c -0.3 -0.153 -0.691 -0.153 -1.476 -0.153 h -3.115 c -0.784 0.0 -1.176 0.0 -1.475 0.153 C 8.405 8.981 8.19 9.195 8.057 9.459 Z")
        )
    }.build()
}
