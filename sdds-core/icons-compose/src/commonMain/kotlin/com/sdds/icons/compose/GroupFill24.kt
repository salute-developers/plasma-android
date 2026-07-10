package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GroupFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GroupFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.46 10.934 c -0.586 0.586 -0.586 1.536 0.0 2.122 l 2.474 2.475 c 0.586 0.585 1.536 0.585 2.122 0.0 l 2.474 -2.475 c 0.586 -0.586 0.586 -1.536 0.0 -2.122 L 7.056 8.46 c -0.586 -0.586 -1.536 -0.586 -2.122 0.0 L 2.46 10.934 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.47 16.945 c -0.586 0.586 -0.586 1.535 0.0 2.121 l 2.475 2.475 c 0.585 0.586 1.535 0.586 2.121 0.0 l 2.475 -2.475 c 0.586 -0.586 0.586 -1.535 0.0 -2.121 l -2.475 -2.475 c -0.586 -0.586 -1.536 -0.586 -2.121 0.0 L 8.47 16.945 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.47 7.045 c -0.586 -0.585 -0.586 -1.535 0.0 -2.121 l 2.475 -2.475 c 0.585 -0.586 1.535 -0.586 2.121 0.0 l 2.475 2.475 c 0.586 0.586 0.586 1.536 0.0 2.121 L 13.066 9.52 c -0.586 0.586 -1.536 0.586 -2.121 0.0 L 8.47 7.045 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.48 10.934 c -0.586 0.586 -0.586 1.536 0.0 2.122 l 2.475 2.475 c 0.586 0.585 1.536 0.585 2.121 0.0 l 2.475 -2.475 c 0.586 -0.586 0.586 -1.536 0.0 -2.122 L 19.076 8.46 c -0.585 -0.586 -1.535 -0.586 -2.121 0.0 l -2.475 2.474 Z")
        )
    }.build()
}
