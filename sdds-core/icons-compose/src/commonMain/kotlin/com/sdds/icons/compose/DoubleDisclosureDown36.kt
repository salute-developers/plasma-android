package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoubleDisclosureDown36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoubleDisclosureDown36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.06 10.486 c -0.44 -0.44 -1.152 -0.44 -1.592 0.0 c -0.439 0.44 -0.439 1.151 0.0 1.59 l 7.546 7.546 l 7.545 -7.545 c 0.44 -0.44 0.44 -1.152 0.0 -1.591 c -0.439 -0.44 -1.151 -0.44 -1.59 0.0 l -5.955 5.954 l -5.955 -5.954 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.046 18.409 c -0.44 -0.44 -1.152 -0.44 -1.591 0.0 c -0.44 0.439 -0.44 1.151 0.0 1.59 L 18.0 27.546 L 25.546 20.0 c 0.439 -0.44 0.439 -1.152 0.0 -1.591 c -0.44 -0.44 -1.152 -0.44 -1.591 0.0 L 18.0 24.363 l -5.954 -5.954 Z")
        )
    }.build()
}
