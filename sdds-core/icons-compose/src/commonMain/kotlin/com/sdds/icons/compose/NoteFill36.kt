package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NoteFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NoteFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.06 3.172 c 0.275 -0.186 0.623 -0.224 0.931 -0.1 l 9.964 3.975 C 30.19 7.54 31.0 8.735 31.0 10.065 v 6.421 c 0.0 0.332 -0.164 0.642 -0.439 0.828 c -0.274 0.186 -0.623 0.224 -0.931 0.1 L 19.62 13.423 v 13.28 c 0.0 3.48 -2.828 6.298 -6.31 6.298 C 9.827 33.0 7.0 30.182 7.0 26.702 s 2.828 -6.297 6.31 -6.297 c 1.667 0.0 3.183 0.645 4.311 1.698 V 4.0 c 0.0 -0.332 0.165 -0.642 0.44 -0.828 Z")
        )
    }.build()
}
