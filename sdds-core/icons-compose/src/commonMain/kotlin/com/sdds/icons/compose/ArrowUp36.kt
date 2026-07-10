package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowUp36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowUp36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.543 13.18 c -0.39 0.391 -0.39 1.024 0.0 1.415 c 0.39 0.39 1.024 0.39 1.414 0.0 l 7.115 -7.115 v 23.283 c 0.0 0.552 0.448 1.0 1.0 1.0 c 0.553 0.0 1.0 -0.448 1.0 -1.0 V 7.623 l 6.972 6.972 c 0.39 0.39 1.023 0.39 1.414 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 l -8.591 -8.592 c -0.479 -0.478 -1.254 -0.478 -1.733 0.0 l -8.591 8.592 Z")
        )
    }.build()
}
