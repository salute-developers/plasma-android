package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandPointerFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandPointerFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.637 6.508 c 0.0 -0.512 0.193 -0.877 0.466 -1.119 c 0.28 -0.248 0.663 -0.384 1.058 -0.389 c 0.394 -0.004 0.774 0.122 1.05 0.365 c 0.27 0.237 0.465 0.605 0.465 1.143 v 9.807 c 0.0 0.208 0.168 0.377 0.376 0.377 c 0.207 0.0 0.376 -0.17 0.376 -0.378 v -3.016 c 0.0 -0.676 0.214 -1.148 0.502 -1.448 c 0.29 -0.302 0.677 -0.454 1.064 -0.454 c 0.389 0.0 0.775 0.152 1.065 0.454 c 0.288 0.3 0.502 0.772 0.502 1.448 v 4.188 c 0.0 0.209 0.168 0.377 0.376 0.377 s 0.376 -0.17 0.376 -0.378 v -3.433 c 0.0 -0.783 0.675 -1.302 1.42 -1.293 c 0.36 0.005 0.709 0.138 0.969 0.414 c 0.258 0.275 0.46 0.727 0.46 1.426 v 3.98 c 0.0 0.207 0.168 0.376 0.376 0.376 s 0.376 -0.17 0.376 -0.378 v -2.262 c 0.0 -0.872 0.734 -1.42 1.527 -1.387 c 0.386 0.017 0.767 0.175 1.053 0.501 C 27.781 15.755 28.0 16.28 28.0 17.07 v 6.036 c 0.0 3.922 -3.113 7.002 -6.852 7.732 c -1.86 0.363 -3.86 0.138 -5.68 -0.853 c -1.818 -0.989 -3.482 -2.753 -4.653 -5.51 c -1.965 -5.266 -1.966 -5.27 -2.712 -7.514 l -0.004 -0.01 c -0.31 -0.934 0.148 -1.687 0.796 -1.99 c 0.326 -0.153 0.69 -0.187 1.027 -0.078 c 0.329 0.107 0.662 0.36 0.915 0.842 c 0.172 0.395 0.69 1.518 1.163 2.542 l 0.64 1.38 l 0.28 0.6 c 0.075 0.16 0.25 0.248 0.423 0.21 c 0.172 -0.04 0.294 -0.193 0.294 -0.37 V 6.508 Z")
        )
    }.build()
}
