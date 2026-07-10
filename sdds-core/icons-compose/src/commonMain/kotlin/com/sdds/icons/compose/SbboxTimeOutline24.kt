package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxTimeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxTimeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.549 9.469 c 0.293 0.292 0.294 0.767 0.002 1.06 l -2.311 2.32 c -0.194 0.205 -0.489 0.284 -0.76 0.203 c -0.06 -0.018 -0.118 -0.043 -0.174 -0.077 l -2.308 -1.324 c -0.36 -0.207 -0.484 -0.665 -0.278 -1.024 c 0.207 -0.36 0.665 -0.484 1.024 -0.278 l 1.826 1.048 l 1.918 -1.926 c 0.292 -0.294 0.767 -0.295 1.06 -0.002 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.734 19.668 c -2.324 0.0 -3.652 -3.002 -1.992 -5.335 L 9.229 5.82 c 0.283 -0.367 0.619 -0.691 1.005 -0.963 c 0.826 -0.58 1.793 -0.857 2.814 -0.858 c 2.436 -0.003 5.178 1.558 7.043 4.272 c 2.647 3.852 2.526 8.57 -0.27 10.536 c -0.72 0.507 -1.547 0.781 -2.423 0.845 c -0.125 0.009 -0.251 0.013 -0.378 0.014 L 4.734 19.668 Z m 12.28 -1.501 h 0.003 c 0.741 -0.003 1.396 -0.202 1.94 -0.586 c 0.915 -0.642 1.5 -1.81 1.54 -3.372 c 0.04 -1.56 -0.48 -3.396 -1.642 -5.088 c -1.163 -1.691 -2.679 -2.819 -4.128 -3.32 c -0.59 -0.205 -1.15 -0.302 -1.669 -0.302 c -0.755 0.0 -1.422 0.207 -1.961 0.586 c -0.26 0.183 -0.487 0.402 -0.682 0.654 l -0.003 0.004 l -0.021 0.028 c -1.21 1.605 -1.238 4.796 0.809 7.774 c 1.652 2.404 3.964 3.616 5.786 3.622 h 0.028 Z m -4.333 0.0 c -1.002 -0.702 -1.937 -1.636 -2.718 -2.772 c -1.228 -1.788 -1.86 -3.763 -1.906 -5.562 L 3.951 15.22 c -0.52 0.744 -0.54 1.533 -0.314 2.1 c 0.23 0.578 0.656 0.848 1.097 0.848 h 7.947 Z")
        )
    }.build()
}
