package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UploadFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UploadFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.88 4.0 h 18.24 c 0.802 0.0 1.47 0.0 2.017 0.045 c 0.57 0.046 1.105 0.147 1.61 0.405 c 0.777 0.395 1.408 1.026 1.803 1.802 c 0.258 0.506 0.359 1.041 0.405 1.611 C 33.0 8.409 33.0 9.078 33.0 9.879 v 12.242 c 0.0 0.8 0.0 1.47 -0.045 2.016 c -0.046 0.57 -0.147 1.105 -0.405 1.61 c -0.395 0.777 -1.026 1.408 -1.802 1.803 c -0.506 0.258 -1.041 0.359 -1.611 0.405 C 28.591 28.0 27.922 28.0 27.121 28.0 h -7.996 V 17.841 l 2.58 2.58 c 0.439 0.439 1.151 0.439 1.59 0.0 c 0.44 -0.44 0.44 -1.152 0.0 -1.591 l -4.5 -4.5 c -0.439 -0.44 -1.151 -0.44 -1.59 0.0 l -4.5 4.5 c -0.44 0.439 -0.44 1.151 0.0 1.59 c 0.439 0.44 1.151 0.44 1.59 0.0 l 2.58 -2.579 V 28.0 H 8.879 c -0.8 0.0 -1.47 0.0 -2.016 -0.045 c -0.57 -0.046 -1.105 -0.147 -1.61 -0.405 c -0.777 -0.395 -1.408 -1.026 -1.803 -1.802 c -0.258 -0.506 -0.359 -1.041 -0.405 -1.611 C 3.0 23.591 3.0 22.922 3.0 22.121 V 9.879 c 0.0 -0.8 0.0 -1.47 0.045 -2.016 c 0.046 -0.57 0.147 -1.105 0.405 -1.61 c 0.395 -0.777 1.026 -1.408 1.802 -1.803 c 0.506 -0.258 1.041 -0.359 1.611 -0.405 C 7.409 4.0 8.078 4.0 8.879 4.0 Z m 10.245 26.875 V 28.0 h -2.25 v 2.875 C 16.875 31.496 17.379 32.0 18.0 32.0 s 1.125 -0.504 1.125 -1.125 Z")
        )
    }.build()
}
