package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassCareOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassCareOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.59 1.617 c -0.055 -0.156 -0.276 -0.156 -0.331 0.0 l -0.411 1.174 c -0.22 0.628 -0.726 1.115 -1.362 1.312 l -1.264 0.39 c -0.164 0.05 -0.164 0.284 0.0 0.334 l 1.264 0.39 c 0.636 0.197 1.142 0.684 1.362 1.313 l 0.411 1.173 c 0.055 0.157 0.276 0.157 0.33 0.0 L 12.0 6.53 c 0.22 -0.629 0.726 -1.116 1.363 -1.312 l 1.263 -0.39 c 0.165 -0.051 0.165 -0.284 0.0 -0.335 l -1.263 -0.39 C 12.726 3.906 12.22 3.419 12.0 2.791 l -0.41 -1.174 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.624 1.875 c -0.086 0.0 -0.177 0.0 -0.254 0.006 c -0.087 0.007 -0.197 0.022 -0.31 0.074 c -0.157 0.07 -0.291 0.186 -0.383 0.336 c -0.069 0.112 -0.095 0.224 -0.11 0.311 C 3.555 2.678 3.55 2.766 3.542 2.846 L 3.26 6.563 c -0.142 1.862 1.284 3.42 3.127 3.66 v 2.89 c -1.416 0.113 -2.494 0.69 -2.494 1.387 h 5.989 c 0.0 -0.696 -1.079 -1.274 -2.495 -1.386 v -2.89 c 1.493 -0.195 2.706 -1.249 3.044 -2.634 c 0.066 -0.268 -0.099 -0.539 -0.367 -0.604 C 9.796 6.92 9.525 7.085 9.46 7.353 C 9.2 8.417 8.17 9.256 6.887 9.256 c -1.563 0.0 -2.735 -1.235 -2.63 -2.617 l 0.286 -3.763 h 0.094 h 5.058 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 h -5.07 Z")
        )
    }.build()
}
