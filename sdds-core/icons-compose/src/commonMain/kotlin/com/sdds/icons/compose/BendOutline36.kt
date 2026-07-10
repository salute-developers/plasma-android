package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BendOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BendOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 7.8 c 1.978 0.0 3.63 1.393 4.031 3.25 H 32.0 c 0.552 0.0 1.0 0.449 1.0 1.0 c 0.0 0.553 -0.448 1.0 -1.0 1.0 h -7.13 c 2.212 1.625 3.828 4.012 4.46 6.776 c 2.064 0.227 3.67 1.976 3.67 4.1 c 0.0 2.278 -1.847 4.125 -4.125 4.125 s -4.125 -1.847 -4.125 -4.125 c 0.0 -1.735 1.071 -3.219 2.588 -3.828 c -0.732 -2.944 -2.816 -5.351 -5.557 -6.524 l 0.004 -0.009 c -0.634 1.463 -2.09 2.486 -3.785 2.486 c -1.7 0.0 -3.158 -1.028 -3.79 -2.496 l 0.008 0.02 c -2.74 1.172 -4.826 3.58 -5.557 6.523 c 1.517 0.609 2.589 2.093 2.589 3.828 c 0.0 2.278 -1.847 4.125 -4.125 4.125 S 3.0 26.204 3.0 23.926 c 0.0 -2.124 1.605 -3.873 3.669 -4.1 c 0.632 -2.764 2.248 -5.151 4.46 -6.775 H 4.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 9.969 C 14.37 9.193 16.022 7.8 18.0 7.8 Z m -10.875 14.0 C 5.951 21.8 5.0 22.753 5.0 23.927 c 0.0 1.173 0.951 2.125 2.125 2.125 s 2.125 -0.952 2.125 -2.125 c 0.0 -1.174 -0.951 -2.125 -2.125 -2.125 Z m 21.75 0.0 c -1.174 0.0 -2.125 0.952 -2.125 2.126 c 0.0 1.173 0.951 2.125 2.125 2.125 S 31.0 25.099 31.0 23.926 c 0.0 -1.174 -0.951 -2.125 -2.125 -2.125 Z M 18.0 9.8 c -1.174 0.0 -2.125 0.952 -2.125 2.126 c 0.0 1.173 0.951 2.125 2.125 2.125 s 2.125 -0.952 2.125 -2.125 c 0.0 -1.174 -0.951 -2.125 -2.125 -2.125 Z")
        )
    }.build()
}
