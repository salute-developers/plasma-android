package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WalletAppleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WalletAppleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.482 4.0 H 7.518 c -0.813 0.0 -1.469 0.0 -2.0 0.043 c -0.546 0.045 -1.026 0.14 -1.47 0.366 c -0.706 0.36 -1.28 0.933 -1.64 1.639 c -0.226 0.444 -0.32 0.924 -0.365 1.47 C 2.0 8.05 2.0 8.706 2.0 9.519 v 4.964 c 0.0 0.813 0.0 1.469 0.043 2.0 c 0.045 0.546 0.14 1.026 0.366 1.47 c 0.36 0.706 0.933 1.28 1.639 1.64 c 0.444 0.226 0.924 0.32 1.47 0.365 C 6.05 20.0 6.706 20.0 7.519 20.0 h 8.964 c 0.813 0.0 1.469 0.0 2.0 -0.043 c 0.546 -0.045 1.026 -0.14 1.47 -0.366 c 0.706 -0.36 1.28 -0.933 1.64 -1.639 c 0.226 -0.444 0.32 -0.924 0.365 -1.47 C 22.0 15.95 22.0 15.295 22.0 14.482 V 9.518 c 0.0 -0.813 0.0 -1.469 -0.043 -2.0 c -0.045 -0.546 -0.14 -1.026 -0.366 -1.47 c -0.36 -0.706 -0.933 -1.28 -1.639 -1.64 c -0.444 -0.226 -0.924 -0.32 -1.47 -0.365 C 17.95 4.0 17.294 4.0 16.482 4.0 Z M 5.0 7.75 C 5.0 7.336 5.336 7.0 5.75 7.0 h 12.5 C 18.664 7.0 19.0 7.336 19.0 7.75 S 18.664 8.5 18.25 8.5 H 5.75 C 5.336 8.5 5.0 8.164 5.0 7.75 Z m 0.0 3.0 C 5.0 10.336 5.336 10.0 5.75 10.0 h 2.526 c 0.618 0.0 1.123 0.326 1.448 0.705 c 0.22 0.255 0.482 0.473 0.776 0.643 c 0.456 0.263 0.973 0.402 1.5 0.402 s 1.044 -0.139 1.5 -0.402 c 0.294 -0.17 0.556 -0.388 0.776 -0.643 C 14.6 10.325 15.106 10.0 15.724 10.0 h 2.526 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -2.526 c -0.07 0.0 -0.188 0.04 -0.31 0.182 c -0.33 0.384 -0.723 0.71 -1.164 0.965 c -0.684 0.395 -1.46 0.603 -2.25 0.603 s -1.566 -0.208 -2.25 -0.603 c -0.441 -0.255 -0.834 -0.581 -1.164 -0.965 c -0.121 -0.142 -0.24 -0.182 -0.31 -0.182 H 5.75 C 5.336 11.5 5.0 11.164 5.0 10.75 Z")
        )
    }.build()
}
