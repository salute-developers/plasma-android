package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AiFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AiFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.682 12.715 c 0.498 -1.512 2.637 -1.512 3.134 0.0 l 1.205 3.662 c 0.334 1.018 1.134 1.815 2.152 2.15 l 3.662 1.206 c 1.512 0.498 1.512 2.637 0.0 3.135 l -3.662 1.204 c -1.018 0.335 -1.817 1.134 -2.152 2.152 l -1.205 3.66 c -0.497 1.513 -2.636 1.513 -3.134 0.0 l -1.204 -3.66 c -0.335 -1.018 -1.134 -1.817 -2.152 -2.152 l -3.66 -1.204 c -1.513 -0.498 -1.513 -2.637 0.0 -3.135 l 3.66 -1.206 c 1.018 -0.335 1.817 -1.132 2.152 -2.15 l 1.204 -3.662 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.963 6.48 c 0.088 -0.28 0.487 -0.28 0.574 0.0 l 0.66 2.14 c 0.293 0.948 1.035 1.691 1.982 1.984 l 2.141 0.659 c 0.282 0.087 0.282 0.487 0.0 0.574 l -2.14 0.66 c -0.948 0.292 -1.69 1.035 -1.983 1.983 l -0.66 2.14 c -0.087 0.282 -0.486 0.282 -0.573 0.0 l -0.66 -2.14 c -0.293 -0.948 -1.036 -1.691 -1.984 -1.983 l -2.14 -0.66 c -0.282 -0.087 -0.282 -0.487 0.0 -0.574 l 2.14 -0.66 c 0.948 -0.292 1.69 -1.034 1.983 -1.982 l 0.66 -2.14 Z")
        )
    }.build()
}
