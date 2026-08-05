package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartBoxFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartBoxFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 3.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 10.5 C 17.664 2.25 18.0 2.586 18.0 3.0 s -0.336 0.75 -0.75 0.75 H 6.75 C 6.336 3.75 6.0 3.414 6.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.08 5.25 H 6.92 c -0.535 0.0 -0.98 0.0 -1.345 0.03 c -0.38 0.03 -0.736 0.098 -1.073 0.27 C 3.984 5.813 3.563 6.234 3.3 6.752 C 3.128 7.089 3.06 7.445 3.03 7.825 C 3.0 8.19 3.0 8.635 3.0 9.17 v 8.16 c 0.0 0.535 0.0 0.98 0.03 1.345 c 0.03 0.38 0.098 0.736 0.27 1.073 c 0.263 0.518 0.684 0.939 1.202 1.202 c 0.337 0.172 0.693 0.24 1.073 0.27 c 0.365 0.03 0.81 0.03 1.344 0.03 h 10.162 c 0.534 0.0 0.98 0.0 1.344 -0.03 c 0.38 -0.03 0.736 -0.098 1.073 -0.27 c 0.518 -0.263 0.939 -0.684 1.202 -1.201 c 0.172 -0.338 0.24 -0.694 0.27 -1.074 C 21.0 18.31 21.0 17.865 21.0 17.33 V 9.17 c 0.0 -0.535 0.0 -0.98 -0.03 -1.345 c -0.03 -0.38 -0.098 -0.736 -0.27 -1.073 c -0.263 -0.518 -0.684 -0.939 -1.201 -1.202 c -0.338 -0.172 -0.694 -0.24 -1.074 -0.27 c -0.365 -0.03 -0.81 -0.03 -1.345 -0.03 Z M 7.0 11.605 C 7.0 10.431 8.02 9.0 9.683 9.0 C 10.61 9.0 11.405 9.729 12.0 10.421 C 12.595 9.73 13.389 9.0 14.317 9.0 C 15.98 9.0 17.0 10.431 17.0 11.605 c 0.0 2.176 -2.153 4.218 -4.071 5.701 c -0.317 0.245 -0.476 0.368 -0.669 0.42 c -0.162 0.044 -0.358 0.044 -0.52 0.0 c -0.194 -0.052 -0.352 -0.175 -0.669 -0.42 C 9.153 15.823 7.0 13.781 7.0 11.606 Z")
        )
    }.build()
}
