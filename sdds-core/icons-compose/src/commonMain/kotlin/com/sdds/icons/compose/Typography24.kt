package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Typography24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Typography24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.0 19.0 h -1.985 l -1.233 -3.52 H 5.1 L 3.883 19.0 H 2.0 L 6.896 5.0 h 2.14 L 14.0 19.0 Z m -8.234 -5.48 h 4.33 L 7.924 7.26 l -2.157 6.26 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.019 9.0 c 0.641 0.0 1.207 0.065 1.698 0.193 c 0.503 0.116 0.925 0.31 1.264 0.58 c 0.34 0.27 0.592 0.63 0.755 1.08 C 21.912 11.292 22.0 11.832 22.0 12.476 v 6.37 h -1.773 v -1.679 c -0.24 0.54 -0.636 0.985 -1.189 1.332 C 18.485 18.833 17.83 19.0 17.075 19.0 c -0.943 0.0 -1.691 -0.258 -2.245 -0.773 c -0.553 -0.514 -0.83 -1.254 -0.83 -2.22 c 0.0 -0.54 0.088 -0.984 0.264 -1.331 c 0.188 -0.36 0.453 -0.644 0.793 -0.85 c 0.34 -0.219 0.748 -0.373 1.226 -0.463 c 0.49 -0.09 1.038 -0.136 1.642 -0.136 h 2.188 V 12.63 c 0.0 -0.746 -0.189 -1.254 -0.566 -1.524 c -0.365 -0.284 -0.874 -0.425 -1.528 -0.425 c -0.805 0.0 -1.478 0.16 -2.019 0.482 c -0.528 0.322 -0.956 0.753 -1.283 1.294 V 9.907 c 0.314 -0.244 0.748 -0.456 1.302 -0.636 c 0.553 -0.18 1.22 -0.271 2.0 -0.271 Z m 0.076 5.599 c -0.755 0.0 -1.31 0.09 -1.661 0.27 c -0.352 0.168 -0.529 0.496 -0.529 0.985 c 0.0 0.411 0.146 0.746 0.435 1.003 c 0.29 0.258 0.717 0.386 1.283 0.386 c 0.427 0.0 0.792 -0.058 1.094 -0.174 c 0.302 -0.116 0.553 -0.257 0.755 -0.424 c 0.2 -0.18 0.352 -0.367 0.453 -0.56 c 0.1 -0.206 0.163 -0.392 0.188 -0.56 V 14.6 h -2.018 Z")
        )
    }.build()
}
