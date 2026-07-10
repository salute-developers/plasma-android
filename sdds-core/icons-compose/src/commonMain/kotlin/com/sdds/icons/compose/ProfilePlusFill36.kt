package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePlusFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePlusFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 24.376 11.023 c 0.0 3.521 -2.854 6.375 -6.375 6.375 c -3.52 0.0 -6.375 -2.854 -6.375 -6.375 c 0.0 -3.52 2.854 -6.375 6.375 -6.375 s 6.375 2.855 6.375 6.375 Z m -6.859 19.875 c -0.651 -1.327 -1.017 -2.82 -1.017 -4.4 c 0.0 -2.292 0.771 -4.404 2.069 -6.091 c -0.188 -0.006 -0.377 -0.009 -0.566 -0.009 c -4.34 0.0 -8.371 1.498 -11.711 4.06 c -0.687 0.528 -1.066 1.363 -1.04 2.229 c 0.031 0.988 0.122 1.63 0.394 2.164 c 0.36 0.706 0.933 1.28 1.639 1.639 c 0.802 0.408 1.852 0.408 3.953 0.408 h 6.28 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 34.998 c 4.694 0.0 8.5 -3.805 8.5 -8.5 c 0.0 -4.694 -3.806 -8.5 -8.5 -8.5 s -8.5 3.806 -8.5 8.5 c 0.0 4.695 3.806 8.5 8.5 8.5 Z m 0.75 -13.136 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 3.886 h -3.886 c -0.415 0.0 -0.75 0.336 -0.75 0.75 c 0.0 0.415 0.335 0.75 0.75 0.75 h 3.886 v 3.887 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -3.887 h 3.887 c 0.414 0.0 0.75 -0.335 0.75 -0.75 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 27.25 v -3.886 Z")
        )
    }.build()
}
