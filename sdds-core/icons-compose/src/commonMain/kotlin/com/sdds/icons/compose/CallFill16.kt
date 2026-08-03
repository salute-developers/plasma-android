package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.983 1.43 c -0.238 -0.063 -0.5 -0.031 -0.787 0.134 C 4.742 1.826 3.72 2.417 3.247 3.7 C 2.775 4.982 2.854 6.957 4.604 9.989 c 1.75 3.03 3.421 4.087 4.768 4.32 c 1.347 0.232 2.37 -0.358 2.824 -0.62 c 0.287 -0.166 0.445 -0.377 0.51 -0.615 c 0.065 -0.239 0.037 -0.505 -0.052 -0.781 c -0.178 -0.552 -0.601 -1.14 -1.007 -1.617 c -0.133 -0.155 -0.223 -0.259 -0.29 -0.328 c -0.069 -0.074 -0.136 -0.135 -0.224 -0.188 c -0.082 -0.048 -0.143 -0.08 -0.208 -0.1 l -0.017 -0.006 c -0.083 -0.049 -0.188 -0.068 -0.32 -0.048 l -0.052 0.018 c -0.058 0.007 -0.139 0.02 -0.253 0.042 c -0.198 0.04 -0.462 0.102 -0.813 0.186 c -0.435 0.103 -0.943 0.127 -1.45 -0.061 c -0.506 -0.189 -1.013 -0.59 -1.445 -1.34 c -0.433 -0.75 -0.528 -1.389 -0.438 -1.922 c 0.09 -0.533 0.365 -0.96 0.672 -1.286 c 0.248 -0.262 0.434 -0.46 0.567 -0.61 C 7.518 4.87 7.573 4.79 7.597 4.75 L 7.594 4.748 l 0.03 -0.052 h 0.001 c 0.007 -0.013 0.012 -0.026 0.018 -0.04 C 7.652 4.639 7.66 4.619 7.667 4.6 c 0.016 -0.043 0.028 -0.081 0.036 -0.12 c 0.014 -0.067 0.018 -0.135 0.017 -0.23 C 7.718 4.146 7.699 4.057 7.67 3.96 C 7.643 3.868 7.598 3.739 7.53 3.546 c -0.21 -0.59 -0.507 -1.25 -0.896 -1.68 C 6.439 1.65 6.223 1.491 5.984 1.43 Z")
        )
    }.build()
}
