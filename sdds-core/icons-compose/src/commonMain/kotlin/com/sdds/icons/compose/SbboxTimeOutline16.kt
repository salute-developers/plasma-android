package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxTimeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxTimeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.884 6.328 c 0.205 0.205 0.206 0.537 0.002 0.743 l -1.613 1.618 c -0.162 0.177 -0.43 0.225 -0.648 0.1 L 7.998 7.856 C 7.747 7.712 7.66 7.39 7.804 7.139 C 7.95 6.888 8.27 6.801 8.521 6.945 l 1.277 0.733 l 1.344 -1.349 c 0.204 -0.205 0.537 -0.206 0.742 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.06 3.775 C 6.259 3.518 6.493 3.29 6.764 3.1 C 7.344 2.693 8.024 2.5 8.74 2.5 c 1.703 0.001 3.619 1.093 4.923 2.99 c 1.853 2.697 1.768 5.999 -0.19 7.376 c -0.503 0.354 -1.082 0.546 -1.696 0.59 c -0.087 0.007 -0.175 0.01 -0.264 0.01 l -8.6 0.002 c -1.627 0.0 -2.557 -2.102 -1.395 -3.735 L 6.06 3.775 Z M 5.239 6.502 l -2.913 3.823 C 1.95 10.86 1.936 11.43 2.1 11.843 c 0.167 0.42 0.481 0.625 0.814 0.625 l 5.635 -0.001 c -0.729 -0.497 -1.41 -1.168 -1.975 -1.99 c -0.878 -1.28 -1.321 -2.694 -1.335 -3.975 Z m 7.56 -0.417 c 0.813 1.184 1.178 2.469 1.15 3.561 c -0.028 1.094 -0.439 1.91 -1.079 2.361 c -0.381 0.269 -0.84 0.408 -1.36 0.41 c -1.279 0.004 -2.908 -0.844 -4.07 -2.535 c -1.443 -2.1 -1.413 -4.349 -0.55 -5.465 c 0.137 -0.176 0.296 -0.33 0.478 -0.457 c 0.637 -0.448 1.527 -0.55 2.541 -0.2 c 1.014 0.351 2.076 1.14 2.89 2.325 Z")
        )
    }.build()
}
