package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyRupiah16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyRupiah16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.55 5.025 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 4.2 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 H 9.371 c 0.142 0.222 0.245 0.462 0.308 0.7 h 0.596 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 H 9.68 C 9.592 7.63 9.426 7.964 9.19 8.25 c -0.38 0.452 -0.958 0.8 -1.714 0.8 H 7.343 l 1.904 1.904 c 0.205 0.205 0.205 0.537 0.0 0.742 c -0.206 0.205 -0.538 0.205 -0.743 0.0 l -2.8 -2.8 c -0.05 -0.05 -0.088 -0.108 -0.114 -0.17 c -0.026 -0.062 -0.04 -0.13 -0.04 -0.2 c 0.0 -0.072 0.014 -0.14 0.04 -0.202 c 0.026 -0.062 0.064 -0.12 0.114 -0.17 c 0.05 -0.05 0.108 -0.088 0.17 -0.114 C 5.936 8.014 6.004 8.0 6.075 8.0 h 1.4 c 0.404 0.0 0.7 -0.177 0.907 -0.424 c 0.073 -0.087 0.133 -0.181 0.18 -0.276 H 6.425 C 6.135 7.3 5.9 7.065 5.9 6.775 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 2.137 c -0.047 -0.094 -0.107 -0.188 -0.18 -0.276 C 8.176 5.727 7.88 5.55 7.475 5.55 h -1.4 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 Z")
        )
    }.build()
}
