package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TrashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TrashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.0 10.75 c 0.414 0.0 0.75 0.336 0.75 0.75 v 6.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.75 11.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 6.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.25 5.75 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 1.5 c 1.657 0.0 3.0 1.343 3.0 3.0 V 6.5 h 3.5 C 19.664 6.5 20.0 6.836 20.0 7.25 S 19.664 8.0 19.25 8.0 H 18.0 v 8.83 c 0.0 0.535 0.0 0.98 -0.03 1.345 c -0.03 0.38 -0.098 0.736 -0.27 1.073 c -0.263 0.518 -0.684 0.939 -1.201 1.202 c -0.338 0.172 -0.694 0.24 -1.074 0.27 c -0.365 0.03 -0.81 0.03 -1.345 0.03 H 9.92 c -0.535 0.0 -0.98 0.0 -1.345 -0.03 c -0.38 -0.03 -0.736 -0.098 -1.073 -0.27 c -0.518 -0.263 -0.939 -0.684 -1.202 -1.201 c -0.172 -0.338 -0.24 -0.694 -0.27 -1.074 C 6.0 17.81 6.0 17.365 6.0 16.83 V 8.0 H 4.75 C 4.336 8.0 4.0 7.664 4.0 7.25 S 4.336 6.5 4.75 6.5 h 3.5 V 5.75 Z m 1.5 0.75 h 4.5 V 5.75 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 h -1.5 c -0.828 0.0 -1.5 0.672 -1.5 1.5 V 6.5 Z M 7.5 8.0 v 8.8 c 0.0 0.572 0.0 0.957 0.025 1.252 c 0.023 0.288 0.065 0.425 0.111 0.515 c 0.12 0.236 0.311 0.427 0.547 0.547 c 0.09 0.046 0.227 0.088 0.514 0.111 c 0.296 0.024 0.68 0.025 1.253 0.025 h 4.1 c 0.572 0.0 0.957 0.0 1.252 -0.025 c 0.288 -0.023 0.425 -0.065 0.516 -0.111 c 0.235 -0.12 0.426 -0.311 0.546 -0.547 c 0.046 -0.09 0.088 -0.227 0.111 -0.515 c 0.024 -0.295 0.025 -0.68 0.025 -1.252 V 8.0 h -9.0 Z")
        )
    }.build()
}
