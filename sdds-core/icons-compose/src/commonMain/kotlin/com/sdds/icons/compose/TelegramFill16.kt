package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TelegramFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TelegramFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.621 3.093 s 1.169 -0.454 1.072 0.65 C 13.66 4.197 13.4 5.787 13.14 7.507 c -0.39 2.435 -0.812 5.097 -0.812 5.097 s -0.064 0.747 -0.616 0.877 s -1.462 -0.455 -1.624 -0.585 c -0.134 -0.1 -2.435 -1.56 -3.278 -2.273 c -0.228 -0.194 -0.487 -0.584 0.032 -1.039 c 1.169 -1.071 2.565 -2.402 3.41 -3.246 c 0.389 -0.39 0.777 -1.298 -0.846 -0.194 C 7.103 7.735 4.83 9.229 4.83 9.229 C 4.82 9.235 4.302 9.55 3.337 9.26 c -0.97 -0.29 -2.1 -0.678 -2.11 -0.682 c 0.0 0.0 -0.78 -0.487 0.551 -1.007 c 0.0 0.0 5.617 -2.304 7.565 -3.116 c 0.74 -0.322 3.238 -1.347 3.278 -1.363 Z")
        )
    }.build()
}
