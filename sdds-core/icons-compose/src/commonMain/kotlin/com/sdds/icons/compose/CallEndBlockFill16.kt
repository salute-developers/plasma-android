package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallEndBlockFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallEndBlockFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.683 8.05 C 14.856 7.874 14.96 7.632 14.96 7.3 c 0.0 -0.525 0.0 -1.706 -0.875 -2.756 c -0.875 -1.05 -2.625 -1.969 -6.125 -1.969 s -5.25 0.92 -6.125 1.969 C 0.96 5.595 0.96 6.776 0.96 7.3 c 0.0 0.33 0.104 0.573 0.277 0.749 c 0.174 0.175 0.419 0.285 0.703 0.345 c 0.567 0.122 1.288 0.05 1.904 -0.064 c 0.2 -0.037 0.335 -0.063 0.428 -0.086 c 0.099 -0.024 0.186 -0.051 0.275 -0.101 c 0.082 -0.047 0.14 -0.084 0.19 -0.13 l 0.014 -0.012 c 0.084 -0.047 0.153 -0.129 0.202 -0.254 l 0.01 -0.053 c 0.023 -0.053 0.053 -0.13 0.09 -0.24 c 0.065 -0.191 0.143 -0.45 0.246 -0.796 C 5.427 6.23 5.66 5.778 6.077 5.433 C 6.494 5.09 7.095 4.851 7.96 4.851 S 9.426 5.09 9.843 5.433 c 0.417 0.345 0.65 0.797 0.778 1.225 c 0.103 0.346 0.18 0.606 0.245 0.797 c 0.07 0.203 0.111 0.29 0.135 0.332 l 0.003 -0.001 l 0.03 0.052 h -0.001 c 0.008 0.013 0.017 0.024 0.025 0.035 c 0.012 0.017 0.025 0.034 0.039 0.05 c 0.028 0.035 0.055 0.065 0.085 0.091 c 0.05 0.046 0.108 0.083 0.191 0.13 c 0.09 0.05 0.176 0.077 0.275 0.1 c 0.093 0.024 0.228 0.05 0.428 0.087 c 0.616 0.114 1.337 0.186 1.904 0.064 c 0.284 -0.06 0.529 -0.17 0.703 -0.345 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.768 8.81 l 2.922 2.922 c 0.5 -0.818 0.396 -1.902 -0.312 -2.61 S 7.586 8.31 6.768 8.811 Z m 2.214 3.63 L 6.061 9.517 c -0.5 0.818 -0.396 1.901 0.312 2.61 c 0.708 0.708 1.791 0.812 2.61 0.311 Z M 5.665 8.414 c 1.22 -1.22 3.2 -1.22 4.42 0.0 c 1.22 1.22 1.22 3.2 0.0 4.42 c -1.22 1.22 -3.2 1.22 -4.42 0.0 c -1.22 -1.22 -1.22 -3.2 0.0 -4.42 Z")
        )
    }.build()
}
