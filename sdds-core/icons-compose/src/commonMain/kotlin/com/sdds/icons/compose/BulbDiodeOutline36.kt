package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbDiodeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbDiodeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 C 11.373 3.0 6.0 8.358 6.0 14.972 c 0.0 3.47 1.48 6.595 3.842 8.78 c 0.703 0.652 1.614 0.923 2.475 0.923 h 11.364 c 0.861 0.0 1.772 -0.271 2.476 -0.922 c 2.36 -2.186 3.841 -5.311 3.841 -8.78 C 29.998 8.357 24.624 3.0 18.0 3.0 Z M 8.0 14.972 C 8.0 9.467 12.475 5.0 18.0 5.0 c 5.524 0.0 9.998 4.467 9.998 9.972 c 0.0 2.889 -1.23 5.49 -3.2 7.313 c -0.265 0.245 -0.658 0.39 -1.117 0.39 H 12.317 c -0.459 0.0 -0.851 -0.145 -1.117 -0.39 C 9.23 20.462 8.0 17.86 8.0 14.972 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.69 27.838 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 h 10.619 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -10.62 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.206 31.999 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 7.586 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -7.586 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
    }.build()
}
