package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Scene3DFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Scene3DFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.939 4.742 l -0.027 -0.01 C 3.76 4.677 3.594 4.616 3.452 4.575 C 3.335 4.541 3.02 4.451 2.664 4.534 C 2.277 4.623 1.959 4.846 1.742 5.18 C 1.547 5.482 1.52 5.798 1.511 5.926 C 1.5 6.071 1.5 6.243 1.5 6.396 v 16.966 c 0.0 0.13 0.0 0.287 0.011 0.423 c 0.012 0.14 0.044 0.425 0.221 0.706 c 0.206 0.326 0.518 0.555 0.89 0.652 c 0.326 0.085 0.61 0.026 0.743 -0.005 c 0.134 -0.031 0.285 -0.08 0.412 -0.12 l 0.025 -0.009 c 0.663 -0.212 1.748 -0.525 3.222 -0.837 c -0.098 -0.595 -0.149 -1.206 -0.149 -1.828 c 0.0 -6.16 4.978 -11.16 11.125 -11.16 s 11.125 5.0 11.125 11.16 c 0.0 0.622 -0.05 1.233 -0.149 1.828 c 1.474 0.312 2.56 0.625 3.222 0.837 l 0.025 0.009 c 0.127 0.04 0.278 0.089 0.412 0.12 c 0.133 0.031 0.417 0.09 0.743 0.005 c 0.372 -0.097 0.684 -0.326 0.89 -0.652 c 0.177 -0.281 0.21 -0.567 0.22 -0.706 c 0.012 -0.136 0.012 -0.294 0.012 -0.423 V 6.396 c 0.0 -0.153 0.0 -0.325 -0.01 -0.47 c -0.01 -0.128 -0.037 -0.444 -0.232 -0.746 c -0.217 -0.334 -0.535 -0.557 -0.922 -0.646 c -0.356 -0.083 -0.671 0.007 -0.788 0.041 c -0.142 0.04 -0.308 0.102 -0.46 0.157 l -0.026 0.01 C 30.44 5.337 26.155 6.54 18.0 6.54 S 5.56 5.337 3.939 4.742 Z m 4.936 17.602 c 0.0 -5.063 4.089 -9.16 9.125 -9.16 s 9.125 4.098 9.125 9.16 s -4.089 9.16 -9.125 9.16 s -9.125 -4.098 -9.125 -9.16 Z")
        )
    }.build()
}
