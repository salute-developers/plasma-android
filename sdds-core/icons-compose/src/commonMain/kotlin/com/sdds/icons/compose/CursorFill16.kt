package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CursorFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CursorFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.065 3.384 C 2.892 2.685 3.613 2.101 4.261 2.416 l 10.197 4.948 c 0.76 0.369 0.575 1.5 -0.263 1.607 L 9.11 9.626 l -1.697 4.838 c -0.28 0.797 -1.426 0.742 -1.628 -0.078 L 3.065 3.384 Z")
        )
    }.build()
}
