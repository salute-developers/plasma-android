package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.89 4.391 c -0.147 -0.146 -0.385 -0.146 -0.531 0.0 l -2.387 2.387 c -0.525 0.525 -0.58 1.344 -0.162 1.93 l -5.938 5.937 c -0.798 -0.787 -1.406 -1.334 -2.074 -1.663 c -1.533 -0.756 -3.331 -0.756 -4.865 0.0 c -0.817 0.403 -1.544 1.13 -2.64 2.227 l -3.997 3.997 c -1.097 1.096 -1.824 1.823 -2.227 2.64 c -0.756 1.534 -0.756 3.332 0.0 4.865 c 0.403 0.817 1.13 1.544 2.227 2.64 l 0.285 0.285 c 1.096 1.097 1.823 1.824 2.64 2.227 c 1.533 0.756 3.331 0.756 4.865 0.0 c 0.817 -0.403 1.544 -1.13 2.64 -2.227 l 3.997 -3.997 c 1.097 -1.096 1.824 -1.823 2.227 -2.64 c 0.756 -1.534 0.756 -3.332 0.0 -4.865 c -0.33 -0.668 -0.876 -1.276 -1.663 -2.075 l 5.937 -5.937 c 0.586 0.417 1.405 0.363 1.93 -0.162 l 2.387 -2.387 c 0.146 -0.146 0.146 -0.384 0.0 -0.53 L 28.889 4.39 Z m -9.724 12.375 c -1.291 -1.292 -1.771 -1.753 -2.252 -1.99 c -0.976 -0.482 -2.12 -0.482 -3.096 0.0 c -0.481 0.237 -0.961 0.698 -2.253 1.99 l -3.712 3.712 C 6.56 21.769 6.1 22.25 5.863 22.73 c -0.482 0.975 -0.482 2.12 0.0 3.096 c 0.237 0.48 0.698 0.96 1.99 2.252 c 1.291 1.292 1.771 1.753 2.252 1.99 c 0.976 0.482 2.12 0.482 3.096 0.0 c 0.481 -0.237 0.961 -0.698 2.253 -1.99 l 3.712 -3.712 c 1.292 -1.292 1.753 -1.772 1.99 -2.253 c 0.482 -0.976 0.482 -2.12 0.0 -3.096 c -0.237 -0.48 -0.698 -0.96 -1.99 -2.252 Z")
        )
    }.build()
}
