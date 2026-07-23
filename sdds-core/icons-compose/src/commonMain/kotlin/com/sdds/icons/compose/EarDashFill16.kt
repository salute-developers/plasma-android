package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EarDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EarDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.206 4.788 C 13.396 5.356 13.5 5.966 13.5 6.6 c 0.0 2.123 -1.16 3.971 -2.871 4.92 c -0.74 0.41 -1.327 1.095 -1.766 1.818 C 8.258 14.335 7.173 15.0 5.937 15.0 c -0.82 0.0 -1.572 -0.293 -2.163 -0.78 l 9.432 -9.432 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.0 c 1.68 0.0 3.184 0.768 4.193 1.978 l 1.332 -1.332 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.195 0.194 -0.511 0.194 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.709 l 1.003 -1.004 C 2.553 12.198 2.5 11.855 2.5 11.5 c 0.0 -0.315 0.04 -0.62 0.117 -0.911 c 0.213 -0.806 0.3 -1.69 0.081 -2.494 C 2.57 7.619 2.5 7.117 2.5 6.6 C 2.5 3.507 4.963 1.0 8.0 1.0 Z M 7.664 3.142 C 7.027 3.206 6.42 3.45 5.914 3.846 C 5.406 4.24 5.02 4.773 4.795 5.379 C 4.572 5.985 4.52 6.642 4.644 7.276 C 4.767 7.911 5.064 8.5 5.499 8.973 c 0.113 0.122 0.207 0.268 0.28 0.42 l 0.735 -0.736 C 6.43 8.527 6.336 8.405 6.235 8.295 c -0.31 -0.337 -0.521 -0.756 -0.61 -1.21 c -0.089 -0.455 -0.05 -0.926 0.11 -1.36 c 0.16 -0.433 0.435 -0.81 0.794 -1.091 c 0.359 -0.28 0.787 -0.452 1.235 -0.497 c 0.448 -0.045 0.9 0.039 1.304 0.242 c 0.368 0.185 0.683 0.463 0.917 0.807 l 0.716 -0.716 c -0.316 -0.413 -0.72 -0.751 -1.184 -0.985 C 8.943 3.197 8.3 3.078 7.664 3.142 Z")
        )
    }.build()
}
