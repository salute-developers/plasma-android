package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.988 2.75 C 2.826 2.75 1.5 4.579 1.5 6.079 c 0.0 2.678 2.598 5.197 5.017 7.073 c 0.498 0.387 0.748 0.58 1.06 0.664 c 0.26 0.07 0.586 0.07 0.845 0.0 c 0.313 -0.084 0.563 -0.277 1.06 -0.664 c 2.42 -1.876 5.018 -4.395 5.018 -7.073 c 0.0 -1.5 -1.326 -3.329 -3.488 -3.329 C 9.805 2.75 8.774 3.681 8.0 4.566 C 7.226 3.68 6.195 2.75 4.988 2.75 Z")
        )
    }.build()
}
