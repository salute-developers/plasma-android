package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlayFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlayFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.75 10.7 c 1.0 0.578 1.0 2.022 0.0 2.599 l -10.5 6.062 C 8.25 19.94 7.0 19.217 7.0 18.062 V 5.938 c 0.0 -1.155 1.25 -1.877 2.25 -1.3 l 10.5 6.063 Z")
        )
    }.build()
}
