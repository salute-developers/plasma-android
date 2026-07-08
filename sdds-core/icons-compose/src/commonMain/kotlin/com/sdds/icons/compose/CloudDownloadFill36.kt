package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudDownloadFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudDownloadFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 17.603 c 0.0 -3.823 2.757 -7.034 6.486 -7.938 L 9.492 9.65 C 9.552 9.644 9.61 9.634 9.67 9.617 c 1.555 -0.422 3.193 -0.414 4.744 0.024 c 1.551 0.438 2.958 1.29 4.073 2.465 c 0.38 0.4 1.014 0.417 1.414 0.037 c 0.4 -0.38 0.418 -1.013 0.037 -1.414 c -1.362 -1.435 -3.081 -2.477 -4.98 -3.013 c -1.415 -0.399 -2.89 -0.506 -4.337 -0.322 C 12.426 4.75 15.56 3.0 19.125 3.0 c 5.592 0.0 10.125 4.306 10.125 9.617 c 0.0 0.336 -0.018 0.67 -0.054 0.998 c 2.251 1.038 3.804 3.23 3.804 5.77 c 0.0 3.54 -3.022 6.41 -6.75 6.41 H 19.0 v -6.838 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 6.839 h -5.375 C 6.862 25.796 3.0 22.128 3.0 17.603 Z m 15.712 14.85 c -0.188 0.19 -0.445 0.297 -0.712 0.297 c -0.267 0.0 -0.524 -0.107 -0.712 -0.297 l -4.5 -4.56 c -0.388 -0.393 -0.383 -1.026 0.01 -1.414 c 0.393 -0.388 1.026 -0.384 1.414 0.01 L 17.0 29.312 v -3.507 h 2.0 v 3.507 l 2.788 -2.825 c 0.388 -0.393 1.021 -0.397 1.415 -0.009 c 0.393 0.388 0.397 1.021 0.009 1.414 l -4.5 4.56 Z")
        )
    }.build()
}
