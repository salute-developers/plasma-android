package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlayFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlayFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.625 16.05 c 1.5 0.866 1.5 3.031 0.0 3.898 l -15.75 9.093 c -1.5 0.866 -3.375 -0.217 -3.375 -1.949 V 8.906 c 0.0 -1.732 1.875 -2.815 3.375 -1.949 l 15.75 9.093 Z")
        )
    }.build()
}
