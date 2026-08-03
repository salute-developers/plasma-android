package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareScreenFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareScreenFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.291 4.044 C 17.48 3.856 17.734 3.75 18.0 3.75 c 0.266 0.0 0.521 0.106 0.709 0.294 l 4.5 4.52 c 0.39 0.392 0.388 1.025 -0.003 1.414 c -0.392 0.39 -1.025 0.389 -1.415 -0.003 L 19.0 7.172 v 5.488 h 8.375 c 2.278 0.0 4.125 1.847 4.125 4.125 v 11.336 c 0.0 2.278 -1.847 4.125 -4.125 4.125 H 8.625 c -2.278 0.0 -4.125 -1.847 -4.125 -4.125 V 16.785 c 0.0 -2.278 1.847 -4.125 4.125 -4.125 H 17.0 V 7.172 l -2.791 2.803 c -0.39 0.392 -1.023 0.393 -1.415 0.003 c -0.39 -0.39 -0.392 -1.022 -0.003 -1.414 l 4.5 -4.52 Z M 17.0 12.663 v 7.907 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 v -7.907 h -2.0 Z")
        )
    }.build()
}
