package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HouseOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HouseOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.609 3.651 c 0.256 -0.069 0.526 -0.069 0.782 0.0 c 0.255 0.07 0.511 0.25 1.355 0.904 l 7.795 6.04 c 0.327 0.255 0.798 0.195 1.052 -0.133 c 0.254 -0.327 0.194 -0.798 -0.134 -1.052 l -7.908 -6.129 c -0.677 -0.525 -1.185 -0.92 -1.769 -1.078 c -0.512 -0.138 -1.052 -0.138 -1.564 0.0 c -0.584 0.158 -1.092 0.553 -1.77 1.078 l -7.907 6.13 c -0.328 0.253 -0.388 0.724 -0.134 1.051 c 0.254 0.328 0.725 0.388 1.052 0.134 l 7.795 -6.041 c 0.844 -0.654 1.1 -0.835 1.355 -0.904 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 12.003 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 3.0 11.589 3.0 12.003 v 5.681 c 0.0 0.604 0.0 1.102 0.033 1.508 c 0.035 0.421 0.109 0.809 0.294 1.173 c 0.288 0.565 0.747 1.023 1.311 1.311 c 0.364 0.186 0.752 0.26 1.173 0.294 c 0.406 0.033 0.904 0.033 1.508 0.033 h 9.362 c 0.604 0.0 1.102 0.0 1.508 -0.033 c 0.421 -0.035 0.809 -0.108 1.173 -0.294 c 0.565 -0.288 1.023 -0.746 1.311 -1.311 c 0.186 -0.364 0.26 -0.752 0.294 -1.173 C 21.0 18.786 21.0 18.288 21.0 17.684 v -5.681 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 5.65 c 0.0 0.642 0.0 1.08 -0.028 1.417 c -0.027 0.328 -0.076 0.497 -0.136 0.614 c -0.143 0.282 -0.373 0.512 -0.655 0.655 c -0.117 0.06 -0.285 0.109 -0.614 0.136 c -0.338 0.027 -0.774 0.028 -1.417 0.028 H 15.5 v -5.0 c 0.0 -1.933 -1.567 -3.5 -3.5 -3.5 s -3.5 1.567 -3.5 3.5 v 5.0 H 7.35 c -0.642 0.0 -1.08 0.0 -1.417 -0.028 c -0.329 -0.027 -0.497 -0.076 -0.614 -0.136 c -0.282 -0.143 -0.512 -0.373 -0.655 -0.655 c -0.06 -0.117 -0.109 -0.286 -0.136 -0.614 C 4.501 18.732 4.5 18.295 4.5 17.653 v -5.65 Z m 9.5 3.5 v 5.0 h -4.0 v -5.0 c 0.0 -1.105 0.896 -2.0 2.0 -2.0 c 1.105 0.0 2.0 0.895 2.0 2.0 Z")
        )
    }.build()
}
