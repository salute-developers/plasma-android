package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.628 6.5 c -4.572 0.0 -7.378 3.976 -7.378 7.237 c 0.0 5.786 5.427 11.23 10.518 15.3 c 1.081 0.865 1.622 1.297 2.308 1.487 c 0.566 0.156 1.282 0.156 1.848 0.0 c 0.686 -0.19 1.227 -0.622 2.308 -1.486 c 5.091 -4.07 10.518 -9.515 10.518 -15.301 c 0.0 -3.261 -2.806 -7.237 -7.378 -7.237 c -2.554 0.0 -4.735 2.024 -6.372 3.947 C 16.363 8.524 14.182 6.5 11.628 6.5 Z")
        )
    }.build()
}
