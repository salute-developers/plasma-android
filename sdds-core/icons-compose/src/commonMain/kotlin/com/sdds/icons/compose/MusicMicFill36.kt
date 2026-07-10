package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicMicFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicMicFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.001 12.191 c 0.0 4.524 -3.667 8.191 -8.19 8.191 c -0.523 0.0 -1.034 -0.049 -1.53 -0.143 L 10.838 30.0 c -0.695 0.591 -1.728 0.55 -2.373 -0.095 L 7.99 29.428 l -2.283 2.283 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 2.282 -2.283 l -0.478 -0.478 c -0.645 -0.645 -0.686 -1.678 -0.094 -2.373 l 9.76 -11.447 c -0.093 -0.494 -0.142 -1.004 -0.142 -1.525 c 0.0 -4.524 3.667 -8.191 8.19 -8.191 s 8.19 3.667 8.19 8.191 Z M 9.716 28.327 l 10.367 -8.841 c -1.532 -0.785 -2.784 -2.038 -3.568 -3.57 l -8.84 10.37 l 2.041 2.04 Z")
        )
    }.build()
}
