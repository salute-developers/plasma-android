package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EditOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EditOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.269 1.728 c -0.97 -0.97 -2.543 -0.97 -3.513 0.0 L 2.444 10.04 c -0.34 0.341 -0.58 0.77 -0.692 1.239 l -0.738 3.103 c -0.04 0.169 0.01 0.347 0.132 0.47 c 0.123 0.122 0.3 0.172 0.47 0.132 l 3.103 -0.739 c 0.469 -0.111 0.897 -0.35 1.238 -0.692 l 8.312 -8.312 c 0.97 -0.97 0.97 -2.543 0.0 -3.513 Z m -2.806 0.707 c 0.58 -0.58 1.52 -0.58 2.099 0.0 c 0.58 0.58 0.58 1.519 0.0 2.099 l -0.49 0.49 c -0.199 -0.465 -0.486 -0.89 -0.847 -1.252 c -0.362 -0.361 -0.787 -0.648 -1.251 -0.848 l 0.49 -0.49 Z m 0.055 2.044 c 0.369 0.37 0.634 0.828 0.772 1.327 l -7.04 7.04 c -0.21 0.21 -0.474 0.358 -0.763 0.427 l -0.191 0.045 c -0.284 -0.742 -0.875 -1.332 -1.616 -1.617 l 0.045 -0.19 c 0.069 -0.29 0.217 -0.554 0.427 -0.764 l 7.04 -7.04 c 0.498 0.138 0.956 0.403 1.325 0.772 Z")
        )
    }.build()
}
