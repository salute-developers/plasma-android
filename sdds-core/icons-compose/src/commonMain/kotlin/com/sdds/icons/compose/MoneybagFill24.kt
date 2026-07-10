package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MoneybagFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MoneybagFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.75 3.0 C 5.476 3.0 5.225 3.149 5.093 3.388 C 4.96 3.628 4.97 3.919 5.116 4.15 L 7.23 7.5 h 9.537 l 2.116 -3.35 c 0.146 -0.23 0.154 -0.523 0.023 -0.762 C 18.774 3.148 18.523 3.0 18.25 3.0 H 5.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.695 9.0 H 6.304 c -1.421 1.11 -2.48 2.686 -2.933 4.538 l -0.084 0.344 C 2.4 17.505 5.143 21.0 8.872 21.0 h 6.255 c 3.73 0.0 6.472 -3.495 5.585 -7.118 l -0.084 -0.344 C 20.175 11.686 19.116 10.11 17.695 9.0 Z")
        )
    }.build()
}
