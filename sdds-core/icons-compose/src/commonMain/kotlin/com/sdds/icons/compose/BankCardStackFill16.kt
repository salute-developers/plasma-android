package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardStackFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardStackFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 10.98 V 5.963 c 0.0 -0.653 -0.447 -1.201 -1.051 -1.356 v 0.376 v 3.973 c 0.0 0.409 0.0 0.776 -0.024 1.082 c -0.027 0.328 -0.088 0.676 -0.261 1.017 c -0.252 0.494 -0.653 0.896 -1.147 1.147 c -0.342 0.174 -0.69 0.235 -1.017 0.261 c -0.306 0.026 -0.674 0.025 -1.082 0.025 H 3.482 H 3.148 C 3.308 13.07 3.841 13.5 4.475 13.5 h 8.005 c 0.882 0.0 1.323 0.0 1.66 -0.172 c 0.296 -0.15 0.537 -0.392 0.688 -0.688 C 15.0 12.303 15.0 11.862 15.0 10.98 Z M 3.284 11.437 v 0.001 h 7.096 c 0.882 0.0 1.323 0.0 1.66 -0.171 c 0.296 -0.151 0.537 -0.392 0.688 -0.689 c 0.057 -0.112 0.095 -0.235 0.12 -0.383 C 12.9 9.9 12.9 9.507 12.9 8.917 V 5.02 c 0.0 -0.882 0.0 -1.323 -0.172 -1.66 c -0.15 -0.296 -0.392 -0.537 -0.688 -0.688 C 11.703 2.5 11.262 2.5 10.38 2.5 H 3.52 c -0.882 0.0 -1.323 0.0 -1.66 0.172 c -0.296 0.15 -0.537 0.392 -0.688 0.688 C 1.0 3.697 1.0 4.138 1.0 5.02 v 3.897 c 0.0 0.882 0.0 1.323 0.172 1.66 c 0.15 0.297 0.392 0.538 0.688 0.689 c 0.305 0.155 0.696 0.17 1.424 0.171 Z m 7.69 -6.359 c 0.0 0.29 -0.234 0.525 -0.524 0.525 h -7.0 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 7.0 c 0.29 0.0 0.525 0.235 0.525 0.525 Z")
        )
    }.build()
}
