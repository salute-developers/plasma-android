package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Waves16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Waves16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.432 1.148 C 8.627 0.952 8.943 0.95 9.14 1.145 c 0.906 0.9 1.626 1.968 2.116 3.145 c 0.49 1.176 0.743 2.436 0.743 3.71 c 0.0 1.273 -0.252 2.534 -0.743 3.71 c -0.49 1.176 -1.21 2.244 -2.116 3.144 c -0.196 0.195 -0.512 0.194 -0.707 -0.002 c -0.194 -0.196 -0.193 -0.513 0.003 -0.707 c 0.813 -0.808 1.457 -1.766 1.897 -2.82 c 0.44 -1.054 0.666 -2.184 0.666 -3.325 s -0.226 -2.271 -0.666 -3.325 c -0.44 -1.055 -1.084 -2.013 -1.897 -2.82 C 8.239 1.66 8.238 1.344 8.432 1.148 Z M 4.194 5.882 c 0.219 -0.169 0.533 -0.128 0.702 0.09 C 5.345 6.553 5.589 7.266 5.589 8.0 c 0.0 0.733 -0.244 1.446 -0.693 2.027 c -0.17 0.219 -0.483 0.259 -0.702 0.09 c -0.218 -0.169 -0.258 -0.483 -0.09 -0.701 C 4.42 9.009 4.59 8.51 4.59 8.0 c 0.0 -0.512 -0.17 -1.01 -0.485 -1.416 c -0.168 -0.219 -0.128 -0.533 0.09 -0.702 Z M 6.748 3.52 C 6.552 3.326 6.235 3.327 6.04 3.523 C 5.846 3.719 5.847 4.035 6.043 4.23 c 0.5 0.495 0.895 1.083 1.164 1.73 c 0.27 0.647 0.41 1.34 0.41 2.04 s -0.14 1.393 -0.41 2.04 c -0.27 0.646 -0.665 1.234 -1.164 1.73 c -0.196 0.194 -0.197 0.51 -0.002 0.707 c 0.194 0.196 0.51 0.197 0.707 0.002 c 0.592 -0.588 1.062 -1.286 1.382 -2.054 C 8.451 9.656 8.616 8.832 8.616 8.0 c 0.0 -0.832 -0.165 -1.656 -0.486 -2.425 C 7.81 4.806 7.34 4.108 6.748 3.52 Z")
        )
    }.build()
}
