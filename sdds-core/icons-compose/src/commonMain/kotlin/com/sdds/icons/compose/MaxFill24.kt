package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MaxFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MaxFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.146 3.0 C 17.11 3.0 21.0 7.045 21.0 12.026 c 0.017 4.905 -3.924 8.896 -8.807 8.922 c -1.766 0.0 -2.587 -0.259 -4.014 -1.295 c -0.903 1.166 -3.76 2.077 -3.885 0.519 c 0.0 -1.17 -0.259 -2.158 -0.55 -3.237 C 3.394 15.605 3.0 14.124 3.0 11.979 C 3.0 6.855 7.187 3.0 12.146 3.0 Z m 0.12 4.429 C 9.852 7.304 7.97 8.983 7.553 11.616 c -0.344 2.18 0.266 4.834 0.786 4.973 c 0.25 0.06 0.877 -0.45 1.268 -0.842 c 0.647 0.449 1.4 0.718 2.183 0.781 c 2.503 0.121 4.642 -1.792 4.81 -4.303 c 0.097 -2.517 -1.83 -4.647 -4.332 -4.791 V 7.429 Z")
        )
    }.build()
}
