package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CubeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CubeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.63 5.122 c -0.404 -0.163 -0.856 -0.163 -1.26 0.0 L 7.276 9.168 L 18.0 13.538 l 10.723 -4.37 L 18.63 5.122 Z m 11.82 5.502 L 19.0 15.289 V 30.73 l 10.43 -4.182 c 0.645 -0.258 1.07 -0.885 1.07 -1.585 V 11.037 c 0.0 -0.142 -0.017 -0.28 -0.05 -0.413 Z M 17.0 30.73 V 15.29 L 5.55 10.623 c -0.033 0.133 -0.05 0.271 -0.05 0.413 v 13.926 c 0.0 0.7 0.425 1.326 1.07 1.585 L 17.0 30.73 Z M 16.625 3.265 c 0.883 -0.353 1.867 -0.353 2.75 0.0 l 10.8 4.33 c 0.612 0.246 1.133 0.644 1.524 1.139 c 0.508 0.641 0.801 1.448 0.801 2.303 v 13.926 c 0.0 1.515 -0.92 2.878 -2.325 3.441 l -10.8 4.33 C 18.934 32.912 18.467 33.0 18.0 33.0 c -0.467 0.0 -0.934 -0.089 -1.375 -0.265 l -10.8 -4.33 C 4.42 27.84 3.5 26.477 3.5 24.962 V 11.037 c 0.0 -0.855 0.293 -1.662 0.8 -2.303 c 0.393 -0.495 0.913 -0.893 1.525 -1.138 l 10.8 -4.33 Z")
        )
    }.build()
}
