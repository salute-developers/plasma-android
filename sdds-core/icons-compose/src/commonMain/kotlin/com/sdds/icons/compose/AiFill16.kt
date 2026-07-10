package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AiFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AiFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.637 5.651 c 0.22 -0.672 1.171 -0.672 1.392 0.0 L 7.564 7.28 c 0.15 0.452 0.505 0.807 0.957 0.955 l 1.627 0.537 c 0.673 0.22 0.673 1.172 0.0 1.393 L 8.521 10.7 c -0.452 0.15 -0.808 0.504 -0.957 0.956 L 7.03 13.282 c -0.22 0.672 -1.171 0.672 -1.392 0.0 l -0.535 -1.627 c -0.15 -0.452 -0.505 -0.807 -0.957 -0.956 l -1.627 -0.535 c -0.672 -0.221 -0.672 -1.172 0.0 -1.393 l 1.627 -0.537 C 4.597 8.086 4.953 7.732 5.102 7.28 l 0.535 -1.628 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.54 2.88 c 0.038 -0.124 0.215 -0.124 0.254 0.0 l 0.294 0.952 c 0.13 0.421 0.46 0.75 0.88 0.88 l 0.952 0.294 c 0.125 0.039 0.125 0.217 0.0 0.256 l -0.951 0.293 c -0.421 0.13 -0.751 0.46 -0.881 0.88 l -0.294 0.952 c -0.039 0.125 -0.216 0.125 -0.255 0.0 l -0.293 -0.951 c -0.13 -0.422 -0.46 -0.751 -0.882 -0.881 l -0.95 -0.293 c -0.126 -0.04 -0.126 -0.217 0.0 -0.256 l 0.95 -0.293 c 0.421 -0.13 0.752 -0.46 0.882 -0.881 l 0.293 -0.951 Z")
        )
    }.build()
}
