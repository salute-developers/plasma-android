package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicOffFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicOffFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.918 7.878 c 0.274 0.036 0.467 0.287 0.43 0.56 c -0.148 1.13 -0.703 2.169 -1.56 2.92 c -0.731 0.641 -1.64 1.037 -2.599 1.14 v 1.627 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -1.627 c -0.41 -0.044 -0.81 -0.14 -1.192 -0.288 l 0.795 -0.795 c 0.291 0.073 0.593 0.11 0.897 0.11 c 0.898 0.0 1.765 -0.327 2.44 -0.919 c 0.675 -0.591 1.111 -1.409 1.228 -2.298 c 0.037 -0.274 0.287 -0.466 0.56 -0.43 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.725 1.0 c 1.353 0.0 2.45 1.175 2.45 2.625 v 1.584 l 3.563 -3.563 c 0.196 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.195 0.194 -0.512 0.194 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.709 l 2.443 -2.443 c -0.693 -0.72 -1.14 -1.646 -1.272 -2.644 c -0.036 -0.273 0.157 -0.524 0.43 -0.56 c 0.275 -0.036 0.525 0.156 0.561 0.43 c 0.103 0.778 0.45 1.502 0.988 2.067 l 0.85 -0.85 c -0.363 -0.459 -0.583 -1.052 -0.583 -1.7 v -4.2 C 5.275 2.175 6.372 1.0 7.725 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.167 8.04 c -0.101 1.338 -1.14 2.393 -2.41 2.41 l 2.41 -2.41 Z")
        )
    }.build()
}
