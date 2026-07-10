package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BendOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BendOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.447 9.249 C 13.992 10.139 13.07 10.75 12.0 10.75 c -1.128 0.0 -2.095 -0.68 -2.52 -1.65 c 0.023 0.05 0.047 0.1 0.072 0.149 c -1.793 0.764 -3.153 2.343 -3.621 4.27 C 6.858 13.963 7.5 14.905 7.5 16.0 c 0.0 1.519 -1.231 2.75 -2.75 2.75 S 2.0 17.519 2.0 16.0 c 0.0 -1.416 1.07 -2.581 2.446 -2.732 c 0.421 -1.843 1.499 -3.435 2.974 -4.518 H 2.75 C 2.336 8.75 2.0 8.414 2.0 8.0 s 0.336 -0.75 0.75 -0.75 h 6.5 c 0.035 0.0 0.07 0.003 0.104 0.008 C 9.678 6.1 10.739 5.25 12.0 5.25 s 2.321 0.85 2.646 2.008 C 14.68 7.253 14.713 7.25 14.75 7.25 h 6.5 C 21.664 7.25 22.0 7.586 22.0 8.0 s -0.336 0.75 -0.75 0.75 h -4.67 c 1.475 1.083 2.552 2.675 2.973 4.518 C 20.929 13.418 22.0 14.584 22.0 16.0 c 0.0 1.519 -1.231 2.75 -2.75 2.75 S 16.5 17.519 16.5 16.0 c 0.0 -1.095 0.642 -2.038 1.568 -2.48 c -0.468 -1.928 -1.828 -3.507 -3.62 -4.271 Z M 4.75 14.75 c -0.69 0.0 -1.25 0.56 -1.25 1.25 s 0.56 1.25 1.25 1.25 S 6.0 16.69 6.0 16.0 s -0.56 -1.25 -1.25 -1.25 Z m 14.5 0.0 C 18.56 14.75 18.0 15.31 18.0 16.0 s 0.56 1.25 1.25 1.25 S 20.5 16.69 20.5 16.0 s -0.56 -1.25 -1.25 -1.25 Z m -7.25 -8.0 c -0.69 0.0 -1.25 0.56 -1.25 1.25 S 11.31 9.25 12.0 9.25 S 13.25 8.69 13.25 8.0 S 12.69 6.75 12.0 6.75 Z")
        )
    }.build()
}
