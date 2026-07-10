package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDoneFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDoneFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.828 3.74 c -0.504 -0.32 -1.152 -0.32 -1.656 0.0 c -0.585 0.373 -2.397 1.49 -4.63 2.51 c -2.267 1.036 -4.817 1.9 -6.917 1.9 C 5.004 8.15 4.5 8.64 4.5 9.24 c 0.0 10.198 3.046 16.013 6.32 19.295 c 3.255 3.262 6.602 3.886 6.979 3.948 l 0.008 0.001 l 0.03 0.005 C 17.867 32.493 17.925 32.5 18.0 32.5 c 0.075 0.0 0.133 -0.007 0.163 -0.011 l 0.03 -0.005 H 18.2 l 0.002 -0.001 c 0.377 -0.062 3.724 -0.686 6.978 -3.948 c 3.275 -3.282 6.321 -9.097 6.321 -19.294 c 0.0 -0.602 -0.504 -1.09 -1.125 -1.09 c -2.1 0.0 -4.65 -0.865 -6.916 -1.9 c -2.234 -1.021 -4.046 -2.138 -4.631 -2.51 Z m 5.887 11.288 c 0.386 -0.394 0.38 -1.027 -0.016 -1.414 c -0.394 -0.386 -1.027 -0.379 -1.414 0.016 l -6.457 6.599 l -2.677 -2.298 c -0.419 -0.36 -1.05 -0.311 -1.41 0.108 c -0.36 0.42 -0.311 1.05 0.108 1.41 l 3.388 2.908 c 0.4 0.343 0.997 0.317 1.366 -0.06 l 7.112 -7.269 Z")
        )
    }.build()
}
