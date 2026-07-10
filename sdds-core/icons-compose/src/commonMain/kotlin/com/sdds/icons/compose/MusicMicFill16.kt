package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicMicFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicMicFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.5 5.293 c 0.0 2.094 -1.697 3.793 -3.79 3.793 c -0.226 0.0 -0.448 -0.02 -0.663 -0.058 L 4.73 13.564 c -0.337 0.288 -0.839 0.268 -1.152 -0.045 l -0.193 -0.193 l -1.03 1.032 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 l 1.031 -1.03 l -0.193 -0.194 c -0.313 -0.314 -0.333 -0.816 -0.046 -1.153 l 4.537 -5.322 C 6.937 5.737 6.918 5.517 6.918 5.293 c 0.0 -2.095 1.697 -3.793 3.791 -3.793 s 3.792 1.698 3.792 3.793 Z m -10.314 7.42 l 4.761 -4.061 c -0.68 -0.358 -1.24 -0.918 -1.597 -1.6 l -4.06 4.764 l 0.896 0.897 Z")
        )
    }.build()
}
