package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyRupiah36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyRupiah36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.875 11.625 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 9.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -2.173 c 0.385 0.546 0.653 1.153 0.798 1.75 h 1.375 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 21.5 c -0.174 0.72 -0.53 1.455 -1.05 2.079 c -0.791 0.946 -1.998 1.671 -3.575 1.671 h -0.586 l 4.293 4.293 c 0.39 0.39 0.39 1.024 0.0 1.414 c -0.39 0.39 -1.024 0.39 -1.414 0.0 l -5.75 -5.75 c -0.043 -0.043 -0.08 -0.088 -0.114 -0.136 c -0.26 -0.18 -0.429 -0.481 -0.429 -0.821 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 3.0 c 0.908 0.0 1.577 -0.4 2.04 -0.954 c 0.209 -0.25 0.37 -0.524 0.485 -0.796 h -4.775 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 4.774 c -0.115 -0.272 -0.276 -0.546 -0.484 -0.796 c -0.463 -0.554 -1.132 -0.954 -2.04 -0.954 h -3.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
    }.build()
}
