package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Smoke24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Smoke24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.958 2.525 c 0.262 -0.32 0.734 -0.368 1.054 -0.106 c 0.321 0.262 0.369 0.735 0.107 1.056 C 11.569 5.37 11.196 6.809 11.296 8.0 c 0.103 1.24 0.723 2.348 1.482 3.614 c 0.729 1.215 1.6 2.591 1.884 4.193 c 0.294 1.662 -0.048 3.483 -1.504 5.616 c -0.234 0.342 -0.701 0.43 -1.043 0.196 c -0.342 -0.233 -0.43 -0.7 -0.196 -1.042 c 1.274 -1.867 1.48 -3.296 1.265 -4.509 c -0.225 -1.273 -0.92 -2.397 -1.692 -3.682 c -0.74 -1.234 -1.555 -2.626 -1.692 -4.261 c -0.14 -1.684 0.438 -3.496 2.158 -5.6 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.293 5.01 c 0.27 -0.313 0.743 -0.348 1.057 -0.078 c 0.314 0.27 0.35 0.743 0.08 1.057 c -1.076 1.25 -1.265 2.198 -1.152 2.983 c 0.124 0.859 0.617 1.659 1.23 2.627 c 0.575 0.907 1.27 1.983 1.443 3.22 c 0.183 1.309 -0.224 2.675 -1.523 4.172 c -0.27 0.313 -0.744 0.346 -1.057 0.075 c -0.313 -0.27 -0.347 -0.744 -0.076 -1.057 c 1.085 -1.253 1.279 -2.2 1.17 -2.984 c -0.12 -0.857 -0.61 -1.656 -1.223 -2.624 c -0.574 -0.906 -1.27 -1.982 -1.448 -3.216 C 4.605 7.876 5.004 6.51 6.293 5.01 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.803 5.01 c 0.27 -0.313 0.744 -0.348 1.058 -0.078 c 0.314 0.27 0.35 0.743 0.08 1.057 c -1.076 1.251 -1.265 2.197 -1.152 2.983 c 0.124 0.859 0.617 1.659 1.23 2.627 c 0.575 0.907 1.27 1.983 1.443 3.22 c 0.182 1.309 -0.225 2.675 -1.523 4.172 c -0.271 0.313 -0.744 0.346 -1.057 0.075 c -0.313 -0.27 -0.348 -0.744 -0.077 -1.057 c 1.086 -1.253 1.28 -2.2 1.17 -2.984 c -0.12 -0.857 -0.61 -1.656 -1.222 -2.624 c -0.575 -0.906 -1.27 -1.982 -1.449 -3.216 c -0.188 -1.309 0.21 -2.675 1.5 -4.174 Z")
        )
    }.build()
}
