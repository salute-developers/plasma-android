package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlayFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlayFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.925 7.09 c 0.7 0.405 0.7 1.415 0.0 1.82 l -7.35 4.243 C 4.875 13.557 4.0 13.052 4.0 12.243 V 3.758 c 0.0 -0.809 0.875 -1.314 1.575 -0.91 l 7.35 4.244 Z")
        )
    }.build()
}
