package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DataBaseFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DataBaseFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.28 9.487 c 0.012 0.087 0.02 0.175 0.02 0.263 v 2.1 c 0.0 1.933 -2.821 3.5 -6.3 3.5 c -3.48 0.0 -6.3 -1.567 -6.3 -3.5 v -2.1 c 0.0 -0.088 0.007 -0.176 0.019 -0.263 c 0.241 1.81 2.96 3.238 6.28 3.238 c 3.321 0.0 6.04 -1.428 6.281 -3.238 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.28 5.813 c 0.012 0.086 0.02 0.174 0.02 0.262 v 2.1 c 0.0 1.933 -2.821 3.5 -6.3 3.5 c -3.48 0.0 -6.3 -1.567 -6.3 -3.5 v -2.1 c 0.0 -0.088 0.007 -0.176 0.019 -0.263 c 0.241 1.81 2.96 3.238 6.28 3.238 c 3.321 0.0 6.04 -1.427 6.281 -3.238 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 1.0 c 3.48 0.0 6.3 1.567 6.3 3.5 c 0.0 1.812 -2.479 3.302 -5.656 3.481 l -0.32 0.014 C 8.217 7.998 8.108 8.0 8.0 8.0 C 7.674 8.0 7.353 7.987 7.04 7.96 C 6.833 7.942 6.628 7.918 6.427 7.89 C 3.708 7.5 1.7 6.13 1.7 4.5 c 0.0 -1.208 1.102 -2.273 2.777 -2.902 c 0.168 -0.063 0.341 -0.121 0.52 -0.175 C 5.89 1.153 6.912 1.0 8.0 1.0 Z")
        )
    }.build()
}
