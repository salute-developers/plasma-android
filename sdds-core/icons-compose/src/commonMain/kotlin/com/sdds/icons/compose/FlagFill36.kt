package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlagFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlagFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.437 4.321 c 2.784 -1.897 5.212 -2.474 7.455 -2.288 c 2.192 0.183 4.107 1.093 5.828 1.934 l 0.196 0.095 c 1.695 0.83 3.2 1.565 4.833 1.789 c 1.626 0.223 3.448 -0.06 5.702 -1.54 c 0.307 -0.201 0.7 -0.218 1.024 -0.043 C 30.798 4.442 31.0 4.78 31.0 5.148 v 16.187 c 0.0 0.347 -0.18 0.67 -0.475 0.851 c -2.612 1.614 -4.858 2.01 -6.94 1.729 c -1.872 -0.253 -3.554 -1.055 -5.1 -1.791 l -0.351 -0.167 c -1.69 -0.801 -3.274 -1.498 -5.084 -1.636 c -1.667 -0.126 -3.613 0.219 -6.05 1.59 V 31.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 5.147 c 0.0 -0.33 0.163 -0.64 0.437 -0.826 Z")
        )
    }.build()
}
