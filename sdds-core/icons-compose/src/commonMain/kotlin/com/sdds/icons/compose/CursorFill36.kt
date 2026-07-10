package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CursorFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CursorFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.735 8.34 c -0.353 -1.438 1.128 -2.638 2.461 -1.993 l 21.676 10.477 c 1.565 0.757 1.189 3.087 -0.535 3.312 l -10.864 1.418 l -3.646 10.332 c -0.579 1.639 -2.935 1.523 -3.35 -0.165 L 7.735 8.34 Z")
        )
    }.build()
}
