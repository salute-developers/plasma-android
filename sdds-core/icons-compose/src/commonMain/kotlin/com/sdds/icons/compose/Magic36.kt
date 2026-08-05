package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Magic36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Magic36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.772 5.924 c 0.46 -1.399 2.438 -1.399 2.898 0.0 l 1.204 3.663 c 0.347 1.056 1.175 1.884 2.231 2.231 l 3.662 1.205 c 1.398 0.46 1.398 2.437 0.0 2.897 l -3.662 1.205 c -1.056 0.347 -1.884 1.175 -2.231 2.232 L 15.67 23.02 c -0.46 1.398 -2.438 1.398 -2.898 0.0 l -1.204 -3.663 c -0.347 -1.056 -1.175 -1.885 -2.231 -2.232 L 5.674 15.92 c -1.398 -0.46 -1.397 -2.437 0.0 -2.897 l 3.663 -1.205 c 1.056 -0.347 1.884 -1.175 2.23 -2.231 l 1.205 -3.663 Z m 1.449 1.997 l -0.753 2.29 c -0.546 1.66 -1.847 2.961 -3.506 3.507 L 7.67 14.472 l 2.29 0.753 c 1.66 0.546 2.961 1.848 3.507 3.507 l 0.753 2.29 l 0.753 -2.29 c 0.546 -1.66 1.847 -2.961 3.506 -3.507 l 2.29 -0.753 l -2.29 -0.754 c -1.659 -0.546 -2.96 -1.847 -3.506 -3.507 l -0.753 -2.29 Z m 6.559 18.424 c 0.058 -0.188 0.324 -0.188 0.382 0.0 l 0.204 0.663 c 0.195 0.632 0.69 1.127 1.322 1.322 l 0.663 0.205 c 0.188 0.058 0.188 0.324 0.0 0.382 l -0.663 0.204 c -0.632 0.195 -1.127 0.69 -1.322 1.322 l -0.204 0.664 c -0.058 0.188 -0.324 0.188 -0.382 0.0 l -0.205 -0.664 c -0.195 -0.632 -0.69 -1.127 -1.321 -1.322 l -0.664 -0.204 c -0.188 -0.058 -0.188 -0.324 0.0 -0.382 l 0.664 -0.205 c 0.632 -0.195 1.126 -0.69 1.321 -1.322 l 0.205 -0.663 Z m 5.728 -10.192 c -0.087 -0.282 -0.487 -0.282 -0.574 0.0 l -0.66 2.142 c -0.292 0.948 -1.035 1.69 -1.983 1.982 l -2.14 0.66 c -0.283 0.088 -0.283 0.487 0.0 0.574 l 2.14 0.66 c 0.948 0.293 1.69 1.035 1.983 1.983 l 0.66 2.142 c 0.087 0.282 0.487 0.282 0.574 0.0 l 0.66 -2.142 c 0.292 -0.948 1.034 -1.69 1.983 -1.982 l 2.14 -0.66 c 0.283 -0.088 0.283 -0.487 0.0 -0.574 l -2.14 -0.66 c -0.949 -0.293 -1.69 -1.035 -1.983 -1.983 l -0.66 -2.142 Z")
        )
    }.build()
}
