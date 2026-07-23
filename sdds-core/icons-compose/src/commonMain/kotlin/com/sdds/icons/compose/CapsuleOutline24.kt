package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CapsuleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CapsuleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 13.25 c 0.414 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 s -0.75 0.335 -0.75 0.75 c 0.0 0.414 0.336 0.75 0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.25 15.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 s 0.75 0.335 0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.5 16.25 c 0.414 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 s -0.75 0.335 -0.75 0.75 c 0.0 0.414 0.336 0.75 0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.25 18.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 s 0.75 0.335 0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 16.25 c 0.414 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 s -0.75 0.335 -0.75 0.75 c 0.0 0.414 0.336 0.75 0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.595 3.594 l -9.0 9.0 c -2.157 2.157 -2.157 5.654 0.0 7.81 c 2.157 2.158 5.653 2.158 7.81 0.0 l 9.0 -9.0 c 2.157 -2.156 2.157 -5.653 0.0 -7.81 s -5.654 -2.157 -7.81 0.0 Z m 2.78 10.72 l -5.69 -5.69 l 3.97 -3.97 c 1.571 -1.57 4.118 -1.57 5.69 0.0 c 1.57 1.572 1.57 4.12 0.0 5.69 l -3.97 3.97 Z m -6.75 -4.629 l 5.69 5.69 l -3.97 3.97 c -1.571 1.57 -4.119 1.57 -5.69 0.0 c -1.57 -1.572 -1.57 -4.119 0.0 -5.69 l 3.97 -3.97 Z")
        )
    }.build()
}
